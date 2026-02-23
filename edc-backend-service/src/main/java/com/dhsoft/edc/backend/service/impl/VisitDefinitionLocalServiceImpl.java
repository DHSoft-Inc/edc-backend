package com.dhsoft.edc.backend.service.impl;

import com.dhsoft.edc.backend.model.ExperimentalGroup;
import com.dhsoft.edc.backend.model.VisitDefinition;
import com.dhsoft.edc.backend.service.ExperimentalGroupLocalService;
import com.dhsoft.edc.backend.service.base.VisitDefinitionLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    property = "model.class.name=com.dhsoft.edc.backend.model.VisitDefinition",
    service = AopService.class
)
public class VisitDefinitionLocalServiceImpl extends VisitDefinitionLocalServiceBaseImpl {

    @Reference
    private com.dhsoft.edc.backend.service.VisitGroupLocalService _visitGroupLocalService;

    @Reference
    private ExperimentalGroupLocalService _experimentalGroupLocalService;

    // =========================================================
    // ✅ order 자동증가 계산 (visitGroupId 단위)
    // =========================================================
    private int getNextOrderByVisitGroupId(long visitGroupId) {
        // 네가 이미 만들어둔 finder 사용(제일 깔끔)
        List<VisitDefinition> list = visitDefinitionPersistence.findByVisitGroupId(visitGroupId);

        int next = 0;
        for (VisitDefinition vd : list) {
            int o = vd.getOrder();
            if (o >= next) next = o + 1;
        }
        return next;
    }

    public List<VisitDefinition> getByExperimentalGroup(long experimentalGroupId)
            throws PortalException {

        ExperimentalGroup group =
                _experimentalGroupLocalService.getExperimentalGroup(experimentalGroupId);

        String expCode = group.getExpCode();

        return visitDefinitionPersistence.findByVisitDefinitionCode(expCode);
    }

    public VisitDefinition addVisitDefinitionForVisitGroup(
            long companyId,
            long groupId,
            long userId,
            String userName,
            long visitGroupId,
            String name,
            String anchorType,
            int offset,
            int windowMinus,
            int windowPlus
    ) throws PortalException {

        com.dhsoft.edc.backend.model.VisitGroup vg =
                _visitGroupLocalService.getVisitGroup(visitGroupId);

        String code = vg.getVisitGroupCode();

        long visitDefinitionId = CounterLocalServiceUtil.increment(VisitDefinition.class.getName());
        Date now = new Date();

        VisitDefinition vd = visitDefinitionPersistence.create(visitDefinitionId);

        vd.setCompanyId(companyId);
        vd.setGroupId(groupId);
        vd.setProjectId(vg.getProjectId());
        vd.setUserId(userId);
        vd.setUserName(userName);
        vd.setCreateDate(now);
        vd.setModifiedDate(now);

        vd.setStatus(WorkflowConstants.STATUS_APPROVED);
        vd.setStatusByUserId(userId);
        vd.setStatusByUserName(userName);
        vd.setStatusDate(now);

        vd.setVisitDefinitionCode(code);
        vd.setVisitGroupId(visitGroupId);

        vd.setName(name);
        vd.setAnchorType(anchorType);
        vd.setOffset(offset);
        vd.setWindowMinus(windowMinus);
        vd.setWindowPlus(windowPlus);

        vd.setType(0);
        vd.setRepeatCount(0);
        vd.setVisitCRFId(0);

        // =========================================================
        // ✅ NEW: order 자동 증가
        // =========================================================
        // (최소 동시성 방어: 같은 visitGroupId에 대해 next 계산 + 세팅을 묶음)
        synchronized (("VISITDEF_ORDER_VG_" + visitGroupId).intern()) {
            int nextOrder = getNextOrderByVisitGroupId(visitGroupId);
            vd.setOrder(nextOrder);
            return visitDefinitionPersistence.update(vd);
        }
    }

    /**
     * ADD: VisitDefinition 생성 (ExperimentalGroup)
     */
    public VisitDefinition addVisitDefinitionForGroup(
            long companyId,
            long groupId,
            long userId,
            String userName,
            long experimentalGroupId,
            String name,
            String anchorType,
            int offset,
            int windowMinus,
            int windowPlus
    ) throws PortalException {

        ExperimentalGroup expGroup =
                _experimentalGroupLocalService.getExperimentalGroup(experimentalGroupId);

        long visitDefinitionId = CounterLocalServiceUtil.increment(VisitDefinition.class.getName());
        Date now = new Date();

        VisitDefinition vd = visitDefinitionPersistence.create(visitDefinitionId);

        vd.setCompanyId(companyId);
        vd.setGroupId(groupId);
        vd.setProjectId(expGroup.getProjectId());
        vd.setUserId(userId);
        vd.setUserName(userName);
        vd.setCreateDate(now);
        vd.setModifiedDate(now);

        vd.setStatus(WorkflowConstants.STATUS_APPROVED);
        vd.setStatusByUserId(userId);
        vd.setStatusByUserName(userName);
        vd.setStatusDate(now);

        String code = expGroup.getExpCode();
        vd.setVisitDefinitionCode(code);

        // ⚠️ 기존 네 코드 유지: experimentalGroupId를 visitGroupId 컬럼에 저장 중
        vd.setVisitGroupId(experimentalGroupId);

        vd.setName(name);
        vd.setAnchorType(anchorType);
        vd.setOffset(offset);
        vd.setWindowMinus(windowMinus);
        vd.setWindowPlus(windowPlus);

        vd.setType(0);
        vd.setRepeatCount(0);
        vd.setVisitCRFId(0);

        // =========================================================
        // ✅ NEW: order 자동 증가
        // =========================================================
        // 지금 구조에선 expGroup용도 visitGroupId 컬럼을 expGroupId로 쓰고 있으니 동일 방식으로 계산
        synchronized (("VISITDEF_ORDER_EXP_" + experimentalGroupId).intern()) {
            int nextOrder = getNextOrderByVisitGroupId(experimentalGroupId);
            vd.setOrder(nextOrder);
            return visitDefinitionPersistence.update(vd);
        }
    }

    public VisitDefinition updateVisitDefinitionBasic(
            long visitDefinitionId,
            String name,
            String anchorType,
            int offset,
            int windowMinus,
            int windowPlus
    ) throws PortalException {

        VisitDefinition vd = visitDefinitionPersistence.findByPrimaryKey(visitDefinitionId);

        vd.setName(name);
        vd.setAnchorType(anchorType);
        vd.setOffset(offset);
        vd.setWindowMinus(windowMinus);
        vd.setWindowPlus(windowPlus);
        vd.setModifiedDate(new Date());

        return visitDefinitionPersistence.update(vd);
    }

    public VisitDefinition updateVisitDefinitionFull(
            long visitDefinitionId,
            String name,
            String anchorType,
            int offset,
            int windowMinus,
            int windowPlus
    ) throws PortalException {

        VisitDefinition vd =
            visitDefinitionPersistence.fetchByPrimaryKey(visitDefinitionId);

        if (vd == null) {
            throw new PortalException("VisitDefinition not found: " + visitDefinitionId);
        }

        vd.setName(name);
        vd.setAnchorType(anchorType);
        vd.setOffset(offset);
        vd.setWindowMinus(windowMinus);
        vd.setWindowPlus(windowPlus);
        vd.setModifiedDate(new Date());

        return visitDefinitionPersistence.update(vd);
    }

    public VisitDefinition deleteVisitDefinitionById(long visitDefinitionId)
            throws PortalException {

        return visitDefinitionPersistence.remove(visitDefinitionId);
    }

    public List<VisitDefinition> getByVisitGroupId(long visitGroupId) {
        return visitDefinitionPersistence.findByVisitGroupId(visitGroupId);
    }

    public List<VisitDefinition> getByVisitGroup(long visitGroupId) throws PortalException {

        com.dhsoft.edc.backend.model.VisitGroup vg =
                _visitGroupLocalService.getVisitGroup(visitGroupId);

        String visitGroupCode = vg.getVisitGroupCode();

        return visitDefinitionPersistence.findByVisitDefinitionCode(visitGroupCode);
    }

    public List<VisitDefinition> getByVisitDefinitionCode(String visitDefinitionCode) {
        return visitDefinitionPersistence.findByVisitDefinitionCode(visitDefinitionCode);
    }
}

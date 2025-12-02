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
	public class VisitDefinitionLocalServiceImpl
	        extends VisitDefinitionLocalServiceBaseImpl {

	    @Reference
	    private ExperimentalGroupLocalService _experimentalGroupLocalService;

	    /**
	     * GET: 실험군 ID로 visitDefinition 가져오기
	     * experimentalGroupId → expCode → visitDefinitionCode
	     */
	    public List<VisitDefinition> getByExperimentalGroup(long experimentalGroupId)
	            throws PortalException {

	        ExperimentalGroup group =
	                _experimentalGroupLocalService.getExperimentalGroup(experimentalGroupId);

	        String expCode = group.getExpCode();

	        return visitDefinitionPersistence.findByVisitDefinitionCode(expCode);
	    }

	    /**
	     * ADD: VisitDefinition 생성
	     */
	    public VisitDefinition addVisitDefinitionForGroup(
	            long companyId,
	            long groupId,
	            long userId,
	            String userName,
	            long experimentalGroupId,
	            String name,
	            int offset,
	            int windowMinus,
	            int windowPlus
	    ) throws PortalException {

	        ExperimentalGroup expGroup =
	                _experimentalGroupLocalService.getExperimentalGroup(experimentalGroupId);

	        long visitDefinitionId = CounterLocalServiceUtil.increment(
	                VisitDefinition.class.getName()
	        );

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

	        // 핵심 매핑
	        vd.setVisitDefinitionCode(expGroup.getExpCode());
	        vd.setVisitGroupId(experimentalGroupId);

	        // 엔티티 데이터
	        vd.setName(name);
	        vd.setOffset(offset);
	        vd.setWindowMinus(windowMinus);
	        vd.setWindowPlus(windowPlus);

	        vd.setType(0);
	        vd.setRepeatCount(0);
	        vd.setVisitCRFId(0);

	        return visitDefinitionPersistence.update(vd);
	    }

	    /**
	     * UPDATE
	     */
	    public VisitDefinition updateVisitDefinitionBasic(
	            long visitDefinitionId,
	            String name,
	            int offset,
	            int windowMinus,
	            int windowPlus
	    ) throws PortalException {

	        VisitDefinition vd =
	                visitDefinitionPersistence.findByPrimaryKey(visitDefinitionId);

	        vd.setName(name);
	        vd.setOffset(offset);
	        vd.setWindowMinus(windowMinus);
	        vd.setWindowPlus(windowPlus);
	        vd.setModifiedDate(new Date());

	        return visitDefinitionPersistence.update(vd);
	    }

	    /**
	     * DELETE
	     */
	    public VisitDefinition deleteVisitDefinitionById(long visitDefinitionId)
	            throws PortalException {

	        return visitDefinitionPersistence.remove(visitDefinitionId);
	    }
	}

package com.dhsoft.edc.backend.service.impl;

import com.dhsoft.edc.backend.model.ExperimentalGroup;
import com.dhsoft.edc.backend.model.SubjectVisitDefinition;
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
		private com.dhsoft.edc.backend.service.VisitGroupLocalService _visitGroupLocalService;
	

	    @Reference
	    private ExperimentalGroupLocalService _experimentalGroupLocalService;


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

	        if (visitDefinitionPersistence.countByVisitDefinitionCode(code) > 0) {
	            throw new PortalException("visitDefinitionCode already exists: " + code);
	        }

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

	        return visitDefinitionPersistence.update(vd);
	    }

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

	        
	        String code = expGroup.getExpCode();
	        if (visitDefinitionPersistence.countByVisitDefinitionCode(code) > 0) {
	            throw new PortalException("visitDefinitionCode already exists: " + code);
	        }
	        vd.setVisitDefinitionCode(code);


	        //vd.setVisitDefinitionCode(expGroup.getExpCode());
	        vd.setVisitGroupId(experimentalGroupId);


	        vd.setName(name);
	        vd.setAnchorType(anchorType);
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
	            int windowPlus) {

	        VisitDefinition vd =
	            visitDefinitionPersistence.fetchByPrimaryKey(visitDefinitionId);

	        vd.setName(name);
	        vd.setAnchorType(anchorType); 
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

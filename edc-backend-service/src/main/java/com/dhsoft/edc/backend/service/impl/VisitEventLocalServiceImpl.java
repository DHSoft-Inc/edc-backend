/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dhsoft.edc.backend.service.impl;

import com.dhsoft.edc.backend.model.VisitEvent;
import com.dhsoft.edc.backend.service.base.VisitEventLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.VisitEvent",
	service = AopService.class
)
public class VisitEventLocalServiceImpl extends VisitEventLocalServiceBaseImpl {
	
    private VisitEvent createNewEvent(long subjectId, long visitDefinitionId) {

        long id = CounterLocalServiceUtil.increment();
        VisitEvent v = visitEventPersistence.create(id);

        v.setSubjectId(subjectId);
        v.setVisitDefinitionId(visitDefinitionId);

        Date now = new Date();
        v.setCreateDate(now);
        v.setModifiedDate(now);

        return v;
    }
	
	public void addVisitEvent(long companyId, long groupId, long projectId, long institutionId, long subjectId, long visitDefinitionId, int status, long statusByUserId, String statusByUserName, Date statusDate, String anchorType, Date anchorDate, int offset, Date planDate)
	{
		Date createDate = new Date();
		long visitEventId = counterLocalService.increment("visitEvent");
		VisitEvent v = visitEventPersistence.create(visitEventId);
		v.setCompanyId(companyId);
		v.setGroupId(groupId);
		v.setProjectId(projectId);
		v.setInstitutionId(institutionId);
		v.setSubjectId(subjectId);
		v.setVisitDefinitionId(visitDefinitionId);
		v.setStatus(status);
		v.setStatusByUserId(statusByUserId);
		v.setStatusByUserName(statusByUserName);
		v.setStatusDate(statusDate);
		v.setAnchorType(anchorType);
		v.setAnchorDate(anchorDate);
		v.setOffset(offset);
		v.setPlanDate(planDate);
		v.setCreateDate(createDate);
		v.setModifiedDate(createDate);
		visitEventPersistence.update(v);
	}
	
	//When subject visit, update VisitEvent
	public void updateEventDate(long visitEventId, Date eventDate, String deviationStatus) {
		try {
			Date modifiedDate = new Date();
			VisitEvent v = visitEventPersistence.findByPrimaryKey(visitEventId);
			v.setEventDate(eventDate);
			v.setDeviationStatus(deviationStatus);
			v.setModifiedDate(modifiedDate);
			visitEventPersistence.update(v);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//When CRF Save, update VisitEvent
	public void updateCRFData(long visitEventId, long structuredDataId) {
		try {
			VisitEvent v = visitEventPersistence.findByPrimaryKey(visitEventId);
			Date modifiedDate = new Date();
			String linkObj = v.getInstanceLinkObj();
			JSONObject rootJson;
	        JSONArray linksArray;
			if(linkObj == null || linkObj.trim().isEmpty()) {
				
				rootJson = JSONFactoryUtil.createJSONObject();
	            linksArray = JSONFactoryUtil.createJSONArray();
	            
	            linksArray.put(structuredDataId);
	            rootJson.put("links", linksArray);
	            
			} else {
				
				rootJson = JSONFactoryUtil.createJSONObject(linkObj);
				linksArray = rootJson.getJSONArray("links");
				if (linksArray == null) {
	                linksArray = JSONFactoryUtil.createJSONArray();
	            }
				linksArray.put(structuredDataId);
				rootJson.put("links", linksArray);

			}
			v.setModifiedDate(modifiedDate);
			visitEventPersistence.update(v);
			
		} catch (Exception e) {
			
		}
	}
	
	public VisitEvent deleteVisitEvent(long visitEventId) {
		try {
			VisitEvent v = visitEventPersistence.findByPrimaryKey(visitEventId);
			visitEventPersistence.remove(v);
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	    public VisitEvent saveOrUpdateVisitEvent(
	            long subjectId,
	            long visitDefinitionId,
	            String anchorType,
	            int offset,
	            Date anchorDate,
	            Date planDate
	    ) {
	
	        List<VisitEvent> list =
	                findBySubjectIdAndVisitDefinitionId(subjectId, visitDefinitionId);
	
	        VisitEvent event;
	
	        if (list.isEmpty()) {
	            // 신규 생성
	            event = createNewEvent(subjectId, visitDefinitionId);
	        } else {
	            // 업데이트
	            event = list.get(0);
	            event.setModifiedDate(new Date());
	        }
	
	        event.setAnchorType(anchorType);
	        event.setOffset(offset);
	        event.setAnchorDate(anchorDate);
	        event.setPlanDate(planDate);
	
	        return visitEventPersistence.update(event);
	    }
	    
		//Find By Subject Id
		public List<VisitEvent> findBySubjectIdAndVisitDefinitionId(long subjectId, long visitDefinitionId) {
			return visitEventPersistence.findByS_VD(subjectId, visitDefinitionId);
		}  
	  
	
	//Find By Subject Id
	public List<VisitEvent> findBySubjectId(long subjectId) {
		return visitEventPersistence.findBysubjectId(subjectId);
	}
	
	
	
}
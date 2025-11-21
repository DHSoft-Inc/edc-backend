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
	
	//Find By Subject Id
	public List<VisitEvent> findBySubjectId(long subjectId) {
		return visitEventPersistence.findBysubjectId(subjectId);
	}
	
}
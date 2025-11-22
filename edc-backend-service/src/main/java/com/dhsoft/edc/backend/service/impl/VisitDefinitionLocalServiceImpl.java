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

import com.dhsoft.edc.backend.model.VisitDefinition;
import com.dhsoft.edc.backend.service.base.VisitDefinitionLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.VisitDefinition",
	service = AopService.class
)
public class VisitDefinitionLocalServiceImpl
	extends VisitDefinitionLocalServiceBaseImpl {
	
	public void addVisitDefinition(long companyId, long groupId, long projectId, long visitGroupId, long userId, String userName, int status, long statusByUserId, String statusByUserName, Date statusDate, String anchorType, int offset, int windowMinus, int windowPlus, int type, int repeatCount, long visitCRFId)
	{
		Date createDate = new Date();
		long visitDefinitionId = counterLocalService.increment("visitDefinition");
		VisitDefinition vd = visitDefinitionPersistence.create(visitDefinitionId);
		vd.setCompanyId(companyId);
		vd.setGroupId(groupId);
		vd.setProjectId(projectId);
		vd.setVisitGroupId(visitGroupId);
		vd.setUserId(userId);
		vd.setUserName(userName);
		vd.setStatus(status);
		vd.setStatusByUserId(statusByUserId);
		vd.setStatusByUserName(statusByUserName);
		vd.setStatusDate(statusDate);
		vd.setAnchorType(anchorType);
		vd.setOffset(offset);
		vd.setWindowMinus(windowMinus);
		vd.setWindowPlus(windowPlus);
		vd.setType(type);
		vd.setRepeatCount(repeatCount);
		vd.setVisitCRFId(visitCRFId);
		vd.setCreateDate(createDate);
		vd.setModifiedDate(createDate);
		visitDefinitionPersistence.update(vd);
	}
	
	public void deleteDefinition(long visitDefinitionId) {
		try {
			VisitDefinition vd = visitDefinitionPersistence.findByPrimaryKey(visitDefinitionId);
			visitDefinitionPersistence.remove(vd);
		} catch (Exception e) {
			
		}
	}
}
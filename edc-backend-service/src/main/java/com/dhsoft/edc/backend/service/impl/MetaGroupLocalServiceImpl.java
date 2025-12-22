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

import com.dhsoft.edc.backend.model.MetaCode;
import com.dhsoft.edc.backend.model.MetaGroup;
import com.dhsoft.edc.backend.service.MetaCodeLocalServiceUtil;
import com.dhsoft.edc.backend.service.base.MetaGroupLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.MetaGroup",
	service = AopService.class
)
public class MetaGroupLocalServiceImpl extends MetaGroupLocalServiceBaseImpl {
	
	//Create New MetaGroup: if success, return MetaGroup. else, return null.
	public MetaGroup CreateMetaGroup(long companyId, long groupId, long projectId, long userId, String userName,
				int status, long statusByUserId, String statusByUserName, Date statusDate,
				String groupCode, String groupName, String type, Boolean active, Date inactiveDate ) {
		long metaGroupId = CounterLocalServiceUtil.increment("metaGroupId");
		Date date = new Date();
		try {
			MetaGroup i = metaGroupPersistence.create(metaGroupId);
			i.setCompanyId(companyId);
			i.setGroupId(groupId);
			i.setProjectId(projectId);
			i.setUserId(userId);
			i.setUserName(userName);
			i.setStatus(status);
			i.setStatusByUserId(statusByUserId);
			i.setStatusByUserName(statusByUserName);
			i.setStatusDate(statusDate);
			i.setGroupCode(groupCode);
			i.setGroupName(groupName);
			i.setType(type);
			i.setActive(active);
			i.setInactiveDate(inactiveDate);
			i.setCreateDate(date);
			i.setModifiedDate(date);
			metaGroupPersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findByMetaGroupId(metaGroupId);
	}
	
	//Update MetaGroup
	public void UpdateMetaGroup(long metaGroupId, int status, Long statusByUserId, String statusByUserName, Date statusDate, 
				String groupCode, String groupName, String type, Boolean active, Date inactiveDate) {
		try{
			Date date = new Date();
			MetaGroup i = metaGroupPersistence.findByPrimaryKey(metaGroupId);
			i.setStatus(status);
			i.setStatusByUserId(statusByUserId);
			i.setStatusByUserName(statusByUserName);
			i.setStatusDate(statusDate);
			i.setGroupCode(groupCode);
			i.setGroupName(groupName);
			i.setType(type);
			i.setActive(active);
			i.setInactiveDate(inactiveDate);
			i.setModifiedDate(date);
			metaGroupPersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete MetaGroup: if success, return null. else, return MetaGroup.
	public MetaGroup DeleteMetaGroup(long metaGroupId) {
		try {
			MetaGroup i = metaGroupPersistence.findByPrimaryKey(metaGroupId);
			
			// if metaCodes with metaGroupId is not empty 
			List<MetaCode> ic = MetaCodeLocalServiceUtil.findByGroupCode(i.getGroupId(), i.getProjectId(), i.getGroupCode());
			if (ic.isEmpty()) {
				metaGroupPersistence.remove(i);
			} else {
				
			}
			return findByMetaGroupId(metaGroupId);

		} catch (Exception e) {
			e.printStackTrace();
			return findByMetaGroupId(metaGroupId);
		}
	}
	
	
	public MetaGroup findByMetaGroupId (long metaGroupId) {
		try {
			return metaGroupPersistence.findByPrimaryKey(metaGroupId);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<MetaGroup> findByGroupAndProjectId (long groupId, long projectId) {
		try {
			return metaGroupPersistence.findByG_P(groupId, projectId);
		} catch (Exception e) {
			return null;
		}
	}
	
}
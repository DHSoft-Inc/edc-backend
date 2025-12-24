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
import com.dhsoft.edc.backend.service.base.MetaCodeLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.MetaCode",
	service = AopService.class
)
public class MetaCodeLocalServiceImpl extends MetaCodeLocalServiceBaseImpl {
	
	//Create New MetaCode: if success, return MetaCode. else, return null.
	public MetaCode CreateMetaCode(long companyId, long groupId, long projectId, long userId, String userName,
				int status, long statusByUserId, String statusByUserName, Date statusDate, String groupCode, 
				String code, String label, String valueType, String value, Boolean active, Date inactiveDate ) {
		long metaCodeId = CounterLocalServiceUtil.increment("metaCodeId");
		Date date = new Date();
		try {
			MetaCode i = metaCodePersistence.create(metaCodeId);
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
			i.setCode(code);
			i.setLabel(label);
			i.setValueType(valueType);
			i.setValue(value);
			i.setActive(active);
			i.setInactiveDate(inactiveDate);
			i.setCreateDate(date);
			i.setModifiedDate(date);
			metaCodePersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findByMetaCodeId(metaCodeId);
	}
	
	//Update MetaCode
	public void UpdateMetaCode(long metaCodeId, long groupId, long projectId,
					int status, long statusByUserId, String statusByUserName, Date statusDate, 
					String groupCode, String code, String label, String valueType, String value, 
					Boolean active, Date inactiveDate ) {
		try{
			Date date = new Date();
			MetaCode i = metaCodePersistence.findByPrimaryKey(metaCodeId);
			i.setStatus(status);
			i.setStatusByUserId(statusByUserId);
			i.setStatusByUserName(statusByUserName);
			i.setStatusDate(statusDate);
			i.setGroupCode(groupCode);
			i.setCode(code);
			i.setLabel(label);
			i.setValueType(valueType);
			i.setValue(value);
			i.setActive(active);
			i.setInactiveDate(inactiveDate);
			i.setModifiedDate(date);
			metaCodePersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete MetaCode: if success, return null. else, return MetaCode.
	public MetaCode DeleteMetaCode(long metaCodeId) {
		try {
			MetaCode i = metaCodePersistence.findByPrimaryKey(metaCodeId);
			metaCodePersistence.remove(i);
				
			return findByMetaCodeId(metaCodeId);
		} catch (Exception e) {
			e.printStackTrace();
			return findByMetaCodeId(metaCodeId);
		}
	}
	
	
	public MetaCode findByMetaCodeId (long metaCodeId) {
		try {
			return metaCodePersistence.findByPrimaryKey(metaCodeId);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<MetaCode> findByGroupAndProjectId (long groupId, long projectId) {
		try {
			return metaCodePersistence.findByG_P(groupId, projectId);
		} catch (Exception e) {
			return null;
		}
	}
				
	public List<MetaCode> findByGroupCode (long groupId, long projectId, String groupCode) {
		try {
			return metaCodePersistence.findByG_P_G(groupId, projectId, groupCode);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<MetaCode> findByGroupCodeAndCode (long groupId, long projectId, String groupCode, String code) {
		try {
			return metaCodePersistence.findByG_P_G_C(groupId, projectId, groupCode, code);
		} catch (Exception e) {
			return null;
		}
	}
	
}
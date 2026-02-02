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

import com.dhsoft.edc.backend.model.EdcPermissionScope;
import com.dhsoft.edc.backend.service.base.EdcPermissionScopeLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.EdcPermissionScope",
	service = AopService.class
)
public class EdcPermissionScopeLocalServiceImpl
	extends EdcPermissionScopeLocalServiceBaseImpl {
	
	public EdcPermissionScope CreateEdcPermissionScope(long companyId, long groupId, long projectId, 
			String moduleName, String taskKey, String roleName, String scopeRole, 
			Boolean active,	Date fromDate, Date toDate ) {
	long permissionScopeId = CounterLocalServiceUtil.increment("permissionScopeId");
	Date date = new Date();
	try {
		EdcPermissionScope i = edcPermissionScopePersistence.create(permissionScopeId);
		i.setCompanyId(companyId);
		i.setGroupId(groupId);
		i.setProjectId(projectId);
		// i.setUserId(userId);
		// i.setUserName(userName);
		// i.setStatus(status);
		// i.setStatusByUserId(statusByUserId);
		// i.setStatusByUserName(statusByUserName);
		// i.setStatusDate(statusDate);
		i.setModuleName(moduleName);
		i.setTaskKey(taskKey);
		i.setRoleName(roleName);
		i.setScopeRole(scopeRole);
		i.setActive(active);
		i.setFromDate(fromDate);
		i.setToDate(toDate);
		i.setCreateDate(date);
		i.setModifiedDate(date);
		edcPermissionScopePersistence.update(i);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return findByPermissionScopeId(permissionScopeId);
}

//Update EdcPermissionScope
public void UpdateEdcPermissionScope(long permissionScopeId, 
		// long userId, String userName,
		// int status, long statusByUserId, String statusByUserName, Date statusDate,
		String moduleName, String taskKey, String roleName, String scopeRole, 
		Boolean active,	Date fromDate, Date toDate ) {
	try{
		Date date = new Date();
		EdcPermissionScope i = edcPermissionScopePersistence.findByPrimaryKey(permissionScopeId);
		// i.setStatus(status);
		// i.setStatusByUserId(statusByUserId);
		// i.setStatusByUserName(statusByUserName);
		// i.setStatusDate(statusDate);
		
		i.setModuleName(moduleName);
		i.setTaskKey(taskKey);
		i.setRoleName(roleName);
		i.setScopeRole(scopeRole);
		i.setActive(active);
		i.setFromDate(fromDate);
		i.setToDate(toDate);
		i.setModifiedDate(date);
		edcPermissionScopePersistence.update(i);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

//Delete EdcPermissionScope: if success, return null. else, return EdcPermissionScope.
public EdcPermissionScope DeleteEdcPermissionScope(long permissionScopeId) {
	try {
		EdcPermissionScope i = edcPermissionScopePersistence.findByPrimaryKey(permissionScopeId);
		
		// if metaCodes with edcPermissionScopeId is not empty 
		EdcPermissionScope ic = edcPermissionScopePersistence.findByEdcPermissionScope(
									i.getProjectId(), i.getModuleName(), i.getTaskKey(),
									i.getRoleName(), i.getScopeRole()
								);
		// if (ic.isEmpty()) {
		if (permissionScopeId == ic.getPermissionScopeId())	{
			edcPermissionScopePersistence.remove(i);
		} else {
			
		}
		return findByPermissionScopeId(permissionScopeId);

	} catch (Exception e) {
		e.printStackTrace();
		return findByPermissionScopeId(permissionScopeId);
	}
}

public EdcPermissionScope findByPermissionScopeId (long permissionScopeId) {
	try {
		return edcPermissionScopePersistence.findByPrimaryKey(permissionScopeId);
	} catch (Exception e) {
		return null;
	}
}

public List<EdcPermissionScope> findByEdcProjectScope (long projectId) {
	try {
		return edcPermissionScopePersistence.findByEdcProjectScope(projectId);
	} catch (Exception e) {
		return null;
	}
}

public List<EdcPermissionScope> findByEdcModuleScope (long projectId, String moduleName) {
	try {
		return edcPermissionScopePersistence.findByEdcModuleScope(projectId, moduleName);
	} catch (Exception e) {
		return null;
	}
}

public List<EdcPermissionScope> findByEdcTaskScope (long projectId, String moduleName, String taskKey, String roleName) {
	try {
		return edcPermissionScopePersistence.findByEdcTaskScope(projectId, moduleName, taskKey, roleName);
	} catch (Exception e) {
		return null;
	}
}

public EdcPermissionScope findByEdcPermissionScope (long projectId, String moduleName, String taskKey, 
													String roleName, String scopeRole) {
	try {
		return edcPermissionScopePersistence.findByEdcPermissionScope(projectId, moduleName, taskKey, roleName, scopeRole);
	} catch (Exception e) {
		return null;
	}
}

}
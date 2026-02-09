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

import com.dhsoft.edc.backend.model.EdcPermissionRole;
import com.dhsoft.edc.backend.service.base.EdcPermissionRoleLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.EdcPermissionRole",
	service = AopService.class
)
public class EdcPermissionRoleLocalServiceImpl 
		extends EdcPermissionRoleLocalServiceBaseImpl {
	
	//Create New EdcPermissionRole: if success, return EdcPermissionRole. else, return null.
	public EdcPermissionRole CreateEdcPermissionRole(long companyId, long groupId, long projectId, 
				long actorGroup, long actorId, String roleName, Boolean active, 
				Date fromDate, Date toDate ) {
		long permissionRoleId = CounterLocalServiceUtil.increment("permissionRoleId");
		Date date = new Date();
		try {
			EdcPermissionRole i = edcPermissionRolePersistence.create(permissionRoleId);
			i.setCompanyId(companyId);
			i.setGroupId(groupId);
			 
			i.setProjectId(projectId);
			// i.setUserId(userId);
			// i.setUserName(userName);
			// i.setStatus(status);
			// i.setStatusByUserId(statusByUserId);
			// i.setStatusByUserName(statusByUserName);
			// i.setStatusDate(statusDate);
			
			i.setActorGroup(actorGroup);
			i.setActorId(actorId);
			i.setRoleName(roleName);
			i.setActive(active);
			i.setFromDate(fromDate);
			i.setToDate(toDate);
			i.setCreateDate(date);
			i.setModifiedDate(date);
			edcPermissionRolePersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findByPermissionRoleId(permissionRoleId);
	}
	
	//Update EdcPermissionRole
	public void UpdateEdcPermissionRole(long permissionRoleId, 
			// long userId, String userName,
			// int status, long statusByUserId, String statusByUserName, Date statusDate,
			long actorGroup, long actorId, String roleName, Boolean active, 
			Date fromDate, Date toDate ) {
		try{
			Date date = new Date();
			EdcPermissionRole i = edcPermissionRolePersistence.findByPrimaryKey(permissionRoleId);
			// i.setStatus(status);
			// i.setStatusByUserId(statusByUserId);
			// i.setStatusByUserName(statusByUserName);
			// i.setStatusDate(statusDate);
			
			i.setActorGroup(actorGroup);
			i.setActorId(actorId);
			i.setRoleName(roleName);
			i.setActive(active);
			i.setFromDate(fromDate);
			i.setToDate(toDate);
			i.setModifiedDate(date);
			edcPermissionRolePersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete EdcPermissionRole: if success, return null. else, return EdcPermissionRole.
	public EdcPermissionRole DeleteEdcPermissionRole(long permissionRoleId) {
		try {
			EdcPermissionRole i = edcPermissionRolePersistence.findByPrimaryKey(permissionRoleId);
			
			// if metaCodes with edcPermissionRoleId is not empty 
			EdcPermissionRole ic = edcPermissionRolePersistence.findByEdcPermissionRole(
										i.getProjectId(), i.getActorGroup(), i.getActorId(), i.getRoleName()
									);
			// if (ic.isEmpty()) {
			if (permissionRoleId == ic.getPermissionRoleId())	{
				edcPermissionRolePersistence.remove(i);
			} else {
				
			}
			return findByPermissionRoleId(permissionRoleId);

		} catch (Exception e) {
			e.printStackTrace();
			return findByPermissionRoleId(permissionRoleId);
		}
	}
	
	public EdcPermissionRole findByPermissionRoleId (long permissionRoleId) {
		try {
			return edcPermissionRolePersistence.findByPrimaryKey(permissionRoleId);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<EdcPermissionRole> findByEdcProjectRole (long projectId) {
		try {
			return edcPermissionRolePersistence.findByEdcProjectRole(projectId);
		} catch (Exception e) {
			return null;
		}
	}

	public List<EdcPermissionRole> findByEdcActorRole (long projectId, long actorGroup, long actorId) {
		try {
			return edcPermissionRolePersistence.findByEdcActorRole(projectId, actorGroup, actorId);
		} catch (Exception e) {
			return null;
		}
	}

	public EdcPermissionRole findByEdcPermissionRole (long projectId, long actorGroup, long actorId, String roleName) {
		try {
			return edcPermissionRolePersistence.findByEdcPermissionRole(projectId, actorGroup, actorId, roleName);
		} catch (Exception e) {
			return null;
		}
	}
	
}
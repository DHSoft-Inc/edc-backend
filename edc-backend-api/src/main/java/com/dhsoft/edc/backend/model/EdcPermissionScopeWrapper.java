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

package com.dhsoft.edc.backend.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EdcPermissionScope}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScope
 * @generated
 */
public class EdcPermissionScopeWrapper
	extends BaseModelWrapper<EdcPermissionScope>
	implements EdcPermissionScope, ModelWrapper<EdcPermissionScope> {

	public EdcPermissionScopeWrapper(EdcPermissionScope edcPermissionScope) {
		super(edcPermissionScope);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("permissionScopeId", getPermissionScopeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("projectId", getProjectId());
		attributes.put("moduleName", getModuleName());
		attributes.put("taskKey", getTaskKey());
		attributes.put("roleName", getRoleName());
		attributes.put("scopeRole", getScopeRole());
		attributes.put("active", isActive());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long permissionScopeId = (Long)attributes.get("permissionScopeId");

		if (permissionScopeId != null) {
			setPermissionScopeId(permissionScopeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String moduleName = (String)attributes.get("moduleName");

		if (moduleName != null) {
			setModuleName(moduleName);
		}

		String taskKey = (String)attributes.get("taskKey");

		if (taskKey != null) {
			setTaskKey(taskKey);
		}

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}

		String scopeRole = (String)attributes.get("scopeRole");

		if (scopeRole != null) {
			setScopeRole(scopeRole);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	 * Returns the active of this edc permission scope.
	 *
	 * @return the active of this edc permission scope
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this edc permission scope.
	 *
	 * @return the company ID of this edc permission scope
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this edc permission scope.
	 *
	 * @return the create date of this edc permission scope
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this edc permission scope.
	 *
	 * @return the created by of this edc permission scope
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the from date of this edc permission scope.
	 *
	 * @return the from date of this edc permission scope
	 */
	@Override
	public Date getFromDate() {
		return model.getFromDate();
	}

	/**
	 * Returns the group ID of this edc permission scope.
	 *
	 * @return the group ID of this edc permission scope
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified by of this edc permission scope.
	 *
	 * @return the modified by of this edc permission scope
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this edc permission scope.
	 *
	 * @return the modified date of this edc permission scope
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the module name of this edc permission scope.
	 *
	 * @return the module name of this edc permission scope
	 */
	@Override
	public String getModuleName() {
		return model.getModuleName();
	}

	/**
	 * Returns the permission scope ID of this edc permission scope.
	 *
	 * @return the permission scope ID of this edc permission scope
	 */
	@Override
	public long getPermissionScopeId() {
		return model.getPermissionScopeId();
	}

	/**
	 * Returns the primary key of this edc permission scope.
	 *
	 * @return the primary key of this edc permission scope
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this edc permission scope.
	 *
	 * @return the project ID of this edc permission scope
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the role name of this edc permission scope.
	 *
	 * @return the role name of this edc permission scope
	 */
	@Override
	public String getRoleName() {
		return model.getRoleName();
	}

	/**
	 * Returns the scope role of this edc permission scope.
	 *
	 * @return the scope role of this edc permission scope
	 */
	@Override
	public String getScopeRole() {
		return model.getScopeRole();
	}

	/**
	 * Returns the task key of this edc permission scope.
	 *
	 * @return the task key of this edc permission scope
	 */
	@Override
	public String getTaskKey() {
		return model.getTaskKey();
	}

	/**
	 * Returns the to date of this edc permission scope.
	 *
	 * @return the to date of this edc permission scope
	 */
	@Override
	public Date getToDate() {
		return model.getToDate();
	}

	/**
	 * Returns the uuid of this edc permission scope.
	 *
	 * @return the uuid of this edc permission scope
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this edc permission scope is active.
	 *
	 * @return <code>true</code> if this edc permission scope is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this edc permission scope is active.
	 *
	 * @param active the active of this edc permission scope
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this edc permission scope.
	 *
	 * @param companyId the company ID of this edc permission scope
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this edc permission scope.
	 *
	 * @param createDate the create date of this edc permission scope
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this edc permission scope.
	 *
	 * @param createdBy the created by of this edc permission scope
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the from date of this edc permission scope.
	 *
	 * @param fromDate the from date of this edc permission scope
	 */
	@Override
	public void setFromDate(Date fromDate) {
		model.setFromDate(fromDate);
	}

	/**
	 * Sets the group ID of this edc permission scope.
	 *
	 * @param groupId the group ID of this edc permission scope
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified by of this edc permission scope.
	 *
	 * @param modifiedBy the modified by of this edc permission scope
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this edc permission scope.
	 *
	 * @param modifiedDate the modified date of this edc permission scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the module name of this edc permission scope.
	 *
	 * @param moduleName the module name of this edc permission scope
	 */
	@Override
	public void setModuleName(String moduleName) {
		model.setModuleName(moduleName);
	}

	/**
	 * Sets the permission scope ID of this edc permission scope.
	 *
	 * @param permissionScopeId the permission scope ID of this edc permission scope
	 */
	@Override
	public void setPermissionScopeId(long permissionScopeId) {
		model.setPermissionScopeId(permissionScopeId);
	}

	/**
	 * Sets the primary key of this edc permission scope.
	 *
	 * @param primaryKey the primary key of this edc permission scope
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this edc permission scope.
	 *
	 * @param projectId the project ID of this edc permission scope
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the role name of this edc permission scope.
	 *
	 * @param roleName the role name of this edc permission scope
	 */
	@Override
	public void setRoleName(String roleName) {
		model.setRoleName(roleName);
	}

	/**
	 * Sets the scope role of this edc permission scope.
	 *
	 * @param scopeRole the scope role of this edc permission scope
	 */
	@Override
	public void setScopeRole(String scopeRole) {
		model.setScopeRole(scopeRole);
	}

	/**
	 * Sets the task key of this edc permission scope.
	 *
	 * @param taskKey the task key of this edc permission scope
	 */
	@Override
	public void setTaskKey(String taskKey) {
		model.setTaskKey(taskKey);
	}

	/**
	 * Sets the to date of this edc permission scope.
	 *
	 * @param toDate the to date of this edc permission scope
	 */
	@Override
	public void setToDate(Date toDate) {
		model.setToDate(toDate);
	}

	/**
	 * Sets the uuid of this edc permission scope.
	 *
	 * @param uuid the uuid of this edc permission scope
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EdcPermissionScopeWrapper wrap(
		EdcPermissionScope edcPermissionScope) {

		return new EdcPermissionScopeWrapper(edcPermissionScope);
	}

}
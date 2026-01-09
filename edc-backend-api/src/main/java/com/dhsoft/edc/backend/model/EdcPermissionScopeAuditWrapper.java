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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EdcPermissionScopeAudit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopeAudit
 * @generated
 */
public class EdcPermissionScopeAuditWrapper
	extends BaseModelWrapper<EdcPermissionScopeAudit>
	implements EdcPermissionScopeAudit, ModelWrapper<EdcPermissionScopeAudit> {

	public EdcPermissionScopeAuditWrapper(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		super(edcPermissionScopeAudit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("auditScopeId", getAuditScopeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("projectId", getProjectId());
		attributes.put("roleName", getRoleName());
		attributes.put("moduleName", getModuleName());
		attributes.put("taskKey", getTaskKey());
		attributes.put("fromScope", getFromScope());
		attributes.put("toScope", getToScope());
		attributes.put("fromActive", getFromActive());
		attributes.put("toActive", getToActive());
		attributes.put("remarks", getRemarks());
		attributes.put("createDate", getCreateDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long auditScopeId = (Long)attributes.get("auditScopeId");

		if (auditScopeId != null) {
			setAuditScopeId(auditScopeId);
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

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}

		String moduleName = (String)attributes.get("moduleName");

		if (moduleName != null) {
			setModuleName(moduleName);
		}

		String taskKey = (String)attributes.get("taskKey");

		if (taskKey != null) {
			setTaskKey(taskKey);
		}

		String fromScope = (String)attributes.get("fromScope");

		if (fromScope != null) {
			setFromScope(fromScope);
		}

		String toScope = (String)attributes.get("toScope");

		if (toScope != null) {
			setToScope(toScope);
		}

		String fromActive = (String)attributes.get("fromActive");

		if (fromActive != null) {
			setFromActive(fromActive);
		}

		String toActive = (String)attributes.get("toActive");

		if (toActive != null) {
			setToActive(toActive);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}
	}

	/**
	 * Returns the audit scope ID of this edc permission scope audit.
	 *
	 * @return the audit scope ID of this edc permission scope audit
	 */
	@Override
	public long getAuditScopeId() {
		return model.getAuditScopeId();
	}

	/**
	 * Returns the company ID of this edc permission scope audit.
	 *
	 * @return the company ID of this edc permission scope audit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this edc permission scope audit.
	 *
	 * @return the create date of this edc permission scope audit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the from active of this edc permission scope audit.
	 *
	 * @return the from active of this edc permission scope audit
	 */
	@Override
	public String getFromActive() {
		return model.getFromActive();
	}

	/**
	 * Returns the from scope of this edc permission scope audit.
	 *
	 * @return the from scope of this edc permission scope audit
	 */
	@Override
	public String getFromScope() {
		return model.getFromScope();
	}

	/**
	 * Returns the group ID of this edc permission scope audit.
	 *
	 * @return the group ID of this edc permission scope audit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the module name of this edc permission scope audit.
	 *
	 * @return the module name of this edc permission scope audit
	 */
	@Override
	public String getModuleName() {
		return model.getModuleName();
	}

	/**
	 * Returns the primary key of this edc permission scope audit.
	 *
	 * @return the primary key of this edc permission scope audit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this edc permission scope audit.
	 *
	 * @return the project ID of this edc permission scope audit
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the remarks of this edc permission scope audit.
	 *
	 * @return the remarks of this edc permission scope audit
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the role name of this edc permission scope audit.
	 *
	 * @return the role name of this edc permission scope audit
	 */
	@Override
	public String getRoleName() {
		return model.getRoleName();
	}

	/**
	 * Returns the task key of this edc permission scope audit.
	 *
	 * @return the task key of this edc permission scope audit
	 */
	@Override
	public String getTaskKey() {
		return model.getTaskKey();
	}

	/**
	 * Returns the to active of this edc permission scope audit.
	 *
	 * @return the to active of this edc permission scope audit
	 */
	@Override
	public String getToActive() {
		return model.getToActive();
	}

	/**
	 * Returns the to scope of this edc permission scope audit.
	 *
	 * @return the to scope of this edc permission scope audit
	 */
	@Override
	public String getToScope() {
		return model.getToScope();
	}

	/**
	 * Returns the user ID of this edc permission scope audit.
	 *
	 * @return the user ID of this edc permission scope audit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this edc permission scope audit.
	 *
	 * @return the user name of this edc permission scope audit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this edc permission scope audit.
	 *
	 * @return the user uuid of this edc permission scope audit
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this edc permission scope audit.
	 *
	 * @return the uuid of this edc permission scope audit
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the audit scope ID of this edc permission scope audit.
	 *
	 * @param auditScopeId the audit scope ID of this edc permission scope audit
	 */
	@Override
	public void setAuditScopeId(long auditScopeId) {
		model.setAuditScopeId(auditScopeId);
	}

	/**
	 * Sets the company ID of this edc permission scope audit.
	 *
	 * @param companyId the company ID of this edc permission scope audit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this edc permission scope audit.
	 *
	 * @param createDate the create date of this edc permission scope audit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the from active of this edc permission scope audit.
	 *
	 * @param fromActive the from active of this edc permission scope audit
	 */
	@Override
	public void setFromActive(String fromActive) {
		model.setFromActive(fromActive);
	}

	/**
	 * Sets the from scope of this edc permission scope audit.
	 *
	 * @param fromScope the from scope of this edc permission scope audit
	 */
	@Override
	public void setFromScope(String fromScope) {
		model.setFromScope(fromScope);
	}

	/**
	 * Sets the group ID of this edc permission scope audit.
	 *
	 * @param groupId the group ID of this edc permission scope audit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the module name of this edc permission scope audit.
	 *
	 * @param moduleName the module name of this edc permission scope audit
	 */
	@Override
	public void setModuleName(String moduleName) {
		model.setModuleName(moduleName);
	}

	/**
	 * Sets the primary key of this edc permission scope audit.
	 *
	 * @param primaryKey the primary key of this edc permission scope audit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this edc permission scope audit.
	 *
	 * @param projectId the project ID of this edc permission scope audit
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the remarks of this edc permission scope audit.
	 *
	 * @param remarks the remarks of this edc permission scope audit
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the role name of this edc permission scope audit.
	 *
	 * @param roleName the role name of this edc permission scope audit
	 */
	@Override
	public void setRoleName(String roleName) {
		model.setRoleName(roleName);
	}

	/**
	 * Sets the task key of this edc permission scope audit.
	 *
	 * @param taskKey the task key of this edc permission scope audit
	 */
	@Override
	public void setTaskKey(String taskKey) {
		model.setTaskKey(taskKey);
	}

	/**
	 * Sets the to active of this edc permission scope audit.
	 *
	 * @param toActive the to active of this edc permission scope audit
	 */
	@Override
	public void setToActive(String toActive) {
		model.setToActive(toActive);
	}

	/**
	 * Sets the to scope of this edc permission scope audit.
	 *
	 * @param toScope the to scope of this edc permission scope audit
	 */
	@Override
	public void setToScope(String toScope) {
		model.setToScope(toScope);
	}

	/**
	 * Sets the user ID of this edc permission scope audit.
	 *
	 * @param userId the user ID of this edc permission scope audit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this edc permission scope audit.
	 *
	 * @param userName the user name of this edc permission scope audit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this edc permission scope audit.
	 *
	 * @param userUuid the user uuid of this edc permission scope audit
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this edc permission scope audit.
	 *
	 * @param uuid the uuid of this edc permission scope audit
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected EdcPermissionScopeAuditWrapper wrap(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		return new EdcPermissionScopeAuditWrapper(edcPermissionScopeAudit);
	}

}
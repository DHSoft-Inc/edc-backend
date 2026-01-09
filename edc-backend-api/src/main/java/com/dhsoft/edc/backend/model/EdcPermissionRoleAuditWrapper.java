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
 * This class is a wrapper for {@link EdcPermissionRoleAudit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleAudit
 * @generated
 */
public class EdcPermissionRoleAuditWrapper
	extends BaseModelWrapper<EdcPermissionRoleAudit>
	implements EdcPermissionRoleAudit, ModelWrapper<EdcPermissionRoleAudit> {

	public EdcPermissionRoleAuditWrapper(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		super(edcPermissionRoleAudit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("auditRoleId", getAuditRoleId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("projectId", getProjectId());
		attributes.put("actorGroup", getActorGroup());
		attributes.put("actorId", getActorId());
		attributes.put("crudType", getCrudType());
		attributes.put("fromRole", getFromRole());
		attributes.put("toRole", getToRole());
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

		Long auditRoleId = (Long)attributes.get("auditRoleId");

		if (auditRoleId != null) {
			setAuditRoleId(auditRoleId);
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

		Long actorGroup = (Long)attributes.get("actorGroup");

		if (actorGroup != null) {
			setActorGroup(actorGroup);
		}

		Long actorId = (Long)attributes.get("actorId");

		if (actorId != null) {
			setActorId(actorId);
		}

		String crudType = (String)attributes.get("crudType");

		if (crudType != null) {
			setCrudType(crudType);
		}

		String fromRole = (String)attributes.get("fromRole");

		if (fromRole != null) {
			setFromRole(fromRole);
		}

		String toRole = (String)attributes.get("toRole");

		if (toRole != null) {
			setToRole(toRole);
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
	 * Returns the actor group of this edc permission role audit.
	 *
	 * @return the actor group of this edc permission role audit
	 */
	@Override
	public long getActorGroup() {
		return model.getActorGroup();
	}

	/**
	 * Returns the actor ID of this edc permission role audit.
	 *
	 * @return the actor ID of this edc permission role audit
	 */
	@Override
	public long getActorId() {
		return model.getActorId();
	}

	/**
	 * Returns the audit role ID of this edc permission role audit.
	 *
	 * @return the audit role ID of this edc permission role audit
	 */
	@Override
	public long getAuditRoleId() {
		return model.getAuditRoleId();
	}

	/**
	 * Returns the company ID of this edc permission role audit.
	 *
	 * @return the company ID of this edc permission role audit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this edc permission role audit.
	 *
	 * @return the create date of this edc permission role audit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the crud type of this edc permission role audit.
	 *
	 * @return the crud type of this edc permission role audit
	 */
	@Override
	public String getCrudType() {
		return model.getCrudType();
	}

	/**
	 * Returns the from active of this edc permission role audit.
	 *
	 * @return the from active of this edc permission role audit
	 */
	@Override
	public String getFromActive() {
		return model.getFromActive();
	}

	/**
	 * Returns the from role of this edc permission role audit.
	 *
	 * @return the from role of this edc permission role audit
	 */
	@Override
	public String getFromRole() {
		return model.getFromRole();
	}

	/**
	 * Returns the group ID of this edc permission role audit.
	 *
	 * @return the group ID of this edc permission role audit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the primary key of this edc permission role audit.
	 *
	 * @return the primary key of this edc permission role audit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this edc permission role audit.
	 *
	 * @return the project ID of this edc permission role audit
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the remarks of this edc permission role audit.
	 *
	 * @return the remarks of this edc permission role audit
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the to active of this edc permission role audit.
	 *
	 * @return the to active of this edc permission role audit
	 */
	@Override
	public String getToActive() {
		return model.getToActive();
	}

	/**
	 * Returns the to role of this edc permission role audit.
	 *
	 * @return the to role of this edc permission role audit
	 */
	@Override
	public String getToRole() {
		return model.getToRole();
	}

	/**
	 * Returns the user ID of this edc permission role audit.
	 *
	 * @return the user ID of this edc permission role audit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this edc permission role audit.
	 *
	 * @return the user name of this edc permission role audit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this edc permission role audit.
	 *
	 * @return the user uuid of this edc permission role audit
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this edc permission role audit.
	 *
	 * @return the uuid of this edc permission role audit
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
	 * Sets the actor group of this edc permission role audit.
	 *
	 * @param actorGroup the actor group of this edc permission role audit
	 */
	@Override
	public void setActorGroup(long actorGroup) {
		model.setActorGroup(actorGroup);
	}

	/**
	 * Sets the actor ID of this edc permission role audit.
	 *
	 * @param actorId the actor ID of this edc permission role audit
	 */
	@Override
	public void setActorId(long actorId) {
		model.setActorId(actorId);
	}

	/**
	 * Sets the audit role ID of this edc permission role audit.
	 *
	 * @param auditRoleId the audit role ID of this edc permission role audit
	 */
	@Override
	public void setAuditRoleId(long auditRoleId) {
		model.setAuditRoleId(auditRoleId);
	}

	/**
	 * Sets the company ID of this edc permission role audit.
	 *
	 * @param companyId the company ID of this edc permission role audit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this edc permission role audit.
	 *
	 * @param createDate the create date of this edc permission role audit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the crud type of this edc permission role audit.
	 *
	 * @param crudType the crud type of this edc permission role audit
	 */
	@Override
	public void setCrudType(String crudType) {
		model.setCrudType(crudType);
	}

	/**
	 * Sets the from active of this edc permission role audit.
	 *
	 * @param fromActive the from active of this edc permission role audit
	 */
	@Override
	public void setFromActive(String fromActive) {
		model.setFromActive(fromActive);
	}

	/**
	 * Sets the from role of this edc permission role audit.
	 *
	 * @param fromRole the from role of this edc permission role audit
	 */
	@Override
	public void setFromRole(String fromRole) {
		model.setFromRole(fromRole);
	}

	/**
	 * Sets the group ID of this edc permission role audit.
	 *
	 * @param groupId the group ID of this edc permission role audit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the primary key of this edc permission role audit.
	 *
	 * @param primaryKey the primary key of this edc permission role audit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this edc permission role audit.
	 *
	 * @param projectId the project ID of this edc permission role audit
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the remarks of this edc permission role audit.
	 *
	 * @param remarks the remarks of this edc permission role audit
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the to active of this edc permission role audit.
	 *
	 * @param toActive the to active of this edc permission role audit
	 */
	@Override
	public void setToActive(String toActive) {
		model.setToActive(toActive);
	}

	/**
	 * Sets the to role of this edc permission role audit.
	 *
	 * @param toRole the to role of this edc permission role audit
	 */
	@Override
	public void setToRole(String toRole) {
		model.setToRole(toRole);
	}

	/**
	 * Sets the user ID of this edc permission role audit.
	 *
	 * @param userId the user ID of this edc permission role audit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this edc permission role audit.
	 *
	 * @param userName the user name of this edc permission role audit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this edc permission role audit.
	 *
	 * @param userUuid the user uuid of this edc permission role audit
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this edc permission role audit.
	 *
	 * @param uuid the uuid of this edc permission role audit
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected EdcPermissionRoleAuditWrapper wrap(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return new EdcPermissionRoleAuditWrapper(edcPermissionRoleAudit);
	}

}
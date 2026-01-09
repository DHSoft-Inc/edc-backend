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
 * This class is a wrapper for {@link EdcPermissionRole}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRole
 * @generated
 */
public class EdcPermissionRoleWrapper
	extends BaseModelWrapper<EdcPermissionRole>
	implements EdcPermissionRole, ModelWrapper<EdcPermissionRole> {

	public EdcPermissionRoleWrapper(EdcPermissionRole edcPermissionRole) {
		super(edcPermissionRole);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("permissionRoleId", getPermissionRoleId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("projectId", getProjectId());
		attributes.put("actorGroup", getActorGroup());
		attributes.put("actorId", getActorId());
		attributes.put("roleName", getRoleName());
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

		Long permissionRoleId = (Long)attributes.get("permissionRoleId");

		if (permissionRoleId != null) {
			setPermissionRoleId(permissionRoleId);
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

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
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
	 * Returns the active of this edc permission role.
	 *
	 * @return the active of this edc permission role
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the actor group of this edc permission role.
	 *
	 * @return the actor group of this edc permission role
	 */
	@Override
	public long getActorGroup() {
		return model.getActorGroup();
	}

	/**
	 * Returns the actor ID of this edc permission role.
	 *
	 * @return the actor ID of this edc permission role
	 */
	@Override
	public long getActorId() {
		return model.getActorId();
	}

	/**
	 * Returns the company ID of this edc permission role.
	 *
	 * @return the company ID of this edc permission role
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this edc permission role.
	 *
	 * @return the create date of this edc permission role
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this edc permission role.
	 *
	 * @return the created by of this edc permission role
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the from date of this edc permission role.
	 *
	 * @return the from date of this edc permission role
	 */
	@Override
	public Date getFromDate() {
		return model.getFromDate();
	}

	/**
	 * Returns the group ID of this edc permission role.
	 *
	 * @return the group ID of this edc permission role
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified by of this edc permission role.
	 *
	 * @return the modified by of this edc permission role
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this edc permission role.
	 *
	 * @return the modified date of this edc permission role
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the permission role ID of this edc permission role.
	 *
	 * @return the permission role ID of this edc permission role
	 */
	@Override
	public long getPermissionRoleId() {
		return model.getPermissionRoleId();
	}

	/**
	 * Returns the primary key of this edc permission role.
	 *
	 * @return the primary key of this edc permission role
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this edc permission role.
	 *
	 * @return the project ID of this edc permission role
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the role name of this edc permission role.
	 *
	 * @return the role name of this edc permission role
	 */
	@Override
	public String getRoleName() {
		return model.getRoleName();
	}

	/**
	 * Returns the status of this edc permission role.
	 *
	 * @return the status of this edc permission role
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the to date of this edc permission role.
	 *
	 * @return the to date of this edc permission role
	 */
	@Override
	public Date getToDate() {
		return model.getToDate();
	}

	/**
	 * Returns the trash entry created when this edc permission role was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this edc permission role.
	 *
	 * @return the trash entry created when this edc permission role was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this edc permission role.
	 *
	 * @return the class primary key of the trash entry for this edc permission role
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this edc permission role.
	 *
	 * @return the trash handler for this edc permission role
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the uuid of this edc permission role.
	 *
	 * @return the uuid of this edc permission role
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this edc permission role is active.
	 *
	 * @return <code>true</code> if this edc permission role is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	/**
	 * Returns <code>true</code> if this edc permission role is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this edc permission role is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this edc permission role is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this edc permission role is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer() {
		return model.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return model.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return model.isInTrashImplicitly();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this edc permission role is active.
	 *
	 * @param active the active of this edc permission role
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the actor group of this edc permission role.
	 *
	 * @param actorGroup the actor group of this edc permission role
	 */
	@Override
	public void setActorGroup(long actorGroup) {
		model.setActorGroup(actorGroup);
	}

	/**
	 * Sets the actor ID of this edc permission role.
	 *
	 * @param actorId the actor ID of this edc permission role
	 */
	@Override
	public void setActorId(long actorId) {
		model.setActorId(actorId);
	}

	/**
	 * Sets the company ID of this edc permission role.
	 *
	 * @param companyId the company ID of this edc permission role
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this edc permission role.
	 *
	 * @param createDate the create date of this edc permission role
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this edc permission role.
	 *
	 * @param createdBy the created by of this edc permission role
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the from date of this edc permission role.
	 *
	 * @param fromDate the from date of this edc permission role
	 */
	@Override
	public void setFromDate(Date fromDate) {
		model.setFromDate(fromDate);
	}

	/**
	 * Sets the group ID of this edc permission role.
	 *
	 * @param groupId the group ID of this edc permission role
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified by of this edc permission role.
	 *
	 * @param modifiedBy the modified by of this edc permission role
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this edc permission role.
	 *
	 * @param modifiedDate the modified date of this edc permission role
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the permission role ID of this edc permission role.
	 *
	 * @param permissionRoleId the permission role ID of this edc permission role
	 */
	@Override
	public void setPermissionRoleId(long permissionRoleId) {
		model.setPermissionRoleId(permissionRoleId);
	}

	/**
	 * Sets the primary key of this edc permission role.
	 *
	 * @param primaryKey the primary key of this edc permission role
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this edc permission role.
	 *
	 * @param projectId the project ID of this edc permission role
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the role name of this edc permission role.
	 *
	 * @param roleName the role name of this edc permission role
	 */
	@Override
	public void setRoleName(String roleName) {
		model.setRoleName(roleName);
	}

	/**
	 * Sets the to date of this edc permission role.
	 *
	 * @param toDate the to date of this edc permission role
	 */
	@Override
	public void setToDate(Date toDate) {
		model.setToDate(toDate);
	}

	/**
	 * Sets the uuid of this edc permission role.
	 *
	 * @param uuid the uuid of this edc permission role
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
	protected EdcPermissionRoleWrapper wrap(
		EdcPermissionRole edcPermissionRole) {

		return new EdcPermissionRoleWrapper(edcPermissionRole);
	}

}
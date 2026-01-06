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
 * This class is a wrapper for {@link AssignInstitutionRole}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignInstitutionRole
 * @generated
 */
public class AssignInstitutionRoleWrapper
	extends BaseModelWrapper<AssignInstitutionRole>
	implements AssignInstitutionRole, ModelWrapper<AssignInstitutionRole> {

	public AssignInstitutionRoleWrapper(
		AssignInstitutionRole assignInstitutionRole) {

		super(assignInstitutionRole);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("institutionRoleId", getInstitutionRoleId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("researcherId", getResearcherId());
		attributes.put("targetUserId", getTargetUserId());
		attributes.put("roleName", getRoleName());
		attributes.put("active", isActive());
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

		Long institutionRoleId = (Long)attributes.get("institutionRoleId");

		if (institutionRoleId != null) {
			setInstitutionRoleId(institutionRoleId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
		}

		Long researcherId = (Long)attributes.get("researcherId");

		if (researcherId != null) {
			setResearcherId(researcherId);
		}

		Long targetUserId = (Long)attributes.get("targetUserId");

		if (targetUserId != null) {
			setTargetUserId(targetUserId);
		}

		String roleName = (String)attributes.get("roleName");

		if (roleName != null) {
			setRoleName(roleName);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
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
	 * Returns the active of this assign institution role.
	 *
	 * @return the active of this assign institution role
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this assign institution role.
	 *
	 * @return the company ID of this assign institution role
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this assign institution role.
	 *
	 * @return the create date of this assign institution role
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this assign institution role.
	 *
	 * @return the created by of this assign institution role
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the group ID of this assign institution role.
	 *
	 * @return the group ID of this assign institution role
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution ID of this assign institution role.
	 *
	 * @return the institution ID of this assign institution role
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the institution role ID of this assign institution role.
	 *
	 * @return the institution role ID of this assign institution role
	 */
	@Override
	public long getInstitutionRoleId() {
		return model.getInstitutionRoleId();
	}

	/**
	 * Returns the modified by of this assign institution role.
	 *
	 * @return the modified by of this assign institution role
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this assign institution role.
	 *
	 * @return the modified date of this assign institution role
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this assign institution role.
	 *
	 * @return the primary key of this assign institution role
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the researcher ID of this assign institution role.
	 *
	 * @return the researcher ID of this assign institution role
	 */
	@Override
	public long getResearcherId() {
		return model.getResearcherId();
	}

	/**
	 * Returns the role name of this assign institution role.
	 *
	 * @return the role name of this assign institution role
	 */
	@Override
	public String getRoleName() {
		return model.getRoleName();
	}

	/**
	 * Returns the status of this assign institution role.
	 *
	 * @return the status of this assign institution role
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the target user ID of this assign institution role.
	 *
	 * @return the target user ID of this assign institution role
	 */
	@Override
	public long getTargetUserId() {
		return model.getTargetUserId();
	}

	/**
	 * Returns the target user uuid of this assign institution role.
	 *
	 * @return the target user uuid of this assign institution role
	 */
	@Override
	public String getTargetUserUuid() {
		return model.getTargetUserUuid();
	}

	/**
	 * Returns the trash entry created when this assign institution role was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this assign institution role.
	 *
	 * @return the trash entry created when this assign institution role was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this assign institution role.
	 *
	 * @return the class primary key of the trash entry for this assign institution role
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this assign institution role.
	 *
	 * @return the trash handler for this assign institution role
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the uuid of this assign institution role.
	 *
	 * @return the uuid of this assign institution role
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this assign institution role is active.
	 *
	 * @return <code>true</code> if this assign institution role is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	/**
	 * Returns <code>true</code> if this assign institution role is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this assign institution role is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this assign institution role is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this assign institution role is in the Recycle Bin; <code>false</code> otherwise
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
	 * Sets whether this assign institution role is active.
	 *
	 * @param active the active of this assign institution role
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this assign institution role.
	 *
	 * @param companyId the company ID of this assign institution role
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this assign institution role.
	 *
	 * @param createDate the create date of this assign institution role
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this assign institution role.
	 *
	 * @param createdBy the created by of this assign institution role
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the group ID of this assign institution role.
	 *
	 * @param groupId the group ID of this assign institution role
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution ID of this assign institution role.
	 *
	 * @param institutionId the institution ID of this assign institution role
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the institution role ID of this assign institution role.
	 *
	 * @param institutionRoleId the institution role ID of this assign institution role
	 */
	@Override
	public void setInstitutionRoleId(long institutionRoleId) {
		model.setInstitutionRoleId(institutionRoleId);
	}

	/**
	 * Sets the modified by of this assign institution role.
	 *
	 * @param modifiedBy the modified by of this assign institution role
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this assign institution role.
	 *
	 * @param modifiedDate the modified date of this assign institution role
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this assign institution role.
	 *
	 * @param primaryKey the primary key of this assign institution role
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the researcher ID of this assign institution role.
	 *
	 * @param researcherId the researcher ID of this assign institution role
	 */
	@Override
	public void setResearcherId(long researcherId) {
		model.setResearcherId(researcherId);
	}

	/**
	 * Sets the role name of this assign institution role.
	 *
	 * @param roleName the role name of this assign institution role
	 */
	@Override
	public void setRoleName(String roleName) {
		model.setRoleName(roleName);
	}

	/**
	 * Sets the target user ID of this assign institution role.
	 *
	 * @param targetUserId the target user ID of this assign institution role
	 */
	@Override
	public void setTargetUserId(long targetUserId) {
		model.setTargetUserId(targetUserId);
	}

	/**
	 * Sets the target user uuid of this assign institution role.
	 *
	 * @param targetUserUuid the target user uuid of this assign institution role
	 */
	@Override
	public void setTargetUserUuid(String targetUserUuid) {
		model.setTargetUserUuid(targetUserUuid);
	}

	/**
	 * Sets the uuid of this assign institution role.
	 *
	 * @param uuid the uuid of this assign institution role
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
	protected AssignInstitutionRoleWrapper wrap(
		AssignInstitutionRole assignInstitutionRole) {

		return new AssignInstitutionRoleWrapper(assignInstitutionRole);
	}

}
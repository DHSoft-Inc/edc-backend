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
 * This class is a wrapper for {@link MetaGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaGroup
 * @generated
 */
public class MetaGroupWrapper
	extends BaseModelWrapper<MetaGroup>
	implements MetaGroup, ModelWrapper<MetaGroup> {

	public MetaGroupWrapper(MetaGroup metaGroup) {
		super(metaGroup);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("metaGroupId", getMetaGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("groupCode", getGroupCode());
		attributes.put("groupName", getGroupName());
		attributes.put("type", getType());
		attributes.put("active", getActive());
		attributes.put("inactiveDate", getInactiveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long metaGroupId = (Long)attributes.get("metaGroupId");

		if (metaGroupId != null) {
			setMetaGroupId(metaGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date inactiveDate = (Date)attributes.get("inactiveDate");

		if (inactiveDate != null) {
			setInactiveDate(inactiveDate);
		}
	}

	/**
	 * Returns the active of this meta group.
	 *
	 * @return the active of this meta group
	 */
	@Override
	public Boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this meta group.
	 *
	 * @return the company ID of this meta group
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this meta group.
	 *
	 * @return the create date of this meta group
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group code of this meta group.
	 *
	 * @return the group code of this meta group
	 */
	@Override
	public String getGroupCode() {
		return model.getGroupCode();
	}

	/**
	 * Returns the group ID of this meta group.
	 *
	 * @return the group ID of this meta group
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the group name of this meta group.
	 *
	 * @return the group name of this meta group
	 */
	@Override
	public String getGroupName() {
		return model.getGroupName();
	}

	/**
	 * Returns the inactive date of this meta group.
	 *
	 * @return the inactive date of this meta group
	 */
	@Override
	public Date getInactiveDate() {
		return model.getInactiveDate();
	}

	/**
	 * Returns the meta group ID of this meta group.
	 *
	 * @return the meta group ID of this meta group
	 */
	@Override
	public long getMetaGroupId() {
		return model.getMetaGroupId();
	}

	/**
	 * Returns the modified date of this meta group.
	 *
	 * @return the modified date of this meta group
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this meta group.
	 *
	 * @return the primary key of this meta group
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this meta group.
	 *
	 * @return the project ID of this meta group
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this meta group.
	 *
	 * @return the status of this meta group
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this meta group.
	 *
	 * @return the status by user ID of this meta group
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this meta group.
	 *
	 * @return the status by user name of this meta group
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this meta group.
	 *
	 * @return the status by user uuid of this meta group
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this meta group.
	 *
	 * @return the status date of this meta group
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this meta group was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this meta group.
	 *
	 * @return the trash entry created when this meta group was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this meta group.
	 *
	 * @return the class primary key of the trash entry for this meta group
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this meta group.
	 *
	 * @return the trash handler for this meta group
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the type of this meta group.
	 *
	 * @return the type of this meta group
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this meta group.
	 *
	 * @return the user ID of this meta group
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this meta group.
	 *
	 * @return the user name of this meta group
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this meta group.
	 *
	 * @return the user uuid of this meta group
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this meta group.
	 *
	 * @return the uuid of this meta group
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this meta group is approved.
	 *
	 * @return <code>true</code> if this meta group is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this meta group is denied.
	 *
	 * @return <code>true</code> if this meta group is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this meta group is a draft.
	 *
	 * @return <code>true</code> if this meta group is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this meta group is expired.
	 *
	 * @return <code>true</code> if this meta group is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this meta group is inactive.
	 *
	 * @return <code>true</code> if this meta group is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this meta group is incomplete.
	 *
	 * @return <code>true</code> if this meta group is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this meta group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this meta group is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this meta group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this meta group is in the Recycle Bin; <code>false</code> otherwise
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

	/**
	 * Returns <code>true</code> if this meta group is pending.
	 *
	 * @return <code>true</code> if this meta group is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this meta group is scheduled.
	 *
	 * @return <code>true</code> if this meta group is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the active of this meta group.
	 *
	 * @param active the active of this meta group
	 */
	@Override
	public void setActive(Boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this meta group.
	 *
	 * @param companyId the company ID of this meta group
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this meta group.
	 *
	 * @param createDate the create date of this meta group
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group code of this meta group.
	 *
	 * @param groupCode the group code of this meta group
	 */
	@Override
	public void setGroupCode(String groupCode) {
		model.setGroupCode(groupCode);
	}

	/**
	 * Sets the group ID of this meta group.
	 *
	 * @param groupId the group ID of this meta group
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the group name of this meta group.
	 *
	 * @param groupName the group name of this meta group
	 */
	@Override
	public void setGroupName(String groupName) {
		model.setGroupName(groupName);
	}

	/**
	 * Sets the inactive date of this meta group.
	 *
	 * @param inactiveDate the inactive date of this meta group
	 */
	@Override
	public void setInactiveDate(Date inactiveDate) {
		model.setInactiveDate(inactiveDate);
	}

	/**
	 * Sets the meta group ID of this meta group.
	 *
	 * @param metaGroupId the meta group ID of this meta group
	 */
	@Override
	public void setMetaGroupId(long metaGroupId) {
		model.setMetaGroupId(metaGroupId);
	}

	/**
	 * Sets the modified date of this meta group.
	 *
	 * @param modifiedDate the modified date of this meta group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this meta group.
	 *
	 * @param primaryKey the primary key of this meta group
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this meta group.
	 *
	 * @param projectId the project ID of this meta group
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this meta group.
	 *
	 * @param status the status of this meta group
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this meta group.
	 *
	 * @param statusByUserId the status by user ID of this meta group
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this meta group.
	 *
	 * @param statusByUserName the status by user name of this meta group
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this meta group.
	 *
	 * @param statusByUserUuid the status by user uuid of this meta group
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this meta group.
	 *
	 * @param statusDate the status date of this meta group
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the type of this meta group.
	 *
	 * @param type the type of this meta group
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this meta group.
	 *
	 * @param userId the user ID of this meta group
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this meta group.
	 *
	 * @param userName the user name of this meta group
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this meta group.
	 *
	 * @param userUuid the user uuid of this meta group
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this meta group.
	 *
	 * @param uuid the uuid of this meta group
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
	protected MetaGroupWrapper wrap(MetaGroup metaGroup) {
		return new MetaGroupWrapper(metaGroup);
	}

}
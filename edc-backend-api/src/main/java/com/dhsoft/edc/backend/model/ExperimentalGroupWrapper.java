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
 * This class is a wrapper for {@link ExperimentalGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExperimentalGroup
 * @generated
 */
public class ExperimentalGroupWrapper
	extends BaseModelWrapper<ExperimentalGroup>
	implements ExperimentalGroup, ModelWrapper<ExperimentalGroup> {

	public ExperimentalGroupWrapper(ExperimentalGroup experimentalGroup) {
		super(experimentalGroup);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("experimentalGroupId", getExperimentalGroupId());
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
		attributes.put("expCode", getExpCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long experimentalGroupId = (Long)attributes.get("experimentalGroupId");

		if (experimentalGroupId != null) {
			setExperimentalGroupId(experimentalGroupId);
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

		String expCode = (String)attributes.get("expCode");

		if (expCode != null) {
			setExpCode(expCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	 * Returns the company ID of this experimental group.
	 *
	 * @return the company ID of this experimental group
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this experimental group.
	 *
	 * @return the create date of this experimental group
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this experimental group.
	 *
	 * @return the description of this experimental group
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the exp code of this experimental group.
	 *
	 * @return the exp code of this experimental group
	 */
	@Override
	public String getExpCode() {
		return model.getExpCode();
	}

	/**
	 * Returns the experimental group ID of this experimental group.
	 *
	 * @return the experimental group ID of this experimental group
	 */
	@Override
	public long getExperimentalGroupId() {
		return model.getExperimentalGroupId();
	}

	/**
	 * Returns the group ID of this experimental group.
	 *
	 * @return the group ID of this experimental group
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this experimental group.
	 *
	 * @return the modified date of this experimental group
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this experimental group.
	 *
	 * @return the name of this experimental group
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this experimental group.
	 *
	 * @return the primary key of this experimental group
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this experimental group.
	 *
	 * @return the project ID of this experimental group
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this experimental group.
	 *
	 * @return the status of this experimental group
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this experimental group.
	 *
	 * @return the status by user ID of this experimental group
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this experimental group.
	 *
	 * @return the status by user name of this experimental group
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this experimental group.
	 *
	 * @return the status by user uuid of this experimental group
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this experimental group.
	 *
	 * @return the status date of this experimental group
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this experimental group was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this experimental group.
	 *
	 * @return the trash entry created when this experimental group was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this experimental group.
	 *
	 * @return the class primary key of the trash entry for this experimental group
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this experimental group.
	 *
	 * @return the trash handler for this experimental group
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the type of this experimental group.
	 *
	 * @return the type of this experimental group
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this experimental group.
	 *
	 * @return the user ID of this experimental group
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this experimental group.
	 *
	 * @return the user name of this experimental group
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this experimental group.
	 *
	 * @return the user uuid of this experimental group
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this experimental group.
	 *
	 * @return the uuid of this experimental group
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this experimental group is approved.
	 *
	 * @return <code>true</code> if this experimental group is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this experimental group is denied.
	 *
	 * @return <code>true</code> if this experimental group is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this experimental group is a draft.
	 *
	 * @return <code>true</code> if this experimental group is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this experimental group is expired.
	 *
	 * @return <code>true</code> if this experimental group is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this experimental group is inactive.
	 *
	 * @return <code>true</code> if this experimental group is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this experimental group is incomplete.
	 *
	 * @return <code>true</code> if this experimental group is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this experimental group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this experimental group is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this experimental group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this experimental group is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this experimental group is pending.
	 *
	 * @return <code>true</code> if this experimental group is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this experimental group is scheduled.
	 *
	 * @return <code>true</code> if this experimental group is scheduled; <code>false</code> otherwise
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
	 * Sets the company ID of this experimental group.
	 *
	 * @param companyId the company ID of this experimental group
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this experimental group.
	 *
	 * @param createDate the create date of this experimental group
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this experimental group.
	 *
	 * @param description the description of this experimental group
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the exp code of this experimental group.
	 *
	 * @param expCode the exp code of this experimental group
	 */
	@Override
	public void setExpCode(String expCode) {
		model.setExpCode(expCode);
	}

	/**
	 * Sets the experimental group ID of this experimental group.
	 *
	 * @param experimentalGroupId the experimental group ID of this experimental group
	 */
	@Override
	public void setExperimentalGroupId(long experimentalGroupId) {
		model.setExperimentalGroupId(experimentalGroupId);
	}

	/**
	 * Sets the group ID of this experimental group.
	 *
	 * @param groupId the group ID of this experimental group
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this experimental group.
	 *
	 * @param modifiedDate the modified date of this experimental group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this experimental group.
	 *
	 * @param name the name of this experimental group
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this experimental group.
	 *
	 * @param primaryKey the primary key of this experimental group
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this experimental group.
	 *
	 * @param projectId the project ID of this experimental group
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this experimental group.
	 *
	 * @param status the status of this experimental group
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this experimental group.
	 *
	 * @param statusByUserId the status by user ID of this experimental group
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this experimental group.
	 *
	 * @param statusByUserName the status by user name of this experimental group
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this experimental group.
	 *
	 * @param statusByUserUuid the status by user uuid of this experimental group
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this experimental group.
	 *
	 * @param statusDate the status date of this experimental group
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the type of this experimental group.
	 *
	 * @param type the type of this experimental group
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this experimental group.
	 *
	 * @param userId the user ID of this experimental group
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this experimental group.
	 *
	 * @param userName the user name of this experimental group
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this experimental group.
	 *
	 * @param userUuid the user uuid of this experimental group
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this experimental group.
	 *
	 * @param uuid the uuid of this experimental group
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
	protected ExperimentalGroupWrapper wrap(
		ExperimentalGroup experimentalGroup) {

		return new ExperimentalGroupWrapper(experimentalGroup);
	}

}
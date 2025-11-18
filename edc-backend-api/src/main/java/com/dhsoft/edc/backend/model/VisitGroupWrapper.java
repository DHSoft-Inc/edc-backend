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
 * This class is a wrapper for {@link VisitGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitGroup
 * @generated
 */
public class VisitGroupWrapper
	extends BaseModelWrapper<VisitGroup>
	implements ModelWrapper<VisitGroup>, VisitGroup {

	public VisitGroupWrapper(VisitGroup visitGroup) {
		super(visitGroup);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("visitGroupId", getVisitGroupId());
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
		attributes.put("expGroupId", getExpGroupId());
		attributes.put("visitGroupCode", getVisitGroupCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("activeStatus", getActiveStatus());
		attributes.put("activeDate", getActiveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long visitGroupId = (Long)attributes.get("visitGroupId");

		if (visitGroupId != null) {
			setVisitGroupId(visitGroupId);
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

		Long expGroupId = (Long)attributes.get("expGroupId");

		if (expGroupId != null) {
			setExpGroupId(expGroupId);
		}

		String visitGroupCode = (String)attributes.get("visitGroupCode");

		if (visitGroupCode != null) {
			setVisitGroupCode(visitGroupCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer activeStatus = (Integer)attributes.get("activeStatus");

		if (activeStatus != null) {
			setActiveStatus(activeStatus);
		}

		Date activeDate = (Date)attributes.get("activeDate");

		if (activeDate != null) {
			setActiveDate(activeDate);
		}
	}

	/**
	 * Returns the active date of this visit group.
	 *
	 * @return the active date of this visit group
	 */
	@Override
	public Date getActiveDate() {
		return model.getActiveDate();
	}

	/**
	 * Returns the active status of this visit group.
	 *
	 * @return the active status of this visit group
	 */
	@Override
	public int getActiveStatus() {
		return model.getActiveStatus();
	}

	/**
	 * Returns the company ID of this visit group.
	 *
	 * @return the company ID of this visit group
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this visit group.
	 *
	 * @return the create date of this visit group
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this visit group.
	 *
	 * @return the description of this visit group
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the exp group ID of this visit group.
	 *
	 * @return the exp group ID of this visit group
	 */
	@Override
	public long getExpGroupId() {
		return model.getExpGroupId();
	}

	/**
	 * Returns the group ID of this visit group.
	 *
	 * @return the group ID of this visit group
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this visit group.
	 *
	 * @return the modified date of this visit group
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this visit group.
	 *
	 * @return the name of this visit group
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this visit group.
	 *
	 * @return the primary key of this visit group
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this visit group.
	 *
	 * @return the project ID of this visit group
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this visit group.
	 *
	 * @return the status of this visit group
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this visit group.
	 *
	 * @return the status by user ID of this visit group
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this visit group.
	 *
	 * @return the status by user name of this visit group
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this visit group.
	 *
	 * @return the status by user uuid of this visit group
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this visit group.
	 *
	 * @return the status date of this visit group
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this visit group was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this visit group.
	 *
	 * @return the trash entry created when this visit group was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this visit group.
	 *
	 * @return the class primary key of the trash entry for this visit group
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this visit group.
	 *
	 * @return the trash handler for this visit group
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this visit group.
	 *
	 * @return the user ID of this visit group
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this visit group.
	 *
	 * @return the user name of this visit group
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this visit group.
	 *
	 * @return the user uuid of this visit group
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this visit group.
	 *
	 * @return the uuid of this visit group
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the visit group code of this visit group.
	 *
	 * @return the visit group code of this visit group
	 */
	@Override
	public String getVisitGroupCode() {
		return model.getVisitGroupCode();
	}

	/**
	 * Returns the visit group ID of this visit group.
	 *
	 * @return the visit group ID of this visit group
	 */
	@Override
	public long getVisitGroupId() {
		return model.getVisitGroupId();
	}

	/**
	 * Returns <code>true</code> if this visit group is approved.
	 *
	 * @return <code>true</code> if this visit group is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this visit group is denied.
	 *
	 * @return <code>true</code> if this visit group is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this visit group is a draft.
	 *
	 * @return <code>true</code> if this visit group is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this visit group is expired.
	 *
	 * @return <code>true</code> if this visit group is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this visit group is inactive.
	 *
	 * @return <code>true</code> if this visit group is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this visit group is incomplete.
	 *
	 * @return <code>true</code> if this visit group is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this visit group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this visit group is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this visit group is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this visit group is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this visit group is pending.
	 *
	 * @return <code>true</code> if this visit group is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this visit group is scheduled.
	 *
	 * @return <code>true</code> if this visit group is scheduled; <code>false</code> otherwise
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
	 * Sets the active date of this visit group.
	 *
	 * @param activeDate the active date of this visit group
	 */
	@Override
	public void setActiveDate(Date activeDate) {
		model.setActiveDate(activeDate);
	}

	/**
	 * Sets the active status of this visit group.
	 *
	 * @param activeStatus the active status of this visit group
	 */
	@Override
	public void setActiveStatus(int activeStatus) {
		model.setActiveStatus(activeStatus);
	}

	/**
	 * Sets the company ID of this visit group.
	 *
	 * @param companyId the company ID of this visit group
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this visit group.
	 *
	 * @param createDate the create date of this visit group
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this visit group.
	 *
	 * @param description the description of this visit group
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the exp group ID of this visit group.
	 *
	 * @param expGroupId the exp group ID of this visit group
	 */
	@Override
	public void setExpGroupId(long expGroupId) {
		model.setExpGroupId(expGroupId);
	}

	/**
	 * Sets the group ID of this visit group.
	 *
	 * @param groupId the group ID of this visit group
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this visit group.
	 *
	 * @param modifiedDate the modified date of this visit group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this visit group.
	 *
	 * @param name the name of this visit group
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this visit group.
	 *
	 * @param primaryKey the primary key of this visit group
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this visit group.
	 *
	 * @param projectId the project ID of this visit group
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this visit group.
	 *
	 * @param status the status of this visit group
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this visit group.
	 *
	 * @param statusByUserId the status by user ID of this visit group
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this visit group.
	 *
	 * @param statusByUserName the status by user name of this visit group
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this visit group.
	 *
	 * @param statusByUserUuid the status by user uuid of this visit group
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this visit group.
	 *
	 * @param statusDate the status date of this visit group
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this visit group.
	 *
	 * @param userId the user ID of this visit group
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this visit group.
	 *
	 * @param userName the user name of this visit group
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this visit group.
	 *
	 * @param userUuid the user uuid of this visit group
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this visit group.
	 *
	 * @param uuid the uuid of this visit group
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the visit group code of this visit group.
	 *
	 * @param visitGroupCode the visit group code of this visit group
	 */
	@Override
	public void setVisitGroupCode(String visitGroupCode) {
		model.setVisitGroupCode(visitGroupCode);
	}

	/**
	 * Sets the visit group ID of this visit group.
	 *
	 * @param visitGroupId the visit group ID of this visit group
	 */
	@Override
	public void setVisitGroupId(long visitGroupId) {
		model.setVisitGroupId(visitGroupId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected VisitGroupWrapper wrap(VisitGroup visitGroup) {
		return new VisitGroupWrapper(visitGroup);
	}

}
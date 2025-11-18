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
 * This class is a wrapper for {@link Randomization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Randomization
 * @generated
 */
public class RandomizationWrapper
	extends BaseModelWrapper<Randomization>
	implements ModelWrapper<Randomization>, Randomization {

	public RandomizationWrapper(Randomization randomization) {
		super(randomization);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("randomizationId", getRandomizationId());
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
		attributes.put("randomNo", getRandomNo());
		attributes.put("useStatus", getUseStatus());
		attributes.put("sourceType", getSourceType());
		attributes.put("criteria", getCriteria());
		attributes.put("expGroupId", getExpGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long randomizationId = (Long)attributes.get("randomizationId");

		if (randomizationId != null) {
			setRandomizationId(randomizationId);
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

		String randomNo = (String)attributes.get("randomNo");

		if (randomNo != null) {
			setRandomNo(randomNo);
		}

		Integer useStatus = (Integer)attributes.get("useStatus");

		if (useStatus != null) {
			setUseStatus(useStatus);
		}

		Integer sourceType = (Integer)attributes.get("sourceType");

		if (sourceType != null) {
			setSourceType(sourceType);
		}

		String criteria = (String)attributes.get("criteria");

		if (criteria != null) {
			setCriteria(criteria);
		}

		Long expGroupId = (Long)attributes.get("expGroupId");

		if (expGroupId != null) {
			setExpGroupId(expGroupId);
		}
	}

	/**
	 * Returns the company ID of this randomization.
	 *
	 * @return the company ID of this randomization
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this randomization.
	 *
	 * @return the create date of this randomization
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the criteria of this randomization.
	 *
	 * @return the criteria of this randomization
	 */
	@Override
	public String getCriteria() {
		return model.getCriteria();
	}

	/**
	 * Returns the exp group ID of this randomization.
	 *
	 * @return the exp group ID of this randomization
	 */
	@Override
	public long getExpGroupId() {
		return model.getExpGroupId();
	}

	/**
	 * Returns the group ID of this randomization.
	 *
	 * @return the group ID of this randomization
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this randomization.
	 *
	 * @return the modified date of this randomization
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this randomization.
	 *
	 * @return the primary key of this randomization
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this randomization.
	 *
	 * @return the project ID of this randomization
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the randomization ID of this randomization.
	 *
	 * @return the randomization ID of this randomization
	 */
	@Override
	public long getRandomizationId() {
		return model.getRandomizationId();
	}

	/**
	 * Returns the random no of this randomization.
	 *
	 * @return the random no of this randomization
	 */
	@Override
	public String getRandomNo() {
		return model.getRandomNo();
	}

	/**
	 * Returns the source type of this randomization.
	 *
	 * @return the source type of this randomization
	 */
	@Override
	public int getSourceType() {
		return model.getSourceType();
	}

	/**
	 * Returns the status of this randomization.
	 *
	 * @return the status of this randomization
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this randomization.
	 *
	 * @return the status by user ID of this randomization
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this randomization.
	 *
	 * @return the status by user name of this randomization
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this randomization.
	 *
	 * @return the status by user uuid of this randomization
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this randomization.
	 *
	 * @return the status date of this randomization
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this randomization was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this randomization.
	 *
	 * @return the trash entry created when this randomization was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this randomization.
	 *
	 * @return the class primary key of the trash entry for this randomization
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this randomization.
	 *
	 * @return the trash handler for this randomization
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this randomization.
	 *
	 * @return the user ID of this randomization
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this randomization.
	 *
	 * @return the user name of this randomization
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this randomization.
	 *
	 * @return the user uuid of this randomization
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the use status of this randomization.
	 *
	 * @return the use status of this randomization
	 */
	@Override
	public int getUseStatus() {
		return model.getUseStatus();
	}

	/**
	 * Returns the uuid of this randomization.
	 *
	 * @return the uuid of this randomization
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this randomization is approved.
	 *
	 * @return <code>true</code> if this randomization is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this randomization is denied.
	 *
	 * @return <code>true</code> if this randomization is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this randomization is a draft.
	 *
	 * @return <code>true</code> if this randomization is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this randomization is expired.
	 *
	 * @return <code>true</code> if this randomization is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this randomization is inactive.
	 *
	 * @return <code>true</code> if this randomization is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this randomization is incomplete.
	 *
	 * @return <code>true</code> if this randomization is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this randomization is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this randomization is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this randomization is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this randomization is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this randomization is pending.
	 *
	 * @return <code>true</code> if this randomization is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this randomization is scheduled.
	 *
	 * @return <code>true</code> if this randomization is scheduled; <code>false</code> otherwise
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
	 * Sets the company ID of this randomization.
	 *
	 * @param companyId the company ID of this randomization
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this randomization.
	 *
	 * @param createDate the create date of this randomization
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the criteria of this randomization.
	 *
	 * @param criteria the criteria of this randomization
	 */
	@Override
	public void setCriteria(String criteria) {
		model.setCriteria(criteria);
	}

	/**
	 * Sets the exp group ID of this randomization.
	 *
	 * @param expGroupId the exp group ID of this randomization
	 */
	@Override
	public void setExpGroupId(long expGroupId) {
		model.setExpGroupId(expGroupId);
	}

	/**
	 * Sets the group ID of this randomization.
	 *
	 * @param groupId the group ID of this randomization
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this randomization.
	 *
	 * @param modifiedDate the modified date of this randomization
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this randomization.
	 *
	 * @param primaryKey the primary key of this randomization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this randomization.
	 *
	 * @param projectId the project ID of this randomization
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the randomization ID of this randomization.
	 *
	 * @param randomizationId the randomization ID of this randomization
	 */
	@Override
	public void setRandomizationId(long randomizationId) {
		model.setRandomizationId(randomizationId);
	}

	/**
	 * Sets the random no of this randomization.
	 *
	 * @param randomNo the random no of this randomization
	 */
	@Override
	public void setRandomNo(String randomNo) {
		model.setRandomNo(randomNo);
	}

	/**
	 * Sets the source type of this randomization.
	 *
	 * @param sourceType the source type of this randomization
	 */
	@Override
	public void setSourceType(int sourceType) {
		model.setSourceType(sourceType);
	}

	/**
	 * Sets the status of this randomization.
	 *
	 * @param status the status of this randomization
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this randomization.
	 *
	 * @param statusByUserId the status by user ID of this randomization
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this randomization.
	 *
	 * @param statusByUserName the status by user name of this randomization
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this randomization.
	 *
	 * @param statusByUserUuid the status by user uuid of this randomization
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this randomization.
	 *
	 * @param statusDate the status date of this randomization
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this randomization.
	 *
	 * @param userId the user ID of this randomization
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this randomization.
	 *
	 * @param userName the user name of this randomization
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this randomization.
	 *
	 * @param userUuid the user uuid of this randomization
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the use status of this randomization.
	 *
	 * @param useStatus the use status of this randomization
	 */
	@Override
	public void setUseStatus(int useStatus) {
		model.setUseStatus(useStatus);
	}

	/**
	 * Sets the uuid of this randomization.
	 *
	 * @param uuid the uuid of this randomization
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
	protected RandomizationWrapper wrap(Randomization randomization) {
		return new RandomizationWrapper(randomization);
	}

}
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
 * This class is a wrapper for {@link Subject}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Subject
 * @generated
 */
public class SubjectWrapper
	extends BaseModelWrapper<Subject>
	implements ModelWrapper<Subject>, Subject {

	public SubjectWrapper(Subject subject) {
		super(subject);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("subjectId", getSubjectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("serialId", getSerialId());
		attributes.put("randomNo", getRandomNo());
		attributes.put("name", getName());
		attributes.put("subjectStatus", getSubjectStatus());
		attributes.put("subjectStatusApplyDate", getSubjectStatusApplyDate());
		attributes.put("consentAgreeDate", getConsentAgreeDate());
		attributes.put("expGroupId", getExpGroupId());
		attributes.put("applyDate", getApplyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long subjectId = (Long)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
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

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
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

		String serialId = (String)attributes.get("serialId");

		if (serialId != null) {
			setSerialId(serialId);
		}

		String randomNo = (String)attributes.get("randomNo");

		if (randomNo != null) {
			setRandomNo(randomNo);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer subjectStatus = (Integer)attributes.get("subjectStatus");

		if (subjectStatus != null) {
			setSubjectStatus(subjectStatus);
		}

		Date subjectStatusApplyDate = (Date)attributes.get(
			"subjectStatusApplyDate");

		if (subjectStatusApplyDate != null) {
			setSubjectStatusApplyDate(subjectStatusApplyDate);
		}

		Date consentAgreeDate = (Date)attributes.get("consentAgreeDate");

		if (consentAgreeDate != null) {
			setConsentAgreeDate(consentAgreeDate);
		}

		Long expGroupId = (Long)attributes.get("expGroupId");

		if (expGroupId != null) {
			setExpGroupId(expGroupId);
		}

		Date applyDate = (Date)attributes.get("applyDate");

		if (applyDate != null) {
			setApplyDate(applyDate);
		}
	}

	/**
	 * Returns the apply date of this subject.
	 *
	 * @return the apply date of this subject
	 */
	@Override
	public Date getApplyDate() {
		return model.getApplyDate();
	}

	/**
	 * Returns the company ID of this subject.
	 *
	 * @return the company ID of this subject
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the consent agree date of this subject.
	 *
	 * @return the consent agree date of this subject
	 */
	@Override
	public Date getConsentAgreeDate() {
		return model.getConsentAgreeDate();
	}

	/**
	 * Returns the create date of this subject.
	 *
	 * @return the create date of this subject
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the exp group ID of this subject.
	 *
	 * @return the exp group ID of this subject
	 */
	@Override
	public long getExpGroupId() {
		return model.getExpGroupId();
	}

	/**
	 * Returns the group ID of this subject.
	 *
	 * @return the group ID of this subject
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution ID of this subject.
	 *
	 * @return the institution ID of this subject
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the modified date of this subject.
	 *
	 * @return the modified date of this subject
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this subject.
	 *
	 * @return the name of this subject
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this subject.
	 *
	 * @return the primary key of this subject
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this subject.
	 *
	 * @return the project ID of this subject
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the random no of this subject.
	 *
	 * @return the random no of this subject
	 */
	@Override
	public String getRandomNo() {
		return model.getRandomNo();
	}

	/**
	 * Returns the serial ID of this subject.
	 *
	 * @return the serial ID of this subject
	 */
	@Override
	public String getSerialId() {
		return model.getSerialId();
	}

	/**
	 * Returns the status of this subject.
	 *
	 * @return the status of this subject
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this subject.
	 *
	 * @return the status by user ID of this subject
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this subject.
	 *
	 * @return the status by user name of this subject
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this subject.
	 *
	 * @return the status by user uuid of this subject
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this subject.
	 *
	 * @return the status date of this subject
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the subject ID of this subject.
	 *
	 * @return the subject ID of this subject
	 */
	@Override
	public long getSubjectId() {
		return model.getSubjectId();
	}

	/**
	 * Returns the subject status of this subject.
	 *
	 * @return the subject status of this subject
	 */
	@Override
	public int getSubjectStatus() {
		return model.getSubjectStatus();
	}

	/**
	 * Returns the subject status apply date of this subject.
	 *
	 * @return the subject status apply date of this subject
	 */
	@Override
	public Date getSubjectStatusApplyDate() {
		return model.getSubjectStatusApplyDate();
	}

	/**
	 * Returns the trash entry created when this subject was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this subject.
	 *
	 * @return the trash entry created when this subject was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this subject.
	 *
	 * @return the class primary key of the trash entry for this subject
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this subject.
	 *
	 * @return the trash handler for this subject
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this subject.
	 *
	 * @return the user ID of this subject
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this subject.
	 *
	 * @return the user name of this subject
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this subject.
	 *
	 * @return the user uuid of this subject
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this subject.
	 *
	 * @return the uuid of this subject
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this subject is approved.
	 *
	 * @return <code>true</code> if this subject is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this subject is denied.
	 *
	 * @return <code>true</code> if this subject is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this subject is a draft.
	 *
	 * @return <code>true</code> if this subject is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this subject is expired.
	 *
	 * @return <code>true</code> if this subject is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this subject is inactive.
	 *
	 * @return <code>true</code> if this subject is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this subject is incomplete.
	 *
	 * @return <code>true</code> if this subject is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this subject is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this subject is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this subject is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this subject is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this subject is pending.
	 *
	 * @return <code>true</code> if this subject is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this subject is scheduled.
	 *
	 * @return <code>true</code> if this subject is scheduled; <code>false</code> otherwise
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
	 * Sets the apply date of this subject.
	 *
	 * @param applyDate the apply date of this subject
	 */
	@Override
	public void setApplyDate(Date applyDate) {
		model.setApplyDate(applyDate);
	}

	/**
	 * Sets the company ID of this subject.
	 *
	 * @param companyId the company ID of this subject
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the consent agree date of this subject.
	 *
	 * @param consentAgreeDate the consent agree date of this subject
	 */
	@Override
	public void setConsentAgreeDate(Date consentAgreeDate) {
		model.setConsentAgreeDate(consentAgreeDate);
	}

	/**
	 * Sets the create date of this subject.
	 *
	 * @param createDate the create date of this subject
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the exp group ID of this subject.
	 *
	 * @param expGroupId the exp group ID of this subject
	 */
	@Override
	public void setExpGroupId(long expGroupId) {
		model.setExpGroupId(expGroupId);
	}

	/**
	 * Sets the group ID of this subject.
	 *
	 * @param groupId the group ID of this subject
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution ID of this subject.
	 *
	 * @param institutionId the institution ID of this subject
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the modified date of this subject.
	 *
	 * @param modifiedDate the modified date of this subject
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this subject.
	 *
	 * @param name the name of this subject
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this subject.
	 *
	 * @param primaryKey the primary key of this subject
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this subject.
	 *
	 * @param projectId the project ID of this subject
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the random no of this subject.
	 *
	 * @param randomNo the random no of this subject
	 */
	@Override
	public void setRandomNo(String randomNo) {
		model.setRandomNo(randomNo);
	}

	/**
	 * Sets the serial ID of this subject.
	 *
	 * @param serialId the serial ID of this subject
	 */
	@Override
	public void setSerialId(String serialId) {
		model.setSerialId(serialId);
	}

	/**
	 * Sets the status of this subject.
	 *
	 * @param status the status of this subject
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this subject.
	 *
	 * @param statusByUserId the status by user ID of this subject
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this subject.
	 *
	 * @param statusByUserName the status by user name of this subject
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this subject.
	 *
	 * @param statusByUserUuid the status by user uuid of this subject
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this subject.
	 *
	 * @param statusDate the status date of this subject
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the subject ID of this subject.
	 *
	 * @param subjectId the subject ID of this subject
	 */
	@Override
	public void setSubjectId(long subjectId) {
		model.setSubjectId(subjectId);
	}

	/**
	 * Sets the subject status of this subject.
	 *
	 * @param subjectStatus the subject status of this subject
	 */
	@Override
	public void setSubjectStatus(int subjectStatus) {
		model.setSubjectStatus(subjectStatus);
	}

	/**
	 * Sets the subject status apply date of this subject.
	 *
	 * @param subjectStatusApplyDate the subject status apply date of this subject
	 */
	@Override
	public void setSubjectStatusApplyDate(Date subjectStatusApplyDate) {
		model.setSubjectStatusApplyDate(subjectStatusApplyDate);
	}

	/**
	 * Sets the user ID of this subject.
	 *
	 * @param userId the user ID of this subject
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this subject.
	 *
	 * @param userName the user name of this subject
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this subject.
	 *
	 * @param userUuid the user uuid of this subject
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this subject.
	 *
	 * @param uuid the uuid of this subject
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
	protected SubjectWrapper wrap(Subject subject) {
		return new SubjectWrapper(subject);
	}

}
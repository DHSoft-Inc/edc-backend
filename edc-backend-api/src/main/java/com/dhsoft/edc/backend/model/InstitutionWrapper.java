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
 * This class is a wrapper for {@link Institution}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Institution
 * @generated
 */
public class InstitutionWrapper
	extends BaseModelWrapper<Institution>
	implements Institution, ModelWrapper<Institution> {

	public InstitutionWrapper(Institution institution) {
		super(institution);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("institutionId", getInstitutionId());
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
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("enName", getEnName());
		attributes.put("type", getType());
		attributes.put("piName", getPiName());
		attributes.put("contactNum", getContactNum());
		attributes.put("email", getEmail());
		attributes.put("irbDate", getIrbDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
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

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String enName = (String)attributes.get("enName");

		if (enName != null) {
			setEnName(enName);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String piName = (String)attributes.get("piName");

		if (piName != null) {
			setPiName(piName);
		}

		String contactNum = (String)attributes.get("contactNum");

		if (contactNum != null) {
			setContactNum(contactNum);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date irbDate = (Date)attributes.get("irbDate");

		if (irbDate != null) {
			setIrbDate(irbDate);
		}
	}

	/**
	 * Returns the code of this institution.
	 *
	 * @return the code of this institution
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the company ID of this institution.
	 *
	 * @return the company ID of this institution
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact num of this institution.
	 *
	 * @return the contact num of this institution
	 */
	@Override
	public String getContactNum() {
		return model.getContactNum();
	}

	/**
	 * Returns the create date of this institution.
	 *
	 * @return the create date of this institution
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this institution.
	 *
	 * @return the email of this institution
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the en name of this institution.
	 *
	 * @return the en name of this institution
	 */
	@Override
	public String getEnName() {
		return model.getEnName();
	}

	/**
	 * Returns the group ID of this institution.
	 *
	 * @return the group ID of this institution
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution ID of this institution.
	 *
	 * @return the institution ID of this institution
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the irb date of this institution.
	 *
	 * @return the irb date of this institution
	 */
	@Override
	public Date getIrbDate() {
		return model.getIrbDate();
	}

	/**
	 * Returns the modified date of this institution.
	 *
	 * @return the modified date of this institution
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this institution.
	 *
	 * @return the name of this institution
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the pi name of this institution.
	 *
	 * @return the pi name of this institution
	 */
	@Override
	public String getPiName() {
		return model.getPiName();
	}

	/**
	 * Returns the primary key of this institution.
	 *
	 * @return the primary key of this institution
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this institution.
	 *
	 * @return the project ID of this institution
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this institution.
	 *
	 * @return the status of this institution
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this institution.
	 *
	 * @return the status by user ID of this institution
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this institution.
	 *
	 * @return the status by user name of this institution
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this institution.
	 *
	 * @return the status by user uuid of this institution
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this institution.
	 *
	 * @return the status date of this institution
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this institution was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this institution.
	 *
	 * @return the trash entry created when this institution was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this institution.
	 *
	 * @return the class primary key of the trash entry for this institution
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this institution.
	 *
	 * @return the trash handler for this institution
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the type of this institution.
	 *
	 * @return the type of this institution
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this institution.
	 *
	 * @return the user ID of this institution
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this institution.
	 *
	 * @return the user name of this institution
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this institution.
	 *
	 * @return the user uuid of this institution
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this institution.
	 *
	 * @return the uuid of this institution
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this institution is approved.
	 *
	 * @return <code>true</code> if this institution is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this institution is denied.
	 *
	 * @return <code>true</code> if this institution is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this institution is a draft.
	 *
	 * @return <code>true</code> if this institution is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this institution is expired.
	 *
	 * @return <code>true</code> if this institution is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this institution is inactive.
	 *
	 * @return <code>true</code> if this institution is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this institution is incomplete.
	 *
	 * @return <code>true</code> if this institution is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this institution is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this institution is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this institution is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this institution is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this institution is pending.
	 *
	 * @return <code>true</code> if this institution is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this institution is scheduled.
	 *
	 * @return <code>true</code> if this institution is scheduled; <code>false</code> otherwise
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
	 * Sets the code of this institution.
	 *
	 * @param code the code of this institution
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the company ID of this institution.
	 *
	 * @param companyId the company ID of this institution
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact num of this institution.
	 *
	 * @param contactNum the contact num of this institution
	 */
	@Override
	public void setContactNum(String contactNum) {
		model.setContactNum(contactNum);
	}

	/**
	 * Sets the create date of this institution.
	 *
	 * @param createDate the create date of this institution
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this institution.
	 *
	 * @param email the email of this institution
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the en name of this institution.
	 *
	 * @param enName the en name of this institution
	 */
	@Override
	public void setEnName(String enName) {
		model.setEnName(enName);
	}

	/**
	 * Sets the group ID of this institution.
	 *
	 * @param groupId the group ID of this institution
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution ID of this institution.
	 *
	 * @param institutionId the institution ID of this institution
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the irb date of this institution.
	 *
	 * @param irbDate the irb date of this institution
	 */
	@Override
	public void setIrbDate(Date irbDate) {
		model.setIrbDate(irbDate);
	}

	/**
	 * Sets the modified date of this institution.
	 *
	 * @param modifiedDate the modified date of this institution
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this institution.
	 *
	 * @param name the name of this institution
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the pi name of this institution.
	 *
	 * @param piName the pi name of this institution
	 */
	@Override
	public void setPiName(String piName) {
		model.setPiName(piName);
	}

	/**
	 * Sets the primary key of this institution.
	 *
	 * @param primaryKey the primary key of this institution
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this institution.
	 *
	 * @param projectId the project ID of this institution
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this institution.
	 *
	 * @param status the status of this institution
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this institution.
	 *
	 * @param statusByUserId the status by user ID of this institution
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this institution.
	 *
	 * @param statusByUserName the status by user name of this institution
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this institution.
	 *
	 * @param statusByUserUuid the status by user uuid of this institution
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this institution.
	 *
	 * @param statusDate the status date of this institution
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the type of this institution.
	 *
	 * @param type the type of this institution
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this institution.
	 *
	 * @param userId the user ID of this institution
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this institution.
	 *
	 * @param userName the user name of this institution
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this institution.
	 *
	 * @param userUuid the user uuid of this institution
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this institution.
	 *
	 * @param uuid the uuid of this institution
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
	protected InstitutionWrapper wrap(Institution institution) {
		return new InstitutionWrapper(institution);
	}

}
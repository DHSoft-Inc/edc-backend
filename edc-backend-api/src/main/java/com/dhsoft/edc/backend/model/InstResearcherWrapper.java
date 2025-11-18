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
 * This class is a wrapper for {@link InstResearcher}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstResearcher
 * @generated
 */
public class InstResearcherWrapper
	extends BaseModelWrapper<InstResearcher>
	implements InstResearcher, ModelWrapper<InstResearcher> {

	public InstResearcherWrapper(InstResearcher instResearcher) {
		super(instResearcher);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("institutionResearcherId", getInstitutionResearcherId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("researcherId", getResearcherId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long institutionResearcherId = (Long)attributes.get(
			"institutionResearcherId");

		if (institutionResearcherId != null) {
			setInstitutionResearcherId(institutionResearcherId);
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

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
		}

		Long researcherId = (Long)attributes.get("researcherId");

		if (researcherId != null) {
			setResearcherId(researcherId);
		}
	}

	/**
	 * Returns the company ID of this inst researcher.
	 *
	 * @return the company ID of this inst researcher
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this inst researcher.
	 *
	 * @return the create date of this inst researcher
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this inst researcher.
	 *
	 * @return the group ID of this inst researcher
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution ID of this inst researcher.
	 *
	 * @return the institution ID of this inst researcher
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the institution researcher ID of this inst researcher.
	 *
	 * @return the institution researcher ID of this inst researcher
	 */
	@Override
	public long getInstitutionResearcherId() {
		return model.getInstitutionResearcherId();
	}

	/**
	 * Returns the modified date of this inst researcher.
	 *
	 * @return the modified date of this inst researcher
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this inst researcher.
	 *
	 * @return the primary key of this inst researcher
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this inst researcher.
	 *
	 * @return the project ID of this inst researcher
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the researcher ID of this inst researcher.
	 *
	 * @return the researcher ID of this inst researcher
	 */
	@Override
	public long getResearcherId() {
		return model.getResearcherId();
	}

	/**
	 * Returns the status of this inst researcher.
	 *
	 * @return the status of this inst researcher
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the trash entry created when this inst researcher was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this inst researcher.
	 *
	 * @return the trash entry created when this inst researcher was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this inst researcher.
	 *
	 * @return the class primary key of the trash entry for this inst researcher
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this inst researcher.
	 *
	 * @return the trash handler for this inst researcher
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this inst researcher.
	 *
	 * @return the user ID of this inst researcher
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this inst researcher.
	 *
	 * @return the user name of this inst researcher
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this inst researcher.
	 *
	 * @return the user uuid of this inst researcher
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this inst researcher.
	 *
	 * @return the uuid of this inst researcher
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this inst researcher is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this inst researcher is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this inst researcher is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this inst researcher is in the Recycle Bin; <code>false</code> otherwise
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
	 * Sets the company ID of this inst researcher.
	 *
	 * @param companyId the company ID of this inst researcher
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this inst researcher.
	 *
	 * @param createDate the create date of this inst researcher
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this inst researcher.
	 *
	 * @param groupId the group ID of this inst researcher
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution ID of this inst researcher.
	 *
	 * @param institutionId the institution ID of this inst researcher
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the institution researcher ID of this inst researcher.
	 *
	 * @param institutionResearcherId the institution researcher ID of this inst researcher
	 */
	@Override
	public void setInstitutionResearcherId(long institutionResearcherId) {
		model.setInstitutionResearcherId(institutionResearcherId);
	}

	/**
	 * Sets the modified date of this inst researcher.
	 *
	 * @param modifiedDate the modified date of this inst researcher
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this inst researcher.
	 *
	 * @param primaryKey the primary key of this inst researcher
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this inst researcher.
	 *
	 * @param projectId the project ID of this inst researcher
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the researcher ID of this inst researcher.
	 *
	 * @param researcherId the researcher ID of this inst researcher
	 */
	@Override
	public void setResearcherId(long researcherId) {
		model.setResearcherId(researcherId);
	}

	/**
	 * Sets the user ID of this inst researcher.
	 *
	 * @param userId the user ID of this inst researcher
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this inst researcher.
	 *
	 * @param userName the user name of this inst researcher
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this inst researcher.
	 *
	 * @param userUuid the user uuid of this inst researcher
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this inst researcher.
	 *
	 * @param uuid the uuid of this inst researcher
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
	protected InstResearcherWrapper wrap(InstResearcher instResearcher) {
		return new InstResearcherWrapper(instResearcher);
	}

}
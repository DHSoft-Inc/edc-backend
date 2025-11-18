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
 * This class is a wrapper for {@link InstanceLink}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstanceLink
 * @generated
 */
public class InstanceLinkWrapper
	extends BaseModelWrapper<InstanceLink>
	implements InstanceLink, ModelWrapper<InstanceLink> {

	public InstanceLinkWrapper(InstanceLink instanceLink) {
		super(instanceLink);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("linkId", getLinkId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subjectId", getSubjectId());
		attributes.put("visitGroupId", getVisitGroupId());
		attributes.put("visitDefinitionId", getVisitDefinitionId());
		attributes.put("visitCRFId", getVisitCRFId());
		attributes.put("subCRFId", getSubCRFId());
		attributes.put("instanceId", getInstanceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long linkId = (Long)attributes.get("linkId");

		if (linkId != null) {
			setLinkId(linkId);
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

		Long subjectId = (Long)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		Long visitGroupId = (Long)attributes.get("visitGroupId");

		if (visitGroupId != null) {
			setVisitGroupId(visitGroupId);
		}

		Long visitDefinitionId = (Long)attributes.get("visitDefinitionId");

		if (visitDefinitionId != null) {
			setVisitDefinitionId(visitDefinitionId);
		}

		Long visitCRFId = (Long)attributes.get("visitCRFId");

		if (visitCRFId != null) {
			setVisitCRFId(visitCRFId);
		}

		Long subCRFId = (Long)attributes.get("subCRFId");

		if (subCRFId != null) {
			setSubCRFId(subCRFId);
		}

		Long instanceId = (Long)attributes.get("instanceId");

		if (instanceId != null) {
			setInstanceId(instanceId);
		}
	}

	/**
	 * Returns the company ID of this instance link.
	 *
	 * @return the company ID of this instance link
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this instance link.
	 *
	 * @return the create date of this instance link
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this instance link.
	 *
	 * @return the group ID of this instance link
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the instance ID of this instance link.
	 *
	 * @return the instance ID of this instance link
	 */
	@Override
	public long getInstanceId() {
		return model.getInstanceId();
	}

	/**
	 * Returns the institution ID of this instance link.
	 *
	 * @return the institution ID of this instance link
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the link ID of this instance link.
	 *
	 * @return the link ID of this instance link
	 */
	@Override
	public long getLinkId() {
		return model.getLinkId();
	}

	/**
	 * Returns the modified date of this instance link.
	 *
	 * @return the modified date of this instance link
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this instance link.
	 *
	 * @return the primary key of this instance link
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this instance link.
	 *
	 * @return the project ID of this instance link
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this instance link.
	 *
	 * @return the status of this instance link
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the sub crf ID of this instance link.
	 *
	 * @return the sub crf ID of this instance link
	 */
	@Override
	public long getSubCRFId() {
		return model.getSubCRFId();
	}

	/**
	 * Returns the subject ID of this instance link.
	 *
	 * @return the subject ID of this instance link
	 */
	@Override
	public long getSubjectId() {
		return model.getSubjectId();
	}

	/**
	 * Returns the trash entry created when this instance link was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this instance link.
	 *
	 * @return the trash entry created when this instance link was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this instance link.
	 *
	 * @return the class primary key of the trash entry for this instance link
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this instance link.
	 *
	 * @return the trash handler for this instance link
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this instance link.
	 *
	 * @return the user ID of this instance link
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this instance link.
	 *
	 * @return the user name of this instance link
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this instance link.
	 *
	 * @return the user uuid of this instance link
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this instance link.
	 *
	 * @return the uuid of this instance link
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the visit crf ID of this instance link.
	 *
	 * @return the visit crf ID of this instance link
	 */
	@Override
	public long getVisitCRFId() {
		return model.getVisitCRFId();
	}

	/**
	 * Returns the visit definition ID of this instance link.
	 *
	 * @return the visit definition ID of this instance link
	 */
	@Override
	public long getVisitDefinitionId() {
		return model.getVisitDefinitionId();
	}

	/**
	 * Returns the visit group ID of this instance link.
	 *
	 * @return the visit group ID of this instance link
	 */
	@Override
	public long getVisitGroupId() {
		return model.getVisitGroupId();
	}

	/**
	 * Returns <code>true</code> if this instance link is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this instance link is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this instance link is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this instance link is in the Recycle Bin; <code>false</code> otherwise
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
	 * Sets the company ID of this instance link.
	 *
	 * @param companyId the company ID of this instance link
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this instance link.
	 *
	 * @param createDate the create date of this instance link
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this instance link.
	 *
	 * @param groupId the group ID of this instance link
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the instance ID of this instance link.
	 *
	 * @param instanceId the instance ID of this instance link
	 */
	@Override
	public void setInstanceId(long instanceId) {
		model.setInstanceId(instanceId);
	}

	/**
	 * Sets the institution ID of this instance link.
	 *
	 * @param institutionId the institution ID of this instance link
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the link ID of this instance link.
	 *
	 * @param linkId the link ID of this instance link
	 */
	@Override
	public void setLinkId(long linkId) {
		model.setLinkId(linkId);
	}

	/**
	 * Sets the modified date of this instance link.
	 *
	 * @param modifiedDate the modified date of this instance link
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this instance link.
	 *
	 * @param primaryKey the primary key of this instance link
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this instance link.
	 *
	 * @param projectId the project ID of this instance link
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the sub crf ID of this instance link.
	 *
	 * @param subCRFId the sub crf ID of this instance link
	 */
	@Override
	public void setSubCRFId(long subCRFId) {
		model.setSubCRFId(subCRFId);
	}

	/**
	 * Sets the subject ID of this instance link.
	 *
	 * @param subjectId the subject ID of this instance link
	 */
	@Override
	public void setSubjectId(long subjectId) {
		model.setSubjectId(subjectId);
	}

	/**
	 * Sets the user ID of this instance link.
	 *
	 * @param userId the user ID of this instance link
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this instance link.
	 *
	 * @param userName the user name of this instance link
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this instance link.
	 *
	 * @param userUuid the user uuid of this instance link
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this instance link.
	 *
	 * @param uuid the uuid of this instance link
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the visit crf ID of this instance link.
	 *
	 * @param visitCRFId the visit crf ID of this instance link
	 */
	@Override
	public void setVisitCRFId(long visitCRFId) {
		model.setVisitCRFId(visitCRFId);
	}

	/**
	 * Sets the visit definition ID of this instance link.
	 *
	 * @param visitDefinitionId the visit definition ID of this instance link
	 */
	@Override
	public void setVisitDefinitionId(long visitDefinitionId) {
		model.setVisitDefinitionId(visitDefinitionId);
	}

	/**
	 * Sets the visit group ID of this instance link.
	 *
	 * @param visitGroupId the visit group ID of this instance link
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
	protected InstanceLinkWrapper wrap(InstanceLink instanceLink) {
		return new InstanceLinkWrapper(instanceLink);
	}

}
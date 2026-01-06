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
 * This class is a wrapper for {@link AssignProjectScope}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScope
 * @generated
 */
public class AssignProjectScopeWrapper
	extends BaseModelWrapper<AssignProjectScope>
	implements AssignProjectScope, ModelWrapper<AssignProjectScope> {

	public AssignProjectScopeWrapper(AssignProjectScope assignProjectScope) {
		super(assignProjectScope);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projectScopeId", getProjectScopeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("researcherId", getResearcherId());
		attributes.put("projectId", getProjectId());
		attributes.put("targetUserId", getTargetUserId());
		attributes.put("scopeRole", getScopeRole());
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

		Long projectScopeId = (Long)attributes.get("projectScopeId");

		if (projectScopeId != null) {
			setProjectScopeId(projectScopeId);
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

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Long targetUserId = (Long)attributes.get("targetUserId");

		if (targetUserId != null) {
			setTargetUserId(targetUserId);
		}

		String scopeRole = (String)attributes.get("scopeRole");

		if (scopeRole != null) {
			setScopeRole(scopeRole);
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
	 * Returns the active of this assign project scope.
	 *
	 * @return the active of this assign project scope
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this assign project scope.
	 *
	 * @return the company ID of this assign project scope
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this assign project scope.
	 *
	 * @return the create date of this assign project scope
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this assign project scope.
	 *
	 * @return the created by of this assign project scope
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the group ID of this assign project scope.
	 *
	 * @return the group ID of this assign project scope
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the institution ID of this assign project scope.
	 *
	 * @return the institution ID of this assign project scope
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the modified by of this assign project scope.
	 *
	 * @return the modified by of this assign project scope
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this assign project scope.
	 *
	 * @return the modified date of this assign project scope
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this assign project scope.
	 *
	 * @return the primary key of this assign project scope
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this assign project scope.
	 *
	 * @return the project ID of this assign project scope
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the project scope ID of this assign project scope.
	 *
	 * @return the project scope ID of this assign project scope
	 */
	@Override
	public long getProjectScopeId() {
		return model.getProjectScopeId();
	}

	/**
	 * Returns the researcher ID of this assign project scope.
	 *
	 * @return the researcher ID of this assign project scope
	 */
	@Override
	public long getResearcherId() {
		return model.getResearcherId();
	}

	/**
	 * Returns the scope role of this assign project scope.
	 *
	 * @return the scope role of this assign project scope
	 */
	@Override
	public String getScopeRole() {
		return model.getScopeRole();
	}

	/**
	 * Returns the target user ID of this assign project scope.
	 *
	 * @return the target user ID of this assign project scope
	 */
	@Override
	public long getTargetUserId() {
		return model.getTargetUserId();
	}

	/**
	 * Returns the target user uuid of this assign project scope.
	 *
	 * @return the target user uuid of this assign project scope
	 */
	@Override
	public String getTargetUserUuid() {
		return model.getTargetUserUuid();
	}

	/**
	 * Returns the uuid of this assign project scope.
	 *
	 * @return the uuid of this assign project scope
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this assign project scope is active.
	 *
	 * @return <code>true</code> if this assign project scope is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this assign project scope is active.
	 *
	 * @param active the active of this assign project scope
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this assign project scope.
	 *
	 * @param companyId the company ID of this assign project scope
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this assign project scope.
	 *
	 * @param createDate the create date of this assign project scope
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this assign project scope.
	 *
	 * @param createdBy the created by of this assign project scope
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the group ID of this assign project scope.
	 *
	 * @param groupId the group ID of this assign project scope
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the institution ID of this assign project scope.
	 *
	 * @param institutionId the institution ID of this assign project scope
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the modified by of this assign project scope.
	 *
	 * @param modifiedBy the modified by of this assign project scope
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this assign project scope.
	 *
	 * @param modifiedDate the modified date of this assign project scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this assign project scope.
	 *
	 * @param primaryKey the primary key of this assign project scope
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this assign project scope.
	 *
	 * @param projectId the project ID of this assign project scope
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the project scope ID of this assign project scope.
	 *
	 * @param projectScopeId the project scope ID of this assign project scope
	 */
	@Override
	public void setProjectScopeId(long projectScopeId) {
		model.setProjectScopeId(projectScopeId);
	}

	/**
	 * Sets the researcher ID of this assign project scope.
	 *
	 * @param researcherId the researcher ID of this assign project scope
	 */
	@Override
	public void setResearcherId(long researcherId) {
		model.setResearcherId(researcherId);
	}

	/**
	 * Sets the scope role of this assign project scope.
	 *
	 * @param scopeRole the scope role of this assign project scope
	 */
	@Override
	public void setScopeRole(String scopeRole) {
		model.setScopeRole(scopeRole);
	}

	/**
	 * Sets the target user ID of this assign project scope.
	 *
	 * @param targetUserId the target user ID of this assign project scope
	 */
	@Override
	public void setTargetUserId(long targetUserId) {
		model.setTargetUserId(targetUserId);
	}

	/**
	 * Sets the target user uuid of this assign project scope.
	 *
	 * @param targetUserUuid the target user uuid of this assign project scope
	 */
	@Override
	public void setTargetUserUuid(String targetUserUuid) {
		model.setTargetUserUuid(targetUserUuid);
	}

	/**
	 * Sets the uuid of this assign project scope.
	 *
	 * @param uuid the uuid of this assign project scope
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
	protected AssignProjectScopeWrapper wrap(
		AssignProjectScope assignProjectScope) {

		return new AssignProjectScopeWrapper(assignProjectScope);
	}

}
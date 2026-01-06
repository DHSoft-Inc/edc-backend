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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssignProjectScopeSoap implements Serializable {

	public static AssignProjectScopeSoap toSoapModel(AssignProjectScope model) {
		AssignProjectScopeSoap soapModel = new AssignProjectScopeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProjectScopeId(model.getProjectScopeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setResearcherId(model.getResearcherId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setTargetUserId(model.getTargetUserId());
		soapModel.setScopeRole(model.getScopeRole());
		soapModel.setActive(model.isActive());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static AssignProjectScopeSoap[] toSoapModels(
		AssignProjectScope[] models) {

		AssignProjectScopeSoap[] soapModels =
			new AssignProjectScopeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssignProjectScopeSoap[][] toSoapModels(
		AssignProjectScope[][] models) {

		AssignProjectScopeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new AssignProjectScopeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssignProjectScopeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssignProjectScopeSoap[] toSoapModels(
		List<AssignProjectScope> models) {

		List<AssignProjectScopeSoap> soapModels =
			new ArrayList<AssignProjectScopeSoap>(models.size());

		for (AssignProjectScope model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new AssignProjectScopeSoap[soapModels.size()]);
	}

	public AssignProjectScopeSoap() {
	}

	public long getPrimaryKey() {
		return _projectScopeId;
	}

	public void setPrimaryKey(long pk) {
		setProjectScopeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProjectScopeId() {
		return _projectScopeId;
	}

	public void setProjectScopeId(long projectScopeId) {
		_projectScopeId = projectScopeId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getInstitutionId() {
		return _institutionId;
	}

	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;
	}

	public long getResearcherId() {
		return _researcherId;
	}

	public void setResearcherId(long researcherId) {
		_researcherId = researcherId;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public long getTargetUserId() {
		return _targetUserId;
	}

	public void setTargetUserId(long targetUserId) {
		_targetUserId = targetUserId;
	}

	public String getScopeRole() {
		return _scopeRole;
	}

	public void setScopeRole(String scopeRole) {
		_scopeRole = scopeRole;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private String _uuid;
	private long _projectScopeId;
	private long _companyId;
	private long _groupId;
	private long _institutionId;
	private long _researcherId;
	private long _projectId;
	private long _targetUserId;
	private String _scopeRole;
	private boolean _active;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createdBy;
	private long _modifiedBy;

}
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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.EdcPermissionScopeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionScopeSoap implements Serializable {

	public static EdcPermissionScopeSoap toSoapModel(EdcPermissionScope model) {
		EdcPermissionScopeSoap soapModel = new EdcPermissionScopeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPermissionScopeId(model.getPermissionScopeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setModuleName(model.getModuleName());
		soapModel.setTaskKey(model.getTaskKey());
		soapModel.setRoleName(model.getRoleName());
		soapModel.setScopeRole(model.getScopeRole());
		soapModel.setActive(model.isActive());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EdcPermissionScopeSoap[] toSoapModels(
		EdcPermissionScope[] models) {

		EdcPermissionScopeSoap[] soapModels =
			new EdcPermissionScopeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionScopeSoap[][] toSoapModels(
		EdcPermissionScope[][] models) {

		EdcPermissionScopeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new EdcPermissionScopeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EdcPermissionScopeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionScopeSoap[] toSoapModels(
		List<EdcPermissionScope> models) {

		List<EdcPermissionScopeSoap> soapModels =
			new ArrayList<EdcPermissionScopeSoap>(models.size());

		for (EdcPermissionScope model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new EdcPermissionScopeSoap[soapModels.size()]);
	}

	public EdcPermissionScopeSoap() {
	}

	public long getPrimaryKey() {
		return _permissionScopeId;
	}

	public void setPrimaryKey(long pk) {
		setPermissionScopeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPermissionScopeId() {
		return _permissionScopeId;
	}

	public void setPermissionScopeId(long permissionScopeId) {
		_permissionScopeId = permissionScopeId;
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

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getModuleName() {
		return _moduleName;
	}

	public void setModuleName(String moduleName) {
		_moduleName = moduleName;
	}

	public String getTaskKey() {
		return _taskKey;
	}

	public void setTaskKey(String taskKey) {
		_taskKey = taskKey;
	}

	public String getRoleName() {
		return _roleName;
	}

	public void setRoleName(String roleName) {
		_roleName = roleName;
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

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;
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
	private long _permissionScopeId;
	private long _companyId;
	private long _groupId;
	private long _projectId;
	private String _moduleName;
	private String _taskKey;
	private String _roleName;
	private String _scopeRole;
	private boolean _active;
	private Date _fromDate;
	private Date _toDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createdBy;
	private long _modifiedBy;

}
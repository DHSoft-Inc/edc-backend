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
public class EdcPermissionScopeAuditSoap implements Serializable {

	public static EdcPermissionScopeAuditSoap toSoapModel(
		EdcPermissionScopeAudit model) {

		EdcPermissionScopeAuditSoap soapModel =
			new EdcPermissionScopeAuditSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAuditScopeId(model.getAuditScopeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setRoleName(model.getRoleName());
		soapModel.setModuleName(model.getModuleName());
		soapModel.setTaskKey(model.getTaskKey());
		soapModel.setFromScope(model.getFromScope());
		soapModel.setToScope(model.getToScope());
		soapModel.setFromActive(model.getFromActive());
		soapModel.setToActive(model.getToActive());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());

		return soapModel;
	}

	public static EdcPermissionScopeAuditSoap[] toSoapModels(
		EdcPermissionScopeAudit[] models) {

		EdcPermissionScopeAuditSoap[] soapModels =
			new EdcPermissionScopeAuditSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionScopeAuditSoap[][] toSoapModels(
		EdcPermissionScopeAudit[][] models) {

		EdcPermissionScopeAuditSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new EdcPermissionScopeAuditSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new EdcPermissionScopeAuditSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionScopeAuditSoap[] toSoapModels(
		List<EdcPermissionScopeAudit> models) {

		List<EdcPermissionScopeAuditSoap> soapModels =
			new ArrayList<EdcPermissionScopeAuditSoap>(models.size());

		for (EdcPermissionScopeAudit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new EdcPermissionScopeAuditSoap[soapModels.size()]);
	}

	public EdcPermissionScopeAuditSoap() {
	}

	public long getPrimaryKey() {
		return _auditScopeId;
	}

	public void setPrimaryKey(long pk) {
		setAuditScopeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAuditScopeId() {
		return _auditScopeId;
	}

	public void setAuditScopeId(long auditScopeId) {
		_auditScopeId = auditScopeId;
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

	public String getRoleName() {
		return _roleName;
	}

	public void setRoleName(String roleName) {
		_roleName = roleName;
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

	public String getFromScope() {
		return _fromScope;
	}

	public void setFromScope(String fromScope) {
		_fromScope = fromScope;
	}

	public String getToScope() {
		return _toScope;
	}

	public void setToScope(String toScope) {
		_toScope = toScope;
	}

	public String getFromActive() {
		return _fromActive;
	}

	public void setFromActive(String fromActive) {
		_fromActive = fromActive;
	}

	public String getToActive() {
		return _toActive;
	}

	public void setToActive(String toActive) {
		_toActive = toActive;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	private String _uuid;
	private long _auditScopeId;
	private long _companyId;
	private long _groupId;
	private long _projectId;
	private String _roleName;
	private String _moduleName;
	private String _taskKey;
	private String _fromScope;
	private String _toScope;
	private String _fromActive;
	private String _toActive;
	private String _remarks;
	private Date _createDate;
	private long _userId;
	private String _userName;

}
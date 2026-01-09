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
public class EdcPermissionRoleAuditSoap implements Serializable {

	public static EdcPermissionRoleAuditSoap toSoapModel(
		EdcPermissionRoleAudit model) {

		EdcPermissionRoleAuditSoap soapModel = new EdcPermissionRoleAuditSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAuditRoleId(model.getAuditRoleId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setActorGroup(model.getActorGroup());
		soapModel.setActorId(model.getActorId());
		soapModel.setCrudType(model.getCrudType());
		soapModel.setFromRole(model.getFromRole());
		soapModel.setToRole(model.getToRole());
		soapModel.setFromActive(model.getFromActive());
		soapModel.setToActive(model.getToActive());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());

		return soapModel;
	}

	public static EdcPermissionRoleAuditSoap[] toSoapModels(
		EdcPermissionRoleAudit[] models) {

		EdcPermissionRoleAuditSoap[] soapModels =
			new EdcPermissionRoleAuditSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionRoleAuditSoap[][] toSoapModels(
		EdcPermissionRoleAudit[][] models) {

		EdcPermissionRoleAuditSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new EdcPermissionRoleAuditSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EdcPermissionRoleAuditSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionRoleAuditSoap[] toSoapModels(
		List<EdcPermissionRoleAudit> models) {

		List<EdcPermissionRoleAuditSoap> soapModels =
			new ArrayList<EdcPermissionRoleAuditSoap>(models.size());

		for (EdcPermissionRoleAudit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new EdcPermissionRoleAuditSoap[soapModels.size()]);
	}

	public EdcPermissionRoleAuditSoap() {
	}

	public long getPrimaryKey() {
		return _auditRoleId;
	}

	public void setPrimaryKey(long pk) {
		setAuditRoleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAuditRoleId() {
		return _auditRoleId;
	}

	public void setAuditRoleId(long auditRoleId) {
		_auditRoleId = auditRoleId;
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

	public long getActorGroup() {
		return _actorGroup;
	}

	public void setActorGroup(long actorGroup) {
		_actorGroup = actorGroup;
	}

	public long getActorId() {
		return _actorId;
	}

	public void setActorId(long actorId) {
		_actorId = actorId;
	}

	public String getCrudType() {
		return _crudType;
	}

	public void setCrudType(String crudType) {
		_crudType = crudType;
	}

	public String getFromRole() {
		return _fromRole;
	}

	public void setFromRole(String fromRole) {
		_fromRole = fromRole;
	}

	public String getToRole() {
		return _toRole;
	}

	public void setToRole(String toRole) {
		_toRole = toRole;
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
	private long _auditRoleId;
	private long _companyId;
	private long _groupId;
	private long _projectId;
	private long _actorGroup;
	private long _actorId;
	private String _crudType;
	private String _fromRole;
	private String _toRole;
	private String _fromActive;
	private String _toActive;
	private String _remarks;
	private Date _createDate;
	private long _userId;
	private String _userName;

}
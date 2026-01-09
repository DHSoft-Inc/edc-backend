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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.EdcPermissionRoleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionRoleSoap implements Serializable {

	public static EdcPermissionRoleSoap toSoapModel(EdcPermissionRole model) {
		EdcPermissionRoleSoap soapModel = new EdcPermissionRoleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPermissionRoleId(model.getPermissionRoleId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setActorGroup(model.getActorGroup());
		soapModel.setActorId(model.getActorId());
		soapModel.setRoleName(model.getRoleName());
		soapModel.setActive(model.isActive());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static EdcPermissionRoleSoap[] toSoapModels(
		EdcPermissionRole[] models) {

		EdcPermissionRoleSoap[] soapModels =
			new EdcPermissionRoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionRoleSoap[][] toSoapModels(
		EdcPermissionRole[][] models) {

		EdcPermissionRoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new EdcPermissionRoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EdcPermissionRoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdcPermissionRoleSoap[] toSoapModels(
		List<EdcPermissionRole> models) {

		List<EdcPermissionRoleSoap> soapModels =
			new ArrayList<EdcPermissionRoleSoap>(models.size());

		for (EdcPermissionRole model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EdcPermissionRoleSoap[soapModels.size()]);
	}

	public EdcPermissionRoleSoap() {
	}

	public long getPrimaryKey() {
		return _permissionRoleId;
	}

	public void setPrimaryKey(long pk) {
		setPermissionRoleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPermissionRoleId() {
		return _permissionRoleId;
	}

	public void setPermissionRoleId(long permissionRoleId) {
		_permissionRoleId = permissionRoleId;
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

	public String getRoleName() {
		return _roleName;
	}

	public void setRoleName(String roleName) {
		_roleName = roleName;
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
	private long _permissionRoleId;
	private long _companyId;
	private long _groupId;
	private long _projectId;
	private long _actorGroup;
	private long _actorId;
	private String _roleName;
	private boolean _active;
	private Date _fromDate;
	private Date _toDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createdBy;
	private long _modifiedBy;

}
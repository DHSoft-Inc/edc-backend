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
public class EdcLockSoap implements Serializable {

	public static EdcLockSoap toSoapModel(EdcLock model) {
		EdcLockSoap soapModel = new EdcLockSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLockId(model.getLockId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setLockType(model.getLockType());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setComment(model.getComment());

		return soapModel;
	}

	public static EdcLockSoap[] toSoapModels(EdcLock[] models) {
		EdcLockSoap[] soapModels = new EdcLockSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdcLockSoap[][] toSoapModels(EdcLock[][] models) {
		EdcLockSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EdcLockSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EdcLockSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdcLockSoap[] toSoapModels(List<EdcLock> models) {
		List<EdcLockSoap> soapModels = new ArrayList<EdcLockSoap>(
			models.size());

		for (EdcLock model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EdcLockSoap[soapModels.size()]);
	}

	public EdcLockSoap() {
	}

	public long getPrimaryKey() {
		return _lockId;
	}

	public void setPrimaryKey(long pk) {
		setLockId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLockId() {
		return _lockId;
	}

	public void setLockId(long lockId) {
		_lockId = lockId;
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

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public String getLockType() {
		return _lockType;
	}

	public void setLockType(String lockType) {
		_lockType = lockType;
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

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	private String _uuid;
	private long _lockId;
	private long _companyId;
	private long _groupId;
	private long _projectId;
	private long _classNameId;
	private long _classPK;
	private String _lockType;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _comment;

}
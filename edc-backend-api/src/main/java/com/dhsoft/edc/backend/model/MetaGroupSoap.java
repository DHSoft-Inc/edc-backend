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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.MetaGroupServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MetaGroupSoap implements Serializable {

	public static MetaGroupSoap toSoapModel(MetaGroup model) {
		MetaGroupSoap soapModel = new MetaGroupSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setMetaGroupId(model.getMetaGroupId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setGroupCode(model.getGroupCode());
		soapModel.setGroupName(model.getGroupName());
		soapModel.setType(model.getType());
		soapModel.setActive(model.getActive());
		soapModel.setInactiveDate(model.getInactiveDate());

		return soapModel;
	}

	public static MetaGroupSoap[] toSoapModels(MetaGroup[] models) {
		MetaGroupSoap[] soapModels = new MetaGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MetaGroupSoap[][] toSoapModels(MetaGroup[][] models) {
		MetaGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MetaGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MetaGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MetaGroupSoap[] toSoapModels(List<MetaGroup> models) {
		List<MetaGroupSoap> soapModels = new ArrayList<MetaGroupSoap>(
			models.size());

		for (MetaGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MetaGroupSoap[soapModels.size()]);
	}

	public MetaGroupSoap() {
	}

	public long getPrimaryKey() {
		return _metaGroupId;
	}

	public void setPrimaryKey(long pk) {
		setMetaGroupId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMetaGroupId() {
		return _metaGroupId;
	}

	public void setMetaGroupId(long metaGroupId) {
		_metaGroupId = metaGroupId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
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

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getGroupCode() {
		return _groupCode;
	}

	public void setGroupCode(String groupCode) {
		_groupCode = groupCode;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public Boolean getActive() {
		return _active;
	}

	public void setActive(Boolean active) {
		_active = active;
	}

	public Date getInactiveDate() {
		return _inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		_inactiveDate = inactiveDate;
	}

	private String _uuid;
	private long _metaGroupId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _groupCode;
	private String _groupName;
	private String _type;
	private Boolean _active;
	private Date _inactiveDate;

}
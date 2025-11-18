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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.VisitGroupServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitGroupSoap implements Serializable {

	public static VisitGroupSoap toSoapModel(VisitGroup model) {
		VisitGroupSoap soapModel = new VisitGroupSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVisitGroupId(model.getVisitGroupId());
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
		soapModel.setExpGroupId(model.getExpGroupId());
		soapModel.setVisitGroupCode(model.getVisitGroupCode());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setActiveStatus(model.getActiveStatus());
		soapModel.setActiveDate(model.getActiveDate());

		return soapModel;
	}

	public static VisitGroupSoap[] toSoapModels(VisitGroup[] models) {
		VisitGroupSoap[] soapModels = new VisitGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VisitGroupSoap[][] toSoapModels(VisitGroup[][] models) {
		VisitGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VisitGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VisitGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VisitGroupSoap[] toSoapModels(List<VisitGroup> models) {
		List<VisitGroupSoap> soapModels = new ArrayList<VisitGroupSoap>(
			models.size());

		for (VisitGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VisitGroupSoap[soapModels.size()]);
	}

	public VisitGroupSoap() {
	}

	public long getPrimaryKey() {
		return _visitGroupId;
	}

	public void setPrimaryKey(long pk) {
		setVisitGroupId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVisitGroupId() {
		return _visitGroupId;
	}

	public void setVisitGroupId(long visitGroupId) {
		_visitGroupId = visitGroupId;
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

	public long getExpGroupId() {
		return _expGroupId;
	}

	public void setExpGroupId(long expGroupId) {
		_expGroupId = expGroupId;
	}

	public String getVisitGroupCode() {
		return _visitGroupCode;
	}

	public void setVisitGroupCode(String visitGroupCode) {
		_visitGroupCode = visitGroupCode;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public int getActiveStatus() {
		return _activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		_activeStatus = activeStatus;
	}

	public Date getActiveDate() {
		return _activeDate;
	}

	public void setActiveDate(Date activeDate) {
		_activeDate = activeDate;
	}

	private String _uuid;
	private long _visitGroupId;
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
	private long _expGroupId;
	private String _visitGroupCode;
	private String _name;
	private String _description;
	private int _activeStatus;
	private Date _activeDate;

}
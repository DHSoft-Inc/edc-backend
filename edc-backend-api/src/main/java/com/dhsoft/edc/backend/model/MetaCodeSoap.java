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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.MetaCodeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MetaCodeSoap implements Serializable {

	public static MetaCodeSoap toSoapModel(MetaCode model) {
		MetaCodeSoap soapModel = new MetaCodeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setMetaCodeId(model.getMetaCodeId());
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
		soapModel.setCode(model.getCode());
		soapModel.setLabel(model.getLabel());
		soapModel.setValueType(model.getValueType());
		soapModel.setValue(model.getValue());
		soapModel.setActive(model.getActive());
		soapModel.setInactiveDate(model.getInactiveDate());

		return soapModel;
	}

	public static MetaCodeSoap[] toSoapModels(MetaCode[] models) {
		MetaCodeSoap[] soapModels = new MetaCodeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MetaCodeSoap[][] toSoapModels(MetaCode[][] models) {
		MetaCodeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MetaCodeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MetaCodeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MetaCodeSoap[] toSoapModels(List<MetaCode> models) {
		List<MetaCodeSoap> soapModels = new ArrayList<MetaCodeSoap>(
			models.size());

		for (MetaCode model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MetaCodeSoap[soapModels.size()]);
	}

	public MetaCodeSoap() {
	}

	public long getPrimaryKey() {
		return _metaCodeId;
	}

	public void setPrimaryKey(long pk) {
		setMetaCodeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMetaCodeId() {
		return _metaCodeId;
	}

	public void setMetaCodeId(long metaCodeId) {
		_metaCodeId = metaCodeId;
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getLabel() {
		return _label;
	}

	public void setLabel(String label) {
		_label = label;
	}

	public String getValueType() {
		return _valueType;
	}

	public void setValueType(String valueType) {
		_valueType = valueType;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
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
	private long _metaCodeId;
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
	private String _code;
	private String _label;
	private String _valueType;
	private String _value;
	private Boolean _active;
	private Date _inactiveDate;

}
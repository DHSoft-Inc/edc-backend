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
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());
		soapModel.setGroup(model.getGroup());
		soapModel.setCode(model.getCode());
		soapModel.setLabel(model.getLabel());
		soapModel.setValueType(model.getValueType());
		soapModel.setValue(model.getValue());
		soapModel.setIsActive(model.getIsActive());
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getGroup() {
		return _group;
	}

	public void setGroup(String group) {
		_group = group;
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

	public String getIsActive() {
		return _isActive;
	}

	public void setIsActive(String isActive) {
		_isActive = isActive;
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
	private String _name;
	private String _type;
	private String _group;
	private String _code;
	private String _label;
	private String _valueType;
	private String _value;
	private String _isActive;
	private Date _inactiveDate;

}
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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.InstitutionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstitutionSoap implements Serializable {

	public static InstitutionSoap toSoapModel(Institution model) {
		InstitutionSoap soapModel = new InstitutionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInstitutionId(model.getInstitutionId());
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
		soapModel.setCode(model.getCode());
		soapModel.setName(model.getName());
		soapModel.setEnName(model.getEnName());
		soapModel.setType(model.getType());
		soapModel.setPiName(model.getPiName());
		soapModel.setContactNum(model.getContactNum());
		soapModel.setEmail(model.getEmail());
		soapModel.setIrbDate(model.getIrbDate());

		return soapModel;
	}

	public static InstitutionSoap[] toSoapModels(Institution[] models) {
		InstitutionSoap[] soapModels = new InstitutionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstitutionSoap[][] toSoapModels(Institution[][] models) {
		InstitutionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstitutionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstitutionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstitutionSoap[] toSoapModels(List<Institution> models) {
		List<InstitutionSoap> soapModels = new ArrayList<InstitutionSoap>(
			models.size());

		for (Institution model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstitutionSoap[soapModels.size()]);
	}

	public InstitutionSoap() {
	}

	public long getPrimaryKey() {
		return _institutionId;
	}

	public void setPrimaryKey(long pk) {
		setInstitutionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getInstitutionId() {
		return _institutionId;
	}

	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEnName() {
		return _enName;
	}

	public void setEnName(String enName) {
		_enName = enName;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getPiName() {
		return _piName;
	}

	public void setPiName(String piName) {
		_piName = piName;
	}

	public String getContactNum() {
		return _contactNum;
	}

	public void setContactNum(String contactNum) {
		_contactNum = contactNum;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getIrbDate() {
		return _irbDate;
	}

	public void setIrbDate(Date irbDate) {
		_irbDate = irbDate;
	}

	private String _uuid;
	private long _institutionId;
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
	private String _code;
	private String _name;
	private String _enName;
	private int _type;
	private String _piName;
	private String _contactNum;
	private String _email;
	private Date _irbDate;

}
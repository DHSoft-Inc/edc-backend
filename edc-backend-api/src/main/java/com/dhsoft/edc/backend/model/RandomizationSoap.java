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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.RandomizationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RandomizationSoap implements Serializable {

	public static RandomizationSoap toSoapModel(Randomization model) {
		RandomizationSoap soapModel = new RandomizationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRandomizationId(model.getRandomizationId());
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
		soapModel.setRandomNo(model.getRandomNo());
		soapModel.setUseStatus(model.getUseStatus());
		soapModel.setSourceType(model.getSourceType());
		soapModel.setCriteria(model.getCriteria());
		soapModel.setExpGroupId(model.getExpGroupId());

		return soapModel;
	}

	public static RandomizationSoap[] toSoapModels(Randomization[] models) {
		RandomizationSoap[] soapModels = new RandomizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RandomizationSoap[][] toSoapModels(Randomization[][] models) {
		RandomizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RandomizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RandomizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RandomizationSoap[] toSoapModels(List<Randomization> models) {
		List<RandomizationSoap> soapModels = new ArrayList<RandomizationSoap>(
			models.size());

		for (Randomization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RandomizationSoap[soapModels.size()]);
	}

	public RandomizationSoap() {
	}

	public long getPrimaryKey() {
		return _randomizationId;
	}

	public void setPrimaryKey(long pk) {
		setRandomizationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRandomizationId() {
		return _randomizationId;
	}

	public void setRandomizationId(long randomizationId) {
		_randomizationId = randomizationId;
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

	public String getRandomNo() {
		return _randomNo;
	}

	public void setRandomNo(String randomNo) {
		_randomNo = randomNo;
	}

	public int getUseStatus() {
		return _useStatus;
	}

	public void setUseStatus(int useStatus) {
		_useStatus = useStatus;
	}

	public int getSourceType() {
		return _sourceType;
	}

	public void setSourceType(int sourceType) {
		_sourceType = sourceType;
	}

	public String getCriteria() {
		return _criteria;
	}

	public void setCriteria(String criteria) {
		_criteria = criteria;
	}

	public long getExpGroupId() {
		return _expGroupId;
	}

	public void setExpGroupId(long expGroupId) {
		_expGroupId = expGroupId;
	}

	private String _uuid;
	private long _randomizationId;
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
	private String _randomNo;
	private int _useStatus;
	private int _sourceType;
	private String _criteria;
	private long _expGroupId;

}
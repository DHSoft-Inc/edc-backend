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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.VisitDefinitionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitDefinitionSoap implements Serializable {

	public static VisitDefinitionSoap toSoapModel(VisitDefinition model) {
		VisitDefinitionSoap soapModel = new VisitDefinitionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVisitDefinitionId(model.getVisitDefinitionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setVisitGroupId(model.getVisitGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setVisitDefinitionCode(model.getVisitDefinitionCode());
		soapModel.setName(model.getName());
		soapModel.setOrder(model.getOrder());
		soapModel.setAnchorType(model.getAnchorType());
		soapModel.setOffset(model.getOffset());
		soapModel.setWindowMinus(model.getWindowMinus());
		soapModel.setWindowPlus(model.getWindowPlus());
		soapModel.setType(model.getType());
		soapModel.setRepeatCount(model.getRepeatCount());
		soapModel.setVisitCRFId(model.getVisitCRFId());

		return soapModel;
	}

	public static VisitDefinitionSoap[] toSoapModels(VisitDefinition[] models) {
		VisitDefinitionSoap[] soapModels =
			new VisitDefinitionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VisitDefinitionSoap[][] toSoapModels(
		VisitDefinition[][] models) {

		VisitDefinitionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new VisitDefinitionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VisitDefinitionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VisitDefinitionSoap[] toSoapModels(
		List<VisitDefinition> models) {

		List<VisitDefinitionSoap> soapModels =
			new ArrayList<VisitDefinitionSoap>(models.size());

		for (VisitDefinition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VisitDefinitionSoap[soapModels.size()]);
	}

	public VisitDefinitionSoap() {
	}

	public long getPrimaryKey() {
		return _visitDefinitionId;
	}

	public void setPrimaryKey(long pk) {
		setVisitDefinitionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVisitDefinitionId() {
		return _visitDefinitionId;
	}

	public void setVisitDefinitionId(long visitDefinitionId) {
		_visitDefinitionId = visitDefinitionId;
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

	public long getVisitGroupId() {
		return _visitGroupId;
	}

	public void setVisitGroupId(long visitGroupId) {
		_visitGroupId = visitGroupId;
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

	public String getVisitDefinitionCode() {
		return _visitDefinitionCode;
	}

	public void setVisitDefinitionCode(String visitDefinitionCode) {
		_visitDefinitionCode = visitDefinitionCode;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	public String getAnchorType() {
		return _anchorType;
	}

	public void setAnchorType(String anchorType) {
		_anchorType = anchorType;
	}

	public int getOffset() {
		return _offset;
	}

	public void setOffset(int offset) {
		_offset = offset;
	}

	public int getWindowMinus() {
		return _windowMinus;
	}

	public void setWindowMinus(int windowMinus) {
		_windowMinus = windowMinus;
	}

	public int getWindowPlus() {
		return _windowPlus;
	}

	public void setWindowPlus(int windowPlus) {
		_windowPlus = windowPlus;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public int getRepeatCount() {
		return _repeatCount;
	}

	public void setRepeatCount(int repeatCount) {
		_repeatCount = repeatCount;
	}

	public long getVisitCRFId() {
		return _visitCRFId;
	}

	public void setVisitCRFId(long visitCRFId) {
		_visitCRFId = visitCRFId;
	}

	private String _uuid;
	private long _visitDefinitionId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _visitGroupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _visitDefinitionCode;
	private String _name;
	private int _order;
	private String _anchorType;
	private int _offset;
	private int _windowMinus;
	private int _windowPlus;
	private int _type;
	private int _repeatCount;
	private long _visitCRFId;

}
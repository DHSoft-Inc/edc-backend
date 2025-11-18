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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.VisitEventServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitEventSoap implements Serializable {

	public static VisitEventSoap toSoapModel(VisitEvent model) {
		VisitEventSoap soapModel = new VisitEventSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVisitEventId(model.getVisitEventId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setVisitDefinitionId(model.getVisitDefinitionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setAnchorType(model.getAnchorType());
		soapModel.setAnchorDate(model.getAnchorDate());
		soapModel.setOffset(model.getOffset());
		soapModel.setPlanDate(model.getPlanDate());
		soapModel.setEventDate(model.getEventDate());
		soapModel.setDeviationStatus(model.getDeviationStatus());
		soapModel.setInstanceLinkObj(model.getInstanceLinkObj());

		return soapModel;
	}

	public static VisitEventSoap[] toSoapModels(VisitEvent[] models) {
		VisitEventSoap[] soapModels = new VisitEventSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VisitEventSoap[][] toSoapModels(VisitEvent[][] models) {
		VisitEventSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VisitEventSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VisitEventSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VisitEventSoap[] toSoapModels(List<VisitEvent> models) {
		List<VisitEventSoap> soapModels = new ArrayList<VisitEventSoap>(
			models.size());

		for (VisitEvent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VisitEventSoap[soapModels.size()]);
	}

	public VisitEventSoap() {
	}

	public long getPrimaryKey() {
		return _visitEventId;
	}

	public void setPrimaryKey(long pk) {
		setVisitEventId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVisitEventId() {
		return _visitEventId;
	}

	public void setVisitEventId(long visitEventId) {
		_visitEventId = visitEventId;
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

	public long getInstitutionId() {
		return _institutionId;
	}

	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public long getVisitDefinitionId() {
		return _visitDefinitionId;
	}

	public void setVisitDefinitionId(long visitDefinitionId) {
		_visitDefinitionId = visitDefinitionId;
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

	public String getAnchorType() {
		return _anchorType;
	}

	public void setAnchorType(String anchorType) {
		_anchorType = anchorType;
	}

	public Date getAnchorDate() {
		return _anchorDate;
	}

	public void setAnchorDate(Date anchorDate) {
		_anchorDate = anchorDate;
	}

	public int getOffset() {
		return _offset;
	}

	public void setOffset(int offset) {
		_offset = offset;
	}

	public Date getPlanDate() {
		return _planDate;
	}

	public void setPlanDate(Date planDate) {
		_planDate = planDate;
	}

	public Date getEventDate() {
		return _eventDate;
	}

	public void setEventDate(Date eventDate) {
		_eventDate = eventDate;
	}

	public String getDeviationStatus() {
		return _deviationStatus;
	}

	public void setDeviationStatus(String deviationStatus) {
		_deviationStatus = deviationStatus;
	}

	public String getInstanceLinkObj() {
		return _instanceLinkObj;
	}

	public void setInstanceLinkObj(String instanceLinkObj) {
		_instanceLinkObj = instanceLinkObj;
	}

	private String _uuid;
	private long _visitEventId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _institutionId;
	private long _subjectId;
	private long _visitDefinitionId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _anchorType;
	private Date _anchorDate;
	private int _offset;
	private Date _planDate;
	private Date _eventDate;
	private String _deviationStatus;
	private String _instanceLinkObj;

}
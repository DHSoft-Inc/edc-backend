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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.ApprovalRequestServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ApprovalRequestSoap implements Serializable {

	public static ApprovalRequestSoap toSoapModel(ApprovalRequest model) {
		ApprovalRequestSoap soapModel = new ApprovalRequestSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setApprovalRequestId(model.getApprovalRequestId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setRequestUserId(model.getRequestUserId());
		soapModel.setRequestUserName(model.getRequestUserName());
		soapModel.setRequestDate(model.getRequestDate());
		soapModel.setTargetUsersId(model.getTargetUsersId());
		soapModel.setClassName(model.getClassName());
		soapModel.setClassPK(model.getClassPK());

		return soapModel;
	}

	public static ApprovalRequestSoap[] toSoapModels(ApprovalRequest[] models) {
		ApprovalRequestSoap[] soapModels =
			new ApprovalRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApprovalRequestSoap[][] toSoapModels(
		ApprovalRequest[][] models) {

		ApprovalRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ApprovalRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApprovalRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApprovalRequestSoap[] toSoapModels(
		List<ApprovalRequest> models) {

		List<ApprovalRequestSoap> soapModels =
			new ArrayList<ApprovalRequestSoap>(models.size());

		for (ApprovalRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApprovalRequestSoap[soapModels.size()]);
	}

	public ApprovalRequestSoap() {
	}

	public long getPrimaryKey() {
		return _approvalRequestId;
	}

	public void setPrimaryKey(long pk) {
		setApprovalRequestId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getApprovalRequestId() {
		return _approvalRequestId;
	}

	public void setApprovalRequestId(long approvalRequestId) {
		_approvalRequestId = approvalRequestId;
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

	public long getRequestUserId() {
		return _requestUserId;
	}

	public void setRequestUserId(long requestUserId) {
		_requestUserId = requestUserId;
	}

	public String getRequestUserName() {
		return _requestUserName;
	}

	public void setRequestUserName(String requestUserName) {
		_requestUserName = requestUserName;
	}

	public Date getRequestDate() {
		return _requestDate;
	}

	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	public String getTargetUsersId() {
		return _targetUsersId;
	}

	public void setTargetUsersId(String targetUsersId) {
		_targetUsersId = targetUsersId;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	private String _uuid;
	private long _approvalRequestId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _requestUserId;
	private String _requestUserName;
	private Date _requestDate;
	private String _targetUsersId;
	private String _className;
	private long _classPK;

}
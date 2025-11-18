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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.SubjectServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubjectSoap implements Serializable {

	public static SubjectSoap toSoapModel(Subject model) {
		SubjectSoap soapModel = new SubjectSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setSerialId(model.getSerialId());
		soapModel.setRandomNo(model.getRandomNo());
		soapModel.setName(model.getName());
		soapModel.setSubjectStatus(model.getSubjectStatus());
		soapModel.setSubjectStatusApplyDate(model.getSubjectStatusApplyDate());
		soapModel.setConsentAgreeDate(model.getConsentAgreeDate());
		soapModel.setExpGroupId(model.getExpGroupId());
		soapModel.setApplyDate(model.getApplyDate());

		return soapModel;
	}

	public static SubjectSoap[] toSoapModels(Subject[] models) {
		SubjectSoap[] soapModels = new SubjectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubjectSoap[][] toSoapModels(Subject[][] models) {
		SubjectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubjectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubjectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubjectSoap[] toSoapModels(List<Subject> models) {
		List<SubjectSoap> soapModels = new ArrayList<SubjectSoap>(
			models.size());

		for (Subject model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubjectSoap[soapModels.size()]);
	}

	public SubjectSoap() {
	}

	public long getPrimaryKey() {
		return _subjectId;
	}

	public void setPrimaryKey(long pk) {
		setSubjectId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
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

	public String getSerialId() {
		return _serialId;
	}

	public void setSerialId(String serialId) {
		_serialId = serialId;
	}

	public String getRandomNo() {
		return _randomNo;
	}

	public void setRandomNo(String randomNo) {
		_randomNo = randomNo;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getSubjectStatus() {
		return _subjectStatus;
	}

	public void setSubjectStatus(int subjectStatus) {
		_subjectStatus = subjectStatus;
	}

	public Date getSubjectStatusApplyDate() {
		return _subjectStatusApplyDate;
	}

	public void setSubjectStatusApplyDate(Date subjectStatusApplyDate) {
		_subjectStatusApplyDate = subjectStatusApplyDate;
	}

	public Date getConsentAgreeDate() {
		return _consentAgreeDate;
	}

	public void setConsentAgreeDate(Date consentAgreeDate) {
		_consentAgreeDate = consentAgreeDate;
	}

	public long getExpGroupId() {
		return _expGroupId;
	}

	public void setExpGroupId(long expGroupId) {
		_expGroupId = expGroupId;
	}

	public Date getApplyDate() {
		return _applyDate;
	}

	public void setApplyDate(Date applyDate) {
		_applyDate = applyDate;
	}

	private String _uuid;
	private long _subjectId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _institutionId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _serialId;
	private String _randomNo;
	private String _name;
	private int _subjectStatus;
	private Date _subjectStatusApplyDate;
	private Date _consentAgreeDate;
	private long _expGroupId;
	private Date _applyDate;

}
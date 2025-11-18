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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.InstResearcherServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstResearcherSoap implements Serializable {

	public static InstResearcherSoap toSoapModel(InstResearcher model) {
		InstResearcherSoap soapModel = new InstResearcherSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInstitutionResearcherId(
			model.getInstitutionResearcherId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setResearcherId(model.getResearcherId());

		return soapModel;
	}

	public static InstResearcherSoap[] toSoapModels(InstResearcher[] models) {
		InstResearcherSoap[] soapModels = new InstResearcherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstResearcherSoap[][] toSoapModels(
		InstResearcher[][] models) {

		InstResearcherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new InstResearcherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstResearcherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstResearcherSoap[] toSoapModels(
		List<InstResearcher> models) {

		List<InstResearcherSoap> soapModels = new ArrayList<InstResearcherSoap>(
			models.size());

		for (InstResearcher model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstResearcherSoap[soapModels.size()]);
	}

	public InstResearcherSoap() {
	}

	public long getPrimaryKey() {
		return _institutionResearcherId;
	}

	public void setPrimaryKey(long pk) {
		setInstitutionResearcherId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getInstitutionResearcherId() {
		return _institutionResearcherId;
	}

	public void setInstitutionResearcherId(long institutionResearcherId) {
		_institutionResearcherId = institutionResearcherId;
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

	public long getInstitutionId() {
		return _institutionId;
	}

	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;
	}

	public long getResearcherId() {
		return _researcherId;
	}

	public void setResearcherId(long researcherId) {
		_researcherId = researcherId;
	}

	private String _uuid;
	private long _institutionResearcherId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _institutionId;
	private long _researcherId;

}
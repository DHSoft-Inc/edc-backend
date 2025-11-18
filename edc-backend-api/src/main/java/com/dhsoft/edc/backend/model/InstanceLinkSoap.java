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
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.InstanceLinkServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstanceLinkSoap implements Serializable {

	public static InstanceLinkSoap toSoapModel(InstanceLink model) {
		InstanceLinkSoap soapModel = new InstanceLinkSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLinkId(model.getLinkId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setVisitGroupId(model.getVisitGroupId());
		soapModel.setVisitDefinitionId(model.getVisitDefinitionId());
		soapModel.setVisitCRFId(model.getVisitCRFId());
		soapModel.setSubCRFId(model.getSubCRFId());
		soapModel.setInstanceId(model.getInstanceId());

		return soapModel;
	}

	public static InstanceLinkSoap[] toSoapModels(InstanceLink[] models) {
		InstanceLinkSoap[] soapModels = new InstanceLinkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstanceLinkSoap[][] toSoapModels(InstanceLink[][] models) {
		InstanceLinkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstanceLinkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstanceLinkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstanceLinkSoap[] toSoapModels(List<InstanceLink> models) {
		List<InstanceLinkSoap> soapModels = new ArrayList<InstanceLinkSoap>(
			models.size());

		for (InstanceLink model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstanceLinkSoap[soapModels.size()]);
	}

	public InstanceLinkSoap() {
	}

	public long getPrimaryKey() {
		return _linkId;
	}

	public void setPrimaryKey(long pk) {
		setLinkId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLinkId() {
		return _linkId;
	}

	public void setLinkId(long linkId) {
		_linkId = linkId;
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

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public long getVisitGroupId() {
		return _visitGroupId;
	}

	public void setVisitGroupId(long visitGroupId) {
		_visitGroupId = visitGroupId;
	}

	public long getVisitDefinitionId() {
		return _visitDefinitionId;
	}

	public void setVisitDefinitionId(long visitDefinitionId) {
		_visitDefinitionId = visitDefinitionId;
	}

	public long getVisitCRFId() {
		return _visitCRFId;
	}

	public void setVisitCRFId(long visitCRFId) {
		_visitCRFId = visitCRFId;
	}

	public long getSubCRFId() {
		return _subCRFId;
	}

	public void setSubCRFId(long subCRFId) {
		_subCRFId = subCRFId;
	}

	public long getInstanceId() {
		return _instanceId;
	}

	public void setInstanceId(long instanceId) {
		_instanceId = instanceId;
	}

	private String _uuid;
	private long _linkId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _institutionId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _subjectId;
	private long _visitGroupId;
	private long _visitDefinitionId;
	private long _visitCRFId;
	private long _subCRFId;
	private long _instanceId;

}
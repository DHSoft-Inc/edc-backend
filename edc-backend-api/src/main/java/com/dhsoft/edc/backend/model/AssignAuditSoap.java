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
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssignAuditSoap implements Serializable {

	public static AssignAuditSoap toSoapModel(AssignAudit model) {
		AssignAuditSoap soapModel = new AssignAuditSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAuditId(model.getAuditId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setResearcherId(model.getResearcherId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setAction(model.getAction());
		soapModel.setTargetUserId(model.getTargetUserId());
		soapModel.setRoleOrScope(model.getRoleOrScope());
		soapModel.setPayload(model.getPayload());
		soapModel.setActorUserId(model.getActorUserId());
		soapModel.setActorUserName(model.getActorUserName());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static AssignAuditSoap[] toSoapModels(AssignAudit[] models) {
		AssignAuditSoap[] soapModels = new AssignAuditSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssignAuditSoap[][] toSoapModels(AssignAudit[][] models) {
		AssignAuditSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssignAuditSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssignAuditSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssignAuditSoap[] toSoapModels(List<AssignAudit> models) {
		List<AssignAuditSoap> soapModels = new ArrayList<AssignAuditSoap>(
			models.size());

		for (AssignAudit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssignAuditSoap[soapModels.size()]);
	}

	public AssignAuditSoap() {
	}

	public long getPrimaryKey() {
		return _auditId;
	}

	public void setPrimaryKey(long pk) {
		setAuditId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAuditId() {
		return _auditId;
	}

	public void setAuditId(long auditId) {
		_auditId = auditId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public long getTargetUserId() {
		return _targetUserId;
	}

	public void setTargetUserId(long targetUserId) {
		_targetUserId = targetUserId;
	}

	public String getRoleOrScope() {
		return _roleOrScope;
	}

	public void setRoleOrScope(String roleOrScope) {
		_roleOrScope = roleOrScope;
	}

	public String getPayload() {
		return _payload;
	}

	public void setPayload(String payload) {
		_payload = payload;
	}

	public long getActorUserId() {
		return _actorUserId;
	}

	public void setActorUserId(long actorUserId) {
		_actorUserId = actorUserId;
	}

	public String getActorUserName() {
		return _actorUserName;
	}

	public void setActorUserName(String actorUserName) {
		_actorUserName = actorUserName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private String _uuid;
	private long _auditId;
	private long _companyId;
	private long _institutionId;
	private long _researcherId;
	private long _projectId;
	private String _action;
	private long _targetUserId;
	private String _roleOrScope;
	private String _payload;
	private long _actorUserId;
	private String _actorUserName;
	private Date _createDate;

}
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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AssignAudit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignAudit
 * @generated
 */
public class AssignAuditWrapper
	extends BaseModelWrapper<AssignAudit>
	implements AssignAudit, ModelWrapper<AssignAudit> {

	public AssignAuditWrapper(AssignAudit assignAudit) {
		super(assignAudit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("auditId", getAuditId());
		attributes.put("companyId", getCompanyId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("researcherId", getResearcherId());
		attributes.put("projectId", getProjectId());
		attributes.put("action", getAction());
		attributes.put("targetUserId", getTargetUserId());
		attributes.put("roleOrScope", getRoleOrScope());
		attributes.put("payload", getPayload());
		attributes.put("actorUserId", getActorUserId());
		attributes.put("actorUserName", getActorUserName());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long auditId = (Long)attributes.get("auditId");

		if (auditId != null) {
			setAuditId(auditId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
		}

		Long researcherId = (Long)attributes.get("researcherId");

		if (researcherId != null) {
			setResearcherId(researcherId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		Long targetUserId = (Long)attributes.get("targetUserId");

		if (targetUserId != null) {
			setTargetUserId(targetUserId);
		}

		String roleOrScope = (String)attributes.get("roleOrScope");

		if (roleOrScope != null) {
			setRoleOrScope(roleOrScope);
		}

		String payload = (String)attributes.get("payload");

		if (payload != null) {
			setPayload(payload);
		}

		Long actorUserId = (Long)attributes.get("actorUserId");

		if (actorUserId != null) {
			setActorUserId(actorUserId);
		}

		String actorUserName = (String)attributes.get("actorUserName");

		if (actorUserName != null) {
			setActorUserName(actorUserName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	 * Returns the action of this assign audit.
	 *
	 * @return the action of this assign audit
	 */
	@Override
	public String getAction() {
		return model.getAction();
	}

	/**
	 * Returns the actor user ID of this assign audit.
	 *
	 * @return the actor user ID of this assign audit
	 */
	@Override
	public long getActorUserId() {
		return model.getActorUserId();
	}

	/**
	 * Returns the actor user name of this assign audit.
	 *
	 * @return the actor user name of this assign audit
	 */
	@Override
	public String getActorUserName() {
		return model.getActorUserName();
	}

	/**
	 * Returns the actor user uuid of this assign audit.
	 *
	 * @return the actor user uuid of this assign audit
	 */
	@Override
	public String getActorUserUuid() {
		return model.getActorUserUuid();
	}

	/**
	 * Returns the audit ID of this assign audit.
	 *
	 * @return the audit ID of this assign audit
	 */
	@Override
	public long getAuditId() {
		return model.getAuditId();
	}

	/**
	 * Returns the company ID of this assign audit.
	 *
	 * @return the company ID of this assign audit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this assign audit.
	 *
	 * @return the create date of this assign audit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the institution ID of this assign audit.
	 *
	 * @return the institution ID of this assign audit
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the payload of this assign audit.
	 *
	 * @return the payload of this assign audit
	 */
	@Override
	public String getPayload() {
		return model.getPayload();
	}

	/**
	 * Returns the primary key of this assign audit.
	 *
	 * @return the primary key of this assign audit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this assign audit.
	 *
	 * @return the project ID of this assign audit
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the researcher ID of this assign audit.
	 *
	 * @return the researcher ID of this assign audit
	 */
	@Override
	public long getResearcherId() {
		return model.getResearcherId();
	}

	/**
	 * Returns the role or scope of this assign audit.
	 *
	 * @return the role or scope of this assign audit
	 */
	@Override
	public String getRoleOrScope() {
		return model.getRoleOrScope();
	}

	/**
	 * Returns the target user ID of this assign audit.
	 *
	 * @return the target user ID of this assign audit
	 */
	@Override
	public long getTargetUserId() {
		return model.getTargetUserId();
	}

	/**
	 * Returns the target user uuid of this assign audit.
	 *
	 * @return the target user uuid of this assign audit
	 */
	@Override
	public String getTargetUserUuid() {
		return model.getTargetUserUuid();
	}

	/**
	 * Returns the uuid of this assign audit.
	 *
	 * @return the uuid of this assign audit
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the action of this assign audit.
	 *
	 * @param action the action of this assign audit
	 */
	@Override
	public void setAction(String action) {
		model.setAction(action);
	}

	/**
	 * Sets the actor user ID of this assign audit.
	 *
	 * @param actorUserId the actor user ID of this assign audit
	 */
	@Override
	public void setActorUserId(long actorUserId) {
		model.setActorUserId(actorUserId);
	}

	/**
	 * Sets the actor user name of this assign audit.
	 *
	 * @param actorUserName the actor user name of this assign audit
	 */
	@Override
	public void setActorUserName(String actorUserName) {
		model.setActorUserName(actorUserName);
	}

	/**
	 * Sets the actor user uuid of this assign audit.
	 *
	 * @param actorUserUuid the actor user uuid of this assign audit
	 */
	@Override
	public void setActorUserUuid(String actorUserUuid) {
		model.setActorUserUuid(actorUserUuid);
	}

	/**
	 * Sets the audit ID of this assign audit.
	 *
	 * @param auditId the audit ID of this assign audit
	 */
	@Override
	public void setAuditId(long auditId) {
		model.setAuditId(auditId);
	}

	/**
	 * Sets the company ID of this assign audit.
	 *
	 * @param companyId the company ID of this assign audit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this assign audit.
	 *
	 * @param createDate the create date of this assign audit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the institution ID of this assign audit.
	 *
	 * @param institutionId the institution ID of this assign audit
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the payload of this assign audit.
	 *
	 * @param payload the payload of this assign audit
	 */
	@Override
	public void setPayload(String payload) {
		model.setPayload(payload);
	}

	/**
	 * Sets the primary key of this assign audit.
	 *
	 * @param primaryKey the primary key of this assign audit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this assign audit.
	 *
	 * @param projectId the project ID of this assign audit
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the researcher ID of this assign audit.
	 *
	 * @param researcherId the researcher ID of this assign audit
	 */
	@Override
	public void setResearcherId(long researcherId) {
		model.setResearcherId(researcherId);
	}

	/**
	 * Sets the role or scope of this assign audit.
	 *
	 * @param roleOrScope the role or scope of this assign audit
	 */
	@Override
	public void setRoleOrScope(String roleOrScope) {
		model.setRoleOrScope(roleOrScope);
	}

	/**
	 * Sets the target user ID of this assign audit.
	 *
	 * @param targetUserId the target user ID of this assign audit
	 */
	@Override
	public void setTargetUserId(long targetUserId) {
		model.setTargetUserId(targetUserId);
	}

	/**
	 * Sets the target user uuid of this assign audit.
	 *
	 * @param targetUserUuid the target user uuid of this assign audit
	 */
	@Override
	public void setTargetUserUuid(String targetUserUuid) {
		model.setTargetUserUuid(targetUserUuid);
	}

	/**
	 * Sets the uuid of this assign audit.
	 *
	 * @param uuid the uuid of this assign audit
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected AssignAuditWrapper wrap(AssignAudit assignAudit) {
		return new AssignAuditWrapper(assignAudit);
	}

}
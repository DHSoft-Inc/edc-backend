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

package com.dhsoft.edc.backend.model.impl;

import com.dhsoft.edc.backend.model.AssignAudit;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssignAudit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssignAuditCacheModel
	implements CacheModel<AssignAudit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssignAuditCacheModel)) {
			return false;
		}

		AssignAuditCacheModel assignAuditCacheModel =
			(AssignAuditCacheModel)object;

		if (auditId == assignAuditCacheModel.auditId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", auditId=");
		sb.append(auditId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", researcherId=");
		sb.append(researcherId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", action=");
		sb.append(action);
		sb.append(", targetUserId=");
		sb.append(targetUserId);
		sb.append(", roleOrScope=");
		sb.append(roleOrScope);
		sb.append(", payload=");
		sb.append(payload);
		sb.append(", actorUserId=");
		sb.append(actorUserId);
		sb.append(", actorUserName=");
		sb.append(actorUserName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssignAudit toEntityModel() {
		AssignAuditImpl assignAuditImpl = new AssignAuditImpl();

		if (uuid == null) {
			assignAuditImpl.setUuid("");
		}
		else {
			assignAuditImpl.setUuid(uuid);
		}

		assignAuditImpl.setAuditId(auditId);
		assignAuditImpl.setCompanyId(companyId);
		assignAuditImpl.setInstitutionId(institutionId);
		assignAuditImpl.setResearcherId(researcherId);
		assignAuditImpl.setProjectId(projectId);

		if (action == null) {
			assignAuditImpl.setAction("");
		}
		else {
			assignAuditImpl.setAction(action);
		}

		assignAuditImpl.setTargetUserId(targetUserId);

		if (roleOrScope == null) {
			assignAuditImpl.setRoleOrScope("");
		}
		else {
			assignAuditImpl.setRoleOrScope(roleOrScope);
		}

		if (payload == null) {
			assignAuditImpl.setPayload("");
		}
		else {
			assignAuditImpl.setPayload(payload);
		}

		assignAuditImpl.setActorUserId(actorUserId);

		if (actorUserName == null) {
			assignAuditImpl.setActorUserName("");
		}
		else {
			assignAuditImpl.setActorUserName(actorUserName);
		}

		if (createDate == Long.MIN_VALUE) {
			assignAuditImpl.setCreateDate(null);
		}
		else {
			assignAuditImpl.setCreateDate(new Date(createDate));
		}

		assignAuditImpl.resetOriginalValues();

		return assignAuditImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		auditId = objectInput.readLong();

		companyId = objectInput.readLong();

		institutionId = objectInput.readLong();

		researcherId = objectInput.readLong();

		projectId = objectInput.readLong();
		action = objectInput.readUTF();

		targetUserId = objectInput.readLong();
		roleOrScope = objectInput.readUTF();
		payload = objectInput.readUTF();

		actorUserId = objectInput.readLong();
		actorUserName = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(auditId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(institutionId);

		objectOutput.writeLong(researcherId);

		objectOutput.writeLong(projectId);

		if (action == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(action);
		}

		objectOutput.writeLong(targetUserId);

		if (roleOrScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleOrScope);
		}

		if (payload == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(payload);
		}

		objectOutput.writeLong(actorUserId);

		if (actorUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actorUserName);
		}

		objectOutput.writeLong(createDate);
	}

	public String uuid;
	public long auditId;
	public long companyId;
	public long institutionId;
	public long researcherId;
	public long projectId;
	public String action;
	public long targetUserId;
	public String roleOrScope;
	public String payload;
	public long actorUserId;
	public String actorUserName;
	public long createDate;

}
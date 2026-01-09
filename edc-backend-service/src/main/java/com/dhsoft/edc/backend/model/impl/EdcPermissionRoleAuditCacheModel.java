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

import com.dhsoft.edc.backend.model.EdcPermissionRoleAudit;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EdcPermissionRoleAudit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionRoleAuditCacheModel
	implements CacheModel<EdcPermissionRoleAudit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EdcPermissionRoleAuditCacheModel)) {
			return false;
		}

		EdcPermissionRoleAuditCacheModel edcPermissionRoleAuditCacheModel =
			(EdcPermissionRoleAuditCacheModel)object;

		if (auditRoleId == edcPermissionRoleAuditCacheModel.auditRoleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditRoleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", auditRoleId=");
		sb.append(auditRoleId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", actorGroup=");
		sb.append(actorGroup);
		sb.append(", actorId=");
		sb.append(actorId);
		sb.append(", crudType=");
		sb.append(crudType);
		sb.append(", fromRole=");
		sb.append(fromRole);
		sb.append(", toRole=");
		sb.append(toRole);
		sb.append(", fromActive=");
		sb.append(fromActive);
		sb.append(", toActive=");
		sb.append(toActive);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EdcPermissionRoleAudit toEntityModel() {
		EdcPermissionRoleAuditImpl edcPermissionRoleAuditImpl =
			new EdcPermissionRoleAuditImpl();

		if (uuid == null) {
			edcPermissionRoleAuditImpl.setUuid("");
		}
		else {
			edcPermissionRoleAuditImpl.setUuid(uuid);
		}

		edcPermissionRoleAuditImpl.setAuditRoleId(auditRoleId);
		edcPermissionRoleAuditImpl.setCompanyId(companyId);
		edcPermissionRoleAuditImpl.setGroupId(groupId);
		edcPermissionRoleAuditImpl.setProjectId(projectId);
		edcPermissionRoleAuditImpl.setActorGroup(actorGroup);
		edcPermissionRoleAuditImpl.setActorId(actorId);

		if (crudType == null) {
			edcPermissionRoleAuditImpl.setCrudType("");
		}
		else {
			edcPermissionRoleAuditImpl.setCrudType(crudType);
		}

		if (fromRole == null) {
			edcPermissionRoleAuditImpl.setFromRole("");
		}
		else {
			edcPermissionRoleAuditImpl.setFromRole(fromRole);
		}

		if (toRole == null) {
			edcPermissionRoleAuditImpl.setToRole("");
		}
		else {
			edcPermissionRoleAuditImpl.setToRole(toRole);
		}

		if (fromActive == null) {
			edcPermissionRoleAuditImpl.setFromActive("");
		}
		else {
			edcPermissionRoleAuditImpl.setFromActive(fromActive);
		}

		if (toActive == null) {
			edcPermissionRoleAuditImpl.setToActive("");
		}
		else {
			edcPermissionRoleAuditImpl.setToActive(toActive);
		}

		if (remarks == null) {
			edcPermissionRoleAuditImpl.setRemarks("");
		}
		else {
			edcPermissionRoleAuditImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			edcPermissionRoleAuditImpl.setCreateDate(null);
		}
		else {
			edcPermissionRoleAuditImpl.setCreateDate(new Date(createDate));
		}

		edcPermissionRoleAuditImpl.setUserId(userId);

		if (userName == null) {
			edcPermissionRoleAuditImpl.setUserName("");
		}
		else {
			edcPermissionRoleAuditImpl.setUserName(userName);
		}

		edcPermissionRoleAuditImpl.resetOriginalValues();

		return edcPermissionRoleAuditImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		auditRoleId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		projectId = objectInput.readLong();

		actorGroup = objectInput.readLong();

		actorId = objectInput.readLong();
		crudType = objectInput.readUTF();
		fromRole = objectInput.readUTF();
		toRole = objectInput.readUTF();
		fromActive = objectInput.readUTF();
		toActive = objectInput.readUTF();
		remarks = objectInput.readUTF();
		createDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(auditRoleId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(actorGroup);

		objectOutput.writeLong(actorId);

		if (crudType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(crudType);
		}

		if (fromRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fromRole);
		}

		if (toRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(toRole);
		}

		if (fromActive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fromActive);
		}

		if (toActive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(toActive);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(createDate);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}
	}

	public String uuid;
	public long auditRoleId;
	public long companyId;
	public long groupId;
	public long projectId;
	public long actorGroup;
	public long actorId;
	public String crudType;
	public String fromRole;
	public String toRole;
	public String fromActive;
	public String toActive;
	public String remarks;
	public long createDate;
	public long userId;
	public String userName;

}
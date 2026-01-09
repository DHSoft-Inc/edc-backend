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

import com.dhsoft.edc.backend.model.EdcPermissionScopeAudit;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EdcPermissionScopeAudit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionScopeAuditCacheModel
	implements CacheModel<EdcPermissionScopeAudit>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EdcPermissionScopeAuditCacheModel)) {
			return false;
		}

		EdcPermissionScopeAuditCacheModel edcPermissionScopeAuditCacheModel =
			(EdcPermissionScopeAuditCacheModel)object;

		if (auditScopeId == edcPermissionScopeAuditCacheModel.auditScopeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auditScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", auditScopeId=");
		sb.append(auditScopeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", roleName=");
		sb.append(roleName);
		sb.append(", moduleName=");
		sb.append(moduleName);
		sb.append(", taskKey=");
		sb.append(taskKey);
		sb.append(", fromScope=");
		sb.append(fromScope);
		sb.append(", toScope=");
		sb.append(toScope);
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
	public EdcPermissionScopeAudit toEntityModel() {
		EdcPermissionScopeAuditImpl edcPermissionScopeAuditImpl =
			new EdcPermissionScopeAuditImpl();

		if (uuid == null) {
			edcPermissionScopeAuditImpl.setUuid("");
		}
		else {
			edcPermissionScopeAuditImpl.setUuid(uuid);
		}

		edcPermissionScopeAuditImpl.setAuditScopeId(auditScopeId);
		edcPermissionScopeAuditImpl.setCompanyId(companyId);
		edcPermissionScopeAuditImpl.setGroupId(groupId);
		edcPermissionScopeAuditImpl.setProjectId(projectId);

		if (roleName == null) {
			edcPermissionScopeAuditImpl.setRoleName("");
		}
		else {
			edcPermissionScopeAuditImpl.setRoleName(roleName);
		}

		if (moduleName == null) {
			edcPermissionScopeAuditImpl.setModuleName("");
		}
		else {
			edcPermissionScopeAuditImpl.setModuleName(moduleName);
		}

		if (taskKey == null) {
			edcPermissionScopeAuditImpl.setTaskKey("");
		}
		else {
			edcPermissionScopeAuditImpl.setTaskKey(taskKey);
		}

		if (fromScope == null) {
			edcPermissionScopeAuditImpl.setFromScope("");
		}
		else {
			edcPermissionScopeAuditImpl.setFromScope(fromScope);
		}

		if (toScope == null) {
			edcPermissionScopeAuditImpl.setToScope("");
		}
		else {
			edcPermissionScopeAuditImpl.setToScope(toScope);
		}

		if (fromActive == null) {
			edcPermissionScopeAuditImpl.setFromActive("");
		}
		else {
			edcPermissionScopeAuditImpl.setFromActive(fromActive);
		}

		if (toActive == null) {
			edcPermissionScopeAuditImpl.setToActive("");
		}
		else {
			edcPermissionScopeAuditImpl.setToActive(toActive);
		}

		if (remarks == null) {
			edcPermissionScopeAuditImpl.setRemarks("");
		}
		else {
			edcPermissionScopeAuditImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			edcPermissionScopeAuditImpl.setCreateDate(null);
		}
		else {
			edcPermissionScopeAuditImpl.setCreateDate(new Date(createDate));
		}

		edcPermissionScopeAuditImpl.setUserId(userId);

		if (userName == null) {
			edcPermissionScopeAuditImpl.setUserName("");
		}
		else {
			edcPermissionScopeAuditImpl.setUserName(userName);
		}

		edcPermissionScopeAuditImpl.resetOriginalValues();

		return edcPermissionScopeAuditImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		auditScopeId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		projectId = objectInput.readLong();
		roleName = objectInput.readUTF();
		moduleName = objectInput.readUTF();
		taskKey = objectInput.readUTF();
		fromScope = objectInput.readUTF();
		toScope = objectInput.readUTF();
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

		objectOutput.writeLong(auditScopeId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(projectId);

		if (roleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleName);
		}

		if (moduleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(moduleName);
		}

		if (taskKey == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taskKey);
		}

		if (fromScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fromScope);
		}

		if (toScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(toScope);
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
	public long auditScopeId;
	public long companyId;
	public long groupId;
	public long projectId;
	public String roleName;
	public String moduleName;
	public String taskKey;
	public String fromScope;
	public String toScope;
	public String fromActive;
	public String toActive;
	public String remarks;
	public long createDate;
	public long userId;
	public String userName;

}
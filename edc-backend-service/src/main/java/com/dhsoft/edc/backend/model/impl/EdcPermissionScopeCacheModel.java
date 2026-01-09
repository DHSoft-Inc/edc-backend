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

import com.dhsoft.edc.backend.model.EdcPermissionScope;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EdcPermissionScope in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionScopeCacheModel
	implements CacheModel<EdcPermissionScope>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EdcPermissionScopeCacheModel)) {
			return false;
		}

		EdcPermissionScopeCacheModel edcPermissionScopeCacheModel =
			(EdcPermissionScopeCacheModel)object;

		if (permissionScopeId ==
				edcPermissionScopeCacheModel.permissionScopeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, permissionScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", permissionScopeId=");
		sb.append(permissionScopeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", moduleName=");
		sb.append(moduleName);
		sb.append(", taskKey=");
		sb.append(taskKey);
		sb.append(", roleName=");
		sb.append(roleName);
		sb.append(", scopeRole=");
		sb.append(scopeRole);
		sb.append(", active=");
		sb.append(active);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EdcPermissionScope toEntityModel() {
		EdcPermissionScopeImpl edcPermissionScopeImpl =
			new EdcPermissionScopeImpl();

		if (uuid == null) {
			edcPermissionScopeImpl.setUuid("");
		}
		else {
			edcPermissionScopeImpl.setUuid(uuid);
		}

		edcPermissionScopeImpl.setPermissionScopeId(permissionScopeId);
		edcPermissionScopeImpl.setCompanyId(companyId);
		edcPermissionScopeImpl.setGroupId(groupId);
		edcPermissionScopeImpl.setProjectId(projectId);

		if (moduleName == null) {
			edcPermissionScopeImpl.setModuleName("");
		}
		else {
			edcPermissionScopeImpl.setModuleName(moduleName);
		}

		if (taskKey == null) {
			edcPermissionScopeImpl.setTaskKey("");
		}
		else {
			edcPermissionScopeImpl.setTaskKey(taskKey);
		}

		if (roleName == null) {
			edcPermissionScopeImpl.setRoleName("");
		}
		else {
			edcPermissionScopeImpl.setRoleName(roleName);
		}

		if (scopeRole == null) {
			edcPermissionScopeImpl.setScopeRole("");
		}
		else {
			edcPermissionScopeImpl.setScopeRole(scopeRole);
		}

		edcPermissionScopeImpl.setActive(active);

		if (fromDate == Long.MIN_VALUE) {
			edcPermissionScopeImpl.setFromDate(null);
		}
		else {
			edcPermissionScopeImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			edcPermissionScopeImpl.setToDate(null);
		}
		else {
			edcPermissionScopeImpl.setToDate(new Date(toDate));
		}

		if (createDate == Long.MIN_VALUE) {
			edcPermissionScopeImpl.setCreateDate(null);
		}
		else {
			edcPermissionScopeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			edcPermissionScopeImpl.setModifiedDate(null);
		}
		else {
			edcPermissionScopeImpl.setModifiedDate(new Date(modifiedDate));
		}

		edcPermissionScopeImpl.setCreatedBy(createdBy);
		edcPermissionScopeImpl.setModifiedBy(modifiedBy);

		edcPermissionScopeImpl.resetOriginalValues();

		return edcPermissionScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		permissionScopeId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		projectId = objectInput.readLong();
		moduleName = objectInput.readUTF();
		taskKey = objectInput.readUTF();
		roleName = objectInput.readUTF();
		scopeRole = objectInput.readUTF();

		active = objectInput.readBoolean();
		fromDate = objectInput.readLong();
		toDate = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdBy = objectInput.readLong();

		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(permissionScopeId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(projectId);

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

		if (roleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleName);
		}

		if (scopeRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scopeRole);
		}

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(fromDate);
		objectOutput.writeLong(toDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdBy);

		objectOutput.writeLong(modifiedBy);
	}

	public String uuid;
	public long permissionScopeId;
	public long companyId;
	public long groupId;
	public long projectId;
	public String moduleName;
	public String taskKey;
	public String roleName;
	public String scopeRole;
	public boolean active;
	public long fromDate;
	public long toDate;
	public long createDate;
	public long modifiedDate;
	public long createdBy;
	public long modifiedBy;

}
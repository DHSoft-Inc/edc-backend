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

import com.dhsoft.edc.backend.model.EdcPermissionRole;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EdcPermissionRole in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcPermissionRoleCacheModel
	implements CacheModel<EdcPermissionRole>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EdcPermissionRoleCacheModel)) {
			return false;
		}

		EdcPermissionRoleCacheModel edcPermissionRoleCacheModel =
			(EdcPermissionRoleCacheModel)object;

		if (permissionRoleId == edcPermissionRoleCacheModel.permissionRoleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, permissionRoleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", permissionRoleId=");
		sb.append(permissionRoleId);
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
		sb.append(", roleName=");
		sb.append(roleName);
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
	public EdcPermissionRole toEntityModel() {
		EdcPermissionRoleImpl edcPermissionRoleImpl =
			new EdcPermissionRoleImpl();

		if (uuid == null) {
			edcPermissionRoleImpl.setUuid("");
		}
		else {
			edcPermissionRoleImpl.setUuid(uuid);
		}

		edcPermissionRoleImpl.setPermissionRoleId(permissionRoleId);
		edcPermissionRoleImpl.setCompanyId(companyId);
		edcPermissionRoleImpl.setGroupId(groupId);
		edcPermissionRoleImpl.setProjectId(projectId);
		edcPermissionRoleImpl.setActorGroup(actorGroup);
		edcPermissionRoleImpl.setActorId(actorId);

		if (roleName == null) {
			edcPermissionRoleImpl.setRoleName("");
		}
		else {
			edcPermissionRoleImpl.setRoleName(roleName);
		}

		edcPermissionRoleImpl.setActive(active);

		if (fromDate == Long.MIN_VALUE) {
			edcPermissionRoleImpl.setFromDate(null);
		}
		else {
			edcPermissionRoleImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			edcPermissionRoleImpl.setToDate(null);
		}
		else {
			edcPermissionRoleImpl.setToDate(new Date(toDate));
		}

		if (createDate == Long.MIN_VALUE) {
			edcPermissionRoleImpl.setCreateDate(null);
		}
		else {
			edcPermissionRoleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			edcPermissionRoleImpl.setModifiedDate(null);
		}
		else {
			edcPermissionRoleImpl.setModifiedDate(new Date(modifiedDate));
		}

		edcPermissionRoleImpl.setCreatedBy(createdBy);
		edcPermissionRoleImpl.setModifiedBy(modifiedBy);

		edcPermissionRoleImpl.resetOriginalValues();

		return edcPermissionRoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		permissionRoleId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		projectId = objectInput.readLong();

		actorGroup = objectInput.readLong();

		actorId = objectInput.readLong();
		roleName = objectInput.readUTF();

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

		objectOutput.writeLong(permissionRoleId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(actorGroup);

		objectOutput.writeLong(actorId);

		if (roleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleName);
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
	public long permissionRoleId;
	public long companyId;
	public long groupId;
	public long projectId;
	public long actorGroup;
	public long actorId;
	public String roleName;
	public boolean active;
	public long fromDate;
	public long toDate;
	public long createDate;
	public long modifiedDate;
	public long createdBy;
	public long modifiedBy;

}
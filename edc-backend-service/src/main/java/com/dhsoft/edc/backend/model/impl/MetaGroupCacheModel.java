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

import com.dhsoft.edc.backend.model.MetaGroup;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MetaGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MetaGroupCacheModel
	implements CacheModel<MetaGroup>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MetaGroupCacheModel)) {
			return false;
		}

		MetaGroupCacheModel metaGroupCacheModel = (MetaGroupCacheModel)object;

		if (metaGroupId == metaGroupCacheModel.metaGroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, metaGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", metaGroupId=");
		sb.append(metaGroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", groupCode=");
		sb.append(groupCode);
		sb.append(", groupName=");
		sb.append(groupName);
		sb.append(", type=");
		sb.append(type);
		sb.append(", active=");
		sb.append(active);
		sb.append(", inactiveDate=");
		sb.append(inactiveDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MetaGroup toEntityModel() {
		MetaGroupImpl metaGroupImpl = new MetaGroupImpl();

		if (uuid == null) {
			metaGroupImpl.setUuid("");
		}
		else {
			metaGroupImpl.setUuid(uuid);
		}

		metaGroupImpl.setMetaGroupId(metaGroupId);
		metaGroupImpl.setGroupId(groupId);
		metaGroupImpl.setCompanyId(companyId);
		metaGroupImpl.setProjectId(projectId);
		metaGroupImpl.setUserId(userId);

		if (userName == null) {
			metaGroupImpl.setUserName("");
		}
		else {
			metaGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			metaGroupImpl.setCreateDate(null);
		}
		else {
			metaGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			metaGroupImpl.setModifiedDate(null);
		}
		else {
			metaGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		metaGroupImpl.setStatus(status);
		metaGroupImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			metaGroupImpl.setStatusByUserName("");
		}
		else {
			metaGroupImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			metaGroupImpl.setStatusDate(null);
		}
		else {
			metaGroupImpl.setStatusDate(new Date(statusDate));
		}

		if (groupCode == null) {
			metaGroupImpl.setGroupCode("");
		}
		else {
			metaGroupImpl.setGroupCode(groupCode);
		}

		if (groupName == null) {
			metaGroupImpl.setGroupName("");
		}
		else {
			metaGroupImpl.setGroupName(groupName);
		}

		if (type == null) {
			metaGroupImpl.setType("");
		}
		else {
			metaGroupImpl.setType(type);
		}

		metaGroupImpl.setActive(active);

		if (inactiveDate == Long.MIN_VALUE) {
			metaGroupImpl.setInactiveDate(null);
		}
		else {
			metaGroupImpl.setInactiveDate(new Date(inactiveDate));
		}

		metaGroupImpl.resetOriginalValues();

		return metaGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		metaGroupId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		groupCode = objectInput.readUTF();
		groupName = objectInput.readUTF();
		type = objectInput.readUTF();

		active = objectInput.readBoolean();
		inactiveDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(metaGroupId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (groupCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(groupCode);
		}

		if (groupName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(groupName);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(inactiveDate);
	}

	public String uuid;
	public long metaGroupId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String groupCode;
	public String groupName;
	public String type;
	public boolean active;
	public long inactiveDate;

}
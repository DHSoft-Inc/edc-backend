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

import com.dhsoft.edc.backend.model.ExperimentalGroup;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExperimentalGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExperimentalGroupCacheModel
	implements CacheModel<ExperimentalGroup>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExperimentalGroupCacheModel)) {
			return false;
		}

		ExperimentalGroupCacheModel experimentalGroupCacheModel =
			(ExperimentalGroupCacheModel)object;

		if (experimentalGroupId ==
				experimentalGroupCacheModel.experimentalGroupId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, experimentalGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", experimentalGroupId=");
		sb.append(experimentalGroupId);
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
		sb.append(", expCode=");
		sb.append(expCode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExperimentalGroup toEntityModel() {
		ExperimentalGroupImpl experimentalGroupImpl =
			new ExperimentalGroupImpl();

		if (uuid == null) {
			experimentalGroupImpl.setUuid("");
		}
		else {
			experimentalGroupImpl.setUuid(uuid);
		}

		experimentalGroupImpl.setExperimentalGroupId(experimentalGroupId);
		experimentalGroupImpl.setGroupId(groupId);
		experimentalGroupImpl.setCompanyId(companyId);
		experimentalGroupImpl.setProjectId(projectId);
		experimentalGroupImpl.setUserId(userId);

		if (userName == null) {
			experimentalGroupImpl.setUserName("");
		}
		else {
			experimentalGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			experimentalGroupImpl.setCreateDate(null);
		}
		else {
			experimentalGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			experimentalGroupImpl.setModifiedDate(null);
		}
		else {
			experimentalGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		experimentalGroupImpl.setStatus(status);
		experimentalGroupImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			experimentalGroupImpl.setStatusByUserName("");
		}
		else {
			experimentalGroupImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			experimentalGroupImpl.setStatusDate(null);
		}
		else {
			experimentalGroupImpl.setStatusDate(new Date(statusDate));
		}

		if (expCode == null) {
			experimentalGroupImpl.setExpCode("");
		}
		else {
			experimentalGroupImpl.setExpCode(expCode);
		}

		if (name == null) {
			experimentalGroupImpl.setName("");
		}
		else {
			experimentalGroupImpl.setName(name);
		}

		if (description == null) {
			experimentalGroupImpl.setDescription("");
		}
		else {
			experimentalGroupImpl.setDescription(description);
		}

		experimentalGroupImpl.setType(type);

		experimentalGroupImpl.resetOriginalValues();

		return experimentalGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		experimentalGroupId = objectInput.readLong();

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
		expCode = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		type = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(experimentalGroupId);

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

		if (expCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expCode);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(type);
	}

	public String uuid;
	public long experimentalGroupId;
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
	public String expCode;
	public String name;
	public String description;
	public int type;

}
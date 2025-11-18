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

import com.dhsoft.edc.backend.model.VisitGroup;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VisitGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitGroupCacheModel
	implements CacheModel<VisitGroup>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VisitGroupCacheModel)) {
			return false;
		}

		VisitGroupCacheModel visitGroupCacheModel =
			(VisitGroupCacheModel)object;

		if (visitGroupId == visitGroupCacheModel.visitGroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, visitGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", visitGroupId=");
		sb.append(visitGroupId);
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
		sb.append(", expGroupId=");
		sb.append(expGroupId);
		sb.append(", visitGroupCode=");
		sb.append(visitGroupCode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", activeStatus=");
		sb.append(activeStatus);
		sb.append(", activeDate=");
		sb.append(activeDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VisitGroup toEntityModel() {
		VisitGroupImpl visitGroupImpl = new VisitGroupImpl();

		if (uuid == null) {
			visitGroupImpl.setUuid("");
		}
		else {
			visitGroupImpl.setUuid(uuid);
		}

		visitGroupImpl.setVisitGroupId(visitGroupId);
		visitGroupImpl.setGroupId(groupId);
		visitGroupImpl.setCompanyId(companyId);
		visitGroupImpl.setProjectId(projectId);
		visitGroupImpl.setUserId(userId);

		if (userName == null) {
			visitGroupImpl.setUserName("");
		}
		else {
			visitGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			visitGroupImpl.setCreateDate(null);
		}
		else {
			visitGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			visitGroupImpl.setModifiedDate(null);
		}
		else {
			visitGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		visitGroupImpl.setStatus(status);
		visitGroupImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			visitGroupImpl.setStatusByUserName("");
		}
		else {
			visitGroupImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			visitGroupImpl.setStatusDate(null);
		}
		else {
			visitGroupImpl.setStatusDate(new Date(statusDate));
		}

		visitGroupImpl.setExpGroupId(expGroupId);

		if (visitGroupCode == null) {
			visitGroupImpl.setVisitGroupCode("");
		}
		else {
			visitGroupImpl.setVisitGroupCode(visitGroupCode);
		}

		if (name == null) {
			visitGroupImpl.setName("");
		}
		else {
			visitGroupImpl.setName(name);
		}

		if (description == null) {
			visitGroupImpl.setDescription("");
		}
		else {
			visitGroupImpl.setDescription(description);
		}

		visitGroupImpl.setActiveStatus(activeStatus);

		if (activeDate == Long.MIN_VALUE) {
			visitGroupImpl.setActiveDate(null);
		}
		else {
			visitGroupImpl.setActiveDate(new Date(activeDate));
		}

		visitGroupImpl.resetOriginalValues();

		return visitGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		visitGroupId = objectInput.readLong();

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

		expGroupId = objectInput.readLong();
		visitGroupCode = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		activeStatus = objectInput.readInt();
		activeDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(visitGroupId);

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

		objectOutput.writeLong(expGroupId);

		if (visitGroupCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(visitGroupCode);
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

		objectOutput.writeInt(activeStatus);
		objectOutput.writeLong(activeDate);
	}

	public String uuid;
	public long visitGroupId;
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
	public long expGroupId;
	public String visitGroupCode;
	public String name;
	public String description;
	public int activeStatus;
	public long activeDate;

}
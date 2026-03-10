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

import com.dhsoft.edc.backend.model.EdcLock;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EdcLock in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EdcLockCacheModel implements CacheModel<EdcLock>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EdcLockCacheModel)) {
			return false;
		}

		EdcLockCacheModel edcLockCacheModel = (EdcLockCacheModel)object;

		if (lockId == edcLockCacheModel.lockId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lockId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", lockId=");
		sb.append(lockId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", lockType=");
		sb.append(lockType);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EdcLock toEntityModel() {
		EdcLockImpl edcLockImpl = new EdcLockImpl();

		if (uuid == null) {
			edcLockImpl.setUuid("");
		}
		else {
			edcLockImpl.setUuid(uuid);
		}

		edcLockImpl.setLockId(lockId);
		edcLockImpl.setCompanyId(companyId);
		edcLockImpl.setGroupId(groupId);
		edcLockImpl.setProjectId(projectId);
		edcLockImpl.setClassNameId(classNameId);
		edcLockImpl.setClassPK(classPK);

		if (lockType == null) {
			edcLockImpl.setLockType("");
		}
		else {
			edcLockImpl.setLockType(lockType);
		}

		edcLockImpl.setUserId(userId);

		if (userName == null) {
			edcLockImpl.setUserName("");
		}
		else {
			edcLockImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			edcLockImpl.setCreateDate(null);
		}
		else {
			edcLockImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			edcLockImpl.setModifiedDate(null);
		}
		else {
			edcLockImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (comment == null) {
			edcLockImpl.setComment("");
		}
		else {
			edcLockImpl.setComment(comment);
		}

		if (startDate == Long.MIN_VALUE) {
			edcLockImpl.setStartDate(null);
		}
		else {
			edcLockImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			edcLockImpl.setEndDate(null);
		}
		else {
			edcLockImpl.setEndDate(new Date(endDate));
		}

		edcLockImpl.resetOriginalValues();

		return edcLockImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		lockId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		projectId = objectInput.readLong();

		classNameId = objectInput.readLong();

		classPK = objectInput.readLong();
		lockType = objectInput.readUTF();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comment = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(lockId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(classNameId);

		objectOutput.writeLong(classPK);

		if (lockType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lockType);
		}

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (comment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comment);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
	}

	public String uuid;
	public long lockId;
	public long companyId;
	public long groupId;
	public long projectId;
	public long classNameId;
	public long classPK;
	public String lockType;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String comment;
	public long startDate;
	public long endDate;

}
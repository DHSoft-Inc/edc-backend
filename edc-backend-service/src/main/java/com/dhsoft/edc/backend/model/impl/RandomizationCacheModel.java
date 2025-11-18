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

import com.dhsoft.edc.backend.model.Randomization;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Randomization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RandomizationCacheModel
	implements CacheModel<Randomization>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RandomizationCacheModel)) {
			return false;
		}

		RandomizationCacheModel randomizationCacheModel =
			(RandomizationCacheModel)object;

		if (randomizationId == randomizationCacheModel.randomizationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, randomizationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", randomizationId=");
		sb.append(randomizationId);
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
		sb.append(", randomNo=");
		sb.append(randomNo);
		sb.append(", useStatus=");
		sb.append(useStatus);
		sb.append(", sourceType=");
		sb.append(sourceType);
		sb.append(", criteria=");
		sb.append(criteria);
		sb.append(", expGroupId=");
		sb.append(expGroupId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Randomization toEntityModel() {
		RandomizationImpl randomizationImpl = new RandomizationImpl();

		if (uuid == null) {
			randomizationImpl.setUuid("");
		}
		else {
			randomizationImpl.setUuid(uuid);
		}

		randomizationImpl.setRandomizationId(randomizationId);
		randomizationImpl.setGroupId(groupId);
		randomizationImpl.setCompanyId(companyId);
		randomizationImpl.setProjectId(projectId);
		randomizationImpl.setUserId(userId);

		if (userName == null) {
			randomizationImpl.setUserName("");
		}
		else {
			randomizationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			randomizationImpl.setCreateDate(null);
		}
		else {
			randomizationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			randomizationImpl.setModifiedDate(null);
		}
		else {
			randomizationImpl.setModifiedDate(new Date(modifiedDate));
		}

		randomizationImpl.setStatus(status);
		randomizationImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			randomizationImpl.setStatusByUserName("");
		}
		else {
			randomizationImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			randomizationImpl.setStatusDate(null);
		}
		else {
			randomizationImpl.setStatusDate(new Date(statusDate));
		}

		if (randomNo == null) {
			randomizationImpl.setRandomNo("");
		}
		else {
			randomizationImpl.setRandomNo(randomNo);
		}

		randomizationImpl.setUseStatus(useStatus);
		randomizationImpl.setSourceType(sourceType);

		if (criteria == null) {
			randomizationImpl.setCriteria("");
		}
		else {
			randomizationImpl.setCriteria(criteria);
		}

		randomizationImpl.setExpGroupId(expGroupId);

		randomizationImpl.resetOriginalValues();

		return randomizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		randomizationId = objectInput.readLong();

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
		randomNo = objectInput.readUTF();

		useStatus = objectInput.readInt();

		sourceType = objectInput.readInt();
		criteria = objectInput.readUTF();

		expGroupId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(randomizationId);

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

		if (randomNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(randomNo);
		}

		objectOutput.writeInt(useStatus);

		objectOutput.writeInt(sourceType);

		if (criteria == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(criteria);
		}

		objectOutput.writeLong(expGroupId);
	}

	public String uuid;
	public long randomizationId;
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
	public String randomNo;
	public int useStatus;
	public int sourceType;
	public String criteria;
	public long expGroupId;

}
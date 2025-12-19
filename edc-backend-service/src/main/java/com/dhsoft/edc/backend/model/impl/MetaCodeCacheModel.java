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

import com.dhsoft.edc.backend.model.MetaCode;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MetaCode in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MetaCodeCacheModel
	implements CacheModel<MetaCode>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MetaCodeCacheModel)) {
			return false;
		}

		MetaCodeCacheModel metaCodeCacheModel = (MetaCodeCacheModel)object;

		if (metaCodeId == metaCodeCacheModel.metaCodeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, metaCodeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", metaCodeId=");
		sb.append(metaCodeId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", label=");
		sb.append(label);
		sb.append(", valueType=");
		sb.append(valueType);
		sb.append(", value=");
		sb.append(value);
		sb.append(", active=");
		sb.append(active);
		sb.append(", inactiveDate=");
		sb.append(inactiveDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MetaCode toEntityModel() {
		MetaCodeImpl metaCodeImpl = new MetaCodeImpl();

		if (uuid == null) {
			metaCodeImpl.setUuid("");
		}
		else {
			metaCodeImpl.setUuid(uuid);
		}

		metaCodeImpl.setMetaCodeId(metaCodeId);
		metaCodeImpl.setGroupId(groupId);
		metaCodeImpl.setCompanyId(companyId);
		metaCodeImpl.setProjectId(projectId);
		metaCodeImpl.setUserId(userId);

		if (userName == null) {
			metaCodeImpl.setUserName("");
		}
		else {
			metaCodeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			metaCodeImpl.setCreateDate(null);
		}
		else {
			metaCodeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			metaCodeImpl.setModifiedDate(null);
		}
		else {
			metaCodeImpl.setModifiedDate(new Date(modifiedDate));
		}

		metaCodeImpl.setStatus(status);
		metaCodeImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			metaCodeImpl.setStatusByUserName("");
		}
		else {
			metaCodeImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			metaCodeImpl.setStatusDate(null);
		}
		else {
			metaCodeImpl.setStatusDate(new Date(statusDate));
		}

		if (groupCode == null) {
			metaCodeImpl.setGroupCode("");
		}
		else {
			metaCodeImpl.setGroupCode(groupCode);
		}

		if (code == null) {
			metaCodeImpl.setCode("");
		}
		else {
			metaCodeImpl.setCode(code);
		}

		if (label == null) {
			metaCodeImpl.setLabel("");
		}
		else {
			metaCodeImpl.setLabel(label);
		}

		if (valueType == null) {
			metaCodeImpl.setValueType("");
		}
		else {
			metaCodeImpl.setValueType(valueType);
		}

		if (value == null) {
			metaCodeImpl.setValue("");
		}
		else {
			metaCodeImpl.setValue(value);
		}

		metaCodeImpl.setActive(active);

		if (inactiveDate == Long.MIN_VALUE) {
			metaCodeImpl.setInactiveDate(null);
		}
		else {
			metaCodeImpl.setInactiveDate(new Date(inactiveDate));
		}

		metaCodeImpl.resetOriginalValues();

		return metaCodeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		metaCodeId = objectInput.readLong();

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
		code = objectInput.readUTF();
		label = objectInput.readUTF();
		valueType = objectInput.readUTF();
		value = objectInput.readUTF();

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

		objectOutput.writeLong(metaCodeId);

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

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (label == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(label);
		}

		if (valueType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueType);
		}

		if (value == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(value);
		}

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(inactiveDate);
	}

	public String uuid;
	public long metaCodeId;
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
	public String code;
	public String label;
	public String valueType;
	public String value;
	public boolean active;
	public long inactiveDate;

}
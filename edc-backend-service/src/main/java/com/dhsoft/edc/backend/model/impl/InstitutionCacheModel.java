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

import com.dhsoft.edc.backend.model.Institution;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Institution in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstitutionCacheModel
	implements CacheModel<Institution>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InstitutionCacheModel)) {
			return false;
		}

		InstitutionCacheModel institutionCacheModel =
			(InstitutionCacheModel)object;

		if (institutionId == institutionCacheModel.institutionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, institutionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", institutionId=");
		sb.append(institutionId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", enName=");
		sb.append(enName);
		sb.append(", type=");
		sb.append(type);
		sb.append(", piName=");
		sb.append(piName);
		sb.append(", contactNum=");
		sb.append(contactNum);
		sb.append(", email=");
		sb.append(email);
		sb.append(", irbDate=");
		sb.append(irbDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Institution toEntityModel() {
		InstitutionImpl institutionImpl = new InstitutionImpl();

		if (uuid == null) {
			institutionImpl.setUuid("");
		}
		else {
			institutionImpl.setUuid(uuid);
		}

		institutionImpl.setInstitutionId(institutionId);
		institutionImpl.setGroupId(groupId);
		institutionImpl.setCompanyId(companyId);
		institutionImpl.setProjectId(projectId);
		institutionImpl.setUserId(userId);

		if (userName == null) {
			institutionImpl.setUserName("");
		}
		else {
			institutionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			institutionImpl.setCreateDate(null);
		}
		else {
			institutionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			institutionImpl.setModifiedDate(null);
		}
		else {
			institutionImpl.setModifiedDate(new Date(modifiedDate));
		}

		institutionImpl.setStatus(status);
		institutionImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			institutionImpl.setStatusByUserName("");
		}
		else {
			institutionImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			institutionImpl.setStatusDate(null);
		}
		else {
			institutionImpl.setStatusDate(new Date(statusDate));
		}

		if (code == null) {
			institutionImpl.setCode("");
		}
		else {
			institutionImpl.setCode(code);
		}

		if (name == null) {
			institutionImpl.setName("");
		}
		else {
			institutionImpl.setName(name);
		}

		if (enName == null) {
			institutionImpl.setEnName("");
		}
		else {
			institutionImpl.setEnName(enName);
		}

		institutionImpl.setType(type);

		if (piName == null) {
			institutionImpl.setPiName("");
		}
		else {
			institutionImpl.setPiName(piName);
		}

		if (contactNum == null) {
			institutionImpl.setContactNum("");
		}
		else {
			institutionImpl.setContactNum(contactNum);
		}

		if (email == null) {
			institutionImpl.setEmail("");
		}
		else {
			institutionImpl.setEmail(email);
		}

		if (irbDate == Long.MIN_VALUE) {
			institutionImpl.setIrbDate(null);
		}
		else {
			institutionImpl.setIrbDate(new Date(irbDate));
		}

		institutionImpl.resetOriginalValues();

		return institutionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		institutionId = objectInput.readLong();

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
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		enName = objectInput.readUTF();

		type = objectInput.readInt();
		piName = objectInput.readUTF();
		contactNum = objectInput.readUTF();
		email = objectInput.readUTF();
		irbDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(institutionId);

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

		if (code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (enName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enName);
		}

		objectOutput.writeInt(type);

		if (piName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(piName);
		}

		if (contactNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNum);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(irbDate);
	}

	public String uuid;
	public long institutionId;
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
	public String code;
	public String name;
	public String enName;
	public int type;
	public String piName;
	public String contactNum;
	public String email;
	public long irbDate;

}
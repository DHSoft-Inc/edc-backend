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

import com.dhsoft.edc.backend.model.SubjectVisitDefinition;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SubjectVisitDefinition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubjectVisitDefinitionCacheModel
	implements CacheModel<SubjectVisitDefinition>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SubjectVisitDefinitionCacheModel)) {
			return false;
		}

		SubjectVisitDefinitionCacheModel subjectVisitDefinitionCacheModel =
			(SubjectVisitDefinitionCacheModel)object;

		if (subjectVisitDefinitionId ==
				subjectVisitDefinitionCacheModel.subjectVisitDefinitionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subjectVisitDefinitionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", subjectVisitDefinitionId=");
		sb.append(subjectVisitDefinitionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", visitGroupId=");
		sb.append(visitGroupId);
		sb.append(", subjectId=");
		sb.append(subjectId);
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
		sb.append(", parentCode=");
		sb.append(parentCode);
		sb.append(", visitDefinitionCode=");
		sb.append(visitDefinitionCode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", order=");
		sb.append(order);
		sb.append(", extCode=");
		sb.append(extCode);
		sb.append(", anchorType=");
		sb.append(anchorType);
		sb.append(", offset=");
		sb.append(offset);
		sb.append(", windowMinus=");
		sb.append(windowMinus);
		sb.append(", windowPlus=");
		sb.append(windowPlus);
		sb.append(", type=");
		sb.append(type);
		sb.append(", repeatCount=");
		sb.append(repeatCount);
		sb.append(", visitCRFId=");
		sb.append(visitCRFId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SubjectVisitDefinition toEntityModel() {
		SubjectVisitDefinitionImpl subjectVisitDefinitionImpl =
			new SubjectVisitDefinitionImpl();

		if (uuid == null) {
			subjectVisitDefinitionImpl.setUuid("");
		}
		else {
			subjectVisitDefinitionImpl.setUuid(uuid);
		}

		subjectVisitDefinitionImpl.setSubjectVisitDefinitionId(
			subjectVisitDefinitionId);
		subjectVisitDefinitionImpl.setGroupId(groupId);
		subjectVisitDefinitionImpl.setCompanyId(companyId);
		subjectVisitDefinitionImpl.setProjectId(projectId);
		subjectVisitDefinitionImpl.setVisitGroupId(visitGroupId);
		subjectVisitDefinitionImpl.setSubjectId(subjectId);
		subjectVisitDefinitionImpl.setUserId(userId);

		if (userName == null) {
			subjectVisitDefinitionImpl.setUserName("");
		}
		else {
			subjectVisitDefinitionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			subjectVisitDefinitionImpl.setCreateDate(null);
		}
		else {
			subjectVisitDefinitionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subjectVisitDefinitionImpl.setModifiedDate(null);
		}
		else {
			subjectVisitDefinitionImpl.setModifiedDate(new Date(modifiedDate));
		}

		subjectVisitDefinitionImpl.setStatus(status);
		subjectVisitDefinitionImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			subjectVisitDefinitionImpl.setStatusByUserName("");
		}
		else {
			subjectVisitDefinitionImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			subjectVisitDefinitionImpl.setStatusDate(null);
		}
		else {
			subjectVisitDefinitionImpl.setStatusDate(new Date(statusDate));
		}

		if (parentCode == null) {
			subjectVisitDefinitionImpl.setParentCode("");
		}
		else {
			subjectVisitDefinitionImpl.setParentCode(parentCode);
		}

		if (visitDefinitionCode == null) {
			subjectVisitDefinitionImpl.setVisitDefinitionCode("");
		}
		else {
			subjectVisitDefinitionImpl.setVisitDefinitionCode(
				visitDefinitionCode);
		}

		if (name == null) {
			subjectVisitDefinitionImpl.setName("");
		}
		else {
			subjectVisitDefinitionImpl.setName(name);
		}

		if (order == null) {
			subjectVisitDefinitionImpl.setOrder("");
		}
		else {
			subjectVisitDefinitionImpl.setOrder(order);
		}

		if (extCode == null) {
			subjectVisitDefinitionImpl.setExtCode("");
		}
		else {
			subjectVisitDefinitionImpl.setExtCode(extCode);
		}

		if (anchorType == null) {
			subjectVisitDefinitionImpl.setAnchorType("");
		}
		else {
			subjectVisitDefinitionImpl.setAnchorType(anchorType);
		}

		subjectVisitDefinitionImpl.setOffset(offset);
		subjectVisitDefinitionImpl.setWindowMinus(windowMinus);
		subjectVisitDefinitionImpl.setWindowPlus(windowPlus);
		subjectVisitDefinitionImpl.setType(type);
		subjectVisitDefinitionImpl.setRepeatCount(repeatCount);
		subjectVisitDefinitionImpl.setVisitCRFId(visitCRFId);

		subjectVisitDefinitionImpl.resetOriginalValues();

		return subjectVisitDefinitionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		subjectVisitDefinitionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		visitGroupId = objectInput.readLong();

		subjectId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		parentCode = objectInput.readUTF();
		visitDefinitionCode = objectInput.readUTF();
		name = objectInput.readUTF();
		order = objectInput.readUTF();
		extCode = objectInput.readUTF();
		anchorType = objectInput.readUTF();

		offset = objectInput.readInt();

		windowMinus = objectInput.readInt();

		windowPlus = objectInput.readInt();

		type = objectInput.readInt();

		repeatCount = objectInput.readInt();

		visitCRFId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(subjectVisitDefinitionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(visitGroupId);

		objectOutput.writeLong(subjectId);

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

		if (parentCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parentCode);
		}

		if (visitDefinitionCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(visitDefinitionCode);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (order == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(order);
		}

		if (extCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extCode);
		}

		if (anchorType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(anchorType);
		}

		objectOutput.writeInt(offset);

		objectOutput.writeInt(windowMinus);

		objectOutput.writeInt(windowPlus);

		objectOutput.writeInt(type);

		objectOutput.writeInt(repeatCount);

		objectOutput.writeLong(visitCRFId);
	}

	public String uuid;
	public long subjectVisitDefinitionId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long visitGroupId;
	public long subjectId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String parentCode;
	public String visitDefinitionCode;
	public String name;
	public String order;
	public String extCode;
	public String anchorType;
	public int offset;
	public int windowMinus;
	public int windowPlus;
	public int type;
	public int repeatCount;
	public long visitCRFId;

}
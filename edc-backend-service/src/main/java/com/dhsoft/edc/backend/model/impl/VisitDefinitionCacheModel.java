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

import com.dhsoft.edc.backend.model.VisitDefinition;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VisitDefinition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitDefinitionCacheModel
	implements CacheModel<VisitDefinition>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VisitDefinitionCacheModel)) {
			return false;
		}

		VisitDefinitionCacheModel visitDefinitionCacheModel =
			(VisitDefinitionCacheModel)object;

		if (visitDefinitionId == visitDefinitionCacheModel.visitDefinitionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, visitDefinitionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", visitGroupId=");
		sb.append(visitGroupId);
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
		sb.append(", visitDefinitionCode=");
		sb.append(visitDefinitionCode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", order=");
		sb.append(order);
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
	public VisitDefinition toEntityModel() {
		VisitDefinitionImpl visitDefinitionImpl = new VisitDefinitionImpl();

		if (uuid == null) {
			visitDefinitionImpl.setUuid("");
		}
		else {
			visitDefinitionImpl.setUuid(uuid);
		}

		visitDefinitionImpl.setVisitDefinitionId(visitDefinitionId);
		visitDefinitionImpl.setGroupId(groupId);
		visitDefinitionImpl.setCompanyId(companyId);
		visitDefinitionImpl.setProjectId(projectId);
		visitDefinitionImpl.setVisitGroupId(visitGroupId);
		visitDefinitionImpl.setUserId(userId);

		if (userName == null) {
			visitDefinitionImpl.setUserName("");
		}
		else {
			visitDefinitionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			visitDefinitionImpl.setCreateDate(null);
		}
		else {
			visitDefinitionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			visitDefinitionImpl.setModifiedDate(null);
		}
		else {
			visitDefinitionImpl.setModifiedDate(new Date(modifiedDate));
		}

		visitDefinitionImpl.setStatus(status);
		visitDefinitionImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			visitDefinitionImpl.setStatusByUserName("");
		}
		else {
			visitDefinitionImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			visitDefinitionImpl.setStatusDate(null);
		}
		else {
			visitDefinitionImpl.setStatusDate(new Date(statusDate));
		}

		if (visitDefinitionCode == null) {
			visitDefinitionImpl.setVisitDefinitionCode("");
		}
		else {
			visitDefinitionImpl.setVisitDefinitionCode(visitDefinitionCode);
		}

		if (name == null) {
			visitDefinitionImpl.setName("");
		}
		else {
			visitDefinitionImpl.setName(name);
		}

		visitDefinitionImpl.setOrder(order);

		if (anchorType == null) {
			visitDefinitionImpl.setAnchorType("");
		}
		else {
			visitDefinitionImpl.setAnchorType(anchorType);
		}

		visitDefinitionImpl.setOffset(offset);
		visitDefinitionImpl.setWindowMinus(windowMinus);
		visitDefinitionImpl.setWindowPlus(windowPlus);
		visitDefinitionImpl.setType(type);
		visitDefinitionImpl.setRepeatCount(repeatCount);
		visitDefinitionImpl.setVisitCRFId(visitCRFId);

		visitDefinitionImpl.resetOriginalValues();

		return visitDefinitionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		visitDefinitionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		visitGroupId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		visitDefinitionCode = objectInput.readUTF();
		name = objectInput.readUTF();

		order = objectInput.readInt();
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

		objectOutput.writeLong(visitDefinitionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(visitGroupId);

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

		objectOutput.writeInt(order);

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
	public long visitDefinitionId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long visitGroupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String visitDefinitionCode;
	public String name;
	public int order;
	public String anchorType;
	public int offset;
	public int windowMinus;
	public int windowPlus;
	public int type;
	public int repeatCount;
	public long visitCRFId;

}
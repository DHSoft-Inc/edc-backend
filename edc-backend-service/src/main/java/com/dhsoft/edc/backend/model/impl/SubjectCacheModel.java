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

import com.dhsoft.edc.backend.model.Subject;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Subject in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubjectCacheModel implements CacheModel<Subject>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SubjectCacheModel)) {
			return false;
		}

		SubjectCacheModel subjectCacheModel = (SubjectCacheModel)object;

		if (subjectId == subjectCacheModel.subjectId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subjectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", subjectId=");
		sb.append(subjectId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", institutionId=");
		sb.append(institutionId);
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
		sb.append(", serialId=");
		sb.append(serialId);
		sb.append(", randomNo=");
		sb.append(randomNo);
		sb.append(", name=");
		sb.append(name);
		sb.append(", subjectStatus=");
		sb.append(subjectStatus);
		sb.append(", subjectStatusApplyDate=");
		sb.append(subjectStatusApplyDate);
		sb.append(", consentAgreeDate=");
		sb.append(consentAgreeDate);
		sb.append(", expGroupId=");
		sb.append(expGroupId);
		sb.append(", applyDate=");
		sb.append(applyDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Subject toEntityModel() {
		SubjectImpl subjectImpl = new SubjectImpl();

		if (uuid == null) {
			subjectImpl.setUuid("");
		}
		else {
			subjectImpl.setUuid(uuid);
		}

		subjectImpl.setSubjectId(subjectId);
		subjectImpl.setGroupId(groupId);
		subjectImpl.setCompanyId(companyId);
		subjectImpl.setProjectId(projectId);
		subjectImpl.setInstitutionId(institutionId);
		subjectImpl.setUserId(userId);

		if (userName == null) {
			subjectImpl.setUserName("");
		}
		else {
			subjectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			subjectImpl.setCreateDate(null);
		}
		else {
			subjectImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subjectImpl.setModifiedDate(null);
		}
		else {
			subjectImpl.setModifiedDate(new Date(modifiedDate));
		}

		subjectImpl.setStatus(status);
		subjectImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			subjectImpl.setStatusByUserName("");
		}
		else {
			subjectImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			subjectImpl.setStatusDate(null);
		}
		else {
			subjectImpl.setStatusDate(new Date(statusDate));
		}

		if (serialId == null) {
			subjectImpl.setSerialId("");
		}
		else {
			subjectImpl.setSerialId(serialId);
		}

		if (randomNo == null) {
			subjectImpl.setRandomNo("");
		}
		else {
			subjectImpl.setRandomNo(randomNo);
		}

		if (name == null) {
			subjectImpl.setName("");
		}
		else {
			subjectImpl.setName(name);
		}

		subjectImpl.setSubjectStatus(subjectStatus);

		if (subjectStatusApplyDate == Long.MIN_VALUE) {
			subjectImpl.setSubjectStatusApplyDate(null);
		}
		else {
			subjectImpl.setSubjectStatusApplyDate(
				new Date(subjectStatusApplyDate));
		}

		if (consentAgreeDate == Long.MIN_VALUE) {
			subjectImpl.setConsentAgreeDate(null);
		}
		else {
			subjectImpl.setConsentAgreeDate(new Date(consentAgreeDate));
		}

		subjectImpl.setExpGroupId(expGroupId);

		if (applyDate == Long.MIN_VALUE) {
			subjectImpl.setApplyDate(null);
		}
		else {
			subjectImpl.setApplyDate(new Date(applyDate));
		}

		subjectImpl.resetOriginalValues();

		return subjectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		subjectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		institutionId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		serialId = objectInput.readUTF();
		randomNo = objectInput.readUTF();
		name = objectInput.readUTF();

		subjectStatus = objectInput.readInt();
		subjectStatusApplyDate = objectInput.readLong();
		consentAgreeDate = objectInput.readLong();

		expGroupId = objectInput.readLong();
		applyDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(subjectId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(institutionId);

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

		if (serialId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialId);
		}

		if (randomNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(randomNo);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(subjectStatus);
		objectOutput.writeLong(subjectStatusApplyDate);
		objectOutput.writeLong(consentAgreeDate);

		objectOutput.writeLong(expGroupId);
		objectOutput.writeLong(applyDate);
	}

	public String uuid;
	public long subjectId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long institutionId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String serialId;
	public String randomNo;
	public String name;
	public int subjectStatus;
	public long subjectStatusApplyDate;
	public long consentAgreeDate;
	public long expGroupId;
	public long applyDate;

}
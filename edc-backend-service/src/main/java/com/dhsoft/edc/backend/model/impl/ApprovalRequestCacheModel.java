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

import com.dhsoft.edc.backend.model.ApprovalRequest;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ApprovalRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ApprovalRequestCacheModel
	implements CacheModel<ApprovalRequest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ApprovalRequestCacheModel)) {
			return false;
		}

		ApprovalRequestCacheModel approvalRequestCacheModel =
			(ApprovalRequestCacheModel)object;

		if (approvalRequestId == approvalRequestCacheModel.approvalRequestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, approvalRequestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", approvalRequestId=");
		sb.append(approvalRequestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", requestUserId=");
		sb.append(requestUserId);
		sb.append(", requestUserName=");
		sb.append(requestUserName);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", targetUsersId=");
		sb.append(targetUsersId);
		sb.append(", className=");
		sb.append(className);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApprovalRequest toEntityModel() {
		ApprovalRequestImpl approvalRequestImpl = new ApprovalRequestImpl();

		if (uuid == null) {
			approvalRequestImpl.setUuid("");
		}
		else {
			approvalRequestImpl.setUuid(uuid);
		}

		approvalRequestImpl.setApprovalRequestId(approvalRequestId);
		approvalRequestImpl.setGroupId(groupId);
		approvalRequestImpl.setCompanyId(companyId);
		approvalRequestImpl.setProjectId(projectId);
		approvalRequestImpl.setStatus(status);
		approvalRequestImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			approvalRequestImpl.setStatusByUserName("");
		}
		else {
			approvalRequestImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			approvalRequestImpl.setStatusDate(null);
		}
		else {
			approvalRequestImpl.setStatusDate(new Date(statusDate));
		}

		approvalRequestImpl.setRequestUserId(requestUserId);

		if (requestUserName == null) {
			approvalRequestImpl.setRequestUserName("");
		}
		else {
			approvalRequestImpl.setRequestUserName(requestUserName);
		}

		if (requestDate == Long.MIN_VALUE) {
			approvalRequestImpl.setRequestDate(null);
		}
		else {
			approvalRequestImpl.setRequestDate(new Date(requestDate));
		}

		if (targetUsersId == null) {
			approvalRequestImpl.setTargetUsersId("");
		}
		else {
			approvalRequestImpl.setTargetUsersId(targetUsersId);
		}

		if (className == null) {
			approvalRequestImpl.setClassName("");
		}
		else {
			approvalRequestImpl.setClassName(className);
		}

		approvalRequestImpl.setClassPK(classPK);

		approvalRequestImpl.resetOriginalValues();

		return approvalRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		approvalRequestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();

		requestUserId = objectInput.readLong();
		requestUserName = objectInput.readUTF();
		requestDate = objectInput.readLong();
		targetUsersId = objectInput.readUTF();
		className = objectInput.readUTF();

		classPK = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(approvalRequestId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		objectOutput.writeLong(requestUserId);

		if (requestUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestUserName);
		}

		objectOutput.writeLong(requestDate);

		if (targetUsersId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(targetUsersId);
		}

		if (className == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(className);
		}

		objectOutput.writeLong(classPK);
	}

	public String uuid;
	public long approvalRequestId;
	public long groupId;
	public long companyId;
	public long projectId;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public long requestUserId;
	public String requestUserName;
	public long requestDate;
	public String targetUsersId;
	public String className;
	public long classPK;

}
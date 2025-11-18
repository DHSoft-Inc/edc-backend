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

import com.dhsoft.edc.backend.model.VisitEvent;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VisitEvent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VisitEventCacheModel
	implements CacheModel<VisitEvent>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VisitEventCacheModel)) {
			return false;
		}

		VisitEventCacheModel visitEventCacheModel =
			(VisitEventCacheModel)object;

		if (visitEventId == visitEventCacheModel.visitEventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, visitEventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", visitEventId=");
		sb.append(visitEventId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", subjectId=");
		sb.append(subjectId);
		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);
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
		sb.append(", anchorType=");
		sb.append(anchorType);
		sb.append(", anchorDate=");
		sb.append(anchorDate);
		sb.append(", offset=");
		sb.append(offset);
		sb.append(", planDate=");
		sb.append(planDate);
		sb.append(", eventDate=");
		sb.append(eventDate);
		sb.append(", deviationStatus=");
		sb.append(deviationStatus);
		sb.append(", instanceLinkObj=");
		sb.append(instanceLinkObj);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VisitEvent toEntityModel() {
		VisitEventImpl visitEventImpl = new VisitEventImpl();

		if (uuid == null) {
			visitEventImpl.setUuid("");
		}
		else {
			visitEventImpl.setUuid(uuid);
		}

		visitEventImpl.setVisitEventId(visitEventId);
		visitEventImpl.setGroupId(groupId);
		visitEventImpl.setCompanyId(companyId);
		visitEventImpl.setProjectId(projectId);
		visitEventImpl.setInstitutionId(institutionId);
		visitEventImpl.setSubjectId(subjectId);
		visitEventImpl.setVisitDefinitionId(visitDefinitionId);
		visitEventImpl.setUserId(userId);

		if (userName == null) {
			visitEventImpl.setUserName("");
		}
		else {
			visitEventImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			visitEventImpl.setCreateDate(null);
		}
		else {
			visitEventImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			visitEventImpl.setModifiedDate(null);
		}
		else {
			visitEventImpl.setModifiedDate(new Date(modifiedDate));
		}

		visitEventImpl.setStatus(status);
		visitEventImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			visitEventImpl.setStatusByUserName("");
		}
		else {
			visitEventImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			visitEventImpl.setStatusDate(null);
		}
		else {
			visitEventImpl.setStatusDate(new Date(statusDate));
		}

		if (anchorType == null) {
			visitEventImpl.setAnchorType("");
		}
		else {
			visitEventImpl.setAnchorType(anchorType);
		}

		if (anchorDate == Long.MIN_VALUE) {
			visitEventImpl.setAnchorDate(null);
		}
		else {
			visitEventImpl.setAnchorDate(new Date(anchorDate));
		}

		visitEventImpl.setOffset(offset);

		if (planDate == Long.MIN_VALUE) {
			visitEventImpl.setPlanDate(null);
		}
		else {
			visitEventImpl.setPlanDate(new Date(planDate));
		}

		if (eventDate == Long.MIN_VALUE) {
			visitEventImpl.setEventDate(null);
		}
		else {
			visitEventImpl.setEventDate(new Date(eventDate));
		}

		if (deviationStatus == null) {
			visitEventImpl.setDeviationStatus("");
		}
		else {
			visitEventImpl.setDeviationStatus(deviationStatus);
		}

		if (instanceLinkObj == null) {
			visitEventImpl.setInstanceLinkObj("");
		}
		else {
			visitEventImpl.setInstanceLinkObj(instanceLinkObj);
		}

		visitEventImpl.resetOriginalValues();

		return visitEventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		visitEventId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		institutionId = objectInput.readLong();

		subjectId = objectInput.readLong();

		visitDefinitionId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		anchorType = objectInput.readUTF();
		anchorDate = objectInput.readLong();

		offset = objectInput.readInt();
		planDate = objectInput.readLong();
		eventDate = objectInput.readLong();
		deviationStatus = objectInput.readUTF();
		instanceLinkObj = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(visitEventId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(institutionId);

		objectOutput.writeLong(subjectId);

		objectOutput.writeLong(visitDefinitionId);

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

		if (anchorType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(anchorType);
		}

		objectOutput.writeLong(anchorDate);

		objectOutput.writeInt(offset);
		objectOutput.writeLong(planDate);
		objectOutput.writeLong(eventDate);

		if (deviationStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deviationStatus);
		}

		if (instanceLinkObj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(instanceLinkObj);
		}
	}

	public String uuid;
	public long visitEventId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long institutionId;
	public long subjectId;
	public long visitDefinitionId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String anchorType;
	public long anchorDate;
	public int offset;
	public long planDate;
	public long eventDate;
	public String deviationStatus;
	public String instanceLinkObj;

}
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

import com.dhsoft.edc.backend.model.InstanceLink;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InstanceLink in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstanceLinkCacheModel
	implements CacheModel<InstanceLink>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InstanceLinkCacheModel)) {
			return false;
		}

		InstanceLinkCacheModel instanceLinkCacheModel =
			(InstanceLinkCacheModel)object;

		if (linkId == instanceLinkCacheModel.linkId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, linkId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", linkId=");
		sb.append(linkId);
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
		sb.append(", subjectId=");
		sb.append(subjectId);
		sb.append(", visitGroupId=");
		sb.append(visitGroupId);
		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);
		sb.append(", visitCRFId=");
		sb.append(visitCRFId);
		sb.append(", subCRFId=");
		sb.append(subCRFId);
		sb.append(", instanceId=");
		sb.append(instanceId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InstanceLink toEntityModel() {
		InstanceLinkImpl instanceLinkImpl = new InstanceLinkImpl();

		if (uuid == null) {
			instanceLinkImpl.setUuid("");
		}
		else {
			instanceLinkImpl.setUuid(uuid);
		}

		instanceLinkImpl.setLinkId(linkId);
		instanceLinkImpl.setGroupId(groupId);
		instanceLinkImpl.setCompanyId(companyId);
		instanceLinkImpl.setProjectId(projectId);
		instanceLinkImpl.setInstitutionId(institutionId);
		instanceLinkImpl.setUserId(userId);

		if (userName == null) {
			instanceLinkImpl.setUserName("");
		}
		else {
			instanceLinkImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			instanceLinkImpl.setCreateDate(null);
		}
		else {
			instanceLinkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			instanceLinkImpl.setModifiedDate(null);
		}
		else {
			instanceLinkImpl.setModifiedDate(new Date(modifiedDate));
		}

		instanceLinkImpl.setSubjectId(subjectId);
		instanceLinkImpl.setVisitGroupId(visitGroupId);
		instanceLinkImpl.setVisitDefinitionId(visitDefinitionId);
		instanceLinkImpl.setVisitCRFId(visitCRFId);
		instanceLinkImpl.setSubCRFId(subCRFId);
		instanceLinkImpl.setInstanceId(instanceId);

		instanceLinkImpl.resetOriginalValues();

		return instanceLinkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		linkId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		institutionId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		subjectId = objectInput.readLong();

		visitGroupId = objectInput.readLong();

		visitDefinitionId = objectInput.readLong();

		visitCRFId = objectInput.readLong();

		subCRFId = objectInput.readLong();

		instanceId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(linkId);

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

		objectOutput.writeLong(subjectId);

		objectOutput.writeLong(visitGroupId);

		objectOutput.writeLong(visitDefinitionId);

		objectOutput.writeLong(visitCRFId);

		objectOutput.writeLong(subCRFId);

		objectOutput.writeLong(instanceId);
	}

	public String uuid;
	public long linkId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long institutionId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long subjectId;
	public long visitGroupId;
	public long visitDefinitionId;
	public long visitCRFId;
	public long subCRFId;
	public long instanceId;

}
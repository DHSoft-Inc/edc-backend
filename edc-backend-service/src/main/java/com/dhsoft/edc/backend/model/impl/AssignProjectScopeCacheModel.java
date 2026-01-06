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

import com.dhsoft.edc.backend.model.AssignProjectScope;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssignProjectScope in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssignProjectScopeCacheModel
	implements CacheModel<AssignProjectScope>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssignProjectScopeCacheModel)) {
			return false;
		}

		AssignProjectScopeCacheModel assignProjectScopeCacheModel =
			(AssignProjectScopeCacheModel)object;

		if (projectScopeId == assignProjectScopeCacheModel.projectScopeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, projectScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", projectScopeId=");
		sb.append(projectScopeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", researcherId=");
		sb.append(researcherId);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append(", targetUserId=");
		sb.append(targetUserId);
		sb.append(", scopeRole=");
		sb.append(scopeRole);
		sb.append(", active=");
		sb.append(active);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssignProjectScope toEntityModel() {
		AssignProjectScopeImpl assignProjectScopeImpl =
			new AssignProjectScopeImpl();

		if (uuid == null) {
			assignProjectScopeImpl.setUuid("");
		}
		else {
			assignProjectScopeImpl.setUuid(uuid);
		}

		assignProjectScopeImpl.setProjectScopeId(projectScopeId);
		assignProjectScopeImpl.setCompanyId(companyId);
		assignProjectScopeImpl.setGroupId(groupId);
		assignProjectScopeImpl.setInstitutionId(institutionId);
		assignProjectScopeImpl.setResearcherId(researcherId);
		assignProjectScopeImpl.setProjectId(projectId);
		assignProjectScopeImpl.setTargetUserId(targetUserId);

		if (scopeRole == null) {
			assignProjectScopeImpl.setScopeRole("");
		}
		else {
			assignProjectScopeImpl.setScopeRole(scopeRole);
		}

		assignProjectScopeImpl.setActive(active);

		if (createDate == Long.MIN_VALUE) {
			assignProjectScopeImpl.setCreateDate(null);
		}
		else {
			assignProjectScopeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assignProjectScopeImpl.setModifiedDate(null);
		}
		else {
			assignProjectScopeImpl.setModifiedDate(new Date(modifiedDate));
		}

		assignProjectScopeImpl.setCreatedBy(createdBy);
		assignProjectScopeImpl.setModifiedBy(modifiedBy);

		assignProjectScopeImpl.resetOriginalValues();

		return assignProjectScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		projectScopeId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		institutionId = objectInput.readLong();

		researcherId = objectInput.readLong();

		projectId = objectInput.readLong();

		targetUserId = objectInput.readLong();
		scopeRole = objectInput.readUTF();

		active = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdBy = objectInput.readLong();

		modifiedBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(projectScopeId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(institutionId);

		objectOutput.writeLong(researcherId);

		objectOutput.writeLong(projectId);

		objectOutput.writeLong(targetUserId);

		if (scopeRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scopeRole);
		}

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdBy);

		objectOutput.writeLong(modifiedBy);
	}

	public String uuid;
	public long projectScopeId;
	public long companyId;
	public long groupId;
	public long institutionId;
	public long researcherId;
	public long projectId;
	public long targetUserId;
	public String scopeRole;
	public boolean active;
	public long createDate;
	public long modifiedDate;
	public long createdBy;
	public long modifiedBy;

}
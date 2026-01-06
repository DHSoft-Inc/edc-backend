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

import com.dhsoft.edc.backend.model.AssignInstitutionRole;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssignInstitutionRole in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssignInstitutionRoleCacheModel
	implements CacheModel<AssignInstitutionRole>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssignInstitutionRoleCacheModel)) {
			return false;
		}

		AssignInstitutionRoleCacheModel assignInstitutionRoleCacheModel =
			(AssignInstitutionRoleCacheModel)object;

		if (institutionRoleId ==
				assignInstitutionRoleCacheModel.institutionRoleId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, institutionRoleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", institutionRoleId=");
		sb.append(institutionRoleId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", researcherId=");
		sb.append(researcherId);
		sb.append(", targetUserId=");
		sb.append(targetUserId);
		sb.append(", roleName=");
		sb.append(roleName);
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
	public AssignInstitutionRole toEntityModel() {
		AssignInstitutionRoleImpl assignInstitutionRoleImpl =
			new AssignInstitutionRoleImpl();

		if (uuid == null) {
			assignInstitutionRoleImpl.setUuid("");
		}
		else {
			assignInstitutionRoleImpl.setUuid(uuid);
		}

		assignInstitutionRoleImpl.setInstitutionRoleId(institutionRoleId);
		assignInstitutionRoleImpl.setCompanyId(companyId);
		assignInstitutionRoleImpl.setGroupId(groupId);
		assignInstitutionRoleImpl.setInstitutionId(institutionId);
		assignInstitutionRoleImpl.setResearcherId(researcherId);
		assignInstitutionRoleImpl.setTargetUserId(targetUserId);

		if (roleName == null) {
			assignInstitutionRoleImpl.setRoleName("");
		}
		else {
			assignInstitutionRoleImpl.setRoleName(roleName);
		}

		assignInstitutionRoleImpl.setActive(active);

		if (createDate == Long.MIN_VALUE) {
			assignInstitutionRoleImpl.setCreateDate(null);
		}
		else {
			assignInstitutionRoleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assignInstitutionRoleImpl.setModifiedDate(null);
		}
		else {
			assignInstitutionRoleImpl.setModifiedDate(new Date(modifiedDate));
		}

		assignInstitutionRoleImpl.setCreatedBy(createdBy);
		assignInstitutionRoleImpl.setModifiedBy(modifiedBy);

		assignInstitutionRoleImpl.resetOriginalValues();

		return assignInstitutionRoleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		institutionRoleId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		institutionId = objectInput.readLong();

		researcherId = objectInput.readLong();

		targetUserId = objectInput.readLong();
		roleName = objectInput.readUTF();

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

		objectOutput.writeLong(institutionRoleId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(institutionId);

		objectOutput.writeLong(researcherId);

		objectOutput.writeLong(targetUserId);

		if (roleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleName);
		}

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdBy);

		objectOutput.writeLong(modifiedBy);
	}

	public String uuid;
	public long institutionRoleId;
	public long companyId;
	public long groupId;
	public long institutionId;
	public long researcherId;
	public long targetUserId;
	public String roleName;
	public boolean active;
	public long createDate;
	public long modifiedDate;
	public long createdBy;
	public long modifiedBy;

}
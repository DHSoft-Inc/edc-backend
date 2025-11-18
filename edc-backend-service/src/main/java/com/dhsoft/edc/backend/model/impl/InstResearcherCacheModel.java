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

import com.dhsoft.edc.backend.model.InstResearcher;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InstResearcher in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InstResearcherCacheModel
	implements CacheModel<InstResearcher>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InstResearcherCacheModel)) {
			return false;
		}

		InstResearcherCacheModel instResearcherCacheModel =
			(InstResearcherCacheModel)object;

		if (institutionResearcherId ==
				instResearcherCacheModel.institutionResearcherId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, institutionResearcherId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", institutionResearcherId=");
		sb.append(institutionResearcherId);
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
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", researcherId=");
		sb.append(researcherId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InstResearcher toEntityModel() {
		InstResearcherImpl instResearcherImpl = new InstResearcherImpl();

		if (uuid == null) {
			instResearcherImpl.setUuid("");
		}
		else {
			instResearcherImpl.setUuid(uuid);
		}

		instResearcherImpl.setInstitutionResearcherId(institutionResearcherId);
		instResearcherImpl.setGroupId(groupId);
		instResearcherImpl.setCompanyId(companyId);
		instResearcherImpl.setProjectId(projectId);
		instResearcherImpl.setUserId(userId);

		if (userName == null) {
			instResearcherImpl.setUserName("");
		}
		else {
			instResearcherImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			instResearcherImpl.setCreateDate(null);
		}
		else {
			instResearcherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			instResearcherImpl.setModifiedDate(null);
		}
		else {
			instResearcherImpl.setModifiedDate(new Date(modifiedDate));
		}

		instResearcherImpl.setInstitutionId(institutionId);
		instResearcherImpl.setResearcherId(researcherId);

		instResearcherImpl.resetOriginalValues();

		return instResearcherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		institutionResearcherId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		institutionId = objectInput.readLong();

		researcherId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(institutionResearcherId);

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

		objectOutput.writeLong(institutionId);

		objectOutput.writeLong(researcherId);
	}

	public String uuid;
	public long institutionResearcherId;
	public long groupId;
	public long companyId;
	public long projectId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long institutionId;
	public long researcherId;

}
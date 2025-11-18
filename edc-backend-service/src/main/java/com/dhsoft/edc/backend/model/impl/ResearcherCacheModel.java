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

import com.dhsoft.edc.backend.model.Researcher;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Researcher in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResearcherCacheModel
	implements CacheModel<Researcher>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ResearcherCacheModel)) {
			return false;
		}

		ResearcherCacheModel researcherCacheModel =
			(ResearcherCacheModel)object;

		if (researcherId == researcherCacheModel.researcherId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, researcherId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", researcherId=");
		sb.append(researcherId);
		sb.append(", companyId=");
		sb.append(companyId);
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
		sb.append(", email=");
		sb.append(email);
		sb.append(", name=");
		sb.append(name);
		sb.append(", isInstitutionManual=");
		sb.append(isInstitutionManual);
		sb.append(", institution=");
		sb.append(institution);
		sb.append(", officeContact=");
		sb.append(officeContact);
		sb.append(", position=");
		sb.append(position);
		sb.append(", privacyAgree=");
		sb.append(privacyAgree);
		sb.append(", termOfUseAgree=");
		sb.append(termOfUseAgree);
		sb.append(", researcherUserId=");
		sb.append(researcherUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Researcher toEntityModel() {
		ResearcherImpl researcherImpl = new ResearcherImpl();

		if (uuid == null) {
			researcherImpl.setUuid("");
		}
		else {
			researcherImpl.setUuid(uuid);
		}

		researcherImpl.setResearcherId(researcherId);
		researcherImpl.setCompanyId(companyId);
		researcherImpl.setUserId(userId);

		if (userName == null) {
			researcherImpl.setUserName("");
		}
		else {
			researcherImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			researcherImpl.setCreateDate(null);
		}
		else {
			researcherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			researcherImpl.setModifiedDate(null);
		}
		else {
			researcherImpl.setModifiedDate(new Date(modifiedDate));
		}

		researcherImpl.setStatus(status);
		researcherImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			researcherImpl.setStatusByUserName("");
		}
		else {
			researcherImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			researcherImpl.setStatusDate(null);
		}
		else {
			researcherImpl.setStatusDate(new Date(statusDate));
		}

		if (email == null) {
			researcherImpl.setEmail("");
		}
		else {
			researcherImpl.setEmail(email);
		}

		if (name == null) {
			researcherImpl.setName("");
		}
		else {
			researcherImpl.setName(name);
		}

		if (isInstitutionManual == null) {
			researcherImpl.setIsInstitutionManual("");
		}
		else {
			researcherImpl.setIsInstitutionManual(isInstitutionManual);
		}

		if (institution == null) {
			researcherImpl.setInstitution("");
		}
		else {
			researcherImpl.setInstitution(institution);
		}

		if (officeContact == null) {
			researcherImpl.setOfficeContact("");
		}
		else {
			researcherImpl.setOfficeContact(officeContact);
		}

		if (position == null) {
			researcherImpl.setPosition("");
		}
		else {
			researcherImpl.setPosition(position);
		}

		if (privacyAgree == null) {
			researcherImpl.setPrivacyAgree("");
		}
		else {
			researcherImpl.setPrivacyAgree(privacyAgree);
		}

		if (termOfUseAgree == null) {
			researcherImpl.setTermOfUseAgree("");
		}
		else {
			researcherImpl.setTermOfUseAgree(termOfUseAgree);
		}

		researcherImpl.setResearcherUserId(researcherUserId);

		researcherImpl.resetOriginalValues();

		return researcherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		researcherId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		email = objectInput.readUTF();
		name = objectInput.readUTF();
		isInstitutionManual = objectInput.readUTF();
		institution = objectInput.readUTF();
		officeContact = objectInput.readUTF();
		position = objectInput.readUTF();
		privacyAgree = objectInput.readUTF();
		termOfUseAgree = objectInput.readUTF();

		researcherUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(researcherId);

		objectOutput.writeLong(companyId);

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

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (isInstitutionManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isInstitutionManual);
		}

		if (institution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(institution);
		}

		if (officeContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeContact);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (privacyAgree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(privacyAgree);
		}

		if (termOfUseAgree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(termOfUseAgree);
		}

		objectOutput.writeLong(researcherUserId);
	}

	public String uuid;
	public long researcherId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String email;
	public String name;
	public String isInstitutionManual;
	public String institution;
	public String officeContact;
	public String position;
	public String privacyAgree;
	public String termOfUseAgree;
	public long researcherUserId;

}
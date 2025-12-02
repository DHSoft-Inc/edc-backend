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

import com.dhsoft.edc.backend.model.QueryLink;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QueryLink in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QueryLinkCacheModel
	implements CacheModel<QueryLink>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QueryLinkCacheModel)) {
			return false;
		}

		QueryLinkCacheModel queryLinkCacheModel = (QueryLinkCacheModel)object;

		if (queryId == queryLinkCacheModel.queryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, queryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", queryId=");
		sb.append(queryId);
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
		sb.append(", itemCode=");
		sb.append(itemCode);
		sb.append(", sourceType=");
		sb.append(sourceType);
		sb.append(", ruleId=");
		sb.append(ruleId);
		sb.append(", ruleInfo=");
		sb.append(ruleInfo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QueryLink toEntityModel() {
		QueryLinkImpl queryLinkImpl = new QueryLinkImpl();

		if (uuid == null) {
			queryLinkImpl.setUuid("");
		}
		else {
			queryLinkImpl.setUuid(uuid);
		}

		queryLinkImpl.setQueryId(queryId);
		queryLinkImpl.setGroupId(groupId);
		queryLinkImpl.setCompanyId(companyId);
		queryLinkImpl.setProjectId(projectId);
		queryLinkImpl.setUserId(userId);

		if (userName == null) {
			queryLinkImpl.setUserName("");
		}
		else {
			queryLinkImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			queryLinkImpl.setCreateDate(null);
		}
		else {
			queryLinkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			queryLinkImpl.setModifiedDate(null);
		}
		else {
			queryLinkImpl.setModifiedDate(new Date(modifiedDate));
		}

		queryLinkImpl.setSubjectId(subjectId);
		queryLinkImpl.setVisitGroupId(visitGroupId);
		queryLinkImpl.setVisitDefinitionId(visitDefinitionId);
		queryLinkImpl.setVisitCRFId(visitCRFId);
		queryLinkImpl.setSubCRFId(subCRFId);
		queryLinkImpl.setInstanceId(instanceId);
		queryLinkImpl.setItemCode(itemCode);

		if (sourceType == null) {
			queryLinkImpl.setSourceType("");
		}
		else {
			queryLinkImpl.setSourceType(sourceType);
		}

		queryLinkImpl.setRuleId(ruleId);

		if (ruleInfo == null) {
			queryLinkImpl.setRuleInfo("");
		}
		else {
			queryLinkImpl.setRuleInfo(ruleInfo);
		}

		queryLinkImpl.resetOriginalValues();

		return queryLinkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		queryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		projectId = objectInput.readLong();

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

		itemCode = objectInput.readLong();
		sourceType = objectInput.readUTF();

		ruleId = objectInput.readLong();
		ruleInfo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(queryId);

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

		objectOutput.writeLong(subjectId);

		objectOutput.writeLong(visitGroupId);

		objectOutput.writeLong(visitDefinitionId);

		objectOutput.writeLong(visitCRFId);

		objectOutput.writeLong(subCRFId);

		objectOutput.writeLong(instanceId);

		objectOutput.writeLong(itemCode);

		if (sourceType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceType);
		}

		objectOutput.writeLong(ruleId);

		if (ruleInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ruleInfo);
		}
	}

	public String uuid;
	public long queryId;
	public long groupId;
	public long companyId;
	public long projectId;
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
	public long itemCode;
	public String sourceType;
	public long ruleId;
	public String ruleInfo;

}
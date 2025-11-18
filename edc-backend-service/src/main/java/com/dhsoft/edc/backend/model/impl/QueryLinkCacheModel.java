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
		StringBundler sb = new StringBundler(79);

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
		sb.append(", scope=");
		sb.append(scope);
		sb.append(", isTypeManual=");
		sb.append(isTypeManual);
		sb.append(", type=");
		sb.append(type);
		sb.append(", openUserId=");
		sb.append(openUserId);
		sb.append(", openUserName=");
		sb.append(openUserName);
		sb.append(", openDate=");
		sb.append(openDate);
		sb.append(", openComment=");
		sb.append(openComment);
		sb.append(", answerUserID=");
		sb.append(answerUserID);
		sb.append(", answerUserName=");
		sb.append(answerUserName);
		sb.append(", answerDate=");
		sb.append(answerDate);
		sb.append(", answerComment=");
		sb.append(answerComment);
		sb.append(", closeUserID=");
		sb.append(closeUserID);
		sb.append(", closeUserName=");
		sb.append(closeUserName);
		sb.append(", closeDate=");
		sb.append(closeDate);
		sb.append(", closeComment=");
		sb.append(closeComment);
		sb.append(", queryStatus=");
		sb.append(queryStatus);
		sb.append(", isReopen=");
		sb.append(isReopen);
		sb.append(", reopenId=");
		sb.append(reopenId);
		sb.append(", ruleId=");
		sb.append(ruleId);
		sb.append(", ruleInfo=");
		sb.append(ruleInfo);
		sb.append(", activeStatus=");
		sb.append(activeStatus);
		sb.append(", inactiveDate=");
		sb.append(inactiveDate);
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

		if (scope == null) {
			queryLinkImpl.setScope("");
		}
		else {
			queryLinkImpl.setScope(scope);
		}

		if (isTypeManual == null) {
			queryLinkImpl.setIsTypeManual("");
		}
		else {
			queryLinkImpl.setIsTypeManual(isTypeManual);
		}

		if (type == null) {
			queryLinkImpl.setType("");
		}
		else {
			queryLinkImpl.setType(type);
		}

		queryLinkImpl.setOpenUserId(openUserId);

		if (openUserName == null) {
			queryLinkImpl.setOpenUserName("");
		}
		else {
			queryLinkImpl.setOpenUserName(openUserName);
		}

		if (openDate == Long.MIN_VALUE) {
			queryLinkImpl.setOpenDate(null);
		}
		else {
			queryLinkImpl.setOpenDate(new Date(openDate));
		}

		if (openComment == null) {
			queryLinkImpl.setOpenComment("");
		}
		else {
			queryLinkImpl.setOpenComment(openComment);
		}

		queryLinkImpl.setAnswerUserID(answerUserID);

		if (answerUserName == null) {
			queryLinkImpl.setAnswerUserName("");
		}
		else {
			queryLinkImpl.setAnswerUserName(answerUserName);
		}

		if (answerDate == Long.MIN_VALUE) {
			queryLinkImpl.setAnswerDate(null);
		}
		else {
			queryLinkImpl.setAnswerDate(new Date(answerDate));
		}

		if (answerComment == null) {
			queryLinkImpl.setAnswerComment("");
		}
		else {
			queryLinkImpl.setAnswerComment(answerComment);
		}

		queryLinkImpl.setCloseUserID(closeUserID);

		if (closeUserName == null) {
			queryLinkImpl.setCloseUserName("");
		}
		else {
			queryLinkImpl.setCloseUserName(closeUserName);
		}

		if (closeDate == Long.MIN_VALUE) {
			queryLinkImpl.setCloseDate(null);
		}
		else {
			queryLinkImpl.setCloseDate(new Date(closeDate));
		}

		if (closeComment == null) {
			queryLinkImpl.setCloseComment("");
		}
		else {
			queryLinkImpl.setCloseComment(closeComment);
		}

		queryLinkImpl.setQueryStatus(queryStatus);

		if (isReopen == null) {
			queryLinkImpl.setIsReopen("");
		}
		else {
			queryLinkImpl.setIsReopen(isReopen);
		}

		queryLinkImpl.setReopenId(reopenId);
		queryLinkImpl.setRuleId(ruleId);

		if (ruleInfo == null) {
			queryLinkImpl.setRuleInfo("");
		}
		else {
			queryLinkImpl.setRuleInfo(ruleInfo);
		}

		queryLinkImpl.setActiveStatus(activeStatus);

		if (inactiveDate == Long.MIN_VALUE) {
			queryLinkImpl.setInactiveDate(null);
		}
		else {
			queryLinkImpl.setInactiveDate(new Date(inactiveDate));
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
		scope = objectInput.readUTF();
		isTypeManual = objectInput.readUTF();
		type = objectInput.readUTF();

		openUserId = objectInput.readLong();
		openUserName = objectInput.readUTF();
		openDate = objectInput.readLong();
		openComment = objectInput.readUTF();

		answerUserID = objectInput.readLong();
		answerUserName = objectInput.readUTF();
		answerDate = objectInput.readLong();
		answerComment = objectInput.readUTF();

		closeUserID = objectInput.readLong();
		closeUserName = objectInput.readUTF();
		closeDate = objectInput.readLong();
		closeComment = objectInput.readUTF();

		queryStatus = objectInput.readInt();
		isReopen = objectInput.readUTF();

		reopenId = objectInput.readLong();

		ruleId = objectInput.readLong();
		ruleInfo = objectInput.readUTF();

		activeStatus = objectInput.readInt();
		inactiveDate = objectInput.readLong();
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

		if (scope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scope);
		}

		if (isTypeManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isTypeManual);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(openUserId);

		if (openUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(openUserName);
		}

		objectOutput.writeLong(openDate);

		if (openComment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(openComment);
		}

		objectOutput.writeLong(answerUserID);

		if (answerUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answerUserName);
		}

		objectOutput.writeLong(answerDate);

		if (answerComment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answerComment);
		}

		objectOutput.writeLong(closeUserID);

		if (closeUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(closeUserName);
		}

		objectOutput.writeLong(closeDate);

		if (closeComment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(closeComment);
		}

		objectOutput.writeInt(queryStatus);

		if (isReopen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isReopen);
		}

		objectOutput.writeLong(reopenId);

		objectOutput.writeLong(ruleId);

		if (ruleInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ruleInfo);
		}

		objectOutput.writeInt(activeStatus);
		objectOutput.writeLong(inactiveDate);
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
	public String scope;
	public String isTypeManual;
	public String type;
	public long openUserId;
	public String openUserName;
	public long openDate;
	public String openComment;
	public long answerUserID;
	public String answerUserName;
	public long answerDate;
	public String answerComment;
	public long closeUserID;
	public String closeUserName;
	public long closeDate;
	public String closeComment;
	public int queryStatus;
	public String isReopen;
	public long reopenId;
	public long ruleId;
	public String ruleInfo;
	public int activeStatus;
	public long inactiveDate;

}
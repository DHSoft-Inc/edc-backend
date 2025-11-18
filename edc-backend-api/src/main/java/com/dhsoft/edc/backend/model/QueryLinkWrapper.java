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

package com.dhsoft.edc.backend.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QueryLink}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLink
 * @generated
 */
public class QueryLinkWrapper
	extends BaseModelWrapper<QueryLink>
	implements ModelWrapper<QueryLink>, QueryLink {

	public QueryLinkWrapper(QueryLink queryLink) {
		super(queryLink);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("queryId", getQueryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("subjectId", getSubjectId());
		attributes.put("visitGroupId", getVisitGroupId());
		attributes.put("visitDefinitionId", getVisitDefinitionId());
		attributes.put("visitCRFId", getVisitCRFId());
		attributes.put("subCRFId", getSubCRFId());
		attributes.put("instanceId", getInstanceId());
		attributes.put("itemCode", getItemCode());
		attributes.put("sourceType", getSourceType());
		attributes.put("scope", getScope());
		attributes.put("isTypeManual", getIsTypeManual());
		attributes.put("type", getType());
		attributes.put("openUserId", getOpenUserId());
		attributes.put("openUserName", getOpenUserName());
		attributes.put("openDate", getOpenDate());
		attributes.put("openComment", getOpenComment());
		attributes.put("answerUserID", getAnswerUserID());
		attributes.put("answerUserName", getAnswerUserName());
		attributes.put("answerDate", getAnswerDate());
		attributes.put("answerComment", getAnswerComment());
		attributes.put("closeUserID", getCloseUserID());
		attributes.put("closeUserName", getCloseUserName());
		attributes.put("closeDate", getCloseDate());
		attributes.put("closeComment", getCloseComment());
		attributes.put("queryStatus", getQueryStatus());
		attributes.put("isReopen", getIsReopen());
		attributes.put("reopenId", getReopenId());
		attributes.put("ruleId", getRuleId());
		attributes.put("ruleInfo", getRuleInfo());
		attributes.put("activeStatus", getActiveStatus());
		attributes.put("inactiveDate", getInactiveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long queryId = (Long)attributes.get("queryId");

		if (queryId != null) {
			setQueryId(queryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long subjectId = (Long)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		Long visitGroupId = (Long)attributes.get("visitGroupId");

		if (visitGroupId != null) {
			setVisitGroupId(visitGroupId);
		}

		Long visitDefinitionId = (Long)attributes.get("visitDefinitionId");

		if (visitDefinitionId != null) {
			setVisitDefinitionId(visitDefinitionId);
		}

		Long visitCRFId = (Long)attributes.get("visitCRFId");

		if (visitCRFId != null) {
			setVisitCRFId(visitCRFId);
		}

		Long subCRFId = (Long)attributes.get("subCRFId");

		if (subCRFId != null) {
			setSubCRFId(subCRFId);
		}

		Long instanceId = (Long)attributes.get("instanceId");

		if (instanceId != null) {
			setInstanceId(instanceId);
		}

		Long itemCode = (Long)attributes.get("itemCode");

		if (itemCode != null) {
			setItemCode(itemCode);
		}

		String sourceType = (String)attributes.get("sourceType");

		if (sourceType != null) {
			setSourceType(sourceType);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String isTypeManual = (String)attributes.get("isTypeManual");

		if (isTypeManual != null) {
			setIsTypeManual(isTypeManual);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long openUserId = (Long)attributes.get("openUserId");

		if (openUserId != null) {
			setOpenUserId(openUserId);
		}

		String openUserName = (String)attributes.get("openUserName");

		if (openUserName != null) {
			setOpenUserName(openUserName);
		}

		Date openDate = (Date)attributes.get("openDate");

		if (openDate != null) {
			setOpenDate(openDate);
		}

		String openComment = (String)attributes.get("openComment");

		if (openComment != null) {
			setOpenComment(openComment);
		}

		Long answerUserID = (Long)attributes.get("answerUserID");

		if (answerUserID != null) {
			setAnswerUserID(answerUserID);
		}

		String answerUserName = (String)attributes.get("answerUserName");

		if (answerUserName != null) {
			setAnswerUserName(answerUserName);
		}

		Date answerDate = (Date)attributes.get("answerDate");

		if (answerDate != null) {
			setAnswerDate(answerDate);
		}

		String answerComment = (String)attributes.get("answerComment");

		if (answerComment != null) {
			setAnswerComment(answerComment);
		}

		Long closeUserID = (Long)attributes.get("closeUserID");

		if (closeUserID != null) {
			setCloseUserID(closeUserID);
		}

		String closeUserName = (String)attributes.get("closeUserName");

		if (closeUserName != null) {
			setCloseUserName(closeUserName);
		}

		Date closeDate = (Date)attributes.get("closeDate");

		if (closeDate != null) {
			setCloseDate(closeDate);
		}

		String closeComment = (String)attributes.get("closeComment");

		if (closeComment != null) {
			setCloseComment(closeComment);
		}

		Integer queryStatus = (Integer)attributes.get("queryStatus");

		if (queryStatus != null) {
			setQueryStatus(queryStatus);
		}

		String isReopen = (String)attributes.get("isReopen");

		if (isReopen != null) {
			setIsReopen(isReopen);
		}

		Long reopenId = (Long)attributes.get("reopenId");

		if (reopenId != null) {
			setReopenId(reopenId);
		}

		Long ruleId = (Long)attributes.get("ruleId");

		if (ruleId != null) {
			setRuleId(ruleId);
		}

		String ruleInfo = (String)attributes.get("ruleInfo");

		if (ruleInfo != null) {
			setRuleInfo(ruleInfo);
		}

		Integer activeStatus = (Integer)attributes.get("activeStatus");

		if (activeStatus != null) {
			setActiveStatus(activeStatus);
		}

		Date inactiveDate = (Date)attributes.get("inactiveDate");

		if (inactiveDate != null) {
			setInactiveDate(inactiveDate);
		}
	}

	/**
	 * Returns the active status of this query link.
	 *
	 * @return the active status of this query link
	 */
	@Override
	public int getActiveStatus() {
		return model.getActiveStatus();
	}

	/**
	 * Returns the answer comment of this query link.
	 *
	 * @return the answer comment of this query link
	 */
	@Override
	public String getAnswerComment() {
		return model.getAnswerComment();
	}

	/**
	 * Returns the answer date of this query link.
	 *
	 * @return the answer date of this query link
	 */
	@Override
	public Date getAnswerDate() {
		return model.getAnswerDate();
	}

	/**
	 * Returns the answer user ID of this query link.
	 *
	 * @return the answer user ID of this query link
	 */
	@Override
	public long getAnswerUserID() {
		return model.getAnswerUserID();
	}

	/**
	 * Returns the answer user name of this query link.
	 *
	 * @return the answer user name of this query link
	 */
	@Override
	public String getAnswerUserName() {
		return model.getAnswerUserName();
	}

	/**
	 * Returns the close comment of this query link.
	 *
	 * @return the close comment of this query link
	 */
	@Override
	public String getCloseComment() {
		return model.getCloseComment();
	}

	/**
	 * Returns the close date of this query link.
	 *
	 * @return the close date of this query link
	 */
	@Override
	public Date getCloseDate() {
		return model.getCloseDate();
	}

	/**
	 * Returns the close user ID of this query link.
	 *
	 * @return the close user ID of this query link
	 */
	@Override
	public long getCloseUserID() {
		return model.getCloseUserID();
	}

	/**
	 * Returns the close user name of this query link.
	 *
	 * @return the close user name of this query link
	 */
	@Override
	public String getCloseUserName() {
		return model.getCloseUserName();
	}

	/**
	 * Returns the company ID of this query link.
	 *
	 * @return the company ID of this query link
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this query link.
	 *
	 * @return the create date of this query link
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this query link.
	 *
	 * @return the group ID of this query link
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the inactive date of this query link.
	 *
	 * @return the inactive date of this query link
	 */
	@Override
	public Date getInactiveDate() {
		return model.getInactiveDate();
	}

	/**
	 * Returns the instance ID of this query link.
	 *
	 * @return the instance ID of this query link
	 */
	@Override
	public long getInstanceId() {
		return model.getInstanceId();
	}

	/**
	 * Returns the is reopen of this query link.
	 *
	 * @return the is reopen of this query link
	 */
	@Override
	public String getIsReopen() {
		return model.getIsReopen();
	}

	/**
	 * Returns the is type manual of this query link.
	 *
	 * @return the is type manual of this query link
	 */
	@Override
	public String getIsTypeManual() {
		return model.getIsTypeManual();
	}

	/**
	 * Returns the item code of this query link.
	 *
	 * @return the item code of this query link
	 */
	@Override
	public long getItemCode() {
		return model.getItemCode();
	}

	/**
	 * Returns the modified date of this query link.
	 *
	 * @return the modified date of this query link
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the open comment of this query link.
	 *
	 * @return the open comment of this query link
	 */
	@Override
	public String getOpenComment() {
		return model.getOpenComment();
	}

	/**
	 * Returns the open date of this query link.
	 *
	 * @return the open date of this query link
	 */
	@Override
	public Date getOpenDate() {
		return model.getOpenDate();
	}

	/**
	 * Returns the open user ID of this query link.
	 *
	 * @return the open user ID of this query link
	 */
	@Override
	public long getOpenUserId() {
		return model.getOpenUserId();
	}

	/**
	 * Returns the open user name of this query link.
	 *
	 * @return the open user name of this query link
	 */
	@Override
	public String getOpenUserName() {
		return model.getOpenUserName();
	}

	/**
	 * Returns the open user uuid of this query link.
	 *
	 * @return the open user uuid of this query link
	 */
	@Override
	public String getOpenUserUuid() {
		return model.getOpenUserUuid();
	}

	/**
	 * Returns the primary key of this query link.
	 *
	 * @return the primary key of this query link
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this query link.
	 *
	 * @return the project ID of this query link
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the query ID of this query link.
	 *
	 * @return the query ID of this query link
	 */
	@Override
	public long getQueryId() {
		return model.getQueryId();
	}

	/**
	 * Returns the query status of this query link.
	 *
	 * @return the query status of this query link
	 */
	@Override
	public int getQueryStatus() {
		return model.getQueryStatus();
	}

	/**
	 * Returns the reopen ID of this query link.
	 *
	 * @return the reopen ID of this query link
	 */
	@Override
	public long getReopenId() {
		return model.getReopenId();
	}

	/**
	 * Returns the rule ID of this query link.
	 *
	 * @return the rule ID of this query link
	 */
	@Override
	public long getRuleId() {
		return model.getRuleId();
	}

	/**
	 * Returns the rule info of this query link.
	 *
	 * @return the rule info of this query link
	 */
	@Override
	public String getRuleInfo() {
		return model.getRuleInfo();
	}

	/**
	 * Returns the scope of this query link.
	 *
	 * @return the scope of this query link
	 */
	@Override
	public String getScope() {
		return model.getScope();
	}

	/**
	 * Returns the source type of this query link.
	 *
	 * @return the source type of this query link
	 */
	@Override
	public String getSourceType() {
		return model.getSourceType();
	}

	/**
	 * Returns the status of this query link.
	 *
	 * @return the status of this query link
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the sub crf ID of this query link.
	 *
	 * @return the sub crf ID of this query link
	 */
	@Override
	public long getSubCRFId() {
		return model.getSubCRFId();
	}

	/**
	 * Returns the subject ID of this query link.
	 *
	 * @return the subject ID of this query link
	 */
	@Override
	public long getSubjectId() {
		return model.getSubjectId();
	}

	/**
	 * Returns the trash entry created when this query link was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this query link.
	 *
	 * @return the trash entry created when this query link was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this query link.
	 *
	 * @return the class primary key of the trash entry for this query link
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this query link.
	 *
	 * @return the trash handler for this query link
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the type of this query link.
	 *
	 * @return the type of this query link
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this query link.
	 *
	 * @return the user ID of this query link
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this query link.
	 *
	 * @return the user name of this query link
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this query link.
	 *
	 * @return the user uuid of this query link
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this query link.
	 *
	 * @return the uuid of this query link
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the visit crf ID of this query link.
	 *
	 * @return the visit crf ID of this query link
	 */
	@Override
	public long getVisitCRFId() {
		return model.getVisitCRFId();
	}

	/**
	 * Returns the visit definition ID of this query link.
	 *
	 * @return the visit definition ID of this query link
	 */
	@Override
	public long getVisitDefinitionId() {
		return model.getVisitDefinitionId();
	}

	/**
	 * Returns the visit group ID of this query link.
	 *
	 * @return the visit group ID of this query link
	 */
	@Override
	public long getVisitGroupId() {
		return model.getVisitGroupId();
	}

	/**
	 * Returns <code>true</code> if this query link is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this query link is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this query link is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this query link is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer() {
		return model.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return model.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return model.isInTrashImplicitly();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the active status of this query link.
	 *
	 * @param activeStatus the active status of this query link
	 */
	@Override
	public void setActiveStatus(int activeStatus) {
		model.setActiveStatus(activeStatus);
	}

	/**
	 * Sets the answer comment of this query link.
	 *
	 * @param answerComment the answer comment of this query link
	 */
	@Override
	public void setAnswerComment(String answerComment) {
		model.setAnswerComment(answerComment);
	}

	/**
	 * Sets the answer date of this query link.
	 *
	 * @param answerDate the answer date of this query link
	 */
	@Override
	public void setAnswerDate(Date answerDate) {
		model.setAnswerDate(answerDate);
	}

	/**
	 * Sets the answer user ID of this query link.
	 *
	 * @param answerUserID the answer user ID of this query link
	 */
	@Override
	public void setAnswerUserID(long answerUserID) {
		model.setAnswerUserID(answerUserID);
	}

	/**
	 * Sets the answer user name of this query link.
	 *
	 * @param answerUserName the answer user name of this query link
	 */
	@Override
	public void setAnswerUserName(String answerUserName) {
		model.setAnswerUserName(answerUserName);
	}

	/**
	 * Sets the close comment of this query link.
	 *
	 * @param closeComment the close comment of this query link
	 */
	@Override
	public void setCloseComment(String closeComment) {
		model.setCloseComment(closeComment);
	}

	/**
	 * Sets the close date of this query link.
	 *
	 * @param closeDate the close date of this query link
	 */
	@Override
	public void setCloseDate(Date closeDate) {
		model.setCloseDate(closeDate);
	}

	/**
	 * Sets the close user ID of this query link.
	 *
	 * @param closeUserID the close user ID of this query link
	 */
	@Override
	public void setCloseUserID(long closeUserID) {
		model.setCloseUserID(closeUserID);
	}

	/**
	 * Sets the close user name of this query link.
	 *
	 * @param closeUserName the close user name of this query link
	 */
	@Override
	public void setCloseUserName(String closeUserName) {
		model.setCloseUserName(closeUserName);
	}

	/**
	 * Sets the company ID of this query link.
	 *
	 * @param companyId the company ID of this query link
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this query link.
	 *
	 * @param createDate the create date of this query link
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this query link.
	 *
	 * @param groupId the group ID of this query link
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the inactive date of this query link.
	 *
	 * @param inactiveDate the inactive date of this query link
	 */
	@Override
	public void setInactiveDate(Date inactiveDate) {
		model.setInactiveDate(inactiveDate);
	}

	/**
	 * Sets the instance ID of this query link.
	 *
	 * @param instanceId the instance ID of this query link
	 */
	@Override
	public void setInstanceId(long instanceId) {
		model.setInstanceId(instanceId);
	}

	/**
	 * Sets the is reopen of this query link.
	 *
	 * @param isReopen the is reopen of this query link
	 */
	@Override
	public void setIsReopen(String isReopen) {
		model.setIsReopen(isReopen);
	}

	/**
	 * Sets the is type manual of this query link.
	 *
	 * @param isTypeManual the is type manual of this query link
	 */
	@Override
	public void setIsTypeManual(String isTypeManual) {
		model.setIsTypeManual(isTypeManual);
	}

	/**
	 * Sets the item code of this query link.
	 *
	 * @param itemCode the item code of this query link
	 */
	@Override
	public void setItemCode(long itemCode) {
		model.setItemCode(itemCode);
	}

	/**
	 * Sets the modified date of this query link.
	 *
	 * @param modifiedDate the modified date of this query link
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the open comment of this query link.
	 *
	 * @param openComment the open comment of this query link
	 */
	@Override
	public void setOpenComment(String openComment) {
		model.setOpenComment(openComment);
	}

	/**
	 * Sets the open date of this query link.
	 *
	 * @param openDate the open date of this query link
	 */
	@Override
	public void setOpenDate(Date openDate) {
		model.setOpenDate(openDate);
	}

	/**
	 * Sets the open user ID of this query link.
	 *
	 * @param openUserId the open user ID of this query link
	 */
	@Override
	public void setOpenUserId(long openUserId) {
		model.setOpenUserId(openUserId);
	}

	/**
	 * Sets the open user name of this query link.
	 *
	 * @param openUserName the open user name of this query link
	 */
	@Override
	public void setOpenUserName(String openUserName) {
		model.setOpenUserName(openUserName);
	}

	/**
	 * Sets the open user uuid of this query link.
	 *
	 * @param openUserUuid the open user uuid of this query link
	 */
	@Override
	public void setOpenUserUuid(String openUserUuid) {
		model.setOpenUserUuid(openUserUuid);
	}

	/**
	 * Sets the primary key of this query link.
	 *
	 * @param primaryKey the primary key of this query link
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this query link.
	 *
	 * @param projectId the project ID of this query link
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the query ID of this query link.
	 *
	 * @param queryId the query ID of this query link
	 */
	@Override
	public void setQueryId(long queryId) {
		model.setQueryId(queryId);
	}

	/**
	 * Sets the query status of this query link.
	 *
	 * @param queryStatus the query status of this query link
	 */
	@Override
	public void setQueryStatus(int queryStatus) {
		model.setQueryStatus(queryStatus);
	}

	/**
	 * Sets the reopen ID of this query link.
	 *
	 * @param reopenId the reopen ID of this query link
	 */
	@Override
	public void setReopenId(long reopenId) {
		model.setReopenId(reopenId);
	}

	/**
	 * Sets the rule ID of this query link.
	 *
	 * @param ruleId the rule ID of this query link
	 */
	@Override
	public void setRuleId(long ruleId) {
		model.setRuleId(ruleId);
	}

	/**
	 * Sets the rule info of this query link.
	 *
	 * @param ruleInfo the rule info of this query link
	 */
	@Override
	public void setRuleInfo(String ruleInfo) {
		model.setRuleInfo(ruleInfo);
	}

	/**
	 * Sets the scope of this query link.
	 *
	 * @param scope the scope of this query link
	 */
	@Override
	public void setScope(String scope) {
		model.setScope(scope);
	}

	/**
	 * Sets the source type of this query link.
	 *
	 * @param sourceType the source type of this query link
	 */
	@Override
	public void setSourceType(String sourceType) {
		model.setSourceType(sourceType);
	}

	/**
	 * Sets the sub crf ID of this query link.
	 *
	 * @param subCRFId the sub crf ID of this query link
	 */
	@Override
	public void setSubCRFId(long subCRFId) {
		model.setSubCRFId(subCRFId);
	}

	/**
	 * Sets the subject ID of this query link.
	 *
	 * @param subjectId the subject ID of this query link
	 */
	@Override
	public void setSubjectId(long subjectId) {
		model.setSubjectId(subjectId);
	}

	/**
	 * Sets the type of this query link.
	 *
	 * @param type the type of this query link
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this query link.
	 *
	 * @param userId the user ID of this query link
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this query link.
	 *
	 * @param userName the user name of this query link
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this query link.
	 *
	 * @param userUuid the user uuid of this query link
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this query link.
	 *
	 * @param uuid the uuid of this query link
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the visit crf ID of this query link.
	 *
	 * @param visitCRFId the visit crf ID of this query link
	 */
	@Override
	public void setVisitCRFId(long visitCRFId) {
		model.setVisitCRFId(visitCRFId);
	}

	/**
	 * Sets the visit definition ID of this query link.
	 *
	 * @param visitDefinitionId the visit definition ID of this query link
	 */
	@Override
	public void setVisitDefinitionId(long visitDefinitionId) {
		model.setVisitDefinitionId(visitDefinitionId);
	}

	/**
	 * Sets the visit group ID of this query link.
	 *
	 * @param visitGroupId the visit group ID of this query link
	 */
	@Override
	public void setVisitGroupId(long visitGroupId) {
		model.setVisitGroupId(visitGroupId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected QueryLinkWrapper wrap(QueryLink queryLink) {
		return new QueryLinkWrapper(queryLink);
	}

}
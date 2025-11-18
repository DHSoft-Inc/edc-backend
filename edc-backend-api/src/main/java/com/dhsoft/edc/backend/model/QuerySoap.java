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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dhsoft.edc.backend.service.http.QueryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuerySoap implements Serializable {

	public static QuerySoap toSoapModel(Query model) {
		QuerySoap soapModel = new QuerySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setQueryId(model.getQueryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setProjectId(model.getProjectId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSubjectId(model.getSubjectId());
		soapModel.setVisitGroupId(model.getVisitGroupId());
		soapModel.setVisitDefinitionId(model.getVisitDefinitionId());
		soapModel.setVisitCRFId(model.getVisitCRFId());
		soapModel.setSubCRFId(model.getSubCRFId());
		soapModel.setInstanceId(model.getInstanceId());
		soapModel.setItemCode(model.getItemCode());
		soapModel.setSourceType(model.getSourceType());
		soapModel.setScope(model.getScope());
		soapModel.setIsTypeManual(model.getIsTypeManual());
		soapModel.setType(model.getType());
		soapModel.setOpenUserId(model.getOpenUserId());
		soapModel.setOpenUserName(model.getOpenUserName());
		soapModel.setOpenDate(model.getOpenDate());
		soapModel.setOpenComment(model.getOpenComment());
		soapModel.setAnswerUserID(model.getAnswerUserID());
		soapModel.setAnswerUserName(model.getAnswerUserName());
		soapModel.setAnswerDate(model.getAnswerDate());
		soapModel.setAnswerComment(model.getAnswerComment());
		soapModel.setCloseUserID(model.getCloseUserID());
		soapModel.setCloseUserName(model.getCloseUserName());
		soapModel.setCloseDate(model.getCloseDate());
		soapModel.setCloseComment(model.getCloseComment());
		soapModel.setQueryStatus(model.getQueryStatus());
		soapModel.setIsReopen(model.getIsReopen());
		soapModel.setReopenId(model.getReopenId());
		soapModel.setRuleId(model.getRuleId());
		soapModel.setRuleInfo(model.getRuleInfo());
		soapModel.setActiveStatus(model.getActiveStatus());
		soapModel.setInactiveDate(model.getInactiveDate());

		return soapModel;
	}

	public static QuerySoap[] toSoapModels(Query[] models) {
		QuerySoap[] soapModels = new QuerySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QuerySoap[][] toSoapModels(Query[][] models) {
		QuerySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QuerySoap[models.length][models[0].length];
		}
		else {
			soapModels = new QuerySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QuerySoap[] toSoapModels(List<Query> models) {
		List<QuerySoap> soapModels = new ArrayList<QuerySoap>(models.size());

		for (Query model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QuerySoap[soapModels.size()]);
	}

	public QuerySoap() {
	}

	public long getPrimaryKey() {
		return _queryId;
	}

	public void setPrimaryKey(long pk) {
		setQueryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getQueryId() {
		return _queryId;
	}

	public void setQueryId(long queryId) {
		_queryId = queryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	public long getVisitGroupId() {
		return _visitGroupId;
	}

	public void setVisitGroupId(long visitGroupId) {
		_visitGroupId = visitGroupId;
	}

	public long getVisitDefinitionId() {
		return _visitDefinitionId;
	}

	public void setVisitDefinitionId(long visitDefinitionId) {
		_visitDefinitionId = visitDefinitionId;
	}

	public long getVisitCRFId() {
		return _visitCRFId;
	}

	public void setVisitCRFId(long visitCRFId) {
		_visitCRFId = visitCRFId;
	}

	public long getSubCRFId() {
		return _subCRFId;
	}

	public void setSubCRFId(long subCRFId) {
		_subCRFId = subCRFId;
	}

	public long getInstanceId() {
		return _instanceId;
	}

	public void setInstanceId(long instanceId) {
		_instanceId = instanceId;
	}

	public long getItemCode() {
		return _itemCode;
	}

	public void setItemCode(long itemCode) {
		_itemCode = itemCode;
	}

	public String getSourceType() {
		return _sourceType;
	}

	public void setSourceType(String sourceType) {
		_sourceType = sourceType;
	}

	public String getScope() {
		return _scope;
	}

	public void setScope(String scope) {
		_scope = scope;
	}

	public String getIsTypeManual() {
		return _isTypeManual;
	}

	public void setIsTypeManual(String isTypeManual) {
		_isTypeManual = isTypeManual;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public long getOpenUserId() {
		return _openUserId;
	}

	public void setOpenUserId(long openUserId) {
		_openUserId = openUserId;
	}

	public String getOpenUserName() {
		return _openUserName;
	}

	public void setOpenUserName(String openUserName) {
		_openUserName = openUserName;
	}

	public Date getOpenDate() {
		return _openDate;
	}

	public void setOpenDate(Date openDate) {
		_openDate = openDate;
	}

	public String getOpenComment() {
		return _openComment;
	}

	public void setOpenComment(String openComment) {
		_openComment = openComment;
	}

	public long getAnswerUserID() {
		return _answerUserID;
	}

	public void setAnswerUserID(long answerUserID) {
		_answerUserID = answerUserID;
	}

	public String getAnswerUserName() {
		return _answerUserName;
	}

	public void setAnswerUserName(String answerUserName) {
		_answerUserName = answerUserName;
	}

	public Date getAnswerDate() {
		return _answerDate;
	}

	public void setAnswerDate(Date answerDate) {
		_answerDate = answerDate;
	}

	public String getAnswerComment() {
		return _answerComment;
	}

	public void setAnswerComment(String answerComment) {
		_answerComment = answerComment;
	}

	public long getCloseUserID() {
		return _closeUserID;
	}

	public void setCloseUserID(long closeUserID) {
		_closeUserID = closeUserID;
	}

	public String getCloseUserName() {
		return _closeUserName;
	}

	public void setCloseUserName(String closeUserName) {
		_closeUserName = closeUserName;
	}

	public Date getCloseDate() {
		return _closeDate;
	}

	public void setCloseDate(Date closeDate) {
		_closeDate = closeDate;
	}

	public String getCloseComment() {
		return _closeComment;
	}

	public void setCloseComment(String closeComment) {
		_closeComment = closeComment;
	}

	public int getQueryStatus() {
		return _queryStatus;
	}

	public void setQueryStatus(int queryStatus) {
		_queryStatus = queryStatus;
	}

	public String getIsReopen() {
		return _isReopen;
	}

	public void setIsReopen(String isReopen) {
		_isReopen = isReopen;
	}

	public long getReopenId() {
		return _reopenId;
	}

	public void setReopenId(long reopenId) {
		_reopenId = reopenId;
	}

	public long getRuleId() {
		return _ruleId;
	}

	public void setRuleId(long ruleId) {
		_ruleId = ruleId;
	}

	public String getRuleInfo() {
		return _ruleInfo;
	}

	public void setRuleInfo(String ruleInfo) {
		_ruleInfo = ruleInfo;
	}

	public int getActiveStatus() {
		return _activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		_activeStatus = activeStatus;
	}

	public Date getInactiveDate() {
		return _inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		_inactiveDate = inactiveDate;
	}

	private String _uuid;
	private long _queryId;
	private long _groupId;
	private long _companyId;
	private long _projectId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _subjectId;
	private long _visitGroupId;
	private long _visitDefinitionId;
	private long _visitCRFId;
	private long _subCRFId;
	private long _instanceId;
	private long _itemCode;
	private String _sourceType;
	private String _scope;
	private String _isTypeManual;
	private String _type;
	private long _openUserId;
	private String _openUserName;
	private Date _openDate;
	private String _openComment;
	private long _answerUserID;
	private String _answerUserName;
	private Date _answerDate;
	private String _answerComment;
	private long _closeUserID;
	private String _closeUserName;
	private Date _closeDate;
	private String _closeComment;
	private int _queryStatus;
	private String _isReopen;
	private long _reopenId;
	private long _ruleId;
	private String _ruleInfo;
	private int _activeStatus;
	private Date _inactiveDate;

}
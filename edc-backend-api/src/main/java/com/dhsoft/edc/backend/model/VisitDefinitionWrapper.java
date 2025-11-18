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
 * This class is a wrapper for {@link VisitDefinition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitDefinition
 * @generated
 */
public class VisitDefinitionWrapper
	extends BaseModelWrapper<VisitDefinition>
	implements ModelWrapper<VisitDefinition>, VisitDefinition {

	public VisitDefinitionWrapper(VisitDefinition visitDefinition) {
		super(visitDefinition);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("visitDefinitionId", getVisitDefinitionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("visitGroupId", getVisitGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("visitDefinitionCode", getVisitDefinitionCode());
		attributes.put("name", getName());
		attributes.put("order", getOrder());
		attributes.put("anchorType", getAnchorType());
		attributes.put("offset", getOffset());
		attributes.put("windowMinus", getWindowMinus());
		attributes.put("windowPlus", getWindowPlus());
		attributes.put("type", getType());
		attributes.put("repeatCount", getRepeatCount());
		attributes.put("visitCRFId", getVisitCRFId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long visitDefinitionId = (Long)attributes.get("visitDefinitionId");

		if (visitDefinitionId != null) {
			setVisitDefinitionId(visitDefinitionId);
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

		Long visitGroupId = (Long)attributes.get("visitGroupId");

		if (visitGroupId != null) {
			setVisitGroupId(visitGroupId);
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

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String visitDefinitionCode = (String)attributes.get(
			"visitDefinitionCode");

		if (visitDefinitionCode != null) {
			setVisitDefinitionCode(visitDefinitionCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		String anchorType = (String)attributes.get("anchorType");

		if (anchorType != null) {
			setAnchorType(anchorType);
		}

		Integer offset = (Integer)attributes.get("offset");

		if (offset != null) {
			setOffset(offset);
		}

		Integer windowMinus = (Integer)attributes.get("windowMinus");

		if (windowMinus != null) {
			setWindowMinus(windowMinus);
		}

		Integer windowPlus = (Integer)attributes.get("windowPlus");

		if (windowPlus != null) {
			setWindowPlus(windowPlus);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer repeatCount = (Integer)attributes.get("repeatCount");

		if (repeatCount != null) {
			setRepeatCount(repeatCount);
		}

		Long visitCRFId = (Long)attributes.get("visitCRFId");

		if (visitCRFId != null) {
			setVisitCRFId(visitCRFId);
		}
	}

	/**
	 * Returns the anchor type of this visit definition.
	 *
	 * @return the anchor type of this visit definition
	 */
	@Override
	public String getAnchorType() {
		return model.getAnchorType();
	}

	/**
	 * Returns the company ID of this visit definition.
	 *
	 * @return the company ID of this visit definition
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this visit definition.
	 *
	 * @return the create date of this visit definition
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this visit definition.
	 *
	 * @return the group ID of this visit definition
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this visit definition.
	 *
	 * @return the modified date of this visit definition
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this visit definition.
	 *
	 * @return the name of this visit definition
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the offset of this visit definition.
	 *
	 * @return the offset of this visit definition
	 */
	@Override
	public int getOffset() {
		return model.getOffset();
	}

	/**
	 * Returns the order of this visit definition.
	 *
	 * @return the order of this visit definition
	 */
	@Override
	public int getOrder() {
		return model.getOrder();
	}

	/**
	 * Returns the primary key of this visit definition.
	 *
	 * @return the primary key of this visit definition
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this visit definition.
	 *
	 * @return the project ID of this visit definition
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the repeat count of this visit definition.
	 *
	 * @return the repeat count of this visit definition
	 */
	@Override
	public int getRepeatCount() {
		return model.getRepeatCount();
	}

	/**
	 * Returns the status of this visit definition.
	 *
	 * @return the status of this visit definition
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this visit definition.
	 *
	 * @return the status by user ID of this visit definition
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this visit definition.
	 *
	 * @return the status by user name of this visit definition
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this visit definition.
	 *
	 * @return the status by user uuid of this visit definition
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this visit definition.
	 *
	 * @return the status date of this visit definition
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this visit definition was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this visit definition.
	 *
	 * @return the trash entry created when this visit definition was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this visit definition.
	 *
	 * @return the class primary key of the trash entry for this visit definition
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this visit definition.
	 *
	 * @return the trash handler for this visit definition
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the type of this visit definition.
	 *
	 * @return the type of this visit definition
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this visit definition.
	 *
	 * @return the user ID of this visit definition
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this visit definition.
	 *
	 * @return the user name of this visit definition
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this visit definition.
	 *
	 * @return the user uuid of this visit definition
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this visit definition.
	 *
	 * @return the uuid of this visit definition
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the visit crf ID of this visit definition.
	 *
	 * @return the visit crf ID of this visit definition
	 */
	@Override
	public long getVisitCRFId() {
		return model.getVisitCRFId();
	}

	/**
	 * Returns the visit definition code of this visit definition.
	 *
	 * @return the visit definition code of this visit definition
	 */
	@Override
	public String getVisitDefinitionCode() {
		return model.getVisitDefinitionCode();
	}

	/**
	 * Returns the visit definition ID of this visit definition.
	 *
	 * @return the visit definition ID of this visit definition
	 */
	@Override
	public long getVisitDefinitionId() {
		return model.getVisitDefinitionId();
	}

	/**
	 * Returns the visit group ID of this visit definition.
	 *
	 * @return the visit group ID of this visit definition
	 */
	@Override
	public long getVisitGroupId() {
		return model.getVisitGroupId();
	}

	/**
	 * Returns the window minus of this visit definition.
	 *
	 * @return the window minus of this visit definition
	 */
	@Override
	public int getWindowMinus() {
		return model.getWindowMinus();
	}

	/**
	 * Returns the window plus of this visit definition.
	 *
	 * @return the window plus of this visit definition
	 */
	@Override
	public int getWindowPlus() {
		return model.getWindowPlus();
	}

	/**
	 * Returns <code>true</code> if this visit definition is approved.
	 *
	 * @return <code>true</code> if this visit definition is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this visit definition is denied.
	 *
	 * @return <code>true</code> if this visit definition is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this visit definition is a draft.
	 *
	 * @return <code>true</code> if this visit definition is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this visit definition is expired.
	 *
	 * @return <code>true</code> if this visit definition is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this visit definition is inactive.
	 *
	 * @return <code>true</code> if this visit definition is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this visit definition is incomplete.
	 *
	 * @return <code>true</code> if this visit definition is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this visit definition is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this visit definition is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this visit definition is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this visit definition is in the Recycle Bin; <code>false</code> otherwise
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

	/**
	 * Returns <code>true</code> if this visit definition is pending.
	 *
	 * @return <code>true</code> if this visit definition is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this visit definition is scheduled.
	 *
	 * @return <code>true</code> if this visit definition is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the anchor type of this visit definition.
	 *
	 * @param anchorType the anchor type of this visit definition
	 */
	@Override
	public void setAnchorType(String anchorType) {
		model.setAnchorType(anchorType);
	}

	/**
	 * Sets the company ID of this visit definition.
	 *
	 * @param companyId the company ID of this visit definition
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this visit definition.
	 *
	 * @param createDate the create date of this visit definition
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this visit definition.
	 *
	 * @param groupId the group ID of this visit definition
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this visit definition.
	 *
	 * @param modifiedDate the modified date of this visit definition
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this visit definition.
	 *
	 * @param name the name of this visit definition
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the offset of this visit definition.
	 *
	 * @param offset the offset of this visit definition
	 */
	@Override
	public void setOffset(int offset) {
		model.setOffset(offset);
	}

	/**
	 * Sets the order of this visit definition.
	 *
	 * @param order the order of this visit definition
	 */
	@Override
	public void setOrder(int order) {
		model.setOrder(order);
	}

	/**
	 * Sets the primary key of this visit definition.
	 *
	 * @param primaryKey the primary key of this visit definition
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this visit definition.
	 *
	 * @param projectId the project ID of this visit definition
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the repeat count of this visit definition.
	 *
	 * @param repeatCount the repeat count of this visit definition
	 */
	@Override
	public void setRepeatCount(int repeatCount) {
		model.setRepeatCount(repeatCount);
	}

	/**
	 * Sets the status of this visit definition.
	 *
	 * @param status the status of this visit definition
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this visit definition.
	 *
	 * @param statusByUserId the status by user ID of this visit definition
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this visit definition.
	 *
	 * @param statusByUserName the status by user name of this visit definition
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this visit definition.
	 *
	 * @param statusByUserUuid the status by user uuid of this visit definition
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this visit definition.
	 *
	 * @param statusDate the status date of this visit definition
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the type of this visit definition.
	 *
	 * @param type the type of this visit definition
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this visit definition.
	 *
	 * @param userId the user ID of this visit definition
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this visit definition.
	 *
	 * @param userName the user name of this visit definition
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this visit definition.
	 *
	 * @param userUuid the user uuid of this visit definition
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this visit definition.
	 *
	 * @param uuid the uuid of this visit definition
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the visit crf ID of this visit definition.
	 *
	 * @param visitCRFId the visit crf ID of this visit definition
	 */
	@Override
	public void setVisitCRFId(long visitCRFId) {
		model.setVisitCRFId(visitCRFId);
	}

	/**
	 * Sets the visit definition code of this visit definition.
	 *
	 * @param visitDefinitionCode the visit definition code of this visit definition
	 */
	@Override
	public void setVisitDefinitionCode(String visitDefinitionCode) {
		model.setVisitDefinitionCode(visitDefinitionCode);
	}

	/**
	 * Sets the visit definition ID of this visit definition.
	 *
	 * @param visitDefinitionId the visit definition ID of this visit definition
	 */
	@Override
	public void setVisitDefinitionId(long visitDefinitionId) {
		model.setVisitDefinitionId(visitDefinitionId);
	}

	/**
	 * Sets the visit group ID of this visit definition.
	 *
	 * @param visitGroupId the visit group ID of this visit definition
	 */
	@Override
	public void setVisitGroupId(long visitGroupId) {
		model.setVisitGroupId(visitGroupId);
	}

	/**
	 * Sets the window minus of this visit definition.
	 *
	 * @param windowMinus the window minus of this visit definition
	 */
	@Override
	public void setWindowMinus(int windowMinus) {
		model.setWindowMinus(windowMinus);
	}

	/**
	 * Sets the window plus of this visit definition.
	 *
	 * @param windowPlus the window plus of this visit definition
	 */
	@Override
	public void setWindowPlus(int windowPlus) {
		model.setWindowPlus(windowPlus);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected VisitDefinitionWrapper wrap(VisitDefinition visitDefinition) {
		return new VisitDefinitionWrapper(visitDefinition);
	}

}
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
 * This class is a wrapper for {@link VisitEvent}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitEvent
 * @generated
 */
public class VisitEventWrapper
	extends BaseModelWrapper<VisitEvent>
	implements ModelWrapper<VisitEvent>, VisitEvent {

	public VisitEventWrapper(VisitEvent visitEvent) {
		super(visitEvent);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("visitEventId", getVisitEventId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("subjectId", getSubjectId());
		attributes.put("visitDefinitionId", getVisitDefinitionId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("anchorType", getAnchorType());
		attributes.put("anchorDate", getAnchorDate());
		attributes.put("offset", getOffset());
		attributes.put("planDate", getPlanDate());
		attributes.put("eventDate", getEventDate());
		attributes.put("deviationStatus", getDeviationStatus());
		attributes.put("instanceLinkObj", getInstanceLinkObj());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long visitEventId = (Long)attributes.get("visitEventId");

		if (visitEventId != null) {
			setVisitEventId(visitEventId);
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

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
		}

		Long subjectId = (Long)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		Long visitDefinitionId = (Long)attributes.get("visitDefinitionId");

		if (visitDefinitionId != null) {
			setVisitDefinitionId(visitDefinitionId);
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

		String anchorType = (String)attributes.get("anchorType");

		if (anchorType != null) {
			setAnchorType(anchorType);
		}

		Date anchorDate = (Date)attributes.get("anchorDate");

		if (anchorDate != null) {
			setAnchorDate(anchorDate);
		}

		Integer offset = (Integer)attributes.get("offset");

		if (offset != null) {
			setOffset(offset);
		}

		Date planDate = (Date)attributes.get("planDate");

		if (planDate != null) {
			setPlanDate(planDate);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		String deviationStatus = (String)attributes.get("deviationStatus");

		if (deviationStatus != null) {
			setDeviationStatus(deviationStatus);
		}

		String instanceLinkObj = (String)attributes.get("instanceLinkObj");

		if (instanceLinkObj != null) {
			setInstanceLinkObj(instanceLinkObj);
		}
	}

	/**
	 * Returns the anchor date of this visit event.
	 *
	 * @return the anchor date of this visit event
	 */
	@Override
	public Date getAnchorDate() {
		return model.getAnchorDate();
	}

	/**
	 * Returns the anchor type of this visit event.
	 *
	 * @return the anchor type of this visit event
	 */
	@Override
	public String getAnchorType() {
		return model.getAnchorType();
	}

	/**
	 * Returns the company ID of this visit event.
	 *
	 * @return the company ID of this visit event
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this visit event.
	 *
	 * @return the create date of this visit event
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the deviation status of this visit event.
	 *
	 * @return the deviation status of this visit event
	 */
	@Override
	public String getDeviationStatus() {
		return model.getDeviationStatus();
	}

	/**
	 * Returns the event date of this visit event.
	 *
	 * @return the event date of this visit event
	 */
	@Override
	public Date getEventDate() {
		return model.getEventDate();
	}

	/**
	 * Returns the group ID of this visit event.
	 *
	 * @return the group ID of this visit event
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the instance link obj of this visit event.
	 *
	 * @return the instance link obj of this visit event
	 */
	@Override
	public String getInstanceLinkObj() {
		return model.getInstanceLinkObj();
	}

	/**
	 * Returns the institution ID of this visit event.
	 *
	 * @return the institution ID of this visit event
	 */
	@Override
	public long getInstitutionId() {
		return model.getInstitutionId();
	}

	/**
	 * Returns the modified date of this visit event.
	 *
	 * @return the modified date of this visit event
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the offset of this visit event.
	 *
	 * @return the offset of this visit event
	 */
	@Override
	public int getOffset() {
		return model.getOffset();
	}

	/**
	 * Returns the plan date of this visit event.
	 *
	 * @return the plan date of this visit event
	 */
	@Override
	public Date getPlanDate() {
		return model.getPlanDate();
	}

	/**
	 * Returns the primary key of this visit event.
	 *
	 * @return the primary key of this visit event
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this visit event.
	 *
	 * @return the project ID of this visit event
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this visit event.
	 *
	 * @return the status of this visit event
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this visit event.
	 *
	 * @return the status by user ID of this visit event
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this visit event.
	 *
	 * @return the status by user name of this visit event
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this visit event.
	 *
	 * @return the status by user uuid of this visit event
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this visit event.
	 *
	 * @return the status date of this visit event
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the subject ID of this visit event.
	 *
	 * @return the subject ID of this visit event
	 */
	@Override
	public long getSubjectId() {
		return model.getSubjectId();
	}

	/**
	 * Returns the trash entry created when this visit event was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this visit event.
	 *
	 * @return the trash entry created when this visit event was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this visit event.
	 *
	 * @return the class primary key of the trash entry for this visit event
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this visit event.
	 *
	 * @return the trash handler for this visit event
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this visit event.
	 *
	 * @return the user ID of this visit event
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this visit event.
	 *
	 * @return the user name of this visit event
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this visit event.
	 *
	 * @return the user uuid of this visit event
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this visit event.
	 *
	 * @return the uuid of this visit event
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the visit definition ID of this visit event.
	 *
	 * @return the visit definition ID of this visit event
	 */
	@Override
	public long getVisitDefinitionId() {
		return model.getVisitDefinitionId();
	}

	/**
	 * Returns the visit event ID of this visit event.
	 *
	 * @return the visit event ID of this visit event
	 */
	@Override
	public long getVisitEventId() {
		return model.getVisitEventId();
	}

	/**
	 * Returns <code>true</code> if this visit event is approved.
	 *
	 * @return <code>true</code> if this visit event is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this visit event is denied.
	 *
	 * @return <code>true</code> if this visit event is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this visit event is a draft.
	 *
	 * @return <code>true</code> if this visit event is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this visit event is expired.
	 *
	 * @return <code>true</code> if this visit event is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this visit event is inactive.
	 *
	 * @return <code>true</code> if this visit event is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this visit event is incomplete.
	 *
	 * @return <code>true</code> if this visit event is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this visit event is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this visit event is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this visit event is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this visit event is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this visit event is pending.
	 *
	 * @return <code>true</code> if this visit event is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this visit event is scheduled.
	 *
	 * @return <code>true</code> if this visit event is scheduled; <code>false</code> otherwise
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
	 * Sets the anchor date of this visit event.
	 *
	 * @param anchorDate the anchor date of this visit event
	 */
	@Override
	public void setAnchorDate(Date anchorDate) {
		model.setAnchorDate(anchorDate);
	}

	/**
	 * Sets the anchor type of this visit event.
	 *
	 * @param anchorType the anchor type of this visit event
	 */
	@Override
	public void setAnchorType(String anchorType) {
		model.setAnchorType(anchorType);
	}

	/**
	 * Sets the company ID of this visit event.
	 *
	 * @param companyId the company ID of this visit event
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this visit event.
	 *
	 * @param createDate the create date of this visit event
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the deviation status of this visit event.
	 *
	 * @param deviationStatus the deviation status of this visit event
	 */
	@Override
	public void setDeviationStatus(String deviationStatus) {
		model.setDeviationStatus(deviationStatus);
	}

	/**
	 * Sets the event date of this visit event.
	 *
	 * @param eventDate the event date of this visit event
	 */
	@Override
	public void setEventDate(Date eventDate) {
		model.setEventDate(eventDate);
	}

	/**
	 * Sets the group ID of this visit event.
	 *
	 * @param groupId the group ID of this visit event
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the instance link obj of this visit event.
	 *
	 * @param instanceLinkObj the instance link obj of this visit event
	 */
	@Override
	public void setInstanceLinkObj(String instanceLinkObj) {
		model.setInstanceLinkObj(instanceLinkObj);
	}

	/**
	 * Sets the institution ID of this visit event.
	 *
	 * @param institutionId the institution ID of this visit event
	 */
	@Override
	public void setInstitutionId(long institutionId) {
		model.setInstitutionId(institutionId);
	}

	/**
	 * Sets the modified date of this visit event.
	 *
	 * @param modifiedDate the modified date of this visit event
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the offset of this visit event.
	 *
	 * @param offset the offset of this visit event
	 */
	@Override
	public void setOffset(int offset) {
		model.setOffset(offset);
	}

	/**
	 * Sets the plan date of this visit event.
	 *
	 * @param planDate the plan date of this visit event
	 */
	@Override
	public void setPlanDate(Date planDate) {
		model.setPlanDate(planDate);
	}

	/**
	 * Sets the primary key of this visit event.
	 *
	 * @param primaryKey the primary key of this visit event
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this visit event.
	 *
	 * @param projectId the project ID of this visit event
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this visit event.
	 *
	 * @param status the status of this visit event
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this visit event.
	 *
	 * @param statusByUserId the status by user ID of this visit event
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this visit event.
	 *
	 * @param statusByUserName the status by user name of this visit event
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this visit event.
	 *
	 * @param statusByUserUuid the status by user uuid of this visit event
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this visit event.
	 *
	 * @param statusDate the status date of this visit event
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the subject ID of this visit event.
	 *
	 * @param subjectId the subject ID of this visit event
	 */
	@Override
	public void setSubjectId(long subjectId) {
		model.setSubjectId(subjectId);
	}

	/**
	 * Sets the user ID of this visit event.
	 *
	 * @param userId the user ID of this visit event
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this visit event.
	 *
	 * @param userName the user name of this visit event
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this visit event.
	 *
	 * @param userUuid the user uuid of this visit event
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this visit event.
	 *
	 * @param uuid the uuid of this visit event
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the visit definition ID of this visit event.
	 *
	 * @param visitDefinitionId the visit definition ID of this visit event
	 */
	@Override
	public void setVisitDefinitionId(long visitDefinitionId) {
		model.setVisitDefinitionId(visitDefinitionId);
	}

	/**
	 * Sets the visit event ID of this visit event.
	 *
	 * @param visitEventId the visit event ID of this visit event
	 */
	@Override
	public void setVisitEventId(long visitEventId) {
		model.setVisitEventId(visitEventId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected VisitEventWrapper wrap(VisitEvent visitEvent) {
		return new VisitEventWrapper(visitEvent);
	}

}
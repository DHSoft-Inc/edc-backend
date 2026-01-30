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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ApprovalRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequest
 * @generated
 */
public class ApprovalRequestWrapper
	extends BaseModelWrapper<ApprovalRequest>
	implements ApprovalRequest, ModelWrapper<ApprovalRequest> {

	public ApprovalRequestWrapper(ApprovalRequest approvalRequest) {
		super(approvalRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("approvalRequestId", getApprovalRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("requestUserId", getRequestUserId());
		attributes.put("requestUserName", getRequestUserName());
		attributes.put("requestDate", getRequestDate());
		attributes.put("targetUsersId", getTargetUsersId());
		attributes.put("className", getClassName());
		attributes.put("classPK", getClassPK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long approvalRequestId = (Long)attributes.get("approvalRequestId");

		if (approvalRequestId != null) {
			setApprovalRequestId(approvalRequestId);
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

		Long requestUserId = (Long)attributes.get("requestUserId");

		if (requestUserId != null) {
			setRequestUserId(requestUserId);
		}

		String requestUserName = (String)attributes.get("requestUserName");

		if (requestUserName != null) {
			setRequestUserName(requestUserName);
		}

		Date requestDate = (Date)attributes.get("requestDate");

		if (requestDate != null) {
			setRequestDate(requestDate);
		}

		String targetUsersId = (String)attributes.get("targetUsersId");

		if (targetUsersId != null) {
			setTargetUsersId(targetUsersId);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}
	}

	/**
	 * Returns the approval request ID of this approval request.
	 *
	 * @return the approval request ID of this approval request
	 */
	@Override
	public long getApprovalRequestId() {
		return model.getApprovalRequestId();
	}

	/**
	 * Returns the class name of this approval request.
	 *
	 * @return the class name of this approval request
	 */
	@Override
	public String getClassName() {
		return model.getClassName();
	}

	/**
	 * Returns the class pk of this approval request.
	 *
	 * @return the class pk of this approval request
	 */
	@Override
	public long getClassPK() {
		return model.getClassPK();
	}

	/**
	 * Returns the company ID of this approval request.
	 *
	 * @return the company ID of this approval request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the group ID of this approval request.
	 *
	 * @return the group ID of this approval request
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the primary key of this approval request.
	 *
	 * @return the primary key of this approval request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this approval request.
	 *
	 * @return the project ID of this approval request
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the request date of this approval request.
	 *
	 * @return the request date of this approval request
	 */
	@Override
	public Date getRequestDate() {
		return model.getRequestDate();
	}

	/**
	 * Returns the request user ID of this approval request.
	 *
	 * @return the request user ID of this approval request
	 */
	@Override
	public long getRequestUserId() {
		return model.getRequestUserId();
	}

	/**
	 * Returns the request user name of this approval request.
	 *
	 * @return the request user name of this approval request
	 */
	@Override
	public String getRequestUserName() {
		return model.getRequestUserName();
	}

	/**
	 * Returns the request user uuid of this approval request.
	 *
	 * @return the request user uuid of this approval request
	 */
	@Override
	public String getRequestUserUuid() {
		return model.getRequestUserUuid();
	}

	/**
	 * Returns the status of this approval request.
	 *
	 * @return the status of this approval request
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this approval request.
	 *
	 * @return the status by user ID of this approval request
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this approval request.
	 *
	 * @return the status by user name of this approval request
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this approval request.
	 *
	 * @return the status by user uuid of this approval request
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this approval request.
	 *
	 * @return the status date of this approval request
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the target users ID of this approval request.
	 *
	 * @return the target users ID of this approval request
	 */
	@Override
	public String getTargetUsersId() {
		return model.getTargetUsersId();
	}

	/**
	 * Returns the trash entry created when this approval request was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this approval request.
	 *
	 * @return the trash entry created when this approval request was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this approval request.
	 *
	 * @return the class primary key of the trash entry for this approval request
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this approval request.
	 *
	 * @return the trash handler for this approval request
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the uuid of this approval request.
	 *
	 * @return the uuid of this approval request
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this approval request is approved.
	 *
	 * @return <code>true</code> if this approval request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this approval request is denied.
	 *
	 * @return <code>true</code> if this approval request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this approval request is a draft.
	 *
	 * @return <code>true</code> if this approval request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this approval request is expired.
	 *
	 * @return <code>true</code> if this approval request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this approval request is inactive.
	 *
	 * @return <code>true</code> if this approval request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this approval request is incomplete.
	 *
	 * @return <code>true</code> if this approval request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this approval request is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this approval request is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this approval request is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this approval request is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this approval request is pending.
	 *
	 * @return <code>true</code> if this approval request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this approval request is scheduled.
	 *
	 * @return <code>true</code> if this approval request is scheduled; <code>false</code> otherwise
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
	 * Sets the approval request ID of this approval request.
	 *
	 * @param approvalRequestId the approval request ID of this approval request
	 */
	@Override
	public void setApprovalRequestId(long approvalRequestId) {
		model.setApprovalRequestId(approvalRequestId);
	}

	/**
	 * Sets the class name of this approval request.
	 *
	 * @param className the class name of this approval request
	 */
	@Override
	public void setClassName(String className) {
		model.setClassName(className);
	}

	/**
	 * Sets the class pk of this approval request.
	 *
	 * @param classPK the class pk of this approval request
	 */
	@Override
	public void setClassPK(long classPK) {
		model.setClassPK(classPK);
	}

	/**
	 * Sets the company ID of this approval request.
	 *
	 * @param companyId the company ID of this approval request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the group ID of this approval request.
	 *
	 * @param groupId the group ID of this approval request
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the primary key of this approval request.
	 *
	 * @param primaryKey the primary key of this approval request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this approval request.
	 *
	 * @param projectId the project ID of this approval request
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the request date of this approval request.
	 *
	 * @param requestDate the request date of this approval request
	 */
	@Override
	public void setRequestDate(Date requestDate) {
		model.setRequestDate(requestDate);
	}

	/**
	 * Sets the request user ID of this approval request.
	 *
	 * @param requestUserId the request user ID of this approval request
	 */
	@Override
	public void setRequestUserId(long requestUserId) {
		model.setRequestUserId(requestUserId);
	}

	/**
	 * Sets the request user name of this approval request.
	 *
	 * @param requestUserName the request user name of this approval request
	 */
	@Override
	public void setRequestUserName(String requestUserName) {
		model.setRequestUserName(requestUserName);
	}

	/**
	 * Sets the request user uuid of this approval request.
	 *
	 * @param requestUserUuid the request user uuid of this approval request
	 */
	@Override
	public void setRequestUserUuid(String requestUserUuid) {
		model.setRequestUserUuid(requestUserUuid);
	}

	/**
	 * Sets the status of this approval request.
	 *
	 * @param status the status of this approval request
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this approval request.
	 *
	 * @param statusByUserId the status by user ID of this approval request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this approval request.
	 *
	 * @param statusByUserName the status by user name of this approval request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this approval request.
	 *
	 * @param statusByUserUuid the status by user uuid of this approval request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this approval request.
	 *
	 * @param statusDate the status date of this approval request
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the target users ID of this approval request.
	 *
	 * @param targetUsersId the target users ID of this approval request
	 */
	@Override
	public void setTargetUsersId(String targetUsersId) {
		model.setTargetUsersId(targetUsersId);
	}

	/**
	 * Sets the uuid of this approval request.
	 *
	 * @param uuid the uuid of this approval request
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ApprovalRequestWrapper wrap(ApprovalRequest approvalRequest) {
		return new ApprovalRequestWrapper(approvalRequest);
	}

}
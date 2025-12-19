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
 * This class is a wrapper for {@link MetaCode}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaCode
 * @generated
 */
public class MetaCodeWrapper
	extends BaseModelWrapper<MetaCode>
	implements MetaCode, ModelWrapper<MetaCode> {

	public MetaCodeWrapper(MetaCode metaCode) {
		super(metaCode);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("metaCodeId", getMetaCodeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("projectId", getProjectId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("groupCode", getGroupCode());
		attributes.put("code", getCode());
		attributes.put("label", getLabel());
		attributes.put("valueType", getValueType());
		attributes.put("value", getValue());
		attributes.put("active", getActive());
		attributes.put("inactiveDate", getInactiveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long metaCodeId = (Long)attributes.get("metaCodeId");

		if (metaCodeId != null) {
			setMetaCodeId(metaCodeId);
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

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String label = (String)attributes.get("label");

		if (label != null) {
			setLabel(label);
		}

		String valueType = (String)attributes.get("valueType");

		if (valueType != null) {
			setValueType(valueType);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date inactiveDate = (Date)attributes.get("inactiveDate");

		if (inactiveDate != null) {
			setInactiveDate(inactiveDate);
		}
	}

	/**
	 * Returns the active of this meta code.
	 *
	 * @return the active of this meta code
	 */
	@Override
	public Boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the code of this meta code.
	 *
	 * @return the code of this meta code
	 */
	@Override
	public String getCode() {
		return model.getCode();
	}

	/**
	 * Returns the company ID of this meta code.
	 *
	 * @return the company ID of this meta code
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this meta code.
	 *
	 * @return the create date of this meta code
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group code of this meta code.
	 *
	 * @return the group code of this meta code
	 */
	@Override
	public String getGroupCode() {
		return model.getGroupCode();
	}

	/**
	 * Returns the group ID of this meta code.
	 *
	 * @return the group ID of this meta code
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the inactive date of this meta code.
	 *
	 * @return the inactive date of this meta code
	 */
	@Override
	public Date getInactiveDate() {
		return model.getInactiveDate();
	}

	/**
	 * Returns the label of this meta code.
	 *
	 * @return the label of this meta code
	 */
	@Override
	public String getLabel() {
		return model.getLabel();
	}

	/**
	 * Returns the meta code ID of this meta code.
	 *
	 * @return the meta code ID of this meta code
	 */
	@Override
	public long getMetaCodeId() {
		return model.getMetaCodeId();
	}

	/**
	 * Returns the modified date of this meta code.
	 *
	 * @return the modified date of this meta code
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this meta code.
	 *
	 * @return the primary key of this meta code
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this meta code.
	 *
	 * @return the project ID of this meta code
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the status of this meta code.
	 *
	 * @return the status of this meta code
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this meta code.
	 *
	 * @return the status by user ID of this meta code
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this meta code.
	 *
	 * @return the status by user name of this meta code
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this meta code.
	 *
	 * @return the status by user uuid of this meta code
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this meta code.
	 *
	 * @return the status date of this meta code
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this meta code was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this meta code.
	 *
	 * @return the trash entry created when this meta code was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this meta code.
	 *
	 * @return the class primary key of the trash entry for this meta code
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this meta code.
	 *
	 * @return the trash handler for this meta code
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this meta code.
	 *
	 * @return the user ID of this meta code
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this meta code.
	 *
	 * @return the user name of this meta code
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this meta code.
	 *
	 * @return the user uuid of this meta code
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this meta code.
	 *
	 * @return the uuid of this meta code
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the value of this meta code.
	 *
	 * @return the value of this meta code
	 */
	@Override
	public String getValue() {
		return model.getValue();
	}

	/**
	 * Returns the value type of this meta code.
	 *
	 * @return the value type of this meta code
	 */
	@Override
	public String getValueType() {
		return model.getValueType();
	}

	/**
	 * Returns <code>true</code> if this meta code is approved.
	 *
	 * @return <code>true</code> if this meta code is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this meta code is denied.
	 *
	 * @return <code>true</code> if this meta code is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this meta code is a draft.
	 *
	 * @return <code>true</code> if this meta code is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this meta code is expired.
	 *
	 * @return <code>true</code> if this meta code is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this meta code is inactive.
	 *
	 * @return <code>true</code> if this meta code is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this meta code is incomplete.
	 *
	 * @return <code>true</code> if this meta code is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this meta code is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this meta code is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this meta code is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this meta code is in the Recycle Bin; <code>false</code> otherwise
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
	 * Returns <code>true</code> if this meta code is pending.
	 *
	 * @return <code>true</code> if this meta code is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this meta code is scheduled.
	 *
	 * @return <code>true</code> if this meta code is scheduled; <code>false</code> otherwise
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
	 * Sets the active of this meta code.
	 *
	 * @param active the active of this meta code
	 */
	@Override
	public void setActive(Boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the code of this meta code.
	 *
	 * @param code the code of this meta code
	 */
	@Override
	public void setCode(String code) {
		model.setCode(code);
	}

	/**
	 * Sets the company ID of this meta code.
	 *
	 * @param companyId the company ID of this meta code
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this meta code.
	 *
	 * @param createDate the create date of this meta code
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group code of this meta code.
	 *
	 * @param groupCode the group code of this meta code
	 */
	@Override
	public void setGroupCode(String groupCode) {
		model.setGroupCode(groupCode);
	}

	/**
	 * Sets the group ID of this meta code.
	 *
	 * @param groupId the group ID of this meta code
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the inactive date of this meta code.
	 *
	 * @param inactiveDate the inactive date of this meta code
	 */
	@Override
	public void setInactiveDate(Date inactiveDate) {
		model.setInactiveDate(inactiveDate);
	}

	/**
	 * Sets the label of this meta code.
	 *
	 * @param label the label of this meta code
	 */
	@Override
	public void setLabel(String label) {
		model.setLabel(label);
	}

	/**
	 * Sets the meta code ID of this meta code.
	 *
	 * @param metaCodeId the meta code ID of this meta code
	 */
	@Override
	public void setMetaCodeId(long metaCodeId) {
		model.setMetaCodeId(metaCodeId);
	}

	/**
	 * Sets the modified date of this meta code.
	 *
	 * @param modifiedDate the modified date of this meta code
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this meta code.
	 *
	 * @param primaryKey the primary key of this meta code
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this meta code.
	 *
	 * @param projectId the project ID of this meta code
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the status of this meta code.
	 *
	 * @param status the status of this meta code
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this meta code.
	 *
	 * @param statusByUserId the status by user ID of this meta code
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this meta code.
	 *
	 * @param statusByUserName the status by user name of this meta code
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this meta code.
	 *
	 * @param statusByUserUuid the status by user uuid of this meta code
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this meta code.
	 *
	 * @param statusDate the status date of this meta code
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this meta code.
	 *
	 * @param userId the user ID of this meta code
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this meta code.
	 *
	 * @param userName the user name of this meta code
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this meta code.
	 *
	 * @param userUuid the user uuid of this meta code
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this meta code.
	 *
	 * @param uuid the uuid of this meta code
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the value of this meta code.
	 *
	 * @param value the value of this meta code
	 */
	@Override
	public void setValue(String value) {
		model.setValue(value);
	}

	/**
	 * Sets the value type of this meta code.
	 *
	 * @param valueType the value type of this meta code
	 */
	@Override
	public void setValueType(String valueType) {
		model.setValueType(valueType);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MetaCodeWrapper wrap(MetaCode metaCode) {
		return new MetaCodeWrapper(metaCode);
	}

}
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
		attributes.put("name", getName());
		attributes.put("type", getType());
		attributes.put("group", getGroup());
		attributes.put("code", getCode());
		attributes.put("label", getLabel());
		attributes.put("valueType", getValueType());
		attributes.put("value", getValue());
		attributes.put("isActive", getIsActive());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String group = (String)attributes.get("group");

		if (group != null) {
			setGroup(group);
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

		String isActive = (String)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Date inactiveDate = (Date)attributes.get("inactiveDate");

		if (inactiveDate != null) {
			setInactiveDate(inactiveDate);
		}
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
	 * Returns the group of this meta code.
	 *
	 * @return the group of this meta code
	 */
	@Override
	public String getGroup() {
		return model.getGroup();
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
	 * Returns the is active of this meta code.
	 *
	 * @return the is active of this meta code
	 */
	@Override
	public String getIsActive() {
		return model.getIsActive();
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
	 * Returns the name of this meta code.
	 *
	 * @return the name of this meta code
	 */
	@Override
	public String getName() {
		return model.getName();
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
	 * Returns the type of this meta code.
	 *
	 * @return the type of this meta code
	 */
	@Override
	public String getType() {
		return model.getType();
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

	@Override
	public void persist() {
		model.persist();
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
	 * Sets the group of this meta code.
	 *
	 * @param group the group of this meta code
	 */
	@Override
	public void setGroup(String group) {
		model.setGroup(group);
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
	 * Sets the is active of this meta code.
	 *
	 * @param isActive the is active of this meta code
	 */
	@Override
	public void setIsActive(String isActive) {
		model.setIsActive(isActive);
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
	 * Sets the name of this meta code.
	 *
	 * @param name the name of this meta code
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
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
	 * Sets the type of this meta code.
	 *
	 * @param type the type of this meta code
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
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
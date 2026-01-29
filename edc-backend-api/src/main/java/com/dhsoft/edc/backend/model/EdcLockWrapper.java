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
 * This class is a wrapper for {@link EdcLock}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcLock
 * @generated
 */
public class EdcLockWrapper
	extends BaseModelWrapper<EdcLock>
	implements EdcLock, ModelWrapper<EdcLock> {

	public EdcLockWrapper(EdcLock edcLock) {
		super(edcLock);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("lockId", getLockId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("projectId", getProjectId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("lockType", getLockType());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("comment", getComment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long lockId = (Long)attributes.get("lockId");

		if (lockId != null) {
			setLockId(lockId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String lockType = (String)attributes.get("lockType");

		if (lockType != null) {
			setLockType(lockType);
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

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}
	}

	/**
	 * Returns the fully qualified class name of this edc lock.
	 *
	 * @return the fully qualified class name of this edc lock
	 */
	@Override
	public String getClassName() {
		return model.getClassName();
	}

	/**
	 * Returns the class name ID of this edc lock.
	 *
	 * @return the class name ID of this edc lock
	 */
	@Override
	public long getClassNameId() {
		return model.getClassNameId();
	}

	/**
	 * Returns the class pk of this edc lock.
	 *
	 * @return the class pk of this edc lock
	 */
	@Override
	public long getClassPK() {
		return model.getClassPK();
	}

	/**
	 * Returns the comment of this edc lock.
	 *
	 * @return the comment of this edc lock
	 */
	@Override
	public String getComment() {
		return model.getComment();
	}

	/**
	 * Returns the company ID of this edc lock.
	 *
	 * @return the company ID of this edc lock
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this edc lock.
	 *
	 * @return the create date of this edc lock
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this edc lock.
	 *
	 * @return the group ID of this edc lock
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the lock ID of this edc lock.
	 *
	 * @return the lock ID of this edc lock
	 */
	@Override
	public long getLockId() {
		return model.getLockId();
	}

	/**
	 * Returns the lock type of this edc lock.
	 *
	 * @return the lock type of this edc lock
	 */
	@Override
	public String getLockType() {
		return model.getLockType();
	}

	/**
	 * Returns the modified date of this edc lock.
	 *
	 * @return the modified date of this edc lock
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this edc lock.
	 *
	 * @return the primary key of this edc lock
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the project ID of this edc lock.
	 *
	 * @return the project ID of this edc lock
	 */
	@Override
	public long getProjectId() {
		return model.getProjectId();
	}

	/**
	 * Returns the user ID of this edc lock.
	 *
	 * @return the user ID of this edc lock
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this edc lock.
	 *
	 * @return the user name of this edc lock
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this edc lock.
	 *
	 * @return the user uuid of this edc lock
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this edc lock.
	 *
	 * @return the uuid of this edc lock
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void setClassName(String className) {
		model.setClassName(className);
	}

	/**
	 * Sets the class name ID of this edc lock.
	 *
	 * @param classNameId the class name ID of this edc lock
	 */
	@Override
	public void setClassNameId(long classNameId) {
		model.setClassNameId(classNameId);
	}

	/**
	 * Sets the class pk of this edc lock.
	 *
	 * @param classPK the class pk of this edc lock
	 */
	@Override
	public void setClassPK(long classPK) {
		model.setClassPK(classPK);
	}

	/**
	 * Sets the comment of this edc lock.
	 *
	 * @param comment the comment of this edc lock
	 */
	@Override
	public void setComment(String comment) {
		model.setComment(comment);
	}

	/**
	 * Sets the company ID of this edc lock.
	 *
	 * @param companyId the company ID of this edc lock
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this edc lock.
	 *
	 * @param createDate the create date of this edc lock
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this edc lock.
	 *
	 * @param groupId the group ID of this edc lock
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the lock ID of this edc lock.
	 *
	 * @param lockId the lock ID of this edc lock
	 */
	@Override
	public void setLockId(long lockId) {
		model.setLockId(lockId);
	}

	/**
	 * Sets the lock type of this edc lock.
	 *
	 * @param lockType the lock type of this edc lock
	 */
	@Override
	public void setLockType(String lockType) {
		model.setLockType(lockType);
	}

	/**
	 * Sets the modified date of this edc lock.
	 *
	 * @param modifiedDate the modified date of this edc lock
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this edc lock.
	 *
	 * @param primaryKey the primary key of this edc lock
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the project ID of this edc lock.
	 *
	 * @param projectId the project ID of this edc lock
	 */
	@Override
	public void setProjectId(long projectId) {
		model.setProjectId(projectId);
	}

	/**
	 * Sets the user ID of this edc lock.
	 *
	 * @param userId the user ID of this edc lock
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this edc lock.
	 *
	 * @param userName the user name of this edc lock
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this edc lock.
	 *
	 * @param userUuid the user uuid of this edc lock
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this edc lock.
	 *
	 * @param uuid the uuid of this edc lock
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected EdcLockWrapper wrap(EdcLock edcLock) {
		return new EdcLockWrapper(edcLock);
	}

}
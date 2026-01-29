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

package com.dhsoft.edc.backend.service.persistence;

import com.dhsoft.edc.backend.model.EdcLock;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edc lock service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.EdcLockPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcLockPersistence
 * @generated
 */
public class EdcLockUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EdcLock edcLock) {
		getPersistence().clearCache(edcLock);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, EdcLock> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EdcLock> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdcLock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdcLock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdcLock update(EdcLock edcLock) {
		return getPersistence().update(edcLock);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdcLock update(
		EdcLock edcLock, ServiceContext serviceContext) {

		return getPersistence().update(edcLock, serviceContext);
	}

	/**
	 * Returns all the edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc locks
	 */
	public static List<EdcLock> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	public static List<EdcLock> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcLock> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByUuid_First(
			String uuid, OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUuid_First(
		String uuid, OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByUuid_Last(
			String uuid, OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUuid_Last(
		String uuid, OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public static EdcLock[] findByUuid_PrevAndNext(
			long lockId, String uuid,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_PrevAndNext(
			lockId, uuid, orderByComparator);
	}

	/**
	 * Removes all the edc locks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc locks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the edc lock where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc lock that was removed
	 */
	public static EdcLock removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of edc locks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc locks
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc locks
	 */
	public static List<EdcLock> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	public static List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public static EdcLock[] findByUuid_C_PrevAndNext(
			long lockId, String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByUuid_C_PrevAndNext(
			lockId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the edc locks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc locks
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the matching edc locks
	 */
	public static List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		return getPersistence().findByP_C_C_T(
			projectId, classNameId, classPK, lockType);
	}

	/**
	 * Returns a range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	public static List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end) {

		return getPersistence().findByP_C_C_T(
			projectId, classNameId, classPK, lockType, start, end);
	}

	/**
	 * Returns an ordered range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end, OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().findByP_C_C_T(
			projectId, classNameId, classPK, lockType, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	public static List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end, OrderByComparator<EdcLock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByP_C_C_T(
			projectId, classNameId, classPK, lockType, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByP_C_C_T_First(
			long projectId, long classNameId, long classPK, String lockType,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByP_C_C_T_First(
			projectId, classNameId, classPK, lockType, orderByComparator);
	}

	/**
	 * Returns the first edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByP_C_C_T_First(
		long projectId, long classNameId, long classPK, String lockType,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByP_C_C_T_First(
			projectId, classNameId, classPK, lockType, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public static EdcLock findByP_C_C_T_Last(
			long projectId, long classNameId, long classPK, String lockType,
			OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByP_C_C_T_Last(
			projectId, classNameId, classPK, lockType, orderByComparator);
	}

	/**
	 * Returns the last edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchByP_C_C_T_Last(
		long projectId, long classNameId, long classPK, String lockType,
		OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().fetchByP_C_C_T_Last(
			projectId, classNameId, classPK, lockType, orderByComparator);
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public static EdcLock[] findByP_C_C_T_PrevAndNext(
			long lockId, long projectId, long classNameId, long classPK,
			String lockType, OrderByComparator<EdcLock> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByP_C_C_T_PrevAndNext(
			lockId, projectId, classNameId, classPK, lockType,
			orderByComparator);
	}

	/**
	 * Removes all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 */
	public static void removeByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		getPersistence().removeByP_C_C_T(
			projectId, classNameId, classPK, lockType);
	}

	/**
	 * Returns the number of edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the number of matching edc locks
	 */
	public static int countByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		return getPersistence().countByP_C_C_T(
			projectId, classNameId, classPK, lockType);
	}

	/**
	 * Caches the edc lock in the entity cache if it is enabled.
	 *
	 * @param edcLock the edc lock
	 */
	public static void cacheResult(EdcLock edcLock) {
		getPersistence().cacheResult(edcLock);
	}

	/**
	 * Caches the edc locks in the entity cache if it is enabled.
	 *
	 * @param edcLocks the edc locks
	 */
	public static void cacheResult(List<EdcLock> edcLocks) {
		getPersistence().cacheResult(edcLocks);
	}

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	public static EdcLock create(long lockId) {
		return getPersistence().create(lockId);
	}

	/**
	 * Removes the edc lock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock that was removed
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public static EdcLock remove(long lockId)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().remove(lockId);
	}

	public static EdcLock updateImpl(EdcLock edcLock) {
		return getPersistence().updateImpl(edcLock);
	}

	/**
	 * Returns the edc lock with the primary key or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public static EdcLock findByPrimaryKey(long lockId)
		throws com.dhsoft.edc.backend.exception.NoSuchEdcLockException {

		return getPersistence().findByPrimaryKey(lockId);
	}

	/**
	 * Returns the edc lock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock, or <code>null</code> if a edc lock with the primary key could not be found
	 */
	public static EdcLock fetchByPrimaryKey(long lockId) {
		return getPersistence().fetchByPrimaryKey(lockId);
	}

	/**
	 * Returns all the edc locks.
	 *
	 * @return the edc locks
	 */
	public static List<EdcLock> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of edc locks
	 */
	public static List<EdcLock> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc locks
	 */
	public static List<EdcLock> findAll(
		int start, int end, OrderByComparator<EdcLock> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc locks
	 */
	public static List<EdcLock> findAll(
		int start, int end, OrderByComparator<EdcLock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the edc locks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdcLockPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EdcLockPersistence _persistence;

}
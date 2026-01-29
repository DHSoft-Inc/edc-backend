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

import com.dhsoft.edc.backend.exception.NoSuchEdcLockException;
import com.dhsoft.edc.backend.model.EdcLock;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edc lock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcLockUtil
 * @generated
 */
@ProviderType
public interface EdcLockPersistence extends BasePersistence<EdcLock> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdcLockUtil} to access the edc lock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc locks
	 */
	public java.util.List<EdcLock> findByUuid(String uuid);

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
	public java.util.List<EdcLock> findByUuid(String uuid, int start, int end);

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
	public java.util.List<EdcLock> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public java.util.List<EdcLock> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public EdcLock findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public EdcLock findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public EdcLock[] findByUuid_PrevAndNext(
			long lockId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Removes all the edc locks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc locks
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public EdcLock findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcLockException;

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the edc lock where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc lock that was removed
	 */
	public EdcLock removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcLockException;

	/**
	 * Returns the number of edc locks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc locks
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc locks
	 */
	public java.util.List<EdcLock> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public java.util.List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public EdcLock findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	public EdcLock findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public EdcLock fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public EdcLock[] findByUuid_C_PrevAndNext(
			long lockId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Removes all the edc locks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc locks
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the matching edc locks
	 */
	public java.util.List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType);

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
	public java.util.List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end);

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
	public java.util.List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public java.util.List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator,
		boolean useFinderCache);

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
	public EdcLock findByP_C_C_T_First(
			long projectId, long classNameId, long classPK, String lockType,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

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
	public EdcLock fetchByP_C_C_T_First(
		long projectId, long classNameId, long classPK, String lockType,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public EdcLock findByP_C_C_T_Last(
			long projectId, long classNameId, long classPK, String lockType,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

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
	public EdcLock fetchByP_C_C_T_Last(
		long projectId, long classNameId, long classPK, String lockType,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public EdcLock[] findByP_C_C_T_PrevAndNext(
			long lockId, long projectId, long classNameId, long classPK,
			String lockType,
			com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
				orderByComparator)
		throws NoSuchEdcLockException;

	/**
	 * Removes all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 */
	public void removeByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType);

	/**
	 * Returns the number of edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the number of matching edc locks
	 */
	public int countByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType);

	/**
	 * Caches the edc lock in the entity cache if it is enabled.
	 *
	 * @param edcLock the edc lock
	 */
	public void cacheResult(EdcLock edcLock);

	/**
	 * Caches the edc locks in the entity cache if it is enabled.
	 *
	 * @param edcLocks the edc locks
	 */
	public void cacheResult(java.util.List<EdcLock> edcLocks);

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	public EdcLock create(long lockId);

	/**
	 * Removes the edc lock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock that was removed
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public EdcLock remove(long lockId) throws NoSuchEdcLockException;

	public EdcLock updateImpl(EdcLock edcLock);

	/**
	 * Returns the edc lock with the primary key or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	public EdcLock findByPrimaryKey(long lockId) throws NoSuchEdcLockException;

	/**
	 * Returns the edc lock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock, or <code>null</code> if a edc lock with the primary key could not be found
	 */
	public EdcLock fetchByPrimaryKey(long lockId);

	/**
	 * Returns all the edc locks.
	 *
	 * @return the edc locks
	 */
	public java.util.List<EdcLock> findAll();

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
	public java.util.List<EdcLock> findAll(int start, int end);

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
	public java.util.List<EdcLock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator);

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
	public java.util.List<EdcLock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcLock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the edc locks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	public int countAll();

}
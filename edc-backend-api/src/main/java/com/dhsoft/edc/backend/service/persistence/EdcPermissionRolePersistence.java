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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionRoleException;
import com.dhsoft.edc.backend.model.EdcPermissionRole;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edc permission role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleUtil
 * @generated
 */
@ProviderType
public interface EdcPermissionRolePersistence
	extends BasePersistence<EdcPermissionRole> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdcPermissionRoleUtil} to access the edc permission role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid(String uuid);

	/**
	 * Returns a range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole[] findByUuid_PrevAndNext(
			long permissionRoleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Removes all the edc permission roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission roles
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the edc permission role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role that was removed
	 */
	public EdcPermissionRole removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission roles
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole[] findByUuid_C_PrevAndNext(
			long permissionRoleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Removes all the edc permission roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission roles
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcProjectRole(
		long projectId);

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcProjectRole_First(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcProjectRole_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcProjectRole_Last(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcProjectRole_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole[] findByEdcProjectRole_PrevAndNext(
			long permissionRoleId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Removes all the edc permission roles where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public void removeByEdcProjectRole(long projectId);

	/**
	 * Returns the number of edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission roles
	 */
	public int countByEdcProjectRole(long projectId);

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup);

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcActorGroupRole_First(
			long projectId, long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcActorGroupRole_First(
		long projectId, long actorGroup,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcActorGroupRole_Last(
			long projectId, long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcActorGroupRole_Last(
		long projectId, long actorGroup,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole[] findByEdcActorGroupRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 */
	public void removeByEdcActorGroupRole(long projectId, long actorGroup);

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission roles
	 */
	public int countByEdcActorGroupRole(long projectId, long actorGroup);

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId);

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcActorRole_First(
			long projectId, long actorGroup, long actorId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcActorRole_First(
		long projectId, long actorGroup, long actorId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcActorRole_Last(
			long projectId, long actorGroup, long actorId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcActorRole_Last(
		long projectId, long actorGroup, long actorId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole[] findByEdcActorRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			long actorId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
				orderByComparator)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 */
	public void removeByEdcActorRole(
		long projectId, long actorGroup, long actorId);

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the number of matching edc permission roles
	 */
	public int countByEdcActorRole(
		long projectId, long actorGroup, long actorId);

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public EdcPermissionRole findByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName);

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName,
		boolean useFinderCache);

	/**
	 * Removes the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the edc permission role that was removed
	 */
	public EdcPermissionRole removeByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the number of matching edc permission roles
	 */
	public int countByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName);

	/**
	 * Caches the edc permission role in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRole the edc permission role
	 */
	public void cacheResult(EdcPermissionRole edcPermissionRole);

	/**
	 * Caches the edc permission roles in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoles the edc permission roles
	 */
	public void cacheResult(
		java.util.List<EdcPermissionRole> edcPermissionRoles);

	/**
	 * Creates a new edc permission role with the primary key. Does not add the edc permission role to the database.
	 *
	 * @param permissionRoleId the primary key for the new edc permission role
	 * @return the new edc permission role
	 */
	public EdcPermissionRole create(long permissionRoleId);

	/**
	 * Removes the edc permission role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role that was removed
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole remove(long permissionRoleId)
		throws NoSuchEdcPermissionRoleException;

	public EdcPermissionRole updateImpl(EdcPermissionRole edcPermissionRole);

	/**
	 * Returns the edc permission role with the primary key or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole findByPrimaryKey(long permissionRoleId)
		throws NoSuchEdcPermissionRoleException;

	/**
	 * Returns the edc permission role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role, or <code>null</code> if a edc permission role with the primary key could not be found
	 */
	public EdcPermissionRole fetchByPrimaryKey(long permissionRoleId);

	/**
	 * Returns all the edc permission roles.
	 *
	 * @return the edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findAll();

	/**
	 * Returns a range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission roles
	 */
	public java.util.List<EdcPermissionRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the edc permission roles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of edc permission roles.
	 *
	 * @return the number of edc permission roles
	 */
	public int countAll();

}
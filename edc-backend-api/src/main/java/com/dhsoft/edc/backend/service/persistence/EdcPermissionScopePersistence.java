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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionScopeException;
import com.dhsoft.edc.backend.model.EdcPermissionScope;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edc permission scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopeUtil
 * @generated
 */
@ProviderType
public interface EdcPermissionScopePersistence
	extends BasePersistence<EdcPermissionScope> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdcPermissionScopeUtil} to access the edc permission scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid(String uuid);

	/**
	 * Returns a range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope[] findByUuid_PrevAndNext(
			long permissionScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Removes all the edc permission scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scopes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the edc permission scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope that was removed
	 */
	public EdcPermissionScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scopes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope[] findByUuid_C_PrevAndNext(
			long permissionScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Removes all the edc permission scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scopes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcProjectScope(
		long projectId);

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcProjectScope_First(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcProjectScope_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcProjectScope_Last(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcProjectScope_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope[] findByEdcProjectScope_PrevAndNext(
			long permissionScopeId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Removes all the edc permission scopes where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public void removeByEdcProjectScope(long projectId);

	/**
	 * Returns the number of edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission scopes
	 */
	public int countByEdcProjectScope(long projectId);

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName);

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcModuleScope_First(
			long projectId, String moduleName,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcModuleScope_First(
		long projectId, String moduleName,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcModuleScope_Last(
			long projectId, String moduleName,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcModuleScope_Last(
		long projectId, String moduleName,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope[] findByEdcModuleScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 */
	public void removeByEdcModuleScope(long projectId, String moduleName);

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the number of matching edc permission scopes
	 */
	public int countByEdcModuleScope(long projectId, String moduleName);

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey);

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcTaskScope_First(
			long projectId, String moduleName, String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcTaskScope_First(
		long projectId, String moduleName, String taskKey,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcTaskScope_Last(
			long projectId, String moduleName, String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcTaskScope_Last(
		long projectId, String moduleName, String taskKey,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope[] findByEdcTaskScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
				orderByComparator)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 */
	public void removeByEdcTaskScope(
		long projectId, String moduleName, String taskKey);

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the number of matching edc permission scopes
	 */
	public int countByEdcTaskScope(
		long projectId, String moduleName, String taskKey);

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope findByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String scopeRole)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole);

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole,
		boolean useFinderCache);

	/**
	 * Removes the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the edc permission scope that was removed
	 */
	public EdcPermissionScope removeByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String scopeRole)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the number of matching edc permission scopes
	 */
	public int countByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole);

	/**
	 * Caches the edc permission scope in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScope the edc permission scope
	 */
	public void cacheResult(EdcPermissionScope edcPermissionScope);

	/**
	 * Caches the edc permission scopes in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopes the edc permission scopes
	 */
	public void cacheResult(
		java.util.List<EdcPermissionScope> edcPermissionScopes);

	/**
	 * Creates a new edc permission scope with the primary key. Does not add the edc permission scope to the database.
	 *
	 * @param permissionScopeId the primary key for the new edc permission scope
	 * @return the new edc permission scope
	 */
	public EdcPermissionScope create(long permissionScopeId);

	/**
	 * Removes the edc permission scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope that was removed
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope remove(long permissionScopeId)
		throws NoSuchEdcPermissionScopeException;

	public EdcPermissionScope updateImpl(EdcPermissionScope edcPermissionScope);

	/**
	 * Returns the edc permission scope with the primary key or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope findByPrimaryKey(long permissionScopeId)
		throws NoSuchEdcPermissionScopeException;

	/**
	 * Returns the edc permission scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope, or <code>null</code> if a edc permission scope with the primary key could not be found
	 */
	public EdcPermissionScope fetchByPrimaryKey(long permissionScopeId);

	/**
	 * Returns all the edc permission scopes.
	 *
	 * @return the edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findAll();

	/**
	 * Returns a range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission scopes
	 */
	public java.util.List<EdcPermissionScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the edc permission scopes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of edc permission scopes.
	 *
	 * @return the number of edc permission scopes
	 */
	public int countAll();

}
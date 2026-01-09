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

import com.dhsoft.edc.backend.model.EdcPermissionRole;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edc permission role service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.EdcPermissionRolePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRolePersistence
 * @generated
 */
public class EdcPermissionRoleUtil {

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
	public static void clearCache(EdcPermissionRole edcPermissionRole) {
		getPersistence().clearCache(edcPermissionRole);
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
	public static Map<Serializable, EdcPermissionRole> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EdcPermissionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdcPermissionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdcPermissionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdcPermissionRole update(
		EdcPermissionRole edcPermissionRole) {

		return getPersistence().update(edcPermissionRole);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdcPermissionRole update(
		EdcPermissionRole edcPermissionRole, ServiceContext serviceContext) {

		return getPersistence().update(edcPermissionRole, serviceContext);
	}

	/**
	 * Returns all the edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission roles
	 */
	public static List<EdcPermissionRole> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByUuid_First(
			String uuid, OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUuid_First(
		String uuid, OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByUuid_Last(
			String uuid, OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUuid_Last(
		String uuid, OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole[] findByUuid_PrevAndNext(
			long permissionRoleId, String uuid,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_PrevAndNext(
			permissionRoleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the edc permission roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission roles
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the edc permission role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role that was removed
	 */
	public static EdcPermissionRole removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission roles
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission roles
	 */
	public static List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static EdcPermissionRole[] findByUuid_C_PrevAndNext(
			long permissionRoleId, String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByUuid_C_PrevAndNext(
			permissionRoleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the edc permission roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission roles
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission roles
	 */
	public static List<EdcPermissionRole> findByEdcProjectRole(long projectId) {
		return getPersistence().findByEdcProjectRole(projectId);
	}

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
	public static List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end) {

		return getPersistence().findByEdcProjectRole(projectId, start, end);
	}

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
	public static List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findByEdcProjectRole(
			projectId, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcProjectRole(
			projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByEdcProjectRole_First(
			long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcProjectRole_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcProjectRole_First(
		long projectId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcProjectRole_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByEdcProjectRole_Last(
			long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcProjectRole_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcProjectRole_Last(
		long projectId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcProjectRole_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole[] findByEdcProjectRole_PrevAndNext(
			long permissionRoleId, long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcProjectRole_PrevAndNext(
			permissionRoleId, projectId, orderByComparator);
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public static void removeByEdcProjectRole(long projectId) {
		getPersistence().removeByEdcProjectRole(projectId);
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission roles
	 */
	public static int countByEdcProjectRole(long projectId) {
		return getPersistence().countByEdcProjectRole(projectId);
	}

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the matching edc permission roles
	 */
	public static List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup) {

		return getPersistence().findByEdcActorGroupRole(projectId, actorGroup);
	}

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
	public static List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end) {

		return getPersistence().findByEdcActorGroupRole(
			projectId, actorGroup, start, end);
	}

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
	public static List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findByEdcActorGroupRole(
			projectId, actorGroup, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcActorGroupRole(
			projectId, actorGroup, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByEdcActorGroupRole_First(
			long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorGroupRole_First(
			projectId, actorGroup, orderByComparator);
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcActorGroupRole_First(
		long projectId, long actorGroup,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcActorGroupRole_First(
			projectId, actorGroup, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole findByEdcActorGroupRole_Last(
			long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorGroupRole_Last(
			projectId, actorGroup, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcActorGroupRole_Last(
		long projectId, long actorGroup,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcActorGroupRole_Last(
			projectId, actorGroup, orderByComparator);
	}

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
	public static EdcPermissionRole[] findByEdcActorGroupRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorGroupRole_PrevAndNext(
			permissionRoleId, projectId, actorGroup, orderByComparator);
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 */
	public static void removeByEdcActorGroupRole(
		long projectId, long actorGroup) {

		getPersistence().removeByEdcActorGroupRole(projectId, actorGroup);
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission roles
	 */
	public static int countByEdcActorGroupRole(
		long projectId, long actorGroup) {

		return getPersistence().countByEdcActorGroupRole(projectId, actorGroup);
	}

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the matching edc permission roles
	 */
	public static List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		return getPersistence().findByEdcActorRole(
			projectId, actorGroup, actorId);
	}

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
	public static List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end) {

		return getPersistence().findByEdcActorRole(
			projectId, actorGroup, actorId, start, end);
	}

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
	public static List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findByEdcActorRole(
			projectId, actorGroup, actorId, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcActorRole(
			projectId, actorGroup, actorId, start, end, orderByComparator,
			useFinderCache);
	}

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
	public static EdcPermissionRole findByEdcActorRole_First(
			long projectId, long actorGroup, long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorRole_First(
			projectId, actorGroup, actorId, orderByComparator);
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcActorRole_First(
		long projectId, long actorGroup, long actorId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcActorRole_First(
			projectId, actorGroup, actorId, orderByComparator);
	}

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
	public static EdcPermissionRole findByEdcActorRole_Last(
			long projectId, long actorGroup, long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorRole_Last(
			projectId, actorGroup, actorId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcActorRole_Last(
		long projectId, long actorGroup, long actorId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().fetchByEdcActorRole_Last(
			projectId, actorGroup, actorId, orderByComparator);
	}

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
	public static EdcPermissionRole[] findByEdcActorRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcActorRole_PrevAndNext(
			permissionRoleId, projectId, actorGroup, actorId,
			orderByComparator);
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 */
	public static void removeByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		getPersistence().removeByEdcActorRole(projectId, actorGroup, actorId);
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the number of matching edc permission roles
	 */
	public static int countByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		return getPersistence().countByEdcActorRole(
			projectId, actorGroup, actorId);
	}

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
	public static EdcPermissionRole findByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);
	}

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName) {

		return getPersistence().fetchByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);
	}

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
	public static EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName,
		boolean useFinderCache) {

		return getPersistence().fetchByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName, useFinderCache);
	}

	/**
	 * Removes the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the edc permission role that was removed
	 */
	public static EdcPermissionRole removeByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().removeByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the number of matching edc permission roles
	 */
	public static int countByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName) {

		return getPersistence().countByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);
	}

	/**
	 * Caches the edc permission role in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRole the edc permission role
	 */
	public static void cacheResult(EdcPermissionRole edcPermissionRole) {
		getPersistence().cacheResult(edcPermissionRole);
	}

	/**
	 * Caches the edc permission roles in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoles the edc permission roles
	 */
	public static void cacheResult(List<EdcPermissionRole> edcPermissionRoles) {
		getPersistence().cacheResult(edcPermissionRoles);
	}

	/**
	 * Creates a new edc permission role with the primary key. Does not add the edc permission role to the database.
	 *
	 * @param permissionRoleId the primary key for the new edc permission role
	 * @return the new edc permission role
	 */
	public static EdcPermissionRole create(long permissionRoleId) {
		return getPersistence().create(permissionRoleId);
	}

	/**
	 * Removes the edc permission role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role that was removed
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole remove(long permissionRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().remove(permissionRoleId);
	}

	public static EdcPermissionRole updateImpl(
		EdcPermissionRole edcPermissionRole) {

		return getPersistence().updateImpl(edcPermissionRole);
	}

	/**
	 * Returns the edc permission role with the primary key or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole findByPrimaryKey(long permissionRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleException {

		return getPersistence().findByPrimaryKey(permissionRoleId);
	}

	/**
	 * Returns the edc permission role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role, or <code>null</code> if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole fetchByPrimaryKey(long permissionRoleId) {
		return getPersistence().fetchByPrimaryKey(permissionRoleId);
	}

	/**
	 * Returns all the edc permission roles.
	 *
	 * @return the edc permission roles
	 */
	public static List<EdcPermissionRole> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<EdcPermissionRole> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<EdcPermissionRole> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<EdcPermissionRole> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the edc permission roles from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of edc permission roles.
	 *
	 * @return the number of edc permission roles
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdcPermissionRolePersistence getPersistence() {
		return _persistence;
	}

	private static volatile EdcPermissionRolePersistence _persistence;

}
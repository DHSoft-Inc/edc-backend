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

import com.dhsoft.edc.backend.model.EdcPermissionScope;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edc permission scope service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.EdcPermissionScopePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopePersistence
 * @generated
 */
public class EdcPermissionScopeUtil {

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
	public static void clearCache(EdcPermissionScope edcPermissionScope) {
		getPersistence().clearCache(edcPermissionScope);
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
	public static Map<Serializable, EdcPermissionScope> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EdcPermissionScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdcPermissionScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdcPermissionScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdcPermissionScope update(
		EdcPermissionScope edcPermissionScope) {

		return getPersistence().update(edcPermissionScope);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdcPermissionScope update(
		EdcPermissionScope edcPermissionScope, ServiceContext serviceContext) {

		return getPersistence().update(edcPermissionScope, serviceContext);
	}

	/**
	 * Returns all the edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUuid_First(
		String uuid, OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUuid_Last(
		String uuid, OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope[] findByUuid_PrevAndNext(
			long permissionScopeId, String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_PrevAndNext(
			permissionScopeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the edc permission scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scopes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the edc permission scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope that was removed
	 */
	public static EdcPermissionScope removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scopes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static EdcPermissionScope[] findByUuid_C_PrevAndNext(
			long permissionScopeId, String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			permissionScopeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the edc permission scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scopes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcProjectScope(
		long projectId) {

		return getPersistence().findByEdcProjectScope(projectId);
	}

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
	public static List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end) {

		return getPersistence().findByEdcProjectScope(projectId, start, end);
	}

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
	public static List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findByEdcProjectScope(
			projectId, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcProjectScope(
			projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcProjectScope_First(
			long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcProjectScope_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcProjectScope_First(
		long projectId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcProjectScope_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcProjectScope_Last(
			long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcProjectScope_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcProjectScope_Last(
		long projectId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcProjectScope_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope[] findByEdcProjectScope_PrevAndNext(
			long permissionScopeId, long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcProjectScope_PrevAndNext(
			permissionScopeId, projectId, orderByComparator);
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public static void removeByEdcProjectScope(long projectId) {
		getPersistence().removeByEdcProjectScope(projectId);
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission scopes
	 */
	public static int countByEdcProjectScope(long projectId) {
		return getPersistence().countByEdcProjectScope(projectId);
	}

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName) {

		return getPersistence().findByEdcModuleScope(projectId, moduleName);
	}

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
	public static List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end) {

		return getPersistence().findByEdcModuleScope(
			projectId, moduleName, start, end);
	}

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
	public static List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findByEdcModuleScope(
			projectId, moduleName, start, end, orderByComparator);
	}

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
	public static List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcModuleScope(
			projectId, moduleName, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcModuleScope_First(
			long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcModuleScope_First(
			projectId, moduleName, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcModuleScope_First(
		long projectId, String moduleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcModuleScope_First(
			projectId, moduleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcModuleScope_Last(
			long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcModuleScope_Last(
			projectId, moduleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcModuleScope_Last(
		long projectId, String moduleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcModuleScope_Last(
			projectId, moduleName, orderByComparator);
	}

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
	public static EdcPermissionScope[] findByEdcModuleScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcModuleScope_PrevAndNext(
			permissionScopeId, projectId, moduleName, orderByComparator);
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 */
	public static void removeByEdcModuleScope(
		long projectId, String moduleName) {

		getPersistence().removeByEdcModuleScope(projectId, moduleName);
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the number of matching edc permission scopes
	 */
	public static int countByEdcModuleScope(long projectId, String moduleName) {
		return getPersistence().countByEdcModuleScope(projectId, moduleName);
	}

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @return the matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName) {

		return getPersistence().findByEdcTaskScope(
			projectId, moduleName, taskKey, roleName);
	}

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName,
		int start, int end) {

		return getPersistence().findByEdcTaskScope(
			projectId, moduleName, taskKey, roleName, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName,
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findByEdcTaskScope(
			projectId, moduleName, taskKey, roleName, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	public static List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName,
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEdcTaskScope(
			projectId, moduleName, taskKey, roleName, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcTaskScope_First(
			long projectId, String moduleName, String taskKey, String roleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcTaskScope_First(
			projectId, moduleName, taskKey, roleName, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcTaskScope_First(
		long projectId, String moduleName, String taskKey, String roleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcTaskScope_First(
			projectId, moduleName, taskKey, roleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcTaskScope_Last(
			long projectId, String moduleName, String taskKey, String roleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcTaskScope_Last(
			projectId, moduleName, taskKey, roleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcTaskScope_Last(
		long projectId, String moduleName, String taskKey, String roleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().fetchByEdcTaskScope_Last(
			projectId, moduleName, taskKey, roleName, orderByComparator);
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope[] findByEdcTaskScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			String taskKey, String roleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcTaskScope_PrevAndNext(
			permissionScopeId, projectId, moduleName, taskKey, roleName,
			orderByComparator);
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 */
	public static void removeByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName) {

		getPersistence().removeByEdcTaskScope(
			projectId, moduleName, taskKey, roleName);
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @return the number of matching edc permission scopes
	 */
	public static int countByEdcTaskScope(
		long projectId, String moduleName, String taskKey, String roleName) {

		return getPersistence().countByEdcTaskScope(
			projectId, moduleName, taskKey, roleName);
	}

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; and scopeRole = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope findByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String roleName,
			String scopeRole)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByEdcPermissionScope(
			projectId, moduleName, taskKey, roleName, scopeRole);
	}

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String roleName,
		String scopeRole) {

		return getPersistence().fetchByEdcPermissionScope(
			projectId, moduleName, taskKey, roleName, scopeRole);
	}

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	public static EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String roleName,
		String scopeRole, boolean useFinderCache) {

		return getPersistence().fetchByEdcPermissionScope(
			projectId, moduleName, taskKey, roleName, scopeRole,
			useFinderCache);
	}

	/**
	 * Removes the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param scopeRole the scope role
	 * @return the edc permission scope that was removed
	 */
	public static EdcPermissionScope removeByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String roleName,
			String scopeRole)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().removeByEdcPermissionScope(
			projectId, moduleName, taskKey, roleName, scopeRole);
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and roleName = &#63; and scopeRole = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param roleName the role name
	 * @param scopeRole the scope role
	 * @return the number of matching edc permission scopes
	 */
	public static int countByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String roleName,
		String scopeRole) {

		return getPersistence().countByEdcPermissionScope(
			projectId, moduleName, taskKey, roleName, scopeRole);
	}

	/**
	 * Caches the edc permission scope in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScope the edc permission scope
	 */
	public static void cacheResult(EdcPermissionScope edcPermissionScope) {
		getPersistence().cacheResult(edcPermissionScope);
	}

	/**
	 * Caches the edc permission scopes in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopes the edc permission scopes
	 */
	public static void cacheResult(
		List<EdcPermissionScope> edcPermissionScopes) {

		getPersistence().cacheResult(edcPermissionScopes);
	}

	/**
	 * Creates a new edc permission scope with the primary key. Does not add the edc permission scope to the database.
	 *
	 * @param permissionScopeId the primary key for the new edc permission scope
	 * @return the new edc permission scope
	 */
	public static EdcPermissionScope create(long permissionScopeId) {
		return getPersistence().create(permissionScopeId);
	}

	/**
	 * Removes the edc permission scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope that was removed
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope remove(long permissionScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().remove(permissionScopeId);
	}

	public static EdcPermissionScope updateImpl(
		EdcPermissionScope edcPermissionScope) {

		return getPersistence().updateImpl(edcPermissionScope);
	}

	/**
	 * Returns the edc permission scope with the primary key or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope findByPrimaryKey(long permissionScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeException {

		return getPersistence().findByPrimaryKey(permissionScopeId);
	}

	/**
	 * Returns the edc permission scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope, or <code>null</code> if a edc permission scope with the primary key could not be found
	 */
	public static EdcPermissionScope fetchByPrimaryKey(long permissionScopeId) {
		return getPersistence().fetchByPrimaryKey(permissionScopeId);
	}

	/**
	 * Returns all the edc permission scopes.
	 *
	 * @return the edc permission scopes
	 */
	public static List<EdcPermissionScope> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<EdcPermissionScope> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<EdcPermissionScope> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<EdcPermissionScope> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the edc permission scopes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of edc permission scopes.
	 *
	 * @return the number of edc permission scopes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdcPermissionScopePersistence getPersistence() {
		return _persistence;
	}

	private static volatile EdcPermissionScopePersistence _persistence;

}
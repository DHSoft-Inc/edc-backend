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

import com.dhsoft.edc.backend.model.AssignInstitutionRole;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assign institution role service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.AssignInstitutionRolePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignInstitutionRolePersistence
 * @generated
 */
public class AssignInstitutionRoleUtil {

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
	public static void clearCache(AssignInstitutionRole assignInstitutionRole) {
		getPersistence().clearCache(assignInstitutionRole);
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
	public static Map<Serializable, AssignInstitutionRole> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssignInstitutionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssignInstitutionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssignInstitutionRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssignInstitutionRole update(
		AssignInstitutionRole assignInstitutionRole) {

		return getPersistence().update(assignInstitutionRole);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssignInstitutionRole update(
		AssignInstitutionRole assignInstitutionRole,
		ServiceContext serviceContext) {

		return getPersistence().update(assignInstitutionRole, serviceContext);
	}

	/**
	 * Returns all the assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByUuid_First(
			String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUuid_First(
		String uuid,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByUuid_Last(
			String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUuid_Last(
		String uuid,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole[] findByUuid_PrevAndNext(
			long institutionRoleId, String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_PrevAndNext(
			institutionRoleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the assign institution roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign institution roles
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the assign institution role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign institution role that was removed
	 */
	public static AssignInstitutionRole removeByUUID_G(
			String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign institution roles
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole[] findByUuid_C_PrevAndNext(
			long institutionRoleId, String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByUuid_C_PrevAndNext(
			institutionRoleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the assign institution roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign institution roles
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitution(
		long institutionId) {

		return getPersistence().findByInstitution(institutionId);
	}

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end) {

		return getPersistence().findByInstitution(institutionId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findByInstitution(
			institutionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitution(
			institutionId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByInstitution_First(
			long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitution_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitution_First(
		long institutionId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByInstitution_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByInstitution_Last(
			long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitution_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitution_Last(
		long institutionId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByInstitution_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole[] findByInstitution_PrevAndNext(
			long institutionRoleId, long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitution_PrevAndNext(
			institutionRoleId, institutionId, orderByComparator);
	}

	/**
	 * Removes all the assign institution roles where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public static void removeByInstitution(long institutionId) {
		getPersistence().removeByInstitution(institutionId);
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign institution roles
	 */
	public static int countByInstitution(long institutionId) {
		return getPersistence().countByInstitution(institutionId);
	}

	/**
	 * Returns all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId) {

		return getPersistence().findByInstitutionAndUser(
			institutionId, targetUserId);
	}

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end) {

		return getPersistence().findByInstitutionAndUser(
			institutionId, targetUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findByInstitutionAndUser(
			institutionId, targetUserId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public static List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitutionAndUser(
			institutionId, targetUserId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByInstitutionAndUser_First(
			long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitutionAndUser_First(
			institutionId, targetUserId, orderByComparator);
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitutionAndUser_First(
		long institutionId, long targetUserId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByInstitutionAndUser_First(
			institutionId, targetUserId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByInstitutionAndUser_Last(
			long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitutionAndUser_Last(
			institutionId, targetUserId, orderByComparator);
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitutionAndUser_Last(
		long institutionId, long targetUserId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().fetchByInstitutionAndUser_Last(
			institutionId, targetUserId, orderByComparator);
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole[] findByInstitutionAndUser_PrevAndNext(
			long institutionRoleId, long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitutionAndUser_PrevAndNext(
			institutionRoleId, institutionId, targetUserId, orderByComparator);
	}

	/**
	 * Removes all the assign institution roles where institutionId = &#63; and targetUserId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 */
	public static void removeByInstitutionAndUser(
		long institutionId, long targetUserId) {

		getPersistence().removeByInstitutionAndUser(
			institutionId, targetUserId);
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the number of matching assign institution roles
	 */
	public static int countByInstitutionAndUser(
		long institutionId, long targetUserId) {

		return getPersistence().countByInstitutionAndUser(
			institutionId, targetUserId);
	}

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole findByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByInstitutionUserRole(
			institutionId, targetUserId, roleName);
	}

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName) {

		return getPersistence().fetchByInstitutionUserRole(
			institutionId, targetUserId, roleName);
	}

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName,
		boolean useFinderCache) {

		return getPersistence().fetchByInstitutionUserRole(
			institutionId, targetUserId, roleName, useFinderCache);
	}

	/**
	 * Removes the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the assign institution role that was removed
	 */
	public static AssignInstitutionRole removeByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().removeByInstitutionUserRole(
			institutionId, targetUserId, roleName);
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63; and roleName = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the number of matching assign institution roles
	 */
	public static int countByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName) {

		return getPersistence().countByInstitutionUserRole(
			institutionId, targetUserId, roleName);
	}

	/**
	 * Caches the assign institution role in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRole the assign institution role
	 */
	public static void cacheResult(
		AssignInstitutionRole assignInstitutionRole) {

		getPersistence().cacheResult(assignInstitutionRole);
	}

	/**
	 * Caches the assign institution roles in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRoles the assign institution roles
	 */
	public static void cacheResult(
		List<AssignInstitutionRole> assignInstitutionRoles) {

		getPersistence().cacheResult(assignInstitutionRoles);
	}

	/**
	 * Creates a new assign institution role with the primary key. Does not add the assign institution role to the database.
	 *
	 * @param institutionRoleId the primary key for the new assign institution role
	 * @return the new assign institution role
	 */
	public static AssignInstitutionRole create(long institutionRoleId) {
		return getPersistence().create(institutionRoleId);
	}

	/**
	 * Removes the assign institution role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role that was removed
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole remove(long institutionRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().remove(institutionRoleId);
	}

	public static AssignInstitutionRole updateImpl(
		AssignInstitutionRole assignInstitutionRole) {

		return getPersistence().updateImpl(assignInstitutionRole);
	}

	/**
	 * Returns the assign institution role with the primary key or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole findByPrimaryKey(long institutionRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignInstitutionRoleException {

		return getPersistence().findByPrimaryKey(institutionRoleId);
	}

	/**
	 * Returns the assign institution role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role, or <code>null</code> if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole fetchByPrimaryKey(
		long institutionRoleId) {

		return getPersistence().fetchByPrimaryKey(institutionRoleId);
	}

	/**
	 * Returns all the assign institution roles.
	 *
	 * @return the assign institution roles
	 */
	public static List<AssignInstitutionRole> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of assign institution roles
	 */
	public static List<AssignInstitutionRole> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign institution roles
	 */
	public static List<AssignInstitutionRole> findAll(
		int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign institution roles
	 */
	public static List<AssignInstitutionRole> findAll(
		int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assign institution roles from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assign institution roles.
	 *
	 * @return the number of assign institution roles
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssignInstitutionRolePersistence getPersistence() {
		return _persistence;
	}

	private static volatile AssignInstitutionRolePersistence _persistence;

}
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

import com.dhsoft.edc.backend.model.Institution;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the institution service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.InstitutionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstitutionPersistence
 * @generated
 */
public class InstitutionUtil {

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
	public static void clearCache(Institution institution) {
		getPersistence().clearCache(institution);
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
	public static Map<Serializable, Institution> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Institution> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Institution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Institution> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Institution update(Institution institution) {
		return getPersistence().update(institution);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Institution update(
		Institution institution, ServiceContext serviceContext) {

		return getPersistence().update(institution, serviceContext);
	}

	/**
	 * Returns all the institutions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching institutions
	 */
	public static List<Institution> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public static List<Institution> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUuid_First(
			String uuid, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUuid_First(
		String uuid, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUuid_Last(
			String uuid, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUuid_Last(
		String uuid, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the institutions before and after the current institution in the ordered set where uuid = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution[] findByUuid_PrevAndNext(
			long institutionId, String uuid,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_PrevAndNext(
			institutionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the institutions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of institutions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching institutions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstitutionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the institution where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the institution that was removed
	 */
	public static Institution removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of institutions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching institutions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching institutions
	 */
	public static List<Institution> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public static List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the institutions before and after the current institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution[] findByUuid_C_PrevAndNext(
			long institutionId, String uuid, long companyId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			institutionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the institutions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching institutions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching institutions
	 */
	public static List<Institution> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public static List<Institution> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the institutions before and after the current institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution[] findByG_P_PrevAndNext(
			long institutionId, long groupId, long projectId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByG_P_PrevAndNext(
			institutionId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the institutions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching institutions
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns the institution where groupId = &#63; and projectId = &#63; and code = &#63; or throws a <code>NoSuchInstitutionException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param code the code
	 * @return the matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByG_P_C(
			long groupId, long projectId, String code)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByG_P_C(groupId, projectId, code);
	}

	/**
	 * Returns the institution where groupId = &#63; and projectId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param code the code
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByG_P_C(
		long groupId, long projectId, String code) {

		return getPersistence().fetchByG_P_C(groupId, projectId, code);
	}

	/**
	 * Returns the institution where groupId = &#63; and projectId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param code the code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByG_P_C(
		long groupId, long projectId, String code, boolean useFinderCache) {

		return getPersistence().fetchByG_P_C(
			groupId, projectId, code, useFinderCache);
	}

	/**
	 * Removes the institution where groupId = &#63; and projectId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param code the code
	 * @return the institution that was removed
	 */
	public static Institution removeByG_P_C(
			long groupId, long projectId, String code)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().removeByG_P_C(groupId, projectId, code);
	}

	/**
	 * Returns the number of institutions where groupId = &#63; and projectId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param code the code
	 * @return the number of matching institutions
	 */
	public static int countByG_P_C(long groupId, long projectId, String code) {
		return getPersistence().countByG_P_C(groupId, projectId, code);
	}

	/**
	 * Returns all the institutions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching institutions
	 */
	public static List<Institution> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public static List<Institution> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByCompanyId_First(
			long companyId, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByCompanyId_First(
		long companyId, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByCompanyId_Last(
			long companyId, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByCompanyId_Last(
		long companyId, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the institutions before and after the current institution in the ordered set where companyId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution[] findByCompanyId_PrevAndNext(
			long institutionId, long companyId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByCompanyId_PrevAndNext(
			institutionId, companyId, orderByComparator);
	}

	/**
	 * Removes all the institutions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of institutions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching institutions
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the institutions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching institutions
	 */
	public static List<Institution> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public static List<Institution> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public static List<Institution> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUserId_First(
			long userId, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUserId_First(
		long userId, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public static Institution findByUserId_Last(
			long userId, OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchByUserId_Last(
		long userId, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the institutions before and after the current institution in the ordered set where userId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution[] findByUserId_PrevAndNext(
			long institutionId, long userId,
			OrderByComparator<Institution> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByUserId_PrevAndNext(
			institutionId, userId, orderByComparator);
	}

	/**
	 * Removes all the institutions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of institutions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching institutions
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the institution in the entity cache if it is enabled.
	 *
	 * @param institution the institution
	 */
	public static void cacheResult(Institution institution) {
		getPersistence().cacheResult(institution);
	}

	/**
	 * Caches the institutions in the entity cache if it is enabled.
	 *
	 * @param institutions the institutions
	 */
	public static void cacheResult(List<Institution> institutions) {
		getPersistence().cacheResult(institutions);
	}

	/**
	 * Creates a new institution with the primary key. Does not add the institution to the database.
	 *
	 * @param institutionId the primary key for the new institution
	 * @return the new institution
	 */
	public static Institution create(long institutionId) {
		return getPersistence().create(institutionId);
	}

	/**
	 * Removes the institution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution that was removed
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution remove(long institutionId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().remove(institutionId);
	}

	public static Institution updateImpl(Institution institution) {
		return getPersistence().updateImpl(institution);
	}

	/**
	 * Returns the institution with the primary key or throws a <code>NoSuchInstitutionException</code> if it could not be found.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public static Institution findByPrimaryKey(long institutionId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstitutionException {

		return getPersistence().findByPrimaryKey(institutionId);
	}

	/**
	 * Returns the institution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution, or <code>null</code> if a institution with the primary key could not be found
	 */
	public static Institution fetchByPrimaryKey(long institutionId) {
		return getPersistence().fetchByPrimaryKey(institutionId);
	}

	/**
	 * Returns all the institutions.
	 *
	 * @return the institutions
	 */
	public static List<Institution> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of institutions
	 */
	public static List<Institution> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of institutions
	 */
	public static List<Institution> findAll(
		int start, int end, OrderByComparator<Institution> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of institutions
	 */
	public static List<Institution> findAll(
		int start, int end, OrderByComparator<Institution> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the institutions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of institutions.
	 *
	 * @return the number of institutions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InstitutionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile InstitutionPersistence _persistence;

}
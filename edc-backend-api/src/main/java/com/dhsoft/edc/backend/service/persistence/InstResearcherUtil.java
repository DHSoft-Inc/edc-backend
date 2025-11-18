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

import com.dhsoft.edc.backend.model.InstResearcher;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the inst researcher service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.InstResearcherPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstResearcherPersistence
 * @generated
 */
public class InstResearcherUtil {

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
	public static void clearCache(InstResearcher instResearcher) {
		getPersistence().clearCache(instResearcher);
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
	public static Map<Serializable, InstResearcher> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<InstResearcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InstResearcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InstResearcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static InstResearcher update(InstResearcher instResearcher) {
		return getPersistence().update(instResearcher);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static InstResearcher update(
		InstResearcher instResearcher, ServiceContext serviceContext) {

		return getPersistence().update(instResearcher, serviceContext);
	}

	/**
	 * Returns all the inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUuid_First(
			String uuid, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUuid_First(
		String uuid, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUuid_Last(
			String uuid, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUuid_Last(
		String uuid, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByUuid_PrevAndNext(
			long institutionResearcherId, String uuid,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_PrevAndNext(
			institutionResearcherId, uuid, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching inst researchers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the inst researcher where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the inst researcher that was removed
	 */
	public static InstResearcher removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching inst researchers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByUuid_C_PrevAndNext(
			long institutionResearcherId, String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUuid_C_PrevAndNext(
			institutionResearcherId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByG_P_PrevAndNext(
			long institutionResearcherId, long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByG_P_PrevAndNext(
			institutionResearcherId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching inst researchers
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByCompanyId_First(
			long companyId, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByCompanyId_First(
		long companyId, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByCompanyId_Last(
			long companyId, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByCompanyId_Last(
		long companyId, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByCompanyId_PrevAndNext(
			long institutionResearcherId, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByCompanyId_PrevAndNext(
			institutionResearcherId, companyId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUserId_First(
			long userId, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUserId_First(
		long userId, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByUserId_Last(
			long userId, OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByUserId_Last(
		long userId, OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByUserId_PrevAndNext(
			long institutionResearcherId, long userId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByUserId_PrevAndNext(
			institutionResearcherId, userId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching inst researchers
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByInstitutionId(long institutionId) {
		return getPersistence().findByInstitutionId(institutionId);
	}

	/**
	 * Returns a range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end) {

		return getPersistence().findByInstitutionId(institutionId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByInstitutionId(
			institutionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitutionId(
			institutionId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByInstitutionId_First(
			long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByInstitutionId_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByInstitutionId_First(
		long institutionId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByInstitutionId_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByInstitutionId_Last(
			long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByInstitutionId_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByInstitutionId_Last(
		long institutionId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByInstitutionId_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByInstitutionId_PrevAndNext(
			long institutionResearcherId, long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByInstitutionId_PrevAndNext(
			institutionResearcherId, institutionId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public static void removeByInstitutionId(long institutionId) {
		getPersistence().removeByInstitutionId(institutionId);
	}

	/**
	 * Returns the number of inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching inst researchers
	 */
	public static int countByInstitutionId(long institutionId) {
		return getPersistence().countByInstitutionId(institutionId);
	}

	/**
	 * Returns all the inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the matching inst researchers
	 */
	public static List<InstResearcher> findByResearcherId(long researcherId) {
		return getPersistence().findByResearcherId(researcherId);
	}

	/**
	 * Returns a range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public static List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end) {

		return getPersistence().findByResearcherId(researcherId, start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findByResearcherId(
			researcherId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public static List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByResearcherId(
			researcherId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByResearcherId_First(
			long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByResearcherId_First(
			researcherId, orderByComparator);
	}

	/**
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByResearcherId_First(
		long researcherId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByResearcherId_First(
			researcherId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public static InstResearcher findByResearcherId_Last(
			long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByResearcherId_Last(
			researcherId, orderByComparator);
	}

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchByResearcherId_Last(
		long researcherId,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().fetchByResearcherId_Last(
			researcherId, orderByComparator);
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher[] findByResearcherId_PrevAndNext(
			long institutionResearcherId, long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByResearcherId_PrevAndNext(
			institutionResearcherId, researcherId, orderByComparator);
	}

	/**
	 * Removes all the inst researchers where researcherId = &#63; from the database.
	 *
	 * @param researcherId the researcher ID
	 */
	public static void removeByResearcherId(long researcherId) {
		getPersistence().removeByResearcherId(researcherId);
	}

	/**
	 * Returns the number of inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the number of matching inst researchers
	 */
	public static int countByResearcherId(long researcherId) {
		return getPersistence().countByResearcherId(researcherId);
	}

	/**
	 * Caches the inst researcher in the entity cache if it is enabled.
	 *
	 * @param instResearcher the inst researcher
	 */
	public static void cacheResult(InstResearcher instResearcher) {
		getPersistence().cacheResult(instResearcher);
	}

	/**
	 * Caches the inst researchers in the entity cache if it is enabled.
	 *
	 * @param instResearchers the inst researchers
	 */
	public static void cacheResult(List<InstResearcher> instResearchers) {
		getPersistence().cacheResult(instResearchers);
	}

	/**
	 * Creates a new inst researcher with the primary key. Does not add the inst researcher to the database.
	 *
	 * @param institutionResearcherId the primary key for the new inst researcher
	 * @return the new inst researcher
	 */
	public static InstResearcher create(long institutionResearcherId) {
		return getPersistence().create(institutionResearcherId);
	}

	/**
	 * Removes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher remove(long institutionResearcherId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().remove(institutionResearcherId);
	}

	public static InstResearcher updateImpl(InstResearcher instResearcher) {
		return getPersistence().updateImpl(instResearcher);
	}

	/**
	 * Returns the inst researcher with the primary key or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher findByPrimaryKey(long institutionResearcherId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstResearcherException {

		return getPersistence().findByPrimaryKey(institutionResearcherId);
	}

	/**
	 * Returns the inst researcher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher, or <code>null</code> if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher fetchByPrimaryKey(
		long institutionResearcherId) {

		return getPersistence().fetchByPrimaryKey(institutionResearcherId);
	}

	/**
	 * Returns all the inst researchers.
	 *
	 * @return the inst researchers
	 */
	public static List<InstResearcher> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of inst researchers
	 */
	public static List<InstResearcher> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inst researchers
	 */
	public static List<InstResearcher> findAll(
		int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of inst researchers
	 */
	public static List<InstResearcher> findAll(
		int start, int end, OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the inst researchers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of inst researchers.
	 *
	 * @return the number of inst researchers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InstResearcherPersistence getPersistence() {
		return _persistence;
	}

	private static volatile InstResearcherPersistence _persistence;

}
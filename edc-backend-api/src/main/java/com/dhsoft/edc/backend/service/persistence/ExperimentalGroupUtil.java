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

import com.dhsoft.edc.backend.model.ExperimentalGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the experimental group service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.ExperimentalGroupPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExperimentalGroupPersistence
 * @generated
 */
public class ExperimentalGroupUtil {

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
	public static void clearCache(ExperimentalGroup experimentalGroup) {
		getPersistence().clearCache(experimentalGroup);
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
	public static Map<Serializable, ExperimentalGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExperimentalGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExperimentalGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExperimentalGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExperimentalGroup update(
		ExperimentalGroup experimentalGroup) {

		return getPersistence().update(experimentalGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExperimentalGroup update(
		ExperimentalGroup experimentalGroup, ServiceContext serviceContext) {

		return getPersistence().update(experimentalGroup, serviceContext);
	}

	/**
	 * Returns all the experimental groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the experimental groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUuid_First(
			String uuid, OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUuid_First(
		String uuid, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUuid_Last(
			String uuid, OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUuid_Last(
		String uuid, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where uuid = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByUuid_PrevAndNext(
			long experimentalGroupId, String uuid,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_PrevAndNext(
			experimentalGroupId, uuid, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of experimental groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching experimental groups
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the experimental group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExperimentalGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the experimental group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the experimental group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the experimental group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the experimental group that was removed
	 */
	public static ExperimentalGroup removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of experimental groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching experimental groups
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the experimental groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the experimental groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByUuid_C_PrevAndNext(
			long experimentalGroupId, String uuid, long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUuid_C_PrevAndNext(
			experimentalGroupId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of experimental groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching experimental groups
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the experimental groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the experimental groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByCompanyId_First(
			long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByCompanyId_First(
		long companyId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByCompanyId_Last(
			long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByCompanyId_Last(
		long companyId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where companyId = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByCompanyId_PrevAndNext(
			long experimentalGroupId, long companyId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByCompanyId_PrevAndNext(
			experimentalGroupId, companyId, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of experimental groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching experimental groups
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns the experimental group where groupId = &#63; and projectId = &#63; and expCode = &#63; or throws a <code>NoSuchExperimentalGroupException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param expCode the exp code
	 * @return the matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByG_P_E(
			long groupId, long projectId, String expCode)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByG_P_E(groupId, projectId, expCode);
	}

	/**
	 * Returns the experimental group where groupId = &#63; and projectId = &#63; and expCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param expCode the exp code
	 * @return the matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByG_P_E(
		long groupId, long projectId, String expCode) {

		return getPersistence().fetchByG_P_E(groupId, projectId, expCode);
	}

	/**
	 * Returns the experimental group where groupId = &#63; and projectId = &#63; and expCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param expCode the exp code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByG_P_E(
		long groupId, long projectId, String expCode, boolean useFinderCache) {

		return getPersistence().fetchByG_P_E(
			groupId, projectId, expCode, useFinderCache);
	}

	/**
	 * Removes the experimental group where groupId = &#63; and projectId = &#63; and expCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param expCode the exp code
	 * @return the experimental group that was removed
	 */
	public static ExperimentalGroup removeByG_P_E(
			long groupId, long projectId, String expCode)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().removeByG_P_E(groupId, projectId, expCode);
	}

	/**
	 * Returns the number of experimental groups where groupId = &#63; and projectId = &#63; and expCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param expCode the exp code
	 * @return the number of matching experimental groups
	 */
	public static int countByG_P_E(
		long groupId, long projectId, String expCode) {

		return getPersistence().countByG_P_E(groupId, projectId, expCode);
	}

	/**
	 * Returns all the experimental groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByG_P(
		long groupId, long projectId) {

		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the experimental groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByG_P_PrevAndNext(
			long experimentalGroupId, long groupId, long projectId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByG_P_PrevAndNext(
			experimentalGroupId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of experimental groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching experimental groups
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the experimental groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the experimental groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByGroupId_First(
			long groupId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByGroupId_First(
		long groupId, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByGroupId_Last(
			long groupId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByGroupId_Last(
		long groupId, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where groupId = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByGroupId_PrevAndNext(
			long experimentalGroupId, long groupId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByGroupId_PrevAndNext(
			experimentalGroupId, groupId, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of experimental groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching experimental groups
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the experimental groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the experimental groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching experimental groups
	 */
	public static List<ExperimentalGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first experimental group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUserId_First(
			long userId, OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first experimental group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUserId_First(
		long userId, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group
	 * @throws NoSuchExperimentalGroupException if a matching experimental group could not be found
	 */
	public static ExperimentalGroup findByUserId_Last(
			long userId, OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last experimental group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching experimental group, or <code>null</code> if a matching experimental group could not be found
	 */
	public static ExperimentalGroup fetchByUserId_Last(
		long userId, OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the experimental groups before and after the current experimental group in the ordered set where userId = &#63;.
	 *
	 * @param experimentalGroupId the primary key of the current experimental group
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup[] findByUserId_PrevAndNext(
			long experimentalGroupId, long userId,
			OrderByComparator<ExperimentalGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByUserId_PrevAndNext(
			experimentalGroupId, userId, orderByComparator);
	}

	/**
	 * Removes all the experimental groups where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of experimental groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching experimental groups
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the experimental group in the entity cache if it is enabled.
	 *
	 * @param experimentalGroup the experimental group
	 */
	public static void cacheResult(ExperimentalGroup experimentalGroup) {
		getPersistence().cacheResult(experimentalGroup);
	}

	/**
	 * Caches the experimental groups in the entity cache if it is enabled.
	 *
	 * @param experimentalGroups the experimental groups
	 */
	public static void cacheResult(List<ExperimentalGroup> experimentalGroups) {
		getPersistence().cacheResult(experimentalGroups);
	}

	/**
	 * Creates a new experimental group with the primary key. Does not add the experimental group to the database.
	 *
	 * @param experimentalGroupId the primary key for the new experimental group
	 * @return the new experimental group
	 */
	public static ExperimentalGroup create(long experimentalGroupId) {
		return getPersistence().create(experimentalGroupId);
	}

	/**
	 * Removes the experimental group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param experimentalGroupId the primary key of the experimental group
	 * @return the experimental group that was removed
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup remove(long experimentalGroupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().remove(experimentalGroupId);
	}

	public static ExperimentalGroup updateImpl(
		ExperimentalGroup experimentalGroup) {

		return getPersistence().updateImpl(experimentalGroup);
	}

	/**
	 * Returns the experimental group with the primary key or throws a <code>NoSuchExperimentalGroupException</code> if it could not be found.
	 *
	 * @param experimentalGroupId the primary key of the experimental group
	 * @return the experimental group
	 * @throws NoSuchExperimentalGroupException if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup findByPrimaryKey(long experimentalGroupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchExperimentalGroupException {

		return getPersistence().findByPrimaryKey(experimentalGroupId);
	}

	/**
	 * Returns the experimental group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param experimentalGroupId the primary key of the experimental group
	 * @return the experimental group, or <code>null</code> if a experimental group with the primary key could not be found
	 */
	public static ExperimentalGroup fetchByPrimaryKey(
		long experimentalGroupId) {

		return getPersistence().fetchByPrimaryKey(experimentalGroupId);
	}

	/**
	 * Returns all the experimental groups.
	 *
	 * @return the experimental groups
	 */
	public static List<ExperimentalGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the experimental groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @return the range of experimental groups
	 */
	public static List<ExperimentalGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the experimental groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of experimental groups
	 */
	public static List<ExperimentalGroup> findAll(
		int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the experimental groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExperimentalGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of experimental groups
	 * @param end the upper bound of the range of experimental groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of experimental groups
	 */
	public static List<ExperimentalGroup> findAll(
		int start, int end,
		OrderByComparator<ExperimentalGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the experimental groups from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of experimental groups.
	 *
	 * @return the number of experimental groups
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExperimentalGroupPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ExperimentalGroupPersistence _persistence;

}
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

import com.dhsoft.edc.backend.model.MetaGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the meta group service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.MetaGroupPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaGroupPersistence
 * @generated
 */
public class MetaGroupUtil {

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
	public static void clearCache(MetaGroup metaGroup) {
		getPersistence().clearCache(metaGroup);
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
	public static Map<Serializable, MetaGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MetaGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MetaGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MetaGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MetaGroup update(MetaGroup metaGroup) {
		return getPersistence().update(metaGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MetaGroup update(
		MetaGroup metaGroup, ServiceContext serviceContext) {

		return getPersistence().update(metaGroup, serviceContext);
	}

	/**
	 * Returns all the meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUuid_First(
			String uuid, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUuid_First(
		String uuid, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUuid_Last(
			String uuid, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUuid_Last(
		String uuid, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByUuid_PrevAndNext(
			long metaGroupId, String uuid,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_PrevAndNext(
			metaGroupId, uuid, orderByComparator);
	}

	/**
	 * Removes all the meta groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meta groups
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the meta group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meta group that was removed
	 */
	public static MetaGroup removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of meta groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meta groups
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByUuid_C_PrevAndNext(
			long metaGroupId, String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUuid_C_PrevAndNext(
			metaGroupId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the meta groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByG_P_PrevAndNext(
			long metaGroupId, long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_PrevAndNext(
			metaGroupId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching meta groups
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode) {

		return getPersistence().findByG_P_G(groupId, projectId, groupCode);
	}

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByG_P_G_First(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_G_First(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByG_P_G_First(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByG_P_G_First(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByG_P_G_Last(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_G_Last(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByG_P_G_Last(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByG_P_G_Last(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByG_P_G_PrevAndNext(
			long metaGroupId, long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByG_P_G_PrevAndNext(
			metaGroupId, groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 */
	public static void removeByG_P_G(
		long groupId, long projectId, String groupCode) {

		getPersistence().removeByG_P_G(groupId, projectId, groupCode);
	}

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the number of matching meta groups
	 */
	public static int countByG_P_G(
		long groupId, long projectId, String groupCode) {

		return getPersistence().countByG_P_G(groupId, projectId, groupCode);
	}

	/**
	 * Returns all the meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByCompanyId_First(
			long companyId, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByCompanyId_First(
		long companyId, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByCompanyId_Last(
			long companyId, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByCompanyId_Last(
		long companyId, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByCompanyId_PrevAndNext(
			long metaGroupId, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByCompanyId_PrevAndNext(
			metaGroupId, companyId, orderByComparator);
	}

	/**
	 * Removes all the meta groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching meta groups
	 */
	public static List<MetaGroup> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public static List<MetaGroup> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public static List<MetaGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUserId_First(
			long userId, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUserId_First(
		long userId, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public static MetaGroup findByUserId_Last(
			long userId, OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchByUserId_Last(
		long userId, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where userId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup[] findByUserId_PrevAndNext(
			long metaGroupId, long userId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByUserId_PrevAndNext(
			metaGroupId, userId, orderByComparator);
	}

	/**
	 * Removes all the meta groups where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching meta groups
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the meta group in the entity cache if it is enabled.
	 *
	 * @param metaGroup the meta group
	 */
	public static void cacheResult(MetaGroup metaGroup) {
		getPersistence().cacheResult(metaGroup);
	}

	/**
	 * Caches the meta groups in the entity cache if it is enabled.
	 *
	 * @param metaGroups the meta groups
	 */
	public static void cacheResult(List<MetaGroup> metaGroups) {
		getPersistence().cacheResult(metaGroups);
	}

	/**
	 * Creates a new meta group with the primary key. Does not add the meta group to the database.
	 *
	 * @param metaGroupId the primary key for the new meta group
	 * @return the new meta group
	 */
	public static MetaGroup create(long metaGroupId) {
		return getPersistence().create(metaGroupId);
	}

	/**
	 * Removes the meta group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group that was removed
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup remove(long metaGroupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().remove(metaGroupId);
	}

	public static MetaGroup updateImpl(MetaGroup metaGroup) {
		return getPersistence().updateImpl(metaGroup);
	}

	/**
	 * Returns the meta group with the primary key or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public static MetaGroup findByPrimaryKey(long metaGroupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaGroupException {

		return getPersistence().findByPrimaryKey(metaGroupId);
	}

	/**
	 * Returns the meta group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group, or <code>null</code> if a meta group with the primary key could not be found
	 */
	public static MetaGroup fetchByPrimaryKey(long metaGroupId) {
		return getPersistence().fetchByPrimaryKey(metaGroupId);
	}

	/**
	 * Returns all the meta groups.
	 *
	 * @return the meta groups
	 */
	public static List<MetaGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of meta groups
	 */
	public static List<MetaGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meta groups
	 */
	public static List<MetaGroup> findAll(
		int start, int end, OrderByComparator<MetaGroup> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meta groups
	 */
	public static List<MetaGroup> findAll(
		int start, int end, OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the meta groups from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of meta groups.
	 *
	 * @return the number of meta groups
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MetaGroupPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MetaGroupPersistence _persistence;

}
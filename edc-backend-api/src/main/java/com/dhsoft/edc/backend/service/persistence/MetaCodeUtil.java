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

import com.dhsoft.edc.backend.model.MetaCode;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the meta code service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.MetaCodePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaCodePersistence
 * @generated
 */
public class MetaCodeUtil {

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
	public static void clearCache(MetaCode metaCode) {
		getPersistence().clearCache(metaCode);
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
	public static Map<Serializable, MetaCode> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MetaCode> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MetaCode> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MetaCode> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MetaCode update(MetaCode metaCode) {
		return getPersistence().update(metaCode);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MetaCode update(
		MetaCode metaCode, ServiceContext serviceContext) {

		return getPersistence().update(metaCode, serviceContext);
	}

	/**
	 * Returns all the meta codes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUuid_First(
			String uuid, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUuid_First(
		String uuid, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUuid_Last(
			String uuid, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUuid_Last(
		String uuid, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where uuid = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByUuid_PrevAndNext(
			long metaCodeId, String uuid,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_PrevAndNext(
			metaCodeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the meta codes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of meta codes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meta codes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMetaCodeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the meta code where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meta code that was removed
	 */
	public static MetaCode removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of meta codes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meta codes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByUuid_C_PrevAndNext(
			long metaCodeId, String uuid, long companyId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			metaCodeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the meta codes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meta codes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByG_P_PrevAndNext(
			long metaCodeId, long groupId, long projectId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_PrevAndNext(
			metaCodeId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the meta codes where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching meta codes
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByG_P_G(
		long groupId, long projectId, String groupCode) {

		return getPersistence().findByG_P_G(groupId, projectId, groupCode);
	}

	/**
	 * Returns a range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_P_G(
			groupId, projectId, groupCode, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_G_First(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_First(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_G_First(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_G_First(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_G_Last(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_Last(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_G_Last(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_G_Last(
			groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByG_P_G_PrevAndNext(
			long metaCodeId, long groupId, long projectId, String groupCode,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_PrevAndNext(
			metaCodeId, groupId, projectId, groupCode, orderByComparator);
	}

	/**
	 * Removes all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; from the database.
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
	 * Returns the number of meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the number of matching meta codes
	 */
	public static int countByG_P_G(
		long groupId, long projectId, String groupCode) {

		return getPersistence().countByG_P_G(groupId, projectId, groupCode);
	}

	/**
	 * Returns all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByG_P_G_C(
		long groupId, long projectId, String groupCode, String code) {

		return getPersistence().findByG_P_G_C(
			groupId, projectId, groupCode, code);
	}

	/**
	 * Returns a range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G_C(
		long groupId, long projectId, String groupCode, String code, int start,
		int end) {

		return getPersistence().findByG_P_G_C(
			groupId, projectId, groupCode, code, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G_C(
		long groupId, long projectId, String groupCode, String code, int start,
		int end, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByG_P_G_C(
			groupId, projectId, groupCode, code, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByG_P_G_C(
		long groupId, long projectId, String groupCode, String code, int start,
		int end, OrderByComparator<MetaCode> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P_G_C(
			groupId, projectId, groupCode, code, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_G_C_First(
			long groupId, long projectId, String groupCode, String code,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_C_First(
			groupId, projectId, groupCode, code, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_G_C_First(
		long groupId, long projectId, String groupCode, String code,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_G_C_First(
			groupId, projectId, groupCode, code, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByG_P_G_C_Last(
			long groupId, long projectId, String groupCode, String code,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_C_Last(
			groupId, projectId, groupCode, code, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByG_P_G_C_Last(
		long groupId, long projectId, String groupCode, String code,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByG_P_G_C_Last(
			groupId, projectId, groupCode, code, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByG_P_G_C_PrevAndNext(
			long metaCodeId, long groupId, long projectId, String groupCode,
			String code, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByG_P_G_C_PrevAndNext(
			metaCodeId, groupId, projectId, groupCode, code, orderByComparator);
	}

	/**
	 * Removes all the meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 */
	public static void removeByG_P_G_C(
		long groupId, long projectId, String groupCode, String code) {

		getPersistence().removeByG_P_G_C(groupId, projectId, groupCode, code);
	}

	/**
	 * Returns the number of meta codes where groupId = &#63; and projectId = &#63; and groupCode = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param code the code
	 * @return the number of matching meta codes
	 */
	public static int countByG_P_G_C(
		long groupId, long projectId, String groupCode, String code) {

		return getPersistence().countByG_P_G_C(
			groupId, projectId, groupCode, code);
	}

	/**
	 * Returns all the meta codes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByCompanyId_First(
			long companyId, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByCompanyId_First(
		long companyId, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByCompanyId_Last(
			long companyId, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByCompanyId_Last(
		long companyId, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where companyId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByCompanyId_PrevAndNext(
			long metaCodeId, long companyId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByCompanyId_PrevAndNext(
			metaCodeId, companyId, orderByComparator);
	}

	/**
	 * Removes all the meta codes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of meta codes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching meta codes
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the meta codes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching meta codes
	 */
	public static List<MetaCode> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public static List<MetaCode> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public static List<MetaCode> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUserId_First(
			long userId, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUserId_First(
		long userId, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public static MetaCode findByUserId_Last(
			long userId, OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchByUserId_Last(
		long userId, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where userId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode[] findByUserId_PrevAndNext(
			long metaCodeId, long userId,
			OrderByComparator<MetaCode> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByUserId_PrevAndNext(
			metaCodeId, userId, orderByComparator);
	}

	/**
	 * Removes all the meta codes where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of meta codes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching meta codes
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the meta code in the entity cache if it is enabled.
	 *
	 * @param metaCode the meta code
	 */
	public static void cacheResult(MetaCode metaCode) {
		getPersistence().cacheResult(metaCode);
	}

	/**
	 * Caches the meta codes in the entity cache if it is enabled.
	 *
	 * @param metaCodes the meta codes
	 */
	public static void cacheResult(List<MetaCode> metaCodes) {
		getPersistence().cacheResult(metaCodes);
	}

	/**
	 * Creates a new meta code with the primary key. Does not add the meta code to the database.
	 *
	 * @param metaCodeId the primary key for the new meta code
	 * @return the new meta code
	 */
	public static MetaCode create(long metaCodeId) {
		return getPersistence().create(metaCodeId);
	}

	/**
	 * Removes the meta code with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code that was removed
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode remove(long metaCodeId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().remove(metaCodeId);
	}

	public static MetaCode updateImpl(MetaCode metaCode) {
		return getPersistence().updateImpl(metaCode);
	}

	/**
	 * Returns the meta code with the primary key or throws a <code>NoSuchMetaCodeException</code> if it could not be found.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public static MetaCode findByPrimaryKey(long metaCodeId)
		throws com.dhsoft.edc.backend.exception.NoSuchMetaCodeException {

		return getPersistence().findByPrimaryKey(metaCodeId);
	}

	/**
	 * Returns the meta code with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code, or <code>null</code> if a meta code with the primary key could not be found
	 */
	public static MetaCode fetchByPrimaryKey(long metaCodeId) {
		return getPersistence().fetchByPrimaryKey(metaCodeId);
	}

	/**
	 * Returns all the meta codes.
	 *
	 * @return the meta codes
	 */
	public static List<MetaCode> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of meta codes
	 */
	public static List<MetaCode> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meta codes
	 */
	public static List<MetaCode> findAll(
		int start, int end, OrderByComparator<MetaCode> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meta codes
	 */
	public static List<MetaCode> findAll(
		int start, int end, OrderByComparator<MetaCode> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the meta codes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of meta codes.
	 *
	 * @return the number of meta codes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MetaCodePersistence getPersistence() {
		return _persistence;
	}

	private static volatile MetaCodePersistence _persistence;

}
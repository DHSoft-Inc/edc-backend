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

import com.dhsoft.edc.backend.model.QueryLink;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the query link service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.QueryLinkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLinkPersistence
 * @generated
 */
public class QueryLinkUtil {

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
	public static void clearCache(QueryLink queryLink) {
		getPersistence().clearCache(queryLink);
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
	public static Map<Serializable, QueryLink> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QueryLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QueryLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QueryLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QueryLink update(QueryLink queryLink) {
		return getPersistence().update(queryLink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QueryLink update(
		QueryLink queryLink, ServiceContext serviceContext) {

		return getPersistence().update(queryLink, serviceContext);
	}

	/**
	 * Returns all the query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching query links
	 */
	public static List<QueryLink> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUuid_First(
			String uuid, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUuid_First(
		String uuid, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUuid_Last(
			String uuid, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUuid_Last(
		String uuid, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByUuid_PrevAndNext(
			long queryId, String uuid,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_PrevAndNext(
			queryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the query links where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching query links
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the query link where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the query link that was removed
	 */
	public static QueryLink removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of query links where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching query links
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByUuid_C_PrevAndNext(
			long queryId, String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUuid_C_PrevAndNext(
			queryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the query links where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching query links
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the query links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the query links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByCompanyId_First(
			long companyId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByCompanyId_First(
		long companyId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByCompanyId_Last(
			long companyId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByCompanyId_Last(
		long companyId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByCompanyId_PrevAndNext(
			long queryId, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCompanyId_PrevAndNext(
			queryId, companyId, orderByComparator);
	}

	/**
	 * Removes all the query links where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of query links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching query links
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the query links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the query links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByG_P_PrevAndNext(
			long queryId, long groupId, long projectId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByG_P_PrevAndNext(
			queryId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the query links where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of query links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching query links
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the query links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the query links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUserId(
		long userId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByUserId(
		long userId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUserId_First(
			long userId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUserId_First(
		long userId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByUserId_Last(
			long userId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByUserId_Last(
		long userId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where userId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByUserId_PrevAndNext(
			long queryId, long userId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByUserId_PrevAndNext(
			queryId, userId, orderByComparator);
	}

	/**
	 * Removes all the query links where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of query links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching query links
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_PrevAndNext(
			queryId, subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			subCRFId, instanceId, orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 */
	public static void removeByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		getPersistence().removeByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching query links
	 */
	public static int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return getPersistence().countByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);
	}

	/**
	 * Returns all the query links where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the matching query links
	 */
	public static List<QueryLink> findByItemCode(long itemCode) {
		return getPersistence().findByItemCode(itemCode);
	}

	/**
	 * Returns a range of all the query links where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByItemCode(
		long itemCode, int start, int end) {

		return getPersistence().findByItemCode(itemCode, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByItemCode(
		long itemCode, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByItemCode(
			itemCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByItemCode(
		long itemCode, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByItemCode(
			itemCode, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByItemCode_First(
			long itemCode, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByItemCode_First(
			itemCode, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByItemCode_First(
		long itemCode, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByItemCode_First(
			itemCode, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByItemCode_Last(
			long itemCode, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByItemCode_Last(
			itemCode, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByItemCode_Last(
		long itemCode, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByItemCode_Last(
			itemCode, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where itemCode = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByItemCode_PrevAndNext(
			long queryId, long itemCode,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByItemCode_PrevAndNext(
			queryId, itemCode, orderByComparator);
	}

	/**
	 * Removes all the query links where itemCode = &#63; from the database.
	 *
	 * @param itemCode the item code
	 */
	public static void removeByItemCode(long itemCode) {
		getPersistence().removeByItemCode(itemCode);
	}

	/**
	 * Returns the number of query links where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the number of matching query links
	 */
	public static int countByItemCode(long itemCode) {
		return getPersistence().countByItemCode(itemCode);
	}

	/**
	 * Returns all the query links where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByOpenUserId(long openUserId) {
		return getPersistence().findByOpenUserId(openUserId);
	}

	/**
	 * Returns a range of all the query links where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByOpenUserId(
		long openUserId, int start, int end) {

		return getPersistence().findByOpenUserId(openUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByOpenUserId(
		long openUserId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByOpenUserId(
			openUserId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByOpenUserId(
		long openUserId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByOpenUserId(
			openUserId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByOpenUserId_First(
			long openUserId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByOpenUserId_First(
			openUserId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByOpenUserId_First(
		long openUserId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByOpenUserId_First(
			openUserId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByOpenUserId_Last(
			long openUserId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByOpenUserId_Last(
			openUserId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByOpenUserId_Last(
		long openUserId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByOpenUserId_Last(
			openUserId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where openUserId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByOpenUserId_PrevAndNext(
			long queryId, long openUserId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByOpenUserId_PrevAndNext(
			queryId, openUserId, orderByComparator);
	}

	/**
	 * Removes all the query links where openUserId = &#63; from the database.
	 *
	 * @param openUserId the open user ID
	 */
	public static void removeByOpenUserId(long openUserId) {
		getPersistence().removeByOpenUserId(openUserId);
	}

	/**
	 * Returns the number of query links where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the number of matching query links
	 */
	public static int countByOpenUserId(long openUserId) {
		return getPersistence().countByOpenUserId(openUserId);
	}

	/**
	 * Returns all the query links where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByAnswerUserID(long answerUserID) {
		return getPersistence().findByAnswerUserID(answerUserID);
	}

	/**
	 * Returns a range of all the query links where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByAnswerUserID(
		long answerUserID, int start, int end) {

		return getPersistence().findByAnswerUserID(answerUserID, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByAnswerUserID(
		long answerUserID, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByAnswerUserID(
			answerUserID, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByAnswerUserID(
		long answerUserID, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAnswerUserID(
			answerUserID, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByAnswerUserID_First(
			long answerUserID, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByAnswerUserID_First(
			answerUserID, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByAnswerUserID_First(
		long answerUserID, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByAnswerUserID_First(
			answerUserID, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByAnswerUserID_Last(
			long answerUserID, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByAnswerUserID_Last(
			answerUserID, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByAnswerUserID_Last(
		long answerUserID, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByAnswerUserID_Last(
			answerUserID, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where answerUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByAnswerUserID_PrevAndNext(
			long queryId, long answerUserID,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByAnswerUserID_PrevAndNext(
			queryId, answerUserID, orderByComparator);
	}

	/**
	 * Removes all the query links where answerUserID = &#63; from the database.
	 *
	 * @param answerUserID the answer user ID
	 */
	public static void removeByAnswerUserID(long answerUserID) {
		getPersistence().removeByAnswerUserID(answerUserID);
	}

	/**
	 * Returns the number of query links where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the number of matching query links
	 */
	public static int countByAnswerUserID(long answerUserID) {
		return getPersistence().countByAnswerUserID(answerUserID);
	}

	/**
	 * Returns all the query links where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByCloseUserID(long closeUserID) {
		return getPersistence().findByCloseUserID(closeUserID);
	}

	/**
	 * Returns a range of all the query links where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByCloseUserID(
		long closeUserID, int start, int end) {

		return getPersistence().findByCloseUserID(closeUserID, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByCloseUserID(
		long closeUserID, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByCloseUserID(
			closeUserID, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByCloseUserID(
		long closeUserID, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCloseUserID(
			closeUserID, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByCloseUserID_First(
			long closeUserID, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCloseUserID_First(
			closeUserID, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByCloseUserID_First(
		long closeUserID, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByCloseUserID_First(
			closeUserID, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByCloseUserID_Last(
			long closeUserID, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCloseUserID_Last(
			closeUserID, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByCloseUserID_Last(
		long closeUserID, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByCloseUserID_Last(
			closeUserID, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where closeUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByCloseUserID_PrevAndNext(
			long queryId, long closeUserID,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByCloseUserID_PrevAndNext(
			queryId, closeUserID, orderByComparator);
	}

	/**
	 * Removes all the query links where closeUserID = &#63; from the database.
	 *
	 * @param closeUserID the close user ID
	 */
	public static void removeByCloseUserID(long closeUserID) {
		getPersistence().removeByCloseUserID(closeUserID);
	}

	/**
	 * Returns the number of query links where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the number of matching query links
	 */
	public static int countByCloseUserID(long closeUserID) {
		return getPersistence().countByCloseUserID(closeUserID);
	}

	/**
	 * Returns all the query links where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByR_R(long reopenId, long ruleId) {
		return getPersistence().findByR_R(reopenId, ruleId);
	}

	/**
	 * Returns a range of all the query links where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByR_R(
		long reopenId, long ruleId, int start, int end) {

		return getPersistence().findByR_R(reopenId, ruleId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByR_R(
		long reopenId, long ruleId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByR_R(
			reopenId, ruleId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByR_R(
		long reopenId, long ruleId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByR_R(
			reopenId, ruleId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByR_R_First(
			long reopenId, long ruleId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByR_R_First(
			reopenId, ruleId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByR_R_First(
		long reopenId, long ruleId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByR_R_First(
			reopenId, ruleId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByR_R_Last(
			long reopenId, long ruleId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByR_R_Last(
			reopenId, ruleId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByR_R_Last(
		long reopenId, long ruleId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByR_R_Last(
			reopenId, ruleId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByR_R_PrevAndNext(
			long queryId, long reopenId, long ruleId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByR_R_PrevAndNext(
			queryId, reopenId, ruleId, orderByComparator);
	}

	/**
	 * Removes all the query links where reopenId = &#63; and ruleId = &#63; from the database.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 */
	public static void removeByR_R(long reopenId, long ruleId) {
		getPersistence().removeByR_R(reopenId, ruleId);
	}

	/**
	 * Returns the number of query links where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the number of matching query links
	 */
	public static int countByR_R(long reopenId, long ruleId) {
		return getPersistence().countByR_R(reopenId, ruleId);
	}

	/**
	 * Caches the query link in the entity cache if it is enabled.
	 *
	 * @param queryLink the query link
	 */
	public static void cacheResult(QueryLink queryLink) {
		getPersistence().cacheResult(queryLink);
	}

	/**
	 * Caches the query links in the entity cache if it is enabled.
	 *
	 * @param queryLinks the query links
	 */
	public static void cacheResult(List<QueryLink> queryLinks) {
		getPersistence().cacheResult(queryLinks);
	}

	/**
	 * Creates a new query link with the primary key. Does not add the query link to the database.
	 *
	 * @param queryId the primary key for the new query link
	 * @return the new query link
	 */
	public static QueryLink create(long queryId) {
		return getPersistence().create(queryId);
	}

	/**
	 * Removes the query link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link that was removed
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink remove(long queryId)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().remove(queryId);
	}

	public static QueryLink updateImpl(QueryLink queryLink) {
		return getPersistence().updateImpl(queryLink);
	}

	/**
	 * Returns the query link with the primary key or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink findByPrimaryKey(long queryId)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByPrimaryKey(queryId);
	}

	/**
	 * Returns the query link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link, or <code>null</code> if a query link with the primary key could not be found
	 */
	public static QueryLink fetchByPrimaryKey(long queryId) {
		return getPersistence().fetchByPrimaryKey(queryId);
	}

	/**
	 * Returns all the query links.
	 *
	 * @return the query links
	 */
	public static List<QueryLink> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of query links
	 */
	public static List<QueryLink> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query links
	 */
	public static List<QueryLink> findAll(
		int start, int end, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query links
	 */
	public static List<QueryLink> findAll(
		int start, int end, OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the query links from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of query links.
	 *
	 * @return the number of query links
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QueryLinkPersistence getPersistence() {
		return _persistence;
	}

	private static volatile QueryLinkPersistence _persistence;

}
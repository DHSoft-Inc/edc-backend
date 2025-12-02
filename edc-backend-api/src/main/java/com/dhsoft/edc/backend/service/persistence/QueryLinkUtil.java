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
	 * Returns all the query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findBySubjectId(long subjectId) {
		return getPersistence().findBySubjectId(subjectId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findBySubjectId(
		long subjectId, int start, int end) {

		return getPersistence().findBySubjectId(subjectId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findBySubjectId(
			subjectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySubjectId(
			subjectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findBySubjectId_First(
			long subjectId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findBySubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchBySubjectId_First(
		long subjectId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchBySubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findBySubjectId_Last(
			long subjectId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findBySubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchBySubjectId_Last(
		long subjectId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchBySubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findBySubjectId_PrevAndNext(
			long queryId, long subjectId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findBySubjectId_PrevAndNext(
			queryId, subjectId, orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public static void removeBySubjectId(long subjectId) {
		getPersistence().removeBySubjectId(subjectId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching query links
	 */
	public static int countBySubjectId(long subjectId) {
		return getPersistence().countBySubjectId(subjectId);
	}

	/**
	 * Returns all the query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByInstanceId(long instanceId) {
		return getPersistence().findByInstanceId(instanceId);
	}

	/**
	 * Returns a range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByInstanceId(
		long instanceId, int start, int end) {

		return getPersistence().findByInstanceId(instanceId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByInstanceId(
			instanceId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstanceId(
			instanceId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByInstanceId_First(
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByInstanceId_First(
			instanceId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByInstanceId_First(
		long instanceId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByInstanceId_First(
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByInstanceId_Last(
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByInstanceId_Last(
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByInstanceId_Last(
		long instanceId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByInstanceId_Last(
			instanceId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByInstanceId_PrevAndNext(
			long queryId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByInstanceId_PrevAndNext(
			queryId, instanceId, orderByComparator);
	}

	/**
	 * Removes all the query links where instanceId = &#63; from the database.
	 *
	 * @param instanceId the instance ID
	 */
	public static void removeByInstanceId(long instanceId) {
		getPersistence().removeByInstanceId(instanceId);
	}

	/**
	 * Returns the number of query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the number of matching query links
	 */
	public static int countByInstanceId(long instanceId) {
		return getPersistence().countByInstanceId(instanceId);
	}

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId) {

		return getPersistence().findByS_VG(subjectId, visitGroupId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end) {

		return getPersistence().findByS_VG(subjectId, visitGroupId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByS_VG(
			subjectId, visitGroupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG(
			subjectId, visitGroupId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_First(
			long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_First(
			subjectId, visitGroupId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_First(
		long subjectId, long visitGroupId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_First(
			subjectId, visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_Last(
			long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_Last(
			subjectId, visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_Last(
		long subjectId, long visitGroupId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_Last(
			subjectId, visitGroupId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByS_VG_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_PrevAndNext(
			queryId, subjectId, visitGroupId, orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 */
	public static void removeByS_VG(long subjectId, long visitGroupId) {
		getPersistence().removeByS_VG(subjectId, visitGroupId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the number of matching query links
	 */
	public static int countByS_VG(long subjectId, long visitGroupId) {
		return getPersistence().countByS_VG(subjectId, visitGroupId);
	}

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		return getPersistence().findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end) {

		return getPersistence().findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end, OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_First(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_First(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_Last(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_Last(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByS_VG_VD_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_PrevAndNext(
			queryId, subjectId, visitGroupId, visitDefinitionId,
			orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public static void removeByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		getPersistence().removeByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching query links
	 */
	public static int countByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		return getPersistence().countByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId);
	}

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		return getPersistence().findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end) {

		return getPersistence().findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByS_VG_VD_VC_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_PrevAndNext(
			queryId, subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 */
	public static void removeByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		getPersistence().removeByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching query links
	 */
	public static int countByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		return getPersistence().countByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId);
	}

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		return getPersistence().findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
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
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end) {

		return getPersistence().findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			start, end);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
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
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
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
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public static List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_S_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_S_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public static QueryLink findByS_VG_VD_VC_S_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchByS_VG_VD_VC_S_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		OrderByComparator<QueryLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public static QueryLink[] findByS_VG_VD_VC_S_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchQueryLinkException {

		return getPersistence().findByS_VG_VD_VC_S_PrevAndNext(
			queryId, subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			subCRFId, orderByComparator);
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 */
	public static void removeByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		getPersistence().removeByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId);
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the number of matching query links
	 */
	public static int countByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		return getPersistence().countByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId);
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
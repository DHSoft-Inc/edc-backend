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

import com.dhsoft.edc.backend.model.VisitEvent;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the visit event service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.VisitEventPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitEventPersistence
 * @generated
 */
public class VisitEventUtil {

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
	public static void clearCache(VisitEvent visitEvent) {
		getPersistence().clearCache(visitEvent);
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
	public static Map<Serializable, VisitEvent> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VisitEvent> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VisitEvent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VisitEvent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VisitEvent update(VisitEvent visitEvent) {
		return getPersistence().update(visitEvent);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VisitEvent update(
		VisitEvent visitEvent, ServiceContext serviceContext) {

		return getPersistence().update(visitEvent, serviceContext);
	}

	/**
	 * Returns all the visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUuid_First(
			String uuid, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUuid_First(
		String uuid, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUuid_Last(
			String uuid, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUuid_Last(
		String uuid, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByUuid_PrevAndNext(
			long visitEventId, String uuid,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_PrevAndNext(
			visitEventId, uuid, orderByComparator);
	}

	/**
	 * Removes all the visit events where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit events
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the visit event where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit event that was removed
	 */
	public static VisitEvent removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of visit events where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit events
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByUuid_C_PrevAndNext(
			long visitEventId, String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUuid_C_PrevAndNext(
			visitEventId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the visit events where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByCompanyId_First(
			long companyId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByCompanyId_First(
		long companyId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByCompanyId_Last(
			long companyId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByCompanyId_Last(
		long companyId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByCompanyId_PrevAndNext(
			long visitEventId, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByCompanyId_PrevAndNext(
			visitEventId, companyId, orderByComparator);
	}

	/**
	 * Removes all the visit events where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByG_P_PrevAndNext(
			long visitEventId, long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByG_P_PrevAndNext(
			visitEventId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the visit events where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit events
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId) {

		return getPersistence().findByS_VD(subjectId, visitDefinitionId);
	}

	/**
	 * Returns a range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end) {

		return getPersistence().findByS_VD(
			subjectId, visitDefinitionId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByS_VD(
			subjectId, visitDefinitionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VD(
			subjectId, visitDefinitionId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByS_VD_First(
			long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByS_VD_First(
			subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByS_VD_First(
		long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByS_VD_First(
			subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByS_VD_Last(
			long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByS_VD_Last(
			subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByS_VD_Last(
		long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByS_VD_Last(
			subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByS_VD_PrevAndNext(
			long visitEventId, long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByS_VD_PrevAndNext(
			visitEventId, subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Removes all the visit events where subjectId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public static void removeByS_VD(long subjectId, long visitDefinitionId) {
		getPersistence().removeByS_VD(subjectId, visitDefinitionId);
	}

	/**
	 * Returns the number of visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching visit events
	 */
	public static int countByS_VD(long subjectId, long visitDefinitionId) {
		return getPersistence().countByS_VD(subjectId, visitDefinitionId);
	}

	/**
	 * Returns all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		return getPersistence().findByI_S_V(
			institutionId, subjectId, visitDefinitionId);
	}

	/**
	 * Returns a range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end) {

		return getPersistence().findByI_S_V(
			institutionId, subjectId, visitDefinitionId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByI_S_V(
			institutionId, subjectId, visitDefinitionId, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end, OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByI_S_V(
			institutionId, subjectId, visitDefinitionId, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByI_S_V_First(
			long institutionId, long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByI_S_V_First(
			institutionId, subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByI_S_V_First(
		long institutionId, long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByI_S_V_First(
			institutionId, subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByI_S_V_Last(
			long institutionId, long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByI_S_V_Last(
			institutionId, subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByI_S_V_Last(
		long institutionId, long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByI_S_V_Last(
			institutionId, subjectId, visitDefinitionId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByI_S_V_PrevAndNext(
			long visitEventId, long institutionId, long subjectId,
			long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByI_S_V_PrevAndNext(
			visitEventId, institutionId, subjectId, visitDefinitionId,
			orderByComparator);
	}

	/**
	 * Removes all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public static void removeByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		getPersistence().removeByI_S_V(
			institutionId, subjectId, visitDefinitionId);
	}

	/**
	 * Returns the number of visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching visit events
	 */
	public static int countByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		return getPersistence().countByI_S_V(
			institutionId, subjectId, visitDefinitionId);
	}

	/**
	 * Returns all the visit events where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findBysubjectId(long subjectId) {
		return getPersistence().findBysubjectId(subjectId);
	}

	/**
	 * Returns a range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end) {

		return getPersistence().findBysubjectId(subjectId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findBysubjectId(
			subjectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBysubjectId(
			subjectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findBysubjectId_First(
			long subjectId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findBysubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchBysubjectId_First(
		long subjectId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchBysubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findBysubjectId_Last(
			long subjectId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findBysubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchBysubjectId_Last(
		long subjectId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchBysubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findBysubjectId_PrevAndNext(
			long visitEventId, long subjectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findBysubjectId_PrevAndNext(
			visitEventId, subjectId, orderByComparator);
	}

	/**
	 * Removes all the visit events where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public static void removeBysubjectId(long subjectId) {
		getPersistence().removeBysubjectId(subjectId);
	}

	/**
	 * Returns the number of visit events where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching visit events
	 */
	public static int countBysubjectId(long subjectId) {
		return getPersistence().countBysubjectId(subjectId);
	}

	/**
	 * Returns all the visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit events
	 */
	public static List<VisitEvent> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public static List<VisitEvent> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public static List<VisitEvent> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUserId_First(
			long userId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUserId_First(
		long userId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public static VisitEvent findByUserId_Last(
			long userId, OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchByUserId_Last(
		long userId, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where userId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent[] findByUserId_PrevAndNext(
			long visitEventId, long userId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByUserId_PrevAndNext(
			visitEventId, userId, orderByComparator);
	}

	/**
	 * Removes all the visit events where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit events
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the visit event in the entity cache if it is enabled.
	 *
	 * @param visitEvent the visit event
	 */
	public static void cacheResult(VisitEvent visitEvent) {
		getPersistence().cacheResult(visitEvent);
	}

	/**
	 * Caches the visit events in the entity cache if it is enabled.
	 *
	 * @param visitEvents the visit events
	 */
	public static void cacheResult(List<VisitEvent> visitEvents) {
		getPersistence().cacheResult(visitEvents);
	}

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	public static VisitEvent create(long visitEventId) {
		return getPersistence().create(visitEventId);
	}

	/**
	 * Removes the visit event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event that was removed
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent remove(long visitEventId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().remove(visitEventId);
	}

	public static VisitEvent updateImpl(VisitEvent visitEvent) {
		return getPersistence().updateImpl(visitEvent);
	}

	/**
	 * Returns the visit event with the primary key or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public static VisitEvent findByPrimaryKey(long visitEventId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitEventException {

		return getPersistence().findByPrimaryKey(visitEventId);
	}

	/**
	 * Returns the visit event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event, or <code>null</code> if a visit event with the primary key could not be found
	 */
	public static VisitEvent fetchByPrimaryKey(long visitEventId) {
		return getPersistence().fetchByPrimaryKey(visitEventId);
	}

	/**
	 * Returns all the visit events.
	 *
	 * @return the visit events
	 */
	public static List<VisitEvent> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of visit events
	 */
	public static List<VisitEvent> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit events
	 */
	public static List<VisitEvent> findAll(
		int start, int end, OrderByComparator<VisitEvent> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit events
	 */
	public static List<VisitEvent> findAll(
		int start, int end, OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the visit events from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VisitEventPersistence getPersistence() {
		return _persistence;
	}

	private static volatile VisitEventPersistence _persistence;

}
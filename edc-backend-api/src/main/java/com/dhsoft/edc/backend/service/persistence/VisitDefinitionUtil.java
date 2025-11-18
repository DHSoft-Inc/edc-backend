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

import com.dhsoft.edc.backend.model.VisitDefinition;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the visit definition service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.VisitDefinitionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitDefinitionPersistence
 * @generated
 */
public class VisitDefinitionUtil {

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
	public static void clearCache(VisitDefinition visitDefinition) {
		getPersistence().clearCache(visitDefinition);
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
	public static Map<Serializable, VisitDefinition> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VisitDefinition update(VisitDefinition visitDefinition) {
		return getPersistence().update(visitDefinition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VisitDefinition update(
		VisitDefinition visitDefinition, ServiceContext serviceContext) {

		return getPersistence().update(visitDefinition, serviceContext);
	}

	/**
	 * Returns all the visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUuid_First(
			String uuid, OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUuid_First(
		String uuid, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUuid_Last(
			String uuid, OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUuid_Last(
		String uuid, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByUuid_PrevAndNext(
			long visitDefinitionId, String uuid,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_PrevAndNext(
			visitDefinitionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit definitions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit definition that was removed
	 */
	public static VisitDefinition removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit definitions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByUuid_C_PrevAndNext(
			long visitDefinitionId, String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			visitDefinitionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByCompanyId_First(
			long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByCompanyId_First(
		long companyId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByCompanyId_Last(
			long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByCompanyId_Last(
		long companyId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByCompanyId_PrevAndNext(
			long visitDefinitionId, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByCompanyId_PrevAndNext(
			visitDefinitionId, companyId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByG_P(
		long groupId, long projectId) {

		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByG_P_PrevAndNext(
			long visitDefinitionId, long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByG_P_PrevAndNext(
			visitDefinitionId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByProjectId(long projectId) {
		return getPersistence().findByProjectId(projectId);
	}

	/**
	 * Returns a range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByProjectId(
		long projectId, int start, int end) {

		return getPersistence().findByProjectId(projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByProjectId(
			projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByProjectId(
			projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByProjectId_First(
			long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByProjectId_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByProjectId_First(
		long projectId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByProjectId_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByProjectId_Last(
			long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByProjectId_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByProjectId_Last(
		long projectId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByProjectId_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByProjectId_PrevAndNext(
			long visitDefinitionId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByProjectId_PrevAndNext(
			visitDefinitionId, projectId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public static void removeByProjectId(long projectId) {
		getPersistence().removeByProjectId(projectId);
	}

	/**
	 * Returns the number of visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	public static int countByProjectId(long projectId) {
		return getPersistence().countByProjectId(projectId);
	}

	/**
	 * Returns all the visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitGroupId(long visitGroupId) {
		return getPersistence().findByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns a range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end) {

		return getPersistence().findByVisitGroupId(visitGroupId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByVisitGroupId(
			visitGroupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByVisitGroupId(
			visitGroupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitGroupId_First(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitGroupId_First(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitGroupId_Last(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitGroupId_Last(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByVisitGroupId_PrevAndNext(
			long visitDefinitionId, long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitGroupId_PrevAndNext(
			visitDefinitionId, visitGroupId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	public static void removeByVisitGroupId(long visitGroupId) {
		getPersistence().removeByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns the number of visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching visit definitions
	 */
	public static int countByVisitGroupId(long visitGroupId) {
		return getPersistence().countByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns all the visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUserId_First(
			long userId, OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUserId_First(
		long userId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByUserId_Last(
			long userId, OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByUserId_Last(
		long userId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where userId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByUserId_PrevAndNext(
			long visitDefinitionId, long userId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByUserId_PrevAndNext(
			visitDefinitionId, userId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit definitions
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitCRFId(long visitCRFId) {
		return getPersistence().findByVisitCRFId(visitCRFId);
	}

	/**
	 * Returns a range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end) {

		return getPersistence().findByVisitCRFId(visitCRFId, start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findByVisitCRFId(
			visitCRFId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public static List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByVisitCRFId(
			visitCRFId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitCRFId_First(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByVisitCRFId_First(
		long visitCRFId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitCRFId_First(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public static VisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitCRFId_Last(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId, OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitCRFId_Last(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition[] findByVisitCRFId_PrevAndNext(
			long visitDefinitionId, long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByVisitCRFId_PrevAndNext(
			visitDefinitionId, visitCRFId, orderByComparator);
	}

	/**
	 * Removes all the visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	public static void removeByVisitCRFId(long visitCRFId) {
		getPersistence().removeByVisitCRFId(visitCRFId);
	}

	/**
	 * Returns the number of visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching visit definitions
	 */
	public static int countByVisitCRFId(long visitCRFId) {
		return getPersistence().countByVisitCRFId(visitCRFId);
	}

	/**
	 * Caches the visit definition in the entity cache if it is enabled.
	 *
	 * @param visitDefinition the visit definition
	 */
	public static void cacheResult(VisitDefinition visitDefinition) {
		getPersistence().cacheResult(visitDefinition);
	}

	/**
	 * Caches the visit definitions in the entity cache if it is enabled.
	 *
	 * @param visitDefinitions the visit definitions
	 */
	public static void cacheResult(List<VisitDefinition> visitDefinitions) {
		getPersistence().cacheResult(visitDefinitions);
	}

	/**
	 * Creates a new visit definition with the primary key. Does not add the visit definition to the database.
	 *
	 * @param visitDefinitionId the primary key for the new visit definition
	 * @return the new visit definition
	 */
	public static VisitDefinition create(long visitDefinitionId) {
		return getPersistence().create(visitDefinitionId);
	}

	/**
	 * Removes the visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition that was removed
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition remove(long visitDefinitionId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().remove(visitDefinitionId);
	}

	public static VisitDefinition updateImpl(VisitDefinition visitDefinition) {
		return getPersistence().updateImpl(visitDefinition);
	}

	/**
	 * Returns the visit definition with the primary key or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition findByPrimaryKey(long visitDefinitionId)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException {

		return getPersistence().findByPrimaryKey(visitDefinitionId);
	}

	/**
	 * Returns the visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition, or <code>null</code> if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition fetchByPrimaryKey(long visitDefinitionId) {
		return getPersistence().fetchByPrimaryKey(visitDefinitionId);
	}

	/**
	 * Returns all the visit definitions.
	 *
	 * @return the visit definitions
	 */
	public static List<VisitDefinition> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of visit definitions
	 */
	public static List<VisitDefinition> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit definitions
	 */
	public static List<VisitDefinition> findAll(
		int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit definitions
	 */
	public static List<VisitDefinition> findAll(
		int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the visit definitions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of visit definitions.
	 *
	 * @return the number of visit definitions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VisitDefinitionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile VisitDefinitionPersistence _persistence;

}
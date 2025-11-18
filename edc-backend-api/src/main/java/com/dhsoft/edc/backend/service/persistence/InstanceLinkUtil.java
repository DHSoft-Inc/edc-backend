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

import com.dhsoft.edc.backend.model.InstanceLink;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the instance link service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.InstanceLinkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstanceLinkPersistence
 * @generated
 */
public class InstanceLinkUtil {

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
	public static void clearCache(InstanceLink instanceLink) {
		getPersistence().clearCache(instanceLink);
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
	public static Map<Serializable, InstanceLink> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<InstanceLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InstanceLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InstanceLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static InstanceLink update(InstanceLink instanceLink) {
		return getPersistence().update(instanceLink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static InstanceLink update(
		InstanceLink instanceLink, ServiceContext serviceContext) {

		return getPersistence().update(instanceLink, serviceContext);
	}

	/**
	 * Returns all the instance links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUuid_First(
			String uuid, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUuid_First(
		String uuid, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUuid_Last(
			String uuid, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUuid_Last(
		String uuid, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where uuid = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByUuid_PrevAndNext(
			long linkId, String uuid,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_PrevAndNext(
			linkId, uuid, orderByComparator);
	}

	/**
	 * Removes all the instance links where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of instance links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching instance links
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstanceLinkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the instance link where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the instance link that was removed
	 */
	public static InstanceLink removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of instance links where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching instance links
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByUuid_C_PrevAndNext(
			long linkId, String uuid, long companyId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUuid_C_PrevAndNext(
			linkId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the instance links where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching instance links
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the instance links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByCompanyId_First(
			long companyId, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByCompanyId_First(
		long companyId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByCompanyId_Last(
			long companyId, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByCompanyId_Last(
		long companyId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where companyId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByCompanyId_PrevAndNext(
			long linkId, long companyId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByCompanyId_PrevAndNext(
			linkId, companyId, orderByComparator);
	}

	/**
	 * Removes all the instance links where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of instance links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching instance links
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByG_P(long groupId, long projectId) {
		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByG_P_PrevAndNext(
			long linkId, long groupId, long projectId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByG_P_PrevAndNext(
			linkId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the instance links where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching instance links
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the instance links where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByInstitutionId(long institutionId) {
		return getPersistence().findByInstitutionId(institutionId);
	}

	/**
	 * Returns a range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end) {

		return getPersistence().findByInstitutionId(institutionId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByInstitutionId(
			institutionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitutionId(
			institutionId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByInstitutionId_First(
			long institutionId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByInstitutionId_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByInstitutionId_First(
		long institutionId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByInstitutionId_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByInstitutionId_Last(
			long institutionId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByInstitutionId_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByInstitutionId_Last(
		long institutionId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByInstitutionId_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByInstitutionId_PrevAndNext(
			long linkId, long institutionId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByInstitutionId_PrevAndNext(
			linkId, institutionId, orderByComparator);
	}

	/**
	 * Removes all the instance links where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public static void removeByInstitutionId(long institutionId) {
		getPersistence().removeByInstitutionId(institutionId);
	}

	/**
	 * Returns the number of instance links where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching instance links
	 */
	public static int countByInstitutionId(long institutionId) {
		return getPersistence().countByInstitutionId(institutionId);
	}

	/**
	 * Returns all the instance links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUserId_First(
			long userId, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUserId_First(
		long userId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByUserId_Last(
			long userId, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByUserId_Last(
		long userId, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where userId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByUserId_PrevAndNext(
			long linkId, long userId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByUserId_PrevAndNext(
			linkId, userId, orderByComparator);
	}

	/**
	 * Removes all the instance links where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of instance links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching instance links
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching instance links
	 */
	public static List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);
	}

	/**
	 * Returns a range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public static List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end);
	}

	/**
	 * Returns an ordered range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public static List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the first instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public static InstanceLink findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the last instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public static InstanceLink fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().fetchByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);
	}

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long linkId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId, OrderByComparator<InstanceLink> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByS_VG_VD_VC_S_I_PrevAndNext(
			linkId, subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			subCRFId, instanceId, orderByComparator);
	}

	/**
	 * Removes all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
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
	 * Returns the number of instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching instance links
	 */
	public static int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return getPersistence().countByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);
	}

	/**
	 * Caches the instance link in the entity cache if it is enabled.
	 *
	 * @param instanceLink the instance link
	 */
	public static void cacheResult(InstanceLink instanceLink) {
		getPersistence().cacheResult(instanceLink);
	}

	/**
	 * Caches the instance links in the entity cache if it is enabled.
	 *
	 * @param instanceLinks the instance links
	 */
	public static void cacheResult(List<InstanceLink> instanceLinks) {
		getPersistence().cacheResult(instanceLinks);
	}

	/**
	 * Creates a new instance link with the primary key. Does not add the instance link to the database.
	 *
	 * @param linkId the primary key for the new instance link
	 * @return the new instance link
	 */
	public static InstanceLink create(long linkId) {
		return getPersistence().create(linkId);
	}

	/**
	 * Removes the instance link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link that was removed
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink remove(long linkId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().remove(linkId);
	}

	public static InstanceLink updateImpl(InstanceLink instanceLink) {
		return getPersistence().updateImpl(instanceLink);
	}

	/**
	 * Returns the instance link with the primary key or throws a <code>NoSuchInstanceLinkException</code> if it could not be found.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public static InstanceLink findByPrimaryKey(long linkId)
		throws com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException {

		return getPersistence().findByPrimaryKey(linkId);
	}

	/**
	 * Returns the instance link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link, or <code>null</code> if a instance link with the primary key could not be found
	 */
	public static InstanceLink fetchByPrimaryKey(long linkId) {
		return getPersistence().fetchByPrimaryKey(linkId);
	}

	/**
	 * Returns all the instance links.
	 *
	 * @return the instance links
	 */
	public static List<InstanceLink> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of instance links
	 */
	public static List<InstanceLink> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of instance links
	 */
	public static List<InstanceLink> findAll(
		int start, int end, OrderByComparator<InstanceLink> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of instance links
	 */
	public static List<InstanceLink> findAll(
		int start, int end, OrderByComparator<InstanceLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the instance links from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of instance links.
	 *
	 * @return the number of instance links
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InstanceLinkPersistence getPersistence() {
		return _persistence;
	}

	private static volatile InstanceLinkPersistence _persistence;

}
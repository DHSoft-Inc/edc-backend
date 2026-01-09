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

import com.dhsoft.edc.backend.model.EdcPermissionRoleAudit;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edc permission role audit service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.EdcPermissionRoleAuditPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleAuditPersistence
 * @generated
 */
public class EdcPermissionRoleAuditUtil {

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
	public static void clearCache(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		getPersistence().clearCache(edcPermissionRoleAudit);
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
	public static Map<Serializable, EdcPermissionRoleAudit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EdcPermissionRoleAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdcPermissionRoleAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdcPermissionRoleAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdcPermissionRoleAudit update(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return getPersistence().update(edcPermissionRoleAudit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdcPermissionRoleAudit update(
		EdcPermissionRoleAudit edcPermissionRoleAudit,
		ServiceContext serviceContext) {

		return getPersistence().update(edcPermissionRoleAudit, serviceContext);
	}

	/**
	 * Returns all the edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUuid_First(
		String uuid,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUuid_Last(
		String uuid,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit[] findByUuid_PrevAndNext(
			long auditRoleId, String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_PrevAndNext(
			auditRoleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the edc permission role audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission role audits
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the edc permission role audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role audit that was removed
	 */
	public static EdcPermissionRoleAudit removeByUUID_G(
			String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission role audits
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit[] findByUuid_C_PrevAndNext(
			long auditRoleId, String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByUuid_C_PrevAndNext(
			auditRoleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the edc permission role audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission role audits
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup) {

		return getPersistence().findByActorGroupRole(actorGroup);
	}

	/**
	 * Returns a range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end) {

		return getPersistence().findByActorGroupRole(actorGroup, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findByActorGroupRole(
			actorGroup, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByActorGroupRole(
			actorGroup, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByActorGroupRole_First(
			long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorGroupRole_First(
			actorGroup, orderByComparator);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByActorGroupRole_First(
		long actorGroup,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByActorGroupRole_First(
			actorGroup, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByActorGroupRole_Last(
			long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorGroupRole_Last(
			actorGroup, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByActorGroupRole_Last(
		long actorGroup,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByActorGroupRole_Last(
			actorGroup, orderByComparator);
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit[] findByActorGroupRole_PrevAndNext(
			long auditRoleId, long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorGroupRole_PrevAndNext(
			auditRoleId, actorGroup, orderByComparator);
	}

	/**
	 * Removes all the edc permission role audits where actorGroup = &#63; from the database.
	 *
	 * @param actorGroup the actor group
	 */
	public static void removeByActorGroupRole(long actorGroup) {
		getPersistence().removeByActorGroupRole(actorGroup);
	}

	/**
	 * Returns the number of edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission role audits
	 */
	public static int countByActorGroupRole(long actorGroup) {
		return getPersistence().countByActorGroupRole(actorGroup);
	}

	/**
	 * Returns all the edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorRole(long actorId) {
		return getPersistence().findByActorRole(actorId);
	}

	/**
	 * Returns a range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end) {

		return getPersistence().findByActorRole(actorId, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findByActorRole(
			actorId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByActorRole(
			actorId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByActorRole_First(
			long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorRole_First(
			actorId, orderByComparator);
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByActorRole_First(
		long actorId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByActorRole_First(
			actorId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit findByActorRole_Last(
			long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorRole_Last(
			actorId, orderByComparator);
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit fetchByActorRole_Last(
		long actorId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().fetchByActorRole_Last(
			actorId, orderByComparator);
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit[] findByActorRole_PrevAndNext(
			long auditRoleId, long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByActorRole_PrevAndNext(
			auditRoleId, actorId, orderByComparator);
	}

	/**
	 * Removes all the edc permission role audits where actorId = &#63; from the database.
	 *
	 * @param actorId the actor ID
	 */
	public static void removeByActorRole(long actorId) {
		getPersistence().removeByActorRole(actorId);
	}

	/**
	 * Returns the number of edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the number of matching edc permission role audits
	 */
	public static int countByActorRole(long actorId) {
		return getPersistence().countByActorRole(actorId);
	}

	/**
	 * Caches the edc permission role audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 */
	public static void cacheResult(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		getPersistence().cacheResult(edcPermissionRoleAudit);
	}

	/**
	 * Caches the edc permission role audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudits the edc permission role audits
	 */
	public static void cacheResult(
		List<EdcPermissionRoleAudit> edcPermissionRoleAudits) {

		getPersistence().cacheResult(edcPermissionRoleAudits);
	}

	/**
	 * Creates a new edc permission role audit with the primary key. Does not add the edc permission role audit to the database.
	 *
	 * @param auditRoleId the primary key for the new edc permission role audit
	 * @return the new edc permission role audit
	 */
	public static EdcPermissionRoleAudit create(long auditRoleId) {
		return getPersistence().create(auditRoleId);
	}

	/**
	 * Removes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit remove(long auditRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().remove(auditRoleId);
	}

	public static EdcPermissionRoleAudit updateImpl(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return getPersistence().updateImpl(edcPermissionRoleAudit);
	}

	/**
	 * Returns the edc permission role audit with the primary key or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit findByPrimaryKey(long auditRoleId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionRoleAuditException {

		return getPersistence().findByPrimaryKey(auditRoleId);
	}

	/**
	 * Returns the edc permission role audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit, or <code>null</code> if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit fetchByPrimaryKey(long auditRoleId) {
		return getPersistence().fetchByPrimaryKey(auditRoleId);
	}

	/**
	 * Returns all the edc permission role audits.
	 *
	 * @return the edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the edc permission role audits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of edc permission role audits.
	 *
	 * @return the number of edc permission role audits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdcPermissionRoleAuditPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EdcPermissionRoleAuditPersistence _persistence;

}
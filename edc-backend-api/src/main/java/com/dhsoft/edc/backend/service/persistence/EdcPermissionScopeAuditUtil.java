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

import com.dhsoft.edc.backend.model.EdcPermissionScopeAudit;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edc permission scope audit service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.EdcPermissionScopeAuditPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopeAuditPersistence
 * @generated
 */
public class EdcPermissionScopeAuditUtil {

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
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		getPersistence().clearCache(edcPermissionScopeAudit);
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
	public static Map<Serializable, EdcPermissionScopeAudit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EdcPermissionScopeAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EdcPermissionScopeAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EdcPermissionScopeAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EdcPermissionScopeAudit update(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		return getPersistence().update(edcPermissionScopeAudit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EdcPermissionScopeAudit update(
		EdcPermissionScopeAudit edcPermissionScopeAudit,
		ServiceContext serviceContext) {

		return getPersistence().update(edcPermissionScopeAudit, serviceContext);
	}

	/**
	 * Returns all the edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUuid_First(
		String uuid,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUuid_Last(
		String uuid,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit[] findByUuid_PrevAndNext(
			long auditScopeId, String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_PrevAndNext(
			auditScopeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scope audits
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByUUID_G(
			String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the edc permission scope audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope audit that was removed
	 */
	public static EdcPermissionScopeAudit removeByUUID_G(
			String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scope audits
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit[] findByUuid_C_PrevAndNext(
			long auditScopeId, String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByUuid_C_PrevAndNext(
			auditScopeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scope audits
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName) {

		return getPersistence().findByRoleNameScope(roleName);
	}

	/**
	 * Returns a range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end) {

		return getPersistence().findByRoleNameScope(roleName, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findByRoleNameScope(
			roleName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByRoleNameScope(
			roleName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByRoleNameScope_First(
			String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByRoleNameScope_First(
			roleName, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByRoleNameScope_First(
		String roleName,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByRoleNameScope_First(
			roleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByRoleNameScope_Last(
			String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByRoleNameScope_Last(
			roleName, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByRoleNameScope_Last(
		String roleName,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByRoleNameScope_Last(
			roleName, orderByComparator);
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit[] findByRoleNameScope_PrevAndNext(
			long auditScopeId, String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByRoleNameScope_PrevAndNext(
			auditScopeId, roleName, orderByComparator);
	}

	/**
	 * Removes all the edc permission scope audits where roleName = &#63; from the database.
	 *
	 * @param roleName the role name
	 */
	public static void removeByRoleNameScope(String roleName) {
		getPersistence().removeByRoleNameScope(roleName);
	}

	/**
	 * Returns the number of edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the number of matching edc permission scope audits
	 */
	public static int countByRoleNameScope(String roleName) {
		return getPersistence().countByRoleNameScope(roleName);
	}

	/**
	 * Returns all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey) {

		return getPersistence().findByModuleTaskScope(moduleName, taskKey);
	}

	/**
	 * Returns a range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end) {

		return getPersistence().findByModuleTaskScope(
			moduleName, taskKey, start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findByModuleTaskScope(
			moduleName, taskKey, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByModuleTaskScope(
			moduleName, taskKey, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByModuleTaskScope_First(
			String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByModuleTaskScope_First(
			moduleName, taskKey, orderByComparator);
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByModuleTaskScope_First(
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByModuleTaskScope_First(
			moduleName, taskKey, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit findByModuleTaskScope_Last(
			String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByModuleTaskScope_Last(
			moduleName, taskKey, orderByComparator);
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public static EdcPermissionScopeAudit fetchByModuleTaskScope_Last(
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().fetchByModuleTaskScope_Last(
			moduleName, taskKey, orderByComparator);
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit[] findByModuleTaskScope_PrevAndNext(
			long auditScopeId, String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByModuleTaskScope_PrevAndNext(
			auditScopeId, moduleName, taskKey, orderByComparator);
	}

	/**
	 * Removes all the edc permission scope audits where moduleName = &#63; and taskKey = &#63; from the database.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 */
	public static void removeByModuleTaskScope(
		String moduleName, String taskKey) {

		getPersistence().removeByModuleTaskScope(moduleName, taskKey);
	}

	/**
	 * Returns the number of edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the number of matching edc permission scope audits
	 */
	public static int countByModuleTaskScope(
		String moduleName, String taskKey) {

		return getPersistence().countByModuleTaskScope(moduleName, taskKey);
	}

	/**
	 * Caches the edc permission scope audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 */
	public static void cacheResult(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		getPersistence().cacheResult(edcPermissionScopeAudit);
	}

	/**
	 * Caches the edc permission scope audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudits the edc permission scope audits
	 */
	public static void cacheResult(
		List<EdcPermissionScopeAudit> edcPermissionScopeAudits) {

		getPersistence().cacheResult(edcPermissionScopeAudits);
	}

	/**
	 * Creates a new edc permission scope audit with the primary key. Does not add the edc permission scope audit to the database.
	 *
	 * @param auditScopeId the primary key for the new edc permission scope audit
	 * @return the new edc permission scope audit
	 */
	public static EdcPermissionScopeAudit create(long auditScopeId) {
		return getPersistence().create(auditScopeId);
	}

	/**
	 * Removes the edc permission scope audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit remove(long auditScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().remove(auditScopeId);
	}

	public static EdcPermissionScopeAudit updateImpl(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		return getPersistence().updateImpl(edcPermissionScopeAudit);
	}

	/**
	 * Returns the edc permission scope audit with the primary key or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit findByPrimaryKey(long auditScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchEdcPermissionScopeAuditException {

		return getPersistence().findByPrimaryKey(auditScopeId);
	}

	/**
	 * Returns the edc permission scope audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit, or <code>null</code> if a edc permission scope audit with the primary key could not be found
	 */
	public static EdcPermissionScopeAudit fetchByPrimaryKey(long auditScopeId) {
		return getPersistence().fetchByPrimaryKey(auditScopeId);
	}

	/**
	 * Returns all the edc permission scope audits.
	 *
	 * @return the edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission scope audits
	 */
	public static List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the edc permission scope audits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of edc permission scope audits.
	 *
	 * @return the number of edc permission scope audits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EdcPermissionScopeAuditPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EdcPermissionScopeAuditPersistence _persistence;

}
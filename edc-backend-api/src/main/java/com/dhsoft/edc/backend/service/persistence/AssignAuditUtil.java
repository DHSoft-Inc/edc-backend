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

import com.dhsoft.edc.backend.model.AssignAudit;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assign audit service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.AssignAuditPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignAuditPersistence
 * @generated
 */
public class AssignAuditUtil {

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
	public static void clearCache(AssignAudit assignAudit) {
		getPersistence().clearCache(assignAudit);
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
	public static Map<Serializable, AssignAudit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssignAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssignAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssignAudit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssignAudit update(AssignAudit assignAudit) {
		return getPersistence().update(assignAudit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssignAudit update(
		AssignAudit assignAudit, ServiceContext serviceContext) {

		return getPersistence().update(assignAudit, serviceContext);
	}

	/**
	 * Returns all the assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign audits
	 */
	public static List<AssignAudit> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByUuid_First(
			String uuid, OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByUuid_First(
		String uuid, OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByUuid_Last(
			String uuid, OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByUuid_Last(
		String uuid, OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit[] findByUuid_PrevAndNext(
			long auditId, String uuid,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_PrevAndNext(
			auditId, uuid, orderByComparator);
	}

	/**
	 * Removes all the assign audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign audits
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign audits
	 */
	public static List<AssignAudit> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit[] findByUuid_C_PrevAndNext(
			long auditId, String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByUuid_C_PrevAndNext(
			auditId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the assign audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign audits
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign audits
	 */
	public static List<AssignAudit> findByInstitution(long institutionId) {
		return getPersistence().findByInstitution(institutionId);
	}

	/**
	 * Returns a range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitution(
		long institutionId, int start, int end) {

		return getPersistence().findByInstitution(institutionId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findByInstitution(
			institutionId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitution(
			institutionId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByInstitution_First(
			long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitution_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByInstitution_First(
		long institutionId, OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByInstitution_First(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByInstitution_Last(
			long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitution_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByInstitution_Last(
		long institutionId, OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByInstitution_Last(
			institutionId, orderByComparator);
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit[] findByInstitution_PrevAndNext(
			long auditId, long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitution_PrevAndNext(
			auditId, institutionId, orderByComparator);
	}

	/**
	 * Removes all the assign audits where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public static void removeByInstitution(long institutionId) {
		getPersistence().removeByInstitution(institutionId);
	}

	/**
	 * Returns the number of assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign audits
	 */
	public static int countByInstitution(long institutionId) {
		return getPersistence().countByInstitution(institutionId);
	}

	/**
	 * Returns all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign audits
	 */
	public static List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId);
	}

	/**
	 * Returns a range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public static List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByInstitutionProject_First(
			long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitutionProject_First(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByInstitutionProject_First(
		long institutionId, long projectId,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByInstitutionProject_First(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public static AssignAudit findByInstitutionProject_Last(
			long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public static AssignAudit fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().fetchByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit[] findByInstitutionProject_PrevAndNext(
			long auditId, long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByInstitutionProject_PrevAndNext(
			auditId, institutionId, projectId, orderByComparator);
	}

	/**
	 * Removes all the assign audits where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	public static void removeByInstitutionProject(
		long institutionId, long projectId) {

		getPersistence().removeByInstitutionProject(institutionId, projectId);
	}

	/**
	 * Returns the number of assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign audits
	 */
	public static int countByInstitutionProject(
		long institutionId, long projectId) {

		return getPersistence().countByInstitutionProject(
			institutionId, projectId);
	}

	/**
	 * Caches the assign audit in the entity cache if it is enabled.
	 *
	 * @param assignAudit the assign audit
	 */
	public static void cacheResult(AssignAudit assignAudit) {
		getPersistence().cacheResult(assignAudit);
	}

	/**
	 * Caches the assign audits in the entity cache if it is enabled.
	 *
	 * @param assignAudits the assign audits
	 */
	public static void cacheResult(List<AssignAudit> assignAudits) {
		getPersistence().cacheResult(assignAudits);
	}

	/**
	 * Creates a new assign audit with the primary key. Does not add the assign audit to the database.
	 *
	 * @param auditId the primary key for the new assign audit
	 * @return the new assign audit
	 */
	public static AssignAudit create(long auditId) {
		return getPersistence().create(auditId);
	}

	/**
	 * Removes the assign audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit that was removed
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit remove(long auditId)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().remove(auditId);
	}

	public static AssignAudit updateImpl(AssignAudit assignAudit) {
		return getPersistence().updateImpl(assignAudit);
	}

	/**
	 * Returns the assign audit with the primary key or throws a <code>NoSuchAssignAuditException</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public static AssignAudit findByPrimaryKey(long auditId)
		throws com.dhsoft.edc.backend.exception.NoSuchAssignAuditException {

		return getPersistence().findByPrimaryKey(auditId);
	}

	/**
	 * Returns the assign audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit, or <code>null</code> if a assign audit with the primary key could not be found
	 */
	public static AssignAudit fetchByPrimaryKey(long auditId) {
		return getPersistence().fetchByPrimaryKey(auditId);
	}

	/**
	 * Returns all the assign audits.
	 *
	 * @return the assign audits
	 */
	public static List<AssignAudit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of assign audits
	 */
	public static List<AssignAudit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign audits
	 */
	public static List<AssignAudit> findAll(
		int start, int end, OrderByComparator<AssignAudit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign audits
	 */
	public static List<AssignAudit> findAll(
		int start, int end, OrderByComparator<AssignAudit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assign audits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assign audits.
	 *
	 * @return the number of assign audits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssignAuditPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AssignAuditPersistence _persistence;

}
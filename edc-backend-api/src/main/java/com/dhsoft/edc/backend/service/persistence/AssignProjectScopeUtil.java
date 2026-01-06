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

import com.dhsoft.edc.backend.model.AssignProjectScope;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assign project scope service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.AssignProjectScopePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScopePersistence
 * @generated
 */
public class AssignProjectScopeUtil {

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
	public static void clearCache(AssignProjectScope assignProjectScope) {
		getPersistence().clearCache(assignProjectScope);
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
	public static Map<Serializable, AssignProjectScope> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssignProjectScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssignProjectScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssignProjectScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssignProjectScope update(
		AssignProjectScope assignProjectScope) {

		return getPersistence().update(assignProjectScope);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssignProjectScope update(
		AssignProjectScope assignProjectScope, ServiceContext serviceContext) {

		return getPersistence().update(assignProjectScope, serviceContext);
	}

	/**
	 * Returns all the assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUuid_First(
			String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUuid_First(
		String uuid, OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUuid_Last(
			String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUuid_Last(
		String uuid, OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope[] findByUuid_PrevAndNext(
			long projectScopeId, String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_PrevAndNext(
			projectScopeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the assign project scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign project scopes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the assign project scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign project scope that was removed
	 */
	public static AssignProjectScope removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign project scopes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope[] findByUuid_C_PrevAndNext(
			long projectScopeId, String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			projectScopeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the assign project scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign project scopes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	public static List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId);
	}

	/**
	 * Returns a range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByInstitutionProject_First(
			long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByInstitutionProject_First(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByInstitutionProject_First(
		long institutionId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByInstitutionProject_First(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByInstitutionProject_Last(
			long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope[] findByInstitutionProject_PrevAndNext(
			long projectScopeId, long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByInstitutionProject_PrevAndNext(
			projectScopeId, institutionId, projectId, orderByComparator);
	}

	/**
	 * Removes all the assign project scopes where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	public static void removeByInstitutionProject(
		long institutionId, long projectId) {

		getPersistence().removeByInstitutionProject(institutionId, projectId);
	}

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	public static int countByInstitutionProject(
		long institutionId, long projectId) {

		return getPersistence().countByInstitutionProject(
			institutionId, projectId);
	}

	/**
	 * Returns all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId) {

		return getPersistence().findByUserProject(targetUserId, projectId);
	}

	/**
	 * Returns a range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end) {

		return getPersistence().findByUserProject(
			targetUserId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findByUserProject(
			targetUserId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public static List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserProject(
			targetUserId, projectId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUserProject_First(
			long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUserProject_First(
			targetUserId, projectId, orderByComparator);
	}

	/**
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUserProject_First(
		long targetUserId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUserProject_First(
			targetUserId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUserProject_Last(
			long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUserProject_Last(
			targetUserId, projectId, orderByComparator);
	}

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUserProject_Last(
		long targetUserId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().fetchByUserProject_Last(
			targetUserId, projectId, orderByComparator);
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope[] findByUserProject_PrevAndNext(
			long projectScopeId, long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUserProject_PrevAndNext(
			projectScopeId, targetUserId, projectId, orderByComparator);
	}

	/**
	 * Removes all the assign project scopes where targetUserId = &#63; and projectId = &#63; from the database.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 */
	public static void removeByUserProject(long targetUserId, long projectId) {
		getPersistence().removeByUserProject(targetUserId, projectId);
	}

	/**
	 * Returns the number of assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	public static int countByUserProject(long targetUserId, long projectId) {
		return getPersistence().countByUserProject(targetUserId, projectId);
	}

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope findByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);
	}

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole) {

		return getPersistence().fetchByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);
	}

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId, String scopeRole,
		boolean useFinderCache) {

		return getPersistence().fetchByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole, useFinderCache);
	}

	/**
	 * Removes the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the assign project scope that was removed
	 */
	public static AssignProjectScope removeByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().removeByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);
	}

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the number of matching assign project scopes
	 */
	public static int countByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole) {

		return getPersistence().countByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);
	}

	/**
	 * Caches the assign project scope in the entity cache if it is enabled.
	 *
	 * @param assignProjectScope the assign project scope
	 */
	public static void cacheResult(AssignProjectScope assignProjectScope) {
		getPersistence().cacheResult(assignProjectScope);
	}

	/**
	 * Caches the assign project scopes in the entity cache if it is enabled.
	 *
	 * @param assignProjectScopes the assign project scopes
	 */
	public static void cacheResult(
		List<AssignProjectScope> assignProjectScopes) {

		getPersistence().cacheResult(assignProjectScopes);
	}

	/**
	 * Creates a new assign project scope with the primary key. Does not add the assign project scope to the database.
	 *
	 * @param projectScopeId the primary key for the new assign project scope
	 * @return the new assign project scope
	 */
	public static AssignProjectScope create(long projectScopeId) {
		return getPersistence().create(projectScopeId);
	}

	/**
	 * Removes the assign project scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope that was removed
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope remove(long projectScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().remove(projectScopeId);
	}

	public static AssignProjectScope updateImpl(
		AssignProjectScope assignProjectScope) {

		return getPersistence().updateImpl(assignProjectScope);
	}

	/**
	 * Returns the assign project scope with the primary key or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope findByPrimaryKey(long projectScopeId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchAssignProjectScopeException {

		return getPersistence().findByPrimaryKey(projectScopeId);
	}

	/**
	 * Returns the assign project scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope, or <code>null</code> if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope fetchByPrimaryKey(long projectScopeId) {
		return getPersistence().fetchByPrimaryKey(projectScopeId);
	}

	/**
	 * Returns all the assign project scopes.
	 *
	 * @return the assign project scopes
	 */
	public static List<AssignProjectScope> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of assign project scopes
	 */
	public static List<AssignProjectScope> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign project scopes
	 */
	public static List<AssignProjectScope> findAll(
		int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign project scopes
	 */
	public static List<AssignProjectScope> findAll(
		int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assign project scopes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assign project scopes.
	 *
	 * @return the number of assign project scopes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssignProjectScopePersistence getPersistence() {
		return _persistence;
	}

	private static volatile AssignProjectScopePersistence _persistence;

}
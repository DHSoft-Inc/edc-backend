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

import com.dhsoft.edc.backend.model.ApprovalRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the approval request service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.ApprovalRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequestPersistence
 * @generated
 */
public class ApprovalRequestUtil {

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
	public static void clearCache(ApprovalRequest approvalRequest) {
		getPersistence().clearCache(approvalRequest);
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
	public static Map<Serializable, ApprovalRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ApprovalRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApprovalRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApprovalRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ApprovalRequest update(ApprovalRequest approvalRequest) {
		return getPersistence().update(approvalRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ApprovalRequest update(
		ApprovalRequest approvalRequest, ServiceContext serviceContext) {

		return getPersistence().update(approvalRequest, serviceContext);
	}

	/**
	 * Returns all the approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByUuid_First(
			String uuid, OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUuid_First(
		String uuid, OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByUuid_Last(
			String uuid, OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUuid_Last(
		String uuid, OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where uuid = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByUuid_PrevAndNext(
			long approvalRequestId, String uuid,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_PrevAndNext(
			approvalRequestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the approval requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching approval requests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the approval request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the approval request that was removed
	 */
	public static ApprovalRequest removeByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of approval requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching approval requests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByUuid_C_PrevAndNext(
			long approvalRequestId, String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			approvalRequestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the approval requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching approval requests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P(
		long groupId, long projectId) {

		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByG_P_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_PrevAndNext(
			approvalRequestId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching approval requests
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className) {

		return getPersistence().findByG_P_C(groupId, projectId, className);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end) {

		return getPersistence().findByG_P_C(
			groupId, projectId, className, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByG_P_C(
			groupId, projectId, className, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P_C(
			groupId, projectId, className, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_C_First(
			long groupId, long projectId, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_C_First(
			groupId, projectId, className, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_C_First(
		long groupId, long projectId, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_C_First(
			groupId, projectId, className, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_C_Last(
			long groupId, long projectId, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_C_Last(
			groupId, projectId, className, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_C_Last(
		long groupId, long projectId, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_C_Last(
			groupId, projectId, className, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByG_P_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_C_PrevAndNext(
			approvalRequestId, groupId, projectId, className,
			orderByComparator);
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 */
	public static void removeByG_P_C(
		long groupId, long projectId, String className) {

		getPersistence().removeByG_P_C(groupId, projectId, className);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	public static int countByG_P_C(
		long groupId, long projectId, String className) {

		return getPersistence().countByG_P_C(groupId, projectId, className);
	}

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_C_P(
			groupId, projectId, className, classPK);
	}

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK) {

		return getPersistence().fetchByG_P_C_P(
			groupId, projectId, className, classPK);
	}

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK,
		boolean useFinderCache) {

		return getPersistence().fetchByG_P_C_P(
			groupId, projectId, className, classPK, useFinderCache);
	}

	/**
	 * Removes the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the approval request that was removed
	 */
	public static ApprovalRequest removeByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().removeByG_P_C_P(
			groupId, projectId, className, classPK);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the number of matching approval requests
	 */
	public static int countByG_P_C_P(
		long groupId, long projectId, String className, long classPK) {

		return getPersistence().countByG_P_C_P(
			groupId, projectId, className, classPK);
	}

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status) {

		return getPersistence().findByG_P_S(groupId, projectId, status);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end) {

		return getPersistence().findByG_P_S(
			groupId, projectId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByG_P_S(
			groupId, projectId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P_S(
			groupId, projectId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_S_First(
			long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_First(
			groupId, projectId, status, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_S_First(
		long groupId, long projectId, int status,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_S_First(
			groupId, projectId, status, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_S_Last(
			long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_Last(
			groupId, projectId, status, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_S_Last(
		long groupId, long projectId, int status,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_S_Last(
			groupId, projectId, status, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByG_P_S_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_PrevAndNext(
			approvalRequestId, groupId, projectId, status, orderByComparator);
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 */
	public static void removeByG_P_S(long groupId, long projectId, int status) {
		getPersistence().removeByG_P_S(groupId, projectId, status);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the number of matching approval requests
	 */
	public static int countByG_P_S(long groupId, long projectId, int status) {
		return getPersistence().countByG_P_S(groupId, projectId, status);
	}

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		return getPersistence().findByG_P_S_C(
			groupId, projectId, status, className);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end) {

		return getPersistence().findByG_P_S_C(
			groupId, projectId, status, className, start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end, OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findByG_P_S_C(
			groupId, projectId, status, className, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	public static List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end, OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P_S_C(
			groupId, projectId, status, className, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_S_C_First(
			long groupId, long projectId, int status, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_C_First(
			groupId, projectId, status, className, orderByComparator);
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_S_C_First(
		long groupId, long projectId, int status, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_S_C_First(
			groupId, projectId, status, className, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public static ApprovalRequest findByG_P_S_C_Last(
			long groupId, long projectId, int status, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_C_Last(
			groupId, projectId, status, className, orderByComparator);
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchByG_P_S_C_Last(
		long groupId, long projectId, int status, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().fetchByG_P_S_C_Last(
			groupId, projectId, status, className, orderByComparator);
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest[] findByG_P_S_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByG_P_S_C_PrevAndNext(
			approvalRequestId, groupId, projectId, status, className,
			orderByComparator);
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 */
	public static void removeByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		getPersistence().removeByG_P_S_C(groupId, projectId, status, className);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	public static int countByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		return getPersistence().countByG_P_S_C(
			groupId, projectId, status, className);
	}

	/**
	 * Caches the approval request in the entity cache if it is enabled.
	 *
	 * @param approvalRequest the approval request
	 */
	public static void cacheResult(ApprovalRequest approvalRequest) {
		getPersistence().cacheResult(approvalRequest);
	}

	/**
	 * Caches the approval requests in the entity cache if it is enabled.
	 *
	 * @param approvalRequests the approval requests
	 */
	public static void cacheResult(List<ApprovalRequest> approvalRequests) {
		getPersistence().cacheResult(approvalRequests);
	}

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	public static ApprovalRequest create(long approvalRequestId) {
		return getPersistence().create(approvalRequestId);
	}

	/**
	 * Removes the approval request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request that was removed
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest remove(long approvalRequestId)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().remove(approvalRequestId);
	}

	public static ApprovalRequest updateImpl(ApprovalRequest approvalRequest) {
		return getPersistence().updateImpl(approvalRequest);
	}

	/**
	 * Returns the approval request with the primary key or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest findByPrimaryKey(long approvalRequestId)
		throws com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException {

		return getPersistence().findByPrimaryKey(approvalRequestId);
	}

	/**
	 * Returns the approval request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request, or <code>null</code> if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest fetchByPrimaryKey(long approvalRequestId) {
		return getPersistence().fetchByPrimaryKey(approvalRequestId);
	}

	/**
	 * Returns all the approval requests.
	 *
	 * @return the approval requests
	 */
	public static List<ApprovalRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of approval requests
	 */
	public static List<ApprovalRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of approval requests
	 */
	public static List<ApprovalRequest> findAll(
		int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of approval requests
	 */
	public static List<ApprovalRequest> findAll(
		int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the approval requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ApprovalRequestPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ApprovalRequestPersistence _persistence;

}
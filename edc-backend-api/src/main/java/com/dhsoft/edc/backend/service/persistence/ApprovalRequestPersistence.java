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

import com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException;
import com.dhsoft.edc.backend.model.ApprovalRequest;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the approval request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequestUtil
 * @generated
 */
@ProviderType
public interface ApprovalRequestPersistence
	extends BasePersistence<ApprovalRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApprovalRequestUtil} to access the approval request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByUuid(String uuid);

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
	public java.util.List<ApprovalRequest> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where uuid = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public ApprovalRequest[] findByUuid_PrevAndNext(
			long approvalRequestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching approval requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the approval request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the approval request that was removed
	 */
	public ApprovalRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the number of approval requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching approval requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest[] findByUuid_C_PrevAndNext(
			long approvalRequestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching approval requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByG_P(
		long groupId, long projectId);

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
	public java.util.List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end);

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
	public java.util.List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	public ApprovalRequest findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest[] findByG_P_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching approval requests
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className);

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
	public java.util.List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end);

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
	public java.util.List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

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
	public ApprovalRequest findByG_P_C_First(
			long groupId, long projectId, String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_C_First(
		long groupId, long projectId, String className,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest findByG_P_C_Last(
			long groupId, long projectId, String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_C_Last(
		long groupId, long projectId, String className,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest[] findByG_P_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 */
	public void removeByG_P_C(long groupId, long projectId, String className);

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	public int countByG_P_C(long groupId, long projectId, String className);

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
	public ApprovalRequest findByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK);

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
	public ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK,
		boolean useFinderCache);

	/**
	 * Removes the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the approval request that was removed
	 */
	public ApprovalRequest removeByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the number of matching approval requests
	 */
	public int countByG_P_C_P(
		long groupId, long projectId, String className, long classPK);

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status);

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
	public java.util.List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end);

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
	public java.util.List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

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
	public ApprovalRequest findByG_P_S_First(
			long groupId, long projectId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_S_First(
		long groupId, long projectId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest findByG_P_S_Last(
			long groupId, long projectId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public ApprovalRequest fetchByG_P_S_Last(
		long groupId, long projectId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest[] findByG_P_S_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 */
	public void removeByG_P_S(long groupId, long projectId, int status);

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the number of matching approval requests
	 */
	public int countByG_P_S(long groupId, long projectId, int status);

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the matching approval requests
	 */
	public java.util.List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className);

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
	public java.util.List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end);

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
	public java.util.List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

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
	public ApprovalRequest findByG_P_S_C_First(
			long groupId, long projectId, int status, String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

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
	public ApprovalRequest fetchByG_P_S_C_First(
		long groupId, long projectId, int status, String className,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest findByG_P_S_C_Last(
			long groupId, long projectId, int status, String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

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
	public ApprovalRequest fetchByG_P_S_C_Last(
		long groupId, long projectId, int status, String className,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public ApprovalRequest[] findByG_P_S_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			String className,
			com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
				orderByComparator)
		throws NoSuchApprovalRequestException;

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 */
	public void removeByG_P_S_C(
		long groupId, long projectId, int status, String className);

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	public int countByG_P_S_C(
		long groupId, long projectId, int status, String className);

	/**
	 * Caches the approval request in the entity cache if it is enabled.
	 *
	 * @param approvalRequest the approval request
	 */
	public void cacheResult(ApprovalRequest approvalRequest);

	/**
	 * Caches the approval requests in the entity cache if it is enabled.
	 *
	 * @param approvalRequests the approval requests
	 */
	public void cacheResult(java.util.List<ApprovalRequest> approvalRequests);

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	public ApprovalRequest create(long approvalRequestId);

	/**
	 * Removes the approval request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request that was removed
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public ApprovalRequest remove(long approvalRequestId)
		throws NoSuchApprovalRequestException;

	public ApprovalRequest updateImpl(ApprovalRequest approvalRequest);

	/**
	 * Returns the approval request with the primary key or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	public ApprovalRequest findByPrimaryKey(long approvalRequestId)
		throws NoSuchApprovalRequestException;

	/**
	 * Returns the approval request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request, or <code>null</code> if a approval request with the primary key could not be found
	 */
	public ApprovalRequest fetchByPrimaryKey(long approvalRequestId);

	/**
	 * Returns all the approval requests.
	 *
	 * @return the approval requests
	 */
	public java.util.List<ApprovalRequest> findAll();

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
	public java.util.List<ApprovalRequest> findAll(int start, int end);

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
	public java.util.List<ApprovalRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator);

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
	public java.util.List<ApprovalRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApprovalRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the approval requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	public int countAll();

}
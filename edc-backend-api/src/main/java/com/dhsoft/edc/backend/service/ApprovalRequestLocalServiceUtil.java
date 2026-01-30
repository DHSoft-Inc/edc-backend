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

package com.dhsoft.edc.backend.service;

import com.dhsoft.edc.backend.model.ApprovalRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ApprovalRequest. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.ApprovalRequestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequestLocalService
 * @generated
 */
public class ApprovalRequestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.ApprovalRequestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the approval request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApprovalRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param approvalRequest the approval request
	 * @return the approval request that was added
	 */
	public static ApprovalRequest addApprovalRequest(
		ApprovalRequest approvalRequest) {

		return getService().addApprovalRequest(approvalRequest);
	}

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	public static ApprovalRequest createApprovalRequest(
		long approvalRequestId) {

		return getService().createApprovalRequest(approvalRequestId);
	}

	/**
	 * Deletes the approval request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApprovalRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param approvalRequest the approval request
	 * @return the approval request that was removed
	 */
	public static ApprovalRequest deleteApprovalRequest(
		ApprovalRequest approvalRequest) {

		return getService().deleteApprovalRequest(approvalRequest);
	}

	/**
	 * Deletes the approval request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApprovalRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request that was removed
	 * @throws PortalException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest deleteApprovalRequest(long approvalRequestId)
		throws PortalException {

		return getService().deleteApprovalRequest(approvalRequestId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ApprovalRequest fetchApprovalRequest(long approvalRequestId) {
		return getService().fetchApprovalRequest(approvalRequestId);
	}

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	public static ApprovalRequest fetchApprovalRequestByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchApprovalRequestByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the approval request with the primary key.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws PortalException if a approval request with the primary key could not be found
	 */
	public static ApprovalRequest getApprovalRequest(long approvalRequestId)
		throws PortalException {

		return getService().getApprovalRequest(approvalRequestId);
	}

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request
	 * @throws PortalException if a matching approval request could not be found
	 */
	public static ApprovalRequest getApprovalRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getApprovalRequestByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of approval requests
	 */
	public static List<ApprovalRequest> getApprovalRequests(
		int start, int end) {

		return getService().getApprovalRequests(start, end);
	}

	/**
	 * Returns all the approval requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the approval requests
	 * @param companyId the primary key of the company
	 * @return the matching approval requests, or an empty list if no matches were found
	 */
	public static List<ApprovalRequest> getApprovalRequestsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getApprovalRequestsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of approval requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the approval requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching approval requests, or an empty list if no matches were found
	 */
	public static List<ApprovalRequest> getApprovalRequestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return getService().getApprovalRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	public static int getApprovalRequestsCount() {
		return getService().getApprovalRequestsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the approval request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApprovalRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param approvalRequest the approval request
	 * @return the approval request that was updated
	 */
	public static ApprovalRequest updateApprovalRequest(
		ApprovalRequest approvalRequest) {

		return getService().updateApprovalRequest(approvalRequest);
	}

	public static ApprovalRequestLocalService getService() {
		return _service;
	}

	private static volatile ApprovalRequestLocalService _service;

}
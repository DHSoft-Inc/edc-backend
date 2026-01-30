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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApprovalRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequestLocalService
 * @generated
 */
public class ApprovalRequestLocalServiceWrapper
	implements ApprovalRequestLocalService,
			   ServiceWrapper<ApprovalRequestLocalService> {

	public ApprovalRequestLocalServiceWrapper(
		ApprovalRequestLocalService approvalRequestLocalService) {

		_approvalRequestLocalService = approvalRequestLocalService;
	}

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
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest addApprovalRequest(
		com.dhsoft.edc.backend.model.ApprovalRequest approvalRequest) {

		return _approvalRequestLocalService.addApprovalRequest(approvalRequest);
	}

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest createApprovalRequest(
		long approvalRequestId) {

		return _approvalRequestLocalService.createApprovalRequest(
			approvalRequestId);
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
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest deleteApprovalRequest(
		com.dhsoft.edc.backend.model.ApprovalRequest approvalRequest) {

		return _approvalRequestLocalService.deleteApprovalRequest(
			approvalRequest);
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
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest deleteApprovalRequest(
			long approvalRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _approvalRequestLocalService.deleteApprovalRequest(
			approvalRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _approvalRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _approvalRequestLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _approvalRequestLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _approvalRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _approvalRequestLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _approvalRequestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _approvalRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest fetchApprovalRequest(
		long approvalRequestId) {

		return _approvalRequestLocalService.fetchApprovalRequest(
			approvalRequestId);
	}

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest
		fetchApprovalRequestByUuidAndGroupId(String uuid, long groupId) {

		return _approvalRequestLocalService.
			fetchApprovalRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _approvalRequestLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the approval request with the primary key.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws PortalException if a approval request with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest getApprovalRequest(
			long approvalRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _approvalRequestLocalService.getApprovalRequest(
			approvalRequestId);
	}

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request
	 * @throws PortalException if a matching approval request could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest
			getApprovalRequestByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _approvalRequestLocalService.getApprovalRequestByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.ApprovalRequest>
		getApprovalRequests(int start, int end) {

		return _approvalRequestLocalService.getApprovalRequests(start, end);
	}

	/**
	 * Returns all the approval requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the approval requests
	 * @param companyId the primary key of the company
	 * @return the matching approval requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.ApprovalRequest>
		getApprovalRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return _approvalRequestLocalService.
			getApprovalRequestsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.ApprovalRequest>
		getApprovalRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.ApprovalRequest>
					orderByComparator) {

		return _approvalRequestLocalService.
			getApprovalRequestsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	@Override
	public int getApprovalRequestsCount() {
		return _approvalRequestLocalService.getApprovalRequestsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _approvalRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _approvalRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _approvalRequestLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.dhsoft.edc.backend.model.ApprovalRequest updateApprovalRequest(
		com.dhsoft.edc.backend.model.ApprovalRequest approvalRequest) {

		return _approvalRequestLocalService.updateApprovalRequest(
			approvalRequest);
	}

	@Override
	public ApprovalRequestLocalService getWrappedService() {
		return _approvalRequestLocalService;
	}

	@Override
	public void setWrappedService(
		ApprovalRequestLocalService approvalRequestLocalService) {

		_approvalRequestLocalService = approvalRequestLocalService;
	}

	private ApprovalRequestLocalService _approvalRequestLocalService;

}
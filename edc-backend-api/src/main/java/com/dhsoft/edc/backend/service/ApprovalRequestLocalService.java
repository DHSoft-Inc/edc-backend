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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ApprovalRequest. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ApprovalRequestLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ApprovalRequestLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.ApprovalRequestLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the approval request local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ApprovalRequestLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public ApprovalRequest addApprovalRequest(ApprovalRequest approvalRequest);

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	@Transactional(enabled = false)
	public ApprovalRequest createApprovalRequest(long approvalRequestId);

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
	@Indexable(type = IndexableType.DELETE)
	public ApprovalRequest deleteApprovalRequest(
		ApprovalRequest approvalRequest);

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
	@Indexable(type = IndexableType.DELETE)
	public ApprovalRequest deleteApprovalRequest(long approvalRequestId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApprovalRequest fetchApprovalRequest(long approvalRequestId);

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApprovalRequest fetchApprovalRequestByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the approval request with the primary key.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws PortalException if a approval request with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApprovalRequest getApprovalRequest(long approvalRequestId)
		throws PortalException;

	/**
	 * Returns the approval request matching the UUID and group.
	 *
	 * @param uuid the approval request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching approval request
	 * @throws PortalException if a matching approval request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApprovalRequest getApprovalRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApprovalRequest> getApprovalRequests(int start, int end);

	/**
	 * Returns all the approval requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the approval requests
	 * @param companyId the primary key of the company
	 * @return the matching approval requests, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApprovalRequest> getApprovalRequestsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApprovalRequest> getApprovalRequestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator);

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getApprovalRequestsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public ApprovalRequest updateApprovalRequest(
		ApprovalRequest approvalRequest);

}
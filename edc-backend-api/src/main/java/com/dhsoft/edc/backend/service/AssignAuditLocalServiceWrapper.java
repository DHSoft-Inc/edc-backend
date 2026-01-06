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
 * Provides a wrapper for {@link AssignAuditLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssignAuditLocalService
 * @generated
 */
public class AssignAuditLocalServiceWrapper
	implements AssignAuditLocalService,
			   ServiceWrapper<AssignAuditLocalService> {

	public AssignAuditLocalServiceWrapper(
		AssignAuditLocalService assignAuditLocalService) {

		_assignAuditLocalService = assignAuditLocalService;
	}

	/**
	 * Adds the assign audit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignAudit the assign audit
	 * @return the assign audit that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit addAssignAudit(
		com.dhsoft.edc.backend.model.AssignAudit assignAudit) {

		return _assignAuditLocalService.addAssignAudit(assignAudit);
	}

	/**
	 * Creates a new assign audit with the primary key. Does not add the assign audit to the database.
	 *
	 * @param auditId the primary key for the new assign audit
	 * @return the new assign audit
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit createAssignAudit(
		long auditId) {

		return _assignAuditLocalService.createAssignAudit(auditId);
	}

	/**
	 * Deletes the assign audit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignAudit the assign audit
	 * @return the assign audit that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit deleteAssignAudit(
		com.dhsoft.edc.backend.model.AssignAudit assignAudit) {

		return _assignAuditLocalService.deleteAssignAudit(assignAudit);
	}

	/**
	 * Deletes the assign audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit that was removed
	 * @throws PortalException if a assign audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit deleteAssignAudit(
			long auditId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignAuditLocalService.deleteAssignAudit(auditId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignAuditLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assignAuditLocalService.dynamicQuery();
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

		return _assignAuditLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignAuditModelImpl</code>.
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

		return _assignAuditLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignAuditModelImpl</code>.
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

		return _assignAuditLocalService.dynamicQuery(
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

		return _assignAuditLocalService.dynamicQueryCount(dynamicQuery);
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

		return _assignAuditLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.AssignAudit fetchAssignAudit(
		long auditId) {

		return _assignAuditLocalService.fetchAssignAudit(auditId);
	}

	/**
	 * Returns the assign audit with the matching UUID and company.
	 *
	 * @param uuid the assign audit's UUID
	 * @param companyId the primary key of the company
	 * @return the matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit
		fetchAssignAuditByUuidAndCompanyId(String uuid, long companyId) {

		return _assignAuditLocalService.fetchAssignAuditByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assignAuditLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the assign audit with the primary key.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit
	 * @throws PortalException if a assign audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit getAssignAudit(long auditId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignAuditLocalService.getAssignAudit(auditId);
	}

	/**
	 * Returns the assign audit with the matching UUID and company.
	 *
	 * @param uuid the assign audit's UUID
	 * @param companyId the primary key of the company
	 * @return the matching assign audit
	 * @throws PortalException if a matching assign audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit
			getAssignAuditByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignAuditLocalService.getAssignAuditByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of assign audits
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignAudit>
		getAssignAudits(int start, int end) {

		return _assignAuditLocalService.getAssignAudits(start, end);
	}

	/**
	 * Returns the number of assign audits.
	 *
	 * @return the number of assign audits
	 */
	@Override
	public int getAssignAuditsCount() {
		return _assignAuditLocalService.getAssignAuditsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assignAuditLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assignAuditLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignAuditLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the assign audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignAudit the assign audit
	 * @return the assign audit that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignAudit updateAssignAudit(
		com.dhsoft.edc.backend.model.AssignAudit assignAudit) {

		return _assignAuditLocalService.updateAssignAudit(assignAudit);
	}

	@Override
	public AssignAuditLocalService getWrappedService() {
		return _assignAuditLocalService;
	}

	@Override
	public void setWrappedService(
		AssignAuditLocalService assignAuditLocalService) {

		_assignAuditLocalService = assignAuditLocalService;
	}

	private AssignAuditLocalService _assignAuditLocalService;

}
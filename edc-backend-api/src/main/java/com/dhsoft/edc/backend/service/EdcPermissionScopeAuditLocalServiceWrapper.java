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
 * Provides a wrapper for {@link EdcPermissionScopeAuditLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopeAuditLocalService
 * @generated
 */
public class EdcPermissionScopeAuditLocalServiceWrapper
	implements EdcPermissionScopeAuditLocalService,
			   ServiceWrapper<EdcPermissionScopeAuditLocalService> {

	public EdcPermissionScopeAuditLocalServiceWrapper(
		EdcPermissionScopeAuditLocalService
			edcPermissionScopeAuditLocalService) {

		_edcPermissionScopeAuditLocalService =
			edcPermissionScopeAuditLocalService;
	}

	/**
	 * Adds the edc permission scope audit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionScopeAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 * @return the edc permission scope audit that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		addEdcPermissionScopeAudit(
			com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
				edcPermissionScopeAudit) {

		return _edcPermissionScopeAuditLocalService.addEdcPermissionScopeAudit(
			edcPermissionScopeAudit);
	}

	/**
	 * Creates a new edc permission scope audit with the primary key. Does not add the edc permission scope audit to the database.
	 *
	 * @param auditScopeId the primary key for the new edc permission scope audit
	 * @return the new edc permission scope audit
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		createEdcPermissionScopeAudit(long auditScopeId) {

		return _edcPermissionScopeAuditLocalService.
			createEdcPermissionScopeAudit(auditScopeId);
	}

	/**
	 * Deletes the edc permission scope audit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionScopeAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		deleteEdcPermissionScopeAudit(
			com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
				edcPermissionScopeAudit) {

		return _edcPermissionScopeAuditLocalService.
			deleteEdcPermissionScopeAudit(edcPermissionScopeAudit);
	}

	/**
	 * Deletes the edc permission scope audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionScopeAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 * @throws PortalException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
			deleteEdcPermissionScopeAudit(long auditScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionScopeAuditLocalService.
			deleteEdcPermissionScopeAudit(auditScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionScopeAuditLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _edcPermissionScopeAuditLocalService.dynamicQuery();
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

		return _edcPermissionScopeAuditLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionScopeAuditModelImpl</code>.
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

		return _edcPermissionScopeAuditLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionScopeAuditModelImpl</code>.
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

		return _edcPermissionScopeAuditLocalService.dynamicQuery(
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

		return _edcPermissionScopeAuditLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _edcPermissionScopeAuditLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		fetchEdcPermissionScopeAudit(long auditScopeId) {

		return _edcPermissionScopeAuditLocalService.
			fetchEdcPermissionScopeAudit(auditScopeId);
	}

	/**
	 * Returns the edc permission scope audit matching the UUID and group.
	 *
	 * @param uuid the edc permission scope audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		fetchEdcPermissionScopeAuditByUuidAndGroupId(
			String uuid, long groupId) {

		return _edcPermissionScopeAuditLocalService.
			fetchEdcPermissionScopeAuditByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _edcPermissionScopeAuditLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the edc permission scope audit with the primary key.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit
	 * @throws PortalException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
			getEdcPermissionScopeAudit(long auditScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionScopeAuditLocalService.getEdcPermissionScopeAudit(
			auditScopeId);
	}

	/**
	 * Returns the edc permission scope audit matching the UUID and group.
	 *
	 * @param uuid the edc permission scope audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission scope audit
	 * @throws PortalException if a matching edc permission scope audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
			getEdcPermissionScopeAuditByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionScopeAuditLocalService.
			getEdcPermissionScopeAuditByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of edc permission scope audits
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionScopeAudit>
		getEdcPermissionScopeAudits(int start, int end) {

		return _edcPermissionScopeAuditLocalService.getEdcPermissionScopeAudits(
			start, end);
	}

	/**
	 * Returns all the edc permission scope audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission scope audits
	 * @param companyId the primary key of the company
	 * @return the matching edc permission scope audits, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionScopeAudit>
		getEdcPermissionScopeAuditsByUuidAndCompanyId(
			String uuid, long companyId) {

		return _edcPermissionScopeAuditLocalService.
			getEdcPermissionScopeAuditsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of edc permission scope audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission scope audits
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching edc permission scope audits, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionScopeAudit>
		getEdcPermissionScopeAuditsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.EdcPermissionScopeAudit>
					orderByComparator) {

		return _edcPermissionScopeAuditLocalService.
			getEdcPermissionScopeAuditsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc permission scope audits.
	 *
	 * @return the number of edc permission scope audits
	 */
	@Override
	public int getEdcPermissionScopeAuditsCount() {
		return _edcPermissionScopeAuditLocalService.
			getEdcPermissionScopeAuditsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _edcPermissionScopeAuditLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _edcPermissionScopeAuditLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionScopeAuditLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the edc permission scope audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionScopeAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 * @return the edc permission scope audit that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
		updateEdcPermissionScopeAudit(
			com.dhsoft.edc.backend.model.EdcPermissionScopeAudit
				edcPermissionScopeAudit) {

		return _edcPermissionScopeAuditLocalService.
			updateEdcPermissionScopeAudit(edcPermissionScopeAudit);
	}

	@Override
	public EdcPermissionScopeAuditLocalService getWrappedService() {
		return _edcPermissionScopeAuditLocalService;
	}

	@Override
	public void setWrappedService(
		EdcPermissionScopeAuditLocalService
			edcPermissionScopeAuditLocalService) {

		_edcPermissionScopeAuditLocalService =
			edcPermissionScopeAuditLocalService;
	}

	private EdcPermissionScopeAuditLocalService
		_edcPermissionScopeAuditLocalService;

}
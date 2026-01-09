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
 * Provides a wrapper for {@link EdcPermissionRoleAuditLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleAuditLocalService
 * @generated
 */
public class EdcPermissionRoleAuditLocalServiceWrapper
	implements EdcPermissionRoleAuditLocalService,
			   ServiceWrapper<EdcPermissionRoleAuditLocalService> {

	public EdcPermissionRoleAuditLocalServiceWrapper(
		EdcPermissionRoleAuditLocalService edcPermissionRoleAuditLocalService) {

		_edcPermissionRoleAuditLocalService =
			edcPermissionRoleAuditLocalService;
	}

	/**
	 * Adds the edc permission role audit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		addEdcPermissionRoleAudit(
			com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
				edcPermissionRoleAudit) {

		return _edcPermissionRoleAuditLocalService.addEdcPermissionRoleAudit(
			edcPermissionRoleAudit);
	}

	/**
	 * Creates a new edc permission role audit with the primary key. Does not add the edc permission role audit to the database.
	 *
	 * @param auditRoleId the primary key for the new edc permission role audit
	 * @return the new edc permission role audit
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		createEdcPermissionRoleAudit(long auditRoleId) {

		return _edcPermissionRoleAuditLocalService.createEdcPermissionRoleAudit(
			auditRoleId);
	}

	/**
	 * Deletes the edc permission role audit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		deleteEdcPermissionRoleAudit(
			com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
				edcPermissionRoleAudit) {

		return _edcPermissionRoleAuditLocalService.deleteEdcPermissionRoleAudit(
			edcPermissionRoleAudit);
	}

	/**
	 * Deletes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws PortalException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
			deleteEdcPermissionRoleAudit(long auditRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleAuditLocalService.deleteEdcPermissionRoleAudit(
			auditRoleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleAuditLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _edcPermissionRoleAuditLocalService.dynamicQuery();
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

		return _edcPermissionRoleAuditLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
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

		return _edcPermissionRoleAuditLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
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

		return _edcPermissionRoleAuditLocalService.dynamicQuery(
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

		return _edcPermissionRoleAuditLocalService.dynamicQueryCount(
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

		return _edcPermissionRoleAuditLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		fetchEdcPermissionRoleAudit(long auditRoleId) {

		return _edcPermissionRoleAuditLocalService.fetchEdcPermissionRoleAudit(
			auditRoleId);
	}

	/**
	 * Returns the edc permission role audit matching the UUID and group.
	 *
	 * @param uuid the edc permission role audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		fetchEdcPermissionRoleAuditByUuidAndGroupId(String uuid, long groupId) {

		return _edcPermissionRoleAuditLocalService.
			fetchEdcPermissionRoleAuditByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _edcPermissionRoleAuditLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the edc permission role audit with the primary key.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws PortalException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
			getEdcPermissionRoleAudit(long auditRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleAuditLocalService.getEdcPermissionRoleAudit(
			auditRoleId);
	}

	/**
	 * Returns the edc permission role audit matching the UUID and group.
	 *
	 * @param uuid the edc permission role audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role audit
	 * @throws PortalException if a matching edc permission role audit could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
			getEdcPermissionRoleAuditByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleAuditLocalService.
			getEdcPermissionRoleAuditByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of edc permission role audits
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRoleAudit>
		getEdcPermissionRoleAudits(int start, int end) {

		return _edcPermissionRoleAuditLocalService.getEdcPermissionRoleAudits(
			start, end);
	}

	/**
	 * Returns all the edc permission role audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission role audits
	 * @param companyId the primary key of the company
	 * @return the matching edc permission role audits, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRoleAudit>
		getEdcPermissionRoleAuditsByUuidAndCompanyId(
			String uuid, long companyId) {

		return _edcPermissionRoleAuditLocalService.
			getEdcPermissionRoleAuditsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of edc permission role audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission role audits
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching edc permission role audits, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRoleAudit>
		getEdcPermissionRoleAuditsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.EdcPermissionRoleAudit>
					orderByComparator) {

		return _edcPermissionRoleAuditLocalService.
			getEdcPermissionRoleAuditsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc permission role audits.
	 *
	 * @return the number of edc permission role audits
	 */
	@Override
	public int getEdcPermissionRoleAuditsCount() {
		return _edcPermissionRoleAuditLocalService.
			getEdcPermissionRoleAuditsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _edcPermissionRoleAuditLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _edcPermissionRoleAuditLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleAuditLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the edc permission role audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
		updateEdcPermissionRoleAudit(
			com.dhsoft.edc.backend.model.EdcPermissionRoleAudit
				edcPermissionRoleAudit) {

		return _edcPermissionRoleAuditLocalService.updateEdcPermissionRoleAudit(
			edcPermissionRoleAudit);
	}

	@Override
	public EdcPermissionRoleAuditLocalService getWrappedService() {
		return _edcPermissionRoleAuditLocalService;
	}

	@Override
	public void setWrappedService(
		EdcPermissionRoleAuditLocalService edcPermissionRoleAuditLocalService) {

		_edcPermissionRoleAuditLocalService =
			edcPermissionRoleAuditLocalService;
	}

	private EdcPermissionRoleAuditLocalService
		_edcPermissionRoleAuditLocalService;

}
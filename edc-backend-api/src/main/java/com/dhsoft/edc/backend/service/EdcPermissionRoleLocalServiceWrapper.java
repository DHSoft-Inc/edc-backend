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
 * Provides a wrapper for {@link EdcPermissionRoleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleLocalService
 * @generated
 */
public class EdcPermissionRoleLocalServiceWrapper
	implements EdcPermissionRoleLocalService,
			   ServiceWrapper<EdcPermissionRoleLocalService> {

	public EdcPermissionRoleLocalServiceWrapper(
		EdcPermissionRoleLocalService edcPermissionRoleLocalService) {

		_edcPermissionRoleLocalService = edcPermissionRoleLocalService;
	}

	/**
	 * Adds the edc permission role to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRole the edc permission role
	 * @return the edc permission role that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole addEdcPermissionRole(
		com.dhsoft.edc.backend.model.EdcPermissionRole edcPermissionRole) {

		return _edcPermissionRoleLocalService.addEdcPermissionRole(
			edcPermissionRole);
	}

	/**
	 * Creates a new edc permission role with the primary key. Does not add the edc permission role to the database.
	 *
	 * @param permissionRoleId the primary key for the new edc permission role
	 * @return the new edc permission role
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
		createEdcPermissionRole(long permissionRoleId) {

		return _edcPermissionRoleLocalService.createEdcPermissionRole(
			permissionRoleId);
	}

	/**
	 * Deletes the edc permission role from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRole the edc permission role
	 * @return the edc permission role that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
		deleteEdcPermissionRole(
			com.dhsoft.edc.backend.model.EdcPermissionRole edcPermissionRole) {

		return _edcPermissionRoleLocalService.deleteEdcPermissionRole(
			edcPermissionRole);
	}

	/**
	 * Deletes the edc permission role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role that was removed
	 * @throws PortalException if a edc permission role with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
			deleteEdcPermissionRole(long permissionRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleLocalService.deleteEdcPermissionRole(
			permissionRoleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _edcPermissionRoleLocalService.dynamicQuery();
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

		return _edcPermissionRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl</code>.
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

		return _edcPermissionRoleLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl</code>.
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

		return _edcPermissionRoleLocalService.dynamicQuery(
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

		return _edcPermissionRoleLocalService.dynamicQueryCount(dynamicQuery);
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

		return _edcPermissionRoleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
		fetchEdcPermissionRole(long permissionRoleId) {

		return _edcPermissionRoleLocalService.fetchEdcPermissionRole(
			permissionRoleId);
	}

	/**
	 * Returns the edc permission role matching the UUID and group.
	 *
	 * @param uuid the edc permission role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
		fetchEdcPermissionRoleByUuidAndGroupId(String uuid, long groupId) {

		return _edcPermissionRoleLocalService.
			fetchEdcPermissionRoleByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _edcPermissionRoleLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the edc permission role with the primary key.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws PortalException if a edc permission role with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole getEdcPermissionRole(
			long permissionRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleLocalService.getEdcPermissionRole(
			permissionRoleId);
	}

	/**
	 * Returns the edc permission role matching the UUID and group.
	 *
	 * @param uuid the edc permission role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role
	 * @throws PortalException if a matching edc permission role could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
			getEdcPermissionRoleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleLocalService.
			getEdcPermissionRoleByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of edc permission roles
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRole>
		getEdcPermissionRoles(int start, int end) {

		return _edcPermissionRoleLocalService.getEdcPermissionRoles(start, end);
	}

	/**
	 * Returns all the edc permission roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission roles
	 * @param companyId the primary key of the company
	 * @return the matching edc permission roles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRole>
		getEdcPermissionRolesByUuidAndCompanyId(String uuid, long companyId) {

		return _edcPermissionRoleLocalService.
			getEdcPermissionRolesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of edc permission roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission roles
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching edc permission roles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcPermissionRole>
		getEdcPermissionRolesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.EdcPermissionRole>
					orderByComparator) {

		return _edcPermissionRoleLocalService.
			getEdcPermissionRolesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc permission roles.
	 *
	 * @return the number of edc permission roles
	 */
	@Override
	public int getEdcPermissionRolesCount() {
		return _edcPermissionRoleLocalService.getEdcPermissionRolesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _edcPermissionRoleLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _edcPermissionRoleLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _edcPermissionRoleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcPermissionRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the edc permission role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRole the edc permission role
	 * @return the edc permission role that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcPermissionRole
		updateEdcPermissionRole(
			com.dhsoft.edc.backend.model.EdcPermissionRole edcPermissionRole) {

		return _edcPermissionRoleLocalService.updateEdcPermissionRole(
			edcPermissionRole);
	}

	@Override
	public EdcPermissionRoleLocalService getWrappedService() {
		return _edcPermissionRoleLocalService;
	}

	@Override
	public void setWrappedService(
		EdcPermissionRoleLocalService edcPermissionRoleLocalService) {

		_edcPermissionRoleLocalService = edcPermissionRoleLocalService;
	}

	private EdcPermissionRoleLocalService _edcPermissionRoleLocalService;

}
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
 * Provides a wrapper for {@link AssignInstitutionRoleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssignInstitutionRoleLocalService
 * @generated
 */
public class AssignInstitutionRoleLocalServiceWrapper
	implements AssignInstitutionRoleLocalService,
			   ServiceWrapper<AssignInstitutionRoleLocalService> {

	public AssignInstitutionRoleLocalServiceWrapper(
		AssignInstitutionRoleLocalService assignInstitutionRoleLocalService) {

		_assignInstitutionRoleLocalService = assignInstitutionRoleLocalService;
	}

	/**
	 * Adds the assign institution role to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignInstitutionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignInstitutionRole the assign institution role
	 * @return the assign institution role that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		addAssignInstitutionRole(
			com.dhsoft.edc.backend.model.AssignInstitutionRole
				assignInstitutionRole) {

		return _assignInstitutionRoleLocalService.addAssignInstitutionRole(
			assignInstitutionRole);
	}

	/**
	 * Creates a new assign institution role with the primary key. Does not add the assign institution role to the database.
	 *
	 * @param institutionRoleId the primary key for the new assign institution role
	 * @return the new assign institution role
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		createAssignInstitutionRole(long institutionRoleId) {

		return _assignInstitutionRoleLocalService.createAssignInstitutionRole(
			institutionRoleId);
	}

	/**
	 * Deletes the assign institution role from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignInstitutionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignInstitutionRole the assign institution role
	 * @return the assign institution role that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		deleteAssignInstitutionRole(
			com.dhsoft.edc.backend.model.AssignInstitutionRole
				assignInstitutionRole) {

		return _assignInstitutionRoleLocalService.deleteAssignInstitutionRole(
			assignInstitutionRole);
	}

	/**
	 * Deletes the assign institution role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignInstitutionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role that was removed
	 * @throws PortalException if a assign institution role with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
			deleteAssignInstitutionRole(long institutionRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignInstitutionRoleLocalService.deleteAssignInstitutionRole(
			institutionRoleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignInstitutionRoleLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assignInstitutionRoleLocalService.dynamicQuery();
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

		return _assignInstitutionRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl</code>.
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

		return _assignInstitutionRoleLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl</code>.
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

		return _assignInstitutionRoleLocalService.dynamicQuery(
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

		return _assignInstitutionRoleLocalService.dynamicQueryCount(
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

		return _assignInstitutionRoleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		fetchAssignInstitutionRole(long institutionRoleId) {

		return _assignInstitutionRoleLocalService.fetchAssignInstitutionRole(
			institutionRoleId);
	}

	/**
	 * Returns the assign institution role matching the UUID and group.
	 *
	 * @param uuid the assign institution role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		fetchAssignInstitutionRoleByUuidAndGroupId(String uuid, long groupId) {

		return _assignInstitutionRoleLocalService.
			fetchAssignInstitutionRoleByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assignInstitutionRoleLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the assign institution role with the primary key.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws PortalException if a assign institution role with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
			getAssignInstitutionRole(long institutionRoleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignInstitutionRoleLocalService.getAssignInstitutionRole(
			institutionRoleId);
	}

	/**
	 * Returns the assign institution role matching the UUID and group.
	 *
	 * @param uuid the assign institution role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign institution role
	 * @throws PortalException if a matching assign institution role could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
			getAssignInstitutionRoleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignInstitutionRoleLocalService.
			getAssignInstitutionRoleByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of assign institution roles
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignInstitutionRole>
		getAssignInstitutionRoles(int start, int end) {

		return _assignInstitutionRoleLocalService.getAssignInstitutionRoles(
			start, end);
	}

	/**
	 * Returns all the assign institution roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign institution roles
	 * @param companyId the primary key of the company
	 * @return the matching assign institution roles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignInstitutionRole>
		getAssignInstitutionRolesByUuidAndCompanyId(
			String uuid, long companyId) {

		return _assignInstitutionRoleLocalService.
			getAssignInstitutionRolesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of assign institution roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign institution roles
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching assign institution roles, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignInstitutionRole>
		getAssignInstitutionRolesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.AssignInstitutionRole>
					orderByComparator) {

		return _assignInstitutionRoleLocalService.
			getAssignInstitutionRolesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of assign institution roles.
	 *
	 * @return the number of assign institution roles
	 */
	@Override
	public int getAssignInstitutionRolesCount() {
		return _assignInstitutionRoleLocalService.
			getAssignInstitutionRolesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _assignInstitutionRoleLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assignInstitutionRoleLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assignInstitutionRoleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignInstitutionRoleLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the assign institution role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignInstitutionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignInstitutionRole the assign institution role
	 * @return the assign institution role that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignInstitutionRole
		updateAssignInstitutionRole(
			com.dhsoft.edc.backend.model.AssignInstitutionRole
				assignInstitutionRole) {

		return _assignInstitutionRoleLocalService.updateAssignInstitutionRole(
			assignInstitutionRole);
	}

	@Override
	public AssignInstitutionRoleLocalService getWrappedService() {
		return _assignInstitutionRoleLocalService;
	}

	@Override
	public void setWrappedService(
		AssignInstitutionRoleLocalService assignInstitutionRoleLocalService) {

		_assignInstitutionRoleLocalService = assignInstitutionRoleLocalService;
	}

	private AssignInstitutionRoleLocalService
		_assignInstitutionRoleLocalService;

}
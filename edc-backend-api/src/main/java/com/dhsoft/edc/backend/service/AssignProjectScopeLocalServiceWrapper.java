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
 * Provides a wrapper for {@link AssignProjectScopeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScopeLocalService
 * @generated
 */
public class AssignProjectScopeLocalServiceWrapper
	implements AssignProjectScopeLocalService,
			   ServiceWrapper<AssignProjectScopeLocalService> {

	public AssignProjectScopeLocalServiceWrapper(
		AssignProjectScopeLocalService assignProjectScopeLocalService) {

		_assignProjectScopeLocalService = assignProjectScopeLocalService;
	}

	/**
	 * Adds the assign project scope to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignProjectScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignProjectScope the assign project scope
	 * @return the assign project scope that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		addAssignProjectScope(
			com.dhsoft.edc.backend.model.AssignProjectScope
				assignProjectScope) {

		return _assignProjectScopeLocalService.addAssignProjectScope(
			assignProjectScope);
	}

	/**
	 * Creates a new assign project scope with the primary key. Does not add the assign project scope to the database.
	 *
	 * @param projectScopeId the primary key for the new assign project scope
	 * @return the new assign project scope
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		createAssignProjectScope(long projectScopeId) {

		return _assignProjectScopeLocalService.createAssignProjectScope(
			projectScopeId);
	}

	/**
	 * Deletes the assign project scope from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignProjectScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignProjectScope the assign project scope
	 * @return the assign project scope that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		deleteAssignProjectScope(
			com.dhsoft.edc.backend.model.AssignProjectScope
				assignProjectScope) {

		return _assignProjectScopeLocalService.deleteAssignProjectScope(
			assignProjectScope);
	}

	/**
	 * Deletes the assign project scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignProjectScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope that was removed
	 * @throws PortalException if a assign project scope with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
			deleteAssignProjectScope(long projectScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignProjectScopeLocalService.deleteAssignProjectScope(
			projectScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignProjectScopeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assignProjectScopeLocalService.dynamicQuery();
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

		return _assignProjectScopeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl</code>.
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

		return _assignProjectScopeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl</code>.
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

		return _assignProjectScopeLocalService.dynamicQuery(
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

		return _assignProjectScopeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _assignProjectScopeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		fetchAssignProjectScope(long projectScopeId) {

		return _assignProjectScopeLocalService.fetchAssignProjectScope(
			projectScopeId);
	}

	/**
	 * Returns the assign project scope matching the UUID and group.
	 *
	 * @param uuid the assign project scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		fetchAssignProjectScopeByUuidAndGroupId(String uuid, long groupId) {

		return _assignProjectScopeLocalService.
			fetchAssignProjectScopeByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assignProjectScopeLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the assign project scope with the primary key.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws PortalException if a assign project scope with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
			getAssignProjectScope(long projectScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignProjectScopeLocalService.getAssignProjectScope(
			projectScopeId);
	}

	/**
	 * Returns the assign project scope matching the UUID and group.
	 *
	 * @param uuid the assign project scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign project scope
	 * @throws PortalException if a matching assign project scope could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
			getAssignProjectScopeByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignProjectScopeLocalService.
			getAssignProjectScopeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of assign project scopes
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignProjectScope>
		getAssignProjectScopes(int start, int end) {

		return _assignProjectScopeLocalService.getAssignProjectScopes(
			start, end);
	}

	/**
	 * Returns all the assign project scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign project scopes
	 * @param companyId the primary key of the company
	 * @return the matching assign project scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignProjectScope>
		getAssignProjectScopesByUuidAndCompanyId(String uuid, long companyId) {

		return _assignProjectScopeLocalService.
			getAssignProjectScopesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of assign project scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign project scopes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching assign project scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.AssignProjectScope>
		getAssignProjectScopesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.AssignProjectScope>
					orderByComparator) {

		return _assignProjectScopeLocalService.
			getAssignProjectScopesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of assign project scopes.
	 *
	 * @return the number of assign project scopes
	 */
	@Override
	public int getAssignProjectScopesCount() {
		return _assignProjectScopeLocalService.getAssignProjectScopesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _assignProjectScopeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assignProjectScopeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assignProjectScopeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignProjectScopeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the assign project scope in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignProjectScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignProjectScope the assign project scope
	 * @return the assign project scope that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.AssignProjectScope
		updateAssignProjectScope(
			com.dhsoft.edc.backend.model.AssignProjectScope
				assignProjectScope) {

		return _assignProjectScopeLocalService.updateAssignProjectScope(
			assignProjectScope);
	}

	@Override
	public AssignProjectScopeLocalService getWrappedService() {
		return _assignProjectScopeLocalService;
	}

	@Override
	public void setWrappedService(
		AssignProjectScopeLocalService assignProjectScopeLocalService) {

		_assignProjectScopeLocalService = assignProjectScopeLocalService;
	}

	private AssignProjectScopeLocalService _assignProjectScopeLocalService;

}
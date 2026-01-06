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

import com.dhsoft.edc.backend.model.AssignProjectScope;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AssignProjectScope. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.AssignProjectScopeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScopeLocalService
 * @generated
 */
public class AssignProjectScopeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.AssignProjectScopeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static AssignProjectScope addAssignProjectScope(
		AssignProjectScope assignProjectScope) {

		return getService().addAssignProjectScope(assignProjectScope);
	}

	/**
	 * Creates a new assign project scope with the primary key. Does not add the assign project scope to the database.
	 *
	 * @param projectScopeId the primary key for the new assign project scope
	 * @return the new assign project scope
	 */
	public static AssignProjectScope createAssignProjectScope(
		long projectScopeId) {

		return getService().createAssignProjectScope(projectScopeId);
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
	public static AssignProjectScope deleteAssignProjectScope(
		AssignProjectScope assignProjectScope) {

		return getService().deleteAssignProjectScope(assignProjectScope);
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
	public static AssignProjectScope deleteAssignProjectScope(
			long projectScopeId)
		throws PortalException {

		return getService().deleteAssignProjectScope(projectScopeId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl</code>.
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

	public static AssignProjectScope fetchAssignProjectScope(
		long projectScopeId) {

		return getService().fetchAssignProjectScope(projectScopeId);
	}

	/**
	 * Returns the assign project scope matching the UUID and group.
	 *
	 * @param uuid the assign project scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public static AssignProjectScope fetchAssignProjectScopeByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAssignProjectScopeByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the assign project scope with the primary key.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws PortalException if a assign project scope with the primary key could not be found
	 */
	public static AssignProjectScope getAssignProjectScope(long projectScopeId)
		throws PortalException {

		return getService().getAssignProjectScope(projectScopeId);
	}

	/**
	 * Returns the assign project scope matching the UUID and group.
	 *
	 * @param uuid the assign project scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign project scope
	 * @throws PortalException if a matching assign project scope could not be found
	 */
	public static AssignProjectScope getAssignProjectScopeByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAssignProjectScopeByUuidAndGroupId(
			uuid, groupId);
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
	public static List<AssignProjectScope> getAssignProjectScopes(
		int start, int end) {

		return getService().getAssignProjectScopes(start, end);
	}

	/**
	 * Returns all the assign project scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign project scopes
	 * @param companyId the primary key of the company
	 * @return the matching assign project scopes, or an empty list if no matches were found
	 */
	public static List<AssignProjectScope>
		getAssignProjectScopesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAssignProjectScopesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<AssignProjectScope>
		getAssignProjectScopesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AssignProjectScope> orderByComparator) {

		return getService().getAssignProjectScopesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of assign project scopes.
	 *
	 * @return the number of assign project scopes
	 */
	public static int getAssignProjectScopesCount() {
		return getService().getAssignProjectScopesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the assign project scope in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignProjectScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignProjectScope the assign project scope
	 * @return the assign project scope that was updated
	 */
	public static AssignProjectScope updateAssignProjectScope(
		AssignProjectScope assignProjectScope) {

		return getService().updateAssignProjectScope(assignProjectScope);
	}

	public static AssignProjectScopeLocalService getService() {
		return _service;
	}

	private static volatile AssignProjectScopeLocalService _service;

}
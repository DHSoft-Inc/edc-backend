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

import com.dhsoft.edc.backend.model.EdcPermissionRole;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EdcPermissionRole. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.EdcPermissionRoleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleLocalService
 * @generated
 */
public class EdcPermissionRoleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.EdcPermissionRoleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static EdcPermissionRole addEdcPermissionRole(
		EdcPermissionRole edcPermissionRole) {

		return getService().addEdcPermissionRole(edcPermissionRole);
	}

	/**
	 * Creates a new edc permission role with the primary key. Does not add the edc permission role to the database.
	 *
	 * @param permissionRoleId the primary key for the new edc permission role
	 * @return the new edc permission role
	 */
	public static EdcPermissionRole createEdcPermissionRole(
		long permissionRoleId) {

		return getService().createEdcPermissionRole(permissionRoleId);
	}

	public static EdcPermissionRole CreateEdcPermissionRole(
		long companyId, long groupId, long projectId, long actorGroup,
		long actorId, String roleName, Boolean active, java.util.Date fromDate,
		java.util.Date toDate) {

		return getService().CreateEdcPermissionRole(
			companyId, groupId, projectId, actorGroup, actorId, roleName,
			active, fromDate, toDate);
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
	public static EdcPermissionRole deleteEdcPermissionRole(
		EdcPermissionRole edcPermissionRole) {

		return getService().deleteEdcPermissionRole(edcPermissionRole);
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
	public static EdcPermissionRole deleteEdcPermissionRole(
			long permissionRoleId)
		throws PortalException {

		return getService().deleteEdcPermissionRole(permissionRoleId);
	}

	public static EdcPermissionRole DeleteEdcPermissionRole(
		long permissionRoleId) {

		return getService().DeleteEdcPermissionRole(permissionRoleId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl</code>.
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

	public static EdcPermissionRole fetchEdcPermissionRole(
		long permissionRoleId) {

		return getService().fetchEdcPermissionRole(permissionRoleId);
	}

	/**
	 * Returns the edc permission role matching the UUID and group.
	 *
	 * @param uuid the edc permission role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole fetchEdcPermissionRoleByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEdcPermissionRoleByUuidAndGroupId(
			uuid, groupId);
	}

	public static List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		return getService().findByEdcActorRole(projectId, actorGroup, actorId);
	}

	public static EdcPermissionRole findByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName) {

		return getService().findByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);
	}

	public static List<EdcPermissionRole> findByEdcProjectRole(long projectId) {
		return getService().findByEdcProjectRole(projectId);
	}

	public static EdcPermissionRole findByPermissionRoleId(
		long permissionRoleId) {

		return getService().findByPermissionRoleId(permissionRoleId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the edc permission role with the primary key.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws PortalException if a edc permission role with the primary key could not be found
	 */
	public static EdcPermissionRole getEdcPermissionRole(long permissionRoleId)
		throws PortalException {

		return getService().getEdcPermissionRole(permissionRoleId);
	}

	/**
	 * Returns the edc permission role matching the UUID and group.
	 *
	 * @param uuid the edc permission role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role
	 * @throws PortalException if a matching edc permission role could not be found
	 */
	public static EdcPermissionRole getEdcPermissionRoleByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getEdcPermissionRoleByUuidAndGroupId(uuid, groupId);
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
	public static List<EdcPermissionRole> getEdcPermissionRoles(
		int start, int end) {

		return getService().getEdcPermissionRoles(start, end);
	}

	/**
	 * Returns all the edc permission roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission roles
	 * @param companyId the primary key of the company
	 * @return the matching edc permission roles, or an empty list if no matches were found
	 */
	public static List<EdcPermissionRole>
		getEdcPermissionRolesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getEdcPermissionRolesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<EdcPermissionRole>
		getEdcPermissionRolesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<EdcPermissionRole> orderByComparator) {

		return getService().getEdcPermissionRolesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc permission roles.
	 *
	 * @return the number of edc permission roles
	 */
	public static int getEdcPermissionRolesCount() {
		return getService().getEdcPermissionRolesCount();
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
	 * Updates the edc permission role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRole the edc permission role
	 * @return the edc permission role that was updated
	 */
	public static EdcPermissionRole updateEdcPermissionRole(
		EdcPermissionRole edcPermissionRole) {

		return getService().updateEdcPermissionRole(edcPermissionRole);
	}

	public static void UpdateEdcPermissionRole(
		long permissionRoleId, long actorGroup, long actorId, String roleName,
		Boolean active, java.util.Date fromDate, java.util.Date toDate) {

		getService().UpdateEdcPermissionRole(
			permissionRoleId, actorGroup, actorId, roleName, active, fromDate,
			toDate);
	}

	public static EdcPermissionRoleLocalService getService() {
		return _service;
	}

	private static volatile EdcPermissionRoleLocalService _service;

}
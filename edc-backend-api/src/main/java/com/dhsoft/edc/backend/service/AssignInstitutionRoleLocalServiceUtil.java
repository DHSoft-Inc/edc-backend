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

import com.dhsoft.edc.backend.model.AssignInstitutionRole;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AssignInstitutionRole. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.AssignInstitutionRoleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssignInstitutionRoleLocalService
 * @generated
 */
public class AssignInstitutionRoleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.AssignInstitutionRoleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static AssignInstitutionRole addAssignInstitutionRole(
		AssignInstitutionRole assignInstitutionRole) {

		return getService().addAssignInstitutionRole(assignInstitutionRole);
	}

	/**
	 * Creates a new assign institution role with the primary key. Does not add the assign institution role to the database.
	 *
	 * @param institutionRoleId the primary key for the new assign institution role
	 * @return the new assign institution role
	 */
	public static AssignInstitutionRole createAssignInstitutionRole(
		long institutionRoleId) {

		return getService().createAssignInstitutionRole(institutionRoleId);
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
	public static AssignInstitutionRole deleteAssignInstitutionRole(
		AssignInstitutionRole assignInstitutionRole) {

		return getService().deleteAssignInstitutionRole(assignInstitutionRole);
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
	public static AssignInstitutionRole deleteAssignInstitutionRole(
			long institutionRoleId)
		throws PortalException {

		return getService().deleteAssignInstitutionRole(institutionRoleId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl</code>.
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

	public static AssignInstitutionRole fetchAssignInstitutionRole(
		long institutionRoleId) {

		return getService().fetchAssignInstitutionRole(institutionRoleId);
	}

	/**
	 * Returns the assign institution role matching the UUID and group.
	 *
	 * @param uuid the assign institution role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole
		fetchAssignInstitutionRoleByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchAssignInstitutionRoleByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the assign institution role with the primary key.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws PortalException if a assign institution role with the primary key could not be found
	 */
	public static AssignInstitutionRole getAssignInstitutionRole(
			long institutionRoleId)
		throws PortalException {

		return getService().getAssignInstitutionRole(institutionRoleId);
	}

	/**
	 * Returns the assign institution role matching the UUID and group.
	 *
	 * @param uuid the assign institution role's UUID
	 * @param groupId the primary key of the group
	 * @return the matching assign institution role
	 * @throws PortalException if a matching assign institution role could not be found
	 */
	public static AssignInstitutionRole
			getAssignInstitutionRoleByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getAssignInstitutionRoleByUuidAndGroupId(
			uuid, groupId);
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
	public static List<AssignInstitutionRole> getAssignInstitutionRoles(
		int start, int end) {

		return getService().getAssignInstitutionRoles(start, end);
	}

	/**
	 * Returns all the assign institution roles matching the UUID and company.
	 *
	 * @param uuid the UUID of the assign institution roles
	 * @param companyId the primary key of the company
	 * @return the matching assign institution roles, or an empty list if no matches were found
	 */
	public static List<AssignInstitutionRole>
		getAssignInstitutionRolesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAssignInstitutionRolesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<AssignInstitutionRole>
		getAssignInstitutionRolesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return getService().getAssignInstitutionRolesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of assign institution roles.
	 *
	 * @return the number of assign institution roles
	 */
	public static int getAssignInstitutionRolesCount() {
		return getService().getAssignInstitutionRolesCount();
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
	 * Updates the assign institution role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignInstitutionRoleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignInstitutionRole the assign institution role
	 * @return the assign institution role that was updated
	 */
	public static AssignInstitutionRole updateAssignInstitutionRole(
		AssignInstitutionRole assignInstitutionRole) {

		return getService().updateAssignInstitutionRole(assignInstitutionRole);
	}

	public static AssignInstitutionRoleLocalService getService() {
		return _service;
	}

	private static volatile AssignInstitutionRoleLocalService _service;

}
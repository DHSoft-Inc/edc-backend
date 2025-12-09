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

import com.dhsoft.edc.backend.model.Institution;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Institution. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.InstitutionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see InstitutionLocalService
 * @generated
 */
public class InstitutionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.InstitutionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the institution to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was added
	 */
	public static Institution addInstitution(Institution institution) {
		return getService().addInstitution(institution);
	}

	/**
	 * Creates a new institution with the primary key. Does not add the institution to the database.
	 *
	 * @param institutionId the primary key for the new institution
	 * @return the new institution
	 */
	public static Institution createInstitution(long institutionId) {
		return getService().createInstitution(institutionId);
	}

	public static Institution CreateInstitution(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String code,
		String name, String enName, int type, String piName, String contactNum,
		String email, java.util.Date irbDate) {

		return getService().CreateInstitution(
			companyId, groupId, projectId, userId, userName, status,
			statusByUserId, statusByUserName, statusDate, code, name, enName,
			type, piName, contactNum, email, irbDate);
	}

	/**
	 * Deletes the institution from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was removed
	 */
	public static Institution deleteInstitution(Institution institution) {
		return getService().deleteInstitution(institution);
	}

	public static Institution DeleteInstitution(long institutionId) {
		return getService().DeleteInstitution(institutionId);
	}

	/**
	 * Deletes the institution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution that was removed
	 * @throws PortalException if a institution with the primary key could not be found
	 */
	public static Institution deleteInstitution(long institutionId)
		throws PortalException {

		return getService().deleteInstitution(institutionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
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

	public static Institution fetchInstitution(long institutionId) {
		return getService().fetchInstitution(institutionId);
	}

	/**
	 * Returns the institution matching the UUID and group.
	 *
	 * @param uuid the institution's UUID
	 * @param groupId the primary key of the group
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public static Institution fetchInstitutionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchInstitutionByUuidAndGroupId(uuid, groupId);
	}

	public static List<Institution> findByGroupAndProjectId(
		long groupId, long projectId) {

		return getService().findByGroupAndProjectId(groupId, projectId);
	}

	public static Institution findByInstitutionId(long institutionId) {
		return getService().findByInstitutionId(institutionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the institution with the primary key.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution
	 * @throws PortalException if a institution with the primary key could not be found
	 */
	public static Institution getInstitution(long institutionId)
		throws PortalException {

		return getService().getInstitution(institutionId);
	}

	/**
	 * Returns the institution matching the UUID and group.
	 *
	 * @param uuid the institution's UUID
	 * @param groupId the primary key of the group
	 * @return the matching institution
	 * @throws PortalException if a matching institution could not be found
	 */
	public static Institution getInstitutionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getInstitutionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of institutions
	 */
	public static List<Institution> getInstitutions(int start, int end) {
		return getService().getInstitutions(start, end);
	}

	/**
	 * Returns all the institutions matching the UUID and company.
	 *
	 * @param uuid the UUID of the institutions
	 * @param companyId the primary key of the company
	 * @return the matching institutions, or an empty list if no matches were found
	 */
	public static List<Institution> getInstitutionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getInstitutionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of institutions matching the UUID and company.
	 *
	 * @param uuid the UUID of the institutions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching institutions, or an empty list if no matches were found
	 */
	public static List<Institution> getInstitutionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Institution> orderByComparator) {

		return getService().getInstitutionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of institutions.
	 *
	 * @return the number of institutions
	 */
	public static int getInstitutionsCount() {
		return getService().getInstitutionsCount();
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
	 * Updates the institution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was updated
	 */
	public static Institution updateInstitution(Institution institution) {
		return getService().updateInstitution(institution);
	}

	public static void UpdateInstitution(
		long institutionId, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String code,
		String name, String enName, int type, String piName, String contactNum,
		String email, java.util.Date irbDate) {

		getService().UpdateInstitution(
			institutionId, status, statusByUserId, statusByUserName, statusDate,
			code, name, enName, type, piName, contactNum, email, irbDate);
	}

	public static InstitutionLocalService getService() {
		return _service;
	}

	private static volatile InstitutionLocalService _service;

}
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

import com.dhsoft.edc.backend.model.InstResearcher;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for InstResearcher. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.InstResearcherLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see InstResearcherLocalService
 * @generated
 */
public class InstResearcherLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.InstResearcherLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the inst researcher to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was added
	 */
	public static InstResearcher addInstResearcher(
		InstResearcher instResearcher) {

		return getService().addInstResearcher(instResearcher);
	}

	/**
	 * Creates a new inst researcher with the primary key. Does not add the inst researcher to the database.
	 *
	 * @param institutionResearcherId the primary key for the new inst researcher
	 * @return the new inst researcher
	 */
	public static InstResearcher createInstResearcher(
		long institutionResearcherId) {

		return getService().createInstResearcher(institutionResearcherId);
	}

	/**
	 * Deletes the inst researcher from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was removed
	 */
	public static InstResearcher deleteInstResearcher(
		InstResearcher instResearcher) {

		return getService().deleteInstResearcher(instResearcher);
	}

	/**
	 * Deletes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws PortalException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher deleteInstResearcher(
			long institutionResearcherId)
		throws PortalException {

		return getService().deleteInstResearcher(institutionResearcherId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
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

	public static InstResearcher fetchInstResearcher(
		long institutionResearcherId) {

		return getService().fetchInstResearcher(institutionResearcherId);
	}

	/**
	 * Returns the inst researcher matching the UUID and group.
	 *
	 * @param uuid the inst researcher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public static InstResearcher fetchInstResearcherByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchInstResearcherByUuidAndGroupId(uuid, groupId);
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
	 * Returns the inst researcher with the primary key.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws PortalException if a inst researcher with the primary key could not be found
	 */
	public static InstResearcher getInstResearcher(long institutionResearcherId)
		throws PortalException {

		return getService().getInstResearcher(institutionResearcherId);
	}

	/**
	 * Returns the inst researcher matching the UUID and group.
	 *
	 * @param uuid the inst researcher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching inst researcher
	 * @throws PortalException if a matching inst researcher could not be found
	 */
	public static InstResearcher getInstResearcherByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getInstResearcherByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of inst researchers
	 */
	public static List<InstResearcher> getInstResearchers(int start, int end) {
		return getService().getInstResearchers(start, end);
	}

	/**
	 * Returns all the inst researchers matching the UUID and company.
	 *
	 * @param uuid the UUID of the inst researchers
	 * @param companyId the primary key of the company
	 * @return the matching inst researchers, or an empty list if no matches were found
	 */
	public static List<InstResearcher> getInstResearchersByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getInstResearchersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of inst researchers matching the UUID and company.
	 *
	 * @param uuid the UUID of the inst researchers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching inst researchers, or an empty list if no matches were found
	 */
	public static List<InstResearcher> getInstResearchersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return getService().getInstResearchersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of inst researchers.
	 *
	 * @return the number of inst researchers
	 */
	public static int getInstResearchersCount() {
		return getService().getInstResearchersCount();
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
	 * Updates the inst researcher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was updated
	 */
	public static InstResearcher updateInstResearcher(
		InstResearcher instResearcher) {

		return getService().updateInstResearcher(instResearcher);
	}

	public static InstResearcherLocalService getService() {
		return _service;
	}

	private static volatile InstResearcherLocalService _service;

}
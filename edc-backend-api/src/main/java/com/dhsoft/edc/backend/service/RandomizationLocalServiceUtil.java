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

import com.dhsoft.edc.backend.model.Randomization;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Randomization. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.RandomizationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RandomizationLocalService
 * @generated
 */
public class RandomizationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.RandomizationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the randomization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was added
	 */
	public static Randomization addRandomization(Randomization randomization) {
		return getService().addRandomization(randomization);
	}

	/**
	 * Creates a new randomization with the primary key. Does not add the randomization to the database.
	 *
	 * @param randomizationId the primary key for the new randomization
	 * @return the new randomization
	 */
	public static Randomization createRandomization(long randomizationId) {
		return getService().createRandomization(randomizationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the randomization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization that was removed
	 * @throws PortalException if a randomization with the primary key could not be found
	 */
	public static Randomization deleteRandomization(long randomizationId)
		throws PortalException {

		return getService().deleteRandomization(randomizationId);
	}

	/**
	 * Deletes the randomization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was removed
	 */
	public static Randomization deleteRandomization(
		Randomization randomization) {

		return getService().deleteRandomization(randomization);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
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

	public static Randomization fetchRandomization(long randomizationId) {
		return getService().fetchRandomization(randomizationId);
	}

	/**
	 * Returns the randomization matching the UUID and group.
	 *
	 * @param uuid the randomization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public static Randomization fetchRandomizationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchRandomizationByUuidAndGroupId(uuid, groupId);
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
	 * Returns the randomization with the primary key.
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization
	 * @throws PortalException if a randomization with the primary key could not be found
	 */
	public static Randomization getRandomization(long randomizationId)
		throws PortalException {

		return getService().getRandomization(randomizationId);
	}

	/**
	 * Returns the randomization matching the UUID and group.
	 *
	 * @param uuid the randomization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching randomization
	 * @throws PortalException if a matching randomization could not be found
	 */
	public static Randomization getRandomizationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getRandomizationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the randomizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of randomizations
	 */
	public static List<Randomization> getRandomizations(int start, int end) {
		return getService().getRandomizations(start, end);
	}

	/**
	 * Returns all the randomizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the randomizations
	 * @param companyId the primary key of the company
	 * @return the matching randomizations, or an empty list if no matches were found
	 */
	public static List<Randomization> getRandomizationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getRandomizationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of randomizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the randomizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching randomizations, or an empty list if no matches were found
	 */
	public static List<Randomization> getRandomizationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Randomization> orderByComparator) {

		return getService().getRandomizationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of randomizations.
	 *
	 * @return the number of randomizations
	 */
	public static int getRandomizationsCount() {
		return getService().getRandomizationsCount();
	}

	/**
	 * Updates the randomization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was updated
	 */
	public static Randomization updateRandomization(
		Randomization randomization) {

		return getService().updateRandomization(randomization);
	}

	public static RandomizationLocalService getService() {
		return _service;
	}

	private static volatile RandomizationLocalService _service;

}
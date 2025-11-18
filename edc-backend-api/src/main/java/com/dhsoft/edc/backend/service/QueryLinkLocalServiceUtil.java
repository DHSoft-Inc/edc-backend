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

import com.dhsoft.edc.backend.model.QueryLink;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QueryLink. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.QueryLinkLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLinkLocalService
 * @generated
 */
public class QueryLinkLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.QueryLinkLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the query link to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLink the query link
	 * @return the query link that was added
	 */
	public static QueryLink addQueryLink(QueryLink queryLink) {
		return getService().addQueryLink(queryLink);
	}

	/**
	 * Creates a new query link with the primary key. Does not add the query link to the database.
	 *
	 * @param queryId the primary key for the new query link
	 * @return the new query link
	 */
	public static QueryLink createQueryLink(long queryId) {
		return getService().createQueryLink(queryId);
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
	 * Deletes the query link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link that was removed
	 * @throws PortalException if a query link with the primary key could not be found
	 */
	public static QueryLink deleteQueryLink(long queryId)
		throws PortalException {

		return getService().deleteQueryLink(queryId);
	}

	/**
	 * Deletes the query link from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLink the query link
	 * @return the query link that was removed
	 */
	public static QueryLink deleteQueryLink(QueryLink queryLink) {
		return getService().deleteQueryLink(queryLink);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryLinkModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryLinkModelImpl</code>.
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

	public static QueryLink fetchQueryLink(long queryId) {
		return getService().fetchQueryLink(queryId);
	}

	/**
	 * Returns the query link matching the UUID and group.
	 *
	 * @param uuid the query link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public static QueryLink fetchQueryLinkByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchQueryLinkByUuidAndGroupId(uuid, groupId);
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
	 * Returns the query link with the primary key.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link
	 * @throws PortalException if a query link with the primary key could not be found
	 */
	public static QueryLink getQueryLink(long queryId) throws PortalException {
		return getService().getQueryLink(queryId);
	}

	/**
	 * Returns the query link matching the UUID and group.
	 *
	 * @param uuid the query link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query link
	 * @throws PortalException if a matching query link could not be found
	 */
	public static QueryLink getQueryLinkByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getQueryLinkByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of query links
	 */
	public static List<QueryLink> getQueryLinks(int start, int end) {
		return getService().getQueryLinks(start, end);
	}

	/**
	 * Returns all the query links matching the UUID and company.
	 *
	 * @param uuid the UUID of the query links
	 * @param companyId the primary key of the company
	 * @return the matching query links, or an empty list if no matches were found
	 */
	public static List<QueryLink> getQueryLinksByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getQueryLinksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of query links matching the UUID and company.
	 *
	 * @param uuid the UUID of the query links
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching query links, or an empty list if no matches were found
	 */
	public static List<QueryLink> getQueryLinksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return getService().getQueryLinksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of query links.
	 *
	 * @return the number of query links
	 */
	public static int getQueryLinksCount() {
		return getService().getQueryLinksCount();
	}

	/**
	 * Updates the query link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLink the query link
	 * @return the query link that was updated
	 */
	public static QueryLink updateQueryLink(QueryLink queryLink) {
		return getService().updateQueryLink(queryLink);
	}

	public static QueryLinkLocalService getService() {
		return _service;
	}

	private static volatile QueryLinkLocalService _service;

}
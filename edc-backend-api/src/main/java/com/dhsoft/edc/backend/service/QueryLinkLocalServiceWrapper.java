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
 * Provides a wrapper for {@link QueryLinkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLinkLocalService
 * @generated
 */
public class QueryLinkLocalServiceWrapper
	implements QueryLinkLocalService, ServiceWrapper<QueryLinkLocalService> {

	public QueryLinkLocalServiceWrapper(
		QueryLinkLocalService queryLinkLocalService) {

		_queryLinkLocalService = queryLinkLocalService;
	}

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
	@Override
	public com.dhsoft.edc.backend.model.QueryLink addQueryLink(
		com.dhsoft.edc.backend.model.QueryLink queryLink) {

		return _queryLinkLocalService.addQueryLink(queryLink);
	}

	/**
	 * Creates a new query link with the primary key. Does not add the query link to the database.
	 *
	 * @param queryId the primary key for the new query link
	 * @return the new query link
	 */
	@Override
	public com.dhsoft.edc.backend.model.QueryLink createQueryLink(
		long queryId) {

		return _queryLinkLocalService.createQueryLink(queryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLinkLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.dhsoft.edc.backend.model.QueryLink deleteQueryLink(long queryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLinkLocalService.deleteQueryLink(queryId);
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
	@Override
	public com.dhsoft.edc.backend.model.QueryLink deleteQueryLink(
		com.dhsoft.edc.backend.model.QueryLink queryLink) {

		return _queryLinkLocalService.deleteQueryLink(queryLink);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _queryLinkLocalService.dynamicQuery();
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

		return _queryLinkLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _queryLinkLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _queryLinkLocalService.dynamicQuery(
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

		return _queryLinkLocalService.dynamicQueryCount(dynamicQuery);
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

		return _queryLinkLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.QueryLink fetchQueryLink(long queryId) {
		return _queryLinkLocalService.fetchQueryLink(queryId);
	}

	/**
	 * Returns the query link matching the UUID and group.
	 *
	 * @param uuid the query link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.QueryLink
		fetchQueryLinkByUuidAndGroupId(String uuid, long groupId) {

		return _queryLinkLocalService.fetchQueryLinkByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _queryLinkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _queryLinkLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _queryLinkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _queryLinkLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLinkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the query link with the primary key.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link
	 * @throws PortalException if a query link with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.QueryLink getQueryLink(long queryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLinkLocalService.getQueryLink(queryId);
	}

	/**
	 * Returns the query link matching the UUID and group.
	 *
	 * @param uuid the query link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query link
	 * @throws PortalException if a matching query link could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.QueryLink getQueryLinkByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLinkLocalService.getQueryLinkByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.QueryLink> getQueryLinks(
		int start, int end) {

		return _queryLinkLocalService.getQueryLinks(start, end);
	}

	/**
	 * Returns all the query links matching the UUID and company.
	 *
	 * @param uuid the UUID of the query links
	 * @param companyId the primary key of the company
	 * @return the matching query links, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.QueryLink>
		getQueryLinksByUuidAndCompanyId(String uuid, long companyId) {

		return _queryLinkLocalService.getQueryLinksByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.QueryLink>
		getQueryLinksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.QueryLink> orderByComparator) {

		return _queryLinkLocalService.getQueryLinksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of query links.
	 *
	 * @return the number of query links
	 */
	@Override
	public int getQueryLinksCount() {
		return _queryLinkLocalService.getQueryLinksCount();
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
	@Override
	public com.dhsoft.edc.backend.model.QueryLink updateQueryLink(
		com.dhsoft.edc.backend.model.QueryLink queryLink) {

		return _queryLinkLocalService.updateQueryLink(queryLink);
	}

	@Override
	public QueryLinkLocalService getWrappedService() {
		return _queryLinkLocalService;
	}

	@Override
	public void setWrappedService(QueryLinkLocalService queryLinkLocalService) {
		_queryLinkLocalService = queryLinkLocalService;
	}

	private QueryLinkLocalService _queryLinkLocalService;

}
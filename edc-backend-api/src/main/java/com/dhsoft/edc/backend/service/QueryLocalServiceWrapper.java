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
 * Provides a wrapper for {@link QueryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLocalService
 * @generated
 */
public class QueryLocalServiceWrapper
	implements QueryLocalService, ServiceWrapper<QueryLocalService> {

	public QueryLocalServiceWrapper(QueryLocalService queryLocalService) {
		_queryLocalService = queryLocalService;
	}

	/**
	 * Adds the query to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param query the query
	 * @return the query that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query addQuery(
		com.dhsoft.edc.backend.model.Query query) {

		return _queryLocalService.addQuery(query);
	}

	/**
	 * Creates a new query with the primary key. Does not add the query to the database.
	 *
	 * @param queryId the primary key for the new query
	 * @return the new query
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query createQuery(long queryId) {
		return _queryLocalService.createQuery(queryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryId the primary key of the query
	 * @return the query that was removed
	 * @throws PortalException if a query with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query deleteQuery(long queryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLocalService.deleteQuery(queryId);
	}

	/**
	 * Deletes the query from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param query the query
	 * @return the query that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query deleteQuery(
		com.dhsoft.edc.backend.model.Query query) {

		return _queryLocalService.deleteQuery(query);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _queryLocalService.dynamicQuery();
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

		return _queryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryModelImpl</code>.
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

		return _queryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryModelImpl</code>.
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

		return _queryLocalService.dynamicQuery(
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

		return _queryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _queryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.Query fetchQuery(long queryId) {
		return _queryLocalService.fetchQuery(queryId);
	}

	/**
	 * Returns the query matching the UUID and group.
	 *
	 * @param uuid the query's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query fetchQueryByUuidAndGroupId(
		String uuid, long groupId) {

		return _queryLocalService.fetchQueryByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _queryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _queryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _queryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _queryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of queries
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Query> getQueries(
		int start, int end) {

		return _queryLocalService.getQueries(start, end);
	}

	/**
	 * Returns all the queries matching the UUID and company.
	 *
	 * @param uuid the UUID of the queries
	 * @param companyId the primary key of the company
	 * @return the matching queries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Query>
		getQueriesByUuidAndCompanyId(String uuid, long companyId) {

		return _queryLocalService.getQueriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of queries matching the UUID and company.
	 *
	 * @param uuid the UUID of the queries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching queries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Query>
		getQueriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.Query> orderByComparator) {

		return _queryLocalService.getQueriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of queries.
	 *
	 * @return the number of queries
	 */
	@Override
	public int getQueriesCount() {
		return _queryLocalService.getQueriesCount();
	}

	/**
	 * Returns the query with the primary key.
	 *
	 * @param queryId the primary key of the query
	 * @return the query
	 * @throws PortalException if a query with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query getQuery(long queryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLocalService.getQuery(queryId);
	}

	/**
	 * Returns the query matching the UUID and group.
	 *
	 * @param uuid the query's UUID
	 * @param groupId the primary key of the group
	 * @return the matching query
	 * @throws PortalException if a matching query could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query getQueryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLocalService.getQueryByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Updates the query in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param query the query
	 * @return the query that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.Query updateQuery(
		com.dhsoft.edc.backend.model.Query query) {

		return _queryLocalService.updateQuery(query);
	}

	@Override
	public QueryLocalService getWrappedService() {
		return _queryLocalService;
	}

	@Override
	public void setWrappedService(QueryLocalService queryLocalService) {
		_queryLocalService = queryLocalService;
	}

	private QueryLocalService _queryLocalService;

}
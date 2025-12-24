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
 * Provides a wrapper for {@link MetaGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MetaGroupLocalService
 * @generated
 */
public class MetaGroupLocalServiceWrapper
	implements MetaGroupLocalService, ServiceWrapper<MetaGroupLocalService> {

	public MetaGroupLocalServiceWrapper(
		MetaGroupLocalService metaGroupLocalService) {

		_metaGroupLocalService = metaGroupLocalService;
	}

	/**
	 * Adds the meta group to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaGroup the meta group
	 * @return the meta group that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup addMetaGroup(
		com.dhsoft.edc.backend.model.MetaGroup metaGroup) {

		return _metaGroupLocalService.addMetaGroup(metaGroup);
	}

	/**
	 * Creates a new meta group with the primary key. Does not add the meta group to the database.
	 *
	 * @param metaGroupId the primary key for the new meta group
	 * @return the new meta group
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup createMetaGroup(
		long metaGroupId) {

		return _metaGroupLocalService.createMetaGroup(metaGroupId);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaGroup CreateMetaGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String groupName, String type, Boolean active,
		java.util.Date inactiveDate) {

		return _metaGroupLocalService.CreateMetaGroup(
			companyId, groupId, projectId, userId, userName, status,
			statusByUserId, statusByUserName, statusDate, groupCode, groupName,
			type, active, inactiveDate);
	}

	/**
	 * Deletes the meta group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group that was removed
	 * @throws PortalException if a meta group with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup deleteMetaGroup(
			long metaGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaGroupLocalService.deleteMetaGroup(metaGroupId);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaGroup DeleteMetaGroup(
		long metaGroupId) {

		return _metaGroupLocalService.DeleteMetaGroup(metaGroupId);
	}

	/**
	 * Deletes the meta group from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaGroup the meta group
	 * @return the meta group that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup deleteMetaGroup(
		com.dhsoft.edc.backend.model.MetaGroup metaGroup) {

		return _metaGroupLocalService.deleteMetaGroup(metaGroup);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _metaGroupLocalService.dynamicQuery();
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

		return _metaGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl</code>.
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

		return _metaGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl</code>.
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

		return _metaGroupLocalService.dynamicQuery(
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

		return _metaGroupLocalService.dynamicQueryCount(dynamicQuery);
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

		return _metaGroupLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaGroup fetchMetaGroup(
		long metaGroupId) {

		return _metaGroupLocalService.fetchMetaGroup(metaGroupId);
	}

	/**
	 * Returns the meta group matching the UUID and group.
	 *
	 * @param uuid the meta group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup
		fetchMetaGroupByUuidAndGroupId(String uuid, long groupId) {

		return _metaGroupLocalService.fetchMetaGroupByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaGroup>
		findByGroupAndProjectId(long groupId, long projectId) {

		return _metaGroupLocalService.findByGroupAndProjectId(
			groupId, projectId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaGroup>
		findByMetaGroupCode(long groupId, long projectId, String groupCode) {

		return _metaGroupLocalService.findByMetaGroupCode(
			groupId, projectId, groupCode);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaGroup findByMetaGroupId(
		long metaGroupId) {

		return _metaGroupLocalService.findByMetaGroupId(metaGroupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _metaGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _metaGroupLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _metaGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the meta group with the primary key.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group
	 * @throws PortalException if a meta group with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup getMetaGroup(long metaGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaGroupLocalService.getMetaGroup(metaGroupId);
	}

	/**
	 * Returns the meta group matching the UUID and group.
	 *
	 * @param uuid the meta group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta group
	 * @throws PortalException if a matching meta group could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup getMetaGroupByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaGroupLocalService.getMetaGroupByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of meta groups
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaGroup> getMetaGroups(
		int start, int end) {

		return _metaGroupLocalService.getMetaGroups(start, end);
	}

	/**
	 * Returns all the meta groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta groups
	 * @param companyId the primary key of the company
	 * @return the matching meta groups, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaGroup>
		getMetaGroupsByUuidAndCompanyId(String uuid, long companyId) {

		return _metaGroupLocalService.getMetaGroupsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of meta groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta groups
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching meta groups, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaGroup>
		getMetaGroupsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.MetaGroup> orderByComparator) {

		return _metaGroupLocalService.getMetaGroupsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meta groups.
	 *
	 * @return the number of meta groups
	 */
	@Override
	public int getMetaGroupsCount() {
		return _metaGroupLocalService.getMetaGroupsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _metaGroupLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void UpdateMetaGroup(
		long metaGroupId, int status, Long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String groupName, String type, Boolean active,
		java.util.Date inactiveDate) {

		_metaGroupLocalService.UpdateMetaGroup(
			metaGroupId, status, statusByUserId, statusByUserName, statusDate,
			groupCode, groupName, type, active, inactiveDate);
	}

	/**
	 * Updates the meta group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaGroup the meta group
	 * @return the meta group that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaGroup updateMetaGroup(
		com.dhsoft.edc.backend.model.MetaGroup metaGroup) {

		return _metaGroupLocalService.updateMetaGroup(metaGroup);
	}

	@Override
	public MetaGroupLocalService getWrappedService() {
		return _metaGroupLocalService;
	}

	@Override
	public void setWrappedService(MetaGroupLocalService metaGroupLocalService) {
		_metaGroupLocalService = metaGroupLocalService;
	}

	private MetaGroupLocalService _metaGroupLocalService;

}
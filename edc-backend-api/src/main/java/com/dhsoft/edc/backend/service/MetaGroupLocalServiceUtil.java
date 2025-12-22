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

import com.dhsoft.edc.backend.model.MetaGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MetaGroup. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.MetaGroupLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MetaGroupLocalService
 * @generated
 */
public class MetaGroupLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.MetaGroupLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MetaGroup addMetaGroup(MetaGroup metaGroup) {
		return getService().addMetaGroup(metaGroup);
	}

	/**
	 * Creates a new meta group with the primary key. Does not add the meta group to the database.
	 *
	 * @param metaGroupId the primary key for the new meta group
	 * @return the new meta group
	 */
	public static MetaGroup createMetaGroup(long metaGroupId) {
		return getService().createMetaGroup(metaGroupId);
	}

	public static MetaGroup CreateMetaGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String groupName, String type, Boolean active,
		java.util.Date inactiveDate) {

		return getService().CreateMetaGroup(
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
	public static MetaGroup deleteMetaGroup(long metaGroupId)
		throws PortalException {

		return getService().deleteMetaGroup(metaGroupId);
	}

	public static MetaGroup DeleteMetaGroup(long metaGroupId) {
		return getService().DeleteMetaGroup(metaGroupId);
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
	public static MetaGroup deleteMetaGroup(MetaGroup metaGroup) {
		return getService().deleteMetaGroup(metaGroup);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl</code>.
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

	public static MetaGroup fetchMetaGroup(long metaGroupId) {
		return getService().fetchMetaGroup(metaGroupId);
	}

	/**
	 * Returns the meta group matching the UUID and group.
	 *
	 * @param uuid the meta group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public static MetaGroup fetchMetaGroupByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMetaGroupByUuidAndGroupId(uuid, groupId);
	}

	public static List<MetaGroup> findByGroupAndProjectId(
		long groupId, long projectId) {

		return getService().findByGroupAndProjectId(groupId, projectId);
	}

	public static MetaGroup findByMetaGroupId(long metaGroupId) {
		return getService().findByMetaGroupId(metaGroupId);
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
	 * Returns the meta group with the primary key.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group
	 * @throws PortalException if a meta group with the primary key could not be found
	 */
	public static MetaGroup getMetaGroup(long metaGroupId)
		throws PortalException {

		return getService().getMetaGroup(metaGroupId);
	}

	/**
	 * Returns the meta group matching the UUID and group.
	 *
	 * @param uuid the meta group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta group
	 * @throws PortalException if a matching meta group could not be found
	 */
	public static MetaGroup getMetaGroupByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMetaGroupByUuidAndGroupId(uuid, groupId);
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
	public static List<MetaGroup> getMetaGroups(int start, int end) {
		return getService().getMetaGroups(start, end);
	}

	/**
	 * Returns all the meta groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta groups
	 * @param companyId the primary key of the company
	 * @return the matching meta groups, or an empty list if no matches were found
	 */
	public static List<MetaGroup> getMetaGroupsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMetaGroupsByUuidAndCompanyId(uuid, companyId);
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
	public static List<MetaGroup> getMetaGroupsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return getService().getMetaGroupsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meta groups.
	 *
	 * @return the number of meta groups
	 */
	public static int getMetaGroupsCount() {
		return getService().getMetaGroupsCount();
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

	public static void UpdateMetaGroup(
		long metaGroupId, int status, Long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String groupName, String type, Boolean active,
		java.util.Date inactiveDate) {

		getService().UpdateMetaGroup(
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
	public static MetaGroup updateMetaGroup(MetaGroup metaGroup) {
		return getService().updateMetaGroup(metaGroup);
	}

	public static MetaGroupLocalService getService() {
		return _service;
	}

	private static volatile MetaGroupLocalService _service;

}
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

import com.dhsoft.edc.backend.model.VisitGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for VisitGroup. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.VisitGroupLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VisitGroupLocalService
 * @generated
 */
public class VisitGroupLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.VisitGroupLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * ✅ 긴 버전 addVisitGroup (VisitEvent 스타일)
	 * 실제 create + set + persistence.update 수행.
	 * (ServiceBuilder Util에서 요구하는 시그니처와 동일하게 유지)
	 */
	public static VisitGroup addVisitGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, long expGroupId,
		String visitGroupCode, String name, String description,
		int activeStatus, java.util.Date activeDate) {

		return getService().addVisitGroup(
			companyId, groupId, projectId, userId, userName, status,
			statusByUserId, statusByUserName, statusDate, expGroupId,
			visitGroupCode, name, description, activeStatus, activeDate);
	}

	/**
	 * ✅ (방법 A) 짧은 버전 addVisitGroup
	 * ResourceCommand에서 편하게 쓰기 위한 오버로드.
	 * status / statusBy / statusDate / activeDate는 기본값으로 채움.
	 */
	public static VisitGroup addVisitGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, long expGroupId, String visitGroupCode, String name,
		String description, int activeStatus) {

		return getService().addVisitGroup(
			companyId, groupId, projectId, userId, userName, expGroupId,
			visitGroupCode, name, description, activeStatus);
	}

	/**
	 * Adds the visit group to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitGroup the visit group
	 * @return the visit group that was added
	 */
	public static VisitGroup addVisitGroup(VisitGroup visitGroup) {
		return getService().addVisitGroup(visitGroup);
	}

	/**
	 * Creates a new visit group with the primary key. Does not add the visit group to the database.
	 *
	 * @param visitGroupId the primary key for the new visit group
	 * @return the new visit group
	 */
	public static VisitGroup createVisitGroup(long visitGroupId) {
		return getService().createVisitGroup(visitGroupId);
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
	 * Deletes the visit group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group that was removed
	 * @throws PortalException if a visit group with the primary key could not be found
	 */
	public static VisitGroup deleteVisitGroup(long visitGroupId)
		throws PortalException {

		return getService().deleteVisitGroup(visitGroupId);
	}

	/**
	 * Deletes the visit group from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitGroup the visit group
	 * @return the visit group that was removed
	 */
	public static VisitGroup deleteVisitGroup(VisitGroup visitGroup) {
		return getService().deleteVisitGroup(visitGroup);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitGroupModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitGroupModelImpl</code>.
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

	public static VisitGroup fetchVisitGroup(long visitGroupId) {
		return getService().fetchVisitGroup(visitGroupId);
	}

	/**
	 * Returns the visit group matching the UUID and group.
	 *
	 * @param uuid the visit group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public static VisitGroup fetchVisitGroupByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchVisitGroupByUuidAndGroupId(uuid, groupId);
	}

	public static List<VisitGroup> findByG_P(long groupId, long projectId) {
		return getService().findByG_P(groupId, projectId);
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
	 * Returns the visit group with the primary key.
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group
	 * @throws PortalException if a visit group with the primary key could not be found
	 */
	public static VisitGroup getVisitGroup(long visitGroupId)
		throws PortalException {

		return getService().getVisitGroup(visitGroupId);
	}

	/**
	 * Returns the visit group matching the UUID and group.
	 *
	 * @param uuid the visit group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit group
	 * @throws PortalException if a matching visit group could not be found
	 */
	public static VisitGroup getVisitGroupByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getVisitGroupByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the visit groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of visit groups
	 */
	public static List<VisitGroup> getVisitGroups(int start, int end) {
		return getService().getVisitGroups(start, end);
	}

	/**
	 * Returns all the visit groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit groups
	 * @param companyId the primary key of the company
	 * @return the matching visit groups, or an empty list if no matches were found
	 */
	public static List<VisitGroup> getVisitGroupsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getVisitGroupsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of visit groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit groups
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching visit groups, or an empty list if no matches were found
	 */
	public static List<VisitGroup> getVisitGroupsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitGroup> orderByComparator) {

		return getService().getVisitGroupsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of visit groups.
	 *
	 * @return the number of visit groups
	 */
	public static int getVisitGroupsCount() {
		return getService().getVisitGroupsCount();
	}

	public static VisitGroup updateVisitGroup(
			long visitGroupId, long expGroupId, String visitGroupCode,
			String name, String description, int activeStatus)
		throws com.dhsoft.edc.backend.exception.NoSuchVisitGroupException {

		return getService().updateVisitGroup(
			visitGroupId, expGroupId, visitGroupCode, name, description,
			activeStatus);
	}

	/**
	 * Updates the visit group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitGroupLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitGroup the visit group
	 * @return the visit group that was updated
	 */
	public static VisitGroup updateVisitGroup(VisitGroup visitGroup) {
		return getService().updateVisitGroup(visitGroup);
	}

	public static VisitGroupLocalService getService() {
		return _service;
	}

	private static volatile VisitGroupLocalService _service;

}
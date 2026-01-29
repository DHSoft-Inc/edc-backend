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

import com.dhsoft.edc.backend.model.EdcLock;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EdcLock. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.EdcLockLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EdcLockLocalService
 * @generated
 */
public class EdcLockLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.EdcLockLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the edc lock to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcLockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcLock the edc lock
	 * @return the edc lock that was added
	 */
	public static EdcLock addEdcLock(EdcLock edcLock) {
		return getService().addEdcLock(edcLock);
	}

	public static EdcLock addLock(
		long companyId, long groupId, long projectId, long classNameId,
		long classPK, String lockType, long userId, String userName,
		String comment) {

		return getService().addLock(
			companyId, groupId, projectId, classNameId, classPK, lockType,
			userId, userName, comment);
	}

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	public static EdcLock createEdcLock(long lockId) {
		return getService().createEdcLock(lockId);
	}

	/**
	 * Deletes the edc lock from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcLockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcLock the edc lock
	 * @return the edc lock that was removed
	 */
	public static EdcLock deleteEdcLock(EdcLock edcLock) {
		return getService().deleteEdcLock(edcLock);
	}

	/**
	 * Deletes the edc lock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcLockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock that was removed
	 * @throws PortalException if a edc lock with the primary key could not be found
	 */
	public static EdcLock deleteEdcLock(long lockId) throws PortalException {
		return getService().deleteEdcLock(lockId);
	}

	public static EdcLock deleteLock(long lockId) throws Exception {
		return getService().deleteLock(lockId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcLockModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcLockModelImpl</code>.
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

	public static EdcLock fetchEdcLock(long lockId) {
		return getService().fetchEdcLock(lockId);
	}

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	public static EdcLock fetchEdcLockByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEdcLockByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<EdcLock> getAll() {
		return getService().getAll();
	}

	/**
	 * Returns the edc lock with the primary key.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws PortalException if a edc lock with the primary key could not be found
	 */
	public static EdcLock getEdcLock(long lockId) throws PortalException {
		return getService().getEdcLock(lockId);
	}

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock
	 * @throws PortalException if a matching edc lock could not be found
	 */
	public static EdcLock getEdcLockByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getEdcLockByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of edc locks
	 */
	public static List<EdcLock> getEdcLocks(int start, int end) {
		return getService().getEdcLocks(start, end);
	}

	/**
	 * Returns all the edc locks matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc locks
	 * @param companyId the primary key of the company
	 * @return the matching edc locks, or an empty list if no matches were found
	 */
	public static List<EdcLock> getEdcLocksByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getEdcLocksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of edc locks matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc locks
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching edc locks, or an empty list if no matches were found
	 */
	public static List<EdcLock> getEdcLocksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return getService().getEdcLocksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	public static int getEdcLocksCount() {
		return getService().getEdcLocksCount();
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
	 * Updates the edc lock in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcLockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcLock the edc lock
	 * @return the edc lock that was updated
	 */
	public static EdcLock updateEdcLock(EdcLock edcLock) {
		return getService().updateEdcLock(edcLock);
	}

	public static EdcLock updateLock(
			long lockId, String lockType, String comment)
		throws Exception {

		return getService().updateLock(lockId, lockType, comment);
	}

	public static EdcLockLocalService getService() {
		return _service;
	}

	private static volatile EdcLockLocalService _service;

}
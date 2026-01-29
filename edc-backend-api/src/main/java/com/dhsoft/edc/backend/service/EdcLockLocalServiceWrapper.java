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
 * Provides a wrapper for {@link EdcLockLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EdcLockLocalService
 * @generated
 */
public class EdcLockLocalServiceWrapper
	implements EdcLockLocalService, ServiceWrapper<EdcLockLocalService> {

	public EdcLockLocalServiceWrapper(EdcLockLocalService edcLockLocalService) {
		_edcLockLocalService = edcLockLocalService;
	}

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
	@Override
	public com.dhsoft.edc.backend.model.EdcLock addEdcLock(
		com.dhsoft.edc.backend.model.EdcLock edcLock) {

		return _edcLockLocalService.addEdcLock(edcLock);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcLock addLock(
		long companyId, long groupId, long projectId, long classNameId,
		long classPK, String lockType, long userId, String userName,
		String comment) {

		return _edcLockLocalService.addLock(
			companyId, groupId, projectId, classNameId, classPK, lockType,
			userId, userName, comment);
	}

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcLock createEdcLock(long lockId) {
		return _edcLockLocalService.createEdcLock(lockId);
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
	@Override
	public com.dhsoft.edc.backend.model.EdcLock deleteEdcLock(
		com.dhsoft.edc.backend.model.EdcLock edcLock) {

		return _edcLockLocalService.deleteEdcLock(edcLock);
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
	@Override
	public com.dhsoft.edc.backend.model.EdcLock deleteEdcLock(long lockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcLockLocalService.deleteEdcLock(lockId);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcLock deleteLock(long lockId)
		throws Exception {

		return _edcLockLocalService.deleteLock(lockId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcLockLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _edcLockLocalService.dynamicQuery();
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

		return _edcLockLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _edcLockLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _edcLockLocalService.dynamicQuery(
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

		return _edcLockLocalService.dynamicQueryCount(dynamicQuery);
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

		return _edcLockLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcLock fetchEdcLock(long lockId) {
		return _edcLockLocalService.fetchEdcLock(lockId);
	}

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcLock fetchEdcLockByUuidAndGroupId(
		String uuid, long groupId) {

		return _edcLockLocalService.fetchEdcLockByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _edcLockLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcLock> getAll() {
		return _edcLockLocalService.getAll();
	}

	/**
	 * Returns the edc lock with the primary key.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws PortalException if a edc lock with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcLock getEdcLock(long lockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcLockLocalService.getEdcLock(lockId);
	}

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock
	 * @throws PortalException if a matching edc lock could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.EdcLock getEdcLockByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcLockLocalService.getEdcLockByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcLock> getEdcLocks(
		int start, int end) {

		return _edcLockLocalService.getEdcLocks(start, end);
	}

	/**
	 * Returns all the edc locks matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc locks
	 * @param companyId the primary key of the company
	 * @return the matching edc locks, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcLock>
		getEdcLocksByUuidAndCompanyId(String uuid, long companyId) {

		return _edcLockLocalService.getEdcLocksByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.EdcLock>
		getEdcLocksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.EdcLock> orderByComparator) {

		return _edcLockLocalService.getEdcLocksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	@Override
	public int getEdcLocksCount() {
		return _edcLockLocalService.getEdcLocksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _edcLockLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _edcLockLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _edcLockLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _edcLockLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.dhsoft.edc.backend.model.EdcLock updateEdcLock(
		com.dhsoft.edc.backend.model.EdcLock edcLock) {

		return _edcLockLocalService.updateEdcLock(edcLock);
	}

	@Override
	public com.dhsoft.edc.backend.model.EdcLock updateLock(
			long lockId, String lockType, String comment)
		throws Exception {

		return _edcLockLocalService.updateLock(lockId, lockType, comment);
	}

	@Override
	public EdcLockLocalService getWrappedService() {
		return _edcLockLocalService;
	}

	@Override
	public void setWrappedService(EdcLockLocalService edcLockLocalService) {
		_edcLockLocalService = edcLockLocalService;
	}

	private EdcLockLocalService _edcLockLocalService;

}
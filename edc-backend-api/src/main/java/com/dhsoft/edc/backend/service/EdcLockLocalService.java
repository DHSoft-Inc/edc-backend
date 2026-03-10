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

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for EdcLock. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see EdcLockLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface EdcLockLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.EdcLockLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the edc lock local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link EdcLockLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public EdcLock addEdcLock(EdcLock edcLock);

	public EdcLock addLock(
		long companyId, long groupId, long projectId, long classNameId,
		long classPK, String lockType, long userId, String userName,
		String comment);

	public EdcLock addLock(
		long companyId, long groupId, long projectId, long classNameId,
		long classPK, String lockType, long userId, String userName,
		String comment, Date startDate, Date endDate);

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	@Transactional(enabled = false)
	public EdcLock createEdcLock(long lockId);

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
	@Indexable(type = IndexableType.DELETE)
	public EdcLock deleteEdcLock(EdcLock edcLock);

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
	@Indexable(type = IndexableType.DELETE)
	public EdcLock deleteEdcLock(long lockId) throws PortalException;

	public EdcLock deleteLock(long lockId) throws Exception;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public EdcLock fetchEdcLock(long lockId);

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public EdcLock fetchEdcLockByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EdcLock> getAll();

	/**
	 * Returns the edc lock with the primary key.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws PortalException if a edc lock with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public EdcLock getEdcLock(long lockId) throws PortalException;

	/**
	 * Returns the edc lock matching the UUID and group.
	 *
	 * @param uuid the edc lock's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc lock
	 * @throws PortalException if a matching edc lock could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public EdcLock getEdcLockByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EdcLock> getEdcLocks(int start, int end);

	/**
	 * Returns all the edc locks matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc locks
	 * @param companyId the primary key of the company
	 * @return the matching edc locks, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EdcLock> getEdcLocksByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EdcLock> getEdcLocksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator);

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getEdcLocksCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public EdcLock updateEdcLock(EdcLock edcLock);

	public EdcLock updateLock(long lockId, String lockType, String comment)
		throws Exception;

	public EdcLock updateLock(
			long lockId, String lockType, String comment, Date startDate,
			Date endDate)
		throws Exception;

}
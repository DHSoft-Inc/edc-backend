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

import com.dhsoft.edc.backend.exception.NoSuchVisitGroupException;
import com.dhsoft.edc.backend.model.VisitGroup;

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
 * Provides the local service interface for VisitGroup. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VisitGroupLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface VisitGroupLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.VisitGroupLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the visit group local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link VisitGroupLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * ✅ 긴 버전 addVisitGroup (VisitEvent 스타일)
	 * 실제 create + set + persistence.update 수행.
	 * (ServiceBuilder Util에서 요구하는 시그니처와 동일하게 유지)
	 */
	public VisitGroup addVisitGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, Date statusDate, long expGroupId,
		String visitGroupCode, String name, String description,
		int activeStatus, Date activeDate);

	/**
	 * ✅ (방법 A) 짧은 버전 addVisitGroup
	 * ResourceCommand에서 편하게 쓰기 위한 오버로드.
	 * status / statusBy / statusDate / activeDate는 기본값으로 채움.
	 */
	public VisitGroup addVisitGroup(
		long companyId, long groupId, long projectId, long userId,
		String userName, long expGroupId, String visitGroupCode, String name,
		String description, int activeStatus);

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
	@Indexable(type = IndexableType.REINDEX)
	public VisitGroup addVisitGroup(VisitGroup visitGroup);

	/**
	 * Creates a new visit group with the primary key. Does not add the visit group to the database.
	 *
	 * @param visitGroupId the primary key for the new visit group
	 * @return the new visit group
	 */
	@Transactional(enabled = false)
	public VisitGroup createVisitGroup(long visitGroupId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public VisitGroup deleteVisitGroup(long visitGroupId)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public VisitGroup deleteVisitGroup(VisitGroup visitGroup);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitGroupModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitGroupModelImpl</code>.
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
	public VisitGroup fetchVisitGroup(long visitGroupId);

	/**
	 * Returns the visit group matching the UUID and group.
	 *
	 * @param uuid the visit group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitGroup fetchVisitGroupByUuidAndGroupId(
		String uuid, long groupId);

	public List<VisitGroup> findByG_P(long groupId, long projectId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

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
	 * Returns the visit group with the primary key.
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group
	 * @throws PortalException if a visit group with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitGroup getVisitGroup(long visitGroupId) throws PortalException;

	/**
	 * Returns the visit group matching the UUID and group.
	 *
	 * @param uuid the visit group's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit group
	 * @throws PortalException if a matching visit group could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitGroup getVisitGroupByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitGroup> getVisitGroups(int start, int end);

	/**
	 * Returns all the visit groups matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit groups
	 * @param companyId the primary key of the company
	 * @return the matching visit groups, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitGroup> getVisitGroupsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitGroup> getVisitGroupsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitGroup> orderByComparator);

	/**
	 * Returns the number of visit groups.
	 *
	 * @return the number of visit groups
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVisitGroupsCount();

	public VisitGroup updateVisitGroup(
			long visitGroupId, long expGroupId, String visitGroupCode,
			String name, String description, int activeStatus)
		throws NoSuchVisitGroupException;

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
	@Indexable(type = IndexableType.REINDEX)
	public VisitGroup updateVisitGroup(VisitGroup visitGroup);

}
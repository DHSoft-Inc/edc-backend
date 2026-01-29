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

import com.dhsoft.edc.backend.model.VisitEvent;

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
 * Provides the local service interface for VisitEvent. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VisitEventLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface VisitEventLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.VisitEventLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the visit event local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link VisitEventLocalServiceUtil} if injection and service tracking are not available.
	 */
	public void addVisitEvent(
		long companyId, long groupId, long projectId, long institutionId,
		long subjectId, long subjectVisitDefinitionId, int status,
		long statusByUserId, String statusByUserName, Date statusDate,
		String anchorType, Date anchorDate, int offset, Date planDate);

	/**
	 * Adds the visit event to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitEvent the visit event
	 * @return the visit event that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public VisitEvent addVisitEvent(VisitEvent visitEvent);

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	@Transactional(enabled = false)
	public VisitEvent createVisitEvent(long visitEventId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the visit event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event that was removed
	 * @throws PortalException if a visit event with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public VisitEvent deleteVisitEvent(long visitEventId)
		throws PortalException;

	/**
	 * Deletes the visit event from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitEvent the visit event
	 * @return the visit event that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public VisitEvent deleteVisitEvent(VisitEvent visitEvent);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitEventModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitEventModelImpl</code>.
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
	public VisitEvent fetchVisitEvent(long visitEventId);

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitEvent fetchVisitEventByUuidAndGroupId(
		String uuid, long groupId);

	public List<VisitEvent> findBySubjectId(long subjectId);

	public List<VisitEvent> findBySubjectIdAndSubjectVisitDefinitionId(
		long subjectId, long subjectVisitDefinitionId);

	/**
	 * ✅ 기존 이름도 유지(호환)
	 * (실제로는 VD가 아니라 SVD ID지만, persistence finder 이름이 S_VD라 그대로 둠)
	 */
	public List<VisitEvent> findBySubjectIdAndVisitDefinitionId(
		long subjectId, long visitDefinitionId);

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
	 * Returns the visit event with the primary key.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws PortalException if a visit event with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitEvent getVisitEvent(long visitEventId) throws PortalException;

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event
	 * @throws PortalException if a matching visit event could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VisitEvent getVisitEventByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of visit events
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitEvent> getVisitEvents(int start, int end);

	/**
	 * Returns all the visit events matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit events
	 * @param companyId the primary key of the company
	 * @return the matching visit events, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitEvent> getVisitEventsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of visit events matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit events
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching visit events, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VisitEvent> getVisitEventsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator);

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVisitEventsCount();

	/**
	 * ✅ 기존 시그니처 유지(호환):
	 * 이제부터 이 visitDefinitionId 파라미터는 "svdId"로 간주한다.
	 */
	public VisitEvent saveOrUpdateVisitEvent(
		long subjectId, long visitDefinitionId, String anchorType, int offset,
		Date anchorDate, Date planDate);

	public VisitEvent saveOrUpdateVisitEventBySvdId(
		long subjectId, long subjectVisitDefinitionId, String anchorType,
		int offset, Date anchorDate, Date planDate);

	public void updateCRFData(long visitEventId, long structuredDataId);

	public void updateEventDate(
		long visitEventId, Date eventDate, String deviationStatus);

	/**
	 * Updates the visit event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitEvent the visit event
	 * @return the visit event that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public VisitEvent updateVisitEvent(VisitEvent visitEvent);

}
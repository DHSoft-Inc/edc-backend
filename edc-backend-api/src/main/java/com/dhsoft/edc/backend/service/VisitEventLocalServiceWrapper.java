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
 * Provides a wrapper for {@link VisitEventLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VisitEventLocalService
 * @generated
 */
public class VisitEventLocalServiceWrapper
	implements ServiceWrapper<VisitEventLocalService>, VisitEventLocalService {

	public VisitEventLocalServiceWrapper(
		VisitEventLocalService visitEventLocalService) {

		_visitEventLocalService = visitEventLocalService;
	}

	@Override
	public void addVisitEvent(
		long companyId, long groupId, long projectId, long institutionId,
		long subjectId, long subjectVisitDefinitionId, int status,
		long statusByUserId, String statusByUserName, java.util.Date statusDate,
		String anchorType, java.util.Date anchorDate, int offset,
		java.util.Date planDate) {

		_visitEventLocalService.addVisitEvent(
			companyId, groupId, projectId, institutionId, subjectId,
			subjectVisitDefinitionId, status, statusByUserId, statusByUserName,
			statusDate, anchorType, anchorDate, offset, planDate);
	}

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
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent addVisitEvent(
		com.dhsoft.edc.backend.model.VisitEvent visitEvent) {

		return _visitEventLocalService.addVisitEvent(visitEvent);
	}

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent createVisitEvent(
		long visitEventId) {

		return _visitEventLocalService.createVisitEvent(visitEventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitEventLocalService.deletePersistedModel(persistedModel);
	}

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
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent deleteVisitEvent(
			long visitEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitEventLocalService.deleteVisitEvent(visitEventId);
	}

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
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent deleteVisitEvent(
		com.dhsoft.edc.backend.model.VisitEvent visitEvent) {

		return _visitEventLocalService.deleteVisitEvent(visitEvent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _visitEventLocalService.dynamicQuery();
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

		return _visitEventLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _visitEventLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _visitEventLocalService.dynamicQuery(
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

		return _visitEventLocalService.dynamicQueryCount(dynamicQuery);
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

		return _visitEventLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.VisitEvent fetchVisitEvent(
		long visitEventId) {

		return _visitEventLocalService.fetchVisitEvent(visitEventId);
	}

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent
		fetchVisitEventByUuidAndGroupId(String uuid, long groupId) {

		return _visitEventLocalService.fetchVisitEventByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitEvent>
		findBySubjectId(long subjectId) {

		return _visitEventLocalService.findBySubjectId(subjectId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitEvent>
		findBySubjectIdAndSubjectVisitDefinitionId(
			long subjectId, long subjectVisitDefinitionId) {

		return _visitEventLocalService.
			findBySubjectIdAndSubjectVisitDefinitionId(
				subjectId, subjectVisitDefinitionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _visitEventLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _visitEventLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _visitEventLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _visitEventLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitEventLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the visit event with the primary key.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws PortalException if a visit event with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent getVisitEvent(
			long visitEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitEventLocalService.getVisitEvent(visitEventId);
	}

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event
	 * @throws PortalException if a matching visit event could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent
			getVisitEventByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitEventLocalService.getVisitEventByUuidAndGroupId(
			uuid, groupId);
	}

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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitEvent>
		getVisitEvents(int start, int end) {

		return _visitEventLocalService.getVisitEvents(start, end);
	}

	/**
	 * Returns all the visit events matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit events
	 * @param companyId the primary key of the company
	 * @return the matching visit events, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitEvent>
		getVisitEventsByUuidAndCompanyId(String uuid, long companyId) {

		return _visitEventLocalService.getVisitEventsByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitEvent>
		getVisitEventsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.VisitEvent> orderByComparator) {

		return _visitEventLocalService.getVisitEventsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	@Override
	public int getVisitEventsCount() {
		return _visitEventLocalService.getVisitEventsCount();
	}

	@Override
	public com.dhsoft.edc.backend.model.VisitEvent saveOrUpdateVisitEvent(
		long subjectId, long visitDefinitionId, String anchorType, int offset,
		java.util.Date anchorDate, java.util.Date planDate) {

		return _visitEventLocalService.saveOrUpdateVisitEvent(
			subjectId, visitDefinitionId, anchorType, offset, anchorDate,
			planDate);
	}

	@Override
	public com.dhsoft.edc.backend.model.VisitEvent
		saveOrUpdateVisitEventBySvdId(
			long subjectId, long subjectVisitDefinitionId, String anchorType,
			int offset, java.util.Date anchorDate, java.util.Date planDate) {

		return _visitEventLocalService.saveOrUpdateVisitEventBySvdId(
			subjectId, subjectVisitDefinitionId, anchorType, offset, anchorDate,
			planDate);
	}

	@Override
	public void updateCRFData(long visitEventId, long structuredDataId) {
		_visitEventLocalService.updateCRFData(visitEventId, structuredDataId);
	}

	@Override
	public void updateEventDate(
		long visitEventId, java.util.Date eventDate, String deviationStatus) {

		_visitEventLocalService.updateEventDate(
			visitEventId, eventDate, deviationStatus);
	}

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
	@Override
	public com.dhsoft.edc.backend.model.VisitEvent updateVisitEvent(
		com.dhsoft.edc.backend.model.VisitEvent visitEvent) {

		return _visitEventLocalService.updateVisitEvent(visitEvent);
	}

	@Override
	public VisitEventLocalService getWrappedService() {
		return _visitEventLocalService;
	}

	@Override
	public void setWrappedService(
		VisitEventLocalService visitEventLocalService) {

		_visitEventLocalService = visitEventLocalService;
	}

	private VisitEventLocalService _visitEventLocalService;

}
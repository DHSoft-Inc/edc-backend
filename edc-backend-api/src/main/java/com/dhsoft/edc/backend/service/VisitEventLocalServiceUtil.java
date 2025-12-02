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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for VisitEvent. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.VisitEventLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VisitEventLocalService
 * @generated
 */
public class VisitEventLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.VisitEventLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static void addVisitEvent(
		long companyId, long groupId, long projectId, long institutionId,
		long subjectId, long visitDefinitionId, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String anchorType,
		java.util.Date anchorDate, int offset, java.util.Date planDate) {

		getService().addVisitEvent(
			companyId, groupId, projectId, institutionId, subjectId,
			visitDefinitionId, status, statusByUserId, statusByUserName,
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
	public static VisitEvent addVisitEvent(VisitEvent visitEvent) {
		return getService().addVisitEvent(visitEvent);
	}

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	public static VisitEvent createVisitEvent(long visitEventId) {
		return getService().createVisitEvent(visitEventId);
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
	public static VisitEvent deleteVisitEvent(long visitEventId)
		throws PortalException {

		return getService().deleteVisitEvent(visitEventId);
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
	public static VisitEvent deleteVisitEvent(VisitEvent visitEvent) {
		return getService().deleteVisitEvent(visitEvent);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitEventModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitEventModelImpl</code>.
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

	public static VisitEvent fetchVisitEvent(long visitEventId) {
		return getService().fetchVisitEvent(visitEventId);
	}

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public static VisitEvent fetchVisitEventByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchVisitEventByUuidAndGroupId(uuid, groupId);
	}

	public static List<VisitEvent> findBySubjectId(long subjectId) {
		return getService().findBySubjectId(subjectId);
	}

	public static List<VisitEvent> findBySubjectIdAndVisitDefinitionId(
		long subjectId, long visitDefinitionId) {

		return getService().findBySubjectIdAndVisitDefinitionId(
			subjectId, visitDefinitionId);
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
	 * Returns the visit event with the primary key.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws PortalException if a visit event with the primary key could not be found
	 */
	public static VisitEvent getVisitEvent(long visitEventId)
		throws PortalException {

		return getService().getVisitEvent(visitEventId);
	}

	/**
	 * Returns the visit event matching the UUID and group.
	 *
	 * @param uuid the visit event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit event
	 * @throws PortalException if a matching visit event could not be found
	 */
	public static VisitEvent getVisitEventByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getVisitEventByUuidAndGroupId(uuid, groupId);
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
	public static List<VisitEvent> getVisitEvents(int start, int end) {
		return getService().getVisitEvents(start, end);
	}

	/**
	 * Returns all the visit events matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit events
	 * @param companyId the primary key of the company
	 * @return the matching visit events, or an empty list if no matches were found
	 */
	public static List<VisitEvent> getVisitEventsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getVisitEventsByUuidAndCompanyId(uuid, companyId);
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
	public static List<VisitEvent> getVisitEventsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return getService().getVisitEventsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	public static int getVisitEventsCount() {
		return getService().getVisitEventsCount();
	}

	public static VisitEvent saveOrUpdateVisitEvent(
		long subjectId, long visitDefinitionId, String anchorType, int offset,
		java.util.Date anchorDate, java.util.Date planDate) {

		return getService().saveOrUpdateVisitEvent(
			subjectId, visitDefinitionId, anchorType, offset, anchorDate,
			planDate);
	}

	public static void updateCRFData(long visitEventId, long structuredDataId) {
		getService().updateCRFData(visitEventId, structuredDataId);
	}

	public static void updateEventDate(
		long visitEventId, java.util.Date eventDate, String deviationStatus) {

		getService().updateEventDate(visitEventId, eventDate, deviationStatus);
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
	public static VisitEvent updateVisitEvent(VisitEvent visitEvent) {
		return getService().updateVisitEvent(visitEvent);
	}

	public static VisitEventLocalService getService() {
		return _service;
	}

	private static volatile VisitEventLocalService _service;

}
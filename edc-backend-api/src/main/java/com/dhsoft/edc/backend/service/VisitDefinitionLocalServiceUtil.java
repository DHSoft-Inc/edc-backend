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

import com.dhsoft.edc.backend.model.VisitDefinition;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for VisitDefinition. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.VisitDefinitionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VisitDefinitionLocalService
 * @generated
 */
public class VisitDefinitionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.VisitDefinitionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the visit definition to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitDefinition the visit definition
	 * @return the visit definition that was added
	 */
	public static VisitDefinition addVisitDefinition(
		VisitDefinition visitDefinition) {

		return getService().addVisitDefinition(visitDefinition);
	}

	/**
	 * ADD: VisitDefinition 생성
	 */
	public static VisitDefinition addVisitDefinitionForGroup(
			long companyId, long groupId, long userId, String userName,
			long experimentalGroupId, String name, String anchorType,
			int offset, int windowMinus, int windowPlus)
		throws PortalException {

		return getService().addVisitDefinitionForGroup(
			companyId, groupId, userId, userName, experimentalGroupId, name,
			anchorType, offset, windowMinus, windowPlus);
	}

	/**
	 * Creates a new visit definition with the primary key. Does not add the visit definition to the database.
	 *
	 * @param visitDefinitionId the primary key for the new visit definition
	 * @return the new visit definition
	 */
	public static VisitDefinition createVisitDefinition(
		long visitDefinitionId) {

		return getService().createVisitDefinition(visitDefinitionId);
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
	 * Deletes the visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition that was removed
	 * @throws PortalException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition deleteVisitDefinition(long visitDefinitionId)
		throws PortalException {

		return getService().deleteVisitDefinition(visitDefinitionId);
	}

	/**
	 * Deletes the visit definition from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitDefinition the visit definition
	 * @return the visit definition that was removed
	 */
	public static VisitDefinition deleteVisitDefinition(
		VisitDefinition visitDefinition) {

		return getService().deleteVisitDefinition(visitDefinition);
	}

	/**
	 * DELETE
	 */
	public static VisitDefinition deleteVisitDefinitionById(
			long visitDefinitionId)
		throws PortalException {

		return getService().deleteVisitDefinitionById(visitDefinitionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitDefinitionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitDefinitionModelImpl</code>.
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

	public static VisitDefinition fetchVisitDefinition(long visitDefinitionId) {
		return getService().fetchVisitDefinition(visitDefinitionId);
	}

	/**
	 * Returns the visit definition matching the UUID and group.
	 *
	 * @param uuid the visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public static VisitDefinition fetchVisitDefinitionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchVisitDefinitionByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * GET: 실험군 ID로 visitDefinition 가져오기
	 * experimentalGroupId → expCode → visitDefinitionCode
	 */
	public static List<VisitDefinition> getByExperimentalGroup(
			long experimentalGroupId)
		throws PortalException {

		return getService().getByExperimentalGroup(experimentalGroupId);
	}

	public static List<VisitDefinition> getByVisitDefinitionCode(
		String visitDefinitionCode) {

		return getService().getByVisitDefinitionCode(visitDefinitionCode);
	}

	public static List<VisitDefinition> getByVisitGroupId(long visitGroupId) {
		return getService().getByVisitGroupId(visitGroupId);
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
	 * Returns the visit definition with the primary key.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition
	 * @throws PortalException if a visit definition with the primary key could not be found
	 */
	public static VisitDefinition getVisitDefinition(long visitDefinitionId)
		throws PortalException {

		return getService().getVisitDefinition(visitDefinitionId);
	}

	/**
	 * Returns the visit definition matching the UUID and group.
	 *
	 * @param uuid the visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit definition
	 * @throws PortalException if a matching visit definition could not be found
	 */
	public static VisitDefinition getVisitDefinitionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getVisitDefinitionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of visit definitions
	 */
	public static List<VisitDefinition> getVisitDefinitions(
		int start, int end) {

		return getService().getVisitDefinitions(start, end);
	}

	/**
	 * Returns all the visit definitions matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit definitions
	 * @param companyId the primary key of the company
	 * @return the matching visit definitions, or an empty list if no matches were found
	 */
	public static List<VisitDefinition> getVisitDefinitionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getVisitDefinitionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of visit definitions matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit definitions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching visit definitions, or an empty list if no matches were found
	 */
	public static List<VisitDefinition> getVisitDefinitionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return getService().getVisitDefinitionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of visit definitions.
	 *
	 * @return the number of visit definitions
	 */
	public static int getVisitDefinitionsCount() {
		return getService().getVisitDefinitionsCount();
	}

	/**
	 * Updates the visit definition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param visitDefinition the visit definition
	 * @return the visit definition that was updated
	 */
	public static VisitDefinition updateVisitDefinition(
		VisitDefinition visitDefinition) {

		return getService().updateVisitDefinition(visitDefinition);
	}

	/**
	 * UPDATE
	 */
	public static VisitDefinition updateVisitDefinitionBasic(
			long visitDefinitionId, String name, String anchorType, int offset,
			int windowMinus, int windowPlus)
		throws PortalException {

		return getService().updateVisitDefinitionBasic(
			visitDefinitionId, name, anchorType, offset, windowMinus,
			windowPlus);
	}

	public static VisitDefinition updateVisitDefinitionFull(
		long visitDefinitionId, String name, String anchorType, int offset,
		int windowMinus, int windowPlus) {

		return getService().updateVisitDefinitionFull(
			visitDefinitionId, name, anchorType, offset, windowMinus,
			windowPlus);
	}

	public static VisitDefinitionLocalService getService() {
		return _service;
	}

	private static volatile VisitDefinitionLocalService _service;

}
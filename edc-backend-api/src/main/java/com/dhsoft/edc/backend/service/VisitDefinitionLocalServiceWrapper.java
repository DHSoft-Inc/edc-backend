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
 * Provides a wrapper for {@link VisitDefinitionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VisitDefinitionLocalService
 * @generated
 */
public class VisitDefinitionLocalServiceWrapper
	implements ServiceWrapper<VisitDefinitionLocalService>,
			   VisitDefinitionLocalService {

	public VisitDefinitionLocalServiceWrapper(
		VisitDefinitionLocalService visitDefinitionLocalService) {

		_visitDefinitionLocalService = visitDefinitionLocalService;
	}

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
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition addVisitDefinition(
		com.dhsoft.edc.backend.model.VisitDefinition visitDefinition) {

		return _visitDefinitionLocalService.addVisitDefinition(visitDefinition);
	}

	/**
	 * Creates a new visit definition with the primary key. Does not add the visit definition to the database.
	 *
	 * @param visitDefinitionId the primary key for the new visit definition
	 * @return the new visit definition
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition createVisitDefinition(
		long visitDefinitionId) {

		return _visitDefinitionLocalService.createVisitDefinition(
			visitDefinitionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitDefinitionLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition deleteVisitDefinition(
			long visitDefinitionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitDefinitionLocalService.deleteVisitDefinition(
			visitDefinitionId);
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
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition deleteVisitDefinition(
		com.dhsoft.edc.backend.model.VisitDefinition visitDefinition) {

		return _visitDefinitionLocalService.deleteVisitDefinition(
			visitDefinition);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _visitDefinitionLocalService.dynamicQuery();
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

		return _visitDefinitionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _visitDefinitionLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _visitDefinitionLocalService.dynamicQuery(
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

		return _visitDefinitionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _visitDefinitionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition fetchVisitDefinition(
		long visitDefinitionId) {

		return _visitDefinitionLocalService.fetchVisitDefinition(
			visitDefinitionId);
	}

	/**
	 * Returns the visit definition matching the UUID and group.
	 *
	 * @param uuid the visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition
		fetchVisitDefinitionByUuidAndGroupId(String uuid, long groupId) {

		return _visitDefinitionLocalService.
			fetchVisitDefinitionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _visitDefinitionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _visitDefinitionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _visitDefinitionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _visitDefinitionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitDefinitionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the visit definition with the primary key.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition
	 * @throws PortalException if a visit definition with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition getVisitDefinition(
			long visitDefinitionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitDefinitionLocalService.getVisitDefinition(
			visitDefinitionId);
	}

	/**
	 * Returns the visit definition matching the UUID and group.
	 *
	 * @param uuid the visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching visit definition
	 * @throws PortalException if a matching visit definition could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition
			getVisitDefinitionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _visitDefinitionLocalService.getVisitDefinitionByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitDefinition>
		getVisitDefinitions(int start, int end) {

		return _visitDefinitionLocalService.getVisitDefinitions(start, end);
	}

	/**
	 * Returns all the visit definitions matching the UUID and company.
	 *
	 * @param uuid the UUID of the visit definitions
	 * @param companyId the primary key of the company
	 * @return the matching visit definitions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitDefinition>
		getVisitDefinitionsByUuidAndCompanyId(String uuid, long companyId) {

		return _visitDefinitionLocalService.
			getVisitDefinitionsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.VisitDefinition>
		getVisitDefinitionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.VisitDefinition>
					orderByComparator) {

		return _visitDefinitionLocalService.
			getVisitDefinitionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of visit definitions.
	 *
	 * @return the number of visit definitions
	 */
	@Override
	public int getVisitDefinitionsCount() {
		return _visitDefinitionLocalService.getVisitDefinitionsCount();
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
	@Override
	public com.dhsoft.edc.backend.model.VisitDefinition updateVisitDefinition(
		com.dhsoft.edc.backend.model.VisitDefinition visitDefinition) {

		return _visitDefinitionLocalService.updateVisitDefinition(
			visitDefinition);
	}

	@Override
	public VisitDefinitionLocalService getWrappedService() {
		return _visitDefinitionLocalService;
	}

	@Override
	public void setWrappedService(
		VisitDefinitionLocalService visitDefinitionLocalService) {

		_visitDefinitionLocalService = visitDefinitionLocalService;
	}

	private VisitDefinitionLocalService _visitDefinitionLocalService;

}
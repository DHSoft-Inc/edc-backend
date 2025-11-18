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
 * Provides a wrapper for {@link InstitutionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InstitutionLocalService
 * @generated
 */
public class InstitutionLocalServiceWrapper
	implements InstitutionLocalService,
			   ServiceWrapper<InstitutionLocalService> {

	public InstitutionLocalServiceWrapper(
		InstitutionLocalService institutionLocalService) {

		_institutionLocalService = institutionLocalService;
	}

	/**
	 * Adds the institution to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution addInstitution(
		com.dhsoft.edc.backend.model.Institution institution) {

		return _institutionLocalService.addInstitution(institution);
	}

	/**
	 * Creates a new institution with the primary key. Does not add the institution to the database.
	 *
	 * @param institutionId the primary key for the new institution
	 * @return the new institution
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution createInstitution(
		long institutionId) {

		return _institutionLocalService.createInstitution(institutionId);
	}

	/**
	 * Deletes the institution from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution deleteInstitution(
		com.dhsoft.edc.backend.model.Institution institution) {

		return _institutionLocalService.deleteInstitution(institution);
	}

	/**
	 * Deletes the institution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution that was removed
	 * @throws PortalException if a institution with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution deleteInstitution(
			long institutionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _institutionLocalService.deleteInstitution(institutionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _institutionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _institutionLocalService.dynamicQuery();
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

		return _institutionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
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

		return _institutionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
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

		return _institutionLocalService.dynamicQuery(
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

		return _institutionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _institutionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.Institution fetchInstitution(
		long institutionId) {

		return _institutionLocalService.fetchInstitution(institutionId);
	}

	/**
	 * Returns the institution matching the UUID and group.
	 *
	 * @param uuid the institution's UUID
	 * @param groupId the primary key of the group
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution
		fetchInstitutionByUuidAndGroupId(String uuid, long groupId) {

		return _institutionLocalService.fetchInstitutionByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _institutionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _institutionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _institutionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the institution with the primary key.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution
	 * @throws PortalException if a institution with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution getInstitution(
			long institutionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _institutionLocalService.getInstitution(institutionId);
	}

	/**
	 * Returns the institution matching the UUID and group.
	 *
	 * @param uuid the institution's UUID
	 * @param groupId the primary key of the group
	 * @return the matching institution
	 * @throws PortalException if a matching institution could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution
			getInstitutionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _institutionLocalService.getInstitutionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of institutions
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Institution>
		getInstitutions(int start, int end) {

		return _institutionLocalService.getInstitutions(start, end);
	}

	/**
	 * Returns all the institutions matching the UUID and company.
	 *
	 * @param uuid the UUID of the institutions
	 * @param companyId the primary key of the company
	 * @return the matching institutions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Institution>
		getInstitutionsByUuidAndCompanyId(String uuid, long companyId) {

		return _institutionLocalService.getInstitutionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of institutions matching the UUID and company.
	 *
	 * @param uuid the UUID of the institutions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching institutions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Institution>
		getInstitutionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.Institution> orderByComparator) {

		return _institutionLocalService.getInstitutionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of institutions.
	 *
	 * @return the number of institutions
	 */
	@Override
	public int getInstitutionsCount() {
		return _institutionLocalService.getInstitutionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _institutionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _institutionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the institution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstitutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institution the institution
	 * @return the institution that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.Institution updateInstitution(
		com.dhsoft.edc.backend.model.Institution institution) {

		return _institutionLocalService.updateInstitution(institution);
	}

	@Override
	public InstitutionLocalService getWrappedService() {
		return _institutionLocalService;
	}

	@Override
	public void setWrappedService(
		InstitutionLocalService institutionLocalService) {

		_institutionLocalService = institutionLocalService;
	}

	private InstitutionLocalService _institutionLocalService;

}
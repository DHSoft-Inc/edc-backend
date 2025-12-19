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
 * Provides a wrapper for {@link InstResearcherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InstResearcherLocalService
 * @generated
 */
public class InstResearcherLocalServiceWrapper
	implements InstResearcherLocalService,
			   ServiceWrapper<InstResearcherLocalService> {

	public InstResearcherLocalServiceWrapper(
		InstResearcherLocalService instResearcherLocalService) {

		_instResearcherLocalService = instResearcherLocalService;
	}

	/**
	 * Adds the inst researcher to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher addInstResearcher(
		com.dhsoft.edc.backend.model.InstResearcher instResearcher) {

		return _instResearcherLocalService.addInstResearcher(instResearcher);
	}

	/**
	 * Creates a new inst researcher with the primary key. Does not add the inst researcher to the database.
	 *
	 * @param institutionResearcherId the primary key for the new inst researcher
	 * @return the new inst researcher
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher createInstResearcher(
		long institutionResearcherId) {

		return _instResearcherLocalService.createInstResearcher(
			institutionResearcherId);
	}

	/**
	 * Deletes the inst researcher from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher deleteInstResearcher(
		com.dhsoft.edc.backend.model.InstResearcher instResearcher) {

		return _instResearcherLocalService.deleteInstResearcher(instResearcher);
	}

	/**
	 * Deletes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws PortalException if a inst researcher with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher deleteInstResearcher(
			long institutionResearcherId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instResearcherLocalService.deleteInstResearcher(
			institutionResearcherId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instResearcherLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _instResearcherLocalService.dynamicQuery();
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

		return _instResearcherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
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

		return _instResearcherLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
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

		return _instResearcherLocalService.dynamicQuery(
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

		return _instResearcherLocalService.dynamicQueryCount(dynamicQuery);
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

		return _instResearcherLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.InstResearcher fetchInstResearcher(
		long institutionResearcherId) {

		return _instResearcherLocalService.fetchInstResearcher(
			institutionResearcherId);
	}

	/**
	 * Returns the inst researcher matching the UUID and group.
	 *
	 * @param uuid the inst researcher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher
		fetchInstResearcherByUuidAndGroupId(String uuid, long groupId) {

		return _instResearcherLocalService.fetchInstResearcherByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.dhsoft.edc.backend.model.InstResearcher findByG_P_U(
		long groupId, long projectId, long userId) {

		return _instResearcherLocalService.findByG_P_U(
			groupId, projectId, userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _instResearcherLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _instResearcherLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _instResearcherLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the inst researcher with the primary key.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws PortalException if a inst researcher with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher getInstResearcher(
			long institutionResearcherId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instResearcherLocalService.getInstResearcher(
			institutionResearcherId);
	}

	/**
	 * Returns the inst researcher matching the UUID and group.
	 *
	 * @param uuid the inst researcher's UUID
	 * @param groupId the primary key of the group
	 * @return the matching inst researcher
	 * @throws PortalException if a matching inst researcher could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher
			getInstResearcherByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instResearcherLocalService.getInstResearcherByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of inst researchers
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstResearcher>
		getInstResearchers(int start, int end) {

		return _instResearcherLocalService.getInstResearchers(start, end);
	}

	/**
	 * Returns all the inst researchers matching the UUID and company.
	 *
	 * @param uuid the UUID of the inst researchers
	 * @param companyId the primary key of the company
	 * @return the matching inst researchers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstResearcher>
		getInstResearchersByUuidAndCompanyId(String uuid, long companyId) {

		return _instResearcherLocalService.getInstResearchersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of inst researchers matching the UUID and company.
	 *
	 * @param uuid the UUID of the inst researchers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching inst researchers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstResearcher>
		getInstResearchersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.InstResearcher>
					orderByComparator) {

		return _instResearcherLocalService.getInstResearchersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of inst researchers.
	 *
	 * @return the number of inst researchers
	 */
	@Override
	public int getInstResearchersCount() {
		return _instResearcherLocalService.getInstResearchersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _instResearcherLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instResearcherLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the inst researcher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstResearcherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instResearcher the inst researcher
	 * @return the inst researcher that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstResearcher updateInstResearcher(
		com.dhsoft.edc.backend.model.InstResearcher instResearcher) {

		return _instResearcherLocalService.updateInstResearcher(instResearcher);
	}

	@Override
	public InstResearcherLocalService getWrappedService() {
		return _instResearcherLocalService;
	}

	@Override
	public void setWrappedService(
		InstResearcherLocalService instResearcherLocalService) {

		_instResearcherLocalService = instResearcherLocalService;
	}

	private InstResearcherLocalService _instResearcherLocalService;

}
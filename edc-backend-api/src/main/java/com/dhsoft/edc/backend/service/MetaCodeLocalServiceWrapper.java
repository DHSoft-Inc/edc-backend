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
 * Provides a wrapper for {@link MetaCodeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MetaCodeLocalService
 * @generated
 */
public class MetaCodeLocalServiceWrapper
	implements MetaCodeLocalService, ServiceWrapper<MetaCodeLocalService> {

	public MetaCodeLocalServiceWrapper(
		MetaCodeLocalService metaCodeLocalService) {

		_metaCodeLocalService = metaCodeLocalService;
	}

	/**
	 * Adds the meta code to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaCodeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaCode the meta code
	 * @return the meta code that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode addMetaCode(
		com.dhsoft.edc.backend.model.MetaCode metaCode) {

		return _metaCodeLocalService.addMetaCode(metaCode);
	}

	/**
	 * Creates a new meta code with the primary key. Does not add the meta code to the database.
	 *
	 * @param metaCodeId the primary key for the new meta code
	 * @return the new meta code
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode createMetaCode(
		long metaCodeId) {

		return _metaCodeLocalService.createMetaCode(metaCodeId);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaCode CreateMetaCode(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String code, String label, String valueType, String value,
		Boolean active, java.util.Date inactiveDate) {

		return _metaCodeLocalService.CreateMetaCode(
			companyId, groupId, projectId, userId, userName, status,
			statusByUserId, statusByUserName, statusDate, groupCode, code,
			label, valueType, value, active, inactiveDate);
	}

	/**
	 * Deletes the meta code with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaCodeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code that was removed
	 * @throws PortalException if a meta code with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode deleteMetaCode(long metaCodeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaCodeLocalService.deleteMetaCode(metaCodeId);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaCode DeleteMetaCode(
		long metaCodeId) {

		return _metaCodeLocalService.DeleteMetaCode(metaCodeId);
	}

	/**
	 * Deletes the meta code from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaCodeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaCode the meta code
	 * @return the meta code that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode deleteMetaCode(
		com.dhsoft.edc.backend.model.MetaCode metaCode) {

		return _metaCodeLocalService.deleteMetaCode(metaCode);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaCodeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _metaCodeLocalService.dynamicQuery();
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

		return _metaCodeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaCodeModelImpl</code>.
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

		return _metaCodeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaCodeModelImpl</code>.
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

		return _metaCodeLocalService.dynamicQuery(
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

		return _metaCodeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _metaCodeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaCode fetchMetaCode(
		long metaCodeId) {

		return _metaCodeLocalService.fetchMetaCode(metaCodeId);
	}

	/**
	 * Returns the meta code matching the UUID and group.
	 *
	 * @param uuid the meta code's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode fetchMetaCodeByUuidAndGroupId(
		String uuid, long groupId) {

		return _metaCodeLocalService.fetchMetaCodeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode>
		findByGroupAndProjectId(long groupId, long projectId) {

		return _metaCodeLocalService.findByGroupAndProjectId(
			groupId, projectId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode>
		findByGroupCode(long groupId, long projectId, String groupCode) {

		return _metaCodeLocalService.findByGroupCode(
			groupId, projectId, groupCode);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode>
		findByGroupCodeAndCode(
			long groupId, long projectId, String groupCode, String code) {

		return _metaCodeLocalService.findByGroupCodeAndCode(
			groupId, projectId, groupCode, code);
	}

	@Override
	public com.dhsoft.edc.backend.model.MetaCode findByMetaCodeId(
		long metaCodeId) {

		return _metaCodeLocalService.findByMetaCodeId(metaCodeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _metaCodeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _metaCodeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _metaCodeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the meta code with the primary key.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code
	 * @throws PortalException if a meta code with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode getMetaCode(long metaCodeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaCodeLocalService.getMetaCode(metaCodeId);
	}

	/**
	 * Returns the meta code matching the UUID and group.
	 *
	 * @param uuid the meta code's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta code
	 * @throws PortalException if a matching meta code could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode getMetaCodeByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaCodeLocalService.getMetaCodeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of meta codes
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode> getMetaCodes(
		int start, int end) {

		return _metaCodeLocalService.getMetaCodes(start, end);
	}

	/**
	 * Returns all the meta codes matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta codes
	 * @param companyId the primary key of the company
	 * @return the matching meta codes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode>
		getMetaCodesByUuidAndCompanyId(String uuid, long companyId) {

		return _metaCodeLocalService.getMetaCodesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of meta codes matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta codes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching meta codes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.MetaCode>
		getMetaCodesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.MetaCode> orderByComparator) {

		return _metaCodeLocalService.getMetaCodesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meta codes.
	 *
	 * @return the number of meta codes
	 */
	@Override
	public int getMetaCodesCount() {
		return _metaCodeLocalService.getMetaCodesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _metaCodeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _metaCodeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void UpdateMetaCode(
		long metaCodeId, long groupId, long projectId, int status,
		long statusByUserId, String statusByUserName, java.util.Date statusDate,
		String groupCode, String code, String label, String valueType,
		String value, Boolean active, java.util.Date inactiveDate) {

		_metaCodeLocalService.UpdateMetaCode(
			metaCodeId, groupId, projectId, status, statusByUserId,
			statusByUserName, statusDate, groupCode, code, label, valueType,
			value, active, inactiveDate);
	}

	/**
	 * Updates the meta code in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MetaCodeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param metaCode the meta code
	 * @return the meta code that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.MetaCode updateMetaCode(
		com.dhsoft.edc.backend.model.MetaCode metaCode) {

		return _metaCodeLocalService.updateMetaCode(metaCode);
	}

	@Override
	public MetaCodeLocalService getWrappedService() {
		return _metaCodeLocalService;
	}

	@Override
	public void setWrappedService(MetaCodeLocalService metaCodeLocalService) {
		_metaCodeLocalService = metaCodeLocalService;
	}

	private MetaCodeLocalService _metaCodeLocalService;

}
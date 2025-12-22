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

import com.dhsoft.edc.backend.model.MetaCode;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MetaCode. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.MetaCodeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MetaCodeLocalService
 * @generated
 */
public class MetaCodeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.MetaCodeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MetaCode addMetaCode(MetaCode metaCode) {
		return getService().addMetaCode(metaCode);
	}

	/**
	 * Creates a new meta code with the primary key. Does not add the meta code to the database.
	 *
	 * @param metaCodeId the primary key for the new meta code
	 * @return the new meta code
	 */
	public static MetaCode createMetaCode(long metaCodeId) {
		return getService().createMetaCode(metaCodeId);
	}

	public static MetaCode CreateMetaCode(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, long statusByUserId,
		String statusByUserName, java.util.Date statusDate, String groupCode,
		String code, String label, String valueType, String value,
		Boolean active, java.util.Date inactiveDate) {

		return getService().CreateMetaCode(
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
	public static MetaCode deleteMetaCode(long metaCodeId)
		throws PortalException {

		return getService().deleteMetaCode(metaCodeId);
	}

	public static MetaCode DeleteMetaCode(long metaCodeId) {
		return getService().DeleteMetaCode(metaCodeId);
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
	public static MetaCode deleteMetaCode(MetaCode metaCode) {
		return getService().deleteMetaCode(metaCode);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaCodeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.MetaCodeModelImpl</code>.
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

	public static MetaCode fetchMetaCode(long metaCodeId) {
		return getService().fetchMetaCode(metaCodeId);
	}

	/**
	 * Returns the meta code matching the UUID and group.
	 *
	 * @param uuid the meta code's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public static MetaCode fetchMetaCodeByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMetaCodeByUuidAndGroupId(uuid, groupId);
	}

	public static List<MetaCode> findByGroupAndProjectId(
		long groupId, long projectId) {

		return getService().findByGroupAndProjectId(groupId, projectId);
	}

	public static List<MetaCode> findByGroupCode(
		long groupId, long projectId, String groupCode) {

		return getService().findByGroupCode(groupId, projectId, groupCode);
	}

	public static MetaCode findByMetaCodeId(long metaCodeId) {
		return getService().findByMetaCodeId(metaCodeId);
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
	 * Returns the meta code with the primary key.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code
	 * @throws PortalException if a meta code with the primary key could not be found
	 */
	public static MetaCode getMetaCode(long metaCodeId) throws PortalException {
		return getService().getMetaCode(metaCodeId);
	}

	/**
	 * Returns the meta code matching the UUID and group.
	 *
	 * @param uuid the meta code's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meta code
	 * @throws PortalException if a matching meta code could not be found
	 */
	public static MetaCode getMetaCodeByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMetaCodeByUuidAndGroupId(uuid, groupId);
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
	public static List<MetaCode> getMetaCodes(int start, int end) {
		return getService().getMetaCodes(start, end);
	}

	/**
	 * Returns all the meta codes matching the UUID and company.
	 *
	 * @param uuid the UUID of the meta codes
	 * @param companyId the primary key of the company
	 * @return the matching meta codes, or an empty list if no matches were found
	 */
	public static List<MetaCode> getMetaCodesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMetaCodesByUuidAndCompanyId(uuid, companyId);
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
	public static List<MetaCode> getMetaCodesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaCode> orderByComparator) {

		return getService().getMetaCodesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meta codes.
	 *
	 * @return the number of meta codes
	 */
	public static int getMetaCodesCount() {
		return getService().getMetaCodesCount();
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

	public static void UpdateMetaCode(
		long metaCodeId, long groupId, long projectId, int status,
		long statusByUserId, String statusByUserName, java.util.Date statusDate,
		String groupCode, String code, String label, String valueType,
		String value, Boolean active, java.util.Date inactiveDate) {

		getService().UpdateMetaCode(
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
	public static MetaCode updateMetaCode(MetaCode metaCode) {
		return getService().updateMetaCode(metaCode);
	}

	public static MetaCodeLocalService getService() {
		return _service;
	}

	private static volatile MetaCodeLocalService _service;

}
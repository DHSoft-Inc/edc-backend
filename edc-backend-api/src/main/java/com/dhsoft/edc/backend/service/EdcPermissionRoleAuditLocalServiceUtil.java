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

import com.dhsoft.edc.backend.model.EdcPermissionRoleAudit;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EdcPermissionRoleAudit. This utility wraps
 * <code>com.dhsoft.edc.backend.service.impl.EdcPermissionRoleAuditLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleAuditLocalService
 * @generated
 */
public class EdcPermissionRoleAuditLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dhsoft.edc.backend.service.impl.EdcPermissionRoleAuditLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the edc permission role audit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was added
	 */
	public static EdcPermissionRoleAudit addEdcPermissionRoleAudit(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return getService().addEdcPermissionRoleAudit(edcPermissionRoleAudit);
	}

	/**
	 * Creates a new edc permission role audit with the primary key. Does not add the edc permission role audit to the database.
	 *
	 * @param auditRoleId the primary key for the new edc permission role audit
	 * @return the new edc permission role audit
	 */
	public static EdcPermissionRoleAudit createEdcPermissionRoleAudit(
		long auditRoleId) {

		return getService().createEdcPermissionRoleAudit(auditRoleId);
	}

	/**
	 * Deletes the edc permission role audit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was removed
	 */
	public static EdcPermissionRoleAudit deleteEdcPermissionRoleAudit(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return getService().deleteEdcPermissionRoleAudit(
			edcPermissionRoleAudit);
	}

	/**
	 * Deletes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws PortalException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit deleteEdcPermissionRoleAudit(
			long auditRoleId)
		throws PortalException {

		return getService().deleteEdcPermissionRoleAudit(auditRoleId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
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

	public static EdcPermissionRoleAudit fetchEdcPermissionRoleAudit(
		long auditRoleId) {

		return getService().fetchEdcPermissionRoleAudit(auditRoleId);
	}

	/**
	 * Returns the edc permission role audit matching the UUID and group.
	 *
	 * @param uuid the edc permission role audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit
		fetchEdcPermissionRoleAuditByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchEdcPermissionRoleAuditByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the edc permission role audit with the primary key.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws PortalException if a edc permission role audit with the primary key could not be found
	 */
	public static EdcPermissionRoleAudit getEdcPermissionRoleAudit(
			long auditRoleId)
		throws PortalException {

		return getService().getEdcPermissionRoleAudit(auditRoleId);
	}

	/**
	 * Returns the edc permission role audit matching the UUID and group.
	 *
	 * @param uuid the edc permission role audit's UUID
	 * @param groupId the primary key of the group
	 * @return the matching edc permission role audit
	 * @throws PortalException if a matching edc permission role audit could not be found
	 */
	public static EdcPermissionRoleAudit
			getEdcPermissionRoleAuditByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getEdcPermissionRoleAuditByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of edc permission role audits
	 */
	public static List<EdcPermissionRoleAudit> getEdcPermissionRoleAudits(
		int start, int end) {

		return getService().getEdcPermissionRoleAudits(start, end);
	}

	/**
	 * Returns all the edc permission role audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission role audits
	 * @param companyId the primary key of the company
	 * @return the matching edc permission role audits, or an empty list if no matches were found
	 */
	public static List<EdcPermissionRoleAudit>
		getEdcPermissionRoleAuditsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getEdcPermissionRoleAuditsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of edc permission role audits matching the UUID and company.
	 *
	 * @param uuid the UUID of the edc permission role audits
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching edc permission role audits, or an empty list if no matches were found
	 */
	public static List<EdcPermissionRoleAudit>
		getEdcPermissionRoleAuditsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return getService().getEdcPermissionRoleAuditsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of edc permission role audits.
	 *
	 * @return the number of edc permission role audits
	 */
	public static int getEdcPermissionRoleAuditsCount() {
		return getService().getEdcPermissionRoleAuditsCount();
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
	 * Updates the edc permission role audit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EdcPermissionRoleAuditLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 * @return the edc permission role audit that was updated
	 */
	public static EdcPermissionRoleAudit updateEdcPermissionRoleAudit(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		return getService().updateEdcPermissionRoleAudit(
			edcPermissionRoleAudit);
	}

	public static EdcPermissionRoleAuditLocalService getService() {
		return _service;
	}

	private static volatile EdcPermissionRoleAuditLocalService _service;

}
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
 * Provides a wrapper for {@link InstanceLinkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InstanceLinkLocalService
 * @generated
 */
public class InstanceLinkLocalServiceWrapper
	implements InstanceLinkLocalService,
			   ServiceWrapper<InstanceLinkLocalService> {

	public InstanceLinkLocalServiceWrapper(
		InstanceLinkLocalService instanceLinkLocalService) {

		_instanceLinkLocalService = instanceLinkLocalService;
	}

	/**
	 * Adds the instance link to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstanceLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instanceLink the instance link
	 * @return the instance link that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink addInstanceLink(
		com.dhsoft.edc.backend.model.InstanceLink instanceLink) {

		return _instanceLinkLocalService.addInstanceLink(instanceLink);
	}

	/**
	 * Creates a new instance link with the primary key. Does not add the instance link to the database.
	 *
	 * @param linkId the primary key for the new instance link
	 * @return the new instance link
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink createInstanceLink(
		long linkId) {

		return _instanceLinkLocalService.createInstanceLink(linkId);
	}

	/**
	 * Deletes the instance link from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstanceLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instanceLink the instance link
	 * @return the instance link that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink deleteInstanceLink(
		com.dhsoft.edc.backend.model.InstanceLink instanceLink) {

		return _instanceLinkLocalService.deleteInstanceLink(instanceLink);
	}

	/**
	 * Deletes the instance link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstanceLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link that was removed
	 * @throws PortalException if a instance link with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink deleteInstanceLink(
			long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instanceLinkLocalService.deleteInstanceLink(linkId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instanceLinkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _instanceLinkLocalService.dynamicQuery();
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

		return _instanceLinkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstanceLinkModelImpl</code>.
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

		return _instanceLinkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstanceLinkModelImpl</code>.
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

		return _instanceLinkLocalService.dynamicQuery(
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

		return _instanceLinkLocalService.dynamicQueryCount(dynamicQuery);
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

		return _instanceLinkLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.InstanceLink fetchInstanceLink(
		long linkId) {

		return _instanceLinkLocalService.fetchInstanceLink(linkId);
	}

	/**
	 * Returns the instance link matching the UUID and group.
	 *
	 * @param uuid the instance link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink
		fetchInstanceLinkByUuidAndGroupId(String uuid, long groupId) {

		return _instanceLinkLocalService.fetchInstanceLinkByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _instanceLinkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _instanceLinkLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _instanceLinkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the instance link with the primary key.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link
	 * @throws PortalException if a instance link with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink getInstanceLink(
			long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instanceLinkLocalService.getInstanceLink(linkId);
	}

	/**
	 * Returns the instance link matching the UUID and group.
	 *
	 * @param uuid the instance link's UUID
	 * @param groupId the primary key of the group
	 * @return the matching instance link
	 * @throws PortalException if a matching instance link could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink
			getInstanceLinkByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instanceLinkLocalService.getInstanceLinkByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of instance links
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstanceLink>
		getInstanceLinks(int start, int end) {

		return _instanceLinkLocalService.getInstanceLinks(start, end);
	}

	/**
	 * Returns all the instance links matching the UUID and company.
	 *
	 * @param uuid the UUID of the instance links
	 * @param companyId the primary key of the company
	 * @return the matching instance links, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstanceLink>
		getInstanceLinksByUuidAndCompanyId(String uuid, long companyId) {

		return _instanceLinkLocalService.getInstanceLinksByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of instance links matching the UUID and company.
	 *
	 * @param uuid the UUID of the instance links
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching instance links, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.InstanceLink>
		getInstanceLinksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.InstanceLink> orderByComparator) {

		return _instanceLinkLocalService.getInstanceLinksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of instance links.
	 *
	 * @return the number of instance links
	 */
	@Override
	public int getInstanceLinksCount() {
		return _instanceLinkLocalService.getInstanceLinksCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _instanceLinkLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _instanceLinkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the instance link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InstanceLinkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param instanceLink the instance link
	 * @return the instance link that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.InstanceLink updateInstanceLink(
		com.dhsoft.edc.backend.model.InstanceLink instanceLink) {

		return _instanceLinkLocalService.updateInstanceLink(instanceLink);
	}

	@Override
	public InstanceLinkLocalService getWrappedService() {
		return _instanceLinkLocalService;
	}

	@Override
	public void setWrappedService(
		InstanceLinkLocalService instanceLinkLocalService) {

		_instanceLinkLocalService = instanceLinkLocalService;
	}

	private InstanceLinkLocalService _instanceLinkLocalService;

}
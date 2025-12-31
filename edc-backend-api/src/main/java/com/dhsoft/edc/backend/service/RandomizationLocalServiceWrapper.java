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
 * Provides a wrapper for {@link RandomizationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RandomizationLocalService
 * @generated
 */
public class RandomizationLocalServiceWrapper
	implements RandomizationLocalService,
			   ServiceWrapper<RandomizationLocalService> {

	public RandomizationLocalServiceWrapper(
		RandomizationLocalService randomizationLocalService) {

		_randomizationLocalService = randomizationLocalService;
	}

	@Override
	public void AddRandomization(
		long companyId, long groupId, long projectId, long userId,
		String userName, int status, String randomNo, int useStatus,
		int sourceType, String criteria, long expGroupId) {

		_randomizationLocalService.AddRandomization(
			companyId, groupId, projectId, userId, userName, status, randomNo,
			useStatus, sourceType, criteria, expGroupId);
	}

	/**
	 * Adds the randomization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization addRandomization(
		com.dhsoft.edc.backend.model.Randomization randomization) {

		return _randomizationLocalService.addRandomization(randomization);
	}

	/**
	 * Creates a new randomization with the primary key. Does not add the randomization to the database.
	 *
	 * @param randomizationId the primary key for the new randomization
	 * @return the new randomization
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization createRandomization(
		long randomizationId) {

		return _randomizationLocalService.createRandomization(randomizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _randomizationLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the randomization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization that was removed
	 * @throws PortalException if a randomization with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization deleteRandomization(
			long randomizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _randomizationLocalService.deleteRandomization(randomizationId);
	}

	@Override
	public void DeleteRandomization(long randomizationId) {
		_randomizationLocalService.DeleteRandomization(randomizationId);
	}

	/**
	 * Deletes the randomization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization deleteRandomization(
		com.dhsoft.edc.backend.model.Randomization randomization) {

		return _randomizationLocalService.deleteRandomization(randomization);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _randomizationLocalService.dynamicQuery();
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

		return _randomizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
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

		return _randomizationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
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

		return _randomizationLocalService.dynamicQuery(
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

		return _randomizationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _randomizationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.Randomization fetchRandomization(
		long randomizationId) {

		return _randomizationLocalService.fetchRandomization(randomizationId);
	}

	/**
	 * Returns the randomization matching the UUID and group.
	 *
	 * @param uuid the randomization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization
		fetchRandomizationByUuidAndGroupId(String uuid, long groupId) {

		return _randomizationLocalService.fetchRandomizationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.dhsoft.edc.backend.model.Randomization findByExpGroupId(
		long expGroupId) {

		return _randomizationLocalService.findByExpGroupId(expGroupId);
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Randomization>
		findByGroupAndProject(long groupId, long projectId) {

		return _randomizationLocalService.findByGroupAndProject(
			groupId, projectId);
	}

	@Override
	public com.dhsoft.edc.backend.model.Randomization
		findByGroupAndProjectAndRandomNo(
			long groupId, long projectId, String randomNo) {

		return _randomizationLocalService.findByGroupAndProjectAndRandomNo(
			groupId, projectId, randomNo);
	}

	@Override
	public com.dhsoft.edc.backend.model.Randomization findByRandomizationId(
		long randomizationId) {

		return _randomizationLocalService.findByRandomizationId(
			randomizationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _randomizationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _randomizationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _randomizationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _randomizationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _randomizationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the randomization with the primary key.
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization
	 * @throws PortalException if a randomization with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization getRandomization(
			long randomizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _randomizationLocalService.getRandomization(randomizationId);
	}

	/**
	 * Returns the randomization matching the UUID and group.
	 *
	 * @param uuid the randomization's UUID
	 * @param groupId the primary key of the group
	 * @return the matching randomization
	 * @throws PortalException if a matching randomization could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization
			getRandomizationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _randomizationLocalService.getRandomizationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the randomizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of randomizations
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Randomization>
		getRandomizations(int start, int end) {

		return _randomizationLocalService.getRandomizations(start, end);
	}

	/**
	 * Returns all the randomizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the randomizations
	 * @param companyId the primary key of the company
	 * @return the matching randomizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Randomization>
		getRandomizationsByUuidAndCompanyId(String uuid, long companyId) {

		return _randomizationLocalService.getRandomizationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of randomizations matching the UUID and company.
	 *
	 * @param uuid the UUID of the randomizations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching randomizations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.Randomization>
		getRandomizationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.Randomization>
					orderByComparator) {

		return _randomizationLocalService.getRandomizationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of randomizations.
	 *
	 * @return the number of randomizations
	 */
	@Override
	public int getRandomizationsCount() {
		return _randomizationLocalService.getRandomizationsCount();
	}

	@Override
	public void UpdateRandomization(
		long randomizationId, long userId, String userName, int status,
		String randomNo, int useStatus, int sourceType, String criteria,
		long expGroupId) {

		_randomizationLocalService.UpdateRandomization(
			randomizationId, userId, userName, status, randomNo, useStatus,
			sourceType, criteria, expGroupId);
	}

	/**
	 * Updates the randomization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RandomizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param randomization the randomization
	 * @return the randomization that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.Randomization updateRandomization(
		com.dhsoft.edc.backend.model.Randomization randomization) {

		return _randomizationLocalService.updateRandomization(randomization);
	}

	@Override
	public void UpdateStatusToNotUse(long randomizationId) {
		_randomizationLocalService.UpdateStatusToNotUse(randomizationId);
	}

	@Override
	public void UpdateStatusToUse(long randomizationId) {
		_randomizationLocalService.UpdateStatusToUse(randomizationId);
	}

	@Override
	public RandomizationLocalService getWrappedService() {
		return _randomizationLocalService;
	}

	@Override
	public void setWrappedService(
		RandomizationLocalService randomizationLocalService) {

		_randomizationLocalService = randomizationLocalService;
	}

	private RandomizationLocalService _randomizationLocalService;

}
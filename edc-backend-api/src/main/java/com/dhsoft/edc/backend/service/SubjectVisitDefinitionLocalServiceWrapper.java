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
 * Provides a wrapper for {@link SubjectVisitDefinitionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubjectVisitDefinitionLocalService
 * @generated
 */
public class SubjectVisitDefinitionLocalServiceWrapper
	implements ServiceWrapper<SubjectVisitDefinitionLocalService>,
			   SubjectVisitDefinitionLocalService {

	public SubjectVisitDefinitionLocalServiceWrapper(
		SubjectVisitDefinitionLocalService subjectVisitDefinitionLocalService) {

		_subjectVisitDefinitionLocalService =
			subjectVisitDefinitionLocalService;
	}

	@Override
	public void addSubjectVisitDefinition(
		long companyId, long groupId, long projectId, long visitGroupId,
		long subjectId, long userId, String userName, int status,
		long statusByUserId, String statusByUserName, java.util.Date statusDate,
		String parentCode, String visitDefinitionCode, String name,
		String order, String extCode, String anchorType, int offset,
		int windowMinus, int windowPlus, int type, int repeatCount,
		long visitCRFId) {

		_subjectVisitDefinitionLocalService.addSubjectVisitDefinition(
			companyId, groupId, projectId, visitGroupId, subjectId, userId,
			userName, status, statusByUserId, statusByUserName, statusDate,
			parentCode, visitDefinitionCode, name, order, extCode, anchorType,
			offset, windowMinus, windowPlus, type, repeatCount, visitCRFId);
	}

	/**
	 * Adds the subject visit definition to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectVisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 * @return the subject visit definition that was added
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		addSubjectVisitDefinition(
			com.dhsoft.edc.backend.model.SubjectVisitDefinition
				subjectVisitDefinition) {

		return _subjectVisitDefinitionLocalService.addSubjectVisitDefinition(
			subjectVisitDefinition);
	}

	/**
	 * Creates a new subject visit definition with the primary key. Does not add the subject visit definition to the database.
	 *
	 * @param subjectVisitDefinitionId the primary key for the new subject visit definition
	 * @return the new subject visit definition
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		createSubjectVisitDefinition(long subjectVisitDefinitionId) {

		return _subjectVisitDefinitionLocalService.createSubjectVisitDefinition(
			subjectVisitDefinitionId);
	}

	@Override
	public void deleteBySubjectId(long subjectId) {
		_subjectVisitDefinitionLocalService.deleteBySubjectId(subjectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectVisitDefinitionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the subject visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectVisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition that was removed
	 * @throws PortalException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
			deleteSubjectVisitDefinition(long subjectVisitDefinitionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectVisitDefinitionLocalService.deleteSubjectVisitDefinition(
			subjectVisitDefinitionId);
	}

	/**
	 * Deletes the subject visit definition from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectVisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 * @return the subject visit definition that was removed
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		deleteSubjectVisitDefinition(
			com.dhsoft.edc.backend.model.SubjectVisitDefinition
				subjectVisitDefinition) {

		return _subjectVisitDefinitionLocalService.deleteSubjectVisitDefinition(
			subjectVisitDefinition);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subjectVisitDefinitionLocalService.dynamicQuery();
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

		return _subjectVisitDefinitionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.SubjectVisitDefinitionModelImpl</code>.
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

		return _subjectVisitDefinitionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.SubjectVisitDefinitionModelImpl</code>.
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

		return _subjectVisitDefinitionLocalService.dynamicQuery(
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

		return _subjectVisitDefinitionLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _subjectVisitDefinitionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		fetchSubjectVisitDefinition(long subjectVisitDefinitionId) {

		return _subjectVisitDefinitionLocalService.fetchSubjectVisitDefinition(
			subjectVisitDefinitionId);
	}

	/**
	 * Returns the subject visit definition matching the UUID and group.
	 *
	 * @param uuid the subject visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		fetchSubjectVisitDefinitionByUuidAndGroupId(String uuid, long groupId) {

		return _subjectVisitDefinitionLocalService.
			fetchSubjectVisitDefinitionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _subjectVisitDefinitionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.dhsoft.edc.backend.model.SubjectVisitDefinition>
		getBySubjectId(long subjectId) {

		return _subjectVisitDefinitionLocalService.getBySubjectId(subjectId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _subjectVisitDefinitionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _subjectVisitDefinitionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subjectVisitDefinitionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectVisitDefinitionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the subject visit definition with the primary key.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition
	 * @throws PortalException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
			getSubjectVisitDefinition(long subjectVisitDefinitionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectVisitDefinitionLocalService.getSubjectVisitDefinition(
			subjectVisitDefinitionId);
	}

	/**
	 * Returns the subject visit definition matching the UUID and group.
	 *
	 * @param uuid the subject visit definition's UUID
	 * @param groupId the primary key of the group
	 * @return the matching subject visit definition
	 * @throws PortalException if a matching subject visit definition could not be found
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
			getSubjectVisitDefinitionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectVisitDefinitionLocalService.
			getSubjectVisitDefinitionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dhsoft.edc.backend.model.impl.SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of subject visit definitions
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.SubjectVisitDefinition>
		getSubjectVisitDefinitions(int start, int end) {

		return _subjectVisitDefinitionLocalService.getSubjectVisitDefinitions(
			start, end);
	}

	/**
	 * Returns all the subject visit definitions matching the UUID and company.
	 *
	 * @param uuid the UUID of the subject visit definitions
	 * @param companyId the primary key of the company
	 * @return the matching subject visit definitions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.SubjectVisitDefinition>
		getSubjectVisitDefinitionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return _subjectVisitDefinitionLocalService.
			getSubjectVisitDefinitionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of subject visit definitions matching the UUID and company.
	 *
	 * @param uuid the UUID of the subject visit definitions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching subject visit definitions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.dhsoft.edc.backend.model.SubjectVisitDefinition>
		getSubjectVisitDefinitionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dhsoft.edc.backend.model.SubjectVisitDefinition>
					orderByComparator) {

		return _subjectVisitDefinitionLocalService.
			getSubjectVisitDefinitionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of subject visit definitions.
	 *
	 * @return the number of subject visit definitions
	 */
	@Override
	public int getSubjectVisitDefinitionsCount() {
		return _subjectVisitDefinitionLocalService.
			getSubjectVisitDefinitionsCount();
	}

	/**
	 * Updates the subject visit definition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectVisitDefinitionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 * @return the subject visit definition that was updated
	 */
	@Override
	public com.dhsoft.edc.backend.model.SubjectVisitDefinition
		updateSubjectVisitDefinition(
			com.dhsoft.edc.backend.model.SubjectVisitDefinition
				subjectVisitDefinition) {

		return _subjectVisitDefinitionLocalService.updateSubjectVisitDefinition(
			subjectVisitDefinition);
	}

	@Override
	public SubjectVisitDefinitionLocalService getWrappedService() {
		return _subjectVisitDefinitionLocalService;
	}

	@Override
	public void setWrappedService(
		SubjectVisitDefinitionLocalService subjectVisitDefinitionLocalService) {

		_subjectVisitDefinitionLocalService =
			subjectVisitDefinitionLocalService;
	}

	private SubjectVisitDefinitionLocalService
		_subjectVisitDefinitionLocalService;

}
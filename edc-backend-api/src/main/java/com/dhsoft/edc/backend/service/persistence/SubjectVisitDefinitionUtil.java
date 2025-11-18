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

package com.dhsoft.edc.backend.service.persistence;

import com.dhsoft.edc.backend.model.SubjectVisitDefinition;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the subject visit definition service. This utility wraps <code>com.dhsoft.edc.backend.service.persistence.impl.SubjectVisitDefinitionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectVisitDefinitionPersistence
 * @generated
 */
public class SubjectVisitDefinitionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		SubjectVisitDefinition subjectVisitDefinition) {

		getPersistence().clearCache(subjectVisitDefinition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, SubjectVisitDefinition> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SubjectVisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SubjectVisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SubjectVisitDefinition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SubjectVisitDefinition update(
		SubjectVisitDefinition subjectVisitDefinition) {

		return getPersistence().update(subjectVisitDefinition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SubjectVisitDefinition update(
		SubjectVisitDefinition subjectVisitDefinition,
		ServiceContext serviceContext) {

		return getPersistence().update(subjectVisitDefinition, serviceContext);
	}

	/**
	 * Returns all the subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUuid_First(
			String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUuid_First(
		String uuid,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUuid_Last(
			String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUuid_Last(
		String uuid,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByUuid_PrevAndNext(
			long subjectVisitDefinitionId, String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_PrevAndNext(
			subjectVisitDefinitionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subject visit definitions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUUID_G(String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the subject visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subject visit definition that was removed
	 */
	public static SubjectVisitDefinition removeByUUID_G(
			String uuid, long groupId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByUuid_C_PrevAndNext(
			long subjectVisitDefinitionId, String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			subjectVisitDefinitionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByCompanyId_First(
			long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByCompanyId_First(
		long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByCompanyId_Last(
			long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByCompanyId_Last(
		long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByCompanyId_PrevAndNext(
			long subjectVisitDefinitionId, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByCompanyId_PrevAndNext(
			subjectVisitDefinitionId, companyId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId) {

		return getPersistence().findByG_P(groupId, projectId);
	}

	/**
	 * Returns a range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end) {

		return getPersistence().findByG_P(groupId, projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_P(
			groupId, projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByG_P_First(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByG_P_Last(
			groupId, projectId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByG_P_PrevAndNext(
			long subjectVisitDefinitionId, long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByG_P_PrevAndNext(
			subjectVisitDefinitionId, groupId, projectId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public static void removeByG_P(long groupId, long projectId) {
		getPersistence().removeByG_P(groupId, projectId);
	}

	/**
	 * Returns the number of subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByG_P(long groupId, long projectId) {
		return getPersistence().countByG_P(groupId, projectId);
	}

	/**
	 * Returns all the subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByProjectId(long projectId) {
		return getPersistence().findByProjectId(projectId);
	}

	/**
	 * Returns a range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end) {

		return getPersistence().findByProjectId(projectId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByProjectId(
			projectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByProjectId(
			projectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByProjectId_First(
			long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByProjectId_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByProjectId_First(
		long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByProjectId_First(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByProjectId_Last(
			long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByProjectId_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByProjectId_Last(
		long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByProjectId_Last(
			projectId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByProjectId_PrevAndNext(
			long subjectVisitDefinitionId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByProjectId_PrevAndNext(
			subjectVisitDefinitionId, projectId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public static void removeByProjectId(long projectId) {
		getPersistence().removeByProjectId(projectId);
	}

	/**
	 * Returns the number of subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByProjectId(long projectId) {
		return getPersistence().countByProjectId(projectId);
	}

	/**
	 * Returns all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId) {

		return getPersistence().findByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns a range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end) {

		return getPersistence().findByVisitGroupId(visitGroupId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByVisitGroupId(
			visitGroupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByVisitGroupId(
			visitGroupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitGroupId_First(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitGroupId_First(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitGroupId_Last(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitGroupId_Last(
			visitGroupId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByVisitGroupId_PrevAndNext(
			long subjectVisitDefinitionId, long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitGroupId_PrevAndNext(
			subjectVisitDefinitionId, visitGroupId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	public static void removeByVisitGroupId(long visitGroupId) {
		getPersistence().removeByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns the number of subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByVisitGroupId(long visitGroupId) {
		return getPersistence().countByVisitGroupId(visitGroupId);
	}

	/**
	 * Returns all the subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findBySubjectId(long subjectId) {
		return getPersistence().findBySubjectId(subjectId);
	}

	/**
	 * Returns a range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end) {

		return getPersistence().findBySubjectId(subjectId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findBySubjectId(
			subjectId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySubjectId(
			subjectId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findBySubjectId_First(
			long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findBySubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchBySubjectId_First(
		long subjectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchBySubjectId_First(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findBySubjectId_Last(
			long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findBySubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchBySubjectId_Last(
		long subjectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchBySubjectId_Last(
			subjectId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findBySubjectId_PrevAndNext(
			long subjectVisitDefinitionId, long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findBySubjectId_PrevAndNext(
			subjectVisitDefinitionId, subjectId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public static void removeBySubjectId(long subjectId) {
		getPersistence().removeBySubjectId(subjectId);
	}

	/**
	 * Returns the number of subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countBySubjectId(long subjectId) {
		return getPersistence().countBySubjectId(subjectId);
	}

	/**
	 * Returns all the subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUserId_First(
			long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUserId_First(
		long userId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByUserId_Last(
			long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByUserId_Last(
		long userId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByUserId_PrevAndNext(
			long subjectVisitDefinitionId, long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByUserId_PrevAndNext(
			subjectVisitDefinitionId, userId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId) {

		return getPersistence().findByVisitCRFId(visitCRFId);
	}

	/**
	 * Returns a range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end) {

		return getPersistence().findByVisitCRFId(visitCRFId, start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findByVisitCRFId(
			visitCRFId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByVisitCRFId(
			visitCRFId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitCRFId_First(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByVisitCRFId_First(
		long visitCRFId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitCRFId_First(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitCRFId_Last(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public static SubjectVisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().fetchByVisitCRFId_Last(
			visitCRFId, orderByComparator);
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition[] findByVisitCRFId_PrevAndNext(
			long subjectVisitDefinitionId, long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByVisitCRFId_PrevAndNext(
			subjectVisitDefinitionId, visitCRFId, orderByComparator);
	}

	/**
	 * Removes all the subject visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	public static void removeByVisitCRFId(long visitCRFId) {
		getPersistence().removeByVisitCRFId(visitCRFId);
	}

	/**
	 * Returns the number of subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching subject visit definitions
	 */
	public static int countByVisitCRFId(long visitCRFId) {
		return getPersistence().countByVisitCRFId(visitCRFId);
	}

	/**
	 * Caches the subject visit definition in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 */
	public static void cacheResult(
		SubjectVisitDefinition subjectVisitDefinition) {

		getPersistence().cacheResult(subjectVisitDefinition);
	}

	/**
	 * Caches the subject visit definitions in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinitions the subject visit definitions
	 */
	public static void cacheResult(
		List<SubjectVisitDefinition> subjectVisitDefinitions) {

		getPersistence().cacheResult(subjectVisitDefinitions);
	}

	/**
	 * Creates a new subject visit definition with the primary key. Does not add the subject visit definition to the database.
	 *
	 * @param subjectVisitDefinitionId the primary key for the new subject visit definition
	 * @return the new subject visit definition
	 */
	public static SubjectVisitDefinition create(long subjectVisitDefinitionId) {
		return getPersistence().create(subjectVisitDefinitionId);
	}

	/**
	 * Removes the subject visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition that was removed
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition remove(long subjectVisitDefinitionId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().remove(subjectVisitDefinitionId);
	}

	public static SubjectVisitDefinition updateImpl(
		SubjectVisitDefinition subjectVisitDefinition) {

		return getPersistence().updateImpl(subjectVisitDefinition);
	}

	/**
	 * Returns the subject visit definition with the primary key or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition findByPrimaryKey(
			long subjectVisitDefinitionId)
		throws com.dhsoft.edc.backend.exception.
			NoSuchSubjectVisitDefinitionException {

		return getPersistence().findByPrimaryKey(subjectVisitDefinitionId);
	}

	/**
	 * Returns the subject visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition, or <code>null</code> if a subject visit definition with the primary key could not be found
	 */
	public static SubjectVisitDefinition fetchByPrimaryKey(
		long subjectVisitDefinitionId) {

		return getPersistence().fetchByPrimaryKey(subjectVisitDefinitionId);
	}

	/**
	 * Returns all the subject visit definitions.
	 *
	 * @return the subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findAll(
		int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subject visit definitions
	 */
	public static List<SubjectVisitDefinition> findAll(
		int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the subject visit definitions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of subject visit definitions.
	 *
	 * @return the number of subject visit definitions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SubjectVisitDefinitionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SubjectVisitDefinitionPersistence _persistence;

}
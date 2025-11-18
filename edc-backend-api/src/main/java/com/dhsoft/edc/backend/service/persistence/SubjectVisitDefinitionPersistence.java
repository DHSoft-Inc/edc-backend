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

import com.dhsoft.edc.backend.exception.NoSuchSubjectVisitDefinitionException;
import com.dhsoft.edc.backend.model.SubjectVisitDefinition;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the subject visit definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectVisitDefinitionUtil
 * @generated
 */
@ProviderType
public interface SubjectVisitDefinitionPersistence
	extends BasePersistence<SubjectVisitDefinition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubjectVisitDefinitionUtil} to access the subject visit definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByUuid(String uuid);

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
	public java.util.List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByUuid_PrevAndNext(
			long subjectVisitDefinitionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subject visit definitions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the subject visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subject visit definition that was removed
	 */
	public SubjectVisitDefinition removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public SubjectVisitDefinition[] findByUuid_C_PrevAndNext(
			long subjectVisitDefinitionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByCompanyId(
		long companyId);

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
	public java.util.List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByCompanyId_PrevAndNext(
			long subjectVisitDefinitionId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId);

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
	public java.util.List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public SubjectVisitDefinition[] findByG_P_PrevAndNext(
			long subjectVisitDefinitionId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByProjectId(
		long projectId);

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
	public java.util.List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByProjectId_First(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByProjectId_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByProjectId_Last(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByProjectId_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByProjectId_PrevAndNext(
			long subjectVisitDefinitionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public void removeByProjectId(long projectId);

	/**
	 * Returns the number of subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByProjectId(long projectId);

	/**
	 * Returns all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId);

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
	public java.util.List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByVisitGroupId_PrevAndNext(
			long subjectVisitDefinitionId, long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	public void removeByVisitGroupId(long visitGroupId);

	/**
	 * Returns the number of subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByVisitGroupId(long visitGroupId);

	/**
	 * Returns all the subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findBySubjectId(
		long subjectId);

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
	public java.util.List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findBySubjectId_First(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchBySubjectId_First(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findBySubjectId_Last(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchBySubjectId_Last(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findBySubjectId_PrevAndNext(
			long subjectVisitDefinitionId, long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public void removeBySubjectId(long subjectId);

	/**
	 * Returns the number of subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching subject visit definitions
	 */
	public int countBySubjectId(long subjectId);

	/**
	 * Returns all the subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByUserId(long userId);

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
	public java.util.List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByUserId_PrevAndNext(
			long subjectVisitDefinitionId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId);

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
	public java.util.List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByVisitCRFId_First(
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	public SubjectVisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition[] findByVisitCRFId_PrevAndNext(
			long subjectVisitDefinitionId, long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Removes all the subject visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	public void removeByVisitCRFId(long visitCRFId);

	/**
	 * Returns the number of subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching subject visit definitions
	 */
	public int countByVisitCRFId(long visitCRFId);

	/**
	 * Caches the subject visit definition in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 */
	public void cacheResult(SubjectVisitDefinition subjectVisitDefinition);

	/**
	 * Caches the subject visit definitions in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinitions the subject visit definitions
	 */
	public void cacheResult(
		java.util.List<SubjectVisitDefinition> subjectVisitDefinitions);

	/**
	 * Creates a new subject visit definition with the primary key. Does not add the subject visit definition to the database.
	 *
	 * @param subjectVisitDefinitionId the primary key for the new subject visit definition
	 * @return the new subject visit definition
	 */
	public SubjectVisitDefinition create(long subjectVisitDefinitionId);

	/**
	 * Removes the subject visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition that was removed
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition remove(long subjectVisitDefinitionId)
		throws NoSuchSubjectVisitDefinitionException;

	public SubjectVisitDefinition updateImpl(
		SubjectVisitDefinition subjectVisitDefinition);

	/**
	 * Returns the subject visit definition with the primary key or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition findByPrimaryKey(
			long subjectVisitDefinitionId)
		throws NoSuchSubjectVisitDefinitionException;

	/**
	 * Returns the subject visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition, or <code>null</code> if a subject visit definition with the primary key could not be found
	 */
	public SubjectVisitDefinition fetchByPrimaryKey(
		long subjectVisitDefinitionId);

	/**
	 * Returns all the subject visit definitions.
	 *
	 * @return the subject visit definitions
	 */
	public java.util.List<SubjectVisitDefinition> findAll();

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
	public java.util.List<SubjectVisitDefinition> findAll(int start, int end);

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
	public java.util.List<SubjectVisitDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator);

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
	public java.util.List<SubjectVisitDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SubjectVisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the subject visit definitions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of subject visit definitions.
	 *
	 * @return the number of subject visit definitions
	 */
	public int countAll();

}
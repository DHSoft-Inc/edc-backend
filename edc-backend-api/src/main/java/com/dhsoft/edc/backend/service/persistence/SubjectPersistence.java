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

import com.dhsoft.edc.backend.exception.NoSuchSubjectException;
import com.dhsoft.edc.backend.model.Subject;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the subject service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectUtil
 * @generated
 */
@ProviderType
public interface SubjectPersistence extends BasePersistence<Subject> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubjectUtil} to access the subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the subjects where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByUuid(String uuid);

	/**
	 * Returns a range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where uuid = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByUuid_PrevAndNext(
			long subjectId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of subjects where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subjects
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectException;

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the subject where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subject that was removed
	 */
	public Subject removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectException;

	/**
	 * Returns the number of subjects where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subjects
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByUuid_C_PrevAndNext(
			long subjectId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subjects
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the subjects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where companyId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByCompanyId_PrevAndNext(
			long subjectId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of subjects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching subjects
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByG_P_PrevAndNext(
			long subjectId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching subjects
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the subjects where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByProjectId(long projectId);

	/**
	 * Returns a range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByProjectId(
		long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByProjectId_First(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByProjectId_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByProjectId_Last(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByProjectId_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where projectId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByProjectId_PrevAndNext(
			long subjectId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public void removeByProjectId(long projectId);

	/**
	 * Returns the number of subjects where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching subjects
	 */
	public int countByProjectId(long projectId);

	/**
	 * Returns all the subjects where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByInstitutionId(long institutionId);

	/**
	 * Returns a range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByInstitutionId(
		long institutionId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByInstitutionId_First(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByInstitutionId_Last(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where institutionId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByInstitutionId_PrevAndNext(
			long subjectId, long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public void removeByInstitutionId(long institutionId);

	/**
	 * Returns the number of subjects where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching subjects
	 */
	public int countByInstitutionId(long institutionId);

	/**
	 * Returns all the subjects where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByUserId(long userId);

	/**
	 * Returns a range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where userId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByUserId_PrevAndNext(
			long subjectId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of subjects where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching subjects
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the subjects where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the matching subjects
	 */
	public java.util.List<Subject> findByExpGroupId(long expGroupId);

	/**
	 * Returns a range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	public java.util.List<Subject> findByExpGroupId(
		long expGroupId, int start, int end);

	/**
	 * Returns an ordered range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByExpGroupId(
		long expGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	public java.util.List<Subject> findByExpGroupId(
		long expGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByExpGroupId_First(
			long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the first subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByExpGroupId_First(
		long expGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the last subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	public Subject findByExpGroupId_Last(
			long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Returns the last subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	public Subject fetchByExpGroupId_Last(
		long expGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns the subjects before and after the current subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject[] findByExpGroupId_PrevAndNext(
			long subjectId, long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Subject>
				orderByComparator)
		throws NoSuchSubjectException;

	/**
	 * Removes all the subjects where expGroupId = &#63; from the database.
	 *
	 * @param expGroupId the exp group ID
	 */
	public void removeByExpGroupId(long expGroupId);

	/**
	 * Returns the number of subjects where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the number of matching subjects
	 */
	public int countByExpGroupId(long expGroupId);

	/**
	 * Caches the subject in the entity cache if it is enabled.
	 *
	 * @param subject the subject
	 */
	public void cacheResult(Subject subject);

	/**
	 * Caches the subjects in the entity cache if it is enabled.
	 *
	 * @param subjects the subjects
	 */
	public void cacheResult(java.util.List<Subject> subjects);

	/**
	 * Creates a new subject with the primary key. Does not add the subject to the database.
	 *
	 * @param subjectId the primary key for the new subject
	 * @return the new subject
	 */
	public Subject create(long subjectId);

	/**
	 * Removes the subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject that was removed
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject remove(long subjectId) throws NoSuchSubjectException;

	public Subject updateImpl(Subject subject);

	/**
	 * Returns the subject with the primary key or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	public Subject findByPrimaryKey(long subjectId)
		throws NoSuchSubjectException;

	/**
	 * Returns the subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject, or <code>null</code> if a subject with the primary key could not be found
	 */
	public Subject fetchByPrimaryKey(long subjectId);

	/**
	 * Returns all the subjects.
	 *
	 * @return the subjects
	 */
	public java.util.List<Subject> findAll();

	/**
	 * Returns a range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of subjects
	 */
	public java.util.List<Subject> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subjects
	 */
	public java.util.List<Subject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator);

	/**
	 * Returns an ordered range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subjects
	 */
	public java.util.List<Subject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subject>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the subjects from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of subjects.
	 *
	 * @return the number of subjects
	 */
	public int countAll();

}
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

import com.dhsoft.edc.backend.exception.NoSuchInstitutionException;
import com.dhsoft.edc.backend.model.Institution;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the institution service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstitutionUtil
 * @generated
 */
@ProviderType
public interface InstitutionPersistence extends BasePersistence<Institution> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstitutionUtil} to access the institution persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the institutions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching institutions
	 */
	public java.util.List<Institution> findByUuid(String uuid);

	/**
	 * Returns a range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public java.util.List<Institution> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the first institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the last institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the last institution in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the institutions before and after the current institution in the ordered set where uuid = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution[] findByUuid_PrevAndNext(
			long institutionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Removes all the institutions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of institutions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching institutions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstitutionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUUID_G(String uuid, long groupId)
		throws NoSuchInstitutionException;

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the institution where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the institution where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the institution that was removed
	 */
	public Institution removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstitutionException;

	/**
	 * Returns the number of institutions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching institutions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching institutions
	 */
	public java.util.List<Institution> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public java.util.List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the first institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the last institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the last institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the institutions before and after the current institution in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution[] findByUuid_C_PrevAndNext(
			long institutionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Removes all the institutions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of institutions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching institutions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching institutions
	 */
	public java.util.List<Institution> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public java.util.List<Institution> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the first institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the last institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the last institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the institutions before and after the current institution in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution[] findByG_P_PrevAndNext(
			long institutionId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Removes all the institutions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of institutions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching institutions
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the institutions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching institutions
	 */
	public java.util.List<Institution> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public java.util.List<Institution> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the first institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the last institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the last institution in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the institutions before and after the current institution in the ordered set where companyId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution[] findByCompanyId_PrevAndNext(
			long institutionId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Removes all the institutions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of institutions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching institutions
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the institutions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching institutions
	 */
	public java.util.List<Institution> findByUserId(long userId);

	/**
	 * Returns a range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of matching institutions
	 */
	public java.util.List<Institution> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching institutions
	 */
	public java.util.List<Institution> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the first institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the last institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution
	 * @throws NoSuchInstitutionException if a matching institution could not be found
	 */
	public Institution findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Returns the last institution in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching institution, or <code>null</code> if a matching institution could not be found
	 */
	public Institution fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns the institutions before and after the current institution in the ordered set where userId = &#63;.
	 *
	 * @param institutionId the primary key of the current institution
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution[] findByUserId_PrevAndNext(
			long institutionId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Institution>
				orderByComparator)
		throws NoSuchInstitutionException;

	/**
	 * Removes all the institutions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of institutions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching institutions
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the institution in the entity cache if it is enabled.
	 *
	 * @param institution the institution
	 */
	public void cacheResult(Institution institution);

	/**
	 * Caches the institutions in the entity cache if it is enabled.
	 *
	 * @param institutions the institutions
	 */
	public void cacheResult(java.util.List<Institution> institutions);

	/**
	 * Creates a new institution with the primary key. Does not add the institution to the database.
	 *
	 * @param institutionId the primary key for the new institution
	 * @return the new institution
	 */
	public Institution create(long institutionId);

	/**
	 * Removes the institution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution that was removed
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution remove(long institutionId)
		throws NoSuchInstitutionException;

	public Institution updateImpl(Institution institution);

	/**
	 * Returns the institution with the primary key or throws a <code>NoSuchInstitutionException</code> if it could not be found.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution
	 * @throws NoSuchInstitutionException if a institution with the primary key could not be found
	 */
	public Institution findByPrimaryKey(long institutionId)
		throws NoSuchInstitutionException;

	/**
	 * Returns the institution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionId the primary key of the institution
	 * @return the institution, or <code>null</code> if a institution with the primary key could not be found
	 */
	public Institution fetchByPrimaryKey(long institutionId);

	/**
	 * Returns all the institutions.
	 *
	 * @return the institutions
	 */
	public java.util.List<Institution> findAll();

	/**
	 * Returns a range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @return the range of institutions
	 */
	public java.util.List<Institution> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of institutions
	 */
	public java.util.List<Institution> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator);

	/**
	 * Returns an ordered range of all the institutions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstitutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of institutions
	 * @param end the upper bound of the range of institutions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of institutions
	 */
	public java.util.List<Institution> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Institution>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the institutions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of institutions.
	 *
	 * @return the number of institutions
	 */
	public int countAll();

}
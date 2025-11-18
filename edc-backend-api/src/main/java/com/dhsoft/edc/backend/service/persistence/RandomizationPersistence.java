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

import com.dhsoft.edc.backend.exception.NoSuchRandomizationException;
import com.dhsoft.edc.backend.model.Randomization;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the randomization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RandomizationUtil
 * @generated
 */
@ProviderType
public interface RandomizationPersistence
	extends BasePersistence<Randomization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RandomizationUtil} to access the randomization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the randomizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByUuid(String uuid);

	/**
	 * Returns a range of all the randomizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where uuid = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByUuid_PrevAndNext(
			long randomizationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of randomizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching randomizations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the randomization where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRandomizationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUUID_G(String uuid, long groupId)
		throws NoSuchRandomizationException;

	/**
	 * Returns the randomization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the randomization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the randomization where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the randomization that was removed
	 */
	public Randomization removeByUUID_G(String uuid, long groupId)
		throws NoSuchRandomizationException;

	/**
	 * Returns the number of randomizations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching randomizations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the randomizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the randomizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByUuid_C_PrevAndNext(
			long randomizationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of randomizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching randomizations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the randomizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the randomizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where companyId = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByCompanyId_PrevAndNext(
			long randomizationId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of randomizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching randomizations
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the randomizations where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByG_P(
		long groupId, long projectId);

	/**
	 * Returns a range of all the randomizations where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByG_P_PrevAndNext(
			long randomizationId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of randomizations where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching randomizations
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the randomizations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByUserId(long userId);

	/**
	 * Returns a range of all the randomizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where userId = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByUserId_PrevAndNext(
			long randomizationId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of randomizations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching randomizations
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the randomizations where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the matching randomizations
	 */
	public java.util.List<Randomization> findByExpGroupId(long expGroupId);

	/**
	 * Returns a range of all the randomizations where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of matching randomizations
	 */
	public java.util.List<Randomization> findByExpGroupId(
		long expGroupId, int start, int end);

	/**
	 * Returns an ordered range of all the randomizations where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByExpGroupId(
		long expGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching randomizations
	 */
	public java.util.List<Randomization> findByExpGroupId(
		long expGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first randomization in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByExpGroupId_First(
			long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the first randomization in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByExpGroupId_First(
		long expGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the last randomization in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization
	 * @throws NoSuchRandomizationException if a matching randomization could not be found
	 */
	public Randomization findByExpGroupId_Last(
			long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Returns the last randomization in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching randomization, or <code>null</code> if a matching randomization could not be found
	 */
	public Randomization fetchByExpGroupId_Last(
		long expGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns the randomizations before and after the current randomization in the ordered set where expGroupId = &#63;.
	 *
	 * @param randomizationId the primary key of the current randomization
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization[] findByExpGroupId_PrevAndNext(
			long randomizationId, long expGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<Randomization>
				orderByComparator)
		throws NoSuchRandomizationException;

	/**
	 * Removes all the randomizations where expGroupId = &#63; from the database.
	 *
	 * @param expGroupId the exp group ID
	 */
	public void removeByExpGroupId(long expGroupId);

	/**
	 * Returns the number of randomizations where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the number of matching randomizations
	 */
	public int countByExpGroupId(long expGroupId);

	/**
	 * Caches the randomization in the entity cache if it is enabled.
	 *
	 * @param randomization the randomization
	 */
	public void cacheResult(Randomization randomization);

	/**
	 * Caches the randomizations in the entity cache if it is enabled.
	 *
	 * @param randomizations the randomizations
	 */
	public void cacheResult(java.util.List<Randomization> randomizations);

	/**
	 * Creates a new randomization with the primary key. Does not add the randomization to the database.
	 *
	 * @param randomizationId the primary key for the new randomization
	 * @return the new randomization
	 */
	public Randomization create(long randomizationId);

	/**
	 * Removes the randomization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization that was removed
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization remove(long randomizationId)
		throws NoSuchRandomizationException;

	public Randomization updateImpl(Randomization randomization);

	/**
	 * Returns the randomization with the primary key or throws a <code>NoSuchRandomizationException</code> if it could not be found.
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization
	 * @throws NoSuchRandomizationException if a randomization with the primary key could not be found
	 */
	public Randomization findByPrimaryKey(long randomizationId)
		throws NoSuchRandomizationException;

	/**
	 * Returns the randomization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param randomizationId the primary key of the randomization
	 * @return the randomization, or <code>null</code> if a randomization with the primary key could not be found
	 */
	public Randomization fetchByPrimaryKey(long randomizationId);

	/**
	 * Returns all the randomizations.
	 *
	 * @return the randomizations
	 */
	public java.util.List<Randomization> findAll();

	/**
	 * Returns a range of all the randomizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @return the range of randomizations
	 */
	public java.util.List<Randomization> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the randomizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of randomizations
	 */
	public java.util.List<Randomization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the randomizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RandomizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of randomizations
	 * @param end the upper bound of the range of randomizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of randomizations
	 */
	public java.util.List<Randomization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Randomization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the randomizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of randomizations.
	 *
	 * @return the number of randomizations
	 */
	public int countAll();

}
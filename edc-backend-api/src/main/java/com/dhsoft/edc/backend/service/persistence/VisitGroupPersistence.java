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

import com.dhsoft.edc.backend.exception.NoSuchVisitGroupException;
import com.dhsoft.edc.backend.model.VisitGroup;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the visit group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitGroupUtil
 * @generated
 */
@ProviderType
public interface VisitGroupPersistence extends BasePersistence<VisitGroup> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VisitGroupUtil} to access the visit group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the visit groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid(String uuid);

	/**
	 * Returns a range of all the visit groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the visit groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the first visit group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the last visit group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the last visit group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the visit groups before and after the current visit group in the ordered set where uuid = &#63;.
	 *
	 * @param visitGroupId the primary key of the current visit group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup[] findByUuid_PrevAndNext(
			long visitGroupId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Removes all the visit groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of visit groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit groups
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the visit group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the visit group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the visit group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the visit group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit group that was removed
	 */
	public VisitGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the number of visit groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit groups
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the visit groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the visit groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the first visit group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the last visit group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the last visit group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the visit groups before and after the current visit group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitGroupId the primary key of the current visit group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup[] findByUuid_C_PrevAndNext(
			long visitGroupId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Removes all the visit groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of visit groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit groups
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the visit groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit groups
	 */
	public java.util.List<VisitGroup> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the visit groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the first visit group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the last visit group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the last visit group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the visit groups before and after the current visit group in the ordered set where companyId = &#63;.
	 *
	 * @param visitGroupId the primary key of the current visit group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup[] findByCompanyId_PrevAndNext(
			long visitGroupId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Removes all the visit groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of visit groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit groups
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the visit groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit groups
	 */
	public java.util.List<VisitGroup> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the visit groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the visit groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the first visit group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the last visit group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the last visit group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the visit groups before and after the current visit group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitGroupId the primary key of the current visit group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup[] findByG_P_PrevAndNext(
			long visitGroupId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Removes all the visit groups where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of visit groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit groups
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the visit groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit groups
	 */
	public java.util.List<VisitGroup> findByUserId(long userId);

	/**
	 * Returns a range of all the visit groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the visit groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit groups
	 */
	public java.util.List<VisitGroup> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the first visit group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the last visit group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group
	 * @throws NoSuchVisitGroupException if a matching visit group could not be found
	 */
	public VisitGroup findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the last visit group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit group, or <code>null</code> if a matching visit group could not be found
	 */
	public VisitGroup fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns the visit groups before and after the current visit group in the ordered set where userId = &#63;.
	 *
	 * @param visitGroupId the primary key of the current visit group
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup[] findByUserId_PrevAndNext(
			long visitGroupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
				orderByComparator)
		throws NoSuchVisitGroupException;

	/**
	 * Removes all the visit groups where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of visit groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit groups
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the visit group in the entity cache if it is enabled.
	 *
	 * @param visitGroup the visit group
	 */
	public void cacheResult(VisitGroup visitGroup);

	/**
	 * Caches the visit groups in the entity cache if it is enabled.
	 *
	 * @param visitGroups the visit groups
	 */
	public void cacheResult(java.util.List<VisitGroup> visitGroups);

	/**
	 * Creates a new visit group with the primary key. Does not add the visit group to the database.
	 *
	 * @param visitGroupId the primary key for the new visit group
	 * @return the new visit group
	 */
	public VisitGroup create(long visitGroupId);

	/**
	 * Removes the visit group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group that was removed
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup remove(long visitGroupId)
		throws NoSuchVisitGroupException;

	public VisitGroup updateImpl(VisitGroup visitGroup);

	/**
	 * Returns the visit group with the primary key or throws a <code>NoSuchVisitGroupException</code> if it could not be found.
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group
	 * @throws NoSuchVisitGroupException if a visit group with the primary key could not be found
	 */
	public VisitGroup findByPrimaryKey(long visitGroupId)
		throws NoSuchVisitGroupException;

	/**
	 * Returns the visit group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitGroupId the primary key of the visit group
	 * @return the visit group, or <code>null</code> if a visit group with the primary key could not be found
	 */
	public VisitGroup fetchByPrimaryKey(long visitGroupId);

	/**
	 * Returns all the visit groups.
	 *
	 * @return the visit groups
	 */
	public java.util.List<VisitGroup> findAll();

	/**
	 * Returns a range of all the visit groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @return the range of visit groups
	 */
	public java.util.List<VisitGroup> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the visit groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit groups
	 */
	public java.util.List<VisitGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit groups
	 * @param end the upper bound of the range of visit groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit groups
	 */
	public java.util.List<VisitGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the visit groups from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of visit groups.
	 *
	 * @return the number of visit groups
	 */
	public int countAll();

}
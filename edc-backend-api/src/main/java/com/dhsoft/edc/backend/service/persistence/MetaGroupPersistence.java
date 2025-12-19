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

import com.dhsoft.edc.backend.exception.NoSuchMetaGroupException;
import com.dhsoft.edc.backend.model.MetaGroup;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the meta group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaGroupUtil
 * @generated
 */
@ProviderType
public interface MetaGroupPersistence extends BasePersistence<MetaGroup> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MetaGroupUtil} to access the meta group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid(String uuid);

	/**
	 * Returns a range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByUuid_PrevAndNext(
			long metaGroupId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meta groups
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the meta group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meta group that was removed
	 */
	public MetaGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the number of meta groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meta groups
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByUuid_C_PrevAndNext(
			long metaGroupId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByG_P_PrevAndNext(
			long metaGroupId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching meta groups
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode);

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByG_P_G_First(
			long groupId, long projectId, String groupCode,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByG_P_G_First(
		long groupId, long projectId, String groupCode,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByG_P_G_Last(
			long groupId, long projectId, String groupCode,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByG_P_G_Last(
		long groupId, long projectId, String groupCode,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByG_P_G_PrevAndNext(
			long metaGroupId, long groupId, long projectId, String groupCode,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 */
	public void removeByG_P_G(long groupId, long projectId, String groupCode);

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the number of matching meta groups
	 */
	public int countByG_P_G(long groupId, long projectId, String groupCode);

	/**
	 * Returns all the meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByCompanyId_PrevAndNext(
			long metaGroupId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching meta groups
	 */
	public java.util.List<MetaGroup> findByUserId(long userId);

	/**
	 * Returns a range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	public java.util.List<MetaGroup> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	public MetaGroup findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	public MetaGroup fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where userId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup[] findByUserId_PrevAndNext(
			long metaGroupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
				orderByComparator)
		throws NoSuchMetaGroupException;

	/**
	 * Removes all the meta groups where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching meta groups
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the meta group in the entity cache if it is enabled.
	 *
	 * @param metaGroup the meta group
	 */
	public void cacheResult(MetaGroup metaGroup);

	/**
	 * Caches the meta groups in the entity cache if it is enabled.
	 *
	 * @param metaGroups the meta groups
	 */
	public void cacheResult(java.util.List<MetaGroup> metaGroups);

	/**
	 * Creates a new meta group with the primary key. Does not add the meta group to the database.
	 *
	 * @param metaGroupId the primary key for the new meta group
	 * @return the new meta group
	 */
	public MetaGroup create(long metaGroupId);

	/**
	 * Removes the meta group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group that was removed
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup remove(long metaGroupId) throws NoSuchMetaGroupException;

	public MetaGroup updateImpl(MetaGroup metaGroup);

	/**
	 * Returns the meta group with the primary key or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	public MetaGroup findByPrimaryKey(long metaGroupId)
		throws NoSuchMetaGroupException;

	/**
	 * Returns the meta group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group, or <code>null</code> if a meta group with the primary key could not be found
	 */
	public MetaGroup fetchByPrimaryKey(long metaGroupId);

	/**
	 * Returns all the meta groups.
	 *
	 * @return the meta groups
	 */
	public java.util.List<MetaGroup> findAll();

	/**
	 * Returns a range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of meta groups
	 */
	public java.util.List<MetaGroup> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meta groups
	 */
	public java.util.List<MetaGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meta groups
	 */
	public java.util.List<MetaGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaGroup>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the meta groups from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of meta groups.
	 *
	 * @return the number of meta groups
	 */
	public int countAll();

}
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

import com.dhsoft.edc.backend.exception.NoSuchInstResearcherException;
import com.dhsoft.edc.backend.model.InstResearcher;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the inst researcher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstResearcherUtil
 * @generated
 */
@ProviderType
public interface InstResearcherPersistence
	extends BasePersistence<InstResearcher> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstResearcherUtil} to access the inst researcher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid(String uuid);

	/**
	 * Returns a range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByUuid_PrevAndNext(
			long institutionResearcherId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching inst researchers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUUID_G(String uuid, long groupId)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the inst researcher where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the inst researcher that was removed
	 */
	public InstResearcher removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the number of inst researchers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching inst researchers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByUuid_C_PrevAndNext(
			long institutionResearcherId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByG_P(
		long groupId, long projectId);

	/**
	 * Returns a range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByG_P_PrevAndNext(
			long institutionResearcherId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching inst researchers
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByCompanyId_PrevAndNext(
			long institutionResearcherId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUserId(long userId);

	/**
	 * Returns a range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByUserId_PrevAndNext(
			long institutionResearcherId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching inst researchers
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByInstitutionId(
		long institutionId);

	/**
	 * Returns a range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByInstitutionId_First(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByInstitutionId_Last(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByInstitutionId_PrevAndNext(
			long institutionResearcherId, long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public void removeByInstitutionId(long institutionId);

	/**
	 * Returns the number of inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching inst researchers
	 */
	public int countByInstitutionId(long institutionId);

	/**
	 * Returns all the inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the matching inst researchers
	 */
	public java.util.List<InstResearcher> findByResearcherId(long researcherId);

	/**
	 * Returns a range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	public java.util.List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByResearcherId_First(
			long researcherId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByResearcherId_First(
		long researcherId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	public InstResearcher findByResearcherId_Last(
			long researcherId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	public InstResearcher fetchByResearcherId_Last(
		long researcherId,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher[] findByResearcherId_PrevAndNext(
			long institutionResearcherId, long researcherId,
			com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
				orderByComparator)
		throws NoSuchInstResearcherException;

	/**
	 * Removes all the inst researchers where researcherId = &#63; from the database.
	 *
	 * @param researcherId the researcher ID
	 */
	public void removeByResearcherId(long researcherId);

	/**
	 * Returns the number of inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the number of matching inst researchers
	 */
	public int countByResearcherId(long researcherId);

	/**
	 * Caches the inst researcher in the entity cache if it is enabled.
	 *
	 * @param instResearcher the inst researcher
	 */
	public void cacheResult(InstResearcher instResearcher);

	/**
	 * Caches the inst researchers in the entity cache if it is enabled.
	 *
	 * @param instResearchers the inst researchers
	 */
	public void cacheResult(java.util.List<InstResearcher> instResearchers);

	/**
	 * Creates a new inst researcher with the primary key. Does not add the inst researcher to the database.
	 *
	 * @param institutionResearcherId the primary key for the new inst researcher
	 * @return the new inst researcher
	 */
	public InstResearcher create(long institutionResearcherId);

	/**
	 * Removes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher remove(long institutionResearcherId)
		throws NoSuchInstResearcherException;

	public InstResearcher updateImpl(InstResearcher instResearcher);

	/**
	 * Returns the inst researcher with the primary key or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	public InstResearcher findByPrimaryKey(long institutionResearcherId)
		throws NoSuchInstResearcherException;

	/**
	 * Returns the inst researcher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher, or <code>null</code> if a inst researcher with the primary key could not be found
	 */
	public InstResearcher fetchByPrimaryKey(long institutionResearcherId);

	/**
	 * Returns all the inst researchers.
	 *
	 * @return the inst researchers
	 */
	public java.util.List<InstResearcher> findAll();

	/**
	 * Returns a range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of inst researchers
	 */
	public java.util.List<InstResearcher> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inst researchers
	 */
	public java.util.List<InstResearcher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator);

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of inst researchers
	 */
	public java.util.List<InstResearcher> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstResearcher>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the inst researchers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of inst researchers.
	 *
	 * @return the number of inst researchers
	 */
	public int countAll();

}
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

import com.dhsoft.edc.backend.exception.NoSuchQueryException;
import com.dhsoft.edc.backend.model.Query;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the query service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryUtil
 * @generated
 */
@ProviderType
public interface QueryPersistence extends BasePersistence<Query> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QueryUtil} to access the query persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the queries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching queries
	 */
	public java.util.List<Query> findByUuid(String uuid);

	/**
	 * Returns a range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where uuid = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByUuid_PrevAndNext(
			long queryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of queries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching queries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQueryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUUID_G(String uuid, long groupId)
		throws NoSuchQueryException;

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the query where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the query that was removed
	 */
	public Query removeByUUID_G(String uuid, long groupId)
		throws NoSuchQueryException;

	/**
	 * Returns the number of queries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching queries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByUuid_C_PrevAndNext(
			long queryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of queries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching queries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the queries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByCompanyId_PrevAndNext(
			long queryId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of queries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching queries
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByG_P_PrevAndNext(
			long queryId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of queries where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching queries
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the queries where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByUserId(long userId);

	/**
	 * Returns a range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByUserId(long userId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where userId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByUserId_PrevAndNext(
			long queryId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of queries where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching queries
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Returns a range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 */
	public void removeByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Returns the number of queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching queries
	 */
	public int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Returns all the queries where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the matching queries
	 */
	public java.util.List<Query> findByItemCode(long itemCode);

	/**
	 * Returns a range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByItemCode(
		long itemCode, int start, int end);

	/**
	 * Returns an ordered range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByItemCode(
		long itemCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByItemCode(
		long itemCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByItemCode_First(
			long itemCode,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByItemCode_First(
		long itemCode,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByItemCode_Last(
			long itemCode,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByItemCode_Last(
		long itemCode,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where itemCode = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByItemCode_PrevAndNext(
			long queryId, long itemCode,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where itemCode = &#63; from the database.
	 *
	 * @param itemCode the item code
	 */
	public void removeByItemCode(long itemCode);

	/**
	 * Returns the number of queries where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the number of matching queries
	 */
	public int countByItemCode(long itemCode);

	/**
	 * Returns all the queries where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByOpenUserId(long openUserId);

	/**
	 * Returns a range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByOpenUserId(
		long openUserId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByOpenUserId(
		long openUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByOpenUserId(
		long openUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByOpenUserId_First(
			long openUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByOpenUserId_First(
		long openUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByOpenUserId_Last(
			long openUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByOpenUserId_Last(
		long openUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where openUserId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByOpenUserId_PrevAndNext(
			long queryId, long openUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where openUserId = &#63; from the database.
	 *
	 * @param openUserId the open user ID
	 */
	public void removeByOpenUserId(long openUserId);

	/**
	 * Returns the number of queries where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the number of matching queries
	 */
	public int countByOpenUserId(long openUserId);

	/**
	 * Returns all the queries where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByAnswerUserID(long answerUserID);

	/**
	 * Returns a range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByAnswerUserID(
		long answerUserID, int start, int end);

	/**
	 * Returns an ordered range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByAnswerUserID(
		long answerUserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByAnswerUserID(
		long answerUserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByAnswerUserID_First(
			long answerUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByAnswerUserID_First(
		long answerUserID,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByAnswerUserID_Last(
			long answerUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByAnswerUserID_Last(
		long answerUserID,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where answerUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByAnswerUserID_PrevAndNext(
			long queryId, long answerUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where answerUserID = &#63; from the database.
	 *
	 * @param answerUserID the answer user ID
	 */
	public void removeByAnswerUserID(long answerUserID);

	/**
	 * Returns the number of queries where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the number of matching queries
	 */
	public int countByAnswerUserID(long answerUserID);

	/**
	 * Returns all the queries where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByCloseUserID(long closeUserID);

	/**
	 * Returns a range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByCloseUserID(
		long closeUserID, int start, int end);

	/**
	 * Returns an ordered range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByCloseUserID(
		long closeUserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByCloseUserID(
		long closeUserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByCloseUserID_First(
			long closeUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByCloseUserID_First(
		long closeUserID,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByCloseUserID_Last(
			long closeUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByCloseUserID_Last(
		long closeUserID,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where closeUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByCloseUserID_PrevAndNext(
			long queryId, long closeUserID,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where closeUserID = &#63; from the database.
	 *
	 * @param closeUserID the close user ID
	 */
	public void removeByCloseUserID(long closeUserID);

	/**
	 * Returns the number of queries where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the number of matching queries
	 */
	public int countByCloseUserID(long closeUserID);

	/**
	 * Returns all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the matching queries
	 */
	public java.util.List<Query> findByR_R(long reopenId, long ruleId);

	/**
	 * Returns a range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	public java.util.List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end);

	/**
	 * Returns an ordered range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	public java.util.List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByR_R_First(
			long reopenId, long ruleId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the first query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByR_R_First(
		long reopenId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the last query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	public Query findByR_R_Last(
			long reopenId, long ruleId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Returns the last query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	public Query fetchByR_R_Last(
		long reopenId, long ruleId,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns the queries before and after the current query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query[] findByR_R_PrevAndNext(
			long queryId, long reopenId, long ruleId,
			com.liferay.portal.kernel.util.OrderByComparator<Query>
				orderByComparator)
		throws NoSuchQueryException;

	/**
	 * Removes all the queries where reopenId = &#63; and ruleId = &#63; from the database.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 */
	public void removeByR_R(long reopenId, long ruleId);

	/**
	 * Returns the number of queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the number of matching queries
	 */
	public int countByR_R(long reopenId, long ruleId);

	/**
	 * Caches the query in the entity cache if it is enabled.
	 *
	 * @param query the query
	 */
	public void cacheResult(Query query);

	/**
	 * Caches the queries in the entity cache if it is enabled.
	 *
	 * @param queries the queries
	 */
	public void cacheResult(java.util.List<Query> queries);

	/**
	 * Creates a new query with the primary key. Does not add the query to the database.
	 *
	 * @param queryId the primary key for the new query
	 * @return the new query
	 */
	public Query create(long queryId);

	/**
	 * Removes the query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryId the primary key of the query
	 * @return the query that was removed
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query remove(long queryId) throws NoSuchQueryException;

	public Query updateImpl(Query query);

	/**
	 * Returns the query with the primary key or throws a <code>NoSuchQueryException</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query
	 * @return the query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	public Query findByPrimaryKey(long queryId) throws NoSuchQueryException;

	/**
	 * Returns the query with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query
	 * @return the query, or <code>null</code> if a query with the primary key could not be found
	 */
	public Query fetchByPrimaryKey(long queryId);

	/**
	 * Returns all the queries.
	 *
	 * @return the queries
	 */
	public java.util.List<Query> findAll();

	/**
	 * Returns a range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of queries
	 */
	public java.util.List<Query> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of queries
	 */
	public java.util.List<Query> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator);

	/**
	 * Returns an ordered range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of queries
	 */
	public java.util.List<Query> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Query>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the queries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of queries.
	 *
	 * @return the number of queries
	 */
	public int countAll();

}
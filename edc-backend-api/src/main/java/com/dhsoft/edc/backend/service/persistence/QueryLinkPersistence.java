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

import com.dhsoft.edc.backend.exception.NoSuchQueryLinkException;
import com.dhsoft.edc.backend.model.QueryLink;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the query link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLinkUtil
 * @generated
 */
@ProviderType
public interface QueryLinkPersistence extends BasePersistence<QueryLink> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QueryLinkUtil} to access the query link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByUuid(String uuid);

	/**
	 * Returns a range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByUuid_PrevAndNext(
			long queryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching query links
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByUUID_G(String uuid, long groupId)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the query link where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the query link that was removed
	 */
	public QueryLink removeByUUID_G(String uuid, long groupId)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the number of query links where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching query links
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByUuid_C_PrevAndNext(
			long queryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching query links
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findBySubjectId(long subjectId);

	/**
	 * Returns a range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findBySubjectId(
		long subjectId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findBySubjectId_First(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchBySubjectId_First(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findBySubjectId_Last(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchBySubjectId_Last(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findBySubjectId_PrevAndNext(
			long queryId, long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public void removeBySubjectId(long subjectId);

	/**
	 * Returns the number of query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching query links
	 */
	public int countBySubjectId(long subjectId);

	/**
	 * Returns all the query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByInstanceId(long instanceId);

	/**
	 * Returns a range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByInstanceId(
		long instanceId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByInstanceId_First(
			long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByInstanceId_First(
		long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByInstanceId_Last(
			long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByInstanceId_Last(
		long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByInstanceId_PrevAndNext(
			long queryId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where instanceId = &#63; from the database.
	 *
	 * @param instanceId the instance ID
	 */
	public void removeByInstanceId(long instanceId);

	/**
	 * Returns the number of query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the number of matching query links
	 */
	public int countByInstanceId(long instanceId);

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId);

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_First(
			long subjectId, long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_First(
		long subjectId, long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_Last(
			long subjectId, long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_Last(
		long subjectId, long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByS_VG_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 */
	public void removeByS_VG(long subjectId, long visitGroupId);

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the number of matching query links
	 */
	public int countByS_VG(long subjectId, long visitGroupId);

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId);

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByS_VG_VD_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public void removeByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId);

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching query links
	 */
	public int countByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId);

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId);

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByS_VG_VD_VC_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 */
	public void removeByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId);

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching query links
	 */
	public int countByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId);

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId);

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_S_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_S_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_S_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_S_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByS_VG_VD_VC_S_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 */
	public void removeByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId);

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the number of matching query links
	 */
	public int countByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId);

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	public java.util.List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	public QueryLink findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	public QueryLink fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
				orderByComparator)
		throws NoSuchQueryLinkException;

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
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
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching query links
	 */
	public int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Caches the query link in the entity cache if it is enabled.
	 *
	 * @param queryLink the query link
	 */
	public void cacheResult(QueryLink queryLink);

	/**
	 * Caches the query links in the entity cache if it is enabled.
	 *
	 * @param queryLinks the query links
	 */
	public void cacheResult(java.util.List<QueryLink> queryLinks);

	/**
	 * Creates a new query link with the primary key. Does not add the query link to the database.
	 *
	 * @param queryId the primary key for the new query link
	 * @return the new query link
	 */
	public QueryLink create(long queryId);

	/**
	 * Removes the query link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link that was removed
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink remove(long queryId) throws NoSuchQueryLinkException;

	public QueryLink updateImpl(QueryLink queryLink);

	/**
	 * Returns the query link with the primary key or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	public QueryLink findByPrimaryKey(long queryId)
		throws NoSuchQueryLinkException;

	/**
	 * Returns the query link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link, or <code>null</code> if a query link with the primary key could not be found
	 */
	public QueryLink fetchByPrimaryKey(long queryId);

	/**
	 * Returns all the query links.
	 *
	 * @return the query links
	 */
	public java.util.List<QueryLink> findAll();

	/**
	 * Returns a range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of query links
	 */
	public java.util.List<QueryLink> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query links
	 */
	public java.util.List<QueryLink> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query links
	 */
	public java.util.List<QueryLink> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QueryLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the query links from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of query links.
	 *
	 * @return the number of query links
	 */
	public int countAll();

}
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

import com.dhsoft.edc.backend.exception.NoSuchVisitEventException;
import com.dhsoft.edc.backend.model.VisitEvent;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the visit event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitEventUtil
 * @generated
 */
@ProviderType
public interface VisitEventPersistence extends BasePersistence<VisitEvent> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VisitEventUtil} to access the visit event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid(String uuid);

	/**
	 * Returns a range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByUuid_PrevAndNext(
			long visitEventId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit events
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUUID_G(String uuid, long groupId)
		throws NoSuchVisitEventException;

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the visit event where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit event that was removed
	 */
	public VisitEvent removeByUUID_G(String uuid, long groupId)
		throws NoSuchVisitEventException;

	/**
	 * Returns the number of visit events where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit events
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByUuid_C_PrevAndNext(
			long visitEventId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByCompanyId_PrevAndNext(
			long visitEventId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByG_P_PrevAndNext(
			long visitEventId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit events
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId);

	/**
	 * Returns a range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end);

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByI_S_V_First(
			long institutionId, long subjectId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByI_S_V_First(
		long institutionId, long subjectId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByI_S_V_Last(
			long institutionId, long subjectId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByI_S_V_Last(
		long institutionId, long subjectId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByI_S_V_PrevAndNext(
			long visitEventId, long institutionId, long subjectId,
			long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public void removeByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId);

	/**
	 * Returns the number of visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching visit events
	 */
	public int countByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId);

	/**
	 * Returns all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId);

	/**
	 * Returns a range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByS_VD(
		long subjectId, long visitDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByS_VD_First(
			long subjectId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByS_VD_First(
		long subjectId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByS_VD_Last(
			long subjectId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByS_VD_Last(
		long subjectId, long visitDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByS_VD_PrevAndNext(
			long visitEventId, long subjectId, long visitDefinitionId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where subjectId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 */
	public void removeByS_VD(long subjectId, long visitDefinitionId);

	/**
	 * Returns the number of visit events where subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching visit events
	 */
	public int countByS_VD(long subjectId, long visitDefinitionId);

	/**
	 * Returns all the visit events where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findBysubjectId(long subjectId);

	/**
	 * Returns a range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findBysubjectId(
		long subjectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findBysubjectId_First(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchBysubjectId_First(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findBysubjectId_Last(
			long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchBysubjectId_Last(
		long subjectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where subjectId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findBysubjectId_PrevAndNext(
			long visitEventId, long subjectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	public void removeBysubjectId(long subjectId);

	/**
	 * Returns the number of visit events where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching visit events
	 */
	public int countBysubjectId(long subjectId);

	/**
	 * Returns all the visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit events
	 */
	public java.util.List<VisitEvent> findByUserId(long userId);

	/**
	 * Returns a range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	public java.util.List<VisitEvent> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	public VisitEvent findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	public VisitEvent fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where userId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent[] findByUserId_PrevAndNext(
			long visitEventId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
				orderByComparator)
		throws NoSuchVisitEventException;

	/**
	 * Removes all the visit events where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit events
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the visit event in the entity cache if it is enabled.
	 *
	 * @param visitEvent the visit event
	 */
	public void cacheResult(VisitEvent visitEvent);

	/**
	 * Caches the visit events in the entity cache if it is enabled.
	 *
	 * @param visitEvents the visit events
	 */
	public void cacheResult(java.util.List<VisitEvent> visitEvents);

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	public VisitEvent create(long visitEventId);

	/**
	 * Removes the visit event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event that was removed
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent remove(long visitEventId)
		throws NoSuchVisitEventException;

	public VisitEvent updateImpl(VisitEvent visitEvent);

	/**
	 * Returns the visit event with the primary key or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	public VisitEvent findByPrimaryKey(long visitEventId)
		throws NoSuchVisitEventException;

	/**
	 * Returns the visit event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event, or <code>null</code> if a visit event with the primary key could not be found
	 */
	public VisitEvent fetchByPrimaryKey(long visitEventId);

	/**
	 * Returns all the visit events.
	 *
	 * @return the visit events
	 */
	public java.util.List<VisitEvent> findAll();

	/**
	 * Returns a range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of visit events
	 */
	public java.util.List<VisitEvent> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit events
	 */
	public java.util.List<VisitEvent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit events
	 */
	public java.util.List<VisitEvent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitEvent>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the visit events from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	public int countAll();

}
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

import com.dhsoft.edc.backend.exception.NoSuchInstanceLinkException;
import com.dhsoft.edc.backend.model.InstanceLink;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the instance link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InstanceLinkUtil
 * @generated
 */
@ProviderType
public interface InstanceLinkPersistence extends BasePersistence<InstanceLink> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstanceLinkUtil} to access the instance link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the instance links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid(String uuid);

	/**
	 * Returns a range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where uuid = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByUuid_PrevAndNext(
			long linkId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of instance links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching instance links
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstanceLinkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUUID_G(String uuid, long groupId)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the instance link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the instance link where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the instance link that was removed
	 */
	public InstanceLink removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the number of instance links where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching instance links
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByUuid_C_PrevAndNext(
			long linkId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of instance links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching instance links
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the instance links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where companyId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByCompanyId_PrevAndNext(
			long linkId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of instance links where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching instance links
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByG_P_PrevAndNext(
			long linkId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of instance links where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching instance links
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the instance links where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByInstitutionId(long institutionId);

	/**
	 * Returns a range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByInstitutionId_First(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByInstitutionId_Last(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where institutionId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByInstitutionId_PrevAndNext(
			long linkId, long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public void removeByInstitutionId(long institutionId);

	/**
	 * Returns the number of instance links where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching instance links
	 */
	public int countByInstitutionId(long institutionId);

	/**
	 * Returns all the instance links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByUserId(long userId);

	/**
	 * Returns a range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where userId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByUserId_PrevAndNext(
			long linkId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of instance links where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching instance links
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching instance links
	 */
	public java.util.List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Returns a range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of matching instance links
	 */
	public java.util.List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end);

	/**
	 * Returns an ordered range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching instance links
	 */
	public java.util.List<InstanceLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the first instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the last instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link
	 * @throws NoSuchInstanceLinkException if a matching instance link could not be found
	 */
	public InstanceLink findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the last instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching instance link, or <code>null</code> if a matching instance link could not be found
	 */
	public InstanceLink fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns the instance links before and after the current instance link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param linkId the primary key of the current instance link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long linkId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId,
			com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
				orderByComparator)
		throws NoSuchInstanceLinkException;

	/**
	 * Removes all the instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
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
	 * Returns the number of instance links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching instance links
	 */
	public int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId);

	/**
	 * Caches the instance link in the entity cache if it is enabled.
	 *
	 * @param instanceLink the instance link
	 */
	public void cacheResult(InstanceLink instanceLink);

	/**
	 * Caches the instance links in the entity cache if it is enabled.
	 *
	 * @param instanceLinks the instance links
	 */
	public void cacheResult(java.util.List<InstanceLink> instanceLinks);

	/**
	 * Creates a new instance link with the primary key. Does not add the instance link to the database.
	 *
	 * @param linkId the primary key for the new instance link
	 * @return the new instance link
	 */
	public InstanceLink create(long linkId);

	/**
	 * Removes the instance link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link that was removed
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink remove(long linkId) throws NoSuchInstanceLinkException;

	public InstanceLink updateImpl(InstanceLink instanceLink);

	/**
	 * Returns the instance link with the primary key or throws a <code>NoSuchInstanceLinkException</code> if it could not be found.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link
	 * @throws NoSuchInstanceLinkException if a instance link with the primary key could not be found
	 */
	public InstanceLink findByPrimaryKey(long linkId)
		throws NoSuchInstanceLinkException;

	/**
	 * Returns the instance link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linkId the primary key of the instance link
	 * @return the instance link, or <code>null</code> if a instance link with the primary key could not be found
	 */
	public InstanceLink fetchByPrimaryKey(long linkId);

	/**
	 * Returns all the instance links.
	 *
	 * @return the instance links
	 */
	public java.util.List<InstanceLink> findAll();

	/**
	 * Returns a range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @return the range of instance links
	 */
	public java.util.List<InstanceLink> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of instance links
	 */
	public java.util.List<InstanceLink> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator);

	/**
	 * Returns an ordered range of all the instance links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstanceLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of instance links
	 * @param end the upper bound of the range of instance links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of instance links
	 */
	public java.util.List<InstanceLink> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InstanceLink>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the instance links from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of instance links.
	 *
	 * @return the number of instance links
	 */
	public int countAll();

}
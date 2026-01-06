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

import com.dhsoft.edc.backend.exception.NoSuchAssignInstitutionRoleException;
import com.dhsoft.edc.backend.model.AssignInstitutionRole;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assign institution role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignInstitutionRoleUtil
 * @generated
 */
@ProviderType
public interface AssignInstitutionRolePersistence
	extends BasePersistence<AssignInstitutionRole> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssignInstitutionRoleUtil} to access the assign institution role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid(String uuid);

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole[] findByUuid_PrevAndNext(
			long institutionRoleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Removes all the assign institution roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign institution roles
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByUUID_G(String uuid, long groupId)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the assign institution role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign institution role that was removed
	 */
	public AssignInstitutionRole removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign institution roles
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole[] findByUuid_C_PrevAndNext(
			long institutionRoleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Removes all the assign institution roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign institution roles
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitution(
		long institutionId);

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end);

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByInstitution_First(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitution_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByInstitution_Last(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitution_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole[] findByInstitution_PrevAndNext(
			long institutionRoleId, long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Removes all the assign institution roles where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public void removeByInstitution(long institutionId);

	/**
	 * Returns the number of assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign institution roles
	 */
	public int countByInstitution(long institutionId);

	/**
	 * Returns all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId);

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end);

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByInstitutionAndUser_First(
			long institutionId, long targetUserId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitutionAndUser_First(
		long institutionId, long targetUserId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByInstitutionAndUser_Last(
			long institutionId, long targetUserId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitutionAndUser_Last(
		long institutionId, long targetUserId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole[] findByInstitutionAndUser_PrevAndNext(
			long institutionRoleId, long institutionId, long targetUserId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Removes all the assign institution roles where institutionId = &#63; and targetUserId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 */
	public void removeByInstitutionAndUser(
		long institutionId, long targetUserId);

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the number of matching assign institution roles
	 */
	public int countByInstitutionAndUser(long institutionId, long targetUserId);

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole findByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName);

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	public AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName,
		boolean useFinderCache);

	/**
	 * Removes the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the assign institution role that was removed
	 */
	public AssignInstitutionRole removeByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63; and roleName = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the number of matching assign institution roles
	 */
	public int countByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName);

	/**
	 * Caches the assign institution role in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRole the assign institution role
	 */
	public void cacheResult(AssignInstitutionRole assignInstitutionRole);

	/**
	 * Caches the assign institution roles in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRoles the assign institution roles
	 */
	public void cacheResult(
		java.util.List<AssignInstitutionRole> assignInstitutionRoles);

	/**
	 * Creates a new assign institution role with the primary key. Does not add the assign institution role to the database.
	 *
	 * @param institutionRoleId the primary key for the new assign institution role
	 * @return the new assign institution role
	 */
	public AssignInstitutionRole create(long institutionRoleId);

	/**
	 * Removes the assign institution role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role that was removed
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole remove(long institutionRoleId)
		throws NoSuchAssignInstitutionRoleException;

	public AssignInstitutionRole updateImpl(
		AssignInstitutionRole assignInstitutionRole);

	/**
	 * Returns the assign institution role with the primary key or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole findByPrimaryKey(long institutionRoleId)
		throws NoSuchAssignInstitutionRoleException;

	/**
	 * Returns the assign institution role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role, or <code>null</code> if a assign institution role with the primary key could not be found
	 */
	public AssignInstitutionRole fetchByPrimaryKey(long institutionRoleId);

	/**
	 * Returns all the assign institution roles.
	 *
	 * @return the assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findAll();

	/**
	 * Returns a range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign institution roles
	 */
	public java.util.List<AssignInstitutionRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignInstitutionRole>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assign institution roles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assign institution roles.
	 *
	 * @return the number of assign institution roles
	 */
	public int countAll();

}
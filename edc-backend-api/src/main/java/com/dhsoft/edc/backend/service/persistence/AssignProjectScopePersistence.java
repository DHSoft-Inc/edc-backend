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

import com.dhsoft.edc.backend.exception.NoSuchAssignProjectScopeException;
import com.dhsoft.edc.backend.model.AssignProjectScope;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assign project scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignProjectScopeUtil
 * @generated
 */
@ProviderType
public interface AssignProjectScopePersistence
	extends BasePersistence<AssignProjectScope> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssignProjectScopeUtil} to access the assign project scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid(String uuid);

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope[] findByUuid_PrevAndNext(
			long projectScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Removes all the assign project scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign project scopes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUUID_G(String uuid, long groupId)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the assign project scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign project scope that was removed
	 */
	public AssignProjectScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign project scopes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope[] findByUuid_C_PrevAndNext(
			long projectScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Removes all the assign project scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign project scopes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId);

	/**
	 * Returns a range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByInstitutionProject_First(
			long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByInstitutionProject_First(
		long institutionId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByInstitutionProject_Last(
			long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope[] findByInstitutionProject_PrevAndNext(
			long projectScopeId, long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Removes all the assign project scopes where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	public void removeByInstitutionProject(long institutionId, long projectId);

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	public int countByInstitutionProject(long institutionId, long projectId);

	/**
	 * Returns all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId);

	/**
	 * Returns a range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	public java.util.List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUserProject_First(
			long targetUserId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUserProject_First(
		long targetUserId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUserProject_Last(
			long targetUserId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUserProject_Last(
		long targetUserId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope[] findByUserProject_PrevAndNext(
			long projectScopeId, long targetUserId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
				orderByComparator)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Removes all the assign project scopes where targetUserId = &#63; and projectId = &#63; from the database.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 */
	public void removeByUserProject(long targetUserId, long projectId);

	/**
	 * Returns the number of assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	public int countByUserProject(long targetUserId, long projectId);

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	public AssignProjectScope findByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole);

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	public AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId, String scopeRole,
		boolean useFinderCache);

	/**
	 * Removes the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the assign project scope that was removed
	 */
	public AssignProjectScope removeByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the number of matching assign project scopes
	 */
	public int countByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole);

	/**
	 * Caches the assign project scope in the entity cache if it is enabled.
	 *
	 * @param assignProjectScope the assign project scope
	 */
	public void cacheResult(AssignProjectScope assignProjectScope);

	/**
	 * Caches the assign project scopes in the entity cache if it is enabled.
	 *
	 * @param assignProjectScopes the assign project scopes
	 */
	public void cacheResult(
		java.util.List<AssignProjectScope> assignProjectScopes);

	/**
	 * Creates a new assign project scope with the primary key. Does not add the assign project scope to the database.
	 *
	 * @param projectScopeId the primary key for the new assign project scope
	 * @return the new assign project scope
	 */
	public AssignProjectScope create(long projectScopeId);

	/**
	 * Removes the assign project scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope that was removed
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope remove(long projectScopeId)
		throws NoSuchAssignProjectScopeException;

	public AssignProjectScope updateImpl(AssignProjectScope assignProjectScope);

	/**
	 * Returns the assign project scope with the primary key or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope findByPrimaryKey(long projectScopeId)
		throws NoSuchAssignProjectScopeException;

	/**
	 * Returns the assign project scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope, or <code>null</code> if a assign project scope with the primary key could not be found
	 */
	public AssignProjectScope fetchByPrimaryKey(long projectScopeId);

	/**
	 * Returns all the assign project scopes.
	 *
	 * @return the assign project scopes
	 */
	public java.util.List<AssignProjectScope> findAll();

	/**
	 * Returns a range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of assign project scopes
	 */
	public java.util.List<AssignProjectScope> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign project scopes
	 */
	public java.util.List<AssignProjectScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign project scopes
	 */
	public java.util.List<AssignProjectScope> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignProjectScope>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assign project scopes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assign project scopes.
	 *
	 * @return the number of assign project scopes
	 */
	public int countAll();

}
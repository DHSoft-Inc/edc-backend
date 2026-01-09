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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionScopeAuditException;
import com.dhsoft.edc.backend.model.EdcPermissionScopeAudit;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edc permission scope audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionScopeAuditUtil
 * @generated
 */
@ProviderType
public interface EdcPermissionScopeAuditPersistence
	extends BasePersistence<EdcPermissionScopeAudit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdcPermissionScopeAuditUtil} to access the edc permission scope audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid(String uuid);

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit[] findByUuid_PrevAndNext(
			long auditScopeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scope audits
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the edc permission scope audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope audit that was removed
	 */
	public EdcPermissionScopeAudit removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scope audits
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit[] findByUuid_C_PrevAndNext(
			long auditScopeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scope audits
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName);

	/**
	 * Returns a range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByRoleNameScope_First(
			String roleName,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByRoleNameScope_First(
		String roleName,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByRoleNameScope_Last(
			String roleName,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByRoleNameScope_Last(
		String roleName,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit[] findByRoleNameScope_PrevAndNext(
			long auditScopeId, String roleName,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Removes all the edc permission scope audits where roleName = &#63; from the database.
	 *
	 * @param roleName the role name
	 */
	public void removeByRoleNameScope(String roleName);

	/**
	 * Returns the number of edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the number of matching edc permission scope audits
	 */
	public int countByRoleNameScope(String roleName);

	/**
	 * Returns all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey);

	/**
	 * Returns a range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByModuleTaskScope_First(
			String moduleName, String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByModuleTaskScope_First(
		String moduleName, String taskKey,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit findByModuleTaskScope_Last(
			String moduleName, String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	public EdcPermissionScopeAudit fetchByModuleTaskScope_Last(
		String moduleName, String taskKey,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit[] findByModuleTaskScope_PrevAndNext(
			long auditScopeId, String moduleName, String taskKey,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Removes all the edc permission scope audits where moduleName = &#63; and taskKey = &#63; from the database.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 */
	public void removeByModuleTaskScope(String moduleName, String taskKey);

	/**
	 * Returns the number of edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the number of matching edc permission scope audits
	 */
	public int countByModuleTaskScope(String moduleName, String taskKey);

	/**
	 * Caches the edc permission scope audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 */
	public void cacheResult(EdcPermissionScopeAudit edcPermissionScopeAudit);

	/**
	 * Caches the edc permission scope audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudits the edc permission scope audits
	 */
	public void cacheResult(
		java.util.List<EdcPermissionScopeAudit> edcPermissionScopeAudits);

	/**
	 * Creates a new edc permission scope audit with the primary key. Does not add the edc permission scope audit to the database.
	 *
	 * @param auditScopeId the primary key for the new edc permission scope audit
	 * @return the new edc permission scope audit
	 */
	public EdcPermissionScopeAudit create(long auditScopeId);

	/**
	 * Removes the edc permission scope audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit remove(long auditScopeId)
		throws NoSuchEdcPermissionScopeAuditException;

	public EdcPermissionScopeAudit updateImpl(
		EdcPermissionScopeAudit edcPermissionScopeAudit);

	/**
	 * Returns the edc permission scope audit with the primary key or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit findByPrimaryKey(long auditScopeId)
		throws NoSuchEdcPermissionScopeAuditException;

	/**
	 * Returns the edc permission scope audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit, or <code>null</code> if a edc permission scope audit with the primary key could not be found
	 */
	public EdcPermissionScopeAudit fetchByPrimaryKey(long auditScopeId);

	/**
	 * Returns all the edc permission scope audits.
	 *
	 * @return the edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findAll();

	/**
	 * Returns a range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission scope audits
	 */
	public java.util.List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the edc permission scope audits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of edc permission scope audits.
	 *
	 * @return the number of edc permission scope audits
	 */
	public int countAll();

}
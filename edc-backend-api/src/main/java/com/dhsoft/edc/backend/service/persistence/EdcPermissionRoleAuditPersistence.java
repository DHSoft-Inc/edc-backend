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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionRoleAuditException;
import com.dhsoft.edc.backend.model.EdcPermissionRoleAudit;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edc permission role audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdcPermissionRoleAuditUtil
 * @generated
 */
@ProviderType
public interface EdcPermissionRoleAuditPersistence
	extends BasePersistence<EdcPermissionRoleAudit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EdcPermissionRoleAuditUtil} to access the edc permission role audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid(String uuid);

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit[] findByUuid_PrevAndNext(
			long auditRoleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Removes all the edc permission role audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission role audits
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the edc permission role audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role audit that was removed
	 */
	public EdcPermissionRoleAudit removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission role audits
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit[] findByUuid_C_PrevAndNext(
			long auditRoleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Removes all the edc permission role audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission role audits
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup);

	/**
	 * Returns a range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByActorGroupRole_First(
			long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByActorGroupRole_First(
		long actorGroup,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByActorGroupRole_Last(
			long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByActorGroupRole_Last(
		long actorGroup,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit[] findByActorGroupRole_PrevAndNext(
			long auditRoleId, long actorGroup,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Removes all the edc permission role audits where actorGroup = &#63; from the database.
	 *
	 * @param actorGroup the actor group
	 */
	public void removeByActorGroupRole(long actorGroup);

	/**
	 * Returns the number of edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission role audits
	 */
	public int countByActorGroupRole(long actorGroup);

	/**
	 * Returns all the edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorRole(long actorId);

	/**
	 * Returns a range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end);

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByActorRole_First(
			long actorId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByActorRole_First(
		long actorId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit findByActorRole_Last(
			long actorId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	public EdcPermissionRoleAudit fetchByActorRole_Last(
		long actorId,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit[] findByActorRole_PrevAndNext(
			long auditRoleId, long actorId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Removes all the edc permission role audits where actorId = &#63; from the database.
	 *
	 * @param actorId the actor ID
	 */
	public void removeByActorRole(long actorId);

	/**
	 * Returns the number of edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the number of matching edc permission role audits
	 */
	public int countByActorRole(long actorId);

	/**
	 * Caches the edc permission role audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 */
	public void cacheResult(EdcPermissionRoleAudit edcPermissionRoleAudit);

	/**
	 * Caches the edc permission role audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudits the edc permission role audits
	 */
	public void cacheResult(
		java.util.List<EdcPermissionRoleAudit> edcPermissionRoleAudits);

	/**
	 * Creates a new edc permission role audit with the primary key. Does not add the edc permission role audit to the database.
	 *
	 * @param auditRoleId the primary key for the new edc permission role audit
	 * @return the new edc permission role audit
	 */
	public EdcPermissionRoleAudit create(long auditRoleId);

	/**
	 * Removes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit remove(long auditRoleId)
		throws NoSuchEdcPermissionRoleAuditException;

	public EdcPermissionRoleAudit updateImpl(
		EdcPermissionRoleAudit edcPermissionRoleAudit);

	/**
	 * Returns the edc permission role audit with the primary key or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit findByPrimaryKey(long auditRoleId)
		throws NoSuchEdcPermissionRoleAuditException;

	/**
	 * Returns the edc permission role audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit, or <code>null</code> if a edc permission role audit with the primary key could not be found
	 */
	public EdcPermissionRoleAudit fetchByPrimaryKey(long auditRoleId);

	/**
	 * Returns all the edc permission role audits.
	 *
	 * @return the edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findAll();

	/**
	 * Returns a range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission role audits
	 */
	public java.util.List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EdcPermissionRoleAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the edc permission role audits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of edc permission role audits.
	 *
	 * @return the number of edc permission role audits
	 */
	public int countAll();

}
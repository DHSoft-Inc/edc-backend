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

import com.dhsoft.edc.backend.exception.NoSuchAssignAuditException;
import com.dhsoft.edc.backend.model.AssignAudit;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assign audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignAuditUtil
 * @generated
 */
@ProviderType
public interface AssignAuditPersistence extends BasePersistence<AssignAudit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssignAuditUtil} to access the assign audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid(String uuid);

	/**
	 * Returns a range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit[] findByUuid_PrevAndNext(
			long auditId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Removes all the assign audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign audits
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit[] findByUuid_C_PrevAndNext(
			long auditId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Removes all the assign audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign audits
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitution(long institutionId);

	/**
	 * Returns a range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitution(
		long institutionId, int start, int end);

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByInstitution_First(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByInstitution_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByInstitution_Last(
			long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByInstitution_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit[] findByInstitution_PrevAndNext(
			long auditId, long institutionId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Removes all the assign audits where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	public void removeByInstitution(long institutionId);

	/**
	 * Returns the number of assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign audits
	 */
	public int countByInstitution(long institutionId);

	/**
	 * Returns all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId);

	/**
	 * Returns a range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	public java.util.List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByInstitutionProject_First(
			long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByInstitutionProject_First(
		long institutionId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	public AssignAudit findByInstitutionProject_Last(
			long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	public AssignAudit fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit[] findByInstitutionProject_PrevAndNext(
			long auditId, long institutionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
				orderByComparator)
		throws NoSuchAssignAuditException;

	/**
	 * Removes all the assign audits where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	public void removeByInstitutionProject(long institutionId, long projectId);

	/**
	 * Returns the number of assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign audits
	 */
	public int countByInstitutionProject(long institutionId, long projectId);

	/**
	 * Caches the assign audit in the entity cache if it is enabled.
	 *
	 * @param assignAudit the assign audit
	 */
	public void cacheResult(AssignAudit assignAudit);

	/**
	 * Caches the assign audits in the entity cache if it is enabled.
	 *
	 * @param assignAudits the assign audits
	 */
	public void cacheResult(java.util.List<AssignAudit> assignAudits);

	/**
	 * Creates a new assign audit with the primary key. Does not add the assign audit to the database.
	 *
	 * @param auditId the primary key for the new assign audit
	 * @return the new assign audit
	 */
	public AssignAudit create(long auditId);

	/**
	 * Removes the assign audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit that was removed
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit remove(long auditId) throws NoSuchAssignAuditException;

	public AssignAudit updateImpl(AssignAudit assignAudit);

	/**
	 * Returns the assign audit with the primary key or throws a <code>NoSuchAssignAuditException</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	public AssignAudit findByPrimaryKey(long auditId)
		throws NoSuchAssignAuditException;

	/**
	 * Returns the assign audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit, or <code>null</code> if a assign audit with the primary key could not be found
	 */
	public AssignAudit fetchByPrimaryKey(long auditId);

	/**
	 * Returns all the assign audits.
	 *
	 * @return the assign audits
	 */
	public java.util.List<AssignAudit> findAll();

	/**
	 * Returns a range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of assign audits
	 */
	public java.util.List<AssignAudit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign audits
	 */
	public java.util.List<AssignAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign audits
	 */
	public java.util.List<AssignAudit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssignAudit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assign audits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assign audits.
	 *
	 * @return the number of assign audits
	 */
	public int countAll();

}
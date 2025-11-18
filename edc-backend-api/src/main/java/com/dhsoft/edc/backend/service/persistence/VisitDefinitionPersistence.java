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

import com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException;
import com.dhsoft.edc.backend.model.VisitDefinition;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the visit definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitDefinitionUtil
 * @generated
 */
@ProviderType
public interface VisitDefinitionPersistence
	extends BasePersistence<VisitDefinition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VisitDefinitionUtil} to access the visit definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid(String uuid);

	/**
	 * Returns a range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByUuid_PrevAndNext(
			long visitDefinitionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit definitions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUUID_G(String uuid, long groupId)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit definition that was removed
	 */
	public VisitDefinition removeByUUID_G(String uuid, long groupId)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the number of visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit definitions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByUuid_C_PrevAndNext(
			long visitDefinitionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByCompanyId_PrevAndNext(
			long visitDefinitionId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByG_P(
		long groupId, long projectId);

	/**
	 * Returns a range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByG_P_PrevAndNext(
			long visitDefinitionId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByProjectId(long projectId);

	/**
	 * Returns a range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByProjectId(
		long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByProjectId_First(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByProjectId_First(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByProjectId_Last(
			long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByProjectId_Last(
		long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByProjectId_PrevAndNext(
			long visitDefinitionId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	public void removeByProjectId(long projectId);

	/**
	 * Returns the number of visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	public int countByProjectId(long projectId);

	/**
	 * Returns all the visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitGroupId(
		long visitGroupId);

	/**
	 * Returns a range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByVisitGroupId_PrevAndNext(
			long visitDefinitionId, long visitGroupId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	public void removeByVisitGroupId(long visitGroupId);

	/**
	 * Returns the number of visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching visit definitions
	 */
	public int countByVisitGroupId(long visitGroupId);

	/**
	 * Returns all the visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUserId(long userId);

	/**
	 * Returns a range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where userId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByUserId_PrevAndNext(
			long visitDefinitionId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit definitions
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitCRFId(long visitCRFId);

	/**
	 * Returns a range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit definitions
	 */
	public java.util.List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByVisitCRFId_First(
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	public VisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	public VisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition[] findByVisitCRFId_PrevAndNext(
			long visitDefinitionId, long visitCRFId,
			com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
				orderByComparator)
		throws NoSuchVisitDefinitionException;

	/**
	 * Removes all the visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	public void removeByVisitCRFId(long visitCRFId);

	/**
	 * Returns the number of visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching visit definitions
	 */
	public int countByVisitCRFId(long visitCRFId);

	/**
	 * Caches the visit definition in the entity cache if it is enabled.
	 *
	 * @param visitDefinition the visit definition
	 */
	public void cacheResult(VisitDefinition visitDefinition);

	/**
	 * Caches the visit definitions in the entity cache if it is enabled.
	 *
	 * @param visitDefinitions the visit definitions
	 */
	public void cacheResult(java.util.List<VisitDefinition> visitDefinitions);

	/**
	 * Creates a new visit definition with the primary key. Does not add the visit definition to the database.
	 *
	 * @param visitDefinitionId the primary key for the new visit definition
	 * @return the new visit definition
	 */
	public VisitDefinition create(long visitDefinitionId);

	/**
	 * Removes the visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition that was removed
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition remove(long visitDefinitionId)
		throws NoSuchVisitDefinitionException;

	public VisitDefinition updateImpl(VisitDefinition visitDefinition);

	/**
	 * Returns the visit definition with the primary key or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	public VisitDefinition findByPrimaryKey(long visitDefinitionId)
		throws NoSuchVisitDefinitionException;

	/**
	 * Returns the visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition, or <code>null</code> if a visit definition with the primary key could not be found
	 */
	public VisitDefinition fetchByPrimaryKey(long visitDefinitionId);

	/**
	 * Returns all the visit definitions.
	 *
	 * @return the visit definitions
	 */
	public java.util.List<VisitDefinition> findAll();

	/**
	 * Returns a range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @return the range of visit definitions
	 */
	public java.util.List<VisitDefinition> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit definitions
	 */
	public java.util.List<VisitDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit definitions
	 * @param end the upper bound of the range of visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit definitions
	 */
	public java.util.List<VisitDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the visit definitions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of visit definitions.
	 *
	 * @return the number of visit definitions
	 */
	public int countAll();

}
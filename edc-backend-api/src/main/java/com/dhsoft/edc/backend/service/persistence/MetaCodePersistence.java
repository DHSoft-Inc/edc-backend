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

import com.dhsoft.edc.backend.exception.NoSuchMetaCodeException;
import com.dhsoft.edc.backend.model.MetaCode;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the meta code service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetaCodeUtil
 * @generated
 */
@ProviderType
public interface MetaCodePersistence extends BasePersistence<MetaCode> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MetaCodeUtil} to access the meta code persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the meta codes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid(String uuid);

	/**
	 * Returns a range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where uuid = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode[] findByUuid_PrevAndNext(
			long metaCodeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Removes all the meta codes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of meta codes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meta codes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMetaCodeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUUID_G(String uuid, long groupId)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the meta code where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the meta code where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meta code that was removed
	 */
	public MetaCode removeByUUID_G(String uuid, long groupId)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the number of meta codes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meta codes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the first meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the last meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode[] findByUuid_C_PrevAndNext(
			long metaCodeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Removes all the meta codes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of meta codes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meta codes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching meta codes
	 */
	public java.util.List<MetaCode> findByG_P(long groupId, long projectId);

	/**
	 * Returns a range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public java.util.List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end);

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByG_P(
		long groupId, long projectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByG_P_First(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the first meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByG_P_First(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByG_P_Last(
			long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the last meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByG_P_Last(
		long groupId, long projectId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode[] findByG_P_PrevAndNext(
			long metaCodeId, long groupId, long projectId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Removes all the meta codes where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	public void removeByG_P(long groupId, long projectId);

	/**
	 * Returns the number of meta codes where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching meta codes
	 */
	public int countByG_P(long groupId, long projectId);

	/**
	 * Returns all the meta codes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching meta codes
	 */
	public java.util.List<MetaCode> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public java.util.List<MetaCode> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the first meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the last meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the last meta code in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where companyId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode[] findByCompanyId_PrevAndNext(
			long metaCodeId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Removes all the meta codes where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of meta codes where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching meta codes
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the meta codes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching meta codes
	 */
	public java.util.List<MetaCode> findByUserId(long userId);

	/**
	 * Returns a range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta codes
	 */
	public java.util.List<MetaCode> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the first meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the last meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code
	 * @throws NoSuchMetaCodeException if a matching meta code could not be found
	 */
	public MetaCode findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the last meta code in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta code, or <code>null</code> if a matching meta code could not be found
	 */
	public MetaCode fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns the meta codes before and after the current meta code in the ordered set where userId = &#63;.
	 *
	 * @param metaCodeId the primary key of the current meta code
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode[] findByUserId_PrevAndNext(
			long metaCodeId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
				orderByComparator)
		throws NoSuchMetaCodeException;

	/**
	 * Removes all the meta codes where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of meta codes where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching meta codes
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the meta code in the entity cache if it is enabled.
	 *
	 * @param metaCode the meta code
	 */
	public void cacheResult(MetaCode metaCode);

	/**
	 * Caches the meta codes in the entity cache if it is enabled.
	 *
	 * @param metaCodes the meta codes
	 */
	public void cacheResult(java.util.List<MetaCode> metaCodes);

	/**
	 * Creates a new meta code with the primary key. Does not add the meta code to the database.
	 *
	 * @param metaCodeId the primary key for the new meta code
	 * @return the new meta code
	 */
	public MetaCode create(long metaCodeId);

	/**
	 * Removes the meta code with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code that was removed
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode remove(long metaCodeId) throws NoSuchMetaCodeException;

	public MetaCode updateImpl(MetaCode metaCode);

	/**
	 * Returns the meta code with the primary key or throws a <code>NoSuchMetaCodeException</code> if it could not be found.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code
	 * @throws NoSuchMetaCodeException if a meta code with the primary key could not be found
	 */
	public MetaCode findByPrimaryKey(long metaCodeId)
		throws NoSuchMetaCodeException;

	/**
	 * Returns the meta code with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param metaCodeId the primary key of the meta code
	 * @return the meta code, or <code>null</code> if a meta code with the primary key could not be found
	 */
	public MetaCode fetchByPrimaryKey(long metaCodeId);

	/**
	 * Returns all the meta codes.
	 *
	 * @return the meta codes
	 */
	public java.util.List<MetaCode> findAll();

	/**
	 * Returns a range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @return the range of meta codes
	 */
	public java.util.List<MetaCode> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meta codes
	 */
	public java.util.List<MetaCode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the meta codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaCodeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta codes
	 * @param end the upper bound of the range of meta codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meta codes
	 */
	public java.util.List<MetaCode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetaCode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the meta codes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of meta codes.
	 *
	 * @return the number of meta codes
	 */
	public int countAll();

}
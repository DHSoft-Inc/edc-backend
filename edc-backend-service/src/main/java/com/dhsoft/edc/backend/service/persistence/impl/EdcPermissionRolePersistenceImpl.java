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

package com.dhsoft.edc.backend.service.persistence.impl;

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionRoleException;
import com.dhsoft.edc.backend.model.EdcPermissionRole;
import com.dhsoft.edc.backend.model.impl.EdcPermissionRoleImpl;
import com.dhsoft.edc.backend.model.impl.EdcPermissionRoleModelImpl;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionRolePersistence;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionRoleUtil;
import com.dhsoft.edc.backend.service.persistence.impl.constants.EDCPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the edc permission role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EdcPermissionRolePersistence.class)
public class EdcPermissionRolePersistenceImpl
	extends BasePersistenceImpl<EdcPermissionRole>
	implements EdcPermissionRolePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EdcPermissionRoleUtil</code> to access the edc permission role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EdcPermissionRoleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRole edcPermissionRole : list) {
					if (!uuid.equals(edcPermissionRole.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByUuid_First(
			String uuid, OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByUuid_First(
			uuid, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUuid_First(
		String uuid, OrderByComparator<EdcPermissionRole> orderByComparator) {

		List<EdcPermissionRole> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByUuid_Last(
			String uuid, OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByUuid_Last(
			uuid, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUuid_Last(
		String uuid, OrderByComparator<EdcPermissionRole> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRole> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where uuid = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole[] findByUuid_PrevAndNext(
			long permissionRoleId, String uuid,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionRole edcPermissionRole = findByPrimaryKey(
			permissionRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole[] array = new EdcPermissionRoleImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, edcPermissionRole, uuid, orderByComparator, true);

			array[1] = edcPermissionRole;

			array[2] = getByUuid_PrevAndNext(
				session, edcPermissionRole, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionRole getByUuid_PrevAndNext(
		Session session, EdcPermissionRole edcPermissionRole, String uuid,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EdcPermissionRole edcPermissionRole :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"edcPermissionRole.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(edcPermissionRole.uuid IS NULL OR edcPermissionRole.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByUUID_G(uuid, groupId);

		if (edcPermissionRole == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchEdcPermissionRoleException(sb.toString());
		}

		return edcPermissionRole;
	}

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the edc permission role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof EdcPermissionRole) {
			EdcPermissionRole edcPermissionRole = (EdcPermissionRole)result;

			if (!Objects.equals(uuid, edcPermissionRole.getUuid()) ||
				(groupId != edcPermissionRole.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<EdcPermissionRole> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EdcPermissionRole edcPermissionRole = list.get(0);

					result = edcPermissionRole;

					cacheResult(edcPermissionRole);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EdcPermissionRole)result;
		}
	}

	/**
	 * Removes the edc permission role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role that was removed
	 */
	@Override
	public EdcPermissionRole removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = findByUUID_G(uuid, groupId);

		return remove(edcPermissionRole);
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"edcPermissionRole.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(edcPermissionRole.uuid IS NULL OR edcPermissionRole.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"edcPermissionRole.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRole edcPermissionRole : list) {
					if (!uuid.equals(edcPermissionRole.getUuid()) ||
						(companyId != edcPermissionRole.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the first edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		List<EdcPermissionRole> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the last edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRole> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole[] findByUuid_C_PrevAndNext(
			long permissionRoleId, String uuid, long companyId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionRole edcPermissionRole = findByPrimaryKey(
			permissionRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole[] array = new EdcPermissionRoleImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, edcPermissionRole, uuid, companyId, orderByComparator,
				true);

			array[1] = edcPermissionRole;

			array[2] = getByUuid_C_PrevAndNext(
				session, edcPermissionRole, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionRole getByUuid_C_PrevAndNext(
		Session session, EdcPermissionRole edcPermissionRole, String uuid,
		long companyId, OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EdcPermissionRole edcPermissionRole :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"edcPermissionRole.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(edcPermissionRole.uuid IS NULL OR edcPermissionRole.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"edcPermissionRole.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByEdcProjectRole;
	private FinderPath _finderPathWithoutPaginationFindByEdcProjectRole;
	private FinderPath _finderPathCountByEdcProjectRole;

	/**
	 * Returns all the edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcProjectRole(long projectId) {
		return findByEdcProjectRole(
			projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end) {

		return findByEdcProjectRole(projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findByEdcProjectRole(
			projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcProjectRole(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEdcProjectRole;
				finderArgs = new Object[] {projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcProjectRole;
			finderArgs = new Object[] {
				projectId, start, end, orderByComparator
			};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRole edcPermissionRole : list) {
					if (projectId != edcPermissionRole.getProjectId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPROJECTROLE_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcProjectRole_First(
			long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcProjectRole_First(
			projectId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcProjectRole_First(
		long projectId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		List<EdcPermissionRole> list = findByEdcProjectRole(
			projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcProjectRole_Last(
			long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcProjectRole_Last(
			projectId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcProjectRole_Last(
		long projectId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		int count = countByEdcProjectRole(projectId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRole> list = findByEdcProjectRole(
			projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole[] findByEdcProjectRole_PrevAndNext(
			long permissionRoleId, long projectId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = findByPrimaryKey(
			permissionRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole[] array = new EdcPermissionRoleImpl[3];

			array[0] = getByEdcProjectRole_PrevAndNext(
				session, edcPermissionRole, projectId, orderByComparator, true);

			array[1] = edcPermissionRole;

			array[2] = getByEdcProjectRole_PrevAndNext(
				session, edcPermissionRole, projectId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionRole getByEdcProjectRole_PrevAndNext(
		Session session, EdcPermissionRole edcPermissionRole, long projectId,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

		sb.append(_FINDER_COLUMN_EDCPROJECTROLE_PROJECTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByEdcProjectRole(long projectId) {
		for (EdcPermissionRole edcPermissionRole :
				findByEdcProjectRole(
					projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByEdcProjectRole(long projectId) {
		FinderPath finderPath = _finderPathCountByEdcProjectRole;

		Object[] finderArgs = new Object[] {projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPROJECTROLE_PROJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EDCPROJECTROLE_PROJECTID_2 =
		"edcPermissionRole.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByEdcActorGroupRole;
	private FinderPath _finderPathWithoutPaginationFindByEdcActorGroupRole;
	private FinderPath _finderPathCountByEdcActorGroupRole;

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup) {

		return findByEdcActorGroupRole(
			projectId, actorGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end) {

		return findByEdcActorGroupRole(projectId, actorGroup, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findByEdcActorGroupRole(
			projectId, actorGroup, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorGroupRole(
		long projectId, long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByEdcActorGroupRole;
				finderArgs = new Object[] {projectId, actorGroup};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcActorGroupRole;
			finderArgs = new Object[] {
				projectId, actorGroup, start, end, orderByComparator
			};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRole edcPermissionRole : list) {
					if ((projectId != edcPermissionRole.getProjectId()) ||
						(actorGroup != edcPermissionRole.getActorGroup())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_ACTORGROUP_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcActorGroupRole_First(
			long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcActorGroupRole_First(
			projectId, actorGroup, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", actorGroup=");
		sb.append(actorGroup);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcActorGroupRole_First(
		long projectId, long actorGroup,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		List<EdcPermissionRole> list = findByEdcActorGroupRole(
			projectId, actorGroup, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcActorGroupRole_Last(
			long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcActorGroupRole_Last(
			projectId, actorGroup, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", actorGroup=");
		sb.append(actorGroup);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcActorGroupRole_Last(
		long projectId, long actorGroup,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		int count = countByEdcActorGroupRole(projectId, actorGroup);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRole> list = findByEdcActorGroupRole(
			projectId, actorGroup, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole[] findByEdcActorGroupRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = findByPrimaryKey(
			permissionRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole[] array = new EdcPermissionRoleImpl[3];

			array[0] = getByEdcActorGroupRole_PrevAndNext(
				session, edcPermissionRole, projectId, actorGroup,
				orderByComparator, true);

			array[1] = edcPermissionRole;

			array[2] = getByEdcActorGroupRole_PrevAndNext(
				session, edcPermissionRole, projectId, actorGroup,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionRole getByEdcActorGroupRole_PrevAndNext(
		Session session, EdcPermissionRole edcPermissionRole, long projectId,
		long actorGroup, OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

		sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_PROJECTID_2);

		sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_ACTORGROUP_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		queryPos.add(actorGroup);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 */
	@Override
	public void removeByEdcActorGroupRole(long projectId, long actorGroup) {
		for (EdcPermissionRole edcPermissionRole :
				findByEdcActorGroupRole(
					projectId, actorGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByEdcActorGroupRole(long projectId, long actorGroup) {
		FinderPath finderPath = _finderPathCountByEdcActorGroupRole;

		Object[] finderArgs = new Object[] {projectId, actorGroup};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCACTORGROUPROLE_ACTORGROUP_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EDCACTORGROUPROLE_PROJECTID_2 =
		"edcPermissionRole.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCACTORGROUPROLE_ACTORGROUP_2 =
		"edcPermissionRole.actorGroup = ?";

	private FinderPath _finderPathWithPaginationFindByEdcActorRole;
	private FinderPath _finderPathWithoutPaginationFindByEdcActorRole;
	private FinderPath _finderPathCountByEdcActorRole;

	/**
	 * Returns all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		return findByEdcActorRole(
			projectId, actorGroup, actorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end) {

		return findByEdcActorRole(
			projectId, actorGroup, actorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findByEdcActorRole(
			projectId, actorGroup, actorId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findByEdcActorRole(
		long projectId, long actorGroup, long actorId, int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEdcActorRole;
				finderArgs = new Object[] {projectId, actorGroup, actorId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcActorRole;
			finderArgs = new Object[] {
				projectId, actorGroup, actorId, start, end, orderByComparator
			};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRole edcPermissionRole : list) {
					if ((projectId != edcPermissionRole.getProjectId()) ||
						(actorGroup != edcPermissionRole.getActorGroup()) ||
						(actorId != edcPermissionRole.getActorId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					5 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(5);
			}

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORGROUP_2);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				queryPos.add(actorId);

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcActorRole_First(
			long projectId, long actorGroup, long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcActorRole_First(
			projectId, actorGroup, actorId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", actorGroup=");
		sb.append(actorGroup);

		sb.append(", actorId=");
		sb.append(actorId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the first edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcActorRole_First(
		long projectId, long actorGroup, long actorId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		List<EdcPermissionRole> list = findByEdcActorRole(
			projectId, actorGroup, actorId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcActorRole_Last(
			long projectId, long actorGroup, long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcActorRole_Last(
			projectId, actorGroup, actorId, orderByComparator);

		if (edcPermissionRole != null) {
			return edcPermissionRole;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", actorGroup=");
		sb.append(actorGroup);

		sb.append(", actorId=");
		sb.append(actorId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleException(sb.toString());
	}

	/**
	 * Returns the last edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcActorRole_Last(
		long projectId, long actorGroup, long actorId,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		int count = countByEdcActorRole(projectId, actorGroup, actorId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRole> list = findByEdcActorRole(
			projectId, actorGroup, actorId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission roles before and after the current edc permission role in the ordered set where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param permissionRoleId the primary key of the current edc permission role
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole[] findByEdcActorRole_PrevAndNext(
			long permissionRoleId, long projectId, long actorGroup,
			long actorId,
			OrderByComparator<EdcPermissionRole> orderByComparator)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = findByPrimaryKey(
			permissionRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole[] array = new EdcPermissionRoleImpl[3];

			array[0] = getByEdcActorRole_PrevAndNext(
				session, edcPermissionRole, projectId, actorGroup, actorId,
				orderByComparator, true);

			array[1] = edcPermissionRole;

			array[2] = getByEdcActorRole_PrevAndNext(
				session, edcPermissionRole, projectId, actorGroup, actorId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionRole getByEdcActorRole_PrevAndNext(
		Session session, EdcPermissionRole edcPermissionRole, long projectId,
		long actorGroup, long actorId,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

		sb.append(_FINDER_COLUMN_EDCACTORROLE_PROJECTID_2);

		sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORGROUP_2);

		sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		queryPos.add(actorGroup);

		queryPos.add(actorId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 */
	@Override
	public void removeByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		for (EdcPermissionRole edcPermissionRole :
				findByEdcActorRole(
					projectId, actorGroup, actorId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByEdcActorRole(
		long projectId, long actorGroup, long actorId) {

		FinderPath finderPath = _finderPathCountByEdcActorRole;

		Object[] finderArgs = new Object[] {projectId, actorGroup, actorId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORGROUP_2);

			sb.append(_FINDER_COLUMN_EDCACTORROLE_ACTORID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				queryPos.add(actorId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EDCACTORROLE_PROJECTID_2 =
		"edcPermissionRole.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCACTORROLE_ACTORGROUP_2 =
		"edcPermissionRole.actorGroup = ? AND ";

	private static final String _FINDER_COLUMN_EDCACTORROLE_ACTORID_2 =
		"edcPermissionRole.actorId = ?";

	private FinderPath _finderPathFetchByEdcPermissionRole;
	private FinderPath _finderPathCountByEdcPermissionRole;

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the matching edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole findByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);

		if (edcPermissionRole == null) {
			StringBundler sb = new StringBundler(10);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("projectId=");
			sb.append(projectId);

			sb.append(", actorGroup=");
			sb.append(actorGroup);

			sb.append(", actorId=");
			sb.append(actorId);

			sb.append(", roleName=");
			sb.append(roleName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchEdcPermissionRoleException(sb.toString());
		}

		return edcPermissionRole;
	}

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName) {

		return fetchByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName, true);
	}

	/**
	 * Returns the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role, or <code>null</code> if a matching edc permission role could not be found
	 */
	@Override
	public EdcPermissionRole fetchByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName,
		boolean useFinderCache) {

		roleName = Objects.toString(roleName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				projectId, actorGroup, actorId, roleName
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByEdcPermissionRole, finderArgs, this);
		}

		if (result instanceof EdcPermissionRole) {
			EdcPermissionRole edcPermissionRole = (EdcPermissionRole)result;

			if ((projectId != edcPermissionRole.getProjectId()) ||
				(actorGroup != edcPermissionRole.getActorGroup()) ||
				(actorId != edcPermissionRole.getActorId()) ||
				!Objects.equals(roleName, edcPermissionRole.getRoleName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_SELECT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ACTORGROUP_2);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ACTORID_2);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				queryPos.add(actorId);

				if (bindRoleName) {
					queryPos.add(roleName);
				}

				List<EdcPermissionRole> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByEdcPermissionRole, finderArgs,
							list);
					}
				}
				else {
					EdcPermissionRole edcPermissionRole = list.get(0);

					result = edcPermissionRole;

					cacheResult(edcPermissionRole);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByEdcPermissionRole, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EdcPermissionRole)result;
		}
	}

	/**
	 * Removes the edc permission role where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the edc permission role that was removed
	 */
	@Override
	public EdcPermissionRole removeByEdcPermissionRole(
			long projectId, long actorGroup, long actorId, String roleName)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = findByEdcPermissionRole(
			projectId, actorGroup, actorId, roleName);

		return remove(edcPermissionRole);
	}

	/**
	 * Returns the number of edc permission roles where projectId = &#63; and actorGroup = &#63; and actorId = &#63; and roleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param actorGroup the actor group
	 * @param actorId the actor ID
	 * @param roleName the role name
	 * @return the number of matching edc permission roles
	 */
	@Override
	public int countByEdcPermissionRole(
		long projectId, long actorGroup, long actorId, String roleName) {

		roleName = Objects.toString(roleName, "");

		FinderPath finderPath = _finderPathCountByEdcPermissionRole;

		Object[] finderArgs = new Object[] {
			projectId, actorGroup, actorId, roleName
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ACTORGROUP_2);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ACTORID_2);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(actorGroup);

				queryPos.add(actorId);

				if (bindRoleName) {
					queryPos.add(roleName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EDCPERMISSIONROLE_PROJECTID_2 =
		"edcPermissionRole.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONROLE_ACTORGROUP_2 =
		"edcPermissionRole.actorGroup = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONROLE_ACTORID_2 =
		"edcPermissionRole.actorId = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_2 =
		"edcPermissionRole.roleName = ?";

	private static final String _FINDER_COLUMN_EDCPERMISSIONROLE_ROLENAME_3 =
		"(edcPermissionRole.roleName IS NULL OR edcPermissionRole.roleName = '')";

	public EdcPermissionRolePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EdcPermissionRole.class);

		setModelImplClass(EdcPermissionRoleImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the edc permission role in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRole the edc permission role
	 */
	@Override
	public void cacheResult(EdcPermissionRole edcPermissionRole) {
		entityCache.putResult(
			entityCacheEnabled, EdcPermissionRoleImpl.class,
			edcPermissionRole.getPrimaryKey(), edcPermissionRole);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				edcPermissionRole.getUuid(), edcPermissionRole.getGroupId()
			},
			edcPermissionRole);

		finderCache.putResult(
			_finderPathFetchByEdcPermissionRole,
			new Object[] {
				edcPermissionRole.getProjectId(),
				edcPermissionRole.getActorGroup(),
				edcPermissionRole.getActorId(), edcPermissionRole.getRoleName()
			},
			edcPermissionRole);

		edcPermissionRole.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the edc permission roles in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoles the edc permission roles
	 */
	@Override
	public void cacheResult(List<EdcPermissionRole> edcPermissionRoles) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (edcPermissionRoles.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EdcPermissionRole edcPermissionRole : edcPermissionRoles) {
			if (entityCache.getResult(
					entityCacheEnabled, EdcPermissionRoleImpl.class,
					edcPermissionRole.getPrimaryKey()) == null) {

				cacheResult(edcPermissionRole);
			}
			else {
				edcPermissionRole.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edc permission roles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdcPermissionRoleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edc permission role.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdcPermissionRole edcPermissionRole) {
		entityCache.removeResult(
			entityCacheEnabled, EdcPermissionRoleImpl.class,
			edcPermissionRole.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(EdcPermissionRoleModelImpl)edcPermissionRole, true);
	}

	@Override
	public void clearCache(List<EdcPermissionRole> edcPermissionRoles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdcPermissionRole edcPermissionRole : edcPermissionRoles) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionRoleImpl.class,
				edcPermissionRole.getPrimaryKey());

			clearUniqueFindersCache(
				(EdcPermissionRoleModelImpl)edcPermissionRole, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionRoleImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EdcPermissionRoleModelImpl edcPermissionRoleModelImpl) {

		Object[] args = new Object[] {
			edcPermissionRoleModelImpl.getUuid(),
			edcPermissionRoleModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, edcPermissionRoleModelImpl, false);

		args = new Object[] {
			edcPermissionRoleModelImpl.getProjectId(),
			edcPermissionRoleModelImpl.getActorGroup(),
			edcPermissionRoleModelImpl.getActorId(),
			edcPermissionRoleModelImpl.getRoleName()
		};

		finderCache.putResult(
			_finderPathCountByEdcPermissionRole, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByEdcPermissionRole, args,
			edcPermissionRoleModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		EdcPermissionRoleModelImpl edcPermissionRoleModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionRoleModelImpl.getUuid(),
				edcPermissionRoleModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((edcPermissionRoleModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionRoleModelImpl.getOriginalUuid(),
				edcPermissionRoleModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionRoleModelImpl.getProjectId(),
				edcPermissionRoleModelImpl.getActorGroup(),
				edcPermissionRoleModelImpl.getActorId(),
				edcPermissionRoleModelImpl.getRoleName()
			};

			finderCache.removeResult(_finderPathCountByEdcPermissionRole, args);
			finderCache.removeResult(_finderPathFetchByEdcPermissionRole, args);
		}

		if ((edcPermissionRoleModelImpl.getColumnBitmask() &
			 _finderPathFetchByEdcPermissionRole.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionRoleModelImpl.getOriginalProjectId(),
				edcPermissionRoleModelImpl.getOriginalActorGroup(),
				edcPermissionRoleModelImpl.getOriginalActorId(),
				edcPermissionRoleModelImpl.getOriginalRoleName()
			};

			finderCache.removeResult(_finderPathCountByEdcPermissionRole, args);
			finderCache.removeResult(_finderPathFetchByEdcPermissionRole, args);
		}
	}

	/**
	 * Creates a new edc permission role with the primary key. Does not add the edc permission role to the database.
	 *
	 * @param permissionRoleId the primary key for the new edc permission role
	 * @return the new edc permission role
	 */
	@Override
	public EdcPermissionRole create(long permissionRoleId) {
		EdcPermissionRole edcPermissionRole = new EdcPermissionRoleImpl();

		edcPermissionRole.setNew(true);
		edcPermissionRole.setPrimaryKey(permissionRoleId);

		String uuid = PortalUUIDUtil.generate();

		edcPermissionRole.setUuid(uuid);

		edcPermissionRole.setCompanyId(CompanyThreadLocal.getCompanyId());

		return edcPermissionRole;
	}

	/**
	 * Removes the edc permission role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role that was removed
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole remove(long permissionRoleId)
		throws NoSuchEdcPermissionRoleException {

		return remove((Serializable)permissionRoleId);
	}

	/**
	 * Removes the edc permission role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edc permission role
	 * @return the edc permission role that was removed
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole remove(Serializable primaryKey)
		throws NoSuchEdcPermissionRoleException {

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRole edcPermissionRole =
				(EdcPermissionRole)session.get(
					EdcPermissionRoleImpl.class, primaryKey);

			if (edcPermissionRole == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdcPermissionRoleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(edcPermissionRole);
		}
		catch (NoSuchEdcPermissionRoleException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EdcPermissionRole removeImpl(
		EdcPermissionRole edcPermissionRole) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edcPermissionRole)) {
				edcPermissionRole = (EdcPermissionRole)session.get(
					EdcPermissionRoleImpl.class,
					edcPermissionRole.getPrimaryKeyObj());
			}

			if (edcPermissionRole != null) {
				session.delete(edcPermissionRole);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (edcPermissionRole != null) {
			clearCache(edcPermissionRole);
		}

		return edcPermissionRole;
	}

	@Override
	public EdcPermissionRole updateImpl(EdcPermissionRole edcPermissionRole) {
		boolean isNew = edcPermissionRole.isNew();

		if (!(edcPermissionRole instanceof EdcPermissionRoleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(edcPermissionRole.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					edcPermissionRole);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in edcPermissionRole proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EdcPermissionRole implementation " +
					edcPermissionRole.getClass());
		}

		EdcPermissionRoleModelImpl edcPermissionRoleModelImpl =
			(EdcPermissionRoleModelImpl)edcPermissionRole;

		if (Validator.isNull(edcPermissionRole.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edcPermissionRole.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (edcPermissionRole.getCreateDate() == null)) {
			if (serviceContext == null) {
				edcPermissionRole.setCreateDate(date);
			}
			else {
				edcPermissionRole.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!edcPermissionRoleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				edcPermissionRole.setModifiedDate(date);
			}
			else {
				edcPermissionRole.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(edcPermissionRole);

				edcPermissionRole.setNew(false);
			}
			else {
				edcPermissionRole = (EdcPermissionRole)session.merge(
					edcPermissionRole);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {edcPermissionRoleModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				edcPermissionRoleModelImpl.getUuid(),
				edcPermissionRoleModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {edcPermissionRoleModelImpl.getProjectId()};

			finderCache.removeResult(_finderPathCountByEdcProjectRole, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcProjectRole, args);

			args = new Object[] {
				edcPermissionRoleModelImpl.getProjectId(),
				edcPermissionRoleModelImpl.getActorGroup()
			};

			finderCache.removeResult(_finderPathCountByEdcActorGroupRole, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcActorGroupRole, args);

			args = new Object[] {
				edcPermissionRoleModelImpl.getProjectId(),
				edcPermissionRoleModelImpl.getActorGroup(),
				edcPermissionRoleModelImpl.getActorId()
			};

			finderCache.removeResult(_finderPathCountByEdcActorRole, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcActorRole, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((edcPermissionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionRoleModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {edcPermissionRoleModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((edcPermissionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionRoleModelImpl.getOriginalUuid(),
					edcPermissionRoleModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					edcPermissionRoleModelImpl.getUuid(),
					edcPermissionRoleModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((edcPermissionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcProjectRole.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionRoleModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByEdcProjectRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcProjectRole, args);

				args = new Object[] {edcPermissionRoleModelImpl.getProjectId()};

				finderCache.removeResult(
					_finderPathCountByEdcProjectRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcProjectRole, args);
			}

			if ((edcPermissionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcActorGroupRole.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionRoleModelImpl.getOriginalProjectId(),
					edcPermissionRoleModelImpl.getOriginalActorGroup()
				};

				finderCache.removeResult(
					_finderPathCountByEdcActorGroupRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcActorGroupRole, args);

				args = new Object[] {
					edcPermissionRoleModelImpl.getProjectId(),
					edcPermissionRoleModelImpl.getActorGroup()
				};

				finderCache.removeResult(
					_finderPathCountByEdcActorGroupRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcActorGroupRole, args);
			}

			if ((edcPermissionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcActorRole.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionRoleModelImpl.getOriginalProjectId(),
					edcPermissionRoleModelImpl.getOriginalActorGroup(),
					edcPermissionRoleModelImpl.getOriginalActorId()
				};

				finderCache.removeResult(_finderPathCountByEdcActorRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcActorRole, args);

				args = new Object[] {
					edcPermissionRoleModelImpl.getProjectId(),
					edcPermissionRoleModelImpl.getActorGroup(),
					edcPermissionRoleModelImpl.getActorId()
				};

				finderCache.removeResult(_finderPathCountByEdcActorRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcActorRole, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, EdcPermissionRoleImpl.class,
			edcPermissionRole.getPrimaryKey(), edcPermissionRole, false);

		clearUniqueFindersCache(edcPermissionRoleModelImpl, false);
		cacheUniqueFindersCache(edcPermissionRoleModelImpl);

		edcPermissionRole.resetOriginalValues();

		return edcPermissionRole;
	}

	/**
	 * Returns the edc permission role with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdcPermissionRoleException {

		EdcPermissionRole edcPermissionRole = fetchByPrimaryKey(primaryKey);

		if (edcPermissionRole == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdcPermissionRoleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return edcPermissionRole;
	}

	/**
	 * Returns the edc permission role with the primary key or throws a <code>NoSuchEdcPermissionRoleException</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role
	 * @throws NoSuchEdcPermissionRoleException if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole findByPrimaryKey(long permissionRoleId)
		throws NoSuchEdcPermissionRoleException {

		return findByPrimaryKey((Serializable)permissionRoleId);
	}

	/**
	 * Returns the edc permission role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionRoleId the primary key of the edc permission role
	 * @return the edc permission role, or <code>null</code> if a edc permission role with the primary key could not be found
	 */
	@Override
	public EdcPermissionRole fetchByPrimaryKey(long permissionRoleId) {
		return fetchByPrimaryKey((Serializable)permissionRoleId);
	}

	/**
	 * Returns all the edc permission roles.
	 *
	 * @return the edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @return the range of edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission roles
	 * @param end the upper bound of the range of edc permission roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission roles
	 */
	@Override
	public List<EdcPermissionRole> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<EdcPermissionRole> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRole>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDCPERMISSIONROLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDCPERMISSIONROLE;

				sql = sql.concat(EdcPermissionRoleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EdcPermissionRole>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the edc permission roles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdcPermissionRole edcPermissionRole : findAll()) {
			remove(edcPermissionRole);
		}
	}

	/**
	 * Returns the number of edc permission roles.
	 *
	 * @return the number of edc permission roles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EDCPERMISSIONROLE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "permissionRoleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDCPERMISSIONROLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EdcPermissionRoleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edc permission role persistence.
	 */
	@Activate
	public void activate() {
		EdcPermissionRoleModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		EdcPermissionRoleModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			EdcPermissionRoleModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionRoleModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionRoleModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.COMPANYID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByEdcProjectRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcProjectRole",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcProjectRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEdcProjectRole",
			new String[] {Long.class.getName()},
			EdcPermissionRoleModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK);

		_finderPathCountByEdcProjectRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEdcProjectRole",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByEdcActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcActorGroupRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEdcActorGroupRole",
			new String[] {Long.class.getName(), Long.class.getName()},
			EdcPermissionRoleModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORGROUP_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK);

		_finderPathCountByEdcActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEdcActorGroupRole",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByEdcActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcActorRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEdcActorRole",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			EdcPermissionRoleModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORGROUP_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK);

		_finderPathCountByEdcActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEdcActorRole",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

		_finderPathFetchByEdcPermissionRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcPermissionRoleImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByEdcPermissionRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			EdcPermissionRoleModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORGROUP_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ACTORID_COLUMN_BITMASK |
			EdcPermissionRoleModelImpl.ROLENAME_COLUMN_BITMASK);

		_finderPathCountByEdcPermissionRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEdcPermissionRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			});

		_setEdcPermissionRoleUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEdcPermissionRoleUtilPersistence(null);

		entityCache.removeCache(EdcPermissionRoleImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setEdcPermissionRoleUtilPersistence(
		EdcPermissionRolePersistence edcPermissionRolePersistence) {

		try {
			Field field = EdcPermissionRoleUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, edcPermissionRolePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = EDCPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.EdcPermissionRole"),
			true);
	}

	@Override
	@Reference(
		target = EDCPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EDCPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EDCPERMISSIONROLE =
		"SELECT edcPermissionRole FROM EdcPermissionRole edcPermissionRole";

	private static final String _SQL_SELECT_EDCPERMISSIONROLE_WHERE =
		"SELECT edcPermissionRole FROM EdcPermissionRole edcPermissionRole WHERE ";

	private static final String _SQL_COUNT_EDCPERMISSIONROLE =
		"SELECT COUNT(edcPermissionRole) FROM EdcPermissionRole edcPermissionRole";

	private static final String _SQL_COUNT_EDCPERMISSIONROLE_WHERE =
		"SELECT COUNT(edcPermissionRole) FROM EdcPermissionRole edcPermissionRole WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "edcPermissionRole.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EdcPermissionRole exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EdcPermissionRole exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EdcPermissionRolePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "active"});

}
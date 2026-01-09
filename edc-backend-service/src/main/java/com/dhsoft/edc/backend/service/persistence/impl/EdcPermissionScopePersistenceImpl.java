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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionScopeException;
import com.dhsoft.edc.backend.model.EdcPermissionScope;
import com.dhsoft.edc.backend.model.impl.EdcPermissionScopeImpl;
import com.dhsoft.edc.backend.model.impl.EdcPermissionScopeModelImpl;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionScopePersistence;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionScopeUtil;
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
 * The persistence implementation for the edc permission scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EdcPermissionScopePersistence.class)
public class EdcPermissionScopePersistenceImpl
	extends BasePersistenceImpl<EdcPermissionScope>
	implements EdcPermissionScopePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EdcPermissionScopeUtil</code> to access the edc permission scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EdcPermissionScopeImpl.class.getName();

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
	 * Returns all the edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScope edcPermissionScope : list) {
					if (!uuid.equals(edcPermissionScope.getUuid())) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

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
				sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByUuid_First(
			uuid, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUuid_First(
		String uuid, OrderByComparator<EdcPermissionScope> orderByComparator) {

		List<EdcPermissionScope> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByUuid_Last(
			uuid, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUuid_Last(
		String uuid, OrderByComparator<EdcPermissionScope> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScope> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where uuid = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope[] findByUuid_PrevAndNext(
			long permissionScopeId, String uuid,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionScope edcPermissionScope = findByPrimaryKey(
			permissionScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope[] array = new EdcPermissionScopeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, edcPermissionScope, uuid, orderByComparator, true);

			array[1] = edcPermissionScope;

			array[2] = getByUuid_PrevAndNext(
				session, edcPermissionScope, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcPermissionScope getByUuid_PrevAndNext(
		Session session, EdcPermissionScope edcPermissionScope, String uuid,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

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
			sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
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
						edcPermissionScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EdcPermissionScope edcPermissionScope :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

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
		"edcPermissionScope.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(edcPermissionScope.uuid IS NULL OR edcPermissionScope.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByUUID_G(uuid, groupId);

		if (edcPermissionScope == null) {
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

			throw new NoSuchEdcPermissionScopeException(sb.toString());
		}

		return edcPermissionScope;
	}

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the edc permission scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUUID_G(
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

		if (result instanceof EdcPermissionScope) {
			EdcPermissionScope edcPermissionScope = (EdcPermissionScope)result;

			if (!Objects.equals(uuid, edcPermissionScope.getUuid()) ||
				(groupId != edcPermissionScope.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

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

				List<EdcPermissionScope> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EdcPermissionScope edcPermissionScope = list.get(0);

					result = edcPermissionScope;

					cacheResult(edcPermissionScope);
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
			return (EdcPermissionScope)result;
		}
	}

	/**
	 * Removes the edc permission scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope that was removed
	 */
	@Override
	public EdcPermissionScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = findByUUID_G(uuid, groupId);

		return remove(edcPermissionScope);
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

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
		"edcPermissionScope.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(edcPermissionScope.uuid IS NULL OR edcPermissionScope.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"edcPermissionScope.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScope edcPermissionScope : list) {
					if (!uuid.equals(edcPermissionScope.getUuid()) ||
						(companyId != edcPermissionScope.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

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
				sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		List<EdcPermissionScope> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScope> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope[] findByUuid_C_PrevAndNext(
			long permissionScopeId, String uuid, long companyId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionScope edcPermissionScope = findByPrimaryKey(
			permissionScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope[] array = new EdcPermissionScopeImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, edcPermissionScope, uuid, companyId, orderByComparator,
				true);

			array[1] = edcPermissionScope;

			array[2] = getByUuid_C_PrevAndNext(
				session, edcPermissionScope, uuid, companyId, orderByComparator,
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

	protected EdcPermissionScope getByUuid_C_PrevAndNext(
		Session session, EdcPermissionScope edcPermissionScope, String uuid,
		long companyId, OrderByComparator<EdcPermissionScope> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

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
			sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
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
						edcPermissionScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EdcPermissionScope edcPermissionScope :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

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
		"edcPermissionScope.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(edcPermissionScope.uuid IS NULL OR edcPermissionScope.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"edcPermissionScope.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByEdcProjectScope;
	private FinderPath _finderPathWithoutPaginationFindByEdcProjectScope;
	private FinderPath _finderPathCountByEdcProjectScope;

	/**
	 * Returns all the edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcProjectScope(long projectId) {
		return findByEdcProjectScope(
			projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end) {

		return findByEdcProjectScope(projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findByEdcProjectScope(
			projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcProjectScope(
		long projectId, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEdcProjectScope;
				finderArgs = new Object[] {projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcProjectScope;
			finderArgs = new Object[] {
				projectId, start, end, orderByComparator
			};
		}

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScope edcPermissionScope : list) {
					if (projectId != edcPermissionScope.getProjectId()) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPROJECTSCOPE_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcProjectScope_First(
			long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcProjectScope_First(
			projectId, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcProjectScope_First(
		long projectId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		List<EdcPermissionScope> list = findByEdcProjectScope(
			projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcProjectScope_Last(
			long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcProjectScope_Last(
			projectId, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcProjectScope_Last(
		long projectId,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		int count = countByEdcProjectScope(projectId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScope> list = findByEdcProjectScope(
			projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope[] findByEdcProjectScope_PrevAndNext(
			long permissionScopeId, long projectId,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = findByPrimaryKey(
			permissionScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope[] array = new EdcPermissionScopeImpl[3];

			array[0] = getByEdcProjectScope_PrevAndNext(
				session, edcPermissionScope, projectId, orderByComparator,
				true);

			array[1] = edcPermissionScope;

			array[2] = getByEdcProjectScope_PrevAndNext(
				session, edcPermissionScope, projectId, orderByComparator,
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

	protected EdcPermissionScope getByEdcProjectScope_PrevAndNext(
		Session session, EdcPermissionScope edcPermissionScope, long projectId,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

		sb.append(_FINDER_COLUMN_EDCPROJECTSCOPE_PROJECTID_2);

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
			sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
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
						edcPermissionScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByEdcProjectScope(long projectId) {
		for (EdcPermissionScope edcPermissionScope :
				findByEdcProjectScope(
					projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByEdcProjectScope(long projectId) {
		FinderPath finderPath = _finderPathCountByEdcProjectScope;

		Object[] finderArgs = new Object[] {projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPROJECTSCOPE_PROJECTID_2);

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

	private static final String _FINDER_COLUMN_EDCPROJECTSCOPE_PROJECTID_2 =
		"edcPermissionScope.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByEdcModuleScope;
	private FinderPath _finderPathWithoutPaginationFindByEdcModuleScope;
	private FinderPath _finderPathCountByEdcModuleScope;

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName) {

		return findByEdcModuleScope(
			projectId, moduleName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end) {

		return findByEdcModuleScope(projectId, moduleName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findByEdcModuleScope(
			projectId, moduleName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcModuleScope(
		long projectId, String moduleName, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		moduleName = Objects.toString(moduleName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEdcModuleScope;
				finderArgs = new Object[] {projectId, moduleName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcModuleScope;
			finderArgs = new Object[] {
				projectId, moduleName, start, end, orderByComparator
			};
		}

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScope edcPermissionScope : list) {
					if ((projectId != edcPermissionScope.getProjectId()) ||
						!moduleName.equals(
							edcPermissionScope.getModuleName())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCMODULESCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcModuleScope_First(
			long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcModuleScope_First(
			projectId, moduleName, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", moduleName=");
		sb.append(moduleName);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcModuleScope_First(
		long projectId, String moduleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		List<EdcPermissionScope> list = findByEdcModuleScope(
			projectId, moduleName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcModuleScope_Last(
			long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcModuleScope_Last(
			projectId, moduleName, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", moduleName=");
		sb.append(moduleName);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcModuleScope_Last(
		long projectId, String moduleName,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		int count = countByEdcModuleScope(projectId, moduleName);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScope> list = findByEdcModuleScope(
			projectId, moduleName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope[] findByEdcModuleScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		moduleName = Objects.toString(moduleName, "");

		EdcPermissionScope edcPermissionScope = findByPrimaryKey(
			permissionScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope[] array = new EdcPermissionScopeImpl[3];

			array[0] = getByEdcModuleScope_PrevAndNext(
				session, edcPermissionScope, projectId, moduleName,
				orderByComparator, true);

			array[1] = edcPermissionScope;

			array[2] = getByEdcModuleScope_PrevAndNext(
				session, edcPermissionScope, projectId, moduleName,
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

	protected EdcPermissionScope getByEdcModuleScope_PrevAndNext(
		Session session, EdcPermissionScope edcPermissionScope, long projectId,
		String moduleName,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

		sb.append(_FINDER_COLUMN_EDCMODULESCOPE_PROJECTID_2);

		boolean bindModuleName = false;

		if (moduleName.isEmpty()) {
			sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_3);
		}
		else {
			bindModuleName = true;

			sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_2);
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
			sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		if (bindModuleName) {
			queryPos.add(moduleName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 */
	@Override
	public void removeByEdcModuleScope(long projectId, String moduleName) {
		for (EdcPermissionScope edcPermissionScope :
				findByEdcModuleScope(
					projectId, moduleName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByEdcModuleScope(long projectId, String moduleName) {
		moduleName = Objects.toString(moduleName, "");

		FinderPath finderPath = _finderPathCountByEdcModuleScope;

		Object[] finderArgs = new Object[] {projectId, moduleName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCMODULESCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
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

	private static final String _FINDER_COLUMN_EDCMODULESCOPE_PROJECTID_2 =
		"edcPermissionScope.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_2 =
		"edcPermissionScope.moduleName = ?";

	private static final String _FINDER_COLUMN_EDCMODULESCOPE_MODULENAME_3 =
		"(edcPermissionScope.moduleName IS NULL OR edcPermissionScope.moduleName = '')";

	private FinderPath _finderPathWithPaginationFindByEdcTaskScope;
	private FinderPath _finderPathWithoutPaginationFindByEdcTaskScope;
	private FinderPath _finderPathCountByEdcTaskScope;

	/**
	 * Returns all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey) {

		return findByEdcTaskScope(
			projectId, moduleName, taskKey, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end) {

		return findByEdcTaskScope(
			projectId, moduleName, taskKey, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findByEdcTaskScope(
			projectId, moduleName, taskKey, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findByEdcTaskScope(
		long projectId, String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
		boolean useFinderCache) {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEdcTaskScope;
				finderArgs = new Object[] {projectId, moduleName, taskKey};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEdcTaskScope;
			finderArgs = new Object[] {
				projectId, moduleName, taskKey, start, end, orderByComparator
			};
		}

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScope edcPermissionScope : list) {
					if ((projectId != edcPermissionScope.getProjectId()) ||
						!moduleName.equals(
							edcPermissionScope.getModuleName()) ||
						!taskKey.equals(edcPermissionScope.getTaskKey())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				if (bindTaskKey) {
					queryPos.add(taskKey);
				}

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcTaskScope_First(
			long projectId, String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcTaskScope_First(
			projectId, moduleName, taskKey, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", moduleName=");
		sb.append(moduleName);

		sb.append(", taskKey=");
		sb.append(taskKey);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcTaskScope_First(
		long projectId, String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		List<EdcPermissionScope> list = findByEdcTaskScope(
			projectId, moduleName, taskKey, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcTaskScope_Last(
			long projectId, String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcTaskScope_Last(
			projectId, moduleName, taskKey, orderByComparator);

		if (edcPermissionScope != null) {
			return edcPermissionScope;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", moduleName=");
		sb.append(moduleName);

		sb.append(", taskKey=");
		sb.append(taskKey);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcTaskScope_Last(
		long projectId, String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		int count = countByEdcTaskScope(projectId, moduleName, taskKey);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScope> list = findByEdcTaskScope(
			projectId, moduleName, taskKey, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scopes before and after the current edc permission scope in the ordered set where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param permissionScopeId the primary key of the current edc permission scope
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope[] findByEdcTaskScope_PrevAndNext(
			long permissionScopeId, long projectId, String moduleName,
			String taskKey,
			OrderByComparator<EdcPermissionScope> orderByComparator)
		throws NoSuchEdcPermissionScopeException {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		EdcPermissionScope edcPermissionScope = findByPrimaryKey(
			permissionScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope[] array = new EdcPermissionScopeImpl[3];

			array[0] = getByEdcTaskScope_PrevAndNext(
				session, edcPermissionScope, projectId, moduleName, taskKey,
				orderByComparator, true);

			array[1] = edcPermissionScope;

			array[2] = getByEdcTaskScope_PrevAndNext(
				session, edcPermissionScope, projectId, moduleName, taskKey,
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

	protected EdcPermissionScope getByEdcTaskScope_PrevAndNext(
		Session session, EdcPermissionScope edcPermissionScope, long projectId,
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

		sb.append(_FINDER_COLUMN_EDCTASKSCOPE_PROJECTID_2);

		boolean bindModuleName = false;

		if (moduleName.isEmpty()) {
			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_3);
		}
		else {
			bindModuleName = true;

			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_2);
		}

		boolean bindTaskKey = false;

		if (taskKey.isEmpty()) {
			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_3);
		}
		else {
			bindTaskKey = true;

			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_2);
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
			sb.append(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		if (bindModuleName) {
			queryPos.add(moduleName);
		}

		if (bindTaskKey) {
			queryPos.add(taskKey);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 */
	@Override
	public void removeByEdcTaskScope(
		long projectId, String moduleName, String taskKey) {

		for (EdcPermissionScope edcPermissionScope :
				findByEdcTaskScope(
					projectId, moduleName, taskKey, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByEdcTaskScope(
		long projectId, String moduleName, String taskKey) {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		FinderPath finderPath = _finderPathCountByEdcTaskScope;

		Object[] finderArgs = new Object[] {projectId, moduleName, taskKey};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCTASKSCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				if (bindTaskKey) {
					queryPos.add(taskKey);
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

	private static final String _FINDER_COLUMN_EDCTASKSCOPE_PROJECTID_2 =
		"edcPermissionScope.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_2 =
		"edcPermissionScope.moduleName = ? AND ";

	private static final String _FINDER_COLUMN_EDCTASKSCOPE_MODULENAME_3 =
		"(edcPermissionScope.moduleName IS NULL OR edcPermissionScope.moduleName = '') AND ";

	private static final String _FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_2 =
		"edcPermissionScope.taskKey = ?";

	private static final String _FINDER_COLUMN_EDCTASKSCOPE_TASKKEY_3 =
		"(edcPermissionScope.taskKey IS NULL OR edcPermissionScope.taskKey = '')";

	private FinderPath _finderPathFetchByEdcPermissionScope;
	private FinderPath _finderPathCountByEdcPermissionScope;

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope findByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String scopeRole)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByEdcPermissionScope(
			projectId, moduleName, taskKey, scopeRole);

		if (edcPermissionScope == null) {
			StringBundler sb = new StringBundler(10);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("projectId=");
			sb.append(projectId);

			sb.append(", moduleName=");
			sb.append(moduleName);

			sb.append(", taskKey=");
			sb.append(taskKey);

			sb.append(", scopeRole=");
			sb.append(scopeRole);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchEdcPermissionScopeException(sb.toString());
		}

		return edcPermissionScope;
	}

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole) {

		return fetchByEdcPermissionScope(
			projectId, moduleName, taskKey, scopeRole, true);
	}

	/**
	 * Returns the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope, or <code>null</code> if a matching edc permission scope could not be found
	 */
	@Override
	public EdcPermissionScope fetchByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole,
		boolean useFinderCache) {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");
		scopeRole = Objects.toString(scopeRole, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				projectId, moduleName, taskKey, scopeRole
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByEdcPermissionScope, finderArgs, this);
		}

		if (result instanceof EdcPermissionScope) {
			EdcPermissionScope edcPermissionScope = (EdcPermissionScope)result;

			if ((projectId != edcPermissionScope.getProjectId()) ||
				!Objects.equals(
					moduleName, edcPermissionScope.getModuleName()) ||
				!Objects.equals(taskKey, edcPermissionScope.getTaskKey()) ||
				!Objects.equals(scopeRole, edcPermissionScope.getScopeRole())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_2);
			}

			boolean bindScopeRole = false;

			if (scopeRole.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_3);
			}
			else {
				bindScopeRole = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				if (bindTaskKey) {
					queryPos.add(taskKey);
				}

				if (bindScopeRole) {
					queryPos.add(scopeRole);
				}

				List<EdcPermissionScope> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByEdcPermissionScope, finderArgs,
							list);
					}
				}
				else {
					EdcPermissionScope edcPermissionScope = list.get(0);

					result = edcPermissionScope;

					cacheResult(edcPermissionScope);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByEdcPermissionScope, finderArgs);
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
			return (EdcPermissionScope)result;
		}
	}

	/**
	 * Removes the edc permission scope where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the edc permission scope that was removed
	 */
	@Override
	public EdcPermissionScope removeByEdcPermissionScope(
			long projectId, String moduleName, String taskKey, String scopeRole)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = findByEdcPermissionScope(
			projectId, moduleName, taskKey, scopeRole);

		return remove(edcPermissionScope);
	}

	/**
	 * Returns the number of edc permission scopes where projectId = &#63; and moduleName = &#63; and taskKey = &#63; and scopeRole = &#63;.
	 *
	 * @param projectId the project ID
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param scopeRole the scope role
	 * @return the number of matching edc permission scopes
	 */
	@Override
	public int countByEdcPermissionScope(
		long projectId, String moduleName, String taskKey, String scopeRole) {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");
		scopeRole = Objects.toString(scopeRole, "");

		FinderPath finderPath = _finderPathCountByEdcPermissionScope;

		Object[] finderArgs = new Object[] {
			projectId, moduleName, taskKey, scopeRole
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_PROJECTID_2);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_2);
			}

			boolean bindScopeRole = false;

			if (scopeRole.isEmpty()) {
				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_3);
			}
			else {
				bindScopeRole = true;

				sb.append(_FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				if (bindTaskKey) {
					queryPos.add(taskKey);
				}

				if (bindScopeRole) {
					queryPos.add(scopeRole);
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

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_PROJECTID_2 =
		"edcPermissionScope.projectId = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_2 =
		"edcPermissionScope.moduleName = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_MODULENAME_3 =
		"(edcPermissionScope.moduleName IS NULL OR edcPermissionScope.moduleName = '') AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_2 =
		"edcPermissionScope.taskKey = ? AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_TASKKEY_3 =
		"(edcPermissionScope.taskKey IS NULL OR edcPermissionScope.taskKey = '') AND ";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_2 =
		"edcPermissionScope.scopeRole = ?";

	private static final String _FINDER_COLUMN_EDCPERMISSIONSCOPE_SCOPEROLE_3 =
		"(edcPermissionScope.scopeRole IS NULL OR edcPermissionScope.scopeRole = '')";

	public EdcPermissionScopePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EdcPermissionScope.class);

		setModelImplClass(EdcPermissionScopeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the edc permission scope in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScope the edc permission scope
	 */
	@Override
	public void cacheResult(EdcPermissionScope edcPermissionScope) {
		entityCache.putResult(
			entityCacheEnabled, EdcPermissionScopeImpl.class,
			edcPermissionScope.getPrimaryKey(), edcPermissionScope);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				edcPermissionScope.getUuid(), edcPermissionScope.getGroupId()
			},
			edcPermissionScope);

		finderCache.putResult(
			_finderPathFetchByEdcPermissionScope,
			new Object[] {
				edcPermissionScope.getProjectId(),
				edcPermissionScope.getModuleName(),
				edcPermissionScope.getTaskKey(),
				edcPermissionScope.getScopeRole()
			},
			edcPermissionScope);

		edcPermissionScope.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the edc permission scopes in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopes the edc permission scopes
	 */
	@Override
	public void cacheResult(List<EdcPermissionScope> edcPermissionScopes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (edcPermissionScopes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EdcPermissionScope edcPermissionScope : edcPermissionScopes) {
			if (entityCache.getResult(
					entityCacheEnabled, EdcPermissionScopeImpl.class,
					edcPermissionScope.getPrimaryKey()) == null) {

				cacheResult(edcPermissionScope);
			}
			else {
				edcPermissionScope.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edc permission scopes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdcPermissionScopeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edc permission scope.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdcPermissionScope edcPermissionScope) {
		entityCache.removeResult(
			entityCacheEnabled, EdcPermissionScopeImpl.class,
			edcPermissionScope.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(EdcPermissionScopeModelImpl)edcPermissionScope, true);
	}

	@Override
	public void clearCache(List<EdcPermissionScope> edcPermissionScopes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdcPermissionScope edcPermissionScope : edcPermissionScopes) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionScopeImpl.class,
				edcPermissionScope.getPrimaryKey());

			clearUniqueFindersCache(
				(EdcPermissionScopeModelImpl)edcPermissionScope, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionScopeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EdcPermissionScopeModelImpl edcPermissionScopeModelImpl) {

		Object[] args = new Object[] {
			edcPermissionScopeModelImpl.getUuid(),
			edcPermissionScopeModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, edcPermissionScopeModelImpl, false);

		args = new Object[] {
			edcPermissionScopeModelImpl.getProjectId(),
			edcPermissionScopeModelImpl.getModuleName(),
			edcPermissionScopeModelImpl.getTaskKey(),
			edcPermissionScopeModelImpl.getScopeRole()
		};

		finderCache.putResult(
			_finderPathCountByEdcPermissionScope, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByEdcPermissionScope, args,
			edcPermissionScopeModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		EdcPermissionScopeModelImpl edcPermissionScopeModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionScopeModelImpl.getUuid(),
				edcPermissionScopeModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((edcPermissionScopeModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionScopeModelImpl.getOriginalUuid(),
				edcPermissionScopeModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionScopeModelImpl.getProjectId(),
				edcPermissionScopeModelImpl.getModuleName(),
				edcPermissionScopeModelImpl.getTaskKey(),
				edcPermissionScopeModelImpl.getScopeRole()
			};

			finderCache.removeResult(
				_finderPathCountByEdcPermissionScope, args);
			finderCache.removeResult(
				_finderPathFetchByEdcPermissionScope, args);
		}

		if ((edcPermissionScopeModelImpl.getColumnBitmask() &
			 _finderPathFetchByEdcPermissionScope.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionScopeModelImpl.getOriginalProjectId(),
				edcPermissionScopeModelImpl.getOriginalModuleName(),
				edcPermissionScopeModelImpl.getOriginalTaskKey(),
				edcPermissionScopeModelImpl.getOriginalScopeRole()
			};

			finderCache.removeResult(
				_finderPathCountByEdcPermissionScope, args);
			finderCache.removeResult(
				_finderPathFetchByEdcPermissionScope, args);
		}
	}

	/**
	 * Creates a new edc permission scope with the primary key. Does not add the edc permission scope to the database.
	 *
	 * @param permissionScopeId the primary key for the new edc permission scope
	 * @return the new edc permission scope
	 */
	@Override
	public EdcPermissionScope create(long permissionScopeId) {
		EdcPermissionScope edcPermissionScope = new EdcPermissionScopeImpl();

		edcPermissionScope.setNew(true);
		edcPermissionScope.setPrimaryKey(permissionScopeId);

		String uuid = PortalUUIDUtil.generate();

		edcPermissionScope.setUuid(uuid);

		edcPermissionScope.setCompanyId(CompanyThreadLocal.getCompanyId());

		return edcPermissionScope;
	}

	/**
	 * Removes the edc permission scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope that was removed
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope remove(long permissionScopeId)
		throws NoSuchEdcPermissionScopeException {

		return remove((Serializable)permissionScopeId);
	}

	/**
	 * Removes the edc permission scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edc permission scope
	 * @return the edc permission scope that was removed
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope remove(Serializable primaryKey)
		throws NoSuchEdcPermissionScopeException {

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScope edcPermissionScope =
				(EdcPermissionScope)session.get(
					EdcPermissionScopeImpl.class, primaryKey);

			if (edcPermissionScope == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdcPermissionScopeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(edcPermissionScope);
		}
		catch (NoSuchEdcPermissionScopeException noSuchEntityException) {
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
	protected EdcPermissionScope removeImpl(
		EdcPermissionScope edcPermissionScope) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edcPermissionScope)) {
				edcPermissionScope = (EdcPermissionScope)session.get(
					EdcPermissionScopeImpl.class,
					edcPermissionScope.getPrimaryKeyObj());
			}

			if (edcPermissionScope != null) {
				session.delete(edcPermissionScope);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (edcPermissionScope != null) {
			clearCache(edcPermissionScope);
		}

		return edcPermissionScope;
	}

	@Override
	public EdcPermissionScope updateImpl(
		EdcPermissionScope edcPermissionScope) {

		boolean isNew = edcPermissionScope.isNew();

		if (!(edcPermissionScope instanceof EdcPermissionScopeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(edcPermissionScope.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					edcPermissionScope);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in edcPermissionScope proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EdcPermissionScope implementation " +
					edcPermissionScope.getClass());
		}

		EdcPermissionScopeModelImpl edcPermissionScopeModelImpl =
			(EdcPermissionScopeModelImpl)edcPermissionScope;

		if (Validator.isNull(edcPermissionScope.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edcPermissionScope.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (edcPermissionScope.getCreateDate() == null)) {
			if (serviceContext == null) {
				edcPermissionScope.setCreateDate(date);
			}
			else {
				edcPermissionScope.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!edcPermissionScopeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				edcPermissionScope.setModifiedDate(date);
			}
			else {
				edcPermissionScope.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(edcPermissionScope);

				edcPermissionScope.setNew(false);
			}
			else {
				edcPermissionScope = (EdcPermissionScope)session.merge(
					edcPermissionScope);
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
			Object[] args = new Object[] {
				edcPermissionScopeModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				edcPermissionScopeModelImpl.getUuid(),
				edcPermissionScopeModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {edcPermissionScopeModelImpl.getProjectId()};

			finderCache.removeResult(_finderPathCountByEdcProjectScope, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcProjectScope, args);

			args = new Object[] {
				edcPermissionScopeModelImpl.getProjectId(),
				edcPermissionScopeModelImpl.getModuleName()
			};

			finderCache.removeResult(_finderPathCountByEdcModuleScope, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcModuleScope, args);

			args = new Object[] {
				edcPermissionScopeModelImpl.getProjectId(),
				edcPermissionScopeModelImpl.getModuleName(),
				edcPermissionScopeModelImpl.getTaskKey()
			};

			finderCache.removeResult(_finderPathCountByEdcTaskScope, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEdcTaskScope, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((edcPermissionScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionScopeModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {edcPermissionScopeModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((edcPermissionScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionScopeModelImpl.getOriginalUuid(),
					edcPermissionScopeModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					edcPermissionScopeModelImpl.getUuid(),
					edcPermissionScopeModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((edcPermissionScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcProjectScope.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionScopeModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByEdcProjectScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcProjectScope, args);

				args = new Object[] {
					edcPermissionScopeModelImpl.getProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByEdcProjectScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcProjectScope, args);
			}

			if ((edcPermissionScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcModuleScope.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionScopeModelImpl.getOriginalProjectId(),
					edcPermissionScopeModelImpl.getOriginalModuleName()
				};

				finderCache.removeResult(
					_finderPathCountByEdcModuleScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcModuleScope, args);

				args = new Object[] {
					edcPermissionScopeModelImpl.getProjectId(),
					edcPermissionScopeModelImpl.getModuleName()
				};

				finderCache.removeResult(
					_finderPathCountByEdcModuleScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcModuleScope, args);
			}

			if ((edcPermissionScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEdcTaskScope.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionScopeModelImpl.getOriginalProjectId(),
					edcPermissionScopeModelImpl.getOriginalModuleName(),
					edcPermissionScopeModelImpl.getOriginalTaskKey()
				};

				finderCache.removeResult(_finderPathCountByEdcTaskScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcTaskScope, args);

				args = new Object[] {
					edcPermissionScopeModelImpl.getProjectId(),
					edcPermissionScopeModelImpl.getModuleName(),
					edcPermissionScopeModelImpl.getTaskKey()
				};

				finderCache.removeResult(_finderPathCountByEdcTaskScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEdcTaskScope, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, EdcPermissionScopeImpl.class,
			edcPermissionScope.getPrimaryKey(), edcPermissionScope, false);

		clearUniqueFindersCache(edcPermissionScopeModelImpl, false);
		cacheUniqueFindersCache(edcPermissionScopeModelImpl);

		edcPermissionScope.resetOriginalValues();

		return edcPermissionScope;
	}

	/**
	 * Returns the edc permission scope with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edc permission scope
	 * @return the edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdcPermissionScopeException {

		EdcPermissionScope edcPermissionScope = fetchByPrimaryKey(primaryKey);

		if (edcPermissionScope == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdcPermissionScopeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return edcPermissionScope;
	}

	/**
	 * Returns the edc permission scope with the primary key or throws a <code>NoSuchEdcPermissionScopeException</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope
	 * @throws NoSuchEdcPermissionScopeException if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope findByPrimaryKey(long permissionScopeId)
		throws NoSuchEdcPermissionScopeException {

		return findByPrimaryKey((Serializable)permissionScopeId);
	}

	/**
	 * Returns the edc permission scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionScopeId the primary key of the edc permission scope
	 * @return the edc permission scope, or <code>null</code> if a edc permission scope with the primary key could not be found
	 */
	@Override
	public EdcPermissionScope fetchByPrimaryKey(long permissionScopeId) {
		return fetchByPrimaryKey((Serializable)permissionScopeId);
	}

	/**
	 * Returns all the edc permission scopes.
	 *
	 * @return the edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @return the range of edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scopes
	 * @param end the upper bound of the range of edc permission scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission scopes
	 */
	@Override
	public List<EdcPermissionScope> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScope> orderByComparator,
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

		List<EdcPermissionScope> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScope>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDCPERMISSIONSCOPE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDCPERMISSIONSCOPE;

				sql = sql.concat(EdcPermissionScopeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EdcPermissionScope>)QueryUtil.list(
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
	 * Removes all the edc permission scopes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdcPermissionScope edcPermissionScope : findAll()) {
			remove(edcPermissionScope);
		}
	}

	/**
	 * Returns the number of edc permission scopes.
	 *
	 * @return the number of edc permission scopes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_EDCPERMISSIONSCOPE);

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
		return "permissionScopeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDCPERMISSIONSCOPE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EdcPermissionScopeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edc permission scope persistence.
	 */
	@Activate
	public void activate() {
		EdcPermissionScopeModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		EdcPermissionScopeModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			EdcPermissionScopeModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionScopeModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionScopeModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.COMPANYID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByEdcProjectScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcProjectScope",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcProjectScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEdcProjectScope",
			new String[] {Long.class.getName()},
			EdcPermissionScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByEdcProjectScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEdcProjectScope",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByEdcModuleScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcModuleScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcModuleScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEdcModuleScope",
			new String[] {Long.class.getName(), String.class.getName()},
			EdcPermissionScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByEdcModuleScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEdcModuleScope",
			new String[] {Long.class.getName(), String.class.getName()});

		_finderPathWithPaginationFindByEdcTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEdcTaskScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEdcTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEdcTaskScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			EdcPermissionScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByEdcTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEdcTaskScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

		_finderPathFetchByEdcPermissionScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByEdcPermissionScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			EdcPermissionScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByEdcPermissionScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEdcPermissionScope",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

		_setEdcPermissionScopeUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEdcPermissionScopeUtilPersistence(null);

		entityCache.removeCache(EdcPermissionScopeImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setEdcPermissionScopeUtilPersistence(
		EdcPermissionScopePersistence edcPermissionScopePersistence) {

		try {
			Field field = EdcPermissionScopeUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, edcPermissionScopePersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.EdcPermissionScope"),
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

	private static final String _SQL_SELECT_EDCPERMISSIONSCOPE =
		"SELECT edcPermissionScope FROM EdcPermissionScope edcPermissionScope";

	private static final String _SQL_SELECT_EDCPERMISSIONSCOPE_WHERE =
		"SELECT edcPermissionScope FROM EdcPermissionScope edcPermissionScope WHERE ";

	private static final String _SQL_COUNT_EDCPERMISSIONSCOPE =
		"SELECT COUNT(edcPermissionScope) FROM EdcPermissionScope edcPermissionScope";

	private static final String _SQL_COUNT_EDCPERMISSIONSCOPE_WHERE =
		"SELECT COUNT(edcPermissionScope) FROM EdcPermissionScope edcPermissionScope WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "edcPermissionScope.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EdcPermissionScope exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EdcPermissionScope exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EdcPermissionScopePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "active"});

}
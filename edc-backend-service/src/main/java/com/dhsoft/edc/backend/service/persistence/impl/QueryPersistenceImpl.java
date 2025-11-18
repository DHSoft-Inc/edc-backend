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

import com.dhsoft.edc.backend.exception.NoSuchQueryException;
import com.dhsoft.edc.backend.model.Query;
import com.dhsoft.edc.backend.model.impl.QueryImpl;
import com.dhsoft.edc.backend.model.impl.QueryModelImpl;
import com.dhsoft.edc.backend.service.persistence.QueryPersistence;
import com.dhsoft.edc.backend.service.persistence.QueryUtil;
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
 * The persistence implementation for the query service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QueryPersistence.class)
public class QueryPersistenceImpl
	extends BasePersistenceImpl<Query> implements QueryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QueryUtil</code> to access the query persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QueryImpl.class.getName();

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
	 * Returns all the queries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

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

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (!uuid.equals(query.getUuid())) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

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
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
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

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUuid_First(
			String uuid, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUuid_First(uuid, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUuid_First(
		String uuid, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUuid_Last(
			String uuid, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUuid_Last(uuid, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUuid_Last(
		String uuid, OrderByComparator<Query> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where uuid = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByUuid_PrevAndNext(
			long queryId, String uuid,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		uuid = Objects.toString(uuid, "");

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, query, uuid, orderByComparator, true);

			array[1] = query;

			array[2] = getByUuid_PrevAndNext(
				session, query, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByUuid_PrevAndNext(
		Session session, Query query, String uuid,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Query query :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching queries
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "query.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(query.uuid IS NULL OR query.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQueryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUUID_G(String uuid, long groupId)
		throws NoSuchQueryException {

		Query query = fetchByUUID_G(uuid, groupId);

		if (query == null) {
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

			throw new NoSuchQueryException(sb.toString());
		}

		return query;
	}

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the query where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUUID_G(
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

		if (result instanceof Query) {
			Query query = (Query)result;

			if (!Objects.equals(uuid, query.getUuid()) ||
				(groupId != query.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUERY_WHERE);

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

				List<Query> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Query query = list.get(0);

					result = query;

					cacheResult(query);
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
			return (Query)result;
		}
	}

	/**
	 * Removes the query where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the query that was removed
	 */
	@Override
	public Query removeByUUID_G(String uuid, long groupId)
		throws NoSuchQueryException {

		Query query = findByUUID_G(uuid, groupId);

		return remove(query);
	}

	/**
	 * Returns the number of queries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERY_WHERE);

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
		"query.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(query.uuid IS NULL OR query.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"query.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

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

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (!uuid.equals(query.getUuid()) ||
						(companyId != query.getCompanyId())) {

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

			sb.append(_SQL_SELECT_QUERY_WHERE);

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
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
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

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Query> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByUuid_C_PrevAndNext(
			long queryId, String uuid, long companyId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		uuid = Objects.toString(uuid, "");

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, query, uuid, companyId, orderByComparator, true);

			array[1] = query;

			array[2] = getByUuid_C_PrevAndNext(
				session, query, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByUuid_C_PrevAndNext(
		Session session, Query query, String uuid, long companyId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Query query :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERY_WHERE);

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
		"query.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(query.uuid IS NULL OR query.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"query.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the queries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCompanyId;
				finderArgs = new Object[] {companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCompanyId;
			finderArgs = new Object[] {
				companyId, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (companyId != query.getCompanyId()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByCompanyId_First(
			long companyId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByCompanyId_First(companyId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByCompanyId_First(
		long companyId, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByCompanyId_Last(
			long companyId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByCompanyId_Last(companyId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByCompanyId_Last(
		long companyId, OrderByComparator<Query> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByCompanyId_PrevAndNext(
			long queryId, long companyId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, query, companyId, orderByComparator, true);

			array[1] = query;

			array[2] = getByCompanyId_PrevAndNext(
				session, query, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByCompanyId_PrevAndNext(
		Session session, Query query, long companyId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (Query query :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 =
		"query.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_P;
				finderArgs = new Object[] {groupId, projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_P;
			finderArgs = new Object[] {
				groupId, projectId, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if ((groupId != query.getGroupId()) ||
						(projectId != query.getProjectId())) {

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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByG_P_First(groupId, projectId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByG_P_Last(groupId, projectId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<Query> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByG_P_PrevAndNext(
			long queryId, long groupId, long projectId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, query, groupId, projectId, orderByComparator, true);

			array[1] = query;

			array[2] = getByG_P_PrevAndNext(
				session, query, groupId, projectId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByG_P_PrevAndNext(
		Session session, Query query, long groupId, long projectId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(projectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (Query query :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_P_GROUPID_2 =
		"query.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"query.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the queries where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUserId;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUserId;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (userId != query.getUserId()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUserId_First(
			long userId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUserId_First(userId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUserId_First(
		long userId, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByUserId_Last(
			long userId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByUserId_Last(userId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByUserId_Last(
		long userId, OrderByComparator<Query> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where userId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByUserId_PrevAndNext(
			long queryId, long userId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, query, userId, orderByComparator, true);

			array[1] = query;

			array[2] = getByUserId_PrevAndNext(
				session, query, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByUserId_PrevAndNext(
		Session session, Query query, long userId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_USERID_USERID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (Query query :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 =
		"query.userId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG_VD_VC_S_I;
	private FinderPath _finderPathWithoutPaginationFindByS_VG_VD_VC_S_I;
	private FinderPath _finderPathCountByS_VG_VD_VC_S_I;

	/**
	 * Returns all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByS_VG_VD_VC_S_I;
				finderArgs = new Object[] {
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					subCRFId, instanceId
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByS_VG_VD_VC_S_I;
			finderArgs = new Object[] {
				subjectId, visitGroupId, visitDefinitionId, visitCRFId,
				subCRFId, instanceId, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if ((subjectId != query.getSubjectId()) ||
						(visitGroupId != query.getVisitGroupId()) ||
						(visitDefinitionId != query.getVisitDefinitionId()) ||
						(visitCRFId != query.getVisitCRFId()) ||
						(subCRFId != query.getSubCRFId()) ||
						(instanceId != query.getInstanceId())) {

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
					8 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(8);
			}

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_INSTANCEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				queryPos.add(visitGroupId);

				queryPos.add(visitDefinitionId);

				queryPos.add(visitCRFId);

				queryPos.add(subCRFId);

				queryPos.add(instanceId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(14);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append(", visitCRFId=");
		sb.append(visitCRFId);

		sb.append(", subCRFId=");
		sb.append(subCRFId);

		sb.append(", instanceId=");
		sb.append(instanceId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(14);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append(", visitCRFId=");
		sb.append(visitCRFId);

		sb.append(", subCRFId=");
		sb.append(subCRFId);

		sb.append(", instanceId=");
		sb.append(instanceId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<Query> orderByComparator) {

		int count = countByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByS_VG_VD_VC_S_I_PrevAndNext(
				session, query, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, subCRFId, instanceId, orderByComparator, true);

			array[1] = query;

			array[2] = getByS_VG_VD_VC_S_I_PrevAndNext(
				session, query, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, subCRFId, instanceId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByS_VG_VD_VC_S_I_PrevAndNext(
		Session session, Query query, long subjectId, long visitGroupId,
		long visitDefinitionId, long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				9 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(8);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITGROUPID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITDEFINITIONID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITCRFID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBCRFID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_INSTANCEID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(subjectId);

		queryPos.add(visitGroupId);

		queryPos.add(visitDefinitionId);

		queryPos.add(visitCRFId);

		queryPos.add(subCRFId);

		queryPos.add(instanceId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 */
	@Override
	public void removeByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		for (Query query :
				findByS_VG_VD_VC_S_I(
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					subCRFId, instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		FinderPath finderPath = _finderPathCountByS_VG_VD_VC_S_I;

		Object[] finderArgs = new Object[] {
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(7);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_SUBCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_I_INSTANCEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				queryPos.add(visitGroupId);

				queryPos.add(visitDefinitionId);

				queryPos.add(visitCRFId);

				queryPos.add(subCRFId);

				queryPos.add(instanceId);

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

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_SUBJECTID_2 =
		"query.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_VISITGROUPID_2 =
		"query.visitGroupId = ? AND ";

	private static final String
		_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITDEFINITIONID_2 =
			"query.visitDefinitionId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_VISITCRFID_2 =
		"query.visitCRFId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_SUBCRFID_2 =
		"query.subCRFId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_INSTANCEID_2 =
		"query.instanceId = ?";

	private FinderPath _finderPathWithPaginationFindByItemCode;
	private FinderPath _finderPathWithoutPaginationFindByItemCode;
	private FinderPath _finderPathCountByItemCode;

	/**
	 * Returns all the queries where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByItemCode(long itemCode) {
		return findByItemCode(
			itemCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByItemCode(long itemCode, int start, int end) {
		return findByItemCode(itemCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByItemCode(
		long itemCode, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByItemCode(itemCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where itemCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param itemCode the item code
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByItemCode(
		long itemCode, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByItemCode;
				finderArgs = new Object[] {itemCode};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByItemCode;
			finderArgs = new Object[] {itemCode, start, end, orderByComparator};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (itemCode != query.getItemCode()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_ITEMCODE_ITEMCODE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(itemCode);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByItemCode_First(
			long itemCode, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByItemCode_First(itemCode, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("itemCode=");
		sb.append(itemCode);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByItemCode_First(
		long itemCode, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByItemCode(itemCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByItemCode_Last(
			long itemCode, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByItemCode_Last(itemCode, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("itemCode=");
		sb.append(itemCode);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByItemCode_Last(
		long itemCode, OrderByComparator<Query> orderByComparator) {

		int count = countByItemCode(itemCode);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByItemCode(
			itemCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where itemCode = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param itemCode the item code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByItemCode_PrevAndNext(
			long queryId, long itemCode,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByItemCode_PrevAndNext(
				session, query, itemCode, orderByComparator, true);

			array[1] = query;

			array[2] = getByItemCode_PrevAndNext(
				session, query, itemCode, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByItemCode_PrevAndNext(
		Session session, Query query, long itemCode,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_ITEMCODE_ITEMCODE_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(itemCode);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where itemCode = &#63; from the database.
	 *
	 * @param itemCode the item code
	 */
	@Override
	public void removeByItemCode(long itemCode) {
		for (Query query :
				findByItemCode(
					itemCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where itemCode = &#63;.
	 *
	 * @param itemCode the item code
	 * @return the number of matching queries
	 */
	@Override
	public int countByItemCode(long itemCode) {
		FinderPath finderPath = _finderPathCountByItemCode;

		Object[] finderArgs = new Object[] {itemCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_ITEMCODE_ITEMCODE_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(itemCode);

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

	private static final String _FINDER_COLUMN_ITEMCODE_ITEMCODE_2 =
		"query.itemCode = ?";

	private FinderPath _finderPathWithPaginationFindByOpenUserId;
	private FinderPath _finderPathWithoutPaginationFindByOpenUserId;
	private FinderPath _finderPathCountByOpenUserId;

	/**
	 * Returns all the queries where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByOpenUserId(long openUserId) {
		return findByOpenUserId(
			openUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByOpenUserId(long openUserId, int start, int end) {
		return findByOpenUserId(openUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByOpenUserId(
		long openUserId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByOpenUserId(
			openUserId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where openUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param openUserId the open user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByOpenUserId(
		long openUserId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByOpenUserId;
				finderArgs = new Object[] {openUserId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByOpenUserId;
			finderArgs = new Object[] {
				openUserId, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (openUserId != query.getOpenUserId()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_OPENUSERID_OPENUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(openUserId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByOpenUserId_First(
			long openUserId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByOpenUserId_First(openUserId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("openUserId=");
		sb.append(openUserId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByOpenUserId_First(
		long openUserId, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByOpenUserId(
			openUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByOpenUserId_Last(
			long openUserId, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByOpenUserId_Last(openUserId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("openUserId=");
		sb.append(openUserId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByOpenUserId_Last(
		long openUserId, OrderByComparator<Query> orderByComparator) {

		int count = countByOpenUserId(openUserId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByOpenUserId(
			openUserId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where openUserId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param openUserId the open user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByOpenUserId_PrevAndNext(
			long queryId, long openUserId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByOpenUserId_PrevAndNext(
				session, query, openUserId, orderByComparator, true);

			array[1] = query;

			array[2] = getByOpenUserId_PrevAndNext(
				session, query, openUserId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByOpenUserId_PrevAndNext(
		Session session, Query query, long openUserId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_OPENUSERID_OPENUSERID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(openUserId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where openUserId = &#63; from the database.
	 *
	 * @param openUserId the open user ID
	 */
	@Override
	public void removeByOpenUserId(long openUserId) {
		for (Query query :
				findByOpenUserId(
					openUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where openUserId = &#63;.
	 *
	 * @param openUserId the open user ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByOpenUserId(long openUserId) {
		FinderPath finderPath = _finderPathCountByOpenUserId;

		Object[] finderArgs = new Object[] {openUserId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_OPENUSERID_OPENUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(openUserId);

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

	private static final String _FINDER_COLUMN_OPENUSERID_OPENUSERID_2 =
		"query.openUserId = ?";

	private FinderPath _finderPathWithPaginationFindByAnswerUserID;
	private FinderPath _finderPathWithoutPaginationFindByAnswerUserID;
	private FinderPath _finderPathCountByAnswerUserID;

	/**
	 * Returns all the queries where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByAnswerUserID(long answerUserID) {
		return findByAnswerUserID(
			answerUserID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByAnswerUserID(
		long answerUserID, int start, int end) {

		return findByAnswerUserID(answerUserID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByAnswerUserID(
		long answerUserID, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByAnswerUserID(
			answerUserID, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where answerUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param answerUserID the answer user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByAnswerUserID(
		long answerUserID, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAnswerUserID;
				finderArgs = new Object[] {answerUserID};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAnswerUserID;
			finderArgs = new Object[] {
				answerUserID, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (answerUserID != query.getAnswerUserID()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_ANSWERUSERID_ANSWERUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(answerUserID);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByAnswerUserID_First(
			long answerUserID, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByAnswerUserID_First(
			answerUserID, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("answerUserID=");
		sb.append(answerUserID);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByAnswerUserID_First(
		long answerUserID, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByAnswerUserID(
			answerUserID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByAnswerUserID_Last(
			long answerUserID, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByAnswerUserID_Last(answerUserID, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("answerUserID=");
		sb.append(answerUserID);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByAnswerUserID_Last(
		long answerUserID, OrderByComparator<Query> orderByComparator) {

		int count = countByAnswerUserID(answerUserID);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByAnswerUserID(
			answerUserID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where answerUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param answerUserID the answer user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByAnswerUserID_PrevAndNext(
			long queryId, long answerUserID,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByAnswerUserID_PrevAndNext(
				session, query, answerUserID, orderByComparator, true);

			array[1] = query;

			array[2] = getByAnswerUserID_PrevAndNext(
				session, query, answerUserID, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByAnswerUserID_PrevAndNext(
		Session session, Query query, long answerUserID,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_ANSWERUSERID_ANSWERUSERID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(answerUserID);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where answerUserID = &#63; from the database.
	 *
	 * @param answerUserID the answer user ID
	 */
	@Override
	public void removeByAnswerUserID(long answerUserID) {
		for (Query query :
				findByAnswerUserID(
					answerUserID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where answerUserID = &#63;.
	 *
	 * @param answerUserID the answer user ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByAnswerUserID(long answerUserID) {
		FinderPath finderPath = _finderPathCountByAnswerUserID;

		Object[] finderArgs = new Object[] {answerUserID};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_ANSWERUSERID_ANSWERUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(answerUserID);

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

	private static final String _FINDER_COLUMN_ANSWERUSERID_ANSWERUSERID_2 =
		"query.answerUserID = ?";

	private FinderPath _finderPathWithPaginationFindByCloseUserID;
	private FinderPath _finderPathWithoutPaginationFindByCloseUserID;
	private FinderPath _finderPathCountByCloseUserID;

	/**
	 * Returns all the queries where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByCloseUserID(long closeUserID) {
		return findByCloseUserID(
			closeUserID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByCloseUserID(long closeUserID, int start, int end) {
		return findByCloseUserID(closeUserID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByCloseUserID(
		long closeUserID, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByCloseUserID(
			closeUserID, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where closeUserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param closeUserID the close user ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByCloseUserID(
		long closeUserID, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCloseUserID;
				finderArgs = new Object[] {closeUserID};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCloseUserID;
			finderArgs = new Object[] {
				closeUserID, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if (closeUserID != query.getCloseUserID()) {
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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_CLOSEUSERID_CLOSEUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(closeUserID);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByCloseUserID_First(
			long closeUserID, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByCloseUserID_First(closeUserID, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("closeUserID=");
		sb.append(closeUserID);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByCloseUserID_First(
		long closeUserID, OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByCloseUserID(
			closeUserID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByCloseUserID_Last(
			long closeUserID, OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByCloseUserID_Last(closeUserID, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("closeUserID=");
		sb.append(closeUserID);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByCloseUserID_Last(
		long closeUserID, OrderByComparator<Query> orderByComparator) {

		int count = countByCloseUserID(closeUserID);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByCloseUserID(
			closeUserID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where closeUserID = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param closeUserID the close user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByCloseUserID_PrevAndNext(
			long queryId, long closeUserID,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByCloseUserID_PrevAndNext(
				session, query, closeUserID, orderByComparator, true);

			array[1] = query;

			array[2] = getByCloseUserID_PrevAndNext(
				session, query, closeUserID, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByCloseUserID_PrevAndNext(
		Session session, Query query, long closeUserID,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_CLOSEUSERID_CLOSEUSERID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(closeUserID);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where closeUserID = &#63; from the database.
	 *
	 * @param closeUserID the close user ID
	 */
	@Override
	public void removeByCloseUserID(long closeUserID) {
		for (Query query :
				findByCloseUserID(
					closeUserID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where closeUserID = &#63;.
	 *
	 * @param closeUserID the close user ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByCloseUserID(long closeUserID) {
		FinderPath finderPath = _finderPathCountByCloseUserID;

		Object[] finderArgs = new Object[] {closeUserID};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_CLOSEUSERID_CLOSEUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(closeUserID);

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

	private static final String _FINDER_COLUMN_CLOSEUSERID_CLOSEUSERID_2 =
		"query.closeUserID = ?";

	private FinderPath _finderPathWithPaginationFindByR_R;
	private FinderPath _finderPathWithoutPaginationFindByR_R;
	private FinderPath _finderPathCountByR_R;

	/**
	 * Returns all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the matching queries
	 */
	@Override
	public List<Query> findByR_R(long reopenId, long ruleId) {
		return findByR_R(
			reopenId, ruleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of matching queries
	 */
	@Override
	public List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end) {

		return findByR_R(reopenId, ruleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end,
		OrderByComparator<Query> orderByComparator) {

		return findByR_R(reopenId, ruleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching queries
	 */
	@Override
	public List<Query> findByR_R(
		long reopenId, long ruleId, int start, int end,
		OrderByComparator<Query> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByR_R;
				finderArgs = new Object[] {reopenId, ruleId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByR_R;
			finderArgs = new Object[] {
				reopenId, ruleId, start, end, orderByComparator
			};
		}

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Query query : list) {
					if ((reopenId != query.getReopenId()) ||
						(ruleId != query.getRuleId())) {

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

			sb.append(_SQL_SELECT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_R_R_REOPENID_2);

			sb.append(_FINDER_COLUMN_R_R_RULEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(reopenId);

				queryPos.add(ruleId);

				list = (List<Query>)QueryUtil.list(
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
	 * Returns the first query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByR_R_First(
			long reopenId, long ruleId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByR_R_First(reopenId, ruleId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("reopenId=");
		sb.append(reopenId);

		sb.append(", ruleId=");
		sb.append(ruleId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the first query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByR_R_First(
		long reopenId, long ruleId,
		OrderByComparator<Query> orderByComparator) {

		List<Query> list = findByR_R(reopenId, ruleId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query
	 * @throws NoSuchQueryException if a matching query could not be found
	 */
	@Override
	public Query findByR_R_Last(
			long reopenId, long ruleId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = fetchByR_R_Last(reopenId, ruleId, orderByComparator);

		if (query != null) {
			return query;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("reopenId=");
		sb.append(reopenId);

		sb.append(", ruleId=");
		sb.append(ruleId);

		sb.append("}");

		throw new NoSuchQueryException(sb.toString());
	}

	/**
	 * Returns the last query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query, or <code>null</code> if a matching query could not be found
	 */
	@Override
	public Query fetchByR_R_Last(
		long reopenId, long ruleId,
		OrderByComparator<Query> orderByComparator) {

		int count = countByR_R(reopenId, ruleId);

		if (count == 0) {
			return null;
		}

		List<Query> list = findByR_R(
			reopenId, ruleId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the queries before and after the current query in the ordered set where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param queryId the primary key of the current query
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query[] findByR_R_PrevAndNext(
			long queryId, long reopenId, long ruleId,
			OrderByComparator<Query> orderByComparator)
		throws NoSuchQueryException {

		Query query = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			Query[] array = new QueryImpl[3];

			array[0] = getByR_R_PrevAndNext(
				session, query, reopenId, ruleId, orderByComparator, true);

			array[1] = query;

			array[2] = getByR_R_PrevAndNext(
				session, query, reopenId, ruleId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Query getByR_R_PrevAndNext(
		Session session, Query query, long reopenId, long ruleId,
		OrderByComparator<Query> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUERY_WHERE);

		sb.append(_FINDER_COLUMN_R_R_REOPENID_2);

		sb.append(_FINDER_COLUMN_R_R_RULEID_2);

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
			sb.append(QueryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(reopenId);

		queryPos.add(ruleId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(query)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Query> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the queries where reopenId = &#63; and ruleId = &#63; from the database.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 */
	@Override
	public void removeByR_R(long reopenId, long ruleId) {
		for (Query query :
				findByR_R(
					reopenId, ruleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(query);
		}
	}

	/**
	 * Returns the number of queries where reopenId = &#63; and ruleId = &#63;.
	 *
	 * @param reopenId the reopen ID
	 * @param ruleId the rule ID
	 * @return the number of matching queries
	 */
	@Override
	public int countByR_R(long reopenId, long ruleId) {
		FinderPath finderPath = _finderPathCountByR_R;

		Object[] finderArgs = new Object[] {reopenId, ruleId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERY_WHERE);

			sb.append(_FINDER_COLUMN_R_R_REOPENID_2);

			sb.append(_FINDER_COLUMN_R_R_RULEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(reopenId);

				queryPos.add(ruleId);

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

	private static final String _FINDER_COLUMN_R_R_REOPENID_2 =
		"query.reopenId = ? AND ";

	private static final String _FINDER_COLUMN_R_R_RULEID_2 =
		"query.ruleId = ?";

	public QueryPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Query.class);

		setModelImplClass(QueryImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the query in the entity cache if it is enabled.
	 *
	 * @param query the query
	 */
	@Override
	public void cacheResult(Query query) {
		entityCache.putResult(
			entityCacheEnabled, QueryImpl.class, query.getPrimaryKey(), query);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {query.getUuid(), query.getGroupId()}, query);

		query.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the queries in the entity cache if it is enabled.
	 *
	 * @param queries the queries
	 */
	@Override
	public void cacheResult(List<Query> queries) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (queries.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Query query : queries) {
			if (entityCache.getResult(
					entityCacheEnabled, QueryImpl.class,
					query.getPrimaryKey()) == null) {

				cacheResult(query);
			}
			else {
				query.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all queries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QueryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the query.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Query query) {
		entityCache.removeResult(
			entityCacheEnabled, QueryImpl.class, query.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((QueryModelImpl)query, true);
	}

	@Override
	public void clearCache(List<Query> queries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Query query : queries) {
			entityCache.removeResult(
				entityCacheEnabled, QueryImpl.class, query.getPrimaryKey());

			clearUniqueFindersCache((QueryModelImpl)query, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, QueryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(QueryModelImpl queryModelImpl) {
		Object[] args = new Object[] {
			queryModelImpl.getUuid(), queryModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, queryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		QueryModelImpl queryModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				queryModelImpl.getUuid(), queryModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((queryModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				queryModelImpl.getOriginalUuid(),
				queryModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new query with the primary key. Does not add the query to the database.
	 *
	 * @param queryId the primary key for the new query
	 * @return the new query
	 */
	@Override
	public Query create(long queryId) {
		Query query = new QueryImpl();

		query.setNew(true);
		query.setPrimaryKey(queryId);

		String uuid = PortalUUIDUtil.generate();

		query.setUuid(uuid);

		query.setCompanyId(CompanyThreadLocal.getCompanyId());

		return query;
	}

	/**
	 * Removes the query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryId the primary key of the query
	 * @return the query that was removed
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query remove(long queryId) throws NoSuchQueryException {
		return remove((Serializable)queryId);
	}

	/**
	 * Removes the query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the query
	 * @return the query that was removed
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query remove(Serializable primaryKey) throws NoSuchQueryException {
		Session session = null;

		try {
			session = openSession();

			Query query = (Query)session.get(QueryImpl.class, primaryKey);

			if (query == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQueryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(query);
		}
		catch (NoSuchQueryException noSuchEntityException) {
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
	protected Query removeImpl(Query query) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(query)) {
				query = (Query)session.get(
					QueryImpl.class, query.getPrimaryKeyObj());
			}

			if (query != null) {
				session.delete(query);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (query != null) {
			clearCache(query);
		}

		return query;
	}

	@Override
	public Query updateImpl(Query query) {
		boolean isNew = query.isNew();

		if (!(query instanceof QueryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(query.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(query);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in query proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Query implementation " +
					query.getClass());
		}

		QueryModelImpl queryModelImpl = (QueryModelImpl)query;

		if (Validator.isNull(query.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			query.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (query.getCreateDate() == null)) {
			if (serviceContext == null) {
				query.setCreateDate(date);
			}
			else {
				query.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!queryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				query.setModifiedDate(date);
			}
			else {
				query.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(query);

				query.setNew(false);
			}
			else {
				query = (Query)session.merge(query);
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
			Object[] args = new Object[] {queryModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				queryModelImpl.getUuid(), queryModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {queryModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {
				queryModelImpl.getGroupId(), queryModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {queryModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			args = new Object[] {
				queryModelImpl.getSubjectId(), queryModelImpl.getVisitGroupId(),
				queryModelImpl.getVisitDefinitionId(),
				queryModelImpl.getVisitCRFId(), queryModelImpl.getSubCRFId(),
				queryModelImpl.getInstanceId()
			};

			finderCache.removeResult(_finderPathCountByS_VG_VD_VC_S_I, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);

			args = new Object[] {queryModelImpl.getItemCode()};

			finderCache.removeResult(_finderPathCountByItemCode, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByItemCode, args);

			args = new Object[] {queryModelImpl.getOpenUserId()};

			finderCache.removeResult(_finderPathCountByOpenUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByOpenUserId, args);

			args = new Object[] {queryModelImpl.getAnswerUserID()};

			finderCache.removeResult(_finderPathCountByAnswerUserID, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByAnswerUserID, args);

			args = new Object[] {queryModelImpl.getCloseUserID()};

			finderCache.removeResult(_finderPathCountByCloseUserID, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCloseUserID, args);

			args = new Object[] {
				queryModelImpl.getReopenId(), queryModelImpl.getRuleId()
			};

			finderCache.removeResult(_finderPathCountByR_R, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByR_R, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {queryModelImpl.getOriginalUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {queryModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalUuid(),
					queryModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					queryModelImpl.getUuid(), queryModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {queryModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalGroupId(),
					queryModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					queryModelImpl.getGroupId(), queryModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {queryModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG_VD_VC_S_I.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalSubjectId(),
					queryModelImpl.getOriginalVisitGroupId(),
					queryModelImpl.getOriginalVisitDefinitionId(),
					queryModelImpl.getOriginalVisitCRFId(),
					queryModelImpl.getOriginalSubCRFId(),
					queryModelImpl.getOriginalInstanceId()
				};

				finderCache.removeResult(
					_finderPathCountByS_VG_VD_VC_S_I, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);

				args = new Object[] {
					queryModelImpl.getSubjectId(),
					queryModelImpl.getVisitGroupId(),
					queryModelImpl.getVisitDefinitionId(),
					queryModelImpl.getVisitCRFId(),
					queryModelImpl.getSubCRFId(), queryModelImpl.getInstanceId()
				};

				finderCache.removeResult(
					_finderPathCountByS_VG_VD_VC_S_I, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByItemCode.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalItemCode()
				};

				finderCache.removeResult(_finderPathCountByItemCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByItemCode, args);

				args = new Object[] {queryModelImpl.getItemCode()};

				finderCache.removeResult(_finderPathCountByItemCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByItemCode, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByOpenUserId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalOpenUserId()
				};

				finderCache.removeResult(_finderPathCountByOpenUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOpenUserId, args);

				args = new Object[] {queryModelImpl.getOpenUserId()};

				finderCache.removeResult(_finderPathCountByOpenUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOpenUserId, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByAnswerUserID.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalAnswerUserID()
				};

				finderCache.removeResult(_finderPathCountByAnswerUserID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAnswerUserID, args);

				args = new Object[] {queryModelImpl.getAnswerUserID()};

				finderCache.removeResult(_finderPathCountByAnswerUserID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAnswerUserID, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCloseUserID.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalCloseUserID()
				};

				finderCache.removeResult(_finderPathCountByCloseUserID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCloseUserID, args);

				args = new Object[] {queryModelImpl.getCloseUserID()};

				finderCache.removeResult(_finderPathCountByCloseUserID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCloseUserID, args);
			}

			if ((queryModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByR_R.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryModelImpl.getOriginalReopenId(),
					queryModelImpl.getOriginalRuleId()
				};

				finderCache.removeResult(_finderPathCountByR_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByR_R, args);

				args = new Object[] {
					queryModelImpl.getReopenId(), queryModelImpl.getRuleId()
				};

				finderCache.removeResult(_finderPathCountByR_R, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByR_R, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, QueryImpl.class, query.getPrimaryKey(), query,
			false);

		clearUniqueFindersCache(queryModelImpl, false);
		cacheUniqueFindersCache(queryModelImpl);

		query.resetOriginalValues();

		return query;
	}

	/**
	 * Returns the query with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the query
	 * @return the query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQueryException {

		Query query = fetchByPrimaryKey(primaryKey);

		if (query == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQueryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return query;
	}

	/**
	 * Returns the query with the primary key or throws a <code>NoSuchQueryException</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query
	 * @return the query
	 * @throws NoSuchQueryException if a query with the primary key could not be found
	 */
	@Override
	public Query findByPrimaryKey(long queryId) throws NoSuchQueryException {
		return findByPrimaryKey((Serializable)queryId);
	}

	/**
	 * Returns the query with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query
	 * @return the query, or <code>null</code> if a query with the primary key could not be found
	 */
	@Override
	public Query fetchByPrimaryKey(long queryId) {
		return fetchByPrimaryKey((Serializable)queryId);
	}

	/**
	 * Returns all the queries.
	 *
	 * @return the queries
	 */
	@Override
	public List<Query> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @return the range of queries
	 */
	@Override
	public List<Query> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of queries
	 */
	@Override
	public List<Query> findAll(
		int start, int end, OrderByComparator<Query> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of queries
	 * @param end the upper bound of the range of queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of queries
	 */
	@Override
	public List<Query> findAll(
		int start, int end, OrderByComparator<Query> orderByComparator,
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

		List<Query> list = null;

		if (useFinderCache) {
			list = (List<Query>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUERY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUERY;

				sql = sql.concat(QueryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Query>)QueryUtil.list(
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
	 * Removes all the queries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Query query : findAll()) {
			remove(query);
		}
	}

	/**
	 * Returns the number of queries.
	 *
	 * @return the number of queries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_QUERY);

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
		return "queryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUERY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QueryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the query persistence.
	 */
	@Activate
	public void activate() {
		QueryModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		QueryModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			QueryModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			QueryModelImpl.UUID_COLUMN_BITMASK |
			QueryModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			QueryModelImpl.UUID_COLUMN_BITMASK |
			QueryModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			QueryModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			QueryModelImpl.GROUPID_COLUMN_BITMASK |
			QueryModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			QueryModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			QueryModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryModelImpl.VISITGROUPID_COLUMN_BITMASK |
			QueryModelImpl.VISITDEFINITIONID_COLUMN_BITMASK |
			QueryModelImpl.VISITCRFID_COLUMN_BITMASK |
			QueryModelImpl.SUBCRFID_COLUMN_BITMASK |
			QueryModelImpl.INSTANCEID_COLUMN_BITMASK);

		_finderPathCountByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByItemCode = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByItemCode",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByItemCode = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByItemCode",
			new String[] {Long.class.getName()},
			QueryModelImpl.ITEMCODE_COLUMN_BITMASK);

		_finderPathCountByItemCode = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByItemCode",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByOpenUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOpenUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByOpenUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOpenUserId",
			new String[] {Long.class.getName()},
			QueryModelImpl.OPENUSERID_COLUMN_BITMASK);

		_finderPathCountByOpenUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOpenUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByAnswerUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAnswerUserID",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByAnswerUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAnswerUserID",
			new String[] {Long.class.getName()},
			QueryModelImpl.ANSWERUSERID_COLUMN_BITMASK);

		_finderPathCountByAnswerUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAnswerUserID",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByCloseUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCloseUserID",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCloseUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCloseUserID",
			new String[] {Long.class.getName()},
			QueryModelImpl.CLOSEUSERID_COLUMN_BITMASK);

		_finderPathCountByCloseUserID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCloseUserID",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByR_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByR_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByR_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByR_R",
			new String[] {Long.class.getName(), Long.class.getName()},
			QueryModelImpl.REOPENID_COLUMN_BITMASK |
			QueryModelImpl.RULEID_COLUMN_BITMASK);

		_finderPathCountByR_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByR_R",
			new String[] {Long.class.getName(), Long.class.getName()});

		_setQueryUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setQueryUtilPersistence(null);

		entityCache.removeCache(QueryImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setQueryUtilPersistence(QueryPersistence queryPersistence) {
		try {
			Field field = QueryUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, queryPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.Query"),
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

	private static final String _SQL_SELECT_QUERY =
		"SELECT query FROM Query query";

	private static final String _SQL_SELECT_QUERY_WHERE =
		"SELECT query FROM Query query WHERE ";

	private static final String _SQL_COUNT_QUERY =
		"SELECT COUNT(query) FROM Query query";

	private static final String _SQL_COUNT_QUERY_WHERE =
		"SELECT COUNT(query) FROM Query query WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "query.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Query exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Query exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QueryPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "type"});

}
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

import com.dhsoft.edc.backend.exception.NoSuchQueryLinkException;
import com.dhsoft.edc.backend.model.QueryLink;
import com.dhsoft.edc.backend.model.impl.QueryLinkImpl;
import com.dhsoft.edc.backend.model.impl.QueryLinkModelImpl;
import com.dhsoft.edc.backend.service.persistence.QueryLinkPersistence;
import com.dhsoft.edc.backend.service.persistence.QueryLinkUtil;
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
 * The persistence implementation for the query link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QueryLinkPersistence.class)
public class QueryLinkPersistenceImpl
	extends BasePersistenceImpl<QueryLink> implements QueryLinkPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QueryLinkUtil</code> to access the query link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QueryLinkImpl.class.getName();

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
	 * Returns all the query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
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

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if (!uuid.equals(queryLink.getUuid())) {
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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByUuid_First(
			String uuid, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByUuid_First(uuid, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUuid_First(
		String uuid, OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByUuid_Last(
			String uuid, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByUuid_Last(uuid, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUuid_Last(
		String uuid, OrderByComparator<QueryLink> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByUuid_PrevAndNext(
			long queryId, String uuid,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		uuid = Objects.toString(uuid, "");

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, queryLink, uuid, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByUuid_PrevAndNext(
				session, queryLink, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getByUuid_PrevAndNext(
		Session session, QueryLink queryLink, String uuid,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (QueryLink queryLink :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching query links
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

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
		"queryLink.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(queryLink.uuid IS NULL OR queryLink.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByUUID_G(String uuid, long groupId)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByUUID_G(uuid, groupId);

		if (queryLink == null) {
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

			throw new NoSuchQueryLinkException(sb.toString());
		}

		return queryLink;
	}

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the query link where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUUID_G(
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

		if (result instanceof QueryLink) {
			QueryLink queryLink = (QueryLink)result;

			if (!Objects.equals(uuid, queryLink.getUuid()) ||
				(groupId != queryLink.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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

				List<QueryLink> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					QueryLink queryLink = list.get(0);

					result = queryLink;

					cacheResult(queryLink);
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
			return (QueryLink)result;
		}
	}

	/**
	 * Removes the query link where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the query link that was removed
	 */
	@Override
	public QueryLink removeByUUID_G(String uuid, long groupId)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByUUID_G(uuid, groupId);

		return remove(queryLink);
	}

	/**
	 * Returns the number of query links where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

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
		"queryLink.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(queryLink.uuid IS NULL OR queryLink.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"queryLink.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
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

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if (!uuid.equals(queryLink.getUuid()) ||
						(companyId != queryLink.getCompanyId())) {

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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QueryLink> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByUuid_C_PrevAndNext(
			long queryId, String uuid, long companyId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		uuid = Objects.toString(uuid, "");

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, queryLink, uuid, companyId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByUuid_C_PrevAndNext(
				session, queryLink, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getByUuid_C_PrevAndNext(
		Session session, QueryLink queryLink, String uuid, long companyId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (QueryLink queryLink :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

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
		"queryLink.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(queryLink.uuid IS NULL OR queryLink.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"queryLink.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBySubjectId;
	private FinderPath _finderPathWithoutPaginationFindBySubjectId;
	private FinderPath _finderPathCountBySubjectId;

	/**
	 * Returns all the query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findBySubjectId(long subjectId) {
		return findBySubjectId(
			subjectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findBySubjectId(long subjectId, int start, int end) {
		return findBySubjectId(subjectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findBySubjectId(subjectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBySubjectId;
				finderArgs = new Object[] {subjectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBySubjectId;
			finderArgs = new Object[] {
				subjectId, start, end, orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if (subjectId != queryLink.getSubjectId()) {
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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findBySubjectId_First(
			long subjectId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchBySubjectId_First(
			subjectId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchBySubjectId_First(
		long subjectId, OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findBySubjectId(
			subjectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findBySubjectId_Last(
			long subjectId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchBySubjectId_Last(
			subjectId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchBySubjectId_Last(
		long subjectId, OrderByComparator<QueryLink> orderByComparator) {

		int count = countBySubjectId(subjectId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findBySubjectId(
			subjectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findBySubjectId_PrevAndNext(
			long queryId, long subjectId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getBySubjectId_PrevAndNext(
				session, queryLink, subjectId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getBySubjectId_PrevAndNext(
				session, queryLink, subjectId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getBySubjectId_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(subjectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	@Override
	public void removeBySubjectId(long subjectId) {
		for (QueryLink queryLink :
				findBySubjectId(
					subjectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching query links
	 */
	@Override
	public int countBySubjectId(long subjectId) {
		FinderPath finderPath = _finderPathCountBySubjectId;

		Object[] finderArgs = new Object[] {subjectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

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

	private static final String _FINDER_COLUMN_SUBJECTID_SUBJECTID_2 =
		"queryLink.subjectId = ?";

	private FinderPath _finderPathWithPaginationFindByInstanceId;
	private FinderPath _finderPathWithoutPaginationFindByInstanceId;
	private FinderPath _finderPathCountByInstanceId;

	/**
	 * Returns all the query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByInstanceId(long instanceId) {
		return findByInstanceId(
			instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByInstanceId(
		long instanceId, int start, int end) {

		return findByInstanceId(instanceId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByInstanceId(
			instanceId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByInstanceId(
		long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByInstanceId;
				finderArgs = new Object[] {instanceId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByInstanceId;
			finderArgs = new Object[] {
				instanceId, start, end, orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if (instanceId != queryLink.getInstanceId()) {
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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_INSTANCEID_INSTANCEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(instanceId);

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByInstanceId_First(
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByInstanceId_First(
			instanceId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("instanceId=");
		sb.append(instanceId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByInstanceId_First(
		long instanceId, OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByInstanceId(
			instanceId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByInstanceId_Last(
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByInstanceId_Last(
			instanceId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("instanceId=");
		sb.append(instanceId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByInstanceId_Last(
		long instanceId, OrderByComparator<QueryLink> orderByComparator) {

		int count = countByInstanceId(instanceId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByInstanceId(
			instanceId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByInstanceId_PrevAndNext(
			long queryId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByInstanceId_PrevAndNext(
				session, queryLink, instanceId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByInstanceId_PrevAndNext(
				session, queryLink, instanceId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getByInstanceId_PrevAndNext(
		Session session, QueryLink queryLink, long instanceId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_INSTANCEID_INSTANCEID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(instanceId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where instanceId = &#63; from the database.
	 *
	 * @param instanceId the instance ID
	 */
	@Override
	public void removeByInstanceId(long instanceId) {
		for (QueryLink queryLink :
				findByInstanceId(
					instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where instanceId = &#63;.
	 *
	 * @param instanceId the instance ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByInstanceId(long instanceId) {
		FinderPath finderPath = _finderPathCountByInstanceId;

		Object[] finderArgs = new Object[] {instanceId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_INSTANCEID_INSTANCEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_INSTANCEID_INSTANCEID_2 =
		"queryLink.instanceId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG;
	private FinderPath _finderPathWithoutPaginationFindByS_VG;
	private FinderPath _finderPathCountByS_VG;

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG(long subjectId, long visitGroupId) {
		return findByS_VG(
			subjectId, visitGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end) {

		return findByS_VG(subjectId, visitGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByS_VG(
			subjectId, visitGroupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG(
		long subjectId, long visitGroupId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByS_VG;
				finderArgs = new Object[] {subjectId, visitGroupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByS_VG;
			finderArgs = new Object[] {
				subjectId, visitGroupId, start, end, orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if ((subjectId != queryLink.getSubjectId()) ||
						(visitGroupId != queryLink.getVisitGroupId())) {

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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VISITGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				queryPos.add(visitGroupId);

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_First(
			long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_First(
			subjectId, visitGroupId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_First(
		long subjectId, long visitGroupId,
		OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByS_VG(
			subjectId, visitGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_Last(
			long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_Last(
			subjectId, visitGroupId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_Last(
		long subjectId, long visitGroupId,
		OrderByComparator<QueryLink> orderByComparator) {

		int count = countByS_VG(subjectId, visitGroupId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByS_VG(
			subjectId, visitGroupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByS_VG_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByS_VG_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, orderByComparator,
				true);

			array[1] = queryLink;

			array[2] = getByS_VG_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, orderByComparator,
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

	protected QueryLink getByS_VG_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId, long visitGroupId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_S_VG_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_S_VG_VISITGROUPID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(subjectId);

		queryPos.add(visitGroupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 */
	@Override
	public void removeByS_VG(long subjectId, long visitGroupId) {
		for (QueryLink queryLink :
				findByS_VG(
					subjectId, visitGroupId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByS_VG(long subjectId, long visitGroupId) {
		FinderPath finderPath = _finderPathCountByS_VG;

		Object[] finderArgs = new Object[] {subjectId, visitGroupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VISITGROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				queryPos.add(visitGroupId);

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

	private static final String _FINDER_COLUMN_S_VG_SUBJECTID_2 =
		"queryLink.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VISITGROUPID_2 =
		"queryLink.visitGroupId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG_VD;
	private FinderPath _finderPathWithoutPaginationFindByS_VG_VD;
	private FinderPath _finderPathCountByS_VG_VD;

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		return findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end) {

		return findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end, OrderByComparator<QueryLink> orderByComparator) {

		return findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId, int start,
		int end, OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByS_VG_VD;
				finderArgs = new Object[] {
					subjectId, visitGroupId, visitDefinitionId
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByS_VG_VD;
			finderArgs = new Object[] {
				subjectId, visitGroupId, visitDefinitionId, start, end,
				orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if ((subjectId != queryLink.getSubjectId()) ||
						(visitGroupId != queryLink.getVisitGroupId()) ||
						(visitDefinitionId !=
							queryLink.getVisitDefinitionId())) {

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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VISITDEFINITIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_First(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, 0, 1,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_Last(
			subjectId, visitGroupId, visitDefinitionId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		OrderByComparator<QueryLink> orderByComparator) {

		int count = countByS_VG_VD(subjectId, visitGroupId, visitDefinitionId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByS_VG_VD(
			subjectId, visitGroupId, visitDefinitionId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByS_VG_VD_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByS_VG_VD_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByS_VG_VD_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
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

	protected QueryLink getByS_VG_VD_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId, long visitGroupId,
		long visitDefinitionId, OrderByComparator<QueryLink> orderByComparator,
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

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_S_VG_VD_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VISITGROUPID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VISITDEFINITIONID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(subjectId);

		queryPos.add(visitGroupId);

		queryPos.add(visitDefinitionId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 */
	@Override
	public void removeByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		for (QueryLink queryLink :
				findByS_VG_VD(
					subjectId, visitGroupId, visitDefinitionId,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByS_VG_VD(
		long subjectId, long visitGroupId, long visitDefinitionId) {

		FinderPath finderPath = _finderPathCountByS_VG_VD;

		Object[] finderArgs = new Object[] {
			subjectId, visitGroupId, visitDefinitionId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VISITDEFINITIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				queryPos.add(visitGroupId);

				queryPos.add(visitDefinitionId);

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

	private static final String _FINDER_COLUMN_S_VG_VD_SUBJECTID_2 =
		"queryLink.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VISITGROUPID_2 =
		"queryLink.visitGroupId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VISITDEFINITIONID_2 =
		"queryLink.visitDefinitionId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG_VD_VC;
	private FinderPath _finderPathWithoutPaginationFindByS_VG_VD_VC;
	private FinderPath _finderPathCountByS_VG_VD_VC;

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		return findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end) {

		return findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByS_VG_VD_VC;
				finderArgs = new Object[] {
					subjectId, visitGroupId, visitDefinitionId, visitCRFId
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByS_VG_VD_VC;
			finderArgs = new Object[] {
				subjectId, visitGroupId, visitDefinitionId, visitCRFId, start,
				end, orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if ((subjectId != queryLink.getSubjectId()) ||
						(visitGroupId != queryLink.getVisitGroupId()) ||
						(visitDefinitionId !=
							queryLink.getVisitDefinitionId()) ||
						(visitCRFId != queryLink.getVisitCRFId())) {

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
					6 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(6);
			}

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITCRFID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append(", visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, 0, 1,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId,
			orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append(", visitGroupId=");
		sb.append(visitGroupId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append(", visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, OrderByComparator<QueryLink> orderByComparator) {

		int count = countByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByS_VG_VD_VC(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, count - 1,
			count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByS_VG_VD_VC_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByS_VG_VD_VC_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByS_VG_VD_VC_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getByS_VG_VD_VC_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId, long visitGroupId,
		long visitDefinitionId, long visitCRFId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITGROUPID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITDEFINITIONID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITCRFID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 */
	@Override
	public void removeByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		for (QueryLink queryLink :
				findByS_VG_VD_VC(
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByS_VG_VD_VC(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId) {

		FinderPath finderPath = _finderPathCountByS_VG_VD_VC;

		Object[] finderArgs = new Object[] {
			subjectId, visitGroupId, visitDefinitionId, visitCRFId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_VISITCRFID_2);

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

	private static final String _FINDER_COLUMN_S_VG_VD_VC_SUBJECTID_2 =
		"queryLink.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_VISITGROUPID_2 =
		"queryLink.visitGroupId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_VISITDEFINITIONID_2 =
		"queryLink.visitDefinitionId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_VISITCRFID_2 =
		"queryLink.visitCRFId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG_VD_VC_S;
	private FinderPath _finderPathWithoutPaginationFindByS_VG_VD_VC_S;
	private FinderPath _finderPathCountByS_VG_VD_VC_S;

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		return findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end) {

		return findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByS_VG_VD_VC_S;
				finderArgs = new Object[] {
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					subCRFId
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByS_VG_VD_VC_S;
			finderArgs = new Object[] {
				subjectId, visitGroupId, visitDefinitionId, visitCRFId,
				subCRFId, start, end, orderByComparator
			};
		}

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if ((subjectId != queryLink.getSubjectId()) ||
						(visitGroupId != queryLink.getVisitGroupId()) ||
						(visitDefinitionId !=
							queryLink.getVisitDefinitionId()) ||
						(visitCRFId != queryLink.getVisitCRFId()) ||
						(subCRFId != queryLink.getSubCRFId())) {

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
					7 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(7);
			}

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBCRFID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_S_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_S_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(12);

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

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_S_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId, 0,
			1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_S_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_S_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			orderByComparator);

		if (queryLink != null) {
			return queryLink;
		}

		StringBundler sb = new StringBundler(12);

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

		sb.append("}");

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_S_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId,
		OrderByComparator<QueryLink> orderByComparator) {

		int count = countByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByS_VG_VD_VC_S(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByS_VG_VD_VC_S_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByS_VG_VD_VC_S_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, subCRFId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByS_VG_VD_VC_S_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, subCRFId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QueryLink getByS_VG_VD_VC_S_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId, long visitGroupId,
		long visitDefinitionId, long visitCRFId, long subCRFId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				8 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(7);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITGROUPID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITDEFINITIONID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITCRFID_2);

		sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBCRFID_2);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 */
	@Override
	public void removeByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		for (QueryLink queryLink :
				findByS_VG_VD_VC_S(
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					subCRFId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @return the number of matching query links
	 */
	@Override
	public int countByS_VG_VD_VC_S(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId) {

		FinderPath finderPath = _finderPathCountByS_VG_VD_VC_S;

		Object[] finderArgs = new Object[] {
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITGROUPID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITDEFINITIONID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_VISITCRFID_2);

			sb.append(_FINDER_COLUMN_S_VG_VD_VC_S_SUBCRFID_2);

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

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_SUBJECTID_2 =
		"queryLink.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_VISITGROUPID_2 =
		"queryLink.visitGroupId = ? AND ";

	private static final String
		_FINDER_COLUMN_S_VG_VD_VC_S_VISITDEFINITIONID_2 =
			"queryLink.visitDefinitionId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_VISITCRFID_2 =
		"queryLink.visitCRFId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_SUBCRFID_2 =
		"queryLink.subCRFId = ?";

	private FinderPath _finderPathWithPaginationFindByS_VG_VD_VC_S_I;
	private FinderPath _finderPathWithoutPaginationFindByS_VG_VD_VC_S_I;
	private FinderPath _finderPathCountByS_VG_VD_VC_S_I;

	/**
	 * Returns all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator) {

		return findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query links
	 */
	@Override
	public List<QueryLink> findByS_VG_VD_VC_S_I(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId, int start, int end,
		OrderByComparator<QueryLink> orderByComparator,
		boolean useFinderCache) {

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

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLink queryLink : list) {
					if ((subjectId != queryLink.getSubjectId()) ||
						(visitGroupId != queryLink.getVisitGroupId()) ||
						(visitDefinitionId !=
							queryLink.getVisitDefinitionId()) ||
						(visitCRFId != queryLink.getVisitCRFId()) ||
						(subCRFId != queryLink.getSubCRFId()) ||
						(instanceId != queryLink.getInstanceId())) {

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

			sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
				sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_S_I_First(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_S_I_First(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
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

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the first query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_S_I_First(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<QueryLink> orderByComparator) {

		List<QueryLink> list = findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link
	 * @throws NoSuchQueryLinkException if a matching query link could not be found
	 */
	@Override
	public QueryLink findByS_VG_VD_VC_S_I_Last(
			long subjectId, long visitGroupId, long visitDefinitionId,
			long visitCRFId, long subCRFId, long instanceId,
			OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByS_VG_VD_VC_S_I_Last(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, orderByComparator);

		if (queryLink != null) {
			return queryLink;
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

		throw new NoSuchQueryLinkException(sb.toString());
	}

	/**
	 * Returns the last query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query link, or <code>null</code> if a matching query link could not be found
	 */
	@Override
	public QueryLink fetchByS_VG_VD_VC_S_I_Last(
		long subjectId, long visitGroupId, long visitDefinitionId,
		long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<QueryLink> orderByComparator) {

		int count = countByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId);

		if (count == 0) {
			return null;
		}

		List<QueryLink> list = findByS_VG_VD_VC_S_I(
			subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId,
			instanceId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query links before and after the current query link in the ordered set where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param queryId the primary key of the current query link
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink[] findByS_VG_VD_VC_S_I_PrevAndNext(
			long queryId, long subjectId, long visitGroupId,
			long visitDefinitionId, long visitCRFId, long subCRFId,
			long instanceId, OrderByComparator<QueryLink> orderByComparator)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = findByPrimaryKey(queryId);

		Session session = null;

		try {
			session = openSession();

			QueryLink[] array = new QueryLinkImpl[3];

			array[0] = getByS_VG_VD_VC_S_I_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
				visitCRFId, subCRFId, instanceId, orderByComparator, true);

			array[1] = queryLink;

			array[2] = getByS_VG_VD_VC_S_I_PrevAndNext(
				session, queryLink, subjectId, visitGroupId, visitDefinitionId,
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

	protected QueryLink getByS_VG_VD_VC_S_I_PrevAndNext(
		Session session, QueryLink queryLink, long subjectId, long visitGroupId,
		long visitDefinitionId, long visitCRFId, long subCRFId, long instanceId,
		OrderByComparator<QueryLink> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				9 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(8);
		}

		sb.append(_SQL_SELECT_QUERYLINK_WHERE);

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
			sb.append(QueryLinkModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(queryLink)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLink> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63; from the database.
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

		for (QueryLink queryLink :
				findByS_VG_VD_VC_S_I(
					subjectId, visitGroupId, visitDefinitionId, visitCRFId,
					subCRFId, instanceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links where subjectId = &#63; and visitGroupId = &#63; and visitDefinitionId = &#63; and visitCRFId = &#63; and subCRFId = &#63; and instanceId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param visitGroupId the visit group ID
	 * @param visitDefinitionId the visit definition ID
	 * @param visitCRFId the visit crf ID
	 * @param subCRFId the sub crf ID
	 * @param instanceId the instance ID
	 * @return the number of matching query links
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

			sb.append(_SQL_COUNT_QUERYLINK_WHERE);

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
		"queryLink.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_VISITGROUPID_2 =
		"queryLink.visitGroupId = ? AND ";

	private static final String
		_FINDER_COLUMN_S_VG_VD_VC_S_I_VISITDEFINITIONID_2 =
			"queryLink.visitDefinitionId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_VISITCRFID_2 =
		"queryLink.visitCRFId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_SUBCRFID_2 =
		"queryLink.subCRFId = ? AND ";

	private static final String _FINDER_COLUMN_S_VG_VD_VC_S_I_INSTANCEID_2 =
		"queryLink.instanceId = ?";

	public QueryLinkPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QueryLink.class);

		setModelImplClass(QueryLinkImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the query link in the entity cache if it is enabled.
	 *
	 * @param queryLink the query link
	 */
	@Override
	public void cacheResult(QueryLink queryLink) {
		entityCache.putResult(
			entityCacheEnabled, QueryLinkImpl.class, queryLink.getPrimaryKey(),
			queryLink);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {queryLink.getUuid(), queryLink.getGroupId()},
			queryLink);

		queryLink.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the query links in the entity cache if it is enabled.
	 *
	 * @param queryLinks the query links
	 */
	@Override
	public void cacheResult(List<QueryLink> queryLinks) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (queryLinks.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QueryLink queryLink : queryLinks) {
			if (entityCache.getResult(
					entityCacheEnabled, QueryLinkImpl.class,
					queryLink.getPrimaryKey()) == null) {

				cacheResult(queryLink);
			}
			else {
				queryLink.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all query links.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QueryLinkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the query link.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QueryLink queryLink) {
		entityCache.removeResult(
			entityCacheEnabled, QueryLinkImpl.class, queryLink.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((QueryLinkModelImpl)queryLink, true);
	}

	@Override
	public void clearCache(List<QueryLink> queryLinks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QueryLink queryLink : queryLinks) {
			entityCache.removeResult(
				entityCacheEnabled, QueryLinkImpl.class,
				queryLink.getPrimaryKey());

			clearUniqueFindersCache((QueryLinkModelImpl)queryLink, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, QueryLinkImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QueryLinkModelImpl queryLinkModelImpl) {

		Object[] args = new Object[] {
			queryLinkModelImpl.getUuid(), queryLinkModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, queryLinkModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		QueryLinkModelImpl queryLinkModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				queryLinkModelImpl.getUuid(), queryLinkModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((queryLinkModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				queryLinkModelImpl.getOriginalUuid(),
				queryLinkModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new query link with the primary key. Does not add the query link to the database.
	 *
	 * @param queryId the primary key for the new query link
	 * @return the new query link
	 */
	@Override
	public QueryLink create(long queryId) {
		QueryLink queryLink = new QueryLinkImpl();

		queryLink.setNew(true);
		queryLink.setPrimaryKey(queryId);

		String uuid = PortalUUIDUtil.generate();

		queryLink.setUuid(uuid);

		queryLink.setCompanyId(CompanyThreadLocal.getCompanyId());

		return queryLink;
	}

	/**
	 * Removes the query link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link that was removed
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink remove(long queryId) throws NoSuchQueryLinkException {
		return remove((Serializable)queryId);
	}

	/**
	 * Removes the query link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the query link
	 * @return the query link that was removed
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink remove(Serializable primaryKey)
		throws NoSuchQueryLinkException {

		Session session = null;

		try {
			session = openSession();

			QueryLink queryLink = (QueryLink)session.get(
				QueryLinkImpl.class, primaryKey);

			if (queryLink == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQueryLinkException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(queryLink);
		}
		catch (NoSuchQueryLinkException noSuchEntityException) {
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
	protected QueryLink removeImpl(QueryLink queryLink) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(queryLink)) {
				queryLink = (QueryLink)session.get(
					QueryLinkImpl.class, queryLink.getPrimaryKeyObj());
			}

			if (queryLink != null) {
				session.delete(queryLink);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (queryLink != null) {
			clearCache(queryLink);
		}

		return queryLink;
	}

	@Override
	public QueryLink updateImpl(QueryLink queryLink) {
		boolean isNew = queryLink.isNew();

		if (!(queryLink instanceof QueryLinkModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(queryLink.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(queryLink);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in queryLink proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QueryLink implementation " +
					queryLink.getClass());
		}

		QueryLinkModelImpl queryLinkModelImpl = (QueryLinkModelImpl)queryLink;

		if (Validator.isNull(queryLink.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			queryLink.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (queryLink.getCreateDate() == null)) {
			if (serviceContext == null) {
				queryLink.setCreateDate(date);
			}
			else {
				queryLink.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!queryLinkModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				queryLink.setModifiedDate(date);
			}
			else {
				queryLink.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(queryLink);

				queryLink.setNew(false);
			}
			else {
				queryLink = (QueryLink)session.merge(queryLink);
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
			Object[] args = new Object[] {queryLinkModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				queryLinkModelImpl.getUuid(), queryLinkModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {queryLinkModelImpl.getSubjectId()};

			finderCache.removeResult(_finderPathCountBySubjectId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBySubjectId, args);

			args = new Object[] {queryLinkModelImpl.getInstanceId()};

			finderCache.removeResult(_finderPathCountByInstanceId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstanceId, args);

			args = new Object[] {
				queryLinkModelImpl.getSubjectId(),
				queryLinkModelImpl.getVisitGroupId()
			};

			finderCache.removeResult(_finderPathCountByS_VG, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG, args);

			args = new Object[] {
				queryLinkModelImpl.getSubjectId(),
				queryLinkModelImpl.getVisitGroupId(),
				queryLinkModelImpl.getVisitDefinitionId()
			};

			finderCache.removeResult(_finderPathCountByS_VG_VD, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG_VD, args);

			args = new Object[] {
				queryLinkModelImpl.getSubjectId(),
				queryLinkModelImpl.getVisitGroupId(),
				queryLinkModelImpl.getVisitDefinitionId(),
				queryLinkModelImpl.getVisitCRFId()
			};

			finderCache.removeResult(_finderPathCountByS_VG_VD_VC, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG_VD_VC, args);

			args = new Object[] {
				queryLinkModelImpl.getSubjectId(),
				queryLinkModelImpl.getVisitGroupId(),
				queryLinkModelImpl.getVisitDefinitionId(),
				queryLinkModelImpl.getVisitCRFId(),
				queryLinkModelImpl.getSubCRFId()
			};

			finderCache.removeResult(_finderPathCountByS_VG_VD_VC_S, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG_VD_VC_S, args);

			args = new Object[] {
				queryLinkModelImpl.getSubjectId(),
				queryLinkModelImpl.getVisitGroupId(),
				queryLinkModelImpl.getVisitDefinitionId(),
				queryLinkModelImpl.getVisitCRFId(),
				queryLinkModelImpl.getSubCRFId(),
				queryLinkModelImpl.getInstanceId()
			};

			finderCache.removeResult(_finderPathCountByS_VG_VD_VC_S_I, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {queryLinkModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalUuid(),
					queryLinkModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					queryLinkModelImpl.getUuid(),
					queryLinkModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBySubjectId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId()
				};

				finderCache.removeResult(_finderPathCountBySubjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySubjectId, args);

				args = new Object[] {queryLinkModelImpl.getSubjectId()};

				finderCache.removeResult(_finderPathCountBySubjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySubjectId, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstanceId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalInstanceId()
				};

				finderCache.removeResult(_finderPathCountByInstanceId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstanceId, args);

				args = new Object[] {queryLinkModelImpl.getInstanceId()};

				finderCache.removeResult(_finderPathCountByInstanceId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstanceId, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId(),
					queryLinkModelImpl.getOriginalVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByS_VG, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG, args);

				args = new Object[] {
					queryLinkModelImpl.getSubjectId(),
					queryLinkModelImpl.getVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByS_VG, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG_VD.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId(),
					queryLinkModelImpl.getOriginalVisitGroupId(),
					queryLinkModelImpl.getOriginalVisitDefinitionId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD, args);

				args = new Object[] {
					queryLinkModelImpl.getSubjectId(),
					queryLinkModelImpl.getVisitGroupId(),
					queryLinkModelImpl.getVisitDefinitionId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG_VD_VC.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId(),
					queryLinkModelImpl.getOriginalVisitGroupId(),
					queryLinkModelImpl.getOriginalVisitDefinitionId(),
					queryLinkModelImpl.getOriginalVisitCRFId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD_VC, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC, args);

				args = new Object[] {
					queryLinkModelImpl.getSubjectId(),
					queryLinkModelImpl.getVisitGroupId(),
					queryLinkModelImpl.getVisitDefinitionId(),
					queryLinkModelImpl.getVisitCRFId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD_VC, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG_VD_VC_S.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId(),
					queryLinkModelImpl.getOriginalVisitGroupId(),
					queryLinkModelImpl.getOriginalVisitDefinitionId(),
					queryLinkModelImpl.getOriginalVisitCRFId(),
					queryLinkModelImpl.getOriginalSubCRFId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD_VC_S, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S, args);

				args = new Object[] {
					queryLinkModelImpl.getSubjectId(),
					queryLinkModelImpl.getVisitGroupId(),
					queryLinkModelImpl.getVisitDefinitionId(),
					queryLinkModelImpl.getVisitCRFId(),
					queryLinkModelImpl.getSubCRFId()
				};

				finderCache.removeResult(_finderPathCountByS_VG_VD_VC_S, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S, args);
			}

			if ((queryLinkModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByS_VG_VD_VC_S_I.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					queryLinkModelImpl.getOriginalSubjectId(),
					queryLinkModelImpl.getOriginalVisitGroupId(),
					queryLinkModelImpl.getOriginalVisitDefinitionId(),
					queryLinkModelImpl.getOriginalVisitCRFId(),
					queryLinkModelImpl.getOriginalSubCRFId(),
					queryLinkModelImpl.getOriginalInstanceId()
				};

				finderCache.removeResult(
					_finderPathCountByS_VG_VD_VC_S_I, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);

				args = new Object[] {
					queryLinkModelImpl.getSubjectId(),
					queryLinkModelImpl.getVisitGroupId(),
					queryLinkModelImpl.getVisitDefinitionId(),
					queryLinkModelImpl.getVisitCRFId(),
					queryLinkModelImpl.getSubCRFId(),
					queryLinkModelImpl.getInstanceId()
				};

				finderCache.removeResult(
					_finderPathCountByS_VG_VD_VC_S_I, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, QueryLinkImpl.class, queryLink.getPrimaryKey(),
			queryLink, false);

		clearUniqueFindersCache(queryLinkModelImpl, false);
		cacheUniqueFindersCache(queryLinkModelImpl);

		queryLink.resetOriginalValues();

		return queryLink;
	}

	/**
	 * Returns the query link with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the query link
	 * @return the query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQueryLinkException {

		QueryLink queryLink = fetchByPrimaryKey(primaryKey);

		if (queryLink == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQueryLinkException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return queryLink;
	}

	/**
	 * Returns the query link with the primary key or throws a <code>NoSuchQueryLinkException</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link
	 * @throws NoSuchQueryLinkException if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink findByPrimaryKey(long queryId)
		throws NoSuchQueryLinkException {

		return findByPrimaryKey((Serializable)queryId);
	}

	/**
	 * Returns the query link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryId the primary key of the query link
	 * @return the query link, or <code>null</code> if a query link with the primary key could not be found
	 */
	@Override
	public QueryLink fetchByPrimaryKey(long queryId) {
		return fetchByPrimaryKey((Serializable)queryId);
	}

	/**
	 * Returns all the query links.
	 *
	 * @return the query links
	 */
	@Override
	public List<QueryLink> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @return the range of query links
	 */
	@Override
	public List<QueryLink> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query links
	 */
	@Override
	public List<QueryLink> findAll(
		int start, int end, OrderByComparator<QueryLink> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLinkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query links
	 * @param end the upper bound of the range of query links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query links
	 */
	@Override
	public List<QueryLink> findAll(
		int start, int end, OrderByComparator<QueryLink> orderByComparator,
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

		List<QueryLink> list = null;

		if (useFinderCache) {
			list = (List<QueryLink>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUERYLINK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUERYLINK;

				sql = sql.concat(QueryLinkModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QueryLink>)QueryUtil.list(
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
	 * Removes all the query links from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QueryLink queryLink : findAll()) {
			remove(queryLink);
		}
	}

	/**
	 * Returns the number of query links.
	 *
	 * @return the number of query links
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_QUERYLINK);

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
		return _SQL_SELECT_QUERYLINK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QueryLinkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the query link persistence.
	 */
	@Activate
	public void activate() {
		QueryLinkModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		QueryLinkModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			QueryLinkModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			QueryLinkModelImpl.UUID_COLUMN_BITMASK |
			QueryLinkModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			QueryLinkModelImpl.UUID_COLUMN_BITMASK |
			QueryLinkModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySubjectId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySubjectId",
			new String[] {Long.class.getName()},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK);

		_finderPathCountBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySubjectId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByInstanceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstanceId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstanceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstanceId",
			new String[] {Long.class.getName()},
			QueryLinkModelImpl.INSTANCEID_COLUMN_BITMASK);

		_finderPathCountByInstanceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstanceId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByS_VG = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG",
			new String[] {Long.class.getName(), Long.class.getName()},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITGROUPID_COLUMN_BITMASK);

		_finderPathCountByS_VG = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByS_VG_VD = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG_VD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG_VD = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG_VD",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITGROUPID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITDEFINITIONID_COLUMN_BITMASK);

		_finderPathCountByS_VG_VD = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG_VD",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByS_VG_VD_VC = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG_VD_VC",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG_VD_VC = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG_VD_VC",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITGROUPID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITDEFINITIONID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITCRFID_COLUMN_BITMASK);

		_finderPathCountByS_VG_VD_VC = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG_VD_VC",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByS_VG_VD_VC_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG_VD_VC_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG_VD_VC_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG_VD_VC_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITGROUPID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITDEFINITIONID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITCRFID_COLUMN_BITMASK |
			QueryLinkModelImpl.SUBCRFID_COLUMN_BITMASK);

		_finderPathCountByS_VG_VD_VC_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG_VD_VC_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QueryLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			QueryLinkModelImpl.SUBJECTID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITGROUPID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITDEFINITIONID_COLUMN_BITMASK |
			QueryLinkModelImpl.VISITCRFID_COLUMN_BITMASK |
			QueryLinkModelImpl.SUBCRFID_COLUMN_BITMASK |
			QueryLinkModelImpl.INSTANCEID_COLUMN_BITMASK);

		_finderPathCountByS_VG_VD_VC_S_I = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_VG_VD_VC_S_I",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			});

		_setQueryLinkUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setQueryLinkUtilPersistence(null);

		entityCache.removeCache(QueryLinkImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setQueryLinkUtilPersistence(
		QueryLinkPersistence queryLinkPersistence) {

		try {
			Field field = QueryLinkUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, queryLinkPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.QueryLink"),
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

	private static final String _SQL_SELECT_QUERYLINK =
		"SELECT queryLink FROM QueryLink queryLink";

	private static final String _SQL_SELECT_QUERYLINK_WHERE =
		"SELECT queryLink FROM QueryLink queryLink WHERE ";

	private static final String _SQL_COUNT_QUERYLINK =
		"SELECT COUNT(queryLink) FROM QueryLink queryLink";

	private static final String _SQL_COUNT_QUERYLINK_WHERE =
		"SELECT COUNT(queryLink) FROM QueryLink queryLink WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "queryLink.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QueryLink exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QueryLink exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QueryLinkPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
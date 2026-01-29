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

import com.dhsoft.edc.backend.exception.NoSuchEdcLockException;
import com.dhsoft.edc.backend.model.EdcLock;
import com.dhsoft.edc.backend.model.impl.EdcLockImpl;
import com.dhsoft.edc.backend.model.impl.EdcLockModelImpl;
import com.dhsoft.edc.backend.service.persistence.EdcLockPersistence;
import com.dhsoft.edc.backend.service.persistence.EdcLockUtil;
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
 * The persistence implementation for the edc lock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EdcLockPersistence.class)
public class EdcLockPersistenceImpl
	extends BasePersistenceImpl<EdcLock> implements EdcLockPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EdcLockUtil</code> to access the edc lock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EdcLockImpl.class.getName();

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
	 * Returns all the edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcLock> orderByComparator, boolean useFinderCache) {

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

		List<EdcLock> list = null;

		if (useFinderCache) {
			list = (List<EdcLock>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcLock edcLock : list) {
					if (!uuid.equals(edcLock.getUuid())) {
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

			sb.append(_SQL_SELECT_EDCLOCK_WHERE);

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
				sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcLock>)QueryUtil.list(
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
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByUuid_First(
			String uuid, OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByUuid_First(uuid, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUuid_First(
		String uuid, OrderByComparator<EdcLock> orderByComparator) {

		List<EdcLock> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByUuid_Last(
			String uuid, OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByUuid_Last(uuid, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUuid_Last(
		String uuid, OrderByComparator<EdcLock> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EdcLock> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where uuid = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock[] findByUuid_PrevAndNext(
			long lockId, String uuid,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		uuid = Objects.toString(uuid, "");

		EdcLock edcLock = findByPrimaryKey(lockId);

		Session session = null;

		try {
			session = openSession();

			EdcLock[] array = new EdcLockImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, edcLock, uuid, orderByComparator, true);

			array[1] = edcLock;

			array[2] = getByUuid_PrevAndNext(
				session, edcLock, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcLock getByUuid_PrevAndNext(
		Session session, EdcLock edcLock, String uuid,
		OrderByComparator<EdcLock> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EDCLOCK_WHERE);

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
			sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(edcLock)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcLock> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc locks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EdcLock edcLock :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcLock);
		}
	}

	/**
	 * Returns the number of edc locks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc locks
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCLOCK_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "edcLock.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(edcLock.uuid IS NULL OR edcLock.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByUUID_G(uuid, groupId);

		if (edcLock == null) {
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

			throw new NoSuchEdcLockException(sb.toString());
		}

		return edcLock;
	}

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the edc lock where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUUID_G(
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

		if (result instanceof EdcLock) {
			EdcLock edcLock = (EdcLock)result;

			if (!Objects.equals(uuid, edcLock.getUuid()) ||
				(groupId != edcLock.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDCLOCK_WHERE);

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

				List<EdcLock> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EdcLock edcLock = list.get(0);

					result = edcLock;

					cacheResult(edcLock);
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
			return (EdcLock)result;
		}
	}

	/**
	 * Removes the edc lock where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc lock that was removed
	 */
	@Override
	public EdcLock removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcLockException {

		EdcLock edcLock = findByUUID_G(uuid, groupId);

		return remove(edcLock);
	}

	/**
	 * Returns the number of edc locks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc locks
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCLOCK_WHERE);

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
		"edcLock.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(edcLock.uuid IS NULL OR edcLock.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"edcLock.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcLock> orderByComparator, boolean useFinderCache) {

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

		List<EdcLock> list = null;

		if (useFinderCache) {
			list = (List<EdcLock>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcLock edcLock : list) {
					if (!uuid.equals(edcLock.getUuid()) ||
						(companyId != edcLock.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EDCLOCK_WHERE);

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
				sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcLock>)QueryUtil.list(
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
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the first edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcLock> orderByComparator) {

		List<EdcLock> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the last edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcLock> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EdcLock> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock[] findByUuid_C_PrevAndNext(
			long lockId, String uuid, long companyId,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		uuid = Objects.toString(uuid, "");

		EdcLock edcLock = findByPrimaryKey(lockId);

		Session session = null;

		try {
			session = openSession();

			EdcLock[] array = new EdcLockImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, edcLock, uuid, companyId, orderByComparator, true);

			array[1] = edcLock;

			array[2] = getByUuid_C_PrevAndNext(
				session, edcLock, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EdcLock getByUuid_C_PrevAndNext(
		Session session, EdcLock edcLock, String uuid, long companyId,
		OrderByComparator<EdcLock> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EDCLOCK_WHERE);

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
			sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(edcLock)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcLock> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc locks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EdcLock edcLock :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcLock);
		}
	}

	/**
	 * Returns the number of edc locks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc locks
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCLOCK_WHERE);

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
		"edcLock.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(edcLock.uuid IS NULL OR edcLock.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"edcLock.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByP_C_C_T;
	private FinderPath _finderPathWithoutPaginationFindByP_C_C_T;
	private FinderPath _finderPathCountByP_C_C_T;

	/**
	 * Returns all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the matching edc locks
	 */
	@Override
	public List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		return findByP_C_C_T(
			projectId, classNameId, classPK, lockType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end) {

		return findByP_C_C_T(
			projectId, classNameId, classPK, lockType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end, OrderByComparator<EdcLock> orderByComparator) {

		return findByP_C_C_T(
			projectId, classNameId, classPK, lockType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc locks
	 */
	@Override
	public List<EdcLock> findByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType,
		int start, int end, OrderByComparator<EdcLock> orderByComparator,
		boolean useFinderCache) {

		lockType = Objects.toString(lockType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByP_C_C_T;
				finderArgs = new Object[] {
					projectId, classNameId, classPK, lockType
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByP_C_C_T;
			finderArgs = new Object[] {
				projectId, classNameId, classPK, lockType, start, end,
				orderByComparator
			};
		}

		List<EdcLock> list = null;

		if (useFinderCache) {
			list = (List<EdcLock>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcLock edcLock : list) {
					if ((projectId != edcLock.getProjectId()) ||
						(classNameId != edcLock.getClassNameId()) ||
						(classPK != edcLock.getClassPK()) ||
						!lockType.equals(edcLock.getLockType())) {

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

			sb.append(_SQL_SELECT_EDCLOCK_WHERE);

			sb.append(_FINDER_COLUMN_P_C_C_T_PROJECTID_2);

			sb.append(_FINDER_COLUMN_P_C_C_T_CLASSNAMEID_2);

			sb.append(_FINDER_COLUMN_P_C_C_T_CLASSPK_2);

			boolean bindLockType = false;

			if (lockType.isEmpty()) {
				sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_3);
			}
			else {
				bindLockType = true;

				sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(classNameId);

				queryPos.add(classPK);

				if (bindLockType) {
					queryPos.add(lockType);
				}

				list = (List<EdcLock>)QueryUtil.list(
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
	 * Returns the first edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByP_C_C_T_First(
			long projectId, long classNameId, long classPK, String lockType,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByP_C_C_T_First(
			projectId, classNameId, classPK, lockType, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", classNameId=");
		sb.append(classNameId);

		sb.append(", classPK=");
		sb.append(classPK);

		sb.append(", lockType=");
		sb.append(lockType);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the first edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByP_C_C_T_First(
		long projectId, long classNameId, long classPK, String lockType,
		OrderByComparator<EdcLock> orderByComparator) {

		List<EdcLock> list = findByP_C_C_T(
			projectId, classNameId, classPK, lockType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock
	 * @throws NoSuchEdcLockException if a matching edc lock could not be found
	 */
	@Override
	public EdcLock findByP_C_C_T_Last(
			long projectId, long classNameId, long classPK, String lockType,
			OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByP_C_C_T_Last(
			projectId, classNameId, classPK, lockType, orderByComparator);

		if (edcLock != null) {
			return edcLock;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append(", classNameId=");
		sb.append(classNameId);

		sb.append(", classPK=");
		sb.append(classPK);

		sb.append(", lockType=");
		sb.append(lockType);

		sb.append("}");

		throw new NoSuchEdcLockException(sb.toString());
	}

	/**
	 * Returns the last edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc lock, or <code>null</code> if a matching edc lock could not be found
	 */
	@Override
	public EdcLock fetchByP_C_C_T_Last(
		long projectId, long classNameId, long classPK, String lockType,
		OrderByComparator<EdcLock> orderByComparator) {

		int count = countByP_C_C_T(projectId, classNameId, classPK, lockType);

		if (count == 0) {
			return null;
		}

		List<EdcLock> list = findByP_C_C_T(
			projectId, classNameId, classPK, lockType, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc locks before and after the current edc lock in the ordered set where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param lockId the primary key of the current edc lock
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock[] findByP_C_C_T_PrevAndNext(
			long lockId, long projectId, long classNameId, long classPK,
			String lockType, OrderByComparator<EdcLock> orderByComparator)
		throws NoSuchEdcLockException {

		lockType = Objects.toString(lockType, "");

		EdcLock edcLock = findByPrimaryKey(lockId);

		Session session = null;

		try {
			session = openSession();

			EdcLock[] array = new EdcLockImpl[3];

			array[0] = getByP_C_C_T_PrevAndNext(
				session, edcLock, projectId, classNameId, classPK, lockType,
				orderByComparator, true);

			array[1] = edcLock;

			array[2] = getByP_C_C_T_PrevAndNext(
				session, edcLock, projectId, classNameId, classPK, lockType,
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

	protected EdcLock getByP_C_C_T_PrevAndNext(
		Session session, EdcLock edcLock, long projectId, long classNameId,
		long classPK, String lockType,
		OrderByComparator<EdcLock> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_EDCLOCK_WHERE);

		sb.append(_FINDER_COLUMN_P_C_C_T_PROJECTID_2);

		sb.append(_FINDER_COLUMN_P_C_C_T_CLASSNAMEID_2);

		sb.append(_FINDER_COLUMN_P_C_C_T_CLASSPK_2);

		boolean bindLockType = false;

		if (lockType.isEmpty()) {
			sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_3);
		}
		else {
			bindLockType = true;

			sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_2);
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
			sb.append(EdcLockModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		queryPos.add(classNameId);

		queryPos.add(classPK);

		if (bindLockType) {
			queryPos.add(lockType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(edcLock)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcLock> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 */
	@Override
	public void removeByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		for (EdcLock edcLock :
				findByP_C_C_T(
					projectId, classNameId, classPK, lockType,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcLock);
		}
	}

	/**
	 * Returns the number of edc locks where projectId = &#63; and classNameId = &#63; and classPK = &#63; and lockType = &#63;.
	 *
	 * @param projectId the project ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param lockType the lock type
	 * @return the number of matching edc locks
	 */
	@Override
	public int countByP_C_C_T(
		long projectId, long classNameId, long classPK, String lockType) {

		lockType = Objects.toString(lockType, "");

		FinderPath finderPath = _finderPathCountByP_C_C_T;

		Object[] finderArgs = new Object[] {
			projectId, classNameId, classPK, lockType
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_EDCLOCK_WHERE);

			sb.append(_FINDER_COLUMN_P_C_C_T_PROJECTID_2);

			sb.append(_FINDER_COLUMN_P_C_C_T_CLASSNAMEID_2);

			sb.append(_FINDER_COLUMN_P_C_C_T_CLASSPK_2);

			boolean bindLockType = false;

			if (lockType.isEmpty()) {
				sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_3);
			}
			else {
				bindLockType = true;

				sb.append(_FINDER_COLUMN_P_C_C_T_LOCKTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				queryPos.add(classNameId);

				queryPos.add(classPK);

				if (bindLockType) {
					queryPos.add(lockType);
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

	private static final String _FINDER_COLUMN_P_C_C_T_PROJECTID_2 =
		"edcLock.projectId = ? AND ";

	private static final String _FINDER_COLUMN_P_C_C_T_CLASSNAMEID_2 =
		"edcLock.classNameId = ? AND ";

	private static final String _FINDER_COLUMN_P_C_C_T_CLASSPK_2 =
		"edcLock.classPK = ? AND ";

	private static final String _FINDER_COLUMN_P_C_C_T_LOCKTYPE_2 =
		"edcLock.lockType = ?";

	private static final String _FINDER_COLUMN_P_C_C_T_LOCKTYPE_3 =
		"(edcLock.lockType IS NULL OR edcLock.lockType = '')";

	public EdcLockPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EdcLock.class);

		setModelImplClass(EdcLockImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the edc lock in the entity cache if it is enabled.
	 *
	 * @param edcLock the edc lock
	 */
	@Override
	public void cacheResult(EdcLock edcLock) {
		entityCache.putResult(
			entityCacheEnabled, EdcLockImpl.class, edcLock.getPrimaryKey(),
			edcLock);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {edcLock.getUuid(), edcLock.getGroupId()}, edcLock);

		edcLock.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the edc locks in the entity cache if it is enabled.
	 *
	 * @param edcLocks the edc locks
	 */
	@Override
	public void cacheResult(List<EdcLock> edcLocks) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (edcLocks.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EdcLock edcLock : edcLocks) {
			if (entityCache.getResult(
					entityCacheEnabled, EdcLockImpl.class,
					edcLock.getPrimaryKey()) == null) {

				cacheResult(edcLock);
			}
			else {
				edcLock.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edc locks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdcLockImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edc lock.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdcLock edcLock) {
		entityCache.removeResult(
			entityCacheEnabled, EdcLockImpl.class, edcLock.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((EdcLockModelImpl)edcLock, true);
	}

	@Override
	public void clearCache(List<EdcLock> edcLocks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdcLock edcLock : edcLocks) {
			entityCache.removeResult(
				entityCacheEnabled, EdcLockImpl.class, edcLock.getPrimaryKey());

			clearUniqueFindersCache((EdcLockModelImpl)edcLock, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, EdcLockImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(EdcLockModelImpl edcLockModelImpl) {
		Object[] args = new Object[] {
			edcLockModelImpl.getUuid(), edcLockModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, edcLockModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		EdcLockModelImpl edcLockModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcLockModelImpl.getUuid(), edcLockModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((edcLockModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcLockModelImpl.getOriginalUuid(),
				edcLockModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new edc lock with the primary key. Does not add the edc lock to the database.
	 *
	 * @param lockId the primary key for the new edc lock
	 * @return the new edc lock
	 */
	@Override
	public EdcLock create(long lockId) {
		EdcLock edcLock = new EdcLockImpl();

		edcLock.setNew(true);
		edcLock.setPrimaryKey(lockId);

		String uuid = PortalUUIDUtil.generate();

		edcLock.setUuid(uuid);

		edcLock.setCompanyId(CompanyThreadLocal.getCompanyId());

		return edcLock;
	}

	/**
	 * Removes the edc lock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock that was removed
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock remove(long lockId) throws NoSuchEdcLockException {
		return remove((Serializable)lockId);
	}

	/**
	 * Removes the edc lock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edc lock
	 * @return the edc lock that was removed
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock remove(Serializable primaryKey)
		throws NoSuchEdcLockException {

		Session session = null;

		try {
			session = openSession();

			EdcLock edcLock = (EdcLock)session.get(
				EdcLockImpl.class, primaryKey);

			if (edcLock == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdcLockException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(edcLock);
		}
		catch (NoSuchEdcLockException noSuchEntityException) {
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
	protected EdcLock removeImpl(EdcLock edcLock) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edcLock)) {
				edcLock = (EdcLock)session.get(
					EdcLockImpl.class, edcLock.getPrimaryKeyObj());
			}

			if (edcLock != null) {
				session.delete(edcLock);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (edcLock != null) {
			clearCache(edcLock);
		}

		return edcLock;
	}

	@Override
	public EdcLock updateImpl(EdcLock edcLock) {
		boolean isNew = edcLock.isNew();

		if (!(edcLock instanceof EdcLockModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(edcLock.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(edcLock);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in edcLock proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EdcLock implementation " +
					edcLock.getClass());
		}

		EdcLockModelImpl edcLockModelImpl = (EdcLockModelImpl)edcLock;

		if (Validator.isNull(edcLock.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edcLock.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (edcLock.getCreateDate() == null)) {
			if (serviceContext == null) {
				edcLock.setCreateDate(date);
			}
			else {
				edcLock.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!edcLockModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				edcLock.setModifiedDate(date);
			}
			else {
				edcLock.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(edcLock);

				edcLock.setNew(false);
			}
			else {
				edcLock = (EdcLock)session.merge(edcLock);
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
			Object[] args = new Object[] {edcLockModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				edcLockModelImpl.getUuid(), edcLockModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				edcLockModelImpl.getProjectId(),
				edcLockModelImpl.getClassNameId(),
				edcLockModelImpl.getClassPK(), edcLockModelImpl.getLockType()
			};

			finderCache.removeResult(_finderPathCountByP_C_C_T, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByP_C_C_T, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((edcLockModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcLockModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {edcLockModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((edcLockModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcLockModelImpl.getOriginalUuid(),
					edcLockModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					edcLockModelImpl.getUuid(), edcLockModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((edcLockModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByP_C_C_T.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcLockModelImpl.getOriginalProjectId(),
					edcLockModelImpl.getOriginalClassNameId(),
					edcLockModelImpl.getOriginalClassPK(),
					edcLockModelImpl.getOriginalLockType()
				};

				finderCache.removeResult(_finderPathCountByP_C_C_T, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByP_C_C_T, args);

				args = new Object[] {
					edcLockModelImpl.getProjectId(),
					edcLockModelImpl.getClassNameId(),
					edcLockModelImpl.getClassPK(),
					edcLockModelImpl.getLockType()
				};

				finderCache.removeResult(_finderPathCountByP_C_C_T, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByP_C_C_T, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, EdcLockImpl.class, edcLock.getPrimaryKey(),
			edcLock, false);

		clearUniqueFindersCache(edcLockModelImpl, false);
		cacheUniqueFindersCache(edcLockModelImpl);

		edcLock.resetOriginalValues();

		return edcLock;
	}

	/**
	 * Returns the edc lock with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edc lock
	 * @return the edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdcLockException {

		EdcLock edcLock = fetchByPrimaryKey(primaryKey);

		if (edcLock == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdcLockException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return edcLock;
	}

	/**
	 * Returns the edc lock with the primary key or throws a <code>NoSuchEdcLockException</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock
	 * @throws NoSuchEdcLockException if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock findByPrimaryKey(long lockId) throws NoSuchEdcLockException {
		return findByPrimaryKey((Serializable)lockId);
	}

	/**
	 * Returns the edc lock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lockId the primary key of the edc lock
	 * @return the edc lock, or <code>null</code> if a edc lock with the primary key could not be found
	 */
	@Override
	public EdcLock fetchByPrimaryKey(long lockId) {
		return fetchByPrimaryKey((Serializable)lockId);
	}

	/**
	 * Returns all the edc locks.
	 *
	 * @return the edc locks
	 */
	@Override
	public List<EdcLock> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @return the range of edc locks
	 */
	@Override
	public List<EdcLock> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc locks
	 */
	@Override
	public List<EdcLock> findAll(
		int start, int end, OrderByComparator<EdcLock> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc locks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcLockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc locks
	 * @param end the upper bound of the range of edc locks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc locks
	 */
	@Override
	public List<EdcLock> findAll(
		int start, int end, OrderByComparator<EdcLock> orderByComparator,
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

		List<EdcLock> list = null;

		if (useFinderCache) {
			list = (List<EdcLock>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDCLOCK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDCLOCK;

				sql = sql.concat(EdcLockModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EdcLock>)QueryUtil.list(
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
	 * Removes all the edc locks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdcLock edcLock : findAll()) {
			remove(edcLock);
		}
	}

	/**
	 * Returns the number of edc locks.
	 *
	 * @return the number of edc locks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EDCLOCK);

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
		return "lockId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDCLOCK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EdcLockModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edc lock persistence.
	 */
	@Activate
	public void activate() {
		EdcLockModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		EdcLockModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			EdcLockModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcLockModelImpl.UUID_COLUMN_BITMASK |
			EdcLockModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcLockModelImpl.UUID_COLUMN_BITMASK |
			EdcLockModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByP_C_C_T = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_C_C_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByP_C_C_T = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, EdcLockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_C_C_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			EdcLockModelImpl.PROJECTID_COLUMN_BITMASK |
			EdcLockModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			EdcLockModelImpl.CLASSPK_COLUMN_BITMASK |
			EdcLockModelImpl.LOCKTYPE_COLUMN_BITMASK);

		_finderPathCountByP_C_C_T = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_C_C_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			});

		_setEdcLockUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEdcLockUtilPersistence(null);

		entityCache.removeCache(EdcLockImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setEdcLockUtilPersistence(
		EdcLockPersistence edcLockPersistence) {

		try {
			Field field = EdcLockUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, edcLockPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.EdcLock"),
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

	private static final String _SQL_SELECT_EDCLOCK =
		"SELECT edcLock FROM EdcLock edcLock";

	private static final String _SQL_SELECT_EDCLOCK_WHERE =
		"SELECT edcLock FROM EdcLock edcLock WHERE ";

	private static final String _SQL_COUNT_EDCLOCK =
		"SELECT COUNT(edcLock) FROM EdcLock edcLock";

	private static final String _SQL_COUNT_EDCLOCK_WHERE =
		"SELECT COUNT(edcLock) FROM EdcLock edcLock WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "edcLock.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EdcLock exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EdcLock exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EdcLockPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "comment"});

}
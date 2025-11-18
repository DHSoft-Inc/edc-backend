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

import com.dhsoft.edc.backend.exception.NoSuchVisitEventException;
import com.dhsoft.edc.backend.model.VisitEvent;
import com.dhsoft.edc.backend.model.impl.VisitEventImpl;
import com.dhsoft.edc.backend.model.impl.VisitEventModelImpl;
import com.dhsoft.edc.backend.service.persistence.VisitEventPersistence;
import com.dhsoft.edc.backend.service.persistence.VisitEventUtil;
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
 * The persistence implementation for the visit event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = VisitEventPersistence.class)
public class VisitEventPersistenceImpl
	extends BasePersistenceImpl<VisitEvent> implements VisitEventPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VisitEventUtil</code> to access the visit event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VisitEventImpl.class.getName();

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
	 * Returns all the visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if (!uuid.equals(visitEvent.getUuid())) {
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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
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

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUuid_First(
			String uuid, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUuid_First(uuid, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUuid_First(
		String uuid, OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUuid_Last(
			String uuid, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUuid_Last(uuid, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUuid_Last(
		String uuid, OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByUuid_PrevAndNext(
			long visitEventId, String uuid,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		uuid = Objects.toString(uuid, "");

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, visitEvent, uuid, orderByComparator, true);

			array[1] = visitEvent;

			array[2] = getByUuid_PrevAndNext(
				session, visitEvent, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitEvent getByUuid_PrevAndNext(
		Session session, VisitEvent visitEvent, String uuid,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (VisitEvent visitEvent :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit events
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(visitEvent.uuid IS NULL OR visitEvent.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUUID_G(String uuid, long groupId)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUUID_G(uuid, groupId);

		if (visitEvent == null) {
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

			throw new NoSuchVisitEventException(sb.toString());
		}

		return visitEvent;
	}

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the visit event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUUID_G(
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

		if (result instanceof VisitEvent) {
			VisitEvent visitEvent = (VisitEvent)result;

			if (!Objects.equals(uuid, visitEvent.getUuid()) ||
				(groupId != visitEvent.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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

				List<VisitEvent> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					VisitEvent visitEvent = list.get(0);

					result = visitEvent;

					cacheResult(visitEvent);
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
			return (VisitEvent)result;
		}
	}

	/**
	 * Removes the visit event where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit event that was removed
	 */
	@Override
	public VisitEvent removeByUUID_G(String uuid, long groupId)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = findByUUID_G(uuid, groupId);

		return remove(visitEvent);
	}

	/**
	 * Returns the number of visit events where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(visitEvent.uuid IS NULL OR visitEvent.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"visitEvent.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if (!uuid.equals(visitEvent.getUuid()) ||
						(companyId != visitEvent.getCompanyId())) {

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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
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

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByUuid_C_PrevAndNext(
			long visitEventId, String uuid, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		uuid = Objects.toString(uuid, "");

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, visitEvent, uuid, companyId, orderByComparator, true);

			array[1] = visitEvent;

			array[2] = getByUuid_C_PrevAndNext(
				session, visitEvent, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitEvent getByUuid_C_PrevAndNext(
		Session session, VisitEvent visitEvent, String uuid, long companyId,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (VisitEvent visitEvent :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(visitEvent.uuid IS NULL OR visitEvent.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"visitEvent.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByCompanyId(
		long companyId, int start, int end) {

		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if (companyId != visitEvent.getCompanyId()) {
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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByCompanyId_First(
			long companyId, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByCompanyId_First(
		long companyId, OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByCompanyId_Last(
			long companyId, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByCompanyId_Last(
		long companyId, OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where companyId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByCompanyId_PrevAndNext(
			long visitEventId, long companyId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, visitEvent, companyId, orderByComparator, true);

			array[1] = visitEvent;

			array[2] = getByCompanyId_PrevAndNext(
				session, visitEvent, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitEvent getByCompanyId_PrevAndNext(
		Session session, VisitEvent visitEvent, long companyId,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (VisitEvent visitEvent :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if ((groupId != visitEvent.getGroupId()) ||
						(projectId != visitEvent.getProjectId())) {

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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByG_P_PrevAndNext(
			long visitEventId, long groupId, long projectId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, visitEvent, groupId, projectId, orderByComparator,
				true);

			array[1] = visitEvent;

			array[2] = getByG_P_PrevAndNext(
				session, visitEvent, groupId, projectId, orderByComparator,
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

	protected VisitEvent getByG_P_PrevAndNext(
		Session session, VisitEvent visitEvent, long groupId, long projectId,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (VisitEvent visitEvent :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"visitEvent.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByI_S_V;
	private FinderPath _finderPathWithoutPaginationFindByI_S_V;
	private FinderPath _finderPathCountByI_S_V;

	/**
	 * Returns all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		return findByI_S_V(
			institutionId, subjectId, visitDefinitionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end) {

		return findByI_S_V(
			institutionId, subjectId, visitDefinitionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end, OrderByComparator<VisitEvent> orderByComparator) {

		return findByI_S_V(
			institutionId, subjectId, visitDefinitionId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId, int start,
		int end, OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByI_S_V;
				finderArgs = new Object[] {
					institutionId, subjectId, visitDefinitionId
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByI_S_V;
			finderArgs = new Object[] {
				institutionId, subjectId, visitDefinitionId, start, end,
				orderByComparator
			};
		}

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if ((institutionId != visitEvent.getInstitutionId()) ||
						(subjectId != visitEvent.getSubjectId()) ||
						(visitDefinitionId !=
							visitEvent.getVisitDefinitionId())) {

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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

			sb.append(_FINDER_COLUMN_I_S_V_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_I_S_V_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_I_S_V_VISITDEFINITIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(subjectId);

				queryPos.add(visitDefinitionId);

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByI_S_V_First(
			long institutionId, long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByI_S_V_First(
			institutionId, subjectId, visitDefinitionId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", subjectId=");
		sb.append(subjectId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByI_S_V_First(
		long institutionId, long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByI_S_V(
			institutionId, subjectId, visitDefinitionId, 0, 1,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByI_S_V_Last(
			long institutionId, long subjectId, long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByI_S_V_Last(
			institutionId, subjectId, visitDefinitionId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", subjectId=");
		sb.append(subjectId);

		sb.append(", visitDefinitionId=");
		sb.append(visitDefinitionId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByI_S_V_Last(
		long institutionId, long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByI_S_V(institutionId, subjectId, visitDefinitionId);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByI_S_V(
			institutionId, subjectId, visitDefinitionId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByI_S_V_PrevAndNext(
			long visitEventId, long institutionId, long subjectId,
			long visitDefinitionId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByI_S_V_PrevAndNext(
				session, visitEvent, institutionId, subjectId,
				visitDefinitionId, orderByComparator, true);

			array[1] = visitEvent;

			array[2] = getByI_S_V_PrevAndNext(
				session, visitEvent, institutionId, subjectId,
				visitDefinitionId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitEvent getByI_S_V_PrevAndNext(
		Session session, VisitEvent visitEvent, long institutionId,
		long subjectId, long visitDefinitionId,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

		sb.append(_FINDER_COLUMN_I_S_V_INSTITUTIONID_2);

		sb.append(_FINDER_COLUMN_I_S_V_SUBJECTID_2);

		sb.append(_FINDER_COLUMN_I_S_V_VISITDEFINITIONID_2);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		queryPos.add(subjectId);

		queryPos.add(visitDefinitionId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 */
	@Override
	public void removeByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		for (VisitEvent visitEvent :
				findByI_S_V(
					institutionId, subjectId, visitDefinitionId,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where institutionId = &#63; and subjectId = &#63; and visitDefinitionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param subjectId the subject ID
	 * @param visitDefinitionId the visit definition ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByI_S_V(
		long institutionId, long subjectId, long visitDefinitionId) {

		FinderPath finderPath = _finderPathCountByI_S_V;

		Object[] finderArgs = new Object[] {
			institutionId, subjectId, visitDefinitionId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

			sb.append(_FINDER_COLUMN_I_S_V_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_I_S_V_SUBJECTID_2);

			sb.append(_FINDER_COLUMN_I_S_V_VISITDEFINITIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(subjectId);

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

	private static final String _FINDER_COLUMN_I_S_V_INSTITUTIONID_2 =
		"visitEvent.institutionId = ? AND ";

	private static final String _FINDER_COLUMN_I_S_V_SUBJECTID_2 =
		"visitEvent.subjectId = ? AND ";

	private static final String _FINDER_COLUMN_I_S_V_VISITDEFINITIONID_2 =
		"visitEvent.visitDefinitionId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit events
	 */
	@Override
	public List<VisitEvent> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching visit events
	 */
	@Override
	public List<VisitEvent> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitEvent> orderByComparator,
		boolean useFinderCache) {

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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitEvent visitEvent : list) {
					if (userId != visitEvent.getUserId()) {
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

			sb.append(_SQL_SELECT_VISITEVENT_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUserId_First(
			long userId, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUserId_First(userId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the first visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUserId_First(
		long userId, OrderByComparator<VisitEvent> orderByComparator) {

		List<VisitEvent> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event
	 * @throws NoSuchVisitEventException if a matching visit event could not be found
	 */
	@Override
	public VisitEvent findByUserId_Last(
			long userId, OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByUserId_Last(userId, orderByComparator);

		if (visitEvent != null) {
			return visitEvent;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchVisitEventException(sb.toString());
	}

	/**
	 * Returns the last visit event in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit event, or <code>null</code> if a matching visit event could not be found
	 */
	@Override
	public VisitEvent fetchByUserId_Last(
		long userId, OrderByComparator<VisitEvent> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<VisitEvent> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit events before and after the current visit event in the ordered set where userId = &#63;.
	 *
	 * @param visitEventId the primary key of the current visit event
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent[] findByUserId_PrevAndNext(
			long visitEventId, long userId,
			OrderByComparator<VisitEvent> orderByComparator)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = findByPrimaryKey(visitEventId);

		Session session = null;

		try {
			session = openSession();

			VisitEvent[] array = new VisitEventImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, visitEvent, userId, orderByComparator, true);

			array[1] = visitEvent;

			array[2] = getByUserId_PrevAndNext(
				session, visitEvent, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitEvent getByUserId_PrevAndNext(
		Session session, VisitEvent visitEvent, long userId,
		OrderByComparator<VisitEvent> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_VISITEVENT_WHERE);

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
			sb.append(VisitEventModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(visitEvent)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitEvent> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit events where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (VisitEvent visitEvent :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit events
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITEVENT_WHERE);

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
		"visitEvent.userId = ?";

	public VisitEventPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(VisitEvent.class);

		setModelImplClass(VisitEventImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the visit event in the entity cache if it is enabled.
	 *
	 * @param visitEvent the visit event
	 */
	@Override
	public void cacheResult(VisitEvent visitEvent) {
		entityCache.putResult(
			entityCacheEnabled, VisitEventImpl.class,
			visitEvent.getPrimaryKey(), visitEvent);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {visitEvent.getUuid(), visitEvent.getGroupId()},
			visitEvent);

		visitEvent.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the visit events in the entity cache if it is enabled.
	 *
	 * @param visitEvents the visit events
	 */
	@Override
	public void cacheResult(List<VisitEvent> visitEvents) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (visitEvents.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (VisitEvent visitEvent : visitEvents) {
			if (entityCache.getResult(
					entityCacheEnabled, VisitEventImpl.class,
					visitEvent.getPrimaryKey()) == null) {

				cacheResult(visitEvent);
			}
			else {
				visitEvent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all visit events.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VisitEventImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the visit event.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VisitEvent visitEvent) {
		entityCache.removeResult(
			entityCacheEnabled, VisitEventImpl.class,
			visitEvent.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VisitEventModelImpl)visitEvent, true);
	}

	@Override
	public void clearCache(List<VisitEvent> visitEvents) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VisitEvent visitEvent : visitEvents) {
			entityCache.removeResult(
				entityCacheEnabled, VisitEventImpl.class,
				visitEvent.getPrimaryKey());

			clearUniqueFindersCache((VisitEventModelImpl)visitEvent, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, VisitEventImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		VisitEventModelImpl visitEventModelImpl) {

		Object[] args = new Object[] {
			visitEventModelImpl.getUuid(), visitEventModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, visitEventModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VisitEventModelImpl visitEventModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				visitEventModelImpl.getUuid(), visitEventModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((visitEventModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				visitEventModelImpl.getOriginalUuid(),
				visitEventModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new visit event with the primary key. Does not add the visit event to the database.
	 *
	 * @param visitEventId the primary key for the new visit event
	 * @return the new visit event
	 */
	@Override
	public VisitEvent create(long visitEventId) {
		VisitEvent visitEvent = new VisitEventImpl();

		visitEvent.setNew(true);
		visitEvent.setPrimaryKey(visitEventId);

		String uuid = PortalUUIDUtil.generate();

		visitEvent.setUuid(uuid);

		visitEvent.setCompanyId(CompanyThreadLocal.getCompanyId());

		return visitEvent;
	}

	/**
	 * Removes the visit event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event that was removed
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent remove(long visitEventId)
		throws NoSuchVisitEventException {

		return remove((Serializable)visitEventId);
	}

	/**
	 * Removes the visit event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the visit event
	 * @return the visit event that was removed
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent remove(Serializable primaryKey)
		throws NoSuchVisitEventException {

		Session session = null;

		try {
			session = openSession();

			VisitEvent visitEvent = (VisitEvent)session.get(
				VisitEventImpl.class, primaryKey);

			if (visitEvent == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVisitEventException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(visitEvent);
		}
		catch (NoSuchVisitEventException noSuchEntityException) {
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
	protected VisitEvent removeImpl(VisitEvent visitEvent) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(visitEvent)) {
				visitEvent = (VisitEvent)session.get(
					VisitEventImpl.class, visitEvent.getPrimaryKeyObj());
			}

			if (visitEvent != null) {
				session.delete(visitEvent);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (visitEvent != null) {
			clearCache(visitEvent);
		}

		return visitEvent;
	}

	@Override
	public VisitEvent updateImpl(VisitEvent visitEvent) {
		boolean isNew = visitEvent.isNew();

		if (!(visitEvent instanceof VisitEventModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(visitEvent.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(visitEvent);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in visitEvent proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VisitEvent implementation " +
					visitEvent.getClass());
		}

		VisitEventModelImpl visitEventModelImpl =
			(VisitEventModelImpl)visitEvent;

		if (Validator.isNull(visitEvent.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			visitEvent.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (visitEvent.getCreateDate() == null)) {
			if (serviceContext == null) {
				visitEvent.setCreateDate(date);
			}
			else {
				visitEvent.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!visitEventModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				visitEvent.setModifiedDate(date);
			}
			else {
				visitEvent.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(visitEvent);

				visitEvent.setNew(false);
			}
			else {
				visitEvent = (VisitEvent)session.merge(visitEvent);
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
			Object[] args = new Object[] {visitEventModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				visitEventModelImpl.getUuid(),
				visitEventModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {visitEventModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {
				visitEventModelImpl.getGroupId(),
				visitEventModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {
				visitEventModelImpl.getInstitutionId(),
				visitEventModelImpl.getSubjectId(),
				visitEventModelImpl.getVisitDefinitionId()
			};

			finderCache.removeResult(_finderPathCountByI_S_V, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByI_S_V, args);

			args = new Object[] {visitEventModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {visitEventModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalUuid(),
					visitEventModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					visitEventModelImpl.getUuid(),
					visitEventModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {visitEventModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalGroupId(),
					visitEventModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					visitEventModelImpl.getGroupId(),
					visitEventModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByI_S_V.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalInstitutionId(),
					visitEventModelImpl.getOriginalSubjectId(),
					visitEventModelImpl.getOriginalVisitDefinitionId()
				};

				finderCache.removeResult(_finderPathCountByI_S_V, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByI_S_V, args);

				args = new Object[] {
					visitEventModelImpl.getInstitutionId(),
					visitEventModelImpl.getSubjectId(),
					visitEventModelImpl.getVisitDefinitionId()
				};

				finderCache.removeResult(_finderPathCountByI_S_V, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByI_S_V, args);
			}

			if ((visitEventModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitEventModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {visitEventModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, VisitEventImpl.class,
			visitEvent.getPrimaryKey(), visitEvent, false);

		clearUniqueFindersCache(visitEventModelImpl, false);
		cacheUniqueFindersCache(visitEventModelImpl);

		visitEvent.resetOriginalValues();

		return visitEvent;
	}

	/**
	 * Returns the visit event with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the visit event
	 * @return the visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVisitEventException {

		VisitEvent visitEvent = fetchByPrimaryKey(primaryKey);

		if (visitEvent == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVisitEventException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return visitEvent;
	}

	/**
	 * Returns the visit event with the primary key or throws a <code>NoSuchVisitEventException</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event
	 * @throws NoSuchVisitEventException if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent findByPrimaryKey(long visitEventId)
		throws NoSuchVisitEventException {

		return findByPrimaryKey((Serializable)visitEventId);
	}

	/**
	 * Returns the visit event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitEventId the primary key of the visit event
	 * @return the visit event, or <code>null</code> if a visit event with the primary key could not be found
	 */
	@Override
	public VisitEvent fetchByPrimaryKey(long visitEventId) {
		return fetchByPrimaryKey((Serializable)visitEventId);
	}

	/**
	 * Returns all the visit events.
	 *
	 * @return the visit events
	 */
	@Override
	public List<VisitEvent> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @return the range of visit events
	 */
	@Override
	public List<VisitEvent> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visit events
	 */
	@Override
	public List<VisitEvent> findAll(
		int start, int end, OrderByComparator<VisitEvent> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visit events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VisitEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of visit events
	 * @param end the upper bound of the range of visit events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of visit events
	 */
	@Override
	public List<VisitEvent> findAll(
		int start, int end, OrderByComparator<VisitEvent> orderByComparator,
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

		List<VisitEvent> list = null;

		if (useFinderCache) {
			list = (List<VisitEvent>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VISITEVENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VISITEVENT;

				sql = sql.concat(VisitEventModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<VisitEvent>)QueryUtil.list(
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
	 * Removes all the visit events from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VisitEvent visitEvent : findAll()) {
			remove(visitEvent);
		}
	}

	/**
	 * Returns the number of visit events.
	 *
	 * @return the number of visit events
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_VISITEVENT);

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
		return "visitEventId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VISITEVENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VisitEventModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the visit event persistence.
	 */
	@Activate
	public void activate() {
		VisitEventModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		VisitEventModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			VisitEventModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			VisitEventModelImpl.UUID_COLUMN_BITMASK |
			VisitEventModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			VisitEventModelImpl.UUID_COLUMN_BITMASK |
			VisitEventModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			VisitEventModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			VisitEventModelImpl.GROUPID_COLUMN_BITMASK |
			VisitEventModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByI_S_V = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByI_S_V",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByI_S_V = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByI_S_V",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VisitEventModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			VisitEventModelImpl.SUBJECTID_COLUMN_BITMASK |
			VisitEventModelImpl.VISITDEFINITIONID_COLUMN_BITMASK);

		_finderPathCountByI_S_V = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByI_S_V",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitEventImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			VisitEventModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_setVisitEventUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setVisitEventUtilPersistence(null);

		entityCache.removeCache(VisitEventImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setVisitEventUtilPersistence(
		VisitEventPersistence visitEventPersistence) {

		try {
			Field field = VisitEventUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, visitEventPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.VisitEvent"),
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

	private static final String _SQL_SELECT_VISITEVENT =
		"SELECT visitEvent FROM VisitEvent visitEvent";

	private static final String _SQL_SELECT_VISITEVENT_WHERE =
		"SELECT visitEvent FROM VisitEvent visitEvent WHERE ";

	private static final String _SQL_COUNT_VISITEVENT =
		"SELECT COUNT(visitEvent) FROM VisitEvent visitEvent";

	private static final String _SQL_COUNT_VISITEVENT_WHERE =
		"SELECT COUNT(visitEvent) FROM VisitEvent visitEvent WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "visitEvent.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No VisitEvent exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No VisitEvent exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VisitEventPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
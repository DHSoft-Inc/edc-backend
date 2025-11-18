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

import com.dhsoft.edc.backend.exception.NoSuchVisitDefinitionException;
import com.dhsoft.edc.backend.model.VisitDefinition;
import com.dhsoft.edc.backend.model.impl.VisitDefinitionImpl;
import com.dhsoft.edc.backend.model.impl.VisitDefinitionModelImpl;
import com.dhsoft.edc.backend.service.persistence.VisitDefinitionPersistence;
import com.dhsoft.edc.backend.service.persistence.VisitDefinitionUtil;
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
 * The persistence implementation for the visit definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = VisitDefinitionPersistence.class)
public class VisitDefinitionPersistenceImpl
	extends BasePersistenceImpl<VisitDefinition>
	implements VisitDefinitionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VisitDefinitionUtil</code> to access the visit definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VisitDefinitionImpl.class.getName();

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
	 * Returns all the visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (!uuid.equals(visitDefinition.getUuid())) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUuid_First(
			String uuid, OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUuid_First(
			uuid, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUuid_First(
		String uuid, OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUuid_Last(
			String uuid, OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUuid_Last(
			uuid, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUuid_Last(
		String uuid, OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByUuid_PrevAndNext(
			long visitDefinitionId, String uuid,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		uuid = Objects.toString(uuid, "");

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, visitDefinition, uuid, orderByComparator, true);

			array[1] = visitDefinition;

			array[2] = getByUuid_PrevAndNext(
				session, visitDefinition, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitDefinition getByUuid_PrevAndNext(
		Session session, VisitDefinition visitDefinition, String uuid,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (VisitDefinition visitDefinition :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(visitDefinition.uuid IS NULL OR visitDefinition.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUUID_G(String uuid, long groupId)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUUID_G(uuid, groupId);

		if (visitDefinition == null) {
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

			throw new NoSuchVisitDefinitionException(sb.toString());
		}

		return visitDefinition;
	}

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUUID_G(
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

		if (result instanceof VisitDefinition) {
			VisitDefinition visitDefinition = (VisitDefinition)result;

			if (!Objects.equals(uuid, visitDefinition.getUuid()) ||
				(groupId != visitDefinition.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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

				List<VisitDefinition> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					VisitDefinition visitDefinition = list.get(0);

					result = visitDefinition;

					cacheResult(visitDefinition);
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
			return (VisitDefinition)result;
		}
	}

	/**
	 * Removes the visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the visit definition that was removed
	 */
	@Override
	public VisitDefinition removeByUUID_G(String uuid, long groupId)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByUUID_G(uuid, groupId);

		return remove(visitDefinition);
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(visitDefinition.uuid IS NULL OR visitDefinition.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"visitDefinition.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (!uuid.equals(visitDefinition.getUuid()) ||
						(companyId != visitDefinition.getCompanyId())) {

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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public VisitDefinition[] findByUuid_C_PrevAndNext(
			long visitDefinitionId, String uuid, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		uuid = Objects.toString(uuid, "");

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, visitDefinition, uuid, companyId, orderByComparator,
				true);

			array[1] = visitDefinition;

			array[2] = getByUuid_C_PrevAndNext(
				session, visitDefinition, uuid, companyId, orderByComparator,
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

	protected VisitDefinition getByUuid_C_PrevAndNext(
		Session session, VisitDefinition visitDefinition, String uuid,
		long companyId, OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (VisitDefinition visitDefinition :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(visitDefinition.uuid IS NULL OR visitDefinition.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"visitDefinition.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end) {

		return findByCompanyId(companyId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (companyId != visitDefinition.getCompanyId()) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByCompanyId_First(
			long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByCompanyId_First(
		long companyId, OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByCompanyId_Last(
			long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByCompanyId_Last(
		long companyId, OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByCompanyId_PrevAndNext(
			long visitDefinitionId, long companyId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, visitDefinition, companyId, orderByComparator, true);

			array[1] = visitDefinition;

			array[2] = getByCompanyId_PrevAndNext(
				session, visitDefinition, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitDefinition getByCompanyId_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long companyId,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (VisitDefinition visitDefinition :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if ((groupId != visitDefinition.getGroupId()) ||
						(projectId != visitDefinition.getProjectId())) {

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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public VisitDefinition[] findByG_P_PrevAndNext(
			long visitDefinitionId, long groupId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, visitDefinition, groupId, projectId, orderByComparator,
				true);

			array[1] = visitDefinition;

			array[2] = getByG_P_PrevAndNext(
				session, visitDefinition, groupId, projectId, orderByComparator,
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

	protected VisitDefinition getByG_P_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long groupId,
		long projectId, OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (VisitDefinition visitDefinition :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"visitDefinition.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByProjectId;
	private FinderPath _finderPathWithoutPaginationFindByProjectId;
	private FinderPath _finderPathCountByProjectId;

	/**
	 * Returns all the visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByProjectId(long projectId) {
		return findByProjectId(
			projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByProjectId(
		long projectId, int start, int end) {

		return findByProjectId(projectId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByProjectId(projectId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByProjectId;
				finderArgs = new Object[] {projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByProjectId;
			finderArgs = new Object[] {
				projectId, start, end, orderByComparator
			};
		}

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (projectId != visitDefinition.getProjectId()) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByProjectId_First(
			long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByProjectId_First(
			projectId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByProjectId_First(
		long projectId, OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByProjectId(
			projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByProjectId_Last(
			long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByProjectId_Last(
			projectId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByProjectId_Last(
		long projectId, OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByProjectId(projectId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByProjectId(
			projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByProjectId_PrevAndNext(
			long visitDefinitionId, long projectId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByProjectId_PrevAndNext(
				session, visitDefinition, projectId, orderByComparator, true);

			array[1] = visitDefinition;

			array[2] = getByProjectId_PrevAndNext(
				session, visitDefinition, projectId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitDefinition getByProjectId_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long projectId,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

		sb.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByProjectId(long projectId) {
		for (VisitDefinition visitDefinition :
				findByProjectId(
					projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByProjectId(long projectId) {
		FinderPath finderPath = _finderPathCountByProjectId;

		Object[] finderArgs = new Object[] {projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

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

	private static final String _FINDER_COLUMN_PROJECTID_PROJECTID_2 =
		"visitDefinition.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByVisitGroupId;
	private FinderPath _finderPathWithoutPaginationFindByVisitGroupId;
	private FinderPath _finderPathCountByVisitGroupId;

	/**
	 * Returns all the visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByVisitGroupId(long visitGroupId) {
		return findByVisitGroupId(
			visitGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end) {

		return findByVisitGroupId(visitGroupId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByVisitGroupId(
			visitGroupId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByVisitGroupId;
				finderArgs = new Object[] {visitGroupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByVisitGroupId;
			finderArgs = new Object[] {
				visitGroupId, start, end, orderByComparator
			};
		}

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (visitGroupId != visitDefinition.getVisitGroupId()) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITGROUPID_VISITGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(visitGroupId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByVisitGroupId_First(
			visitGroupId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByVisitGroupId(
			visitGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByVisitGroupId_Last(
			visitGroupId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByVisitGroupId(visitGroupId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByVisitGroupId(
			visitGroupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByVisitGroupId_PrevAndNext(
			long visitDefinitionId, long visitGroupId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByVisitGroupId_PrevAndNext(
				session, visitDefinition, visitGroupId, orderByComparator,
				true);

			array[1] = visitDefinition;

			array[2] = getByVisitGroupId_PrevAndNext(
				session, visitDefinition, visitGroupId, orderByComparator,
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

	protected VisitDefinition getByVisitGroupId_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long visitGroupId,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

		sb.append(_FINDER_COLUMN_VISITGROUPID_VISITGROUPID_2);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(visitGroupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	@Override
	public void removeByVisitGroupId(long visitGroupId) {
		for (VisitDefinition visitDefinition :
				findByVisitGroupId(
					visitGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByVisitGroupId(long visitGroupId) {
		FinderPath finderPath = _finderPathCountByVisitGroupId;

		Object[] finderArgs = new Object[] {visitGroupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITGROUPID_VISITGROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_VISITGROUPID_VISITGROUPID_2 =
		"visitDefinition.visitGroupId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (userId != visitDefinition.getUserId()) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUserId_First(
			long userId, OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUserId_First(
			userId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUserId_First(
		long userId, OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByUserId(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByUserId_Last(
			long userId, OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByUserId_Last(
			userId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByUserId_Last(
		long userId, OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where userId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByUserId_PrevAndNext(
			long visitDefinitionId, long userId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, visitDefinition, userId, orderByComparator, true);

			array[1] = visitDefinition;

			array[2] = getByUserId_PrevAndNext(
				session, visitDefinition, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitDefinition getByUserId_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long userId,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (VisitDefinition visitDefinition :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

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
		"visitDefinition.userId = ?";

	private FinderPath _finderPathWithPaginationFindByVisitCRFId;
	private FinderPath _finderPathWithoutPaginationFindByVisitCRFId;
	private FinderPath _finderPathCountByVisitCRFId;

	/**
	 * Returns all the visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching visit definitions
	 */
	@Override
	public List<VisitDefinition> findByVisitCRFId(long visitCRFId) {
		return findByVisitCRFId(
			visitCRFId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end) {

		return findByVisitCRFId(visitCRFId, start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findByVisitCRFId(
			visitCRFId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByVisitCRFId;
				finderArgs = new Object[] {visitCRFId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByVisitCRFId;
			finderArgs = new Object[] {
				visitCRFId, start, end, orderByComparator
			};
		}

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitDefinition visitDefinition : list) {
					if (visitCRFId != visitDefinition.getVisitCRFId()) {
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

			sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITCRFID_VISITCRFID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(visitCRFId);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByVisitCRFId_First(
			visitCRFId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByVisitCRFId_First(
		long visitCRFId, OrderByComparator<VisitDefinition> orderByComparator) {

		List<VisitDefinition> list = findByVisitCRFId(
			visitCRFId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition
	 * @throws NoSuchVisitDefinitionException if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByVisitCRFId_Last(
			visitCRFId, orderByComparator);

		if (visitDefinition != null) {
			return visitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visit definition, or <code>null</code> if a matching visit definition could not be found
	 */
	@Override
	public VisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId, OrderByComparator<VisitDefinition> orderByComparator) {

		int count = countByVisitCRFId(visitCRFId);

		if (count == 0) {
			return null;
		}

		List<VisitDefinition> list = findByVisitCRFId(
			visitCRFId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visit definitions before and after the current visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitDefinitionId the primary key of the current visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition[] findByVisitCRFId_PrevAndNext(
			long visitDefinitionId, long visitCRFId,
			OrderByComparator<VisitDefinition> orderByComparator)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = findByPrimaryKey(visitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			VisitDefinition[] array = new VisitDefinitionImpl[3];

			array[0] = getByVisitCRFId_PrevAndNext(
				session, visitDefinition, visitCRFId, orderByComparator, true);

			array[1] = visitDefinition;

			array[2] = getByVisitCRFId_PrevAndNext(
				session, visitDefinition, visitCRFId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected VisitDefinition getByVisitCRFId_PrevAndNext(
		Session session, VisitDefinition visitDefinition, long visitCRFId,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_VISITDEFINITION_WHERE);

		sb.append(_FINDER_COLUMN_VISITCRFID_VISITCRFID_2);

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
			sb.append(VisitDefinitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(visitCRFId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						visitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<VisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	@Override
	public void removeByVisitCRFId(long visitCRFId) {
		for (VisitDefinition visitDefinition :
				findByVisitCRFId(
					visitCRFId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching visit definitions
	 */
	@Override
	public int countByVisitCRFId(long visitCRFId) {
		FinderPath finderPath = _finderPathCountByVisitCRFId;

		Object[] finderArgs = new Object[] {visitCRFId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITCRFID_VISITCRFID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_VISITCRFID_VISITCRFID_2 =
		"visitDefinition.visitCRFId = ?";

	public VisitDefinitionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("order", "order_");
		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(VisitDefinition.class);

		setModelImplClass(VisitDefinitionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the visit definition in the entity cache if it is enabled.
	 *
	 * @param visitDefinition the visit definition
	 */
	@Override
	public void cacheResult(VisitDefinition visitDefinition) {
		entityCache.putResult(
			entityCacheEnabled, VisitDefinitionImpl.class,
			visitDefinition.getPrimaryKey(), visitDefinition);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				visitDefinition.getUuid(), visitDefinition.getGroupId()
			},
			visitDefinition);

		visitDefinition.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the visit definitions in the entity cache if it is enabled.
	 *
	 * @param visitDefinitions the visit definitions
	 */
	@Override
	public void cacheResult(List<VisitDefinition> visitDefinitions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (visitDefinitions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (VisitDefinition visitDefinition : visitDefinitions) {
			if (entityCache.getResult(
					entityCacheEnabled, VisitDefinitionImpl.class,
					visitDefinition.getPrimaryKey()) == null) {

				cacheResult(visitDefinition);
			}
			else {
				visitDefinition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all visit definitions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VisitDefinitionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the visit definition.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VisitDefinition visitDefinition) {
		entityCache.removeResult(
			entityCacheEnabled, VisitDefinitionImpl.class,
			visitDefinition.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(VisitDefinitionModelImpl)visitDefinition, true);
	}

	@Override
	public void clearCache(List<VisitDefinition> visitDefinitions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VisitDefinition visitDefinition : visitDefinitions) {
			entityCache.removeResult(
				entityCacheEnabled, VisitDefinitionImpl.class,
				visitDefinition.getPrimaryKey());

			clearUniqueFindersCache(
				(VisitDefinitionModelImpl)visitDefinition, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, VisitDefinitionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		VisitDefinitionModelImpl visitDefinitionModelImpl) {

		Object[] args = new Object[] {
			visitDefinitionModelImpl.getUuid(),
			visitDefinitionModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, visitDefinitionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VisitDefinitionModelImpl visitDefinitionModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				visitDefinitionModelImpl.getUuid(),
				visitDefinitionModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((visitDefinitionModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				visitDefinitionModelImpl.getOriginalUuid(),
				visitDefinitionModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new visit definition with the primary key. Does not add the visit definition to the database.
	 *
	 * @param visitDefinitionId the primary key for the new visit definition
	 * @return the new visit definition
	 */
	@Override
	public VisitDefinition create(long visitDefinitionId) {
		VisitDefinition visitDefinition = new VisitDefinitionImpl();

		visitDefinition.setNew(true);
		visitDefinition.setPrimaryKey(visitDefinitionId);

		String uuid = PortalUUIDUtil.generate();

		visitDefinition.setUuid(uuid);

		visitDefinition.setCompanyId(CompanyThreadLocal.getCompanyId());

		return visitDefinition;
	}

	/**
	 * Removes the visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition that was removed
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition remove(long visitDefinitionId)
		throws NoSuchVisitDefinitionException {

		return remove((Serializable)visitDefinitionId);
	}

	/**
	 * Removes the visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the visit definition
	 * @return the visit definition that was removed
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition remove(Serializable primaryKey)
		throws NoSuchVisitDefinitionException {

		Session session = null;

		try {
			session = openSession();

			VisitDefinition visitDefinition = (VisitDefinition)session.get(
				VisitDefinitionImpl.class, primaryKey);

			if (visitDefinition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVisitDefinitionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(visitDefinition);
		}
		catch (NoSuchVisitDefinitionException noSuchEntityException) {
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
	protected VisitDefinition removeImpl(VisitDefinition visitDefinition) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(visitDefinition)) {
				visitDefinition = (VisitDefinition)session.get(
					VisitDefinitionImpl.class,
					visitDefinition.getPrimaryKeyObj());
			}

			if (visitDefinition != null) {
				session.delete(visitDefinition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (visitDefinition != null) {
			clearCache(visitDefinition);
		}

		return visitDefinition;
	}

	@Override
	public VisitDefinition updateImpl(VisitDefinition visitDefinition) {
		boolean isNew = visitDefinition.isNew();

		if (!(visitDefinition instanceof VisitDefinitionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(visitDefinition.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					visitDefinition);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in visitDefinition proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VisitDefinition implementation " +
					visitDefinition.getClass());
		}

		VisitDefinitionModelImpl visitDefinitionModelImpl =
			(VisitDefinitionModelImpl)visitDefinition;

		if (Validator.isNull(visitDefinition.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			visitDefinition.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (visitDefinition.getCreateDate() == null)) {
			if (serviceContext == null) {
				visitDefinition.setCreateDate(date);
			}
			else {
				visitDefinition.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!visitDefinitionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				visitDefinition.setModifiedDate(date);
			}
			else {
				visitDefinition.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(visitDefinition);

				visitDefinition.setNew(false);
			}
			else {
				visitDefinition = (VisitDefinition)session.merge(
					visitDefinition);
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
			Object[] args = new Object[] {visitDefinitionModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				visitDefinitionModelImpl.getUuid(),
				visitDefinitionModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {visitDefinitionModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {
				visitDefinitionModelImpl.getGroupId(),
				visitDefinitionModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {visitDefinitionModelImpl.getProjectId()};

			finderCache.removeResult(_finderPathCountByProjectId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByProjectId, args);

			args = new Object[] {visitDefinitionModelImpl.getVisitGroupId()};

			finderCache.removeResult(_finderPathCountByVisitGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByVisitGroupId, args);

			args = new Object[] {visitDefinitionModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			args = new Object[] {visitDefinitionModelImpl.getVisitCRFId()};

			finderCache.removeResult(_finderPathCountByVisitCRFId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByVisitCRFId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {visitDefinitionModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalUuid(),
					visitDefinitionModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					visitDefinitionModelImpl.getUuid(),
					visitDefinitionModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {visitDefinitionModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalGroupId(),
					visitDefinitionModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					visitDefinitionModelImpl.getGroupId(),
					visitDefinitionModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByProjectId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);

				args = new Object[] {visitDefinitionModelImpl.getProjectId()};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByVisitGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByVisitGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitGroupId, args);

				args = new Object[] {
					visitDefinitionModelImpl.getVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByVisitGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitGroupId, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {visitDefinitionModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}

			if ((visitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByVisitCRFId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					visitDefinitionModelImpl.getOriginalVisitCRFId()
				};

				finderCache.removeResult(_finderPathCountByVisitCRFId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitCRFId, args);

				args = new Object[] {visitDefinitionModelImpl.getVisitCRFId()};

				finderCache.removeResult(_finderPathCountByVisitCRFId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitCRFId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, VisitDefinitionImpl.class,
			visitDefinition.getPrimaryKey(), visitDefinition, false);

		clearUniqueFindersCache(visitDefinitionModelImpl, false);
		cacheUniqueFindersCache(visitDefinitionModelImpl);

		visitDefinition.resetOriginalValues();

		return visitDefinition;
	}

	/**
	 * Returns the visit definition with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the visit definition
	 * @return the visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVisitDefinitionException {

		VisitDefinition visitDefinition = fetchByPrimaryKey(primaryKey);

		if (visitDefinition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVisitDefinitionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return visitDefinition;
	}

	/**
	 * Returns the visit definition with the primary key or throws a <code>NoSuchVisitDefinitionException</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition
	 * @throws NoSuchVisitDefinitionException if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition findByPrimaryKey(long visitDefinitionId)
		throws NoSuchVisitDefinitionException {

		return findByPrimaryKey((Serializable)visitDefinitionId);
	}

	/**
	 * Returns the visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitDefinitionId the primary key of the visit definition
	 * @return the visit definition, or <code>null</code> if a visit definition with the primary key could not be found
	 */
	@Override
	public VisitDefinition fetchByPrimaryKey(long visitDefinitionId) {
		return fetchByPrimaryKey((Serializable)visitDefinitionId);
	}

	/**
	 * Returns all the visit definitions.
	 *
	 * @return the visit definitions
	 */
	@Override
	public List<VisitDefinition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<VisitDefinition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<VisitDefinition> findAll(
		int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<VisitDefinition> findAll(
		int start, int end,
		OrderByComparator<VisitDefinition> orderByComparator,
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

		List<VisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<VisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VISITDEFINITION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VISITDEFINITION;

				sql = sql.concat(VisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<VisitDefinition>)QueryUtil.list(
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
	 * Removes all the visit definitions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VisitDefinition visitDefinition : findAll()) {
			remove(visitDefinition);
		}
	}

	/**
	 * Returns the number of visit definitions.
	 *
	 * @return the number of visit definitions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_VISITDEFINITION);

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
		return "visitDefinitionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VISITDEFINITION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VisitDefinitionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the visit definition persistence.
	 */
	@Activate
	public void activate() {
		VisitDefinitionModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		VisitDefinitionModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			VisitDefinitionModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			VisitDefinitionModelImpl.UUID_COLUMN_BITMASK |
			VisitDefinitionModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			VisitDefinitionModelImpl.UUID_COLUMN_BITMASK |
			VisitDefinitionModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			VisitDefinitionModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			VisitDefinitionModelImpl.GROUPID_COLUMN_BITMASK |
			VisitDefinitionModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProjectId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProjectId",
			new String[] {Long.class.getName()},
			VisitDefinitionModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProjectId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisitGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisitGroupId",
			new String[] {Long.class.getName()},
			VisitDefinitionModelImpl.VISITGROUPID_COLUMN_BITMASK);

		_finderPathCountByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisitGroupId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			VisitDefinitionModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisitCRFId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, VisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisitCRFId",
			new String[] {Long.class.getName()},
			VisitDefinitionModelImpl.VISITCRFID_COLUMN_BITMASK);

		_finderPathCountByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisitCRFId",
			new String[] {Long.class.getName()});

		_setVisitDefinitionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setVisitDefinitionUtilPersistence(null);

		entityCache.removeCache(VisitDefinitionImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setVisitDefinitionUtilPersistence(
		VisitDefinitionPersistence visitDefinitionPersistence) {

		try {
			Field field = VisitDefinitionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, visitDefinitionPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.VisitDefinition"),
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

	private static final String _SQL_SELECT_VISITDEFINITION =
		"SELECT visitDefinition FROM VisitDefinition visitDefinition";

	private static final String _SQL_SELECT_VISITDEFINITION_WHERE =
		"SELECT visitDefinition FROM VisitDefinition visitDefinition WHERE ";

	private static final String _SQL_COUNT_VISITDEFINITION =
		"SELECT COUNT(visitDefinition) FROM VisitDefinition visitDefinition";

	private static final String _SQL_COUNT_VISITDEFINITION_WHERE =
		"SELECT COUNT(visitDefinition) FROM VisitDefinition visitDefinition WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "visitDefinition.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No VisitDefinition exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No VisitDefinition exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VisitDefinitionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "order", "type"});

}
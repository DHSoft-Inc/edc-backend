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

import com.dhsoft.edc.backend.exception.NoSuchAssignProjectScopeException;
import com.dhsoft.edc.backend.model.AssignProjectScope;
import com.dhsoft.edc.backend.model.impl.AssignProjectScopeImpl;
import com.dhsoft.edc.backend.model.impl.AssignProjectScopeModelImpl;
import com.dhsoft.edc.backend.service.persistence.AssignProjectScopePersistence;
import com.dhsoft.edc.backend.service.persistence.AssignProjectScopeUtil;
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
 * The persistence implementation for the assign project scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssignProjectScopePersistence.class)
public class AssignProjectScopePersistenceImpl
	extends BasePersistenceImpl<AssignProjectScope>
	implements AssignProjectScopePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssignProjectScopeUtil</code> to access the assign project scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssignProjectScopeImpl.class.getName();

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
	 * Returns all the assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		List<AssignProjectScope> list = null;

		if (useFinderCache) {
			list = (List<AssignProjectScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignProjectScope assignProjectScope : list) {
					if (!uuid.equals(assignProjectScope.getUuid())) {
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

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

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
				sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignProjectScope>)QueryUtil.list(
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
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUuid_First(
			String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUuid_First(
			uuid, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUuid_First(
		String uuid, OrderByComparator<AssignProjectScope> orderByComparator) {

		List<AssignProjectScope> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUuid_Last(
			String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUuid_Last(
			uuid, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUuid_Last(
		String uuid, OrderByComparator<AssignProjectScope> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AssignProjectScope> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope[] findByUuid_PrevAndNext(
			long projectScopeId, String uuid,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		uuid = Objects.toString(uuid, "");

		AssignProjectScope assignProjectScope = findByPrimaryKey(
			projectScopeId);

		Session session = null;

		try {
			session = openSession();

			AssignProjectScope[] array = new AssignProjectScopeImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, assignProjectScope, uuid, orderByComparator, true);

			array[1] = assignProjectScope;

			array[2] = getByUuid_PrevAndNext(
				session, assignProjectScope, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssignProjectScope getByUuid_PrevAndNext(
		Session session, AssignProjectScope assignProjectScope, String uuid,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

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
			sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
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
						assignProjectScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignProjectScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign project scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AssignProjectScope assignProjectScope :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(assignProjectScope);
		}
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

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
		"assignProjectScope.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(assignProjectScope.uuid IS NULL OR assignProjectScope.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUUID_G(String uuid, long groupId)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUUID_G(uuid, groupId);

		if (assignProjectScope == null) {
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

			throw new NoSuchAssignProjectScopeException(sb.toString());
		}

		return assignProjectScope;
	}

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the assign project scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUUID_G(
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

		if (result instanceof AssignProjectScope) {
			AssignProjectScope assignProjectScope = (AssignProjectScope)result;

			if (!Objects.equals(uuid, assignProjectScope.getUuid()) ||
				(groupId != assignProjectScope.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

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

				List<AssignProjectScope> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AssignProjectScope assignProjectScope = list.get(0);

					result = assignProjectScope;

					cacheResult(assignProjectScope);
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
			return (AssignProjectScope)result;
		}
	}

	/**
	 * Removes the assign project scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign project scope that was removed
	 */
	@Override
	public AssignProjectScope removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = findByUUID_G(uuid, groupId);

		return remove(assignProjectScope);
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

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
		"assignProjectScope.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(assignProjectScope.uuid IS NULL OR assignProjectScope.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"assignProjectScope.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		List<AssignProjectScope> list = null;

		if (useFinderCache) {
			list = (List<AssignProjectScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignProjectScope assignProjectScope : list) {
					if (!uuid.equals(assignProjectScope.getUuid()) ||
						(companyId != assignProjectScope.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

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
				sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignProjectScope>)QueryUtil.list(
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
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the first assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		List<AssignProjectScope> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the last assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AssignProjectScope> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope[] findByUuid_C_PrevAndNext(
			long projectScopeId, String uuid, long companyId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		uuid = Objects.toString(uuid, "");

		AssignProjectScope assignProjectScope = findByPrimaryKey(
			projectScopeId);

		Session session = null;

		try {
			session = openSession();

			AssignProjectScope[] array = new AssignProjectScopeImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, assignProjectScope, uuid, companyId, orderByComparator,
				true);

			array[1] = assignProjectScope;

			array[2] = getByUuid_C_PrevAndNext(
				session, assignProjectScope, uuid, companyId, orderByComparator,
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

	protected AssignProjectScope getByUuid_C_PrevAndNext(
		Session session, AssignProjectScope assignProjectScope, String uuid,
		long companyId, OrderByComparator<AssignProjectScope> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

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
			sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
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
						assignProjectScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignProjectScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign project scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AssignProjectScope assignProjectScope :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assignProjectScope);
		}
	}

	/**
	 * Returns the number of assign project scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

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
		"assignProjectScope.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(assignProjectScope.uuid IS NULL OR assignProjectScope.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"assignProjectScope.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitutionProject;
	private FinderPath _finderPathWithoutPaginationFindByInstitutionProject;
	private FinderPath _finderPathCountByInstitutionProject;

	/**
	 * Returns all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId) {

		return findByInstitutionProject(
			institutionId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end) {

		return findByInstitutionProject(
			institutionId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByInstitutionProject;
				finderArgs = new Object[] {institutionId, projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByInstitutionProject;
			finderArgs = new Object[] {
				institutionId, projectId, start, end, orderByComparator
			};
		}

		List<AssignProjectScope> list = null;

		if (useFinderCache) {
			list = (List<AssignProjectScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignProjectScope assignProjectScope : list) {
					if ((institutionId !=
							assignProjectScope.getInstitutionId()) ||
						(projectId != assignProjectScope.getProjectId())) {

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

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(projectId);

				list = (List<AssignProjectScope>)QueryUtil.list(
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
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByInstitutionProject_First(
			long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByInstitutionProject_First(
			institutionId, projectId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the first assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByInstitutionProject_First(
		long institutionId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		List<AssignProjectScope> list = findByInstitutionProject(
			institutionId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByInstitutionProject_Last(
			long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the last assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		int count = countByInstitutionProject(institutionId, projectId);

		if (count == 0) {
			return null;
		}

		List<AssignProjectScope> list = findByInstitutionProject(
			institutionId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope[] findByInstitutionProject_PrevAndNext(
			long projectScopeId, long institutionId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = findByPrimaryKey(
			projectScopeId);

		Session session = null;

		try {
			session = openSession();

			AssignProjectScope[] array = new AssignProjectScopeImpl[3];

			array[0] = getByInstitutionProject_PrevAndNext(
				session, assignProjectScope, institutionId, projectId,
				orderByComparator, true);

			array[1] = assignProjectScope;

			array[2] = getByInstitutionProject_PrevAndNext(
				session, assignProjectScope, institutionId, projectId,
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

	protected AssignProjectScope getByInstitutionProject_PrevAndNext(
		Session session, AssignProjectScope assignProjectScope,
		long institutionId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

		sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_INSTITUTIONID_2);

		sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2);

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
			sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		queryPos.add(projectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assignProjectScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignProjectScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign project scopes where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByInstitutionProject(long institutionId, long projectId) {
		for (AssignProjectScope assignProjectScope :
				findByInstitutionProject(
					institutionId, projectId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(assignProjectScope);
		}
	}

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByInstitutionProject(long institutionId, long projectId) {
		FinderPath finderPath = _finderPathCountByInstitutionProject;

		Object[] finderArgs = new Object[] {institutionId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

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

	private static final String
		_FINDER_COLUMN_INSTITUTIONPROJECT_INSTITUTIONID_2 =
			"assignProjectScope.institutionId = ? AND ";

	private static final String _FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2 =
		"assignProjectScope.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByUserProject;
	private FinderPath _finderPathWithoutPaginationFindByUserProject;
	private FinderPath _finderPathCountByUserProject;

	/**
	 * Returns all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId) {

		return findByUserProject(
			targetUserId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end) {

		return findByUserProject(targetUserId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return findByUserProject(
			targetUserId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findByUserProject(
		long targetUserId, long projectId, int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUserProject;
				finderArgs = new Object[] {targetUserId, projectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUserProject;
			finderArgs = new Object[] {
				targetUserId, projectId, start, end, orderByComparator
			};
		}

		List<AssignProjectScope> list = null;

		if (useFinderCache) {
			list = (List<AssignProjectScope>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignProjectScope assignProjectScope : list) {
					if ((targetUserId !=
							assignProjectScope.getTargetUserId()) ||
						(projectId != assignProjectScope.getProjectId())) {

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

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_USERPROJECT_TARGETUSERID_2);

			sb.append(_FINDER_COLUMN_USERPROJECT_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(targetUserId);

				queryPos.add(projectId);

				list = (List<AssignProjectScope>)QueryUtil.list(
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
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUserProject_First(
			long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUserProject_First(
			targetUserId, projectId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("targetUserId=");
		sb.append(targetUserId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the first assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUserProject_First(
		long targetUserId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		List<AssignProjectScope> list = findByUserProject(
			targetUserId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUserProject_Last(
			long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUserProject_Last(
			targetUserId, projectId, orderByComparator);

		if (assignProjectScope != null) {
			return assignProjectScope;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("targetUserId=");
		sb.append(targetUserId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignProjectScopeException(sb.toString());
	}

	/**
	 * Returns the last assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUserProject_Last(
		long targetUserId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		int count = countByUserProject(targetUserId, projectId);

		if (count == 0) {
			return null;
		}

		List<AssignProjectScope> list = findByUserProject(
			targetUserId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign project scopes before and after the current assign project scope in the ordered set where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param projectScopeId the primary key of the current assign project scope
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope[] findByUserProject_PrevAndNext(
			long projectScopeId, long targetUserId, long projectId,
			OrderByComparator<AssignProjectScope> orderByComparator)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = findByPrimaryKey(
			projectScopeId);

		Session session = null;

		try {
			session = openSession();

			AssignProjectScope[] array = new AssignProjectScopeImpl[3];

			array[0] = getByUserProject_PrevAndNext(
				session, assignProjectScope, targetUserId, projectId,
				orderByComparator, true);

			array[1] = assignProjectScope;

			array[2] = getByUserProject_PrevAndNext(
				session, assignProjectScope, targetUserId, projectId,
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

	protected AssignProjectScope getByUserProject_PrevAndNext(
		Session session, AssignProjectScope assignProjectScope,
		long targetUserId, long projectId,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

		sb.append(_FINDER_COLUMN_USERPROJECT_TARGETUSERID_2);

		sb.append(_FINDER_COLUMN_USERPROJECT_PROJECTID_2);

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
			sb.append(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(targetUserId);

		queryPos.add(projectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assignProjectScope)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignProjectScope> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign project scopes where targetUserId = &#63; and projectId = &#63; from the database.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByUserProject(long targetUserId, long projectId) {
		for (AssignProjectScope assignProjectScope :
				findByUserProject(
					targetUserId, projectId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(assignProjectScope);
		}
	}

	/**
	 * Returns the number of assign project scopes where targetUserId = &#63; and projectId = &#63;.
	 *
	 * @param targetUserId the target user ID
	 * @param projectId the project ID
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByUserProject(long targetUserId, long projectId) {
		FinderPath finderPath = _finderPathCountByUserProject;

		Object[] finderArgs = new Object[] {targetUserId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_USERPROJECT_TARGETUSERID_2);

			sb.append(_FINDER_COLUMN_USERPROJECT_PROJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(targetUserId);

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

	private static final String _FINDER_COLUMN_USERPROJECT_TARGETUSERID_2 =
		"assignProjectScope.targetUserId = ? AND ";

	private static final String _FINDER_COLUMN_USERPROJECT_PROJECTID_2 =
		"assignProjectScope.projectId = ?";

	private FinderPath _finderPathFetchByUniqueScope;
	private FinderPath _finderPathCountByUniqueScope;

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope
	 * @throws NoSuchAssignProjectScopeException if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope findByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);

		if (assignProjectScope == null) {
			StringBundler sb = new StringBundler(10);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("institutionId=");
			sb.append(institutionId);

			sb.append(", projectId=");
			sb.append(projectId);

			sb.append(", targetUserId=");
			sb.append(targetUserId);

			sb.append(", scopeRole=");
			sb.append(scopeRole);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAssignProjectScopeException(sb.toString());
		}

		return assignProjectScope;
	}

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole) {

		return fetchByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole, true);
	}

	/**
	 * Returns the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign project scope, or <code>null</code> if a matching assign project scope could not be found
	 */
	@Override
	public AssignProjectScope fetchByUniqueScope(
		long institutionId, long projectId, long targetUserId, String scopeRole,
		boolean useFinderCache) {

		scopeRole = Objects.toString(scopeRole, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				institutionId, projectId, targetUserId, scopeRole
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUniqueScope, finderArgs, this);
		}

		if (result instanceof AssignProjectScope) {
			AssignProjectScope assignProjectScope = (AssignProjectScope)result;

			if ((institutionId != assignProjectScope.getInstitutionId()) ||
				(projectId != assignProjectScope.getProjectId()) ||
				(targetUserId != assignProjectScope.getTargetUserId()) ||
				!Objects.equals(scopeRole, assignProjectScope.getScopeRole())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_TARGETUSERID_2);

			boolean bindScopeRole = false;

			if (scopeRole.isEmpty()) {
				sb.append(_FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_3);
			}
			else {
				bindScopeRole = true;

				sb.append(_FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(projectId);

				queryPos.add(targetUserId);

				if (bindScopeRole) {
					queryPos.add(scopeRole);
				}

				List<AssignProjectScope> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUniqueScope, finderArgs, list);
					}
				}
				else {
					AssignProjectScope assignProjectScope = list.get(0);

					result = assignProjectScope;

					cacheResult(assignProjectScope);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUniqueScope, finderArgs);
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
			return (AssignProjectScope)result;
		}
	}

	/**
	 * Removes the assign project scope where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the assign project scope that was removed
	 */
	@Override
	public AssignProjectScope removeByUniqueScope(
			long institutionId, long projectId, long targetUserId,
			String scopeRole)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = findByUniqueScope(
			institutionId, projectId, targetUserId, scopeRole);

		return remove(assignProjectScope);
	}

	/**
	 * Returns the number of assign project scopes where institutionId = &#63; and projectId = &#63; and targetUserId = &#63; and scopeRole = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param targetUserId the target user ID
	 * @param scopeRole the scope role
	 * @return the number of matching assign project scopes
	 */
	@Override
	public int countByUniqueScope(
		long institutionId, long projectId, long targetUserId,
		String scopeRole) {

		scopeRole = Objects.toString(scopeRole, "");

		FinderPath finderPath = _finderPathCountByUniqueScope;

		Object[] finderArgs = new Object[] {
			institutionId, projectId, targetUserId, scopeRole
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_PROJECTID_2);

			sb.append(_FINDER_COLUMN_UNIQUESCOPE_TARGETUSERID_2);

			boolean bindScopeRole = false;

			if (scopeRole.isEmpty()) {
				sb.append(_FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_3);
			}
			else {
				bindScopeRole = true;

				sb.append(_FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(projectId);

				queryPos.add(targetUserId);

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

	private static final String _FINDER_COLUMN_UNIQUESCOPE_INSTITUTIONID_2 =
		"assignProjectScope.institutionId = ? AND ";

	private static final String _FINDER_COLUMN_UNIQUESCOPE_PROJECTID_2 =
		"assignProjectScope.projectId = ? AND ";

	private static final String _FINDER_COLUMN_UNIQUESCOPE_TARGETUSERID_2 =
		"assignProjectScope.targetUserId = ? AND ";

	private static final String _FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_2 =
		"assignProjectScope.scopeRole = ?";

	private static final String _FINDER_COLUMN_UNIQUESCOPE_SCOPEROLE_3 =
		"(assignProjectScope.scopeRole IS NULL OR assignProjectScope.scopeRole = '')";

	public AssignProjectScopePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AssignProjectScope.class);

		setModelImplClass(AssignProjectScopeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the assign project scope in the entity cache if it is enabled.
	 *
	 * @param assignProjectScope the assign project scope
	 */
	@Override
	public void cacheResult(AssignProjectScope assignProjectScope) {
		entityCache.putResult(
			entityCacheEnabled, AssignProjectScopeImpl.class,
			assignProjectScope.getPrimaryKey(), assignProjectScope);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				assignProjectScope.getUuid(), assignProjectScope.getGroupId()
			},
			assignProjectScope);

		finderCache.putResult(
			_finderPathFetchByUniqueScope,
			new Object[] {
				assignProjectScope.getInstitutionId(),
				assignProjectScope.getProjectId(),
				assignProjectScope.getTargetUserId(),
				assignProjectScope.getScopeRole()
			},
			assignProjectScope);

		assignProjectScope.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assign project scopes in the entity cache if it is enabled.
	 *
	 * @param assignProjectScopes the assign project scopes
	 */
	@Override
	public void cacheResult(List<AssignProjectScope> assignProjectScopes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assignProjectScopes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssignProjectScope assignProjectScope : assignProjectScopes) {
			if (entityCache.getResult(
					entityCacheEnabled, AssignProjectScopeImpl.class,
					assignProjectScope.getPrimaryKey()) == null) {

				cacheResult(assignProjectScope);
			}
			else {
				assignProjectScope.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assign project scopes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssignProjectScopeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assign project scope.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssignProjectScope assignProjectScope) {
		entityCache.removeResult(
			entityCacheEnabled, AssignProjectScopeImpl.class,
			assignProjectScope.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(AssignProjectScopeModelImpl)assignProjectScope, true);
	}

	@Override
	public void clearCache(List<AssignProjectScope> assignProjectScopes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssignProjectScope assignProjectScope : assignProjectScopes) {
			entityCache.removeResult(
				entityCacheEnabled, AssignProjectScopeImpl.class,
				assignProjectScope.getPrimaryKey());

			clearUniqueFindersCache(
				(AssignProjectScopeModelImpl)assignProjectScope, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, AssignProjectScopeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AssignProjectScopeModelImpl assignProjectScopeModelImpl) {

		Object[] args = new Object[] {
			assignProjectScopeModelImpl.getUuid(),
			assignProjectScopeModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, assignProjectScopeModelImpl, false);

		args = new Object[] {
			assignProjectScopeModelImpl.getInstitutionId(),
			assignProjectScopeModelImpl.getProjectId(),
			assignProjectScopeModelImpl.getTargetUserId(),
			assignProjectScopeModelImpl.getScopeRole()
		};

		finderCache.putResult(
			_finderPathCountByUniqueScope, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUniqueScope, args, assignProjectScopeModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(
		AssignProjectScopeModelImpl assignProjectScopeModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				assignProjectScopeModelImpl.getUuid(),
				assignProjectScopeModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((assignProjectScopeModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				assignProjectScopeModelImpl.getOriginalUuid(),
				assignProjectScopeModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				assignProjectScopeModelImpl.getInstitutionId(),
				assignProjectScopeModelImpl.getProjectId(),
				assignProjectScopeModelImpl.getTargetUserId(),
				assignProjectScopeModelImpl.getScopeRole()
			};

			finderCache.removeResult(_finderPathCountByUniqueScope, args);
			finderCache.removeResult(_finderPathFetchByUniqueScope, args);
		}

		if ((assignProjectScopeModelImpl.getColumnBitmask() &
			 _finderPathFetchByUniqueScope.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				assignProjectScopeModelImpl.getOriginalInstitutionId(),
				assignProjectScopeModelImpl.getOriginalProjectId(),
				assignProjectScopeModelImpl.getOriginalTargetUserId(),
				assignProjectScopeModelImpl.getOriginalScopeRole()
			};

			finderCache.removeResult(_finderPathCountByUniqueScope, args);
			finderCache.removeResult(_finderPathFetchByUniqueScope, args);
		}
	}

	/**
	 * Creates a new assign project scope with the primary key. Does not add the assign project scope to the database.
	 *
	 * @param projectScopeId the primary key for the new assign project scope
	 * @return the new assign project scope
	 */
	@Override
	public AssignProjectScope create(long projectScopeId) {
		AssignProjectScope assignProjectScope = new AssignProjectScopeImpl();

		assignProjectScope.setNew(true);
		assignProjectScope.setPrimaryKey(projectScopeId);

		String uuid = PortalUUIDUtil.generate();

		assignProjectScope.setUuid(uuid);

		assignProjectScope.setCompanyId(CompanyThreadLocal.getCompanyId());

		return assignProjectScope;
	}

	/**
	 * Removes the assign project scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope that was removed
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope remove(long projectScopeId)
		throws NoSuchAssignProjectScopeException {

		return remove((Serializable)projectScopeId);
	}

	/**
	 * Removes the assign project scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assign project scope
	 * @return the assign project scope that was removed
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope remove(Serializable primaryKey)
		throws NoSuchAssignProjectScopeException {

		Session session = null;

		try {
			session = openSession();

			AssignProjectScope assignProjectScope =
				(AssignProjectScope)session.get(
					AssignProjectScopeImpl.class, primaryKey);

			if (assignProjectScope == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssignProjectScopeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assignProjectScope);
		}
		catch (NoSuchAssignProjectScopeException noSuchEntityException) {
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
	protected AssignProjectScope removeImpl(
		AssignProjectScope assignProjectScope) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assignProjectScope)) {
				assignProjectScope = (AssignProjectScope)session.get(
					AssignProjectScopeImpl.class,
					assignProjectScope.getPrimaryKeyObj());
			}

			if (assignProjectScope != null) {
				session.delete(assignProjectScope);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assignProjectScope != null) {
			clearCache(assignProjectScope);
		}

		return assignProjectScope;
	}

	@Override
	public AssignProjectScope updateImpl(
		AssignProjectScope assignProjectScope) {

		boolean isNew = assignProjectScope.isNew();

		if (!(assignProjectScope instanceof AssignProjectScopeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(assignProjectScope.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					assignProjectScope);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assignProjectScope proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssignProjectScope implementation " +
					assignProjectScope.getClass());
		}

		AssignProjectScopeModelImpl assignProjectScopeModelImpl =
			(AssignProjectScopeModelImpl)assignProjectScope;

		if (Validator.isNull(assignProjectScope.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			assignProjectScope.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (assignProjectScope.getCreateDate() == null)) {
			if (serviceContext == null) {
				assignProjectScope.setCreateDate(date);
			}
			else {
				assignProjectScope.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!assignProjectScopeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				assignProjectScope.setModifiedDate(date);
			}
			else {
				assignProjectScope.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assignProjectScope);

				assignProjectScope.setNew(false);
			}
			else {
				assignProjectScope = (AssignProjectScope)session.merge(
					assignProjectScope);
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
				assignProjectScopeModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				assignProjectScopeModelImpl.getUuid(),
				assignProjectScopeModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				assignProjectScopeModelImpl.getInstitutionId(),
				assignProjectScopeModelImpl.getProjectId()
			};

			finderCache.removeResult(
				_finderPathCountByInstitutionProject, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitutionProject, args);

			args = new Object[] {
				assignProjectScopeModelImpl.getTargetUserId(),
				assignProjectScopeModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByUserProject, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserProject, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((assignProjectScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignProjectScopeModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {assignProjectScopeModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((assignProjectScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignProjectScopeModelImpl.getOriginalUuid(),
					assignProjectScopeModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					assignProjectScopeModelImpl.getUuid(),
					assignProjectScopeModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((assignProjectScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitutionProject.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignProjectScopeModelImpl.getOriginalInstitutionId(),
					assignProjectScopeModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionProject, args);

				args = new Object[] {
					assignProjectScopeModelImpl.getInstitutionId(),
					assignProjectScopeModelImpl.getProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionProject, args);
			}

			if ((assignProjectScopeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserProject.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignProjectScopeModelImpl.getOriginalTargetUserId(),
					assignProjectScopeModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByUserProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserProject, args);

				args = new Object[] {
					assignProjectScopeModelImpl.getTargetUserId(),
					assignProjectScopeModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByUserProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserProject, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, AssignProjectScopeImpl.class,
			assignProjectScope.getPrimaryKey(), assignProjectScope, false);

		clearUniqueFindersCache(assignProjectScopeModelImpl, false);
		cacheUniqueFindersCache(assignProjectScopeModelImpl);

		assignProjectScope.resetOriginalValues();

		return assignProjectScope;
	}

	/**
	 * Returns the assign project scope with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssignProjectScopeException {

		AssignProjectScope assignProjectScope = fetchByPrimaryKey(primaryKey);

		if (assignProjectScope == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssignProjectScopeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assignProjectScope;
	}

	/**
	 * Returns the assign project scope with the primary key or throws a <code>NoSuchAssignProjectScopeException</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope
	 * @throws NoSuchAssignProjectScopeException if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope findByPrimaryKey(long projectScopeId)
		throws NoSuchAssignProjectScopeException {

		return findByPrimaryKey((Serializable)projectScopeId);
	}

	/**
	 * Returns the assign project scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectScopeId the primary key of the assign project scope
	 * @return the assign project scope, or <code>null</code> if a assign project scope with the primary key could not be found
	 */
	@Override
	public AssignProjectScope fetchByPrimaryKey(long projectScopeId) {
		return fetchByPrimaryKey((Serializable)projectScopeId);
	}

	/**
	 * Returns all the assign project scopes.
	 *
	 * @return the assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @return the range of assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findAll(
		int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign project scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignProjectScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign project scopes
	 * @param end the upper bound of the range of assign project scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign project scopes
	 */
	@Override
	public List<AssignProjectScope> findAll(
		int start, int end,
		OrderByComparator<AssignProjectScope> orderByComparator,
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

		List<AssignProjectScope> list = null;

		if (useFinderCache) {
			list = (List<AssignProjectScope>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSIGNPROJECTSCOPE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSIGNPROJECTSCOPE;

				sql = sql.concat(AssignProjectScopeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AssignProjectScope>)QueryUtil.list(
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
	 * Removes all the assign project scopes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssignProjectScope assignProjectScope : findAll()) {
			remove(assignProjectScope);
		}
	}

	/**
	 * Returns the number of assign project scopes.
	 *
	 * @return the number of assign project scopes
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
					_SQL_COUNT_ASSIGNPROJECTSCOPE);

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
		return "projectScopeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSIGNPROJECTSCOPE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssignProjectScopeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assign project scope persistence.
	 */
	@Activate
	public void activate() {
		AssignProjectScopeModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		AssignProjectScopeModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			AssignProjectScopeModelImpl.UUID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.SCOPEROLE_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			AssignProjectScopeModelImpl.UUID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			AssignProjectScopeModelImpl.UUID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.COMPANYID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.SCOPEROLE_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionProject",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInstitutionProject",
			new String[] {Long.class.getName(), Long.class.getName()},
			AssignProjectScopeModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.SCOPEROLE_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInstitutionProject",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUserProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserProject",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserProject",
			new String[] {Long.class.getName(), Long.class.getName()},
			AssignProjectScopeModelImpl.TARGETUSERID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByUserProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserProject",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathFetchByUniqueScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignProjectScopeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUniqueScope",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			AssignProjectScopeModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.PROJECTID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.TARGETUSERID_COLUMN_BITMASK |
			AssignProjectScopeModelImpl.SCOPEROLE_COLUMN_BITMASK);

		_finderPathCountByUniqueScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUniqueScope",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), String.class.getName()
			});

		_setAssignProjectScopeUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAssignProjectScopeUtilPersistence(null);

		entityCache.removeCache(AssignProjectScopeImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setAssignProjectScopeUtilPersistence(
		AssignProjectScopePersistence assignProjectScopePersistence) {

		try {
			Field field = AssignProjectScopeUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, assignProjectScopePersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.AssignProjectScope"),
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

	private static final String _SQL_SELECT_ASSIGNPROJECTSCOPE =
		"SELECT assignProjectScope FROM AssignProjectScope assignProjectScope";

	private static final String _SQL_SELECT_ASSIGNPROJECTSCOPE_WHERE =
		"SELECT assignProjectScope FROM AssignProjectScope assignProjectScope WHERE ";

	private static final String _SQL_COUNT_ASSIGNPROJECTSCOPE =
		"SELECT COUNT(assignProjectScope) FROM AssignProjectScope assignProjectScope";

	private static final String _SQL_COUNT_ASSIGNPROJECTSCOPE_WHERE =
		"SELECT COUNT(assignProjectScope) FROM AssignProjectScope assignProjectScope WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "assignProjectScope.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssignProjectScope exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssignProjectScope exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssignProjectScopePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "active"});

}
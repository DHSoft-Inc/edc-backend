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

import com.dhsoft.edc.backend.exception.NoSuchAssignInstitutionRoleException;
import com.dhsoft.edc.backend.model.AssignInstitutionRole;
import com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleImpl;
import com.dhsoft.edc.backend.model.impl.AssignInstitutionRoleModelImpl;
import com.dhsoft.edc.backend.service.persistence.AssignInstitutionRolePersistence;
import com.dhsoft.edc.backend.service.persistence.AssignInstitutionRoleUtil;
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
 * The persistence implementation for the assign institution role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssignInstitutionRolePersistence.class)
public class AssignInstitutionRolePersistenceImpl
	extends BasePersistenceImpl<AssignInstitutionRole>
	implements AssignInstitutionRolePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssignInstitutionRoleUtil</code> to access the assign institution role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssignInstitutionRoleImpl.class.getName();

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
	 * Returns all the assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		List<AssignInstitutionRole> list = null;

		if (useFinderCache) {
			list = (List<AssignInstitutionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignInstitutionRole assignInstitutionRole : list) {
					if (!uuid.equals(assignInstitutionRole.getUuid())) {
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

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

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
				sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignInstitutionRole>)QueryUtil.list(
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
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByUuid_First(
			String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByUuid_First(
			uuid, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUuid_First(
		String uuid,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		List<AssignInstitutionRole> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByUuid_Last(
			String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByUuid_Last(
			uuid, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUuid_Last(
		String uuid,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AssignInstitutionRole> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole[] findByUuid_PrevAndNext(
			long institutionRoleId, String uuid,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		uuid = Objects.toString(uuid, "");

		AssignInstitutionRole assignInstitutionRole = findByPrimaryKey(
			institutionRoleId);

		Session session = null;

		try {
			session = openSession();

			AssignInstitutionRole[] array = new AssignInstitutionRoleImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, assignInstitutionRole, uuid, orderByComparator, true);

			array[1] = assignInstitutionRole;

			array[2] = getByUuid_PrevAndNext(
				session, assignInstitutionRole, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssignInstitutionRole getByUuid_PrevAndNext(
		Session session, AssignInstitutionRole assignInstitutionRole,
		String uuid, OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

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
			sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
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
						assignInstitutionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignInstitutionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign institution roles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AssignInstitutionRole assignInstitutionRole :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(assignInstitutionRole);
		}
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

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
		"assignInstitutionRole.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(assignInstitutionRole.uuid IS NULL OR assignInstitutionRole.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByUUID_G(String uuid, long groupId)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByUUID_G(
			uuid, groupId);

		if (assignInstitutionRole == null) {
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

			throw new NoSuchAssignInstitutionRoleException(sb.toString());
		}

		return assignInstitutionRole;
	}

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the assign institution role where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUUID_G(
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

		if (result instanceof AssignInstitutionRole) {
			AssignInstitutionRole assignInstitutionRole =
				(AssignInstitutionRole)result;

			if (!Objects.equals(uuid, assignInstitutionRole.getUuid()) ||
				(groupId != assignInstitutionRole.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

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

				List<AssignInstitutionRole> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AssignInstitutionRole assignInstitutionRole = list.get(0);

					result = assignInstitutionRole;

					cacheResult(assignInstitutionRole);
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
			return (AssignInstitutionRole)result;
		}
	}

	/**
	 * Removes the assign institution role where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assign institution role that was removed
	 */
	@Override
	public AssignInstitutionRole removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = findByUUID_G(
			uuid, groupId);

		return remove(assignInstitutionRole);
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

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
		"assignInstitutionRole.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(assignInstitutionRole.uuid IS NULL OR assignInstitutionRole.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"assignInstitutionRole.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		List<AssignInstitutionRole> list = null;

		if (useFinderCache) {
			list = (List<AssignInstitutionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignInstitutionRole assignInstitutionRole : list) {
					if (!uuid.equals(assignInstitutionRole.getUuid()) ||
						(companyId != assignInstitutionRole.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

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
				sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignInstitutionRole>)QueryUtil.list(
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
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the first assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		List<AssignInstitutionRole> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the last assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AssignInstitutionRole> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole[] findByUuid_C_PrevAndNext(
			long institutionRoleId, String uuid, long companyId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		uuid = Objects.toString(uuid, "");

		AssignInstitutionRole assignInstitutionRole = findByPrimaryKey(
			institutionRoleId);

		Session session = null;

		try {
			session = openSession();

			AssignInstitutionRole[] array = new AssignInstitutionRoleImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, assignInstitutionRole, uuid, companyId,
				orderByComparator, true);

			array[1] = assignInstitutionRole;

			array[2] = getByUuid_C_PrevAndNext(
				session, assignInstitutionRole, uuid, companyId,
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

	protected AssignInstitutionRole getByUuid_C_PrevAndNext(
		Session session, AssignInstitutionRole assignInstitutionRole,
		String uuid, long companyId,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

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
			sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
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
						assignInstitutionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignInstitutionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign institution roles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AssignInstitutionRole assignInstitutionRole :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assignInstitutionRole);
		}
	}

	/**
	 * Returns the number of assign institution roles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

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
		"assignInstitutionRole.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(assignInstitutionRole.uuid IS NULL OR assignInstitutionRole.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"assignInstitutionRole.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitution;
	private FinderPath _finderPathWithoutPaginationFindByInstitution;
	private FinderPath _finderPathCountByInstitution;

	/**
	 * Returns all the assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitution(long institutionId) {
		return findByInstitution(
			institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end) {

		return findByInstitution(institutionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return findByInstitution(
			institutionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByInstitution;
				finderArgs = new Object[] {institutionId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByInstitution;
			finderArgs = new Object[] {
				institutionId, start, end, orderByComparator
			};
		}

		List<AssignInstitutionRole> list = null;

		if (useFinderCache) {
			list = (List<AssignInstitutionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignInstitutionRole assignInstitutionRole : list) {
					if (institutionId !=
							assignInstitutionRole.getInstitutionId()) {

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

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTION_INSTITUTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				list = (List<AssignInstitutionRole>)QueryUtil.list(
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
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByInstitution_First(
			long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByInstitution_First(
			institutionId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitution_First(
		long institutionId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		List<AssignInstitutionRole> list = findByInstitution(
			institutionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByInstitution_Last(
			long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByInstitution_Last(
			institutionId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitution_Last(
		long institutionId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		int count = countByInstitution(institutionId);

		if (count == 0) {
			return null;
		}

		List<AssignInstitutionRole> list = findByInstitution(
			institutionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole[] findByInstitution_PrevAndNext(
			long institutionRoleId, long institutionId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = findByPrimaryKey(
			institutionRoleId);

		Session session = null;

		try {
			session = openSession();

			AssignInstitutionRole[] array = new AssignInstitutionRoleImpl[3];

			array[0] = getByInstitution_PrevAndNext(
				session, assignInstitutionRole, institutionId,
				orderByComparator, true);

			array[1] = assignInstitutionRole;

			array[2] = getByInstitution_PrevAndNext(
				session, assignInstitutionRole, institutionId,
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

	protected AssignInstitutionRole getByInstitution_PrevAndNext(
		Session session, AssignInstitutionRole assignInstitutionRole,
		long institutionId,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

		sb.append(_FINDER_COLUMN_INSTITUTION_INSTITUTIONID_2);

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
			sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assignInstitutionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignInstitutionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign institution roles where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	@Override
	public void removeByInstitution(long institutionId) {
		for (AssignInstitutionRole assignInstitutionRole :
				findByInstitution(
					institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assignInstitutionRole);
		}
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByInstitution(long institutionId) {
		FinderPath finderPath = _finderPathCountByInstitution;

		Object[] finderArgs = new Object[] {institutionId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTION_INSTITUTIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

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

	private static final String _FINDER_COLUMN_INSTITUTION_INSTITUTIONID_2 =
		"assignInstitutionRole.institutionId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitutionAndUser;
	private FinderPath _finderPathWithoutPaginationFindByInstitutionAndUser;
	private FinderPath _finderPathCountByInstitutionAndUser;

	/**
	 * Returns all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId) {

		return findByInstitutionAndUser(
			institutionId, targetUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end) {

		return findByInstitutionAndUser(
			institutionId, targetUserId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return findByInstitutionAndUser(
			institutionId, targetUserId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findByInstitutionAndUser(
		long institutionId, long targetUserId, int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByInstitutionAndUser;
				finderArgs = new Object[] {institutionId, targetUserId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByInstitutionAndUser;
			finderArgs = new Object[] {
				institutionId, targetUserId, start, end, orderByComparator
			};
		}

		List<AssignInstitutionRole> list = null;

		if (useFinderCache) {
			list = (List<AssignInstitutionRole>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignInstitutionRole assignInstitutionRole : list) {
					if ((institutionId !=
							assignInstitutionRole.getInstitutionId()) ||
						(targetUserId !=
							assignInstitutionRole.getTargetUserId())) {

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

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_TARGETUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(targetUserId);

				list = (List<AssignInstitutionRole>)QueryUtil.list(
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
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByInstitutionAndUser_First(
			long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole =
			fetchByInstitutionAndUser_First(
				institutionId, targetUserId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", targetUserId=");
		sb.append(targetUserId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the first assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitutionAndUser_First(
		long institutionId, long targetUserId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		List<AssignInstitutionRole> list = findByInstitutionAndUser(
			institutionId, targetUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByInstitutionAndUser_Last(
			long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole =
			fetchByInstitutionAndUser_Last(
				institutionId, targetUserId, orderByComparator);

		if (assignInstitutionRole != null) {
			return assignInstitutionRole;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", targetUserId=");
		sb.append(targetUserId);

		sb.append("}");

		throw new NoSuchAssignInstitutionRoleException(sb.toString());
	}

	/**
	 * Returns the last assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitutionAndUser_Last(
		long institutionId, long targetUserId,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		int count = countByInstitutionAndUser(institutionId, targetUserId);

		if (count == 0) {
			return null;
		}

		List<AssignInstitutionRole> list = findByInstitutionAndUser(
			institutionId, targetUserId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign institution roles before and after the current assign institution role in the ordered set where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionRoleId the primary key of the current assign institution role
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole[] findByInstitutionAndUser_PrevAndNext(
			long institutionRoleId, long institutionId, long targetUserId,
			OrderByComparator<AssignInstitutionRole> orderByComparator)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = findByPrimaryKey(
			institutionRoleId);

		Session session = null;

		try {
			session = openSession();

			AssignInstitutionRole[] array = new AssignInstitutionRoleImpl[3];

			array[0] = getByInstitutionAndUser_PrevAndNext(
				session, assignInstitutionRole, institutionId, targetUserId,
				orderByComparator, true);

			array[1] = assignInstitutionRole;

			array[2] = getByInstitutionAndUser_PrevAndNext(
				session, assignInstitutionRole, institutionId, targetUserId,
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

	protected AssignInstitutionRole getByInstitutionAndUser_PrevAndNext(
		Session session, AssignInstitutionRole assignInstitutionRole,
		long institutionId, long targetUserId,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

		sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_INSTITUTIONID_2);

		sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_TARGETUSERID_2);

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
			sb.append(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		queryPos.add(targetUserId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assignInstitutionRole)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignInstitutionRole> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign institution roles where institutionId = &#63; and targetUserId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 */
	@Override
	public void removeByInstitutionAndUser(
		long institutionId, long targetUserId) {

		for (AssignInstitutionRole assignInstitutionRole :
				findByInstitutionAndUser(
					institutionId, targetUserId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(assignInstitutionRole);
		}
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByInstitutionAndUser(
		long institutionId, long targetUserId) {

		FinderPath finderPath = _finderPathCountByInstitutionAndUser;

		Object[] finderArgs = new Object[] {institutionId, targetUserId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONANDUSER_TARGETUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(targetUserId);

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
		_FINDER_COLUMN_INSTITUTIONANDUSER_INSTITUTIONID_2 =
			"assignInstitutionRole.institutionId = ? AND ";

	private static final String
		_FINDER_COLUMN_INSTITUTIONANDUSER_TARGETUSERID_2 =
			"assignInstitutionRole.targetUserId = ?";

	private FinderPath _finderPathFetchByInstitutionUserRole;
	private FinderPath _finderPathCountByInstitutionUserRole;

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole findByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole =
			fetchByInstitutionUserRole(institutionId, targetUserId, roleName);

		if (assignInstitutionRole == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("institutionId=");
			sb.append(institutionId);

			sb.append(", targetUserId=");
			sb.append(targetUserId);

			sb.append(", roleName=");
			sb.append(roleName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAssignInstitutionRoleException(sb.toString());
		}

		return assignInstitutionRole;
	}

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName) {

		return fetchByInstitutionUserRole(
			institutionId, targetUserId, roleName, true);
	}

	/**
	 * Returns the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assign institution role, or <code>null</code> if a matching assign institution role could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName,
		boolean useFinderCache) {

		roleName = Objects.toString(roleName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {institutionId, targetUserId, roleName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByInstitutionUserRole, finderArgs, this);
		}

		if (result instanceof AssignInstitutionRole) {
			AssignInstitutionRole assignInstitutionRole =
				(AssignInstitutionRole)result;

			if ((institutionId != assignInstitutionRole.getInstitutionId()) ||
				(targetUserId != assignInstitutionRole.getTargetUserId()) ||
				!Objects.equals(
					roleName, assignInstitutionRole.getRoleName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_TARGETUSERID_2);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(targetUserId);

				if (bindRoleName) {
					queryPos.add(roleName);
				}

				List<AssignInstitutionRole> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByInstitutionUserRole, finderArgs,
							list);
					}
				}
				else {
					AssignInstitutionRole assignInstitutionRole = list.get(0);

					result = assignInstitutionRole;

					cacheResult(assignInstitutionRole);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByInstitutionUserRole, finderArgs);
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
			return (AssignInstitutionRole)result;
		}
	}

	/**
	 * Removes the assign institution role where institutionId = &#63; and targetUserId = &#63; and roleName = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the assign institution role that was removed
	 */
	@Override
	public AssignInstitutionRole removeByInstitutionUserRole(
			long institutionId, long targetUserId, String roleName)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = findByInstitutionUserRole(
			institutionId, targetUserId, roleName);

		return remove(assignInstitutionRole);
	}

	/**
	 * Returns the number of assign institution roles where institutionId = &#63; and targetUserId = &#63; and roleName = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param targetUserId the target user ID
	 * @param roleName the role name
	 * @return the number of matching assign institution roles
	 */
	@Override
	public int countByInstitutionUserRole(
		long institutionId, long targetUserId, String roleName) {

		roleName = Objects.toString(roleName, "");

		FinderPath finderPath = _finderPathCountByInstitutionUserRole;

		Object[] finderArgs = new Object[] {
			institutionId, targetUserId, roleName
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_TARGETUSERID_2);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(targetUserId);

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

	private static final String
		_FINDER_COLUMN_INSTITUTIONUSERROLE_INSTITUTIONID_2 =
			"assignInstitutionRole.institutionId = ? AND ";

	private static final String
		_FINDER_COLUMN_INSTITUTIONUSERROLE_TARGETUSERID_2 =
			"assignInstitutionRole.targetUserId = ? AND ";

	private static final String _FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_2 =
		"assignInstitutionRole.roleName = ?";

	private static final String _FINDER_COLUMN_INSTITUTIONUSERROLE_ROLENAME_3 =
		"(assignInstitutionRole.roleName IS NULL OR assignInstitutionRole.roleName = '')";

	public AssignInstitutionRolePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AssignInstitutionRole.class);

		setModelImplClass(AssignInstitutionRoleImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the assign institution role in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRole the assign institution role
	 */
	@Override
	public void cacheResult(AssignInstitutionRole assignInstitutionRole) {
		entityCache.putResult(
			entityCacheEnabled, AssignInstitutionRoleImpl.class,
			assignInstitutionRole.getPrimaryKey(), assignInstitutionRole);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				assignInstitutionRole.getUuid(),
				assignInstitutionRole.getGroupId()
			},
			assignInstitutionRole);

		finderCache.putResult(
			_finderPathFetchByInstitutionUserRole,
			new Object[] {
				assignInstitutionRole.getInstitutionId(),
				assignInstitutionRole.getTargetUserId(),
				assignInstitutionRole.getRoleName()
			},
			assignInstitutionRole);

		assignInstitutionRole.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assign institution roles in the entity cache if it is enabled.
	 *
	 * @param assignInstitutionRoles the assign institution roles
	 */
	@Override
	public void cacheResult(
		List<AssignInstitutionRole> assignInstitutionRoles) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assignInstitutionRoles.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssignInstitutionRole assignInstitutionRole :
				assignInstitutionRoles) {

			if (entityCache.getResult(
					entityCacheEnabled, AssignInstitutionRoleImpl.class,
					assignInstitutionRole.getPrimaryKey()) == null) {

				cacheResult(assignInstitutionRole);
			}
			else {
				assignInstitutionRole.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assign institution roles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssignInstitutionRoleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assign institution role.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssignInstitutionRole assignInstitutionRole) {
		entityCache.removeResult(
			entityCacheEnabled, AssignInstitutionRoleImpl.class,
			assignInstitutionRole.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(AssignInstitutionRoleModelImpl)assignInstitutionRole, true);
	}

	@Override
	public void clearCache(List<AssignInstitutionRole> assignInstitutionRoles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssignInstitutionRole assignInstitutionRole :
				assignInstitutionRoles) {

			entityCache.removeResult(
				entityCacheEnabled, AssignInstitutionRoleImpl.class,
				assignInstitutionRole.getPrimaryKey());

			clearUniqueFindersCache(
				(AssignInstitutionRoleModelImpl)assignInstitutionRole, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, AssignInstitutionRoleImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AssignInstitutionRoleModelImpl assignInstitutionRoleModelImpl) {

		Object[] args = new Object[] {
			assignInstitutionRoleModelImpl.getUuid(),
			assignInstitutionRoleModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, assignInstitutionRoleModelImpl,
			false);

		args = new Object[] {
			assignInstitutionRoleModelImpl.getInstitutionId(),
			assignInstitutionRoleModelImpl.getTargetUserId(),
			assignInstitutionRoleModelImpl.getRoleName()
		};

		finderCache.putResult(
			_finderPathCountByInstitutionUserRole, args, Long.valueOf(1),
			false);
		finderCache.putResult(
			_finderPathFetchByInstitutionUserRole, args,
			assignInstitutionRoleModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		AssignInstitutionRoleModelImpl assignInstitutionRoleModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				assignInstitutionRoleModelImpl.getUuid(),
				assignInstitutionRoleModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				assignInstitutionRoleModelImpl.getOriginalUuid(),
				assignInstitutionRoleModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				assignInstitutionRoleModelImpl.getInstitutionId(),
				assignInstitutionRoleModelImpl.getTargetUserId(),
				assignInstitutionRoleModelImpl.getRoleName()
			};

			finderCache.removeResult(
				_finderPathCountByInstitutionUserRole, args);
			finderCache.removeResult(
				_finderPathFetchByInstitutionUserRole, args);
		}

		if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
			 _finderPathFetchByInstitutionUserRole.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				assignInstitutionRoleModelImpl.getOriginalInstitutionId(),
				assignInstitutionRoleModelImpl.getOriginalTargetUserId(),
				assignInstitutionRoleModelImpl.getOriginalRoleName()
			};

			finderCache.removeResult(
				_finderPathCountByInstitutionUserRole, args);
			finderCache.removeResult(
				_finderPathFetchByInstitutionUserRole, args);
		}
	}

	/**
	 * Creates a new assign institution role with the primary key. Does not add the assign institution role to the database.
	 *
	 * @param institutionRoleId the primary key for the new assign institution role
	 * @return the new assign institution role
	 */
	@Override
	public AssignInstitutionRole create(long institutionRoleId) {
		AssignInstitutionRole assignInstitutionRole =
			new AssignInstitutionRoleImpl();

		assignInstitutionRole.setNew(true);
		assignInstitutionRole.setPrimaryKey(institutionRoleId);

		String uuid = PortalUUIDUtil.generate();

		assignInstitutionRole.setUuid(uuid);

		assignInstitutionRole.setCompanyId(CompanyThreadLocal.getCompanyId());

		return assignInstitutionRole;
	}

	/**
	 * Removes the assign institution role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role that was removed
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole remove(long institutionRoleId)
		throws NoSuchAssignInstitutionRoleException {

		return remove((Serializable)institutionRoleId);
	}

	/**
	 * Removes the assign institution role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assign institution role
	 * @return the assign institution role that was removed
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole remove(Serializable primaryKey)
		throws NoSuchAssignInstitutionRoleException {

		Session session = null;

		try {
			session = openSession();

			AssignInstitutionRole assignInstitutionRole =
				(AssignInstitutionRole)session.get(
					AssignInstitutionRoleImpl.class, primaryKey);

			if (assignInstitutionRole == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssignInstitutionRoleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assignInstitutionRole);
		}
		catch (NoSuchAssignInstitutionRoleException noSuchEntityException) {
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
	protected AssignInstitutionRole removeImpl(
		AssignInstitutionRole assignInstitutionRole) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assignInstitutionRole)) {
				assignInstitutionRole = (AssignInstitutionRole)session.get(
					AssignInstitutionRoleImpl.class,
					assignInstitutionRole.getPrimaryKeyObj());
			}

			if (assignInstitutionRole != null) {
				session.delete(assignInstitutionRole);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assignInstitutionRole != null) {
			clearCache(assignInstitutionRole);
		}

		return assignInstitutionRole;
	}

	@Override
	public AssignInstitutionRole updateImpl(
		AssignInstitutionRole assignInstitutionRole) {

		boolean isNew = assignInstitutionRole.isNew();

		if (!(assignInstitutionRole instanceof
				AssignInstitutionRoleModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(assignInstitutionRole.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					assignInstitutionRole);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assignInstitutionRole proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssignInstitutionRole implementation " +
					assignInstitutionRole.getClass());
		}

		AssignInstitutionRoleModelImpl assignInstitutionRoleModelImpl =
			(AssignInstitutionRoleModelImpl)assignInstitutionRole;

		if (Validator.isNull(assignInstitutionRole.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			assignInstitutionRole.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (assignInstitutionRole.getCreateDate() == null)) {
			if (serviceContext == null) {
				assignInstitutionRole.setCreateDate(date);
			}
			else {
				assignInstitutionRole.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!assignInstitutionRoleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				assignInstitutionRole.setModifiedDate(date);
			}
			else {
				assignInstitutionRole.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assignInstitutionRole);

				assignInstitutionRole.setNew(false);
			}
			else {
				assignInstitutionRole = (AssignInstitutionRole)session.merge(
					assignInstitutionRole);
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
				assignInstitutionRoleModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				assignInstitutionRoleModelImpl.getUuid(),
				assignInstitutionRoleModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				assignInstitutionRoleModelImpl.getInstitutionId()
			};

			finderCache.removeResult(_finderPathCountByInstitution, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitution, args);

			args = new Object[] {
				assignInstitutionRoleModelImpl.getInstitutionId(),
				assignInstitutionRoleModelImpl.getTargetUserId()
			};

			finderCache.removeResult(
				_finderPathCountByInstitutionAndUser, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitutionAndUser, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignInstitutionRoleModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {assignInstitutionRoleModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignInstitutionRoleModelImpl.getOriginalUuid(),
					assignInstitutionRoleModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					assignInstitutionRoleModelImpl.getUuid(),
					assignInstitutionRoleModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitution.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignInstitutionRoleModelImpl.getOriginalInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitution, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitution, args);

				args = new Object[] {
					assignInstitutionRoleModelImpl.getInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitution, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitution, args);
			}

			if ((assignInstitutionRoleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitutionAndUser.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignInstitutionRoleModelImpl.getOriginalInstitutionId(),
					assignInstitutionRoleModelImpl.getOriginalTargetUserId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionAndUser, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionAndUser, args);

				args = new Object[] {
					assignInstitutionRoleModelImpl.getInstitutionId(),
					assignInstitutionRoleModelImpl.getTargetUserId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionAndUser, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionAndUser, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, AssignInstitutionRoleImpl.class,
			assignInstitutionRole.getPrimaryKey(), assignInstitutionRole,
			false);

		clearUniqueFindersCache(assignInstitutionRoleModelImpl, false);
		cacheUniqueFindersCache(assignInstitutionRoleModelImpl);

		assignInstitutionRole.resetOriginalValues();

		return assignInstitutionRole;
	}

	/**
	 * Returns the assign institution role with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssignInstitutionRoleException {

		AssignInstitutionRole assignInstitutionRole = fetchByPrimaryKey(
			primaryKey);

		if (assignInstitutionRole == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssignInstitutionRoleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assignInstitutionRole;
	}

	/**
	 * Returns the assign institution role with the primary key or throws a <code>NoSuchAssignInstitutionRoleException</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role
	 * @throws NoSuchAssignInstitutionRoleException if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole findByPrimaryKey(long institutionRoleId)
		throws NoSuchAssignInstitutionRoleException {

		return findByPrimaryKey((Serializable)institutionRoleId);
	}

	/**
	 * Returns the assign institution role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionRoleId the primary key of the assign institution role
	 * @return the assign institution role, or <code>null</code> if a assign institution role with the primary key could not be found
	 */
	@Override
	public AssignInstitutionRole fetchByPrimaryKey(long institutionRoleId) {
		return fetchByPrimaryKey((Serializable)institutionRoleId);
	}

	/**
	 * Returns all the assign institution roles.
	 *
	 * @return the assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @return the range of assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findAll(
		int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign institution roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignInstitutionRoleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign institution roles
	 * @param end the upper bound of the range of assign institution roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign institution roles
	 */
	@Override
	public List<AssignInstitutionRole> findAll(
		int start, int end,
		OrderByComparator<AssignInstitutionRole> orderByComparator,
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

		List<AssignInstitutionRole> list = null;

		if (useFinderCache) {
			list = (List<AssignInstitutionRole>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSIGNINSTITUTIONROLE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSIGNINSTITUTIONROLE;

				sql = sql.concat(AssignInstitutionRoleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AssignInstitutionRole>)QueryUtil.list(
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
	 * Removes all the assign institution roles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssignInstitutionRole assignInstitutionRole : findAll()) {
			remove(assignInstitutionRole);
		}
	}

	/**
	 * Returns the number of assign institution roles.
	 *
	 * @return the number of assign institution roles
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
					_SQL_COUNT_ASSIGNINSTITUTIONROLE);

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
		return "institutionRoleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSIGNINSTITUTIONROLE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssignInstitutionRoleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assign institution role persistence.
	 */
	@Activate
	public void activate() {
		AssignInstitutionRoleModelImpl.setEntityCacheEnabled(
			entityCacheEnabled);
		AssignInstitutionRoleModelImpl.setFinderCacheEnabled(
			finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			AssignInstitutionRoleModelImpl.UUID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			AssignInstitutionRoleModelImpl.UUID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			AssignInstitutionRoleModelImpl.UUID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.COMPANYID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitution",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstitution",
			new String[] {Long.class.getName()},
			AssignInstitutionRoleModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.ROLENAME_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.TARGETUSERID_COLUMN_BITMASK);

		_finderPathCountByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstitution",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByInstitutionAndUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionAndUser",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitutionAndUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInstitutionAndUser",
			new String[] {Long.class.getName(), Long.class.getName()},
			AssignInstitutionRoleModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.TARGETUSERID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.ROLENAME_COLUMN_BITMASK);

		_finderPathCountByInstitutionAndUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInstitutionAndUser",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathFetchByInstitutionUserRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			AssignInstitutionRoleImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInstitutionUserRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			AssignInstitutionRoleModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.TARGETUSERID_COLUMN_BITMASK |
			AssignInstitutionRoleModelImpl.ROLENAME_COLUMN_BITMASK);

		_finderPathCountByInstitutionUserRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInstitutionUserRole",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

		_setAssignInstitutionRoleUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAssignInstitutionRoleUtilPersistence(null);

		entityCache.removeCache(AssignInstitutionRoleImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setAssignInstitutionRoleUtilPersistence(
		AssignInstitutionRolePersistence assignInstitutionRolePersistence) {

		try {
			Field field = AssignInstitutionRoleUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, assignInstitutionRolePersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.AssignInstitutionRole"),
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

	private static final String _SQL_SELECT_ASSIGNINSTITUTIONROLE =
		"SELECT assignInstitutionRole FROM AssignInstitutionRole assignInstitutionRole";

	private static final String _SQL_SELECT_ASSIGNINSTITUTIONROLE_WHERE =
		"SELECT assignInstitutionRole FROM AssignInstitutionRole assignInstitutionRole WHERE ";

	private static final String _SQL_COUNT_ASSIGNINSTITUTIONROLE =
		"SELECT COUNT(assignInstitutionRole) FROM AssignInstitutionRole assignInstitutionRole";

	private static final String _SQL_COUNT_ASSIGNINSTITUTIONROLE_WHERE =
		"SELECT COUNT(assignInstitutionRole) FROM AssignInstitutionRole assignInstitutionRole WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"assignInstitutionRole.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssignInstitutionRole exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssignInstitutionRole exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssignInstitutionRolePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "active"});

}
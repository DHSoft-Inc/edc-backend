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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionRoleAuditException;
import com.dhsoft.edc.backend.model.EdcPermissionRoleAudit;
import com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditImpl;
import com.dhsoft.edc.backend.model.impl.EdcPermissionRoleAuditModelImpl;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionRoleAuditPersistence;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionRoleAuditUtil;
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
 * The persistence implementation for the edc permission role audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EdcPermissionRoleAuditPersistence.class)
public class EdcPermissionRoleAuditPersistenceImpl
	extends BasePersistenceImpl<EdcPermissionRoleAudit>
	implements EdcPermissionRoleAuditPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EdcPermissionRoleAuditUtil</code> to access the edc permission role audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EdcPermissionRoleAuditImpl.class.getName();

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
	 * Returns all the edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		List<EdcPermissionRoleAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRoleAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRoleAudit edcPermissionRoleAudit : list) {
					if (!uuid.equals(edcPermissionRoleAudit.getUuid())) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

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
				sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionRoleAudit>)QueryUtil.list(
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
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByUuid_First(
			uuid, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUuid_First(
		String uuid,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		List<EdcPermissionRoleAudit> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByUuid_Last(
			uuid, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUuid_Last(
		String uuid,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRoleAudit> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit[] findByUuid_PrevAndNext(
			long auditRoleId, String uuid,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionRoleAudit edcPermissionRoleAudit = findByPrimaryKey(
			auditRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRoleAudit[] array = new EdcPermissionRoleAuditImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, edcPermissionRoleAudit, uuid, orderByComparator, true);

			array[1] = edcPermissionRoleAudit;

			array[2] = getByUuid_PrevAndNext(
				session, edcPermissionRoleAudit, uuid, orderByComparator,
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

	protected EdcPermissionRoleAudit getByUuid_PrevAndNext(
		Session session, EdcPermissionRoleAudit edcPermissionRoleAudit,
		String uuid,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

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
			sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
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
						edcPermissionRoleAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRoleAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission role audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRoleAudit);
		}
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission role audits
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE);

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
		"edcPermissionRoleAudit.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(edcPermissionRoleAudit.uuid IS NULL OR edcPermissionRoleAudit.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByUUID_G(
			uuid, groupId);

		if (edcPermissionRoleAudit == null) {
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

			throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
		}

		return edcPermissionRoleAudit;
	}

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the edc permission role audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUUID_G(
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

		if (result instanceof EdcPermissionRoleAudit) {
			EdcPermissionRoleAudit edcPermissionRoleAudit =
				(EdcPermissionRoleAudit)result;

			if (!Objects.equals(uuid, edcPermissionRoleAudit.getUuid()) ||
				(groupId != edcPermissionRoleAudit.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

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

				List<EdcPermissionRoleAudit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EdcPermissionRoleAudit edcPermissionRoleAudit = list.get(0);

					result = edcPermissionRoleAudit;

					cacheResult(edcPermissionRoleAudit);
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
			return (EdcPermissionRoleAudit)result;
		}
	}

	/**
	 * Removes the edc permission role audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission role audit that was removed
	 */
	@Override
	public EdcPermissionRoleAudit removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = findByUUID_G(
			uuid, groupId);

		return remove(edcPermissionRoleAudit);
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission role audits
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE);

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
		"edcPermissionRoleAudit.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(edcPermissionRoleAudit.uuid IS NULL OR edcPermissionRoleAudit.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"edcPermissionRoleAudit.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		List<EdcPermissionRoleAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRoleAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRoleAudit edcPermissionRoleAudit : list) {
					if (!uuid.equals(edcPermissionRoleAudit.getUuid()) ||
						(companyId != edcPermissionRoleAudit.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

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
				sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionRoleAudit>)QueryUtil.list(
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
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		List<EdcPermissionRoleAudit> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRoleAudit> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit[] findByUuid_C_PrevAndNext(
			long auditRoleId, String uuid, long companyId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionRoleAudit edcPermissionRoleAudit = findByPrimaryKey(
			auditRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRoleAudit[] array = new EdcPermissionRoleAuditImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, edcPermissionRoleAudit, uuid, companyId,
				orderByComparator, true);

			array[1] = edcPermissionRoleAudit;

			array[2] = getByUuid_C_PrevAndNext(
				session, edcPermissionRoleAudit, uuid, companyId,
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

	protected EdcPermissionRoleAudit getByUuid_C_PrevAndNext(
		Session session, EdcPermissionRoleAudit edcPermissionRoleAudit,
		String uuid, long companyId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

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
			sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
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
						edcPermissionRoleAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRoleAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission role audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionRoleAudit);
		}
	}

	/**
	 * Returns the number of edc permission role audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission role audits
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE);

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
		"edcPermissionRoleAudit.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(edcPermissionRoleAudit.uuid IS NULL OR edcPermissionRoleAudit.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"edcPermissionRoleAudit.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByActorGroupRole;
	private FinderPath _finderPathWithoutPaginationFindByActorGroupRole;
	private FinderPath _finderPathCountByActorGroupRole;

	/**
	 * Returns all the edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorGroupRole(long actorGroup) {
		return findByActorGroupRole(
			actorGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end) {

		return findByActorGroupRole(actorGroup, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return findByActorGroupRole(
			actorGroup, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorGroup = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorGroup the actor group
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorGroupRole(
		long actorGroup, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByActorGroupRole;
				finderArgs = new Object[] {actorGroup};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByActorGroupRole;
			finderArgs = new Object[] {
				actorGroup, start, end, orderByComparator
			};
		}

		List<EdcPermissionRoleAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRoleAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRoleAudit edcPermissionRoleAudit : list) {
					if (actorGroup != edcPermissionRoleAudit.getActorGroup()) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_ACTORGROUPROLE_ACTORGROUP_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(actorGroup);

				list = (List<EdcPermissionRoleAudit>)QueryUtil.list(
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
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByActorGroupRole_First(
			long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit =
			fetchByActorGroupRole_First(actorGroup, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("actorGroup=");
		sb.append(actorGroup);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByActorGroupRole_First(
		long actorGroup,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		List<EdcPermissionRoleAudit> list = findByActorGroupRole(
			actorGroup, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByActorGroupRole_Last(
			long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit =
			fetchByActorGroupRole_Last(actorGroup, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("actorGroup=");
		sb.append(actorGroup);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByActorGroupRole_Last(
		long actorGroup,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		int count = countByActorGroupRole(actorGroup);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRoleAudit> list = findByActorGroupRole(
			actorGroup, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorGroup = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorGroup the actor group
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit[] findByActorGroupRole_PrevAndNext(
			long auditRoleId, long actorGroup,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = findByPrimaryKey(
			auditRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRoleAudit[] array = new EdcPermissionRoleAuditImpl[3];

			array[0] = getByActorGroupRole_PrevAndNext(
				session, edcPermissionRoleAudit, actorGroup, orderByComparator,
				true);

			array[1] = edcPermissionRoleAudit;

			array[2] = getByActorGroupRole_PrevAndNext(
				session, edcPermissionRoleAudit, actorGroup, orderByComparator,
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

	protected EdcPermissionRoleAudit getByActorGroupRole_PrevAndNext(
		Session session, EdcPermissionRoleAudit edcPermissionRoleAudit,
		long actorGroup,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

		sb.append(_FINDER_COLUMN_ACTORGROUPROLE_ACTORGROUP_2);

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
			sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(actorGroup);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRoleAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRoleAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission role audits where actorGroup = &#63; from the database.
	 *
	 * @param actorGroup the actor group
	 */
	@Override
	public void removeByActorGroupRole(long actorGroup) {
		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				findByActorGroupRole(
					actorGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRoleAudit);
		}
	}

	/**
	 * Returns the number of edc permission role audits where actorGroup = &#63;.
	 *
	 * @param actorGroup the actor group
	 * @return the number of matching edc permission role audits
	 */
	@Override
	public int countByActorGroupRole(long actorGroup) {
		FinderPath finderPath = _finderPathCountByActorGroupRole;

		Object[] finderArgs = new Object[] {actorGroup};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_ACTORGROUPROLE_ACTORGROUP_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_ACTORGROUPROLE_ACTORGROUP_2 =
		"edcPermissionRoleAudit.actorGroup = ?";

	private FinderPath _finderPathWithPaginationFindByActorRole;
	private FinderPath _finderPathWithoutPaginationFindByActorRole;
	private FinderPath _finderPathCountByActorRole;

	/**
	 * Returns all the edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorRole(long actorId) {
		return findByActorRole(
			actorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end) {

		return findByActorRole(actorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return findByActorRole(actorId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits where actorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param actorId the actor ID
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findByActorRole(
		long actorId, int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByActorRole;
				finderArgs = new Object[] {actorId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByActorRole;
			finderArgs = new Object[] {actorId, start, end, orderByComparator};
		}

		List<EdcPermissionRoleAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRoleAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionRoleAudit edcPermissionRoleAudit : list) {
					if (actorId != edcPermissionRoleAudit.getActorId()) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_ACTORROLE_ACTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(actorId);

				list = (List<EdcPermissionRoleAudit>)QueryUtil.list(
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
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByActorRole_First(
			long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByActorRole_First(
			actorId, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("actorId=");
		sb.append(actorId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByActorRole_First(
		long actorId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		List<EdcPermissionRoleAudit> list = findByActorRole(
			actorId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByActorRole_Last(
			long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByActorRole_Last(
			actorId, orderByComparator);

		if (edcPermissionRoleAudit != null) {
			return edcPermissionRoleAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("actorId=");
		sb.append(actorId);

		sb.append("}");

		throw new NoSuchEdcPermissionRoleAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission role audit, or <code>null</code> if a matching edc permission role audit could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByActorRole_Last(
		long actorId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		int count = countByActorRole(actorId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionRoleAudit> list = findByActorRole(
			actorId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission role audits before and after the current edc permission role audit in the ordered set where actorId = &#63;.
	 *
	 * @param auditRoleId the primary key of the current edc permission role audit
	 * @param actorId the actor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit[] findByActorRole_PrevAndNext(
			long auditRoleId, long actorId,
			OrderByComparator<EdcPermissionRoleAudit> orderByComparator)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = findByPrimaryKey(
			auditRoleId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRoleAudit[] array = new EdcPermissionRoleAuditImpl[3];

			array[0] = getByActorRole_PrevAndNext(
				session, edcPermissionRoleAudit, actorId, orderByComparator,
				true);

			array[1] = edcPermissionRoleAudit;

			array[2] = getByActorRole_PrevAndNext(
				session, edcPermissionRoleAudit, actorId, orderByComparator,
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

	protected EdcPermissionRoleAudit getByActorRole_PrevAndNext(
		Session session, EdcPermissionRoleAudit edcPermissionRoleAudit,
		long actorId,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE);

		sb.append(_FINDER_COLUMN_ACTORROLE_ACTORID_2);

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
			sb.append(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(actorId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionRoleAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionRoleAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission role audits where actorId = &#63; from the database.
	 *
	 * @param actorId the actor ID
	 */
	@Override
	public void removeByActorRole(long actorId) {
		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				findByActorRole(
					actorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionRoleAudit);
		}
	}

	/**
	 * Returns the number of edc permission role audits where actorId = &#63;.
	 *
	 * @param actorId the actor ID
	 * @return the number of matching edc permission role audits
	 */
	@Override
	public int countByActorRole(long actorId) {
		FinderPath finderPath = _finderPathCountByActorRole;

		Object[] finderArgs = new Object[] {actorId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_ACTORROLE_ACTORID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_ACTORROLE_ACTORID_2 =
		"edcPermissionRoleAudit.actorId = ?";

	public EdcPermissionRoleAuditPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EdcPermissionRoleAudit.class);

		setModelImplClass(EdcPermissionRoleAuditImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the edc permission role audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudit the edc permission role audit
	 */
	@Override
	public void cacheResult(EdcPermissionRoleAudit edcPermissionRoleAudit) {
		entityCache.putResult(
			entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
			edcPermissionRoleAudit.getPrimaryKey(), edcPermissionRoleAudit);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				edcPermissionRoleAudit.getUuid(),
				edcPermissionRoleAudit.getGroupId()
			},
			edcPermissionRoleAudit);

		edcPermissionRoleAudit.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the edc permission role audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionRoleAudits the edc permission role audits
	 */
	@Override
	public void cacheResult(
		List<EdcPermissionRoleAudit> edcPermissionRoleAudits) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (edcPermissionRoleAudits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				edcPermissionRoleAudits) {

			if (entityCache.getResult(
					entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
					edcPermissionRoleAudit.getPrimaryKey()) == null) {

				cacheResult(edcPermissionRoleAudit);
			}
			else {
				edcPermissionRoleAudit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edc permission role audits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdcPermissionRoleAuditImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edc permission role audit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdcPermissionRoleAudit edcPermissionRoleAudit) {
		entityCache.removeResult(
			entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
			edcPermissionRoleAudit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(EdcPermissionRoleAuditModelImpl)edcPermissionRoleAudit, true);
	}

	@Override
	public void clearCache(
		List<EdcPermissionRoleAudit> edcPermissionRoleAudits) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdcPermissionRoleAudit edcPermissionRoleAudit :
				edcPermissionRoleAudits) {

			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
				edcPermissionRoleAudit.getPrimaryKey());

			clearUniqueFindersCache(
				(EdcPermissionRoleAuditModelImpl)edcPermissionRoleAudit, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EdcPermissionRoleAuditModelImpl edcPermissionRoleAuditModelImpl) {

		Object[] args = new Object[] {
			edcPermissionRoleAuditModelImpl.getUuid(),
			edcPermissionRoleAuditModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, edcPermissionRoleAuditModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(
		EdcPermissionRoleAuditModelImpl edcPermissionRoleAuditModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionRoleAuditModelImpl.getUuid(),
				edcPermissionRoleAuditModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((edcPermissionRoleAuditModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionRoleAuditModelImpl.getOriginalUuid(),
				edcPermissionRoleAuditModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new edc permission role audit with the primary key. Does not add the edc permission role audit to the database.
	 *
	 * @param auditRoleId the primary key for the new edc permission role audit
	 * @return the new edc permission role audit
	 */
	@Override
	public EdcPermissionRoleAudit create(long auditRoleId) {
		EdcPermissionRoleAudit edcPermissionRoleAudit =
			new EdcPermissionRoleAuditImpl();

		edcPermissionRoleAudit.setNew(true);
		edcPermissionRoleAudit.setPrimaryKey(auditRoleId);

		String uuid = PortalUUIDUtil.generate();

		edcPermissionRoleAudit.setUuid(uuid);

		edcPermissionRoleAudit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return edcPermissionRoleAudit;
	}

	/**
	 * Removes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit remove(long auditRoleId)
		throws NoSuchEdcPermissionRoleAuditException {

		return remove((Serializable)auditRoleId);
	}

	/**
	 * Removes the edc permission role audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edc permission role audit
	 * @return the edc permission role audit that was removed
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit remove(Serializable primaryKey)
		throws NoSuchEdcPermissionRoleAuditException {

		Session session = null;

		try {
			session = openSession();

			EdcPermissionRoleAudit edcPermissionRoleAudit =
				(EdcPermissionRoleAudit)session.get(
					EdcPermissionRoleAuditImpl.class, primaryKey);

			if (edcPermissionRoleAudit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdcPermissionRoleAuditException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(edcPermissionRoleAudit);
		}
		catch (NoSuchEdcPermissionRoleAuditException noSuchEntityException) {
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
	protected EdcPermissionRoleAudit removeImpl(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edcPermissionRoleAudit)) {
				edcPermissionRoleAudit = (EdcPermissionRoleAudit)session.get(
					EdcPermissionRoleAuditImpl.class,
					edcPermissionRoleAudit.getPrimaryKeyObj());
			}

			if (edcPermissionRoleAudit != null) {
				session.delete(edcPermissionRoleAudit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (edcPermissionRoleAudit != null) {
			clearCache(edcPermissionRoleAudit);
		}

		return edcPermissionRoleAudit;
	}

	@Override
	public EdcPermissionRoleAudit updateImpl(
		EdcPermissionRoleAudit edcPermissionRoleAudit) {

		boolean isNew = edcPermissionRoleAudit.isNew();

		if (!(edcPermissionRoleAudit instanceof
				EdcPermissionRoleAuditModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(edcPermissionRoleAudit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					edcPermissionRoleAudit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in edcPermissionRoleAudit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EdcPermissionRoleAudit implementation " +
					edcPermissionRoleAudit.getClass());
		}

		EdcPermissionRoleAuditModelImpl edcPermissionRoleAuditModelImpl =
			(EdcPermissionRoleAuditModelImpl)edcPermissionRoleAudit;

		if (Validator.isNull(edcPermissionRoleAudit.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edcPermissionRoleAudit.setUuid(uuid);
		}

		if (isNew && (edcPermissionRoleAudit.getCreateDate() == null)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				edcPermissionRoleAudit.setCreateDate(date);
			}
			else {
				edcPermissionRoleAudit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(edcPermissionRoleAudit);

				edcPermissionRoleAudit.setNew(false);
			}
			else {
				edcPermissionRoleAudit = (EdcPermissionRoleAudit)session.merge(
					edcPermissionRoleAudit);
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
				edcPermissionRoleAuditModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				edcPermissionRoleAuditModelImpl.getUuid(),
				edcPermissionRoleAuditModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				edcPermissionRoleAuditModelImpl.getActorGroup()
			};

			finderCache.removeResult(_finderPathCountByActorGroupRole, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByActorGroupRole, args);

			args = new Object[] {edcPermissionRoleAuditModelImpl.getActorId()};

			finderCache.removeResult(_finderPathCountByActorRole, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByActorRole, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((edcPermissionRoleAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionRoleAuditModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {edcPermissionRoleAuditModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((edcPermissionRoleAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionRoleAuditModelImpl.getOriginalUuid(),
					edcPermissionRoleAuditModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					edcPermissionRoleAuditModelImpl.getUuid(),
					edcPermissionRoleAuditModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((edcPermissionRoleAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByActorGroupRole.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionRoleAuditModelImpl.getOriginalActorGroup()
				};

				finderCache.removeResult(
					_finderPathCountByActorGroupRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByActorGroupRole, args);

				args = new Object[] {
					edcPermissionRoleAuditModelImpl.getActorGroup()
				};

				finderCache.removeResult(
					_finderPathCountByActorGroupRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByActorGroupRole, args);
			}

			if ((edcPermissionRoleAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByActorRole.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionRoleAuditModelImpl.getOriginalActorId()
				};

				finderCache.removeResult(_finderPathCountByActorRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByActorRole, args);

				args = new Object[] {
					edcPermissionRoleAuditModelImpl.getActorId()
				};

				finderCache.removeResult(_finderPathCountByActorRole, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByActorRole, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, EdcPermissionRoleAuditImpl.class,
			edcPermissionRoleAudit.getPrimaryKey(), edcPermissionRoleAudit,
			false);

		clearUniqueFindersCache(edcPermissionRoleAuditModelImpl, false);
		cacheUniqueFindersCache(edcPermissionRoleAuditModelImpl);

		edcPermissionRoleAudit.resetOriginalValues();

		return edcPermissionRoleAudit;
	}

	/**
	 * Returns the edc permission role audit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdcPermissionRoleAuditException {

		EdcPermissionRoleAudit edcPermissionRoleAudit = fetchByPrimaryKey(
			primaryKey);

		if (edcPermissionRoleAudit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdcPermissionRoleAuditException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return edcPermissionRoleAudit;
	}

	/**
	 * Returns the edc permission role audit with the primary key or throws a <code>NoSuchEdcPermissionRoleAuditException</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit
	 * @throws NoSuchEdcPermissionRoleAuditException if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit findByPrimaryKey(long auditRoleId)
		throws NoSuchEdcPermissionRoleAuditException {

		return findByPrimaryKey((Serializable)auditRoleId);
	}

	/**
	 * Returns the edc permission role audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditRoleId the primary key of the edc permission role audit
	 * @return the edc permission role audit, or <code>null</code> if a edc permission role audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionRoleAudit fetchByPrimaryKey(long auditRoleId) {
		return fetchByPrimaryKey((Serializable)auditRoleId);
	}

	/**
	 * Returns all the edc permission role audits.
	 *
	 * @return the edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @return the range of edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission role audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionRoleAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission role audits
	 * @param end the upper bound of the range of edc permission role audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission role audits
	 */
	@Override
	public List<EdcPermissionRoleAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionRoleAudit> orderByComparator,
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

		List<EdcPermissionRoleAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionRoleAudit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDCPERMISSIONROLEAUDIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDCPERMISSIONROLEAUDIT;

				sql = sql.concat(EdcPermissionRoleAuditModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EdcPermissionRoleAudit>)QueryUtil.list(
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
	 * Removes all the edc permission role audits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdcPermissionRoleAudit edcPermissionRoleAudit : findAll()) {
			remove(edcPermissionRoleAudit);
		}
	}

	/**
	 * Returns the number of edc permission role audits.
	 *
	 * @return the number of edc permission role audits
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
					_SQL_COUNT_EDCPERMISSIONROLEAUDIT);

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
		return "auditRoleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDCPERMISSIONROLEAUDIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EdcPermissionRoleAuditModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edc permission role audit persistence.
	 */
	@Activate
	public void activate() {
		EdcPermissionRoleAuditModelImpl.setEntityCacheEnabled(
			entityCacheEnabled);
		EdcPermissionRoleAuditModelImpl.setFinderCacheEnabled(
			finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			EdcPermissionRoleAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionRoleAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionRoleAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.COMPANYID_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActorGroupRole",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActorGroupRole",
			new String[] {Long.class.getName()},
			EdcPermissionRoleAuditModelImpl.ACTORGROUP_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByActorGroupRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActorGroupRole",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActorRole",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionRoleAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActorRole",
			new String[] {Long.class.getName()},
			EdcPermissionRoleAuditModelImpl.ACTORID_COLUMN_BITMASK |
			EdcPermissionRoleAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByActorRole = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActorRole",
			new String[] {Long.class.getName()});

		_setEdcPermissionRoleAuditUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEdcPermissionRoleAuditUtilPersistence(null);

		entityCache.removeCache(EdcPermissionRoleAuditImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setEdcPermissionRoleAuditUtilPersistence(
		EdcPermissionRoleAuditPersistence edcPermissionRoleAuditPersistence) {

		try {
			Field field = EdcPermissionRoleAuditUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, edcPermissionRoleAuditPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.EdcPermissionRoleAudit"),
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

	private static final String _SQL_SELECT_EDCPERMISSIONROLEAUDIT =
		"SELECT edcPermissionRoleAudit FROM EdcPermissionRoleAudit edcPermissionRoleAudit";

	private static final String _SQL_SELECT_EDCPERMISSIONROLEAUDIT_WHERE =
		"SELECT edcPermissionRoleAudit FROM EdcPermissionRoleAudit edcPermissionRoleAudit WHERE ";

	private static final String _SQL_COUNT_EDCPERMISSIONROLEAUDIT =
		"SELECT COUNT(edcPermissionRoleAudit) FROM EdcPermissionRoleAudit edcPermissionRoleAudit";

	private static final String _SQL_COUNT_EDCPERMISSIONROLEAUDIT_WHERE =
		"SELECT COUNT(edcPermissionRoleAudit) FROM EdcPermissionRoleAudit edcPermissionRoleAudit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"edcPermissionRoleAudit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EdcPermissionRoleAudit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EdcPermissionRoleAudit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EdcPermissionRoleAuditPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
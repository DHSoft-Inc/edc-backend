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

import com.dhsoft.edc.backend.exception.NoSuchEdcPermissionScopeAuditException;
import com.dhsoft.edc.backend.model.EdcPermissionScopeAudit;
import com.dhsoft.edc.backend.model.impl.EdcPermissionScopeAuditImpl;
import com.dhsoft.edc.backend.model.impl.EdcPermissionScopeAuditModelImpl;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionScopeAuditPersistence;
import com.dhsoft.edc.backend.service.persistence.EdcPermissionScopeAuditUtil;
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
 * The persistence implementation for the edc permission scope audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EdcPermissionScopeAuditPersistence.class)
public class EdcPermissionScopeAuditPersistenceImpl
	extends BasePersistenceImpl<EdcPermissionScopeAudit>
	implements EdcPermissionScopeAuditPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EdcPermissionScopeAuditUtil</code> to access the edc permission scope audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EdcPermissionScopeAuditImpl.class.getName();

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
	 * Returns all the edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		List<EdcPermissionScopeAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScopeAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScopeAudit edcPermissionScopeAudit : list) {
					if (!uuid.equals(edcPermissionScopeAudit.getUuid())) {
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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
				sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionScopeAudit>)QueryUtil.list(
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
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByUuid_First(
			String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByUuid_First(
			uuid, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUuid_First(
		String uuid,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		List<EdcPermissionScopeAudit> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByUuid_Last(
			String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByUuid_Last(
			uuid, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUuid_Last(
		String uuid,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScopeAudit> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit[] findByUuid_PrevAndNext(
			long auditScopeId, String uuid,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionScopeAudit edcPermissionScopeAudit = findByPrimaryKey(
			auditScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScopeAudit[] array =
				new EdcPermissionScopeAuditImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, edcPermissionScopeAudit, uuid, orderByComparator,
				true);

			array[1] = edcPermissionScopeAudit;

			array[2] = getByUuid_PrevAndNext(
				session, edcPermissionScopeAudit, uuid, orderByComparator,
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

	protected EdcPermissionScopeAudit getByUuid_PrevAndNext(
		Session session, EdcPermissionScopeAudit edcPermissionScopeAudit,
		String uuid,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
			sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
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
						edcPermissionScopeAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScopeAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionScopeAudit);
		}
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching edc permission scope audits
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
		"edcPermissionScopeAudit.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(edcPermissionScopeAudit.uuid IS NULL OR edcPermissionScopeAudit.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByUUID_G(
			uuid, groupId);

		if (edcPermissionScopeAudit == null) {
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

			throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
		}

		return edcPermissionScopeAudit;
	}

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the edc permission scope audit where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUUID_G(
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

		if (result instanceof EdcPermissionScopeAudit) {
			EdcPermissionScopeAudit edcPermissionScopeAudit =
				(EdcPermissionScopeAudit)result;

			if (!Objects.equals(uuid, edcPermissionScopeAudit.getUuid()) ||
				(groupId != edcPermissionScopeAudit.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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

				List<EdcPermissionScopeAudit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					EdcPermissionScopeAudit edcPermissionScopeAudit = list.get(
						0);

					result = edcPermissionScopeAudit;

					cacheResult(edcPermissionScopeAudit);
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
			return (EdcPermissionScopeAudit)result;
		}
	}

	/**
	 * Removes the edc permission scope audit where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the edc permission scope audit that was removed
	 */
	@Override
	public EdcPermissionScopeAudit removeByUUID_G(String uuid, long groupId)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = findByUUID_G(
			uuid, groupId);

		return remove(edcPermissionScopeAudit);
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching edc permission scope audits
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
		"edcPermissionScopeAudit.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(edcPermissionScopeAudit.uuid IS NULL OR edcPermissionScopeAudit.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"edcPermissionScopeAudit.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		List<EdcPermissionScopeAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScopeAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScopeAudit edcPermissionScopeAudit : list) {
					if (!uuid.equals(edcPermissionScopeAudit.getUuid()) ||
						(companyId != edcPermissionScopeAudit.getCompanyId())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
				sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<EdcPermissionScopeAudit>)QueryUtil.list(
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
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		List<EdcPermissionScopeAudit> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScopeAudit> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit[] findByUuid_C_PrevAndNext(
			long auditScopeId, String uuid, long companyId,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		uuid = Objects.toString(uuid, "");

		EdcPermissionScopeAudit edcPermissionScopeAudit = findByPrimaryKey(
			auditScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScopeAudit[] array =
				new EdcPermissionScopeAuditImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, edcPermissionScopeAudit, uuid, companyId,
				orderByComparator, true);

			array[1] = edcPermissionScopeAudit;

			array[2] = getByUuid_C_PrevAndNext(
				session, edcPermissionScopeAudit, uuid, companyId,
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

	protected EdcPermissionScopeAudit getByUuid_C_PrevAndNext(
		Session session, EdcPermissionScopeAudit edcPermissionScopeAudit,
		String uuid, long companyId,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
			sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
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
						edcPermissionScopeAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScopeAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scope audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionScopeAudit);
		}
	}

	/**
	 * Returns the number of edc permission scope audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching edc permission scope audits
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE);

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
		"edcPermissionScopeAudit.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(edcPermissionScopeAudit.uuid IS NULL OR edcPermissionScopeAudit.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"edcPermissionScopeAudit.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByRoleNameScope;
	private FinderPath _finderPathWithoutPaginationFindByRoleNameScope;
	private FinderPath _finderPathCountByRoleNameScope;

	/**
	 * Returns all the edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByRoleNameScope(String roleName) {
		return findByRoleNameScope(
			roleName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end) {

		return findByRoleNameScope(roleName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return findByRoleNameScope(
			roleName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where roleName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param roleName the role name
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByRoleNameScope(
		String roleName, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		roleName = Objects.toString(roleName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByRoleNameScope;
				finderArgs = new Object[] {roleName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByRoleNameScope;
			finderArgs = new Object[] {roleName, start, end, orderByComparator};
		}

		List<EdcPermissionScopeAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScopeAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScopeAudit edcPermissionScopeAudit : list) {
					if (!roleName.equals(
							edcPermissionScopeAudit.getRoleName())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRoleName) {
					queryPos.add(roleName);
				}

				list = (List<EdcPermissionScopeAudit>)QueryUtil.list(
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
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByRoleNameScope_First(
			String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit =
			fetchByRoleNameScope_First(roleName, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("roleName=");
		sb.append(roleName);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByRoleNameScope_First(
		String roleName,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		List<EdcPermissionScopeAudit> list = findByRoleNameScope(
			roleName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByRoleNameScope_Last(
			String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit =
			fetchByRoleNameScope_Last(roleName, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("roleName=");
		sb.append(roleName);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByRoleNameScope_Last(
		String roleName,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		int count = countByRoleNameScope(roleName);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScopeAudit> list = findByRoleNameScope(
			roleName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where roleName = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param roleName the role name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit[] findByRoleNameScope_PrevAndNext(
			long auditScopeId, String roleName,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		roleName = Objects.toString(roleName, "");

		EdcPermissionScopeAudit edcPermissionScopeAudit = findByPrimaryKey(
			auditScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScopeAudit[] array =
				new EdcPermissionScopeAuditImpl[3];

			array[0] = getByRoleNameScope_PrevAndNext(
				session, edcPermissionScopeAudit, roleName, orderByComparator,
				true);

			array[1] = edcPermissionScopeAudit;

			array[2] = getByRoleNameScope_PrevAndNext(
				session, edcPermissionScopeAudit, roleName, orderByComparator,
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

	protected EdcPermissionScopeAudit getByRoleNameScope_PrevAndNext(
		Session session, EdcPermissionScopeAudit edcPermissionScopeAudit,
		String roleName,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

		boolean bindRoleName = false;

		if (roleName.isEmpty()) {
			sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_3);
		}
		else {
			bindRoleName = true;

			sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_2);
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
			sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindRoleName) {
			queryPos.add(roleName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionScopeAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScopeAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scope audits where roleName = &#63; from the database.
	 *
	 * @param roleName the role name
	 */
	@Override
	public void removeByRoleNameScope(String roleName) {
		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				findByRoleNameScope(
					roleName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(edcPermissionScopeAudit);
		}
	}

	/**
	 * Returns the number of edc permission scope audits where roleName = &#63;.
	 *
	 * @param roleName the role name
	 * @return the number of matching edc permission scope audits
	 */
	@Override
	public int countByRoleNameScope(String roleName) {
		roleName = Objects.toString(roleName, "");

		FinderPath finderPath = _finderPathCountByRoleNameScope;

		Object[] finderArgs = new Object[] {roleName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE);

			boolean bindRoleName = false;

			if (roleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_3);
			}
			else {
				bindRoleName = true;

				sb.append(_FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_2 =
		"edcPermissionScopeAudit.roleName = ?";

	private static final String _FINDER_COLUMN_ROLENAMESCOPE_ROLENAME_3 =
		"(edcPermissionScopeAudit.roleName IS NULL OR edcPermissionScopeAudit.roleName = '')";

	private FinderPath _finderPathWithPaginationFindByModuleTaskScope;
	private FinderPath _finderPathWithoutPaginationFindByModuleTaskScope;
	private FinderPath _finderPathCountByModuleTaskScope;

	/**
	 * Returns all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey) {

		return findByModuleTaskScope(
			moduleName, taskKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end) {

		return findByModuleTaskScope(moduleName, taskKey, start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return findByModuleTaskScope(
			moduleName, taskKey, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findByModuleTaskScope(
		String moduleName, String taskKey, int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
		boolean useFinderCache) {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByModuleTaskScope;
				finderArgs = new Object[] {moduleName, taskKey};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByModuleTaskScope;
			finderArgs = new Object[] {
				moduleName, taskKey, start, end, orderByComparator
			};
		}

		List<EdcPermissionScopeAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScopeAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EdcPermissionScopeAudit edcPermissionScopeAudit : list) {
					if (!moduleName.equals(
							edcPermissionScopeAudit.getModuleName()) ||
						!taskKey.equals(edcPermissionScopeAudit.getTaskKey())) {

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

			sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindModuleName) {
					queryPos.add(moduleName);
				}

				if (bindTaskKey) {
					queryPos.add(taskKey);
				}

				list = (List<EdcPermissionScopeAudit>)QueryUtil.list(
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
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByModuleTaskScope_First(
			String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit =
			fetchByModuleTaskScope_First(
				moduleName, taskKey, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("moduleName=");
		sb.append(moduleName);

		sb.append(", taskKey=");
		sb.append(taskKey);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the first edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByModuleTaskScope_First(
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		List<EdcPermissionScopeAudit> list = findByModuleTaskScope(
			moduleName, taskKey, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByModuleTaskScope_Last(
			String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit =
			fetchByModuleTaskScope_Last(moduleName, taskKey, orderByComparator);

		if (edcPermissionScopeAudit != null) {
			return edcPermissionScopeAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("moduleName=");
		sb.append(moduleName);

		sb.append(", taskKey=");
		sb.append(taskKey);

		sb.append("}");

		throw new NoSuchEdcPermissionScopeAuditException(sb.toString());
	}

	/**
	 * Returns the last edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edc permission scope audit, or <code>null</code> if a matching edc permission scope audit could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByModuleTaskScope_Last(
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		int count = countByModuleTaskScope(moduleName, taskKey);

		if (count == 0) {
			return null;
		}

		List<EdcPermissionScopeAudit> list = findByModuleTaskScope(
			moduleName, taskKey, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the edc permission scope audits before and after the current edc permission scope audit in the ordered set where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param auditScopeId the primary key of the current edc permission scope audit
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit[] findByModuleTaskScope_PrevAndNext(
			long auditScopeId, String moduleName, String taskKey,
			OrderByComparator<EdcPermissionScopeAudit> orderByComparator)
		throws NoSuchEdcPermissionScopeAuditException {

		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		EdcPermissionScopeAudit edcPermissionScopeAudit = findByPrimaryKey(
			auditScopeId);

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScopeAudit[] array =
				new EdcPermissionScopeAuditImpl[3];

			array[0] = getByModuleTaskScope_PrevAndNext(
				session, edcPermissionScopeAudit, moduleName, taskKey,
				orderByComparator, true);

			array[1] = edcPermissionScopeAudit;

			array[2] = getByModuleTaskScope_PrevAndNext(
				session, edcPermissionScopeAudit, moduleName, taskKey,
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

	protected EdcPermissionScopeAudit getByModuleTaskScope_PrevAndNext(
		Session session, EdcPermissionScopeAudit edcPermissionScopeAudit,
		String moduleName, String taskKey,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE);

		boolean bindModuleName = false;

		if (moduleName.isEmpty()) {
			sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_3);
		}
		else {
			bindModuleName = true;

			sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_2);
		}

		boolean bindTaskKey = false;

		if (taskKey.isEmpty()) {
			sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_3);
		}
		else {
			bindTaskKey = true;

			sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_2);
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
			sb.append(EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindModuleName) {
			queryPos.add(moduleName);
		}

		if (bindTaskKey) {
			queryPos.add(taskKey);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						edcPermissionScopeAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EdcPermissionScopeAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the edc permission scope audits where moduleName = &#63; and taskKey = &#63; from the database.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 */
	@Override
	public void removeByModuleTaskScope(String moduleName, String taskKey) {
		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				findByModuleTaskScope(
					moduleName, taskKey, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(edcPermissionScopeAudit);
		}
	}

	/**
	 * Returns the number of edc permission scope audits where moduleName = &#63; and taskKey = &#63;.
	 *
	 * @param moduleName the module name
	 * @param taskKey the task key
	 * @return the number of matching edc permission scope audits
	 */
	@Override
	public int countByModuleTaskScope(String moduleName, String taskKey) {
		moduleName = Objects.toString(moduleName, "");
		taskKey = Objects.toString(taskKey, "");

		FinderPath finderPath = _finderPathCountByModuleTaskScope;

		Object[] finderArgs = new Object[] {moduleName, taskKey};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE);

			boolean bindModuleName = false;

			if (moduleName.isEmpty()) {
				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_3);
			}
			else {
				bindModuleName = true;

				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_2);
			}

			boolean bindTaskKey = false;

			if (taskKey.isEmpty()) {
				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_3);
			}
			else {
				bindTaskKey = true;

				sb.append(_FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_2 =
		"edcPermissionScopeAudit.moduleName = ? AND ";

	private static final String _FINDER_COLUMN_MODULETASKSCOPE_MODULENAME_3 =
		"(edcPermissionScopeAudit.moduleName IS NULL OR edcPermissionScopeAudit.moduleName = '') AND ";

	private static final String _FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_2 =
		"edcPermissionScopeAudit.taskKey = ?";

	private static final String _FINDER_COLUMN_MODULETASKSCOPE_TASKKEY_3 =
		"(edcPermissionScopeAudit.taskKey IS NULL OR edcPermissionScopeAudit.taskKey = '')";

	public EdcPermissionScopeAuditPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EdcPermissionScopeAudit.class);

		setModelImplClass(EdcPermissionScopeAuditImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the edc permission scope audit in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudit the edc permission scope audit
	 */
	@Override
	public void cacheResult(EdcPermissionScopeAudit edcPermissionScopeAudit) {
		entityCache.putResult(
			entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
			edcPermissionScopeAudit.getPrimaryKey(), edcPermissionScopeAudit);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				edcPermissionScopeAudit.getUuid(),
				edcPermissionScopeAudit.getGroupId()
			},
			edcPermissionScopeAudit);

		edcPermissionScopeAudit.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the edc permission scope audits in the entity cache if it is enabled.
	 *
	 * @param edcPermissionScopeAudits the edc permission scope audits
	 */
	@Override
	public void cacheResult(
		List<EdcPermissionScopeAudit> edcPermissionScopeAudits) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (edcPermissionScopeAudits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				edcPermissionScopeAudits) {

			if (entityCache.getResult(
					entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
					edcPermissionScopeAudit.getPrimaryKey()) == null) {

				cacheResult(edcPermissionScopeAudit);
			}
			else {
				edcPermissionScopeAudit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all edc permission scope audits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EdcPermissionScopeAuditImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the edc permission scope audit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EdcPermissionScopeAudit edcPermissionScopeAudit) {
		entityCache.removeResult(
			entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
			edcPermissionScopeAudit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(EdcPermissionScopeAuditModelImpl)edcPermissionScopeAudit, true);
	}

	@Override
	public void clearCache(
		List<EdcPermissionScopeAudit> edcPermissionScopeAudits) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EdcPermissionScopeAudit edcPermissionScopeAudit :
				edcPermissionScopeAudits) {

			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
				edcPermissionScopeAudit.getPrimaryKey());

			clearUniqueFindersCache(
				(EdcPermissionScopeAuditModelImpl)edcPermissionScopeAudit,
				true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EdcPermissionScopeAuditModelImpl edcPermissionScopeAuditModelImpl) {

		Object[] args = new Object[] {
			edcPermissionScopeAuditModelImpl.getUuid(),
			edcPermissionScopeAuditModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, edcPermissionScopeAuditModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(
		EdcPermissionScopeAuditModelImpl edcPermissionScopeAuditModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				edcPermissionScopeAuditModelImpl.getUuid(),
				edcPermissionScopeAuditModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((edcPermissionScopeAuditModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				edcPermissionScopeAuditModelImpl.getOriginalUuid(),
				edcPermissionScopeAuditModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new edc permission scope audit with the primary key. Does not add the edc permission scope audit to the database.
	 *
	 * @param auditScopeId the primary key for the new edc permission scope audit
	 * @return the new edc permission scope audit
	 */
	@Override
	public EdcPermissionScopeAudit create(long auditScopeId) {
		EdcPermissionScopeAudit edcPermissionScopeAudit =
			new EdcPermissionScopeAuditImpl();

		edcPermissionScopeAudit.setNew(true);
		edcPermissionScopeAudit.setPrimaryKey(auditScopeId);

		String uuid = PortalUUIDUtil.generate();

		edcPermissionScopeAudit.setUuid(uuid);

		edcPermissionScopeAudit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return edcPermissionScopeAudit;
	}

	/**
	 * Removes the edc permission scope audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit remove(long auditScopeId)
		throws NoSuchEdcPermissionScopeAuditException {

		return remove((Serializable)auditScopeId);
	}

	/**
	 * Removes the edc permission scope audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the edc permission scope audit
	 * @return the edc permission scope audit that was removed
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit remove(Serializable primaryKey)
		throws NoSuchEdcPermissionScopeAuditException {

		Session session = null;

		try {
			session = openSession();

			EdcPermissionScopeAudit edcPermissionScopeAudit =
				(EdcPermissionScopeAudit)session.get(
					EdcPermissionScopeAuditImpl.class, primaryKey);

			if (edcPermissionScopeAudit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEdcPermissionScopeAuditException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(edcPermissionScopeAudit);
		}
		catch (NoSuchEdcPermissionScopeAuditException noSuchEntityException) {
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
	protected EdcPermissionScopeAudit removeImpl(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(edcPermissionScopeAudit)) {
				edcPermissionScopeAudit = (EdcPermissionScopeAudit)session.get(
					EdcPermissionScopeAuditImpl.class,
					edcPermissionScopeAudit.getPrimaryKeyObj());
			}

			if (edcPermissionScopeAudit != null) {
				session.delete(edcPermissionScopeAudit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (edcPermissionScopeAudit != null) {
			clearCache(edcPermissionScopeAudit);
		}

		return edcPermissionScopeAudit;
	}

	@Override
	public EdcPermissionScopeAudit updateImpl(
		EdcPermissionScopeAudit edcPermissionScopeAudit) {

		boolean isNew = edcPermissionScopeAudit.isNew();

		if (!(edcPermissionScopeAudit instanceof
				EdcPermissionScopeAuditModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(edcPermissionScopeAudit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					edcPermissionScopeAudit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in edcPermissionScopeAudit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EdcPermissionScopeAudit implementation " +
					edcPermissionScopeAudit.getClass());
		}

		EdcPermissionScopeAuditModelImpl edcPermissionScopeAuditModelImpl =
			(EdcPermissionScopeAuditModelImpl)edcPermissionScopeAudit;

		if (Validator.isNull(edcPermissionScopeAudit.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			edcPermissionScopeAudit.setUuid(uuid);
		}

		if (isNew && (edcPermissionScopeAudit.getCreateDate() == null)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				edcPermissionScopeAudit.setCreateDate(date);
			}
			else {
				edcPermissionScopeAudit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(edcPermissionScopeAudit);

				edcPermissionScopeAudit.setNew(false);
			}
			else {
				edcPermissionScopeAudit =
					(EdcPermissionScopeAudit)session.merge(
						edcPermissionScopeAudit);
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
				edcPermissionScopeAuditModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				edcPermissionScopeAuditModelImpl.getUuid(),
				edcPermissionScopeAuditModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				edcPermissionScopeAuditModelImpl.getRoleName()
			};

			finderCache.removeResult(_finderPathCountByRoleNameScope, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByRoleNameScope, args);

			args = new Object[] {
				edcPermissionScopeAuditModelImpl.getModuleName(),
				edcPermissionScopeAuditModelImpl.getTaskKey()
			};

			finderCache.removeResult(_finderPathCountByModuleTaskScope, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByModuleTaskScope, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((edcPermissionScopeAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionScopeAuditModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {
					edcPermissionScopeAuditModelImpl.getUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((edcPermissionScopeAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					edcPermissionScopeAuditModelImpl.getOriginalUuid(),
					edcPermissionScopeAuditModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					edcPermissionScopeAuditModelImpl.getUuid(),
					edcPermissionScopeAuditModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((edcPermissionScopeAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByRoleNameScope.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionScopeAuditModelImpl.getOriginalRoleName()
				};

				finderCache.removeResult(_finderPathCountByRoleNameScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRoleNameScope, args);

				args = new Object[] {
					edcPermissionScopeAuditModelImpl.getRoleName()
				};

				finderCache.removeResult(_finderPathCountByRoleNameScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRoleNameScope, args);
			}

			if ((edcPermissionScopeAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByModuleTaskScope.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					edcPermissionScopeAuditModelImpl.getOriginalModuleName(),
					edcPermissionScopeAuditModelImpl.getOriginalTaskKey()
				};

				finderCache.removeResult(
					_finderPathCountByModuleTaskScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByModuleTaskScope, args);

				args = new Object[] {
					edcPermissionScopeAuditModelImpl.getModuleName(),
					edcPermissionScopeAuditModelImpl.getTaskKey()
				};

				finderCache.removeResult(
					_finderPathCountByModuleTaskScope, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByModuleTaskScope, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, EdcPermissionScopeAuditImpl.class,
			edcPermissionScopeAudit.getPrimaryKey(), edcPermissionScopeAudit,
			false);

		clearUniqueFindersCache(edcPermissionScopeAuditModelImpl, false);
		cacheUniqueFindersCache(edcPermissionScopeAuditModelImpl);

		edcPermissionScopeAudit.resetOriginalValues();

		return edcPermissionScopeAudit;
	}

	/**
	 * Returns the edc permission scope audit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the edc permission scope audit
	 * @return the edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEdcPermissionScopeAuditException {

		EdcPermissionScopeAudit edcPermissionScopeAudit = fetchByPrimaryKey(
			primaryKey);

		if (edcPermissionScopeAudit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEdcPermissionScopeAuditException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return edcPermissionScopeAudit;
	}

	/**
	 * Returns the edc permission scope audit with the primary key or throws a <code>NoSuchEdcPermissionScopeAuditException</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit
	 * @throws NoSuchEdcPermissionScopeAuditException if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit findByPrimaryKey(long auditScopeId)
		throws NoSuchEdcPermissionScopeAuditException {

		return findByPrimaryKey((Serializable)auditScopeId);
	}

	/**
	 * Returns the edc permission scope audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditScopeId the primary key of the edc permission scope audit
	 * @return the edc permission scope audit, or <code>null</code> if a edc permission scope audit with the primary key could not be found
	 */
	@Override
	public EdcPermissionScopeAudit fetchByPrimaryKey(long auditScopeId) {
		return fetchByPrimaryKey((Serializable)auditScopeId);
	}

	/**
	 * Returns all the edc permission scope audits.
	 *
	 * @return the edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @return the range of edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the edc permission scope audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EdcPermissionScopeAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of edc permission scope audits
	 * @param end the upper bound of the range of edc permission scope audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of edc permission scope audits
	 */
	@Override
	public List<EdcPermissionScopeAudit> findAll(
		int start, int end,
		OrderByComparator<EdcPermissionScopeAudit> orderByComparator,
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

		List<EdcPermissionScopeAudit> list = null;

		if (useFinderCache) {
			list = (List<EdcPermissionScopeAudit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EDCPERMISSIONSCOPEAUDIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EDCPERMISSIONSCOPEAUDIT;

				sql = sql.concat(
					EdcPermissionScopeAuditModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EdcPermissionScopeAudit>)QueryUtil.list(
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
	 * Removes all the edc permission scope audits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EdcPermissionScopeAudit edcPermissionScopeAudit : findAll()) {
			remove(edcPermissionScopeAudit);
		}
	}

	/**
	 * Returns the number of edc permission scope audits.
	 *
	 * @return the number of edc permission scope audits
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
					_SQL_COUNT_EDCPERMISSIONSCOPEAUDIT);

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
		return "auditScopeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EDCPERMISSIONSCOPEAUDIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EdcPermissionScopeAuditModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the edc permission scope audit persistence.
	 */
	@Activate
	public void activate() {
		EdcPermissionScopeAuditModelImpl.setEntityCacheEnabled(
			entityCacheEnabled);
		EdcPermissionScopeAuditModelImpl.setFinderCacheEnabled(
			finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			EdcPermissionScopeAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionScopeAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			EdcPermissionScopeAuditModelImpl.UUID_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.COMPANYID_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByRoleNameScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRoleNameScope",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByRoleNameScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRoleNameScope",
			new String[] {String.class.getName()},
			EdcPermissionScopeAuditModelImpl.ROLENAME_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByRoleNameScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRoleNameScope",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByModuleTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByModuleTaskScope",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByModuleTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			EdcPermissionScopeAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByModuleTaskScope",
			new String[] {String.class.getName(), String.class.getName()},
			EdcPermissionScopeAuditModelImpl.MODULENAME_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.TASKKEY_COLUMN_BITMASK |
			EdcPermissionScopeAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByModuleTaskScope = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByModuleTaskScope",
			new String[] {String.class.getName(), String.class.getName()});

		_setEdcPermissionScopeAuditUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEdcPermissionScopeAuditUtilPersistence(null);

		entityCache.removeCache(EdcPermissionScopeAuditImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setEdcPermissionScopeAuditUtilPersistence(
		EdcPermissionScopeAuditPersistence edcPermissionScopeAuditPersistence) {

		try {
			Field field = EdcPermissionScopeAuditUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, edcPermissionScopeAuditPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.EdcPermissionScopeAudit"),
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

	private static final String _SQL_SELECT_EDCPERMISSIONSCOPEAUDIT =
		"SELECT edcPermissionScopeAudit FROM EdcPermissionScopeAudit edcPermissionScopeAudit";

	private static final String _SQL_SELECT_EDCPERMISSIONSCOPEAUDIT_WHERE =
		"SELECT edcPermissionScopeAudit FROM EdcPermissionScopeAudit edcPermissionScopeAudit WHERE ";

	private static final String _SQL_COUNT_EDCPERMISSIONSCOPEAUDIT =
		"SELECT COUNT(edcPermissionScopeAudit) FROM EdcPermissionScopeAudit edcPermissionScopeAudit";

	private static final String _SQL_COUNT_EDCPERMISSIONSCOPEAUDIT_WHERE =
		"SELECT COUNT(edcPermissionScopeAudit) FROM EdcPermissionScopeAudit edcPermissionScopeAudit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"edcPermissionScopeAudit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EdcPermissionScopeAudit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EdcPermissionScopeAudit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EdcPermissionScopeAuditPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
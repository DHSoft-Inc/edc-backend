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

import com.dhsoft.edc.backend.exception.NoSuchAssignAuditException;
import com.dhsoft.edc.backend.model.AssignAudit;
import com.dhsoft.edc.backend.model.impl.AssignAuditImpl;
import com.dhsoft.edc.backend.model.impl.AssignAuditModelImpl;
import com.dhsoft.edc.backend.service.persistence.AssignAuditPersistence;
import com.dhsoft.edc.backend.service.persistence.AssignAuditUtil;
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
 * The persistence implementation for the assign audit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssignAuditPersistence.class)
public class AssignAuditPersistenceImpl
	extends BasePersistenceImpl<AssignAudit> implements AssignAuditPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssignAuditUtil</code> to access the assign audit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssignAuditImpl.class.getName();

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
	 * Returns all the assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
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

		List<AssignAudit> list = null;

		if (useFinderCache) {
			list = (List<AssignAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignAudit assignAudit : list) {
					if (!uuid.equals(assignAudit.getUuid())) {
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

			sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
				sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignAudit>)QueryUtil.list(
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
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByUuid_First(
			String uuid, OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByUuid_First(uuid, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByUuid_First(
		String uuid, OrderByComparator<AssignAudit> orderByComparator) {

		List<AssignAudit> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByUuid_Last(
			String uuid, OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByUuid_Last(uuid, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByUuid_Last(
		String uuid, OrderByComparator<AssignAudit> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AssignAudit> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit[] findByUuid_PrevAndNext(
			long auditId, String uuid,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		uuid = Objects.toString(uuid, "");

		AssignAudit assignAudit = findByPrimaryKey(auditId);

		Session session = null;

		try {
			session = openSession();

			AssignAudit[] array = new AssignAuditImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, assignAudit, uuid, orderByComparator, true);

			array[1] = assignAudit;

			array[2] = getByUuid_PrevAndNext(
				session, assignAudit, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssignAudit getByUuid_PrevAndNext(
		Session session, AssignAudit assignAudit, String uuid,
		OrderByComparator<AssignAudit> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
			sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(assignAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign audits where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AssignAudit assignAudit :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(assignAudit);
		}
	}

	/**
	 * Returns the number of assign audits where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assign audits
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSIGNAUDIT_WHERE);

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
		"assignAudit.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(assignAudit.uuid IS NULL OR assignAudit.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
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

		List<AssignAudit> list = null;

		if (useFinderCache) {
			list = (List<AssignAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignAudit assignAudit : list) {
					if (!uuid.equals(assignAudit.getUuid()) ||
						(companyId != assignAudit.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
				sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
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

				list = (List<AssignAudit>)QueryUtil.list(
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
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the first assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AssignAudit> orderByComparator) {

		List<AssignAudit> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the last assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AssignAudit> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AssignAudit> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit[] findByUuid_C_PrevAndNext(
			long auditId, String uuid, long companyId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		uuid = Objects.toString(uuid, "");

		AssignAudit assignAudit = findByPrimaryKey(auditId);

		Session session = null;

		try {
			session = openSession();

			AssignAudit[] array = new AssignAuditImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, assignAudit, uuid, companyId, orderByComparator, true);

			array[1] = assignAudit;

			array[2] = getByUuid_C_PrevAndNext(
				session, assignAudit, uuid, companyId, orderByComparator,
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

	protected AssignAudit getByUuid_C_PrevAndNext(
		Session session, AssignAudit assignAudit, String uuid, long companyId,
		OrderByComparator<AssignAudit> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
			sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(assignAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign audits where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AssignAudit assignAudit :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assignAudit);
		}
	}

	/**
	 * Returns the number of assign audits where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assign audits
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNAUDIT_WHERE);

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
		"assignAudit.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(assignAudit.uuid IS NULL OR assignAudit.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"assignAudit.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitution;
	private FinderPath _finderPathWithoutPaginationFindByInstitution;
	private FinderPath _finderPathCountByInstitution;

	/**
	 * Returns all the assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitution(long institutionId) {
		return findByInstitution(
			institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitution(
		long institutionId, int start, int end) {

		return findByInstitution(institutionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return findByInstitution(
			institutionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitution(
		long institutionId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
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

		List<AssignAudit> list = null;

		if (useFinderCache) {
			list = (List<AssignAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignAudit assignAudit : list) {
					if (institutionId != assignAudit.getInstitutionId()) {
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

			sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTION_INSTITUTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				list = (List<AssignAudit>)QueryUtil.list(
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
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByInstitution_First(
			long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByInstitution_First(
			institutionId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByInstitution_First(
		long institutionId, OrderByComparator<AssignAudit> orderByComparator) {

		List<AssignAudit> list = findByInstitution(
			institutionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByInstitution_Last(
			long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByInstitution_Last(
			institutionId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByInstitution_Last(
		long institutionId, OrderByComparator<AssignAudit> orderByComparator) {

		int count = countByInstitution(institutionId);

		if (count == 0) {
			return null;
		}

		List<AssignAudit> list = findByInstitution(
			institutionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit[] findByInstitution_PrevAndNext(
			long auditId, long institutionId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = findByPrimaryKey(auditId);

		Session session = null;

		try {
			session = openSession();

			AssignAudit[] array = new AssignAuditImpl[3];

			array[0] = getByInstitution_PrevAndNext(
				session, assignAudit, institutionId, orderByComparator, true);

			array[1] = assignAudit;

			array[2] = getByInstitution_PrevAndNext(
				session, assignAudit, institutionId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssignAudit getByInstitution_PrevAndNext(
		Session session, AssignAudit assignAudit, long institutionId,
		OrderByComparator<AssignAudit> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
			sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(assignAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign audits where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	@Override
	public void removeByInstitution(long institutionId) {
		for (AssignAudit assignAudit :
				findByInstitution(
					institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assignAudit);
		}
	}

	/**
	 * Returns the number of assign audits where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching assign audits
	 */
	@Override
	public int countByInstitution(long institutionId) {
		FinderPath finderPath = _finderPathCountByInstitution;

		Object[] finderArgs = new Object[] {institutionId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSIGNAUDIT_WHERE);

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
		"assignAudit.institutionId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitutionProject;
	private FinderPath _finderPathWithoutPaginationFindByInstitutionProject;
	private FinderPath _finderPathCountByInstitutionProject;

	/**
	 * Returns all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId) {

		return findByInstitutionProject(
			institutionId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end) {

		return findByInstitutionProject(
			institutionId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator) {

		return findByInstitutionProject(
			institutionId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assign audits
	 */
	@Override
	public List<AssignAudit> findByInstitutionProject(
		long institutionId, long projectId, int start, int end,
		OrderByComparator<AssignAudit> orderByComparator,
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

		List<AssignAudit> list = null;

		if (useFinderCache) {
			list = (List<AssignAudit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssignAudit assignAudit : list) {
					if ((institutionId != assignAudit.getInstitutionId()) ||
						(projectId != assignAudit.getProjectId())) {

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

			sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_INSTITUTIONID_2);

			sb.append(_FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				queryPos.add(projectId);

				list = (List<AssignAudit>)QueryUtil.list(
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
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByInstitutionProject_First(
			long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByInstitutionProject_First(
			institutionId, projectId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the first assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByInstitutionProject_First(
		long institutionId, long projectId,
		OrderByComparator<AssignAudit> orderByComparator) {

		List<AssignAudit> list = findByInstitutionProject(
			institutionId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit
	 * @throws NoSuchAssignAuditException if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit findByInstitutionProject_Last(
			long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByInstitutionProject_Last(
			institutionId, projectId, orderByComparator);

		if (assignAudit != null) {
			return assignAudit;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchAssignAuditException(sb.toString());
	}

	/**
	 * Returns the last assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assign audit, or <code>null</code> if a matching assign audit could not be found
	 */
	@Override
	public AssignAudit fetchByInstitutionProject_Last(
		long institutionId, long projectId,
		OrderByComparator<AssignAudit> orderByComparator) {

		int count = countByInstitutionProject(institutionId, projectId);

		if (count == 0) {
			return null;
		}

		List<AssignAudit> list = findByInstitutionProject(
			institutionId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assign audits before and after the current assign audit in the ordered set where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param auditId the primary key of the current assign audit
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit[] findByInstitutionProject_PrevAndNext(
			long auditId, long institutionId, long projectId,
			OrderByComparator<AssignAudit> orderByComparator)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = findByPrimaryKey(auditId);

		Session session = null;

		try {
			session = openSession();

			AssignAudit[] array = new AssignAuditImpl[3];

			array[0] = getByInstitutionProject_PrevAndNext(
				session, assignAudit, institutionId, projectId,
				orderByComparator, true);

			array[1] = assignAudit;

			array[2] = getByInstitutionProject_PrevAndNext(
				session, assignAudit, institutionId, projectId,
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

	protected AssignAudit getByInstitutionProject_PrevAndNext(
		Session session, AssignAudit assignAudit, long institutionId,
		long projectId, OrderByComparator<AssignAudit> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSIGNAUDIT_WHERE);

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
			sb.append(AssignAuditModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(assignAudit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssignAudit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assign audits where institutionId = &#63; and projectId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByInstitutionProject(long institutionId, long projectId) {
		for (AssignAudit assignAudit :
				findByInstitutionProject(
					institutionId, projectId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(assignAudit);
		}
	}

	/**
	 * Returns the number of assign audits where institutionId = &#63; and projectId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param projectId the project ID
	 * @return the number of matching assign audits
	 */
	@Override
	public int countByInstitutionProject(long institutionId, long projectId) {
		FinderPath finderPath = _finderPathCountByInstitutionProject;

		Object[] finderArgs = new Object[] {institutionId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ASSIGNAUDIT_WHERE);

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
			"assignAudit.institutionId = ? AND ";

	private static final String _FINDER_COLUMN_INSTITUTIONPROJECT_PROJECTID_2 =
		"assignAudit.projectId = ?";

	public AssignAuditPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AssignAudit.class);

		setModelImplClass(AssignAuditImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the assign audit in the entity cache if it is enabled.
	 *
	 * @param assignAudit the assign audit
	 */
	@Override
	public void cacheResult(AssignAudit assignAudit) {
		entityCache.putResult(
			entityCacheEnabled, AssignAuditImpl.class,
			assignAudit.getPrimaryKey(), assignAudit);

		assignAudit.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assign audits in the entity cache if it is enabled.
	 *
	 * @param assignAudits the assign audits
	 */
	@Override
	public void cacheResult(List<AssignAudit> assignAudits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assignAudits.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssignAudit assignAudit : assignAudits) {
			if (entityCache.getResult(
					entityCacheEnabled, AssignAuditImpl.class,
					assignAudit.getPrimaryKey()) == null) {

				cacheResult(assignAudit);
			}
			else {
				assignAudit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assign audits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssignAuditImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assign audit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssignAudit assignAudit) {
		entityCache.removeResult(
			entityCacheEnabled, AssignAuditImpl.class,
			assignAudit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssignAudit> assignAudits) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssignAudit assignAudit : assignAudits) {
			entityCache.removeResult(
				entityCacheEnabled, AssignAuditImpl.class,
				assignAudit.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, AssignAuditImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new assign audit with the primary key. Does not add the assign audit to the database.
	 *
	 * @param auditId the primary key for the new assign audit
	 * @return the new assign audit
	 */
	@Override
	public AssignAudit create(long auditId) {
		AssignAudit assignAudit = new AssignAuditImpl();

		assignAudit.setNew(true);
		assignAudit.setPrimaryKey(auditId);

		String uuid = PortalUUIDUtil.generate();

		assignAudit.setUuid(uuid);

		assignAudit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return assignAudit;
	}

	/**
	 * Removes the assign audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit that was removed
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit remove(long auditId) throws NoSuchAssignAuditException {
		return remove((Serializable)auditId);
	}

	/**
	 * Removes the assign audit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assign audit
	 * @return the assign audit that was removed
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit remove(Serializable primaryKey)
		throws NoSuchAssignAuditException {

		Session session = null;

		try {
			session = openSession();

			AssignAudit assignAudit = (AssignAudit)session.get(
				AssignAuditImpl.class, primaryKey);

			if (assignAudit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssignAuditException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assignAudit);
		}
		catch (NoSuchAssignAuditException noSuchEntityException) {
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
	protected AssignAudit removeImpl(AssignAudit assignAudit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assignAudit)) {
				assignAudit = (AssignAudit)session.get(
					AssignAuditImpl.class, assignAudit.getPrimaryKeyObj());
			}

			if (assignAudit != null) {
				session.delete(assignAudit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assignAudit != null) {
			clearCache(assignAudit);
		}

		return assignAudit;
	}

	@Override
	public AssignAudit updateImpl(AssignAudit assignAudit) {
		boolean isNew = assignAudit.isNew();

		if (!(assignAudit instanceof AssignAuditModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(assignAudit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(assignAudit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assignAudit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssignAudit implementation " +
					assignAudit.getClass());
		}

		AssignAuditModelImpl assignAuditModelImpl =
			(AssignAuditModelImpl)assignAudit;

		if (Validator.isNull(assignAudit.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			assignAudit.setUuid(uuid);
		}

		if (isNew && (assignAudit.getCreateDate() == null)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				assignAudit.setCreateDate(date);
			}
			else {
				assignAudit.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assignAudit);

				assignAudit.setNew(false);
			}
			else {
				assignAudit = (AssignAudit)session.merge(assignAudit);
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
			Object[] args = new Object[] {assignAuditModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				assignAuditModelImpl.getUuid(),
				assignAuditModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {assignAuditModelImpl.getInstitutionId()};

			finderCache.removeResult(_finderPathCountByInstitution, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitution, args);

			args = new Object[] {
				assignAuditModelImpl.getInstitutionId(),
				assignAuditModelImpl.getProjectId()
			};

			finderCache.removeResult(
				_finderPathCountByInstitutionProject, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitutionProject, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((assignAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignAuditModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {assignAuditModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((assignAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					assignAuditModelImpl.getOriginalUuid(),
					assignAuditModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					assignAuditModelImpl.getUuid(),
					assignAuditModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((assignAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitution.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignAuditModelImpl.getOriginalInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitution, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitution, args);

				args = new Object[] {assignAuditModelImpl.getInstitutionId()};

				finderCache.removeResult(_finderPathCountByInstitution, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitution, args);
			}

			if ((assignAuditModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitutionProject.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					assignAuditModelImpl.getOriginalInstitutionId(),
					assignAuditModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionProject, args);

				args = new Object[] {
					assignAuditModelImpl.getInstitutionId(),
					assignAuditModelImpl.getProjectId()
				};

				finderCache.removeResult(
					_finderPathCountByInstitutionProject, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionProject, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, AssignAuditImpl.class,
			assignAudit.getPrimaryKey(), assignAudit, false);

		assignAudit.resetOriginalValues();

		return assignAudit;
	}

	/**
	 * Returns the assign audit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assign audit
	 * @return the assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssignAuditException {

		AssignAudit assignAudit = fetchByPrimaryKey(primaryKey);

		if (assignAudit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssignAuditException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assignAudit;
	}

	/**
	 * Returns the assign audit with the primary key or throws a <code>NoSuchAssignAuditException</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit
	 * @throws NoSuchAssignAuditException if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit findByPrimaryKey(long auditId)
		throws NoSuchAssignAuditException {

		return findByPrimaryKey((Serializable)auditId);
	}

	/**
	 * Returns the assign audit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auditId the primary key of the assign audit
	 * @return the assign audit, or <code>null</code> if a assign audit with the primary key could not be found
	 */
	@Override
	public AssignAudit fetchByPrimaryKey(long auditId) {
		return fetchByPrimaryKey((Serializable)auditId);
	}

	/**
	 * Returns all the assign audits.
	 *
	 * @return the assign audits
	 */
	@Override
	public List<AssignAudit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @return the range of assign audits
	 */
	@Override
	public List<AssignAudit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assign audits
	 */
	@Override
	public List<AssignAudit> findAll(
		int start, int end, OrderByComparator<AssignAudit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assign audits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssignAuditModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assign audits
	 * @param end the upper bound of the range of assign audits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assign audits
	 */
	@Override
	public List<AssignAudit> findAll(
		int start, int end, OrderByComparator<AssignAudit> orderByComparator,
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

		List<AssignAudit> list = null;

		if (useFinderCache) {
			list = (List<AssignAudit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSIGNAUDIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSIGNAUDIT;

				sql = sql.concat(AssignAuditModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AssignAudit>)QueryUtil.list(
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
	 * Removes all the assign audits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssignAudit assignAudit : findAll()) {
			remove(assignAudit);
		}
	}

	/**
	 * Returns the number of assign audits.
	 *
	 * @return the number of assign audits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ASSIGNAUDIT);

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
		return "auditId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSIGNAUDIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssignAuditModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assign audit persistence.
	 */
	@Activate
	public void activate() {
		AssignAuditModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		AssignAuditModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			AssignAuditModelImpl.UUID_COLUMN_BITMASK |
			AssignAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			AssignAuditModelImpl.UUID_COLUMN_BITMASK |
			AssignAuditModelImpl.COMPANYID_COLUMN_BITMASK |
			AssignAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitution",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstitution",
			new String[] {Long.class.getName()},
			AssignAuditModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByInstitution = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstitution",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionProject",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AssignAuditImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInstitutionProject",
			new String[] {Long.class.getName(), Long.class.getName()},
			AssignAuditModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			AssignAuditModelImpl.PROJECTID_COLUMN_BITMASK |
			AssignAuditModelImpl.CREATEDATE_COLUMN_BITMASK);

		_finderPathCountByInstitutionProject = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInstitutionProject",
			new String[] {Long.class.getName(), Long.class.getName()});

		_setAssignAuditUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAssignAuditUtilPersistence(null);

		entityCache.removeCache(AssignAuditImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setAssignAuditUtilPersistence(
		AssignAuditPersistence assignAuditPersistence) {

		try {
			Field field = AssignAuditUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, assignAuditPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.AssignAudit"),
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

	private static final String _SQL_SELECT_ASSIGNAUDIT =
		"SELECT assignAudit FROM AssignAudit assignAudit";

	private static final String _SQL_SELECT_ASSIGNAUDIT_WHERE =
		"SELECT assignAudit FROM AssignAudit assignAudit WHERE ";

	private static final String _SQL_COUNT_ASSIGNAUDIT =
		"SELECT COUNT(assignAudit) FROM AssignAudit assignAudit";

	private static final String _SQL_COUNT_ASSIGNAUDIT_WHERE =
		"SELECT COUNT(assignAudit) FROM AssignAudit assignAudit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "assignAudit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssignAudit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssignAudit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssignAuditPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
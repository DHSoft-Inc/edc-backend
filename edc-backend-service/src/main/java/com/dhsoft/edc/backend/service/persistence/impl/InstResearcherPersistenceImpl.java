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

import com.dhsoft.edc.backend.exception.NoSuchInstResearcherException;
import com.dhsoft.edc.backend.model.InstResearcher;
import com.dhsoft.edc.backend.model.impl.InstResearcherImpl;
import com.dhsoft.edc.backend.model.impl.InstResearcherModelImpl;
import com.dhsoft.edc.backend.service.persistence.InstResearcherPersistence;
import com.dhsoft.edc.backend.service.persistence.InstResearcherUtil;
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
 * The persistence implementation for the inst researcher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = InstResearcherPersistence.class)
public class InstResearcherPersistenceImpl
	extends BasePersistenceImpl<InstResearcher>
	implements InstResearcherPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>InstResearcherUtil</code> to access the inst researcher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		InstResearcherImpl.class.getName();

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
	 * Returns all the inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (!uuid.equals(instResearcher.getUuid())) {
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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUuid_First(
			String uuid, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUuid_First(
			uuid, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUuid_First(
		String uuid, OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUuid_Last(
			String uuid, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUuid_Last(
			uuid, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUuid_Last(
		String uuid, OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByUuid_PrevAndNext(
			long institutionResearcherId, String uuid,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		uuid = Objects.toString(uuid, "");

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, instResearcher, uuid, orderByComparator, true);

			array[1] = instResearcher;

			array[2] = getByUuid_PrevAndNext(
				session, instResearcher, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected InstResearcher getByUuid_PrevAndNext(
		Session session, InstResearcher instResearcher, String uuid,
		OrderByComparator<InstResearcher> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (InstResearcher instResearcher :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(instResearcher.uuid IS NULL OR instResearcher.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUUID_G(String uuid, long groupId)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUUID_G(uuid, groupId);

		if (instResearcher == null) {
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

			throw new NoSuchInstResearcherException(sb.toString());
		}

		return instResearcher;
	}

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the inst researcher where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUUID_G(
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

		if (result instanceof InstResearcher) {
			InstResearcher instResearcher = (InstResearcher)result;

			if (!Objects.equals(uuid, instResearcher.getUuid()) ||
				(groupId != instResearcher.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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

				List<InstResearcher> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					InstResearcher instResearcher = list.get(0);

					result = instResearcher;

					cacheResult(instResearcher);
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
			return (InstResearcher)result;
		}
	}

	/**
	 * Removes the inst researcher where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the inst researcher that was removed
	 */
	@Override
	public InstResearcher removeByUUID_G(String uuid, long groupId)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByUUID_G(uuid, groupId);

		return remove(instResearcher);
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(instResearcher.uuid IS NULL OR instResearcher.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"instResearcher.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (!uuid.equals(instResearcher.getUuid()) ||
						(companyId != instResearcher.getCompanyId())) {

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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByUuid_C_PrevAndNext(
			long institutionResearcherId, String uuid, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		uuid = Objects.toString(uuid, "");

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, instResearcher, uuid, companyId, orderByComparator,
				true);

			array[1] = instResearcher;

			array[2] = getByUuid_C_PrevAndNext(
				session, instResearcher, uuid, companyId, orderByComparator,
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

	protected InstResearcher getByUuid_C_PrevAndNext(
		Session session, InstResearcher instResearcher, String uuid,
		long companyId, OrderByComparator<InstResearcher> orderByComparator,
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

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (InstResearcher instResearcher :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(instResearcher.uuid IS NULL OR instResearcher.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"instResearcher.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if ((groupId != instResearcher.getGroupId()) ||
						(projectId != instResearcher.getProjectId())) {

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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByG_P_PrevAndNext(
			long institutionResearcherId, long groupId, long projectId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, instResearcher, groupId, projectId, orderByComparator,
				true);

			array[1] = instResearcher;

			array[2] = getByG_P_PrevAndNext(
				session, instResearcher, groupId, projectId, orderByComparator,
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

	protected InstResearcher getByG_P_PrevAndNext(
		Session session, InstResearcher instResearcher, long groupId,
		long projectId, OrderByComparator<InstResearcher> orderByComparator,
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

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (InstResearcher instResearcher :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"instResearcher.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByCompanyId(
		long companyId, int start, int end) {

		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (companyId != instResearcher.getCompanyId()) {
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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByCompanyId_First(
			long companyId, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByCompanyId_First(
		long companyId, OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByCompanyId_Last(
			long companyId, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByCompanyId_Last(
		long companyId, OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where companyId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByCompanyId_PrevAndNext(
			long institutionResearcherId, long companyId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, instResearcher, companyId, orderByComparator, true);

			array[1] = instResearcher;

			array[2] = getByCompanyId_PrevAndNext(
				session, instResearcher, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected InstResearcher getByCompanyId_PrevAndNext(
		Session session, InstResearcher instResearcher, long companyId,
		OrderByComparator<InstResearcher> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (InstResearcher instResearcher :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByUserId(
		long userId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (userId != instResearcher.getUserId()) {
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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUserId_First(
			long userId, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUserId_First(
			userId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUserId_First(
		long userId, OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByUserId(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByUserId_Last(
			long userId, OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByUserId_Last(
			userId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByUserId_Last(
		long userId, OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where userId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByUserId_PrevAndNext(
			long institutionResearcherId, long userId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, instResearcher, userId, orderByComparator, true);

			array[1] = instResearcher;

			array[2] = getByUserId_PrevAndNext(
				session, instResearcher, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected InstResearcher getByUserId_PrevAndNext(
		Session session, InstResearcher instResearcher, long userId,
		OrderByComparator<InstResearcher> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (InstResearcher instResearcher :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

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
		"instResearcher.userId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitutionId;
	private FinderPath _finderPathWithoutPaginationFindByInstitutionId;
	private FinderPath _finderPathCountByInstitutionId;

	/**
	 * Returns all the inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByInstitutionId(long institutionId) {
		return findByInstitutionId(
			institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end) {

		return findByInstitutionId(institutionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByInstitutionId(
			institutionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByInstitutionId;
				finderArgs = new Object[] {institutionId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByInstitutionId;
			finderArgs = new Object[] {
				institutionId, start, end, orderByComparator
			};
		}

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (institutionId != instResearcher.getInstitutionId()) {
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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByInstitutionId_First(
			long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByInstitutionId_First(
			institutionId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByInstitutionId_First(
		long institutionId,
		OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByInstitutionId(
			institutionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByInstitutionId_Last(
			long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByInstitutionId_Last(
			institutionId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByInstitutionId_Last(
		long institutionId,
		OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByInstitutionId(institutionId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByInstitutionId(
			institutionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByInstitutionId_PrevAndNext(
			long institutionResearcherId, long institutionId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByInstitutionId_PrevAndNext(
				session, instResearcher, institutionId, orderByComparator,
				true);

			array[1] = instResearcher;

			array[2] = getByInstitutionId_PrevAndNext(
				session, instResearcher, institutionId, orderByComparator,
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

	protected InstResearcher getByInstitutionId_PrevAndNext(
		Session session, InstResearcher instResearcher, long institutionId,
		OrderByComparator<InstResearcher> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

		sb.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
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
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	@Override
	public void removeByInstitutionId(long institutionId) {
		for (InstResearcher instResearcher :
				findByInstitutionId(
					institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByInstitutionId(long institutionId) {
		FinderPath finderPath = _finderPathCountByInstitutionId;

		Object[] finderArgs = new Object[] {institutionId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

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

	private static final String _FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2 =
		"instResearcher.institutionId = ?";

	private FinderPath _finderPathWithPaginationFindByResearcherId;
	private FinderPath _finderPathWithoutPaginationFindByResearcherId;
	private FinderPath _finderPathCountByResearcherId;

	/**
	 * Returns all the inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByResearcherId(long researcherId) {
		return findByResearcherId(
			researcherId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end) {

		return findByResearcherId(researcherId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findByResearcherId(
			researcherId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers where researcherId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param researcherId the researcher ID
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inst researchers
	 */
	@Override
	public List<InstResearcher> findByResearcherId(
		long researcherId, int start, int end,
		OrderByComparator<InstResearcher> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByResearcherId;
				finderArgs = new Object[] {researcherId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByResearcherId;
			finderArgs = new Object[] {
				researcherId, start, end, orderByComparator
			};
		}

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (InstResearcher instResearcher : list) {
					if (researcherId != instResearcher.getResearcherId()) {
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

			sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_RESEARCHERID_RESEARCHERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(researcherId);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByResearcherId_First(
			long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByResearcherId_First(
			researcherId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("researcherId=");
		sb.append(researcherId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the first inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByResearcherId_First(
		long researcherId,
		OrderByComparator<InstResearcher> orderByComparator) {

		List<InstResearcher> list = findByResearcherId(
			researcherId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher
	 * @throws NoSuchInstResearcherException if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher findByResearcherId_Last(
			long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByResearcherId_Last(
			researcherId, orderByComparator);

		if (instResearcher != null) {
			return instResearcher;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("researcherId=");
		sb.append(researcherId);

		sb.append("}");

		throw new NoSuchInstResearcherException(sb.toString());
	}

	/**
	 * Returns the last inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inst researcher, or <code>null</code> if a matching inst researcher could not be found
	 */
	@Override
	public InstResearcher fetchByResearcherId_Last(
		long researcherId,
		OrderByComparator<InstResearcher> orderByComparator) {

		int count = countByResearcherId(researcherId);

		if (count == 0) {
			return null;
		}

		List<InstResearcher> list = findByResearcherId(
			researcherId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the inst researchers before and after the current inst researcher in the ordered set where researcherId = &#63;.
	 *
	 * @param institutionResearcherId the primary key of the current inst researcher
	 * @param researcherId the researcher ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher[] findByResearcherId_PrevAndNext(
			long institutionResearcherId, long researcherId,
			OrderByComparator<InstResearcher> orderByComparator)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = findByPrimaryKey(
			institutionResearcherId);

		Session session = null;

		try {
			session = openSession();

			InstResearcher[] array = new InstResearcherImpl[3];

			array[0] = getByResearcherId_PrevAndNext(
				session, instResearcher, researcherId, orderByComparator, true);

			array[1] = instResearcher;

			array[2] = getByResearcherId_PrevAndNext(
				session, instResearcher, researcherId, orderByComparator,
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

	protected InstResearcher getByResearcherId_PrevAndNext(
		Session session, InstResearcher instResearcher, long researcherId,
		OrderByComparator<InstResearcher> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_INSTRESEARCHER_WHERE);

		sb.append(_FINDER_COLUMN_RESEARCHERID_RESEARCHERID_2);

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
			sb.append(InstResearcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(researcherId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						instResearcher)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<InstResearcher> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the inst researchers where researcherId = &#63; from the database.
	 *
	 * @param researcherId the researcher ID
	 */
	@Override
	public void removeByResearcherId(long researcherId) {
		for (InstResearcher instResearcher :
				findByResearcherId(
					researcherId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers where researcherId = &#63;.
	 *
	 * @param researcherId the researcher ID
	 * @return the number of matching inst researchers
	 */
	@Override
	public int countByResearcherId(long researcherId) {
		FinderPath finderPath = _finderPathCountByResearcherId;

		Object[] finderArgs = new Object[] {researcherId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_INSTRESEARCHER_WHERE);

			sb.append(_FINDER_COLUMN_RESEARCHERID_RESEARCHERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(researcherId);

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

	private static final String _FINDER_COLUMN_RESEARCHERID_RESEARCHERID_2 =
		"instResearcher.researcherId = ?";

	public InstResearcherPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(InstResearcher.class);

		setModelImplClass(InstResearcherImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the inst researcher in the entity cache if it is enabled.
	 *
	 * @param instResearcher the inst researcher
	 */
	@Override
	public void cacheResult(InstResearcher instResearcher) {
		entityCache.putResult(
			entityCacheEnabled, InstResearcherImpl.class,
			instResearcher.getPrimaryKey(), instResearcher);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				instResearcher.getUuid(), instResearcher.getGroupId()
			},
			instResearcher);

		instResearcher.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the inst researchers in the entity cache if it is enabled.
	 *
	 * @param instResearchers the inst researchers
	 */
	@Override
	public void cacheResult(List<InstResearcher> instResearchers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (instResearchers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (InstResearcher instResearcher : instResearchers) {
			if (entityCache.getResult(
					entityCacheEnabled, InstResearcherImpl.class,
					instResearcher.getPrimaryKey()) == null) {

				cacheResult(instResearcher);
			}
			else {
				instResearcher.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all inst researchers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(InstResearcherImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the inst researcher.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InstResearcher instResearcher) {
		entityCache.removeResult(
			entityCacheEnabled, InstResearcherImpl.class,
			instResearcher.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((InstResearcherModelImpl)instResearcher, true);
	}

	@Override
	public void clearCache(List<InstResearcher> instResearchers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InstResearcher instResearcher : instResearchers) {
			entityCache.removeResult(
				entityCacheEnabled, InstResearcherImpl.class,
				instResearcher.getPrimaryKey());

			clearUniqueFindersCache(
				(InstResearcherModelImpl)instResearcher, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, InstResearcherImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		InstResearcherModelImpl instResearcherModelImpl) {

		Object[] args = new Object[] {
			instResearcherModelImpl.getUuid(),
			instResearcherModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, instResearcherModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		InstResearcherModelImpl instResearcherModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				instResearcherModelImpl.getUuid(),
				instResearcherModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((instResearcherModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				instResearcherModelImpl.getOriginalUuid(),
				instResearcherModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new inst researcher with the primary key. Does not add the inst researcher to the database.
	 *
	 * @param institutionResearcherId the primary key for the new inst researcher
	 * @return the new inst researcher
	 */
	@Override
	public InstResearcher create(long institutionResearcherId) {
		InstResearcher instResearcher = new InstResearcherImpl();

		instResearcher.setNew(true);
		instResearcher.setPrimaryKey(institutionResearcherId);

		String uuid = PortalUUIDUtil.generate();

		instResearcher.setUuid(uuid);

		instResearcher.setCompanyId(CompanyThreadLocal.getCompanyId());

		return instResearcher;
	}

	/**
	 * Removes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher remove(long institutionResearcherId)
		throws NoSuchInstResearcherException {

		return remove((Serializable)institutionResearcherId);
	}

	/**
	 * Removes the inst researcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the inst researcher
	 * @return the inst researcher that was removed
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher remove(Serializable primaryKey)
		throws NoSuchInstResearcherException {

		Session session = null;

		try {
			session = openSession();

			InstResearcher instResearcher = (InstResearcher)session.get(
				InstResearcherImpl.class, primaryKey);

			if (instResearcher == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstResearcherException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(instResearcher);
		}
		catch (NoSuchInstResearcherException noSuchEntityException) {
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
	protected InstResearcher removeImpl(InstResearcher instResearcher) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(instResearcher)) {
				instResearcher = (InstResearcher)session.get(
					InstResearcherImpl.class,
					instResearcher.getPrimaryKeyObj());
			}

			if (instResearcher != null) {
				session.delete(instResearcher);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (instResearcher != null) {
			clearCache(instResearcher);
		}

		return instResearcher;
	}

	@Override
	public InstResearcher updateImpl(InstResearcher instResearcher) {
		boolean isNew = instResearcher.isNew();

		if (!(instResearcher instanceof InstResearcherModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(instResearcher.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					instResearcher);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in instResearcher proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom InstResearcher implementation " +
					instResearcher.getClass());
		}

		InstResearcherModelImpl instResearcherModelImpl =
			(InstResearcherModelImpl)instResearcher;

		if (Validator.isNull(instResearcher.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			instResearcher.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (instResearcher.getCreateDate() == null)) {
			if (serviceContext == null) {
				instResearcher.setCreateDate(date);
			}
			else {
				instResearcher.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!instResearcherModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				instResearcher.setModifiedDate(date);
			}
			else {
				instResearcher.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(instResearcher);

				instResearcher.setNew(false);
			}
			else {
				instResearcher = (InstResearcher)session.merge(instResearcher);
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
			Object[] args = new Object[] {instResearcherModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				instResearcherModelImpl.getUuid(),
				instResearcherModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				instResearcherModelImpl.getGroupId(),
				instResearcherModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {instResearcherModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {instResearcherModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			args = new Object[] {instResearcherModelImpl.getInstitutionId()};

			finderCache.removeResult(_finderPathCountByInstitutionId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitutionId, args);

			args = new Object[] {instResearcherModelImpl.getResearcherId()};

			finderCache.removeResult(_finderPathCountByResearcherId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByResearcherId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {instResearcherModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalUuid(),
					instResearcherModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					instResearcherModelImpl.getUuid(),
					instResearcherModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalGroupId(),
					instResearcherModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					instResearcherModelImpl.getGroupId(),
					instResearcherModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {instResearcherModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {instResearcherModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitutionId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitutionId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionId, args);

				args = new Object[] {
					instResearcherModelImpl.getInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitutionId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionId, args);
			}

			if ((instResearcherModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByResearcherId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					instResearcherModelImpl.getOriginalResearcherId()
				};

				finderCache.removeResult(_finderPathCountByResearcherId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResearcherId, args);

				args = new Object[] {instResearcherModelImpl.getResearcherId()};

				finderCache.removeResult(_finderPathCountByResearcherId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByResearcherId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, InstResearcherImpl.class,
			instResearcher.getPrimaryKey(), instResearcher, false);

		clearUniqueFindersCache(instResearcherModelImpl, false);
		cacheUniqueFindersCache(instResearcherModelImpl);

		instResearcher.resetOriginalValues();

		return instResearcher;
	}

	/**
	 * Returns the inst researcher with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstResearcherException {

		InstResearcher instResearcher = fetchByPrimaryKey(primaryKey);

		if (instResearcher == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstResearcherException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return instResearcher;
	}

	/**
	 * Returns the inst researcher with the primary key or throws a <code>NoSuchInstResearcherException</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher
	 * @throws NoSuchInstResearcherException if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher findByPrimaryKey(long institutionResearcherId)
		throws NoSuchInstResearcherException {

		return findByPrimaryKey((Serializable)institutionResearcherId);
	}

	/**
	 * Returns the inst researcher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param institutionResearcherId the primary key of the inst researcher
	 * @return the inst researcher, or <code>null</code> if a inst researcher with the primary key could not be found
	 */
	@Override
	public InstResearcher fetchByPrimaryKey(long institutionResearcherId) {
		return fetchByPrimaryKey((Serializable)institutionResearcherId);
	}

	/**
	 * Returns all the inst researchers.
	 *
	 * @return the inst researchers
	 */
	@Override
	public List<InstResearcher> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @return the range of inst researchers
	 */
	@Override
	public List<InstResearcher> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inst researchers
	 */
	@Override
	public List<InstResearcher> findAll(
		int start, int end,
		OrderByComparator<InstResearcher> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the inst researchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InstResearcherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inst researchers
	 * @param end the upper bound of the range of inst researchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of inst researchers
	 */
	@Override
	public List<InstResearcher> findAll(
		int start, int end, OrderByComparator<InstResearcher> orderByComparator,
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

		List<InstResearcher> list = null;

		if (useFinderCache) {
			list = (List<InstResearcher>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_INSTRESEARCHER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_INSTRESEARCHER;

				sql = sql.concat(InstResearcherModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<InstResearcher>)QueryUtil.list(
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
	 * Removes all the inst researchers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (InstResearcher instResearcher : findAll()) {
			remove(instResearcher);
		}
	}

	/**
	 * Returns the number of inst researchers.
	 *
	 * @return the number of inst researchers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_INSTRESEARCHER);

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
		return "institutionResearcherId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_INSTRESEARCHER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return InstResearcherModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the inst researcher persistence.
	 */
	@Activate
	public void activate() {
		InstResearcherModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		InstResearcherModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			InstResearcherModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			InstResearcherModelImpl.UUID_COLUMN_BITMASK |
			InstResearcherModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			InstResearcherModelImpl.UUID_COLUMN_BITMASK |
			InstResearcherModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			InstResearcherModelImpl.GROUPID_COLUMN_BITMASK |
			InstResearcherModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			InstResearcherModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			InstResearcherModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstitutionId",
			new String[] {Long.class.getName()},
			InstResearcherModelImpl.INSTITUTIONID_COLUMN_BITMASK);

		_finderPathCountByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstitutionId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByResearcherId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByResearcherId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByResearcherId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, InstResearcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResearcherId",
			new String[] {Long.class.getName()},
			InstResearcherModelImpl.RESEARCHERID_COLUMN_BITMASK);

		_finderPathCountByResearcherId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByResearcherId",
			new String[] {Long.class.getName()});

		_setInstResearcherUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setInstResearcherUtilPersistence(null);

		entityCache.removeCache(InstResearcherImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setInstResearcherUtilPersistence(
		InstResearcherPersistence instResearcherPersistence) {

		try {
			Field field = InstResearcherUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, instResearcherPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.InstResearcher"),
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

	private static final String _SQL_SELECT_INSTRESEARCHER =
		"SELECT instResearcher FROM InstResearcher instResearcher";

	private static final String _SQL_SELECT_INSTRESEARCHER_WHERE =
		"SELECT instResearcher FROM InstResearcher instResearcher WHERE ";

	private static final String _SQL_COUNT_INSTRESEARCHER =
		"SELECT COUNT(instResearcher) FROM InstResearcher instResearcher";

	private static final String _SQL_COUNT_INSTRESEARCHER_WHERE =
		"SELECT COUNT(instResearcher) FROM InstResearcher instResearcher WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "instResearcher.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No InstResearcher exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No InstResearcher exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		InstResearcherPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
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

import com.dhsoft.edc.backend.exception.NoSuchMetaGroupException;
import com.dhsoft.edc.backend.model.MetaGroup;
import com.dhsoft.edc.backend.model.impl.MetaGroupImpl;
import com.dhsoft.edc.backend.model.impl.MetaGroupModelImpl;
import com.dhsoft.edc.backend.service.persistence.MetaGroupPersistence;
import com.dhsoft.edc.backend.service.persistence.MetaGroupUtil;
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
 * The persistence implementation for the meta group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MetaGroupPersistence.class)
public class MetaGroupPersistenceImpl
	extends BasePersistenceImpl<MetaGroup> implements MetaGroupPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MetaGroupUtil</code> to access the meta group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MetaGroupImpl.class.getName();

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
	 * Returns all the meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if (!uuid.equals(metaGroup.getUuid())) {
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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
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

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUuid_First(
			String uuid, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUuid_First(uuid, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUuid_First(
		String uuid, OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUuid_Last(
			String uuid, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUuid_Last(uuid, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUuid_Last(
		String uuid, OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByUuid_PrevAndNext(
			long metaGroupId, String uuid,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		uuid = Objects.toString(uuid, "");

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, metaGroup, uuid, orderByComparator, true);

			array[1] = metaGroup;

			array[2] = getByUuid_PrevAndNext(
				session, metaGroup, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MetaGroup getByUuid_PrevAndNext(
		Session session, MetaGroup metaGroup, String uuid,
		OrderByComparator<MetaGroup> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MetaGroup metaGroup :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(metaGroup.uuid IS NULL OR metaGroup.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUUID_G(uuid, groupId);

		if (metaGroup == null) {
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

			throw new NoSuchMetaGroupException(sb.toString());
		}

		return metaGroup;
	}

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the meta group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUUID_G(
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

		if (result instanceof MetaGroup) {
			MetaGroup metaGroup = (MetaGroup)result;

			if (!Objects.equals(uuid, metaGroup.getUuid()) ||
				(groupId != metaGroup.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

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

				List<MetaGroup> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MetaGroup metaGroup = list.get(0);

					result = metaGroup;

					cacheResult(metaGroup);
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
			return (MetaGroup)result;
		}
	}

	/**
	 * Removes the meta group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meta group that was removed
	 */
	@Override
	public MetaGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = findByUUID_G(uuid, groupId);

		return remove(metaGroup);
	}

	/**
	 * Returns the number of meta groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(metaGroup.uuid IS NULL OR metaGroup.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"metaGroup.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if (!uuid.equals(metaGroup.getUuid()) ||
						(companyId != metaGroup.getCompanyId())) {

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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
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

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByUuid_C_PrevAndNext(
			long metaGroupId, String uuid, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		uuid = Objects.toString(uuid, "");

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, metaGroup, uuid, companyId, orderByComparator, true);

			array[1] = metaGroup;

			array[2] = getByUuid_C_PrevAndNext(
				session, metaGroup, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MetaGroup getByUuid_C_PrevAndNext(
		Session session, MetaGroup metaGroup, String uuid, long companyId,
		OrderByComparator<MetaGroup> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MetaGroup metaGroup :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(metaGroup.uuid IS NULL OR metaGroup.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"metaGroup.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if ((groupId != metaGroup.getGroupId()) ||
						(projectId != metaGroup.getProjectId())) {

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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByG_P_PrevAndNext(
			long metaGroupId, long groupId, long projectId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, metaGroup, groupId, projectId, orderByComparator,
				true);

			array[1] = metaGroup;

			array[2] = getByG_P_PrevAndNext(
				session, metaGroup, groupId, projectId, orderByComparator,
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

	protected MetaGroup getByG_P_PrevAndNext(
		Session session, MetaGroup metaGroup, long groupId, long projectId,
		OrderByComparator<MetaGroup> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (MetaGroup metaGroup :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"metaGroup.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P_G;
	private FinderPath _finderPathWithoutPaginationFindByG_P_G;
	private FinderPath _finderPathCountByG_P_G;

	/**
	 * Returns all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode) {

		return findByG_P_G(
			groupId, projectId, groupCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end) {

		return findByG_P_G(groupId, projectId, groupCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByG_P_G(
			groupId, projectId, groupCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByG_P_G(
		long groupId, long projectId, String groupCode, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
		boolean useFinderCache) {

		groupCode = Objects.toString(groupCode, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_P_G;
				finderArgs = new Object[] {groupId, projectId, groupCode};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_P_G;
			finderArgs = new Object[] {
				groupId, projectId, groupCode, start, end, orderByComparator
			};
		}

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if ((groupId != metaGroup.getGroupId()) ||
						(projectId != metaGroup.getProjectId()) ||
						!groupCode.equals(metaGroup.getGroupCode())) {

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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

			sb.append(_FINDER_COLUMN_G_P_G_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_G_PROJECTID_2);

			boolean bindGroupCode = false;

			if (groupCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_3);
			}
			else {
				bindGroupCode = true;

				sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindGroupCode) {
					queryPos.add(groupCode);
				}

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByG_P_G_First(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByG_P_G_First(
			groupId, projectId, groupCode, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", groupCode=");
		sb.append(groupCode);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByG_P_G_First(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByG_P_G(
			groupId, projectId, groupCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByG_P_G_Last(
			long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByG_P_G_Last(
			groupId, projectId, groupCode, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", groupCode=");
		sb.append(groupCode);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByG_P_G_Last(
		long groupId, long projectId, String groupCode,
		OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByG_P_G(groupId, projectId, groupCode);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByG_P_G(
			groupId, projectId, groupCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByG_P_G_PrevAndNext(
			long metaGroupId, long groupId, long projectId, String groupCode,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		groupCode = Objects.toString(groupCode, "");

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByG_P_G_PrevAndNext(
				session, metaGroup, groupId, projectId, groupCode,
				orderByComparator, true);

			array[1] = metaGroup;

			array[2] = getByG_P_G_PrevAndNext(
				session, metaGroup, groupId, projectId, groupCode,
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

	protected MetaGroup getByG_P_G_PrevAndNext(
		Session session, MetaGroup metaGroup, long groupId, long projectId,
		String groupCode, OrderByComparator<MetaGroup> orderByComparator,
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

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

		sb.append(_FINDER_COLUMN_G_P_G_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_P_G_PROJECTID_2);

		boolean bindGroupCode = false;

		if (groupCode.isEmpty()) {
			sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_3);
		}
		else {
			bindGroupCode = true;

			sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_2);
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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(projectId);

		if (bindGroupCode) {
			queryPos.add(groupCode);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 */
	@Override
	public void removeByG_P_G(long groupId, long projectId, String groupCode) {
		for (MetaGroup metaGroup :
				findByG_P_G(
					groupId, projectId, groupCode, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where groupId = &#63; and projectId = &#63; and groupCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param groupCode the group code
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByG_P_G(long groupId, long projectId, String groupCode) {
		groupCode = Objects.toString(groupCode, "");

		FinderPath finderPath = _finderPathCountByG_P_G;

		Object[] finderArgs = new Object[] {groupId, projectId, groupCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

			sb.append(_FINDER_COLUMN_G_P_G_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_G_PROJECTID_2);

			boolean bindGroupCode = false;

			if (groupCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_3);
			}
			else {
				bindGroupCode = true;

				sb.append(_FINDER_COLUMN_G_P_G_GROUPCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindGroupCode) {
					queryPos.add(groupCode);
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

	private static final String _FINDER_COLUMN_G_P_G_GROUPID_2 =
		"metaGroup.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_G_PROJECTID_2 =
		"metaGroup.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_G_GROUPCODE_2 =
		"metaGroup.groupCode = ?";

	private static final String _FINDER_COLUMN_G_P_G_GROUPCODE_3 =
		"(metaGroup.groupCode IS NULL OR metaGroup.groupCode = '')";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if (companyId != metaGroup.getCompanyId()) {
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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByCompanyId_First(
			long companyId, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByCompanyId_First(
		long companyId, OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByCompanyId_Last(
			long companyId, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByCompanyId_Last(
		long companyId, OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where companyId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByCompanyId_PrevAndNext(
			long metaGroupId, long companyId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, metaGroup, companyId, orderByComparator, true);

			array[1] = metaGroup;

			array[2] = getByCompanyId_PrevAndNext(
				session, metaGroup, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MetaGroup getByCompanyId_PrevAndNext(
		Session session, MetaGroup metaGroup, long companyId,
		OrderByComparator<MetaGroup> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (MetaGroup metaGroup :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meta groups
	 */
	@Override
	public List<MetaGroup> findByUserId(
		long userId, int start, int end,
		OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MetaGroup metaGroup : list) {
					if (userId != metaGroup.getUserId()) {
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

			sb.append(_SQL_SELECT_METAGROUP_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUserId_First(
			long userId, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUserId_First(userId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the first meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUserId_First(
		long userId, OrderByComparator<MetaGroup> orderByComparator) {

		List<MetaGroup> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group
	 * @throws NoSuchMetaGroupException if a matching meta group could not be found
	 */
	@Override
	public MetaGroup findByUserId_Last(
			long userId, OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByUserId_Last(userId, orderByComparator);

		if (metaGroup != null) {
			return metaGroup;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMetaGroupException(sb.toString());
	}

	/**
	 * Returns the last meta group in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meta group, or <code>null</code> if a matching meta group could not be found
	 */
	@Override
	public MetaGroup fetchByUserId_Last(
		long userId, OrderByComparator<MetaGroup> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<MetaGroup> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meta groups before and after the current meta group in the ordered set where userId = &#63;.
	 *
	 * @param metaGroupId the primary key of the current meta group
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup[] findByUserId_PrevAndNext(
			long metaGroupId, long userId,
			OrderByComparator<MetaGroup> orderByComparator)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = findByPrimaryKey(metaGroupId);

		Session session = null;

		try {
			session = openSession();

			MetaGroup[] array = new MetaGroupImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, metaGroup, userId, orderByComparator, true);

			array[1] = metaGroup;

			array[2] = getByUserId_PrevAndNext(
				session, metaGroup, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MetaGroup getByUserId_PrevAndNext(
		Session session, MetaGroup metaGroup, long userId,
		OrderByComparator<MetaGroup> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_METAGROUP_WHERE);

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
			sb.append(MetaGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(metaGroup)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MetaGroup> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meta groups where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (MetaGroup metaGroup :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching meta groups
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_METAGROUP_WHERE);

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
		"metaGroup.userId = ?";

	public MetaGroupPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("type", "type_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MetaGroup.class);

		setModelImplClass(MetaGroupImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the meta group in the entity cache if it is enabled.
	 *
	 * @param metaGroup the meta group
	 */
	@Override
	public void cacheResult(MetaGroup metaGroup) {
		entityCache.putResult(
			entityCacheEnabled, MetaGroupImpl.class, metaGroup.getPrimaryKey(),
			metaGroup);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {metaGroup.getUuid(), metaGroup.getGroupId()},
			metaGroup);

		metaGroup.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the meta groups in the entity cache if it is enabled.
	 *
	 * @param metaGroups the meta groups
	 */
	@Override
	public void cacheResult(List<MetaGroup> metaGroups) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (metaGroups.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MetaGroup metaGroup : metaGroups) {
			if (entityCache.getResult(
					entityCacheEnabled, MetaGroupImpl.class,
					metaGroup.getPrimaryKey()) == null) {

				cacheResult(metaGroup);
			}
			else {
				metaGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all meta groups.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MetaGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the meta group.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MetaGroup metaGroup) {
		entityCache.removeResult(
			entityCacheEnabled, MetaGroupImpl.class, metaGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((MetaGroupModelImpl)metaGroup, true);
	}

	@Override
	public void clearCache(List<MetaGroup> metaGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MetaGroup metaGroup : metaGroups) {
			entityCache.removeResult(
				entityCacheEnabled, MetaGroupImpl.class,
				metaGroup.getPrimaryKey());

			clearUniqueFindersCache((MetaGroupModelImpl)metaGroup, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, MetaGroupImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MetaGroupModelImpl metaGroupModelImpl) {

		Object[] args = new Object[] {
			metaGroupModelImpl.getUuid(), metaGroupModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, metaGroupModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		MetaGroupModelImpl metaGroupModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				metaGroupModelImpl.getUuid(), metaGroupModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((metaGroupModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				metaGroupModelImpl.getOriginalUuid(),
				metaGroupModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new meta group with the primary key. Does not add the meta group to the database.
	 *
	 * @param metaGroupId the primary key for the new meta group
	 * @return the new meta group
	 */
	@Override
	public MetaGroup create(long metaGroupId) {
		MetaGroup metaGroup = new MetaGroupImpl();

		metaGroup.setNew(true);
		metaGroup.setPrimaryKey(metaGroupId);

		String uuid = PortalUUIDUtil.generate();

		metaGroup.setUuid(uuid);

		metaGroup.setCompanyId(CompanyThreadLocal.getCompanyId());

		return metaGroup;
	}

	/**
	 * Removes the meta group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group that was removed
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup remove(long metaGroupId) throws NoSuchMetaGroupException {
		return remove((Serializable)metaGroupId);
	}

	/**
	 * Removes the meta group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the meta group
	 * @return the meta group that was removed
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup remove(Serializable primaryKey)
		throws NoSuchMetaGroupException {

		Session session = null;

		try {
			session = openSession();

			MetaGroup metaGroup = (MetaGroup)session.get(
				MetaGroupImpl.class, primaryKey);

			if (metaGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMetaGroupException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(metaGroup);
		}
		catch (NoSuchMetaGroupException noSuchEntityException) {
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
	protected MetaGroup removeImpl(MetaGroup metaGroup) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(metaGroup)) {
				metaGroup = (MetaGroup)session.get(
					MetaGroupImpl.class, metaGroup.getPrimaryKeyObj());
			}

			if (metaGroup != null) {
				session.delete(metaGroup);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (metaGroup != null) {
			clearCache(metaGroup);
		}

		return metaGroup;
	}

	@Override
	public MetaGroup updateImpl(MetaGroup metaGroup) {
		boolean isNew = metaGroup.isNew();

		if (!(metaGroup instanceof MetaGroupModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(metaGroup.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(metaGroup);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in metaGroup proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MetaGroup implementation " +
					metaGroup.getClass());
		}

		MetaGroupModelImpl metaGroupModelImpl = (MetaGroupModelImpl)metaGroup;

		if (Validator.isNull(metaGroup.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			metaGroup.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (metaGroup.getCreateDate() == null)) {
			if (serviceContext == null) {
				metaGroup.setCreateDate(date);
			}
			else {
				metaGroup.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!metaGroupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				metaGroup.setModifiedDate(date);
			}
			else {
				metaGroup.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(metaGroup);

				metaGroup.setNew(false);
			}
			else {
				metaGroup = (MetaGroup)session.merge(metaGroup);
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
			Object[] args = new Object[] {metaGroupModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				metaGroupModelImpl.getUuid(), metaGroupModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				metaGroupModelImpl.getGroupId(),
				metaGroupModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {
				metaGroupModelImpl.getGroupId(),
				metaGroupModelImpl.getProjectId(),
				metaGroupModelImpl.getGroupCode()
			};

			finderCache.removeResult(_finderPathCountByG_P_G, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P_G, args);

			args = new Object[] {metaGroupModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {metaGroupModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {metaGroupModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalUuid(),
					metaGroupModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					metaGroupModelImpl.getUuid(),
					metaGroupModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalGroupId(),
					metaGroupModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					metaGroupModelImpl.getGroupId(),
					metaGroupModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P_G.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalGroupId(),
					metaGroupModelImpl.getOriginalProjectId(),
					metaGroupModelImpl.getOriginalGroupCode()
				};

				finderCache.removeResult(_finderPathCountByG_P_G, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_G, args);

				args = new Object[] {
					metaGroupModelImpl.getGroupId(),
					metaGroupModelImpl.getProjectId(),
					metaGroupModelImpl.getGroupCode()
				};

				finderCache.removeResult(_finderPathCountByG_P_G, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_G, args);
			}

			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {metaGroupModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((metaGroupModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					metaGroupModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {metaGroupModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, MetaGroupImpl.class, metaGroup.getPrimaryKey(),
			metaGroup, false);

		clearUniqueFindersCache(metaGroupModelImpl, false);
		cacheUniqueFindersCache(metaGroupModelImpl);

		metaGroup.resetOriginalValues();

		return metaGroup;
	}

	/**
	 * Returns the meta group with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the meta group
	 * @return the meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMetaGroupException {

		MetaGroup metaGroup = fetchByPrimaryKey(primaryKey);

		if (metaGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMetaGroupException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return metaGroup;
	}

	/**
	 * Returns the meta group with the primary key or throws a <code>NoSuchMetaGroupException</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group
	 * @throws NoSuchMetaGroupException if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup findByPrimaryKey(long metaGroupId)
		throws NoSuchMetaGroupException {

		return findByPrimaryKey((Serializable)metaGroupId);
	}

	/**
	 * Returns the meta group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param metaGroupId the primary key of the meta group
	 * @return the meta group, or <code>null</code> if a meta group with the primary key could not be found
	 */
	@Override
	public MetaGroup fetchByPrimaryKey(long metaGroupId) {
		return fetchByPrimaryKey((Serializable)metaGroupId);
	}

	/**
	 * Returns all the meta groups.
	 *
	 * @return the meta groups
	 */
	@Override
	public List<MetaGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @return the range of meta groups
	 */
	@Override
	public List<MetaGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meta groups
	 */
	@Override
	public List<MetaGroup> findAll(
		int start, int end, OrderByComparator<MetaGroup> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meta groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MetaGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meta groups
	 * @param end the upper bound of the range of meta groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meta groups
	 */
	@Override
	public List<MetaGroup> findAll(
		int start, int end, OrderByComparator<MetaGroup> orderByComparator,
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

		List<MetaGroup> list = null;

		if (useFinderCache) {
			list = (List<MetaGroup>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_METAGROUP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_METAGROUP;

				sql = sql.concat(MetaGroupModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MetaGroup>)QueryUtil.list(
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
	 * Removes all the meta groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MetaGroup metaGroup : findAll()) {
			remove(metaGroup);
		}
	}

	/**
	 * Returns the number of meta groups.
	 *
	 * @return the number of meta groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_METAGROUP);

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
		return "metaGroupId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_METAGROUP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MetaGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the meta group persistence.
	 */
	@Activate
	public void activate() {
		MetaGroupModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		MetaGroupModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			MetaGroupModelImpl.UUID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			MetaGroupModelImpl.UUID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			MetaGroupModelImpl.UUID_COLUMN_BITMASK |
			MetaGroupModelImpl.COMPANYID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			MetaGroupModelImpl.GROUPID_COLUMN_BITMASK |
			MetaGroupModelImpl.PROJECTID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByG_P_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			MetaGroupModelImpl.GROUPID_COLUMN_BITMASK |
			MetaGroupModelImpl.PROJECTID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByG_P_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			MetaGroupModelImpl.COMPANYID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, MetaGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			MetaGroupModelImpl.USERID_COLUMN_BITMASK |
			MetaGroupModelImpl.GROUPCODE_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_setMetaGroupUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setMetaGroupUtilPersistence(null);

		entityCache.removeCache(MetaGroupImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setMetaGroupUtilPersistence(
		MetaGroupPersistence metaGroupPersistence) {

		try {
			Field field = MetaGroupUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, metaGroupPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.MetaGroup"),
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

	private static final String _SQL_SELECT_METAGROUP =
		"SELECT metaGroup FROM MetaGroup metaGroup";

	private static final String _SQL_SELECT_METAGROUP_WHERE =
		"SELECT metaGroup FROM MetaGroup metaGroup WHERE ";

	private static final String _SQL_COUNT_METAGROUP =
		"SELECT COUNT(metaGroup) FROM MetaGroup metaGroup";

	private static final String _SQL_COUNT_METAGROUP_WHERE =
		"SELECT COUNT(metaGroup) FROM MetaGroup metaGroup WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "metaGroup.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MetaGroup exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MetaGroup exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MetaGroupPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "type", "active"});

}
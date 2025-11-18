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

import com.dhsoft.edc.backend.exception.NoSuchSubjectVisitDefinitionException;
import com.dhsoft.edc.backend.model.SubjectVisitDefinition;
import com.dhsoft.edc.backend.model.impl.SubjectVisitDefinitionImpl;
import com.dhsoft.edc.backend.model.impl.SubjectVisitDefinitionModelImpl;
import com.dhsoft.edc.backend.service.persistence.SubjectVisitDefinitionPersistence;
import com.dhsoft.edc.backend.service.persistence.SubjectVisitDefinitionUtil;
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
 * The persistence implementation for the subject visit definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SubjectVisitDefinitionPersistence.class)
public class SubjectVisitDefinitionPersistenceImpl
	extends BasePersistenceImpl<SubjectVisitDefinition>
	implements SubjectVisitDefinitionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SubjectVisitDefinitionUtil</code> to access the subject visit definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SubjectVisitDefinitionImpl.class.getName();

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
	 * Returns all the subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (!uuid.equals(subjectVisitDefinition.getUuid())) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUuid_First(
			String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUuid_First(
			uuid, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUuid_First(
		String uuid,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUuid_Last(
			String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUuid_Last(
			uuid, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUuid_Last(
		String uuid,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where uuid = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByUuid_PrevAndNext(
			long subjectVisitDefinitionId, String uuid,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		uuid = Objects.toString(uuid, "");

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, subjectVisitDefinition, uuid, orderByComparator, true);

			array[1] = subjectVisitDefinition;

			array[2] = getByUuid_PrevAndNext(
				session, subjectVisitDefinition, uuid, orderByComparator,
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

	protected SubjectVisitDefinition getByUuid_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		String uuid,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(subjectVisitDefinition.uuid IS NULL OR subjectVisitDefinition.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUUID_G(
			uuid, groupId);

		if (subjectVisitDefinition == null) {
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

			throw new NoSuchSubjectVisitDefinitionException(sb.toString());
		}

		return subjectVisitDefinition;
	}

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the subject visit definition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUUID_G(
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

		if (result instanceof SubjectVisitDefinition) {
			SubjectVisitDefinition subjectVisitDefinition =
				(SubjectVisitDefinition)result;

			if (!Objects.equals(uuid, subjectVisitDefinition.getUuid()) ||
				(groupId != subjectVisitDefinition.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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

				List<SubjectVisitDefinition> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SubjectVisitDefinition subjectVisitDefinition = list.get(0);

					result = subjectVisitDefinition;

					cacheResult(subjectVisitDefinition);
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
			return (SubjectVisitDefinition)result;
		}
	}

	/**
	 * Removes the subject visit definition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subject visit definition that was removed
	 */
	@Override
	public SubjectVisitDefinition removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByUUID_G(
			uuid, groupId);

		return remove(subjectVisitDefinition);
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(subjectVisitDefinition.uuid IS NULL OR subjectVisitDefinition.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"subjectVisitDefinition.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (!uuid.equals(subjectVisitDefinition.getUuid()) ||
						(companyId != subjectVisitDefinition.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByUuid_C_PrevAndNext(
			long subjectVisitDefinitionId, String uuid, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		uuid = Objects.toString(uuid, "");

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, subjectVisitDefinition, uuid, companyId,
				orderByComparator, true);

			array[1] = subjectVisitDefinition;

			array[2] = getByUuid_C_PrevAndNext(
				session, subjectVisitDefinition, uuid, companyId,
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

	protected SubjectVisitDefinition getByUuid_C_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		String uuid, long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(subjectVisitDefinition.uuid IS NULL OR subjectVisitDefinition.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"subjectVisitDefinition.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end) {

		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (companyId != subjectVisitDefinition.getCompanyId()) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByCompanyId_First(
			long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByCompanyId_First(
		long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByCompanyId_Last(
			long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByCompanyId_Last(
		long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where companyId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByCompanyId_PrevAndNext(
			long subjectVisitDefinitionId, long companyId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, subjectVisitDefinition, companyId, orderByComparator,
				true);

			array[1] = subjectVisitDefinition;

			array[2] = getByCompanyId_PrevAndNext(
				session, subjectVisitDefinition, companyId, orderByComparator,
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

	protected SubjectVisitDefinition getByCompanyId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long companyId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId) {

		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if ((groupId != subjectVisitDefinition.getGroupId()) ||
						(projectId != subjectVisitDefinition.getProjectId())) {

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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByG_P_PrevAndNext(
			long subjectVisitDefinitionId, long groupId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, subjectVisitDefinition, groupId, projectId,
				orderByComparator, true);

			array[1] = subjectVisitDefinition;

			array[2] = getByG_P_PrevAndNext(
				session, subjectVisitDefinition, groupId, projectId,
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

	protected SubjectVisitDefinition getByG_P_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long groupId, long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"subjectVisitDefinition.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByProjectId;
	private FinderPath _finderPathWithoutPaginationFindByProjectId;
	private FinderPath _finderPathCountByProjectId;

	/**
	 * Returns all the subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByProjectId(long projectId) {
		return findByProjectId(
			projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end) {

		return findByProjectId(projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByProjectId(projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (projectId != subjectVisitDefinition.getProjectId()) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByProjectId_First(
			long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByProjectId_First(
			projectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByProjectId_First(
		long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByProjectId(
			projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByProjectId_Last(
			long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByProjectId_Last(
			projectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByProjectId_Last(
		long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByProjectId(projectId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByProjectId(
			projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where projectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByProjectId_PrevAndNext(
			long subjectVisitDefinitionId, long projectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByProjectId_PrevAndNext(
				session, subjectVisitDefinition, projectId, orderByComparator,
				true);

			array[1] = subjectVisitDefinition;

			array[2] = getByProjectId_PrevAndNext(
				session, subjectVisitDefinition, projectId, orderByComparator,
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

	protected SubjectVisitDefinition getByProjectId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long projectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByProjectId(long projectId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByProjectId(
					projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByProjectId(long projectId) {
		FinderPath finderPath = _finderPathCountByProjectId;

		Object[] finderArgs = new Object[] {projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByVisitGroupId;
	private FinderPath _finderPathWithoutPaginationFindByVisitGroupId;
	private FinderPath _finderPathCountByVisitGroupId;

	/**
	 * Returns all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitGroupId(long visitGroupId) {
		return findByVisitGroupId(
			visitGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end) {

		return findByVisitGroupId(visitGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByVisitGroupId(
			visitGroupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitGroupId the visit group ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitGroupId(
		long visitGroupId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (visitGroupId !=
							subjectVisitDefinition.getVisitGroupId()) {

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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITGROUPID_VISITGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(visitGroupId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByVisitGroupId_First(
			long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition =
			fetchByVisitGroupId_First(visitGroupId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByVisitGroupId_First(
		long visitGroupId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByVisitGroupId(
			visitGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByVisitGroupId_Last(
			long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition =
			fetchByVisitGroupId_Last(visitGroupId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitGroupId=");
		sb.append(visitGroupId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByVisitGroupId_Last(
		long visitGroupId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByVisitGroupId(visitGroupId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByVisitGroupId(
			visitGroupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitGroupId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitGroupId the visit group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByVisitGroupId_PrevAndNext(
			long subjectVisitDefinitionId, long visitGroupId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByVisitGroupId_PrevAndNext(
				session, subjectVisitDefinition, visitGroupId,
				orderByComparator, true);

			array[1] = subjectVisitDefinition;

			array[2] = getByVisitGroupId_PrevAndNext(
				session, subjectVisitDefinition, visitGroupId,
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

	protected SubjectVisitDefinition getByVisitGroupId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long visitGroupId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where visitGroupId = &#63; from the database.
	 *
	 * @param visitGroupId the visit group ID
	 */
	@Override
	public void removeByVisitGroupId(long visitGroupId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByVisitGroupId(
					visitGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where visitGroupId = &#63;.
	 *
	 * @param visitGroupId the visit group ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByVisitGroupId(long visitGroupId) {
		FinderPath finderPath = _finderPathCountByVisitGroupId;

		Object[] finderArgs = new Object[] {visitGroupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.visitGroupId = ?";

	private FinderPath _finderPathWithPaginationFindBySubjectId;
	private FinderPath _finderPathWithoutPaginationFindBySubjectId;
	private FinderPath _finderPathCountBySubjectId;

	/**
	 * Returns all the subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findBySubjectId(long subjectId) {
		return findBySubjectId(
			subjectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end) {

		return findBySubjectId(subjectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findBySubjectId(subjectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where subjectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param subjectId the subject ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findBySubjectId(
		long subjectId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBySubjectId;
				finderArgs = new Object[] {subjectId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBySubjectId;
			finderArgs = new Object[] {
				subjectId, start, end, orderByComparator
			};
		}

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (subjectId != subjectVisitDefinition.getSubjectId()) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findBySubjectId_First(
			long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchBySubjectId_First(
			subjectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchBySubjectId_First(
		long subjectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findBySubjectId(
			subjectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findBySubjectId_Last(
			long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchBySubjectId_Last(
			subjectId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("subjectId=");
		sb.append(subjectId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchBySubjectId_Last(
		long subjectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countBySubjectId(subjectId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findBySubjectId(
			subjectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where subjectId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param subjectId the subject ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findBySubjectId_PrevAndNext(
			long subjectVisitDefinitionId, long subjectId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getBySubjectId_PrevAndNext(
				session, subjectVisitDefinition, subjectId, orderByComparator,
				true);

			array[1] = subjectVisitDefinition;

			array[2] = getBySubjectId_PrevAndNext(
				session, subjectVisitDefinition, subjectId, orderByComparator,
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

	protected SubjectVisitDefinition getBySubjectId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long subjectId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

		sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(subjectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where subjectId = &#63; from the database.
	 *
	 * @param subjectId the subject ID
	 */
	@Override
	public void removeBySubjectId(long subjectId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findBySubjectId(
					subjectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where subjectId = &#63;.
	 *
	 * @param subjectId the subject ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countBySubjectId(long subjectId) {
		FinderPath finderPath = _finderPathCountBySubjectId;

		Object[] finderArgs = new Object[] {subjectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(subjectId);

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

	private static final String _FINDER_COLUMN_SUBJECTID_SUBJECTID_2 =
		"subjectVisitDefinition.subjectId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end) {

		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByUserId(
		long userId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (userId != subjectVisitDefinition.getUserId()) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUserId_First(
			long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUserId_First(
			userId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUserId_First(
		long userId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByUserId(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByUserId_Last(
			long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByUserId_Last(
			userId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByUserId_Last(
		long userId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where userId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByUserId_PrevAndNext(
			long subjectVisitDefinitionId, long userId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, subjectVisitDefinition, userId, orderByComparator,
				true);

			array[1] = subjectVisitDefinition;

			array[2] = getByUserId_PrevAndNext(
				session, subjectVisitDefinition, userId, orderByComparator,
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

	protected SubjectVisitDefinition getByUserId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long userId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.userId = ?";

	private FinderPath _finderPathWithPaginationFindByVisitCRFId;
	private FinderPath _finderPathWithoutPaginationFindByVisitCRFId;
	private FinderPath _finderPathCountByVisitCRFId;

	/**
	 * Returns all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitCRFId(long visitCRFId) {
		return findByVisitCRFId(
			visitCRFId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end) {

		return findByVisitCRFId(visitCRFId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findByVisitCRFId(
			visitCRFId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions where visitCRFId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param visitCRFId the visit crf ID
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findByVisitCRFId(
		long visitCRFId, int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SubjectVisitDefinition subjectVisitDefinition : list) {
					if (visitCRFId != subjectVisitDefinition.getVisitCRFId()) {
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

			sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

			sb.append(_FINDER_COLUMN_VISITCRFID_VISITCRFID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(visitCRFId);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByVisitCRFId_First(
			long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByVisitCRFId_First(
			visitCRFId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the first subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByVisitCRFId_First(
		long visitCRFId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		List<SubjectVisitDefinition> list = findByVisitCRFId(
			visitCRFId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition findByVisitCRFId_Last(
			long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByVisitCRFId_Last(
			visitCRFId, orderByComparator);

		if (subjectVisitDefinition != null) {
			return subjectVisitDefinition;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("visitCRFId=");
		sb.append(visitCRFId);

		sb.append("}");

		throw new NoSuchSubjectVisitDefinitionException(sb.toString());
	}

	/**
	 * Returns the last subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject visit definition, or <code>null</code> if a matching subject visit definition could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByVisitCRFId_Last(
		long visitCRFId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		int count = countByVisitCRFId(visitCRFId);

		if (count == 0) {
			return null;
		}

		List<SubjectVisitDefinition> list = findByVisitCRFId(
			visitCRFId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subject visit definitions before and after the current subject visit definition in the ordered set where visitCRFId = &#63;.
	 *
	 * @param subjectVisitDefinitionId the primary key of the current subject visit definition
	 * @param visitCRFId the visit crf ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition[] findByVisitCRFId_PrevAndNext(
			long subjectVisitDefinitionId, long visitCRFId,
			OrderByComparator<SubjectVisitDefinition> orderByComparator)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = findByPrimaryKey(
			subjectVisitDefinitionId);

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition[] array = new SubjectVisitDefinitionImpl[3];

			array[0] = getByVisitCRFId_PrevAndNext(
				session, subjectVisitDefinition, visitCRFId, orderByComparator,
				true);

			array[1] = subjectVisitDefinition;

			array[2] = getByVisitCRFId_PrevAndNext(
				session, subjectVisitDefinition, visitCRFId, orderByComparator,
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

	protected SubjectVisitDefinition getByVisitCRFId_PrevAndNext(
		Session session, SubjectVisitDefinition subjectVisitDefinition,
		long visitCRFId,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION_WHERE);

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
			sb.append(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
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
						subjectVisitDefinition)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SubjectVisitDefinition> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subject visit definitions where visitCRFId = &#63; from the database.
	 *
	 * @param visitCRFId the visit crf ID
	 */
	@Override
	public void removeByVisitCRFId(long visitCRFId) {
		for (SubjectVisitDefinition subjectVisitDefinition :
				findByVisitCRFId(
					visitCRFId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions where visitCRFId = &#63;.
	 *
	 * @param visitCRFId the visit crf ID
	 * @return the number of matching subject visit definitions
	 */
	@Override
	public int countByVisitCRFId(long visitCRFId) {
		FinderPath finderPath = _finderPathCountByVisitCRFId;

		Object[] finderArgs = new Object[] {visitCRFId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTVISITDEFINITION_WHERE);

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
		"subjectVisitDefinition.visitCRFId = ?";

	public SubjectVisitDefinitionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("order", "order_");
		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SubjectVisitDefinition.class);

		setModelImplClass(SubjectVisitDefinitionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the subject visit definition in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinition the subject visit definition
	 */
	@Override
	public void cacheResult(SubjectVisitDefinition subjectVisitDefinition) {
		entityCache.putResult(
			entityCacheEnabled, SubjectVisitDefinitionImpl.class,
			subjectVisitDefinition.getPrimaryKey(), subjectVisitDefinition);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				subjectVisitDefinition.getUuid(),
				subjectVisitDefinition.getGroupId()
			},
			subjectVisitDefinition);

		subjectVisitDefinition.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the subject visit definitions in the entity cache if it is enabled.
	 *
	 * @param subjectVisitDefinitions the subject visit definitions
	 */
	@Override
	public void cacheResult(
		List<SubjectVisitDefinition> subjectVisitDefinitions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (subjectVisitDefinitions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SubjectVisitDefinition subjectVisitDefinition :
				subjectVisitDefinitions) {

			if (entityCache.getResult(
					entityCacheEnabled, SubjectVisitDefinitionImpl.class,
					subjectVisitDefinition.getPrimaryKey()) == null) {

				cacheResult(subjectVisitDefinition);
			}
			else {
				subjectVisitDefinition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all subject visit definitions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SubjectVisitDefinitionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the subject visit definition.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SubjectVisitDefinition subjectVisitDefinition) {
		entityCache.removeResult(
			entityCacheEnabled, SubjectVisitDefinitionImpl.class,
			subjectVisitDefinition.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(SubjectVisitDefinitionModelImpl)subjectVisitDefinition, true);
	}

	@Override
	public void clearCache(
		List<SubjectVisitDefinition> subjectVisitDefinitions) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SubjectVisitDefinition subjectVisitDefinition :
				subjectVisitDefinitions) {

			entityCache.removeResult(
				entityCacheEnabled, SubjectVisitDefinitionImpl.class,
				subjectVisitDefinition.getPrimaryKey());

			clearUniqueFindersCache(
				(SubjectVisitDefinitionModelImpl)subjectVisitDefinition, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, SubjectVisitDefinitionImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SubjectVisitDefinitionModelImpl subjectVisitDefinitionModelImpl) {

		Object[] args = new Object[] {
			subjectVisitDefinitionModelImpl.getUuid(),
			subjectVisitDefinitionModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, subjectVisitDefinitionModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(
		SubjectVisitDefinitionModelImpl subjectVisitDefinitionModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				subjectVisitDefinitionModelImpl.getUuid(),
				subjectVisitDefinitionModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				subjectVisitDefinitionModelImpl.getOriginalUuid(),
				subjectVisitDefinitionModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new subject visit definition with the primary key. Does not add the subject visit definition to the database.
	 *
	 * @param subjectVisitDefinitionId the primary key for the new subject visit definition
	 * @return the new subject visit definition
	 */
	@Override
	public SubjectVisitDefinition create(long subjectVisitDefinitionId) {
		SubjectVisitDefinition subjectVisitDefinition =
			new SubjectVisitDefinitionImpl();

		subjectVisitDefinition.setNew(true);
		subjectVisitDefinition.setPrimaryKey(subjectVisitDefinitionId);

		String uuid = PortalUUIDUtil.generate();

		subjectVisitDefinition.setUuid(uuid);

		subjectVisitDefinition.setCompanyId(CompanyThreadLocal.getCompanyId());

		return subjectVisitDefinition;
	}

	/**
	 * Removes the subject visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition that was removed
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition remove(long subjectVisitDefinitionId)
		throws NoSuchSubjectVisitDefinitionException {

		return remove((Serializable)subjectVisitDefinitionId);
	}

	/**
	 * Removes the subject visit definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subject visit definition
	 * @return the subject visit definition that was removed
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition remove(Serializable primaryKey)
		throws NoSuchSubjectVisitDefinitionException {

		Session session = null;

		try {
			session = openSession();

			SubjectVisitDefinition subjectVisitDefinition =
				(SubjectVisitDefinition)session.get(
					SubjectVisitDefinitionImpl.class, primaryKey);

			if (subjectVisitDefinition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubjectVisitDefinitionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(subjectVisitDefinition);
		}
		catch (NoSuchSubjectVisitDefinitionException noSuchEntityException) {
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
	protected SubjectVisitDefinition removeImpl(
		SubjectVisitDefinition subjectVisitDefinition) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subjectVisitDefinition)) {
				subjectVisitDefinition = (SubjectVisitDefinition)session.get(
					SubjectVisitDefinitionImpl.class,
					subjectVisitDefinition.getPrimaryKeyObj());
			}

			if (subjectVisitDefinition != null) {
				session.delete(subjectVisitDefinition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (subjectVisitDefinition != null) {
			clearCache(subjectVisitDefinition);
		}

		return subjectVisitDefinition;
	}

	@Override
	public SubjectVisitDefinition updateImpl(
		SubjectVisitDefinition subjectVisitDefinition) {

		boolean isNew = subjectVisitDefinition.isNew();

		if (!(subjectVisitDefinition instanceof
				SubjectVisitDefinitionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(subjectVisitDefinition.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					subjectVisitDefinition);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in subjectVisitDefinition proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SubjectVisitDefinition implementation " +
					subjectVisitDefinition.getClass());
		}

		SubjectVisitDefinitionModelImpl subjectVisitDefinitionModelImpl =
			(SubjectVisitDefinitionModelImpl)subjectVisitDefinition;

		if (Validator.isNull(subjectVisitDefinition.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			subjectVisitDefinition.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (subjectVisitDefinition.getCreateDate() == null)) {
			if (serviceContext == null) {
				subjectVisitDefinition.setCreateDate(date);
			}
			else {
				subjectVisitDefinition.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!subjectVisitDefinitionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				subjectVisitDefinition.setModifiedDate(date);
			}
			else {
				subjectVisitDefinition.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(subjectVisitDefinition);

				subjectVisitDefinition.setNew(false);
			}
			else {
				subjectVisitDefinition = (SubjectVisitDefinition)session.merge(
					subjectVisitDefinition);
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
				subjectVisitDefinitionModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getUuid(),
				subjectVisitDefinitionModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getGroupId(),
				subjectVisitDefinitionModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByProjectId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByProjectId, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getVisitGroupId()
			};

			finderCache.removeResult(_finderPathCountByVisitGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByVisitGroupId, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getSubjectId()
			};

			finderCache.removeResult(_finderPathCountBySubjectId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBySubjectId, args);

			args = new Object[] {subjectVisitDefinitionModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			args = new Object[] {
				subjectVisitDefinitionModelImpl.getVisitCRFId()
			};

			finderCache.removeResult(_finderPathCountByVisitCRFId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByVisitCRFId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {subjectVisitDefinitionModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalUuid(),
					subjectVisitDefinitionModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getUuid(),
					subjectVisitDefinitionModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalGroupId(),
					subjectVisitDefinitionModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getGroupId(),
					subjectVisitDefinitionModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByProjectId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByVisitGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByVisitGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitGroupId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getVisitGroupId()
				};

				finderCache.removeResult(_finderPathCountByVisitGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitGroupId, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBySubjectId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalSubjectId()
				};

				finderCache.removeResult(_finderPathCountBySubjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySubjectId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getSubjectId()
				};

				finderCache.removeResult(_finderPathCountBySubjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySubjectId, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}

			if ((subjectVisitDefinitionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByVisitCRFId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectVisitDefinitionModelImpl.getOriginalVisitCRFId()
				};

				finderCache.removeResult(_finderPathCountByVisitCRFId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitCRFId, args);

				args = new Object[] {
					subjectVisitDefinitionModelImpl.getVisitCRFId()
				};

				finderCache.removeResult(_finderPathCountByVisitCRFId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByVisitCRFId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, SubjectVisitDefinitionImpl.class,
			subjectVisitDefinition.getPrimaryKey(), subjectVisitDefinition,
			false);

		clearUniqueFindersCache(subjectVisitDefinitionModelImpl, false);
		cacheUniqueFindersCache(subjectVisitDefinitionModelImpl);

		subjectVisitDefinition.resetOriginalValues();

		return subjectVisitDefinition;
	}

	/**
	 * Returns the subject visit definition with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subject visit definition
	 * @return the subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubjectVisitDefinitionException {

		SubjectVisitDefinition subjectVisitDefinition = fetchByPrimaryKey(
			primaryKey);

		if (subjectVisitDefinition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubjectVisitDefinitionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return subjectVisitDefinition;
	}

	/**
	 * Returns the subject visit definition with the primary key or throws a <code>NoSuchSubjectVisitDefinitionException</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition
	 * @throws NoSuchSubjectVisitDefinitionException if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition findByPrimaryKey(
			long subjectVisitDefinitionId)
		throws NoSuchSubjectVisitDefinitionException {

		return findByPrimaryKey((Serializable)subjectVisitDefinitionId);
	}

	/**
	 * Returns the subject visit definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectVisitDefinitionId the primary key of the subject visit definition
	 * @return the subject visit definition, or <code>null</code> if a subject visit definition with the primary key could not be found
	 */
	@Override
	public SubjectVisitDefinition fetchByPrimaryKey(
		long subjectVisitDefinitionId) {

		return fetchByPrimaryKey((Serializable)subjectVisitDefinitionId);
	}

	/**
	 * Returns all the subject visit definitions.
	 *
	 * @return the subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @return the range of subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findAll(
		int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject visit definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectVisitDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject visit definitions
	 * @param end the upper bound of the range of subject visit definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subject visit definitions
	 */
	@Override
	public List<SubjectVisitDefinition> findAll(
		int start, int end,
		OrderByComparator<SubjectVisitDefinition> orderByComparator,
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

		List<SubjectVisitDefinition> list = null;

		if (useFinderCache) {
			list = (List<SubjectVisitDefinition>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SUBJECTVISITDEFINITION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SUBJECTVISITDEFINITION;

				sql = sql.concat(SubjectVisitDefinitionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SubjectVisitDefinition>)QueryUtil.list(
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
	 * Removes all the subject visit definitions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SubjectVisitDefinition subjectVisitDefinition : findAll()) {
			remove(subjectVisitDefinition);
		}
	}

	/**
	 * Returns the number of subject visit definitions.
	 *
	 * @return the number of subject visit definitions
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
					_SQL_COUNT_SUBJECTVISITDEFINITION);

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
		return "subjectVisitDefinitionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SUBJECTVISITDEFINITION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SubjectVisitDefinitionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the subject visit definition persistence.
	 */
	@Activate
	public void activate() {
		SubjectVisitDefinitionModelImpl.setEntityCacheEnabled(
			entityCacheEnabled);
		SubjectVisitDefinitionModelImpl.setFinderCacheEnabled(
			finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			SubjectVisitDefinitionModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			SubjectVisitDefinitionModelImpl.UUID_COLUMN_BITMASK |
			SubjectVisitDefinitionModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			SubjectVisitDefinitionModelImpl.UUID_COLUMN_BITMASK |
			SubjectVisitDefinitionModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			SubjectVisitDefinitionModelImpl.GROUPID_COLUMN_BITMASK |
			SubjectVisitDefinitionModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProjectId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProjectId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProjectId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisitGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisitGroupId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.VISITGROUPID_COLUMN_BITMASK);

		_finderPathCountByVisitGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisitGroupId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySubjectId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySubjectId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.SUBJECTID_COLUMN_BITMASK);

		_finderPathCountBySubjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySubjectId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisitCRFId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SubjectVisitDefinitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisitCRFId",
			new String[] {Long.class.getName()},
			SubjectVisitDefinitionModelImpl.VISITCRFID_COLUMN_BITMASK);

		_finderPathCountByVisitCRFId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisitCRFId",
			new String[] {Long.class.getName()});

		_setSubjectVisitDefinitionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSubjectVisitDefinitionUtilPersistence(null);

		entityCache.removeCache(SubjectVisitDefinitionImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setSubjectVisitDefinitionUtilPersistence(
		SubjectVisitDefinitionPersistence subjectVisitDefinitionPersistence) {

		try {
			Field field = SubjectVisitDefinitionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, subjectVisitDefinitionPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.SubjectVisitDefinition"),
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

	private static final String _SQL_SELECT_SUBJECTVISITDEFINITION =
		"SELECT subjectVisitDefinition FROM SubjectVisitDefinition subjectVisitDefinition";

	private static final String _SQL_SELECT_SUBJECTVISITDEFINITION_WHERE =
		"SELECT subjectVisitDefinition FROM SubjectVisitDefinition subjectVisitDefinition WHERE ";

	private static final String _SQL_COUNT_SUBJECTVISITDEFINITION =
		"SELECT COUNT(subjectVisitDefinition) FROM SubjectVisitDefinition subjectVisitDefinition";

	private static final String _SQL_COUNT_SUBJECTVISITDEFINITION_WHERE =
		"SELECT COUNT(subjectVisitDefinition) FROM SubjectVisitDefinition subjectVisitDefinition WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"subjectVisitDefinition.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SubjectVisitDefinition exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SubjectVisitDefinition exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SubjectVisitDefinitionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "order", "type"});

}
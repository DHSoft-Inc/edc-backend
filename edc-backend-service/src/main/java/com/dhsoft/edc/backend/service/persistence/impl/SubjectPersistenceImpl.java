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

import com.dhsoft.edc.backend.exception.NoSuchSubjectException;
import com.dhsoft.edc.backend.model.Subject;
import com.dhsoft.edc.backend.model.impl.SubjectImpl;
import com.dhsoft.edc.backend.model.impl.SubjectModelImpl;
import com.dhsoft.edc.backend.service.persistence.SubjectPersistence;
import com.dhsoft.edc.backend.service.persistence.SubjectUtil;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the subject service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SubjectPersistence.class)
public class SubjectPersistenceImpl
	extends BasePersistenceImpl<Subject> implements SubjectPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SubjectUtil</code> to access the subject persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SubjectImpl.class.getName();

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
	 * Returns all the subjects where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (!uuid.equals(subject.getUuid())) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
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

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUuid_First(
			String uuid, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUuid_First(uuid, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUuid_First(
		String uuid, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUuid_Last(
			String uuid, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUuid_Last(uuid, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUuid_Last(
		String uuid, OrderByComparator<Subject> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where uuid = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByUuid_PrevAndNext(
			long subjectId, String uuid,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		uuid = Objects.toString(uuid, "");

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, subject, uuid, orderByComparator, true);

			array[1] = subject;

			array[2] = getByUuid_PrevAndNext(
				session, subject, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByUuid_PrevAndNext(
		Session session, Subject subject, String uuid,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Subject subject :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subjects
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "subject.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(subject.uuid IS NULL OR subject.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectException {

		Subject subject = fetchByUUID_G(uuid, groupId);

		if (subject == null) {
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

			throw new NoSuchSubjectException(sb.toString());
		}

		return subject;
	}

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the subject where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUUID_G(
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

		if (result instanceof Subject) {
			Subject subject = (Subject)result;

			if (!Objects.equals(uuid, subject.getUuid()) ||
				(groupId != subject.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

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

				List<Subject> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Subject subject = list.get(0);

					result = subject;

					cacheResult(subject);
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
			return (Subject)result;
		}
	}

	/**
	 * Removes the subject where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subject that was removed
	 */
	@Override
	public Subject removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubjectException {

		Subject subject = findByUUID_G(uuid, groupId);

		return remove(subject);
	}

	/**
	 * Returns the number of subjects where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(subject.uuid IS NULL OR subject.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"subject.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (!uuid.equals(subject.getUuid()) ||
						(companyId != subject.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
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

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Subject> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByUuid_C_PrevAndNext(
			long subjectId, String uuid, long companyId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		uuid = Objects.toString(uuid, "");

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, subject, uuid, companyId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByUuid_C_PrevAndNext(
				session, subject, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByUuid_C_PrevAndNext(
		Session session, Subject subject, String uuid, long companyId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Subject subject :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(subject.uuid IS NULL OR subject.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"subject.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the subjects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (companyId != subject.getCompanyId()) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByCompanyId_First(
			long companyId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByCompanyId_First(companyId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByCompanyId_First(
		long companyId, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByCompanyId_Last(
			long companyId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByCompanyId_Last(companyId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByCompanyId_Last(
		long companyId, OrderByComparator<Subject> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where companyId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByCompanyId_PrevAndNext(
			long subjectId, long companyId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, subject, companyId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByCompanyId_PrevAndNext(
				session, subject, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByCompanyId_PrevAndNext(
		Session session, Subject subject, long companyId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (Subject subject :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if ((groupId != subject.getGroupId()) ||
						(projectId != subject.getProjectId())) {

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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<Subject> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByG_P_PrevAndNext(
			long subjectId, long groupId, long projectId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, subject, groupId, projectId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByG_P_PrevAndNext(
				session, subject, groupId, projectId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByG_P_PrevAndNext(
		Session session, Subject subject, long groupId, long projectId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (Subject subject :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"subject.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByProjectId;
	private FinderPath _finderPathWithoutPaginationFindByProjectId;
	private FinderPath _finderPathCountByProjectId;

	/**
	 * Returns all the subjects where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByProjectId(long projectId) {
		return findByProjectId(
			projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByProjectId(long projectId, int start, int end) {
		return findByProjectId(projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByProjectId(projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByProjectId(
		long projectId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (projectId != subject.getProjectId()) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_PROJECTID_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(projectId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByProjectId_First(
			long projectId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByProjectId_First(projectId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByProjectId_First(
		long projectId, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByProjectId(
			projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByProjectId_Last(
			long projectId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByProjectId_Last(projectId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByProjectId_Last(
		long projectId, OrderByComparator<Subject> orderByComparator) {

		int count = countByProjectId(projectId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByProjectId(
			projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where projectId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByProjectId_PrevAndNext(
			long subjectId, long projectId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByProjectId_PrevAndNext(
				session, subject, projectId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByProjectId_PrevAndNext(
				session, subject, projectId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByProjectId_PrevAndNext(
		Session session, Subject subject, long projectId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(projectId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where projectId = &#63; from the database.
	 *
	 * @param projectId the project ID
	 */
	@Override
	public void removeByProjectId(long projectId) {
		for (Subject subject :
				findByProjectId(
					projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where projectId = &#63;.
	 *
	 * @param projectId the project ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByProjectId(long projectId) {
		FinderPath finderPath = _finderPathCountByProjectId;

		Object[] finderArgs = new Object[] {projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByInstitutionId;
	private FinderPath _finderPathWithoutPaginationFindByInstitutionId;
	private FinderPath _finderPathCountByInstitutionId;

	/**
	 * Returns all the subjects where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByInstitutionId(long institutionId) {
		return findByInstitutionId(
			institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByInstitutionId(
		long institutionId, int start, int end) {

		return findByInstitutionId(institutionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByInstitutionId(
			institutionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByInstitutionId(
		long institutionId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (institutionId != subject.getInstitutionId()) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(institutionId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByInstitutionId_First(
			long institutionId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByInstitutionId_First(
			institutionId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByInstitutionId_First(
		long institutionId, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByInstitutionId(
			institutionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByInstitutionId_Last(
			long institutionId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByInstitutionId_Last(
			institutionId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("institutionId=");
		sb.append(institutionId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByInstitutionId_Last(
		long institutionId, OrderByComparator<Subject> orderByComparator) {

		int count = countByInstitutionId(institutionId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByInstitutionId(
			institutionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where institutionId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByInstitutionId_PrevAndNext(
			long subjectId, long institutionId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByInstitutionId_PrevAndNext(
				session, subject, institutionId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByInstitutionId_PrevAndNext(
				session, subject, institutionId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByInstitutionId_PrevAndNext(
		Session session, Subject subject, long institutionId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(institutionId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 */
	@Override
	public void removeByInstitutionId(long institutionId) {
		for (Subject subject :
				findByInstitutionId(
					institutionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByInstitutionId(long institutionId) {
		FinderPath finderPath = _finderPathCountByInstitutionId;

		Object[] finderArgs = new Object[] {institutionId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.institutionId = ?";

	private FinderPath _finderPathWithPaginationFindByUserId;
	private FinderPath _finderPathWithoutPaginationFindByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns all the subjects where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (userId != subject.getUserId()) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUserId_First(
			long userId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUserId_First(userId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUserId_First(
		long userId, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByUserId_Last(
			long userId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByUserId_Last(userId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByUserId_Last(
		long userId, OrderByComparator<Subject> orderByComparator) {

		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByUserId(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where userId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByUserId_PrevAndNext(
			long subjectId, long userId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByUserId_PrevAndNext(
				session, subject, userId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByUserId_PrevAndNext(
				session, subject, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByUserId_PrevAndNext(
		Session session, Subject subject, long userId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (Subject subject :
				findByUserId(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

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
		"subject.userId = ?";

	private FinderPath _finderPathWithPaginationFindByExpGroupId;
	private FinderPath _finderPathWithoutPaginationFindByExpGroupId;
	private FinderPath _finderPathCountByExpGroupId;

	/**
	 * Returns all the subjects where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the matching subjects
	 */
	@Override
	public List<Subject> findByExpGroupId(long expGroupId) {
		return findByExpGroupId(
			expGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of matching subjects
	 */
	@Override
	public List<Subject> findByExpGroupId(long expGroupId, int start, int end) {
		return findByExpGroupId(expGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByExpGroupId(
		long expGroupId, int start, int end,
		OrderByComparator<Subject> orderByComparator) {

		return findByExpGroupId(
			expGroupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects where expGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param expGroupId the exp group ID
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching subjects
	 */
	@Override
	public List<Subject> findByExpGroupId(
		long expGroupId, int start, int end,
		OrderByComparator<Subject> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByExpGroupId;
				finderArgs = new Object[] {expGroupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByExpGroupId;
			finderArgs = new Object[] {
				expGroupId, start, end, orderByComparator
			};
		}

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Subject subject : list) {
					if (expGroupId != subject.getExpGroupId()) {
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

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_EXPGROUPID_EXPGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SubjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(expGroupId);

				list = (List<Subject>)QueryUtil.list(
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
	 * Returns the first subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByExpGroupId_First(
			long expGroupId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByExpGroupId_First(
			expGroupId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("expGroupId=");
		sb.append(expGroupId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the first subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByExpGroupId_First(
		long expGroupId, OrderByComparator<Subject> orderByComparator) {

		List<Subject> list = findByExpGroupId(
			expGroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByExpGroupId_Last(
			long expGroupId, OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = fetchByExpGroupId_Last(expGroupId, orderByComparator);

		if (subject != null) {
			return subject;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("expGroupId=");
		sb.append(expGroupId);

		sb.append("}");

		throw new NoSuchSubjectException(sb.toString());
	}

	/**
	 * Returns the last subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByExpGroupId_Last(
		long expGroupId, OrderByComparator<Subject> orderByComparator) {

		int count = countByExpGroupId(expGroupId);

		if (count == 0) {
			return null;
		}

		List<Subject> list = findByExpGroupId(
			expGroupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subjects before and after the current subject in the ordered set where expGroupId = &#63;.
	 *
	 * @param subjectId the primary key of the current subject
	 * @param expGroupId the exp group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject[] findByExpGroupId_PrevAndNext(
			long subjectId, long expGroupId,
			OrderByComparator<Subject> orderByComparator)
		throws NoSuchSubjectException {

		Subject subject = findByPrimaryKey(subjectId);

		Session session = null;

		try {
			session = openSession();

			Subject[] array = new SubjectImpl[3];

			array[0] = getByExpGroupId_PrevAndNext(
				session, subject, expGroupId, orderByComparator, true);

			array[1] = subject;

			array[2] = getByExpGroupId_PrevAndNext(
				session, subject, expGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Subject getByExpGroupId_PrevAndNext(
		Session session, Subject subject, long expGroupId,
		OrderByComparator<Subject> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SUBJECT_WHERE);

		sb.append(_FINDER_COLUMN_EXPGROUPID_EXPGROUPID_2);

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
			sb.append(SubjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(expGroupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(subject)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Subject> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subjects where expGroupId = &#63; from the database.
	 *
	 * @param expGroupId the exp group ID
	 */
	@Override
	public void removeByExpGroupId(long expGroupId) {
		for (Subject subject :
				findByExpGroupId(
					expGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects where expGroupId = &#63;.
	 *
	 * @param expGroupId the exp group ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByExpGroupId(long expGroupId) {
		FinderPath finderPath = _finderPathCountByExpGroupId;

		Object[] finderArgs = new Object[] {expGroupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_EXPGROUPID_EXPGROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(expGroupId);

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

	private static final String _FINDER_COLUMN_EXPGROUPID_EXPGROUPID_2 =
		"subject.expGroupId = ?";

	private FinderPath _finderPathFetchByG_P_R;
	private FinderPath _finderPathCountByG_P_R;

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and randomNo = &#63; or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param randomNo the random no
	 * @return the matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByG_P_R(long groupId, long projectId, String randomNo)
		throws NoSuchSubjectException {

		Subject subject = fetchByG_P_R(groupId, projectId, randomNo);

		if (subject == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("groupId=");
			sb.append(groupId);

			sb.append(", projectId=");
			sb.append(projectId);

			sb.append(", randomNo=");
			sb.append(randomNo);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSubjectException(sb.toString());
		}

		return subject;
	}

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and randomNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param randomNo the random no
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_R(long groupId, long projectId, String randomNo) {
		return fetchByG_P_R(groupId, projectId, randomNo, true);
	}

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and randomNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param randomNo the random no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_R(
		long groupId, long projectId, String randomNo, boolean useFinderCache) {

		randomNo = Objects.toString(randomNo, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {groupId, projectId, randomNo};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByG_P_R, finderArgs, this);
		}

		if (result instanceof Subject) {
			Subject subject = (Subject)result;

			if ((groupId != subject.getGroupId()) ||
				(projectId != subject.getProjectId()) ||
				!Objects.equals(randomNo, subject.getRandomNo())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_R_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_R_PROJECTID_2);

			boolean bindRandomNo = false;

			if (randomNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_R_RANDOMNO_3);
			}
			else {
				bindRandomNo = true;

				sb.append(_FINDER_COLUMN_G_P_R_RANDOMNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindRandomNo) {
					queryPos.add(randomNo);
				}

				List<Subject> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByG_P_R, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									groupId, projectId, randomNo
								};
							}

							_log.warn(
								"SubjectPersistenceImpl.fetchByG_P_R(long, long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Subject subject = list.get(0);

					result = subject;

					cacheResult(subject);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByG_P_R, finderArgs);
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
			return (Subject)result;
		}
	}

	/**
	 * Removes the subject where groupId = &#63; and projectId = &#63; and randomNo = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param randomNo the random no
	 * @return the subject that was removed
	 */
	@Override
	public Subject removeByG_P_R(long groupId, long projectId, String randomNo)
		throws NoSuchSubjectException {

		Subject subject = findByG_P_R(groupId, projectId, randomNo);

		return remove(subject);
	}

	/**
	 * Returns the number of subjects where groupId = &#63; and projectId = &#63; and randomNo = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param randomNo the random no
	 * @return the number of matching subjects
	 */
	@Override
	public int countByG_P_R(long groupId, long projectId, String randomNo) {
		randomNo = Objects.toString(randomNo, "");

		FinderPath finderPath = _finderPathCountByG_P_R;

		Object[] finderArgs = new Object[] {groupId, projectId, randomNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_R_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_R_PROJECTID_2);

			boolean bindRandomNo = false;

			if (randomNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_R_RANDOMNO_3);
			}
			else {
				bindRandomNo = true;

				sb.append(_FINDER_COLUMN_G_P_R_RANDOMNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindRandomNo) {
					queryPos.add(randomNo);
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

	private static final String _FINDER_COLUMN_G_P_R_GROUPID_2 =
		"subject.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_R_PROJECTID_2 =
		"subject.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_R_RANDOMNO_2 =
		"subject.randomNo = ?";

	private static final String _FINDER_COLUMN_G_P_R_RANDOMNO_3 =
		"(subject.randomNo IS NULL OR subject.randomNo = '')";

	private FinderPath _finderPathFetchByG_P_S;
	private FinderPath _finderPathCountByG_P_S;

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and serialId = &#63; or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param serialId the serial ID
	 * @return the matching subject
	 * @throws NoSuchSubjectException if a matching subject could not be found
	 */
	@Override
	public Subject findByG_P_S(long groupId, long projectId, String serialId)
		throws NoSuchSubjectException {

		Subject subject = fetchByG_P_S(groupId, projectId, serialId);

		if (subject == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("groupId=");
			sb.append(groupId);

			sb.append(", projectId=");
			sb.append(projectId);

			sb.append(", serialId=");
			sb.append(serialId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSubjectException(sb.toString());
		}

		return subject;
	}

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and serialId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param serialId the serial ID
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_S(long groupId, long projectId, String serialId) {
		return fetchByG_P_S(groupId, projectId, serialId, true);
	}

	/**
	 * Returns the subject where groupId = &#63; and projectId = &#63; and serialId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param serialId the serial ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject, or <code>null</code> if a matching subject could not be found
	 */
	@Override
	public Subject fetchByG_P_S(
		long groupId, long projectId, String serialId, boolean useFinderCache) {

		serialId = Objects.toString(serialId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {groupId, projectId, serialId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByG_P_S, finderArgs, this);
		}

		if (result instanceof Subject) {
			Subject subject = (Subject)result;

			if ((groupId != subject.getGroupId()) ||
				(projectId != subject.getProjectId()) ||
				!Objects.equals(serialId, subject.getSerialId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_PROJECTID_2);

			boolean bindSerialId = false;

			if (serialId.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_S_SERIALID_3);
			}
			else {
				bindSerialId = true;

				sb.append(_FINDER_COLUMN_G_P_S_SERIALID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindSerialId) {
					queryPos.add(serialId);
				}

				List<Subject> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByG_P_S, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									groupId, projectId, serialId
								};
							}

							_log.warn(
								"SubjectPersistenceImpl.fetchByG_P_S(long, long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Subject subject = list.get(0);

					result = subject;

					cacheResult(subject);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByG_P_S, finderArgs);
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
			return (Subject)result;
		}
	}

	/**
	 * Removes the subject where groupId = &#63; and projectId = &#63; and serialId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param serialId the serial ID
	 * @return the subject that was removed
	 */
	@Override
	public Subject removeByG_P_S(long groupId, long projectId, String serialId)
		throws NoSuchSubjectException {

		Subject subject = findByG_P_S(groupId, projectId, serialId);

		return remove(subject);
	}

	/**
	 * Returns the number of subjects where groupId = &#63; and projectId = &#63; and serialId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param serialId the serial ID
	 * @return the number of matching subjects
	 */
	@Override
	public int countByG_P_S(long groupId, long projectId, String serialId) {
		serialId = Objects.toString(serialId, "");

		FinderPath finderPath = _finderPathCountByG_P_S;

		Object[] finderArgs = new Object[] {groupId, projectId, serialId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_SUBJECT_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_PROJECTID_2);

			boolean bindSerialId = false;

			if (serialId.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_S_SERIALID_3);
			}
			else {
				bindSerialId = true;

				sb.append(_FINDER_COLUMN_G_P_S_SERIALID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindSerialId) {
					queryPos.add(serialId);
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

	private static final String _FINDER_COLUMN_G_P_S_GROUPID_2 =
		"subject.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_PROJECTID_2 =
		"subject.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_SERIALID_2 =
		"subject.serialId = ?";

	private static final String _FINDER_COLUMN_G_P_S_SERIALID_3 =
		"(subject.serialId IS NULL OR subject.serialId = '')";

	public SubjectPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Subject.class);

		setModelImplClass(SubjectImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the subject in the entity cache if it is enabled.
	 *
	 * @param subject the subject
	 */
	@Override
	public void cacheResult(Subject subject) {
		entityCache.putResult(
			entityCacheEnabled, SubjectImpl.class, subject.getPrimaryKey(),
			subject);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {subject.getUuid(), subject.getGroupId()}, subject);

		finderCache.putResult(
			_finderPathFetchByG_P_R,
			new Object[] {
				subject.getGroupId(), subject.getProjectId(),
				subject.getRandomNo()
			},
			subject);

		finderCache.putResult(
			_finderPathFetchByG_P_S,
			new Object[] {
				subject.getGroupId(), subject.getProjectId(),
				subject.getSerialId()
			},
			subject);

		subject.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the subjects in the entity cache if it is enabled.
	 *
	 * @param subjects the subjects
	 */
	@Override
	public void cacheResult(List<Subject> subjects) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (subjects.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Subject subject : subjects) {
			if (entityCache.getResult(
					entityCacheEnabled, SubjectImpl.class,
					subject.getPrimaryKey()) == null) {

				cacheResult(subject);
			}
			else {
				subject.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all subjects.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SubjectImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the subject.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Subject subject) {
		entityCache.removeResult(
			entityCacheEnabled, SubjectImpl.class, subject.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SubjectModelImpl)subject, true);
	}

	@Override
	public void clearCache(List<Subject> subjects) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Subject subject : subjects) {
			entityCache.removeResult(
				entityCacheEnabled, SubjectImpl.class, subject.getPrimaryKey());

			clearUniqueFindersCache((SubjectModelImpl)subject, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, SubjectImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(SubjectModelImpl subjectModelImpl) {
		Object[] args = new Object[] {
			subjectModelImpl.getUuid(), subjectModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, subjectModelImpl, false);

		args = new Object[] {
			subjectModelImpl.getGroupId(), subjectModelImpl.getProjectId(),
			subjectModelImpl.getRandomNo()
		};

		finderCache.putResult(
			_finderPathCountByG_P_R, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByG_P_R, args, subjectModelImpl, false);

		args = new Object[] {
			subjectModelImpl.getGroupId(), subjectModelImpl.getProjectId(),
			subjectModelImpl.getSerialId()
		};

		finderCache.putResult(
			_finderPathCountByG_P_S, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByG_P_S, args, subjectModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		SubjectModelImpl subjectModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				subjectModelImpl.getUuid(), subjectModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((subjectModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				subjectModelImpl.getOriginalUuid(),
				subjectModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				subjectModelImpl.getGroupId(), subjectModelImpl.getProjectId(),
				subjectModelImpl.getRandomNo()
			};

			finderCache.removeResult(_finderPathCountByG_P_R, args);
			finderCache.removeResult(_finderPathFetchByG_P_R, args);
		}

		if ((subjectModelImpl.getColumnBitmask() &
			 _finderPathFetchByG_P_R.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				subjectModelImpl.getOriginalGroupId(),
				subjectModelImpl.getOriginalProjectId(),
				subjectModelImpl.getOriginalRandomNo()
			};

			finderCache.removeResult(_finderPathCountByG_P_R, args);
			finderCache.removeResult(_finderPathFetchByG_P_R, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				subjectModelImpl.getGroupId(), subjectModelImpl.getProjectId(),
				subjectModelImpl.getSerialId()
			};

			finderCache.removeResult(_finderPathCountByG_P_S, args);
			finderCache.removeResult(_finderPathFetchByG_P_S, args);
		}

		if ((subjectModelImpl.getColumnBitmask() &
			 _finderPathFetchByG_P_S.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				subjectModelImpl.getOriginalGroupId(),
				subjectModelImpl.getOriginalProjectId(),
				subjectModelImpl.getOriginalSerialId()
			};

			finderCache.removeResult(_finderPathCountByG_P_S, args);
			finderCache.removeResult(_finderPathFetchByG_P_S, args);
		}
	}

	/**
	 * Creates a new subject with the primary key. Does not add the subject to the database.
	 *
	 * @param subjectId the primary key for the new subject
	 * @return the new subject
	 */
	@Override
	public Subject create(long subjectId) {
		Subject subject = new SubjectImpl();

		subject.setNew(true);
		subject.setPrimaryKey(subjectId);

		String uuid = PortalUUIDUtil.generate();

		subject.setUuid(uuid);

		subject.setCompanyId(CompanyThreadLocal.getCompanyId());

		return subject;
	}

	/**
	 * Removes the subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject that was removed
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject remove(long subjectId) throws NoSuchSubjectException {
		return remove((Serializable)subjectId);
	}

	/**
	 * Removes the subject with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subject
	 * @return the subject that was removed
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject remove(Serializable primaryKey)
		throws NoSuchSubjectException {

		Session session = null;

		try {
			session = openSession();

			Subject subject = (Subject)session.get(
				SubjectImpl.class, primaryKey);

			if (subject == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubjectException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(subject);
		}
		catch (NoSuchSubjectException noSuchEntityException) {
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
	protected Subject removeImpl(Subject subject) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subject)) {
				subject = (Subject)session.get(
					SubjectImpl.class, subject.getPrimaryKeyObj());
			}

			if (subject != null) {
				session.delete(subject);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (subject != null) {
			clearCache(subject);
		}

		return subject;
	}

	@Override
	public Subject updateImpl(Subject subject) {
		boolean isNew = subject.isNew();

		if (!(subject instanceof SubjectModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(subject.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(subject);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in subject proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Subject implementation " +
					subject.getClass());
		}

		SubjectModelImpl subjectModelImpl = (SubjectModelImpl)subject;

		if (Validator.isNull(subject.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			subject.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (subject.getCreateDate() == null)) {
			if (serviceContext == null) {
				subject.setCreateDate(date);
			}
			else {
				subject.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!subjectModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				subject.setModifiedDate(date);
			}
			else {
				subject.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(subject);

				subject.setNew(false);
			}
			else {
				subject = (Subject)session.merge(subject);
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
			Object[] args = new Object[] {subjectModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				subjectModelImpl.getUuid(), subjectModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {subjectModelImpl.getCompanyId()};

			finderCache.removeResult(_finderPathCountByCompanyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCompanyId, args);

			args = new Object[] {
				subjectModelImpl.getGroupId(), subjectModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {subjectModelImpl.getProjectId()};

			finderCache.removeResult(_finderPathCountByProjectId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByProjectId, args);

			args = new Object[] {subjectModelImpl.getInstitutionId()};

			finderCache.removeResult(_finderPathCountByInstitutionId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByInstitutionId, args);

			args = new Object[] {subjectModelImpl.getUserId()};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserId, args);

			args = new Object[] {subjectModelImpl.getExpGroupId()};

			finderCache.removeResult(_finderPathCountByExpGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByExpGroupId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {subjectModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalUuid(),
					subjectModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					subjectModelImpl.getUuid(), subjectModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCompanyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);

				args = new Object[] {subjectModelImpl.getCompanyId()};

				finderCache.removeResult(_finderPathCountByCompanyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCompanyId, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalGroupId(),
					subjectModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					subjectModelImpl.getGroupId(),
					subjectModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByProjectId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);

				args = new Object[] {subjectModelImpl.getProjectId()};

				finderCache.removeResult(_finderPathCountByProjectId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByProjectId, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByInstitutionId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalInstitutionId()
				};

				finderCache.removeResult(_finderPathCountByInstitutionId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionId, args);

				args = new Object[] {subjectModelImpl.getInstitutionId()};

				finderCache.removeResult(_finderPathCountByInstitutionId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByInstitutionId, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);

				args = new Object[] {subjectModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserId, args);
			}

			if ((subjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByExpGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					subjectModelImpl.getOriginalExpGroupId()
				};

				finderCache.removeResult(_finderPathCountByExpGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByExpGroupId, args);

				args = new Object[] {subjectModelImpl.getExpGroupId()};

				finderCache.removeResult(_finderPathCountByExpGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByExpGroupId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, SubjectImpl.class, subject.getPrimaryKey(),
			subject, false);

		clearUniqueFindersCache(subjectModelImpl, false);
		cacheUniqueFindersCache(subjectModelImpl);

		subject.resetOriginalValues();

		return subject;
	}

	/**
	 * Returns the subject with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subject
	 * @return the subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubjectException {

		Subject subject = fetchByPrimaryKey(primaryKey);

		if (subject == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubjectException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return subject;
	}

	/**
	 * Returns the subject with the primary key or throws a <code>NoSuchSubjectException</code> if it could not be found.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject
	 * @throws NoSuchSubjectException if a subject with the primary key could not be found
	 */
	@Override
	public Subject findByPrimaryKey(long subjectId)
		throws NoSuchSubjectException {

		return findByPrimaryKey((Serializable)subjectId);
	}

	/**
	 * Returns the subject with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectId the primary key of the subject
	 * @return the subject, or <code>null</code> if a subject with the primary key could not be found
	 */
	@Override
	public Subject fetchByPrimaryKey(long subjectId) {
		return fetchByPrimaryKey((Serializable)subjectId);
	}

	/**
	 * Returns all the subjects.
	 *
	 * @return the subjects
	 */
	@Override
	public List<Subject> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @return the range of subjects
	 */
	@Override
	public List<Subject> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subjects
	 */
	@Override
	public List<Subject> findAll(
		int start, int end, OrderByComparator<Subject> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subjects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subjects
	 * @param end the upper bound of the range of subjects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subjects
	 */
	@Override
	public List<Subject> findAll(
		int start, int end, OrderByComparator<Subject> orderByComparator,
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

		List<Subject> list = null;

		if (useFinderCache) {
			list = (List<Subject>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SUBJECT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SUBJECT;

				sql = sql.concat(SubjectModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Subject>)QueryUtil.list(
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
	 * Removes all the subjects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Subject subject : findAll()) {
			remove(subject);
		}
	}

	/**
	 * Returns the number of subjects.
	 *
	 * @return the number of subjects
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SUBJECT);

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
		return "subjectId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SUBJECT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SubjectModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the subject persistence.
	 */
	@Activate
	public void activate() {
		SubjectModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		SubjectModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			SubjectModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			SubjectModelImpl.UUID_COLUMN_BITMASK |
			SubjectModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			SubjectModelImpl.UUID_COLUMN_BITMASK |
			SubjectModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()},
			SubjectModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByCompanyId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			SubjectModelImpl.GROUPID_COLUMN_BITMASK |
			SubjectModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProjectId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProjectId",
			new String[] {Long.class.getName()},
			SubjectModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByProjectId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProjectId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstitutionId",
			new String[] {Long.class.getName()},
			SubjectModelImpl.INSTITUTIONID_COLUMN_BITMASK);

		_finderPathCountByInstitutionId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstitutionId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] {Long.class.getName()},
			SubjectModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByExpGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByExpGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByExpGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByExpGroupId",
			new String[] {Long.class.getName()},
			SubjectModelImpl.EXPGROUPID_COLUMN_BITMASK);

		_finderPathCountByExpGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByExpGroupId",
			new String[] {Long.class.getName()});

		_finderPathFetchByG_P_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_P_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			SubjectModelImpl.GROUPID_COLUMN_BITMASK |
			SubjectModelImpl.PROJECTID_COLUMN_BITMASK |
			SubjectModelImpl.RANDOMNO_COLUMN_BITMASK);

		_finderPathCountByG_P_R = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

		_finderPathFetchByG_P_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SubjectImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_P_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			SubjectModelImpl.GROUPID_COLUMN_BITMASK |
			SubjectModelImpl.PROJECTID_COLUMN_BITMASK |
			SubjectModelImpl.SERIALID_COLUMN_BITMASK);

		_finderPathCountByG_P_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

		_setSubjectUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSubjectUtilPersistence(null);

		entityCache.removeCache(SubjectImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setSubjectUtilPersistence(
		SubjectPersistence subjectPersistence) {

		try {
			Field field = SubjectUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, subjectPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.Subject"),
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

	private static final String _SQL_SELECT_SUBJECT =
		"SELECT subject FROM Subject subject";

	private static final String _SQL_SELECT_SUBJECT_WHERE =
		"SELECT subject FROM Subject subject WHERE ";

	private static final String _SQL_COUNT_SUBJECT =
		"SELECT COUNT(subject) FROM Subject subject";

	private static final String _SQL_COUNT_SUBJECT_WHERE =
		"SELECT COUNT(subject) FROM Subject subject WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "subject.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Subject exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Subject exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SubjectPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
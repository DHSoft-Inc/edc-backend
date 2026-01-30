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

import com.dhsoft.edc.backend.exception.NoSuchApprovalRequestException;
import com.dhsoft.edc.backend.model.ApprovalRequest;
import com.dhsoft.edc.backend.model.impl.ApprovalRequestImpl;
import com.dhsoft.edc.backend.model.impl.ApprovalRequestModelImpl;
import com.dhsoft.edc.backend.service.persistence.ApprovalRequestPersistence;
import com.dhsoft.edc.backend.service.persistence.ApprovalRequestUtil;
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
 * The persistence implementation for the approval request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ApprovalRequestPersistence.class)
public class ApprovalRequestPersistenceImpl
	extends BasePersistenceImpl<ApprovalRequest>
	implements ApprovalRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ApprovalRequestUtil</code> to access the approval request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ApprovalRequestImpl.class.getName();

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
	 * Returns all the approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if (!uuid.equals(approvalRequest.getUuid())) {
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

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByUuid_First(
			String uuid, OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByUuid_First(
			uuid, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUuid_First(
		String uuid, OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByUuid_Last(
			String uuid, OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByUuid_Last(
			uuid, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUuid_Last(
		String uuid, OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where uuid = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByUuid_PrevAndNext(
			long approvalRequestId, String uuid,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		uuid = Objects.toString(uuid, "");

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, approvalRequest, uuid, orderByComparator, true);

			array[1] = approvalRequest;

			array[2] = getByUuid_PrevAndNext(
				session, approvalRequest, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ApprovalRequest getByUuid_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, String uuid,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
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
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ApprovalRequest approvalRequest :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

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
		"approvalRequest.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(approvalRequest.uuid IS NULL OR approvalRequest.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByUUID_G(uuid, groupId);

		if (approvalRequest == null) {
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

			throw new NoSuchApprovalRequestException(sb.toString());
		}

		return approvalRequest;
	}

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the approval request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUUID_G(
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

		if (result instanceof ApprovalRequest) {
			ApprovalRequest approvalRequest = (ApprovalRequest)result;

			if (!Objects.equals(uuid, approvalRequest.getUuid()) ||
				(groupId != approvalRequest.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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

				List<ApprovalRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ApprovalRequest approvalRequest = list.get(0);

					result = approvalRequest;

					cacheResult(approvalRequest);
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
			return (ApprovalRequest)result;
		}
	}

	/**
	 * Removes the approval request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the approval request that was removed
	 */
	@Override
	public ApprovalRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = findByUUID_G(uuid, groupId);

		return remove(approvalRequest);
	}

	/**
	 * Returns the number of approval requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

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
		"approvalRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(approvalRequest.uuid IS NULL OR approvalRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"approvalRequest.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if (!uuid.equals(approvalRequest.getUuid()) ||
						(companyId != approvalRequest.getCompanyId())) {

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

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
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

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByUuid_C_PrevAndNext(
			long approvalRequestId, String uuid, long companyId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		uuid = Objects.toString(uuid, "");

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, approvalRequest, uuid, companyId, orderByComparator,
				true);

			array[1] = approvalRequest;

			array[2] = getByUuid_C_PrevAndNext(
				session, approvalRequest, uuid, companyId, orderByComparator,
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

	protected ApprovalRequest getByUuid_C_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, String uuid,
		long companyId, OrderByComparator<ApprovalRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
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
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ApprovalRequest approvalRequest :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

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
		"approvalRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(approvalRequest.uuid IS NULL OR approvalRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"approvalRequest.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P;
	private FinderPath _finderPathWithoutPaginationFindByG_P;
	private FinderPath _finderPathCountByG_P;

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P(long groupId, long projectId) {
		return findByG_P(
			groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end) {

		return findByG_P(groupId, projectId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByG_P(
			groupId, projectId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P(
		long groupId, long projectId, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if ((groupId != approvalRequest.getGroupId()) ||
						(projectId != approvalRequest.getProjectId())) {

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

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_PROJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_First(
			long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_First(
			groupId, projectId, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_First(
		long groupId, long projectId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByG_P(
			groupId, projectId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_Last(
			long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_Last(
			groupId, projectId, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_Last(
		long groupId, long projectId,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByG_P(groupId, projectId);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByG_P(
			groupId, projectId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByG_P_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByG_P_PrevAndNext(
				session, approvalRequest, groupId, projectId, orderByComparator,
				true);

			array[1] = approvalRequest;

			array[2] = getByG_P_PrevAndNext(
				session, approvalRequest, groupId, projectId, orderByComparator,
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

	protected ApprovalRequest getByG_P_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, long groupId,
		long projectId, OrderByComparator<ApprovalRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
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
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 */
	@Override
	public void removeByG_P(long groupId, long projectId) {
		for (ApprovalRequest approvalRequest :
				findByG_P(
					groupId, projectId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByG_P(long groupId, long projectId) {
		FinderPath finderPath = _finderPathCountByG_P;

		Object[] finderArgs = new Object[] {groupId, projectId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

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
		"approvalRequest.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_PROJECTID_2 =
		"approvalRequest.projectId = ?";

	private FinderPath _finderPathWithPaginationFindByG_P_C;
	private FinderPath _finderPathWithoutPaginationFindByG_P_C;
	private FinderPath _finderPathCountByG_P_C;

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className) {

		return findByG_P_C(
			groupId, projectId, className, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end) {

		return findByG_P_C(groupId, projectId, className, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByG_P_C(
			groupId, projectId, className, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_C(
		long groupId, long projectId, String className, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		className = Objects.toString(className, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_P_C;
				finderArgs = new Object[] {groupId, projectId, className};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_P_C;
			finderArgs = new Object[] {
				groupId, projectId, className, start, end, orderByComparator
			};
		}

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if ((groupId != approvalRequest.getGroupId()) ||
						(projectId != approvalRequest.getProjectId()) ||
						!className.equals(approvalRequest.getClassName())) {

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

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_C_PROJECTID_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindClassName) {
					queryPos.add(className);
				}

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_C_First(
			long groupId, long projectId, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_C_First(
			groupId, projectId, className, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", className=");
		sb.append(className);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_C_First(
		long groupId, long projectId, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByG_P_C(
			groupId, projectId, className, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_C_Last(
			long groupId, long projectId, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_C_Last(
			groupId, projectId, className, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", className=");
		sb.append(className);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_C_Last(
		long groupId, long projectId, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByG_P_C(groupId, projectId, className);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByG_P_C(
			groupId, projectId, className, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByG_P_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId,
			String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		className = Objects.toString(className, "");

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByG_P_C_PrevAndNext(
				session, approvalRequest, groupId, projectId, className,
				orderByComparator, true);

			array[1] = approvalRequest;

			array[2] = getByG_P_C_PrevAndNext(
				session, approvalRequest, groupId, projectId, className,
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

	protected ApprovalRequest getByG_P_C_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, long groupId,
		long projectId, String className,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

		sb.append(_FINDER_COLUMN_G_P_C_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_P_C_PROJECTID_2);

		boolean bindClassName = false;

		if (className.isEmpty()) {
			sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_3);
		}
		else {
			bindClassName = true;

			sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_2);
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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(projectId);

		if (bindClassName) {
			queryPos.add(className);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 */
	@Override
	public void removeByG_P_C(long groupId, long projectId, String className) {
		for (ApprovalRequest approvalRequest :
				findByG_P_C(
					groupId, projectId, className, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByG_P_C(long groupId, long projectId, String className) {
		className = Objects.toString(className, "");

		FinderPath finderPath = _finderPathCountByG_P_C;

		Object[] finderArgs = new Object[] {groupId, projectId, className};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_C_PROJECTID_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_C_CLASSNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindClassName) {
					queryPos.add(className);
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

	private static final String _FINDER_COLUMN_G_P_C_GROUPID_2 =
		"approvalRequest.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_C_PROJECTID_2 =
		"approvalRequest.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_C_CLASSNAME_2 =
		"approvalRequest.className = ?";

	private static final String _FINDER_COLUMN_G_P_C_CLASSNAME_3 =
		"(approvalRequest.className IS NULL OR approvalRequest.className = '')";

	private FinderPath _finderPathFetchByG_P_C_P;
	private FinderPath _finderPathCountByG_P_C_P;

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_C_P(
			groupId, projectId, className, classPK);

		if (approvalRequest == null) {
			StringBundler sb = new StringBundler(10);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("groupId=");
			sb.append(groupId);

			sb.append(", projectId=");
			sb.append(projectId);

			sb.append(", className=");
			sb.append(className);

			sb.append(", classPK=");
			sb.append(classPK);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchApprovalRequestException(sb.toString());
		}

		return approvalRequest;
	}

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK) {

		return fetchByG_P_C_P(groupId, projectId, className, classPK, true);
	}

	/**
	 * Returns the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_C_P(
		long groupId, long projectId, String className, long classPK,
		boolean useFinderCache) {

		className = Objects.toString(className, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {groupId, projectId, className, classPK};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByG_P_C_P, finderArgs, this);
		}

		if (result instanceof ApprovalRequest) {
			ApprovalRequest approvalRequest = (ApprovalRequest)result;

			if ((groupId != approvalRequest.getGroupId()) ||
				(projectId != approvalRequest.getProjectId()) ||
				!Objects.equals(className, approvalRequest.getClassName()) ||
				(classPK != approvalRequest.getClassPK())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_C_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_C_P_PROJECTID_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_C_P_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_C_P_CLASSNAME_2);
			}

			sb.append(_FINDER_COLUMN_G_P_C_P_CLASSPK_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindClassName) {
					queryPos.add(className);
				}

				queryPos.add(classPK);

				List<ApprovalRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByG_P_C_P, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									groupId, projectId, className, classPK
								};
							}

							_log.warn(
								"ApprovalRequestPersistenceImpl.fetchByG_P_C_P(long, long, String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ApprovalRequest approvalRequest = list.get(0);

					result = approvalRequest;

					cacheResult(approvalRequest);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByG_P_C_P, finderArgs);
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
			return (ApprovalRequest)result;
		}
	}

	/**
	 * Removes the approval request where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the approval request that was removed
	 */
	@Override
	public ApprovalRequest removeByG_P_C_P(
			long groupId, long projectId, String className, long classPK)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = findByG_P_C_P(
			groupId, projectId, className, classPK);

		return remove(approvalRequest);
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and className = &#63; and classPK = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param className the class name
	 * @param classPK the class pk
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByG_P_C_P(
		long groupId, long projectId, String className, long classPK) {

		className = Objects.toString(className, "");

		FinderPath finderPath = _finderPathCountByG_P_C_P;

		Object[] finderArgs = new Object[] {
			groupId, projectId, className, classPK
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_C_P_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_C_P_PROJECTID_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_C_P_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_C_P_CLASSNAME_2);
			}

			sb.append(_FINDER_COLUMN_G_P_C_P_CLASSPK_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				if (bindClassName) {
					queryPos.add(className);
				}

				queryPos.add(classPK);

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

	private static final String _FINDER_COLUMN_G_P_C_P_GROUPID_2 =
		"approvalRequest.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_C_P_PROJECTID_2 =
		"approvalRequest.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_C_P_CLASSNAME_2 =
		"approvalRequest.className = ? AND ";

	private static final String _FINDER_COLUMN_G_P_C_P_CLASSNAME_3 =
		"(approvalRequest.className IS NULL OR approvalRequest.className = '') AND ";

	private static final String _FINDER_COLUMN_G_P_C_P_CLASSPK_2 =
		"approvalRequest.classPK = ?";

	private FinderPath _finderPathWithPaginationFindByG_P_S;
	private FinderPath _finderPathWithoutPaginationFindByG_P_S;
	private FinderPath _finderPathCountByG_P_S;

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status) {

		return findByG_P_S(
			groupId, projectId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end) {

		return findByG_P_S(groupId, projectId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByG_P_S(
			groupId, projectId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S(
		long groupId, long projectId, int status, int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_P_S;
				finderArgs = new Object[] {groupId, projectId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_P_S;
			finderArgs = new Object[] {
				groupId, projectId, status, start, end, orderByComparator
			};
		}

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if ((groupId != approvalRequest.getGroupId()) ||
						(projectId != approvalRequest.getProjectId()) ||
						(status != approvalRequest.getStatus())) {

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

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_PROJECTID_2);

			sb.append(_FINDER_COLUMN_G_P_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				queryPos.add(status);

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_S_First(
			long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_S_First(
			groupId, projectId, status, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_S_First(
		long groupId, long projectId, int status,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByG_P_S(
			groupId, projectId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_S_Last(
			long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_S_Last(
			groupId, projectId, status, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_S_Last(
		long groupId, long projectId, int status,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByG_P_S(groupId, projectId, status);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByG_P_S(
			groupId, projectId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByG_P_S_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByG_P_S_PrevAndNext(
				session, approvalRequest, groupId, projectId, status,
				orderByComparator, true);

			array[1] = approvalRequest;

			array[2] = getByG_P_S_PrevAndNext(
				session, approvalRequest, groupId, projectId, status,
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

	protected ApprovalRequest getByG_P_S_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, long groupId,
		long projectId, int status,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

		sb.append(_FINDER_COLUMN_G_P_S_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_P_S_PROJECTID_2);

		sb.append(_FINDER_COLUMN_G_P_S_STATUS_2);

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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(projectId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 */
	@Override
	public void removeByG_P_S(long groupId, long projectId, int status) {
		for (ApprovalRequest approvalRequest :
				findByG_P_S(
					groupId, projectId, status, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByG_P_S(long groupId, long projectId, int status) {
		FinderPath finderPath = _finderPathCountByG_P_S;

		Object[] finderArgs = new Object[] {groupId, projectId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_PROJECTID_2);

			sb.append(_FINDER_COLUMN_G_P_S_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				queryPos.add(status);

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
		"approvalRequest.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_PROJECTID_2 =
		"approvalRequest.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_STATUS_2 =
		"approvalRequest.status = ?";

	private FinderPath _finderPathWithPaginationFindByG_P_S_C;
	private FinderPath _finderPathWithoutPaginationFindByG_P_S_C;
	private FinderPath _finderPathCountByG_P_S_C;

	/**
	 * Returns all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		return findByG_P_S_C(
			groupId, projectId, status, className, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end) {

		return findByG_P_S_C(
			groupId, projectId, status, className, start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end, OrderByComparator<ApprovalRequest> orderByComparator) {

		return findByG_P_S_C(
			groupId, projectId, status, className, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching approval requests
	 */
	@Override
	public List<ApprovalRequest> findByG_P_S_C(
		long groupId, long projectId, int status, String className, int start,
		int end, OrderByComparator<ApprovalRequest> orderByComparator,
		boolean useFinderCache) {

		className = Objects.toString(className, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_P_S_C;
				finderArgs = new Object[] {
					groupId, projectId, status, className
				};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_P_S_C;
			finderArgs = new Object[] {
				groupId, projectId, status, className, start, end,
				orderByComparator
			};
		}

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApprovalRequest approvalRequest : list) {
					if ((groupId != approvalRequest.getGroupId()) ||
						(projectId != approvalRequest.getProjectId()) ||
						(status != approvalRequest.getStatus()) ||
						!className.equals(approvalRequest.getClassName())) {

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
					6 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(6);
			}

			sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_C_PROJECTID_2);

			sb.append(_FINDER_COLUMN_G_P_S_C_STATUS_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				queryPos.add(status);

				if (bindClassName) {
					queryPos.add(className);
				}

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_S_C_First(
			long groupId, long projectId, int status, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_S_C_First(
			groupId, projectId, status, className, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", status=");
		sb.append(status);

		sb.append(", className=");
		sb.append(className);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the first approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_S_C_First(
		long groupId, long projectId, int status, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		List<ApprovalRequest> list = findByG_P_S_C(
			groupId, projectId, status, className, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request
	 * @throws NoSuchApprovalRequestException if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest findByG_P_S_C_Last(
			long groupId, long projectId, int status, String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByG_P_S_C_Last(
			groupId, projectId, status, className, orderByComparator);

		if (approvalRequest != null) {
			return approvalRequest;
		}

		StringBundler sb = new StringBundler(10);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", projectId=");
		sb.append(projectId);

		sb.append(", status=");
		sb.append(status);

		sb.append(", className=");
		sb.append(className);

		sb.append("}");

		throw new NoSuchApprovalRequestException(sb.toString());
	}

	/**
	 * Returns the last approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching approval request, or <code>null</code> if a matching approval request could not be found
	 */
	@Override
	public ApprovalRequest fetchByG_P_S_C_Last(
		long groupId, long projectId, int status, String className,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		int count = countByG_P_S_C(groupId, projectId, status, className);

		if (count == 0) {
			return null;
		}

		List<ApprovalRequest> list = findByG_P_S_C(
			groupId, projectId, status, className, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the approval requests before and after the current approval request in the ordered set where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param approvalRequestId the primary key of the current approval request
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest[] findByG_P_S_C_PrevAndNext(
			long approvalRequestId, long groupId, long projectId, int status,
			String className,
			OrderByComparator<ApprovalRequest> orderByComparator)
		throws NoSuchApprovalRequestException {

		className = Objects.toString(className, "");

		ApprovalRequest approvalRequest = findByPrimaryKey(approvalRequestId);

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest[] array = new ApprovalRequestImpl[3];

			array[0] = getByG_P_S_C_PrevAndNext(
				session, approvalRequest, groupId, projectId, status, className,
				orderByComparator, true);

			array[1] = approvalRequest;

			array[2] = getByG_P_S_C_PrevAndNext(
				session, approvalRequest, groupId, projectId, status, className,
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

	protected ApprovalRequest getByG_P_S_C_PrevAndNext(
		Session session, ApprovalRequest approvalRequest, long groupId,
		long projectId, int status, String className,
		OrderByComparator<ApprovalRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				7 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(6);
		}

		sb.append(_SQL_SELECT_APPROVALREQUEST_WHERE);

		sb.append(_FINDER_COLUMN_G_P_S_C_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_P_S_C_PROJECTID_2);

		sb.append(_FINDER_COLUMN_G_P_S_C_STATUS_2);

		boolean bindClassName = false;

		if (className.isEmpty()) {
			sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_3);
		}
		else {
			bindClassName = true;

			sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_2);
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
			sb.append(ApprovalRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(projectId);

		queryPos.add(status);

		if (bindClassName) {
			queryPos.add(className);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						approvalRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ApprovalRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 */
	@Override
	public void removeByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		for (ApprovalRequest approvalRequest :
				findByG_P_S_C(
					groupId, projectId, status, className, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests where groupId = &#63; and projectId = &#63; and status = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param projectId the project ID
	 * @param status the status
	 * @param className the class name
	 * @return the number of matching approval requests
	 */
	@Override
	public int countByG_P_S_C(
		long groupId, long projectId, int status, String className) {

		className = Objects.toString(className, "");

		FinderPath finderPath = _finderPathCountByG_P_S_C;

		Object[] finderArgs = new Object[] {
			groupId, projectId, status, className
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_APPROVALREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_G_P_S_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_P_S_C_PROJECTID_2);

			sb.append(_FINDER_COLUMN_G_P_S_C_STATUS_2);

			boolean bindClassName = false;

			if (className.isEmpty()) {
				sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				sb.append(_FINDER_COLUMN_G_P_S_C_CLASSNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(projectId);

				queryPos.add(status);

				if (bindClassName) {
					queryPos.add(className);
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

	private static final String _FINDER_COLUMN_G_P_S_C_GROUPID_2 =
		"approvalRequest.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_C_PROJECTID_2 =
		"approvalRequest.projectId = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_C_STATUS_2 =
		"approvalRequest.status = ? AND ";

	private static final String _FINDER_COLUMN_G_P_S_C_CLASSNAME_2 =
		"approvalRequest.className = ?";

	private static final String _FINDER_COLUMN_G_P_S_C_CLASSNAME_3 =
		"(approvalRequest.className IS NULL OR approvalRequest.className = '')";

	public ApprovalRequestPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ApprovalRequest.class);

		setModelImplClass(ApprovalRequestImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the approval request in the entity cache if it is enabled.
	 *
	 * @param approvalRequest the approval request
	 */
	@Override
	public void cacheResult(ApprovalRequest approvalRequest) {
		entityCache.putResult(
			entityCacheEnabled, ApprovalRequestImpl.class,
			approvalRequest.getPrimaryKey(), approvalRequest);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				approvalRequest.getUuid(), approvalRequest.getGroupId()
			},
			approvalRequest);

		finderCache.putResult(
			_finderPathFetchByG_P_C_P,
			new Object[] {
				approvalRequest.getGroupId(), approvalRequest.getProjectId(),
				approvalRequest.getClassName(), approvalRequest.getClassPK()
			},
			approvalRequest);

		approvalRequest.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the approval requests in the entity cache if it is enabled.
	 *
	 * @param approvalRequests the approval requests
	 */
	@Override
	public void cacheResult(List<ApprovalRequest> approvalRequests) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (approvalRequests.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ApprovalRequest approvalRequest : approvalRequests) {
			if (entityCache.getResult(
					entityCacheEnabled, ApprovalRequestImpl.class,
					approvalRequest.getPrimaryKey()) == null) {

				cacheResult(approvalRequest);
			}
			else {
				approvalRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all approval requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ApprovalRequestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the approval request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApprovalRequest approvalRequest) {
		entityCache.removeResult(
			entityCacheEnabled, ApprovalRequestImpl.class,
			approvalRequest.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(ApprovalRequestModelImpl)approvalRequest, true);
	}

	@Override
	public void clearCache(List<ApprovalRequest> approvalRequests) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApprovalRequest approvalRequest : approvalRequests) {
			entityCache.removeResult(
				entityCacheEnabled, ApprovalRequestImpl.class,
				approvalRequest.getPrimaryKey());

			clearUniqueFindersCache(
				(ApprovalRequestModelImpl)approvalRequest, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, ApprovalRequestImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ApprovalRequestModelImpl approvalRequestModelImpl) {

		Object[] args = new Object[] {
			approvalRequestModelImpl.getUuid(),
			approvalRequestModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, approvalRequestModelImpl, false);

		args = new Object[] {
			approvalRequestModelImpl.getGroupId(),
			approvalRequestModelImpl.getProjectId(),
			approvalRequestModelImpl.getClassName(),
			approvalRequestModelImpl.getClassPK()
		};

		finderCache.putResult(
			_finderPathCountByG_P_C_P, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByG_P_C_P, args, approvalRequestModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ApprovalRequestModelImpl approvalRequestModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				approvalRequestModelImpl.getUuid(),
				approvalRequestModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((approvalRequestModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				approvalRequestModelImpl.getOriginalUuid(),
				approvalRequestModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				approvalRequestModelImpl.getGroupId(),
				approvalRequestModelImpl.getProjectId(),
				approvalRequestModelImpl.getClassName(),
				approvalRequestModelImpl.getClassPK()
			};

			finderCache.removeResult(_finderPathCountByG_P_C_P, args);
			finderCache.removeResult(_finderPathFetchByG_P_C_P, args);
		}

		if ((approvalRequestModelImpl.getColumnBitmask() &
			 _finderPathFetchByG_P_C_P.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				approvalRequestModelImpl.getOriginalGroupId(),
				approvalRequestModelImpl.getOriginalProjectId(),
				approvalRequestModelImpl.getOriginalClassName(),
				approvalRequestModelImpl.getOriginalClassPK()
			};

			finderCache.removeResult(_finderPathCountByG_P_C_P, args);
			finderCache.removeResult(_finderPathFetchByG_P_C_P, args);
		}
	}

	/**
	 * Creates a new approval request with the primary key. Does not add the approval request to the database.
	 *
	 * @param approvalRequestId the primary key for the new approval request
	 * @return the new approval request
	 */
	@Override
	public ApprovalRequest create(long approvalRequestId) {
		ApprovalRequest approvalRequest = new ApprovalRequestImpl();

		approvalRequest.setNew(true);
		approvalRequest.setPrimaryKey(approvalRequestId);

		String uuid = PortalUUIDUtil.generate();

		approvalRequest.setUuid(uuid);

		approvalRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return approvalRequest;
	}

	/**
	 * Removes the approval request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request that was removed
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest remove(long approvalRequestId)
		throws NoSuchApprovalRequestException {

		return remove((Serializable)approvalRequestId);
	}

	/**
	 * Removes the approval request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the approval request
	 * @return the approval request that was removed
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest remove(Serializable primaryKey)
		throws NoSuchApprovalRequestException {

		Session session = null;

		try {
			session = openSession();

			ApprovalRequest approvalRequest = (ApprovalRequest)session.get(
				ApprovalRequestImpl.class, primaryKey);

			if (approvalRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApprovalRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(approvalRequest);
		}
		catch (NoSuchApprovalRequestException noSuchEntityException) {
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
	protected ApprovalRequest removeImpl(ApprovalRequest approvalRequest) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(approvalRequest)) {
				approvalRequest = (ApprovalRequest)session.get(
					ApprovalRequestImpl.class,
					approvalRequest.getPrimaryKeyObj());
			}

			if (approvalRequest != null) {
				session.delete(approvalRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (approvalRequest != null) {
			clearCache(approvalRequest);
		}

		return approvalRequest;
	}

	@Override
	public ApprovalRequest updateImpl(ApprovalRequest approvalRequest) {
		boolean isNew = approvalRequest.isNew();

		if (!(approvalRequest instanceof ApprovalRequestModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(approvalRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					approvalRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in approvalRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ApprovalRequest implementation " +
					approvalRequest.getClass());
		}

		ApprovalRequestModelImpl approvalRequestModelImpl =
			(ApprovalRequestModelImpl)approvalRequest;

		if (Validator.isNull(approvalRequest.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			approvalRequest.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(approvalRequest);

				approvalRequest.setNew(false);
			}
			else {
				approvalRequest = (ApprovalRequest)session.merge(
					approvalRequest);
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
			Object[] args = new Object[] {approvalRequestModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				approvalRequestModelImpl.getUuid(),
				approvalRequestModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				approvalRequestModelImpl.getGroupId(),
				approvalRequestModelImpl.getProjectId()
			};

			finderCache.removeResult(_finderPathCountByG_P, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P, args);

			args = new Object[] {
				approvalRequestModelImpl.getGroupId(),
				approvalRequestModelImpl.getProjectId(),
				approvalRequestModelImpl.getClassName()
			};

			finderCache.removeResult(_finderPathCountByG_P_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P_C, args);

			args = new Object[] {
				approvalRequestModelImpl.getGroupId(),
				approvalRequestModelImpl.getProjectId(),
				approvalRequestModelImpl.getStatus()
			};

			finderCache.removeResult(_finderPathCountByG_P_S, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P_S, args);

			args = new Object[] {
				approvalRequestModelImpl.getGroupId(),
				approvalRequestModelImpl.getProjectId(),
				approvalRequestModelImpl.getStatus(),
				approvalRequestModelImpl.getClassName()
			};

			finderCache.removeResult(_finderPathCountByG_P_S_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByG_P_S_C, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {approvalRequestModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalUuid(),
					approvalRequestModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					approvalRequestModelImpl.getUuid(),
					approvalRequestModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalGroupId(),
					approvalRequestModelImpl.getOriginalProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);

				args = new Object[] {
					approvalRequestModelImpl.getGroupId(),
					approvalRequestModelImpl.getProjectId()
				};

				finderCache.removeResult(_finderPathCountByG_P, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P, args);
			}

			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalGroupId(),
					approvalRequestModelImpl.getOriginalProjectId(),
					approvalRequestModelImpl.getOriginalClassName()
				};

				finderCache.removeResult(_finderPathCountByG_P_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_C, args);

				args = new Object[] {
					approvalRequestModelImpl.getGroupId(),
					approvalRequestModelImpl.getProjectId(),
					approvalRequestModelImpl.getClassName()
				};

				finderCache.removeResult(_finderPathCountByG_P_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_C, args);
			}

			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P_S.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalGroupId(),
					approvalRequestModelImpl.getOriginalProjectId(),
					approvalRequestModelImpl.getOriginalStatus()
				};

				finderCache.removeResult(_finderPathCountByG_P_S, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_S, args);

				args = new Object[] {
					approvalRequestModelImpl.getGroupId(),
					approvalRequestModelImpl.getProjectId(),
					approvalRequestModelImpl.getStatus()
				};

				finderCache.removeResult(_finderPathCountByG_P_S, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_S, args);
			}

			if ((approvalRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByG_P_S_C.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					approvalRequestModelImpl.getOriginalGroupId(),
					approvalRequestModelImpl.getOriginalProjectId(),
					approvalRequestModelImpl.getOriginalStatus(),
					approvalRequestModelImpl.getOriginalClassName()
				};

				finderCache.removeResult(_finderPathCountByG_P_S_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_S_C, args);

				args = new Object[] {
					approvalRequestModelImpl.getGroupId(),
					approvalRequestModelImpl.getProjectId(),
					approvalRequestModelImpl.getStatus(),
					approvalRequestModelImpl.getClassName()
				};

				finderCache.removeResult(_finderPathCountByG_P_S_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByG_P_S_C, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, ApprovalRequestImpl.class,
			approvalRequest.getPrimaryKey(), approvalRequest, false);

		clearUniqueFindersCache(approvalRequestModelImpl, false);
		cacheUniqueFindersCache(approvalRequestModelImpl);

		approvalRequest.resetOriginalValues();

		return approvalRequest;
	}

	/**
	 * Returns the approval request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the approval request
	 * @return the approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApprovalRequestException {

		ApprovalRequest approvalRequest = fetchByPrimaryKey(primaryKey);

		if (approvalRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApprovalRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return approvalRequest;
	}

	/**
	 * Returns the approval request with the primary key or throws a <code>NoSuchApprovalRequestException</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request
	 * @throws NoSuchApprovalRequestException if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest findByPrimaryKey(long approvalRequestId)
		throws NoSuchApprovalRequestException {

		return findByPrimaryKey((Serializable)approvalRequestId);
	}

	/**
	 * Returns the approval request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param approvalRequestId the primary key of the approval request
	 * @return the approval request, or <code>null</code> if a approval request with the primary key could not be found
	 */
	@Override
	public ApprovalRequest fetchByPrimaryKey(long approvalRequestId) {
		return fetchByPrimaryKey((Serializable)approvalRequestId);
	}

	/**
	 * Returns all the approval requests.
	 *
	 * @return the approval requests
	 */
	@Override
	public List<ApprovalRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @return the range of approval requests
	 */
	@Override
	public List<ApprovalRequest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of approval requests
	 */
	@Override
	public List<ApprovalRequest> findAll(
		int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the approval requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApprovalRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of approval requests
	 * @param end the upper bound of the range of approval requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of approval requests
	 */
	@Override
	public List<ApprovalRequest> findAll(
		int start, int end,
		OrderByComparator<ApprovalRequest> orderByComparator,
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

		List<ApprovalRequest> list = null;

		if (useFinderCache) {
			list = (List<ApprovalRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_APPROVALREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_APPROVALREQUEST;

				sql = sql.concat(ApprovalRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ApprovalRequest>)QueryUtil.list(
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
	 * Removes all the approval requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ApprovalRequest approvalRequest : findAll()) {
			remove(approvalRequest);
		}
	}

	/**
	 * Returns the number of approval requests.
	 *
	 * @return the number of approval requests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_APPROVALREQUEST);

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
		return "approvalRequestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_APPROVALREQUEST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ApprovalRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the approval request persistence.
	 */
	@Activate
	public void activate() {
		ApprovalRequestModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		ApprovalRequestModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			ApprovalRequestModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			ApprovalRequestModelImpl.UUID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			ApprovalRequestModelImpl.UUID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] {Long.class.getName(), Long.class.getName()},
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.PROJECTID_COLUMN_BITMASK);

		_finderPathCountByG_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByG_P_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.PROJECTID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.CLASSNAME_COLUMN_BITMASK);

		_finderPathCountByG_P_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

		_finderPathFetchByG_P_C_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_P_C_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.PROJECTID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.CLASSNAME_COLUMN_BITMASK |
			ApprovalRequestModelImpl.CLASSPK_COLUMN_BITMASK);

		_finderPathCountByG_P_C_P = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_C_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Long.class.getName()
			});

		_finderPathWithPaginationFindByG_P_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.PROJECTID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.STATUS_COLUMN_BITMASK);

		_finderPathCountByG_P_S = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

		_finderPathWithPaginationFindByG_P_S_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P_S_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByG_P_S_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ApprovalRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P_S_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			},
			ApprovalRequestModelImpl.GROUPID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.PROJECTID_COLUMN_BITMASK |
			ApprovalRequestModelImpl.STATUS_COLUMN_BITMASK |
			ApprovalRequestModelImpl.CLASSNAME_COLUMN_BITMASK);

		_finderPathCountByG_P_S_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P_S_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), String.class.getName()
			});

		_setApprovalRequestUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setApprovalRequestUtilPersistence(null);

		entityCache.removeCache(ApprovalRequestImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setApprovalRequestUtilPersistence(
		ApprovalRequestPersistence approvalRequestPersistence) {

		try {
			Field field = ApprovalRequestUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, approvalRequestPersistence);
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
				"value.object.column.bitmask.enabled.com.dhsoft.edc.backend.model.ApprovalRequest"),
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

	private static final String _SQL_SELECT_APPROVALREQUEST =
		"SELECT approvalRequest FROM ApprovalRequest approvalRequest";

	private static final String _SQL_SELECT_APPROVALREQUEST_WHERE =
		"SELECT approvalRequest FROM ApprovalRequest approvalRequest WHERE ";

	private static final String _SQL_COUNT_APPROVALREQUEST =
		"SELECT COUNT(approvalRequest) FROM ApprovalRequest approvalRequest";

	private static final String _SQL_COUNT_APPROVALREQUEST_WHERE =
		"SELECT COUNT(approvalRequest) FROM ApprovalRequest approvalRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "approvalRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ApprovalRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ApprovalRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ApprovalRequestPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}
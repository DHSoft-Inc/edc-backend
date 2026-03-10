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

package com.dhsoft.edc.backend.service.impl;

import com.dhsoft.edc.backend.model.InstResearcher;
import com.dhsoft.edc.backend.service.base.InstResearcherLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.InstResearcher",
	service = AopService.class
)
public class InstResearcherLocalServiceImpl extends InstResearcherLocalServiceBaseImpl {
	
	private Log _log = LogFactoryUtil.getLog(InstResearcherLocalServiceImpl.class);
	
	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)
	public InstResearcher addInstResearcher(
			long companyId, long groupId,
			long projectId, long instId, long researcherId,
			ServiceContext sc) {
		
		long userId = sc.getUserId();
		User user = null;
		
		long instResearcherId = super.counterLocalService.increment();
		InstResearcher instResearcher = null;
			
		// get user and create instResearcher 
		try {
			user = super.userLocalService.getUser(userId);
			instResearcher = super.instResearcherLocalService.createInstResearcher(instResearcherId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// set audit fields
		instResearcher.setCompanyId(companyId);
		instResearcher.setGroupId(groupId);
		instResearcher.setUserId(userId);
		instResearcher.setUserName(user.getFullName());
		instResearcher.setCreateDate(new Date());
		instResearcher.setModifiedDate(new Date());
		
		// set entity fields
		instResearcher.setProjectId(projectId);
		instResearcher.setInstitutionId(instId);
		instResearcher.setResearcherId(researcherId);
		
		instResearcher.setExpandoBridgeAttributes(sc);
		
		try {
			super.instResearcherPersistence.update(instResearcher);
			
			resourceLocalService.addResources(
					companyId, groupId, userId,
					InstResearcher.class.getName(), instResearcherId, 
					false, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return instResearcher;
	}
	
	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)
	public InstResearcher deleteInstResearcher(long instResearcherId) {
		InstResearcher instResearcher = null;
		
		if(instResearcherId > 0) {
			try {
				instResearcher = super.instResearcherPersistence.findByPrimaryKey(instResearcherId);
				super.instResearcherPersistence.remove(instResearcher);
				resourceLocalService.deleteResource(
						instResearcher.getCompanyId(), InstResearcher.class.getName(),
						ResourceConstants.SCOPE_INDIVIDUAL, instResearcherId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return instResearcher;
	}
	
	public List<InstResearcher> getByProjectId(long groupId, long projectId) {
		List<InstResearcher> result = new ArrayList<>();
		result = instResearcherPersistence.findByG_P(groupId, projectId);
		return result;
	}
	
	public List<InstResearcher> getByInstId(long groupId, long instId) {
		List<InstResearcher> result = new ArrayList<>();
		result = instResearcherPersistence.findByG_I(groupId, instId);
		return result;
	}
	
	public List<InstResearcher> getByResearcherIdAll(long researcherId) {
		List<InstResearcher> result = new ArrayList<>();
		result = instResearcherPersistence.findByResearcherId(researcherId);
		return result;
	}
		
	public InstResearcher findByG_P_U(long groupId, long projectId, long userId)
	{
		InstResearcher result = null;
		List<InstResearcher> GPList = instResearcherPersistence.findByG_P(groupId, projectId);
		for(InstResearcher ir : GPList) {
			if(ir.getUserId() == userId) result = ir;
		}
		return result;
	}
	
}
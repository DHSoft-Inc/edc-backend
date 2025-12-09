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
import com.dhsoft.edc.backend.model.Institution;
import com.dhsoft.edc.backend.service.base.InstitutionLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.Institution",
	service = AopService.class
)
public class InstitutionLocalServiceImpl extends InstitutionLocalServiceBaseImpl {
	
	//Create New Institution: if success, return Institution. else, return null.
	public Institution CreateInstitution(long companyId, long groupId, long projectId, long userId, String userName, int status, long statusByUserId, String statusByUserName, Date statusDate, String code, String name, String enName, int type, String piName, String contactNum, String email, Date irbDate) {
		long institutionId = CounterLocalServiceUtil.increment("institutionId");
		Date date = new Date();
		try {
			Institution i = institutionPersistence.create(institutionId);
			i.setCompanyId(companyId);
			i.setGroupId(groupId);
			i.setProjectId(projectId);
			i.setUserId(userId);
			i.setUserName(userName);
			i.setStatus(status);
			i.setStatusByUserId(statusByUserId);
			i.setStatusByUserName(statusByUserName);
			i.setStatusDate(statusDate);
			i.setCode(code);
			i.setName(name);
			i.setEnName(enName);
			i.setType(type);
			i.setPiName(piName);
			i.setContactNum(contactNum);
			i.setEmail(email);
			i.setIrbDate(irbDate);
			i.setCreateDate(date);
			i.setModifiedDate(date);
			institutionPersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findByInstitutionId(institutionId);
	}
	
	//Update Institution
	public void UpdateInstitution(long institutionId, int status, long statusByUserId, String statusByUserName, Date statusDate, String code, String name, String enName, int type, String piName, String contactNum, String email, Date irbDate) {
		try{
			Date date = new Date();
			Institution i = institutionPersistence.findByPrimaryKey(institutionId);
			i.setStatus(status);
			i.setStatusByUserId(statusByUserId);
			i.setStatusByUserName(statusByUserName);
			i.setStatusDate(statusDate);
			i.setCode(code);
			i.setName(name);
			i.setEnName(enName);
			i.setType(type);
			i.setPiName(piName);
			i.setContactNum(contactNum);
			i.setEmail(email);
			i.setIrbDate(irbDate);
			i.setModifiedDate(date);
			institutionPersistence.update(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Delete Institution: if success, return null. else, return Institution.
	public Institution DeleteInstitution(long institutionId) {
		try {
			List<InstResearcher> ir = instResearcherPersistence.findByInstitutionId(institutionId);
			if (ir.isEmpty()) {
				Institution i = institutionPersistence.findByPrimaryKey(institutionId);
				institutionPersistence.remove(i);
			} else {
				
			}
			return findByInstitutionId(institutionId);

		} catch (Exception e) {
			e.printStackTrace();
			return findByInstitutionId(institutionId);
		}
	}
	
	
	public Institution findByInstitutionId (long institutionId) {
		try {
			return institutionPersistence.findByPrimaryKey(institutionId);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Institution> findByGroupAndProjectId (long groupId, long projectId) {
		try {
			return institutionPersistence.findByG_P(groupId, projectId);
		} catch (Exception e) {
			return null;
		}
	}
	
}
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

import com.dhsoft.edc.backend.model.SubjectVisitDefinition;
import com.dhsoft.edc.backend.service.base.SubjectVisitDefinitionLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.SubjectVisitDefinition",
	service = AopService.class
)
public class SubjectVisitDefinitionLocalServiceImpl
	extends SubjectVisitDefinitionLocalServiceBaseImpl {
	
	public void addSubjectVisitDefinition(long companyId, long groupId, long projectId, long visitGroupId, long subjectId, long userId, String userName, int status, long statusByUserId, String statusByUserName, Date statusDate, String parentCode, String visitDefinitionCode, String name, String order, String extCode, String anchorType, int offset, int windowMinus, int windowPlus, int type, int repeatCount, long visitCRFId)
	{
		Date createDate = new Date();
		long subjectVisitDefinitionId = counterLocalService.increment("subjectVisitDefinition");
		SubjectVisitDefinition svd = subjectVisitDefinitionPersistence.create(subjectVisitDefinitionId);
		svd.setCompanyId(companyId);
		svd.setGroupId(groupId);
		svd.setProjectId(projectId);
		svd.setVisitGroupId(visitGroupId);
		svd.setSubjectId(subjectId);
		svd.setUserId(userId);
		svd.setUserName(userName);
		svd.setStatus(status);
		svd.setStatusByUserId(statusByUserId);
		svd.setStatusByUserName(statusByUserName);
		svd.setStatusDate(statusDate);
		svd.setParentCode(parentCode);
		svd.setVisitDefinitionCode(visitDefinitionCode);
		svd.setName(name);
		svd.setOrder(order);
		svd.setExtCode(extCode);
		svd.setAnchorType(anchorType);
		svd.setOffset(offset);
		svd.setWindowMinus(windowMinus);
		svd.setWindowPlus(windowPlus);
		svd.setType(type);
		svd.setRepeatCount(repeatCount);
		svd.setVisitCRFId(visitCRFId);
		svd.setCreateDate(createDate);
		svd.setModifiedDate(createDate); 
		subjectVisitDefinitionPersistence.update(svd);
	}
	
	public void addSubjectVisitDefinitionWithId(
		    long subjectVisitDefinitionId,  // ✅ 0이면 신규발급, 0 아니면 그 id 사용
		    long companyId, long groupId, long projectId, long visitGroupId, long subjectId,
		    long userId, String userName,
		    int status, long statusByUserId, String statusByUserName, Date statusDate,
		    String parentCode, String visitDefinitionCode, String name, String order, String extCode,
		    String anchorType, int offset, int windowMinus, int windowPlus, int type, int repeatCount,
		    long visitCRFId
		) {
		    Date now = new Date();

		    long id = subjectVisitDefinitionId;
		    if (id <= 0) {
		        id = counterLocalService.increment("subjectVisitDefinition");
		    }

		    SubjectVisitDefinition svd = subjectVisitDefinitionPersistence.create(id);

		    svd.setCompanyId(companyId);
		    svd.setGroupId(groupId);
		    svd.setProjectId(projectId);
		    svd.setVisitGroupId(visitGroupId);
		    svd.setSubjectId(subjectId);
		    svd.setUserId(userId);
		    svd.setUserName(userName);

		    svd.setStatus(status);
		    svd.setStatusByUserId(statusByUserId);
		    svd.setStatusByUserName(statusByUserName);
		    svd.setStatusDate(statusDate);

		    svd.setParentCode(parentCode);
		    svd.setVisitDefinitionCode(visitDefinitionCode);
		    svd.setName(name);
		    svd.setOrder(order);
		    svd.setExtCode(extCode);

		    svd.setAnchorType(anchorType);
		    svd.setOffset(offset);
		    svd.setWindowMinus(windowMinus);
		    svd.setWindowPlus(windowPlus);

		    svd.setType(type);
		    svd.setRepeatCount(repeatCount);
		    svd.setVisitCRFId(visitCRFId);

		    svd.setCreateDate(now);
		    svd.setModifiedDate(now);

		    subjectVisitDefinitionPersistence.update(svd);
		}

	
	public SubjectVisitDefinition deleteSubjectVisitDefinition(long subjectVisitDefinitionId) {
		try {
			SubjectVisitDefinition svd = subjectVisitDefinitionPersistence.findByPrimaryKey(subjectVisitDefinitionId);
			subjectVisitDefinitionPersistence.remove(svd);
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void deleteBySubjectId(long subjectId) {
	    List<SubjectVisitDefinition> list =
	        subjectVisitDefinitionPersistence.findBySubjectId(subjectId);

	    for (SubjectVisitDefinition d : list) {
	        subjectVisitDefinitionLocalService.deleteSubjectVisitDefinition(d);
	    }
	}

    public List<SubjectVisitDefinition> findBySubjectId(long subjectId) {
        return subjectVisitDefinitionPersistence.findBySubjectId(subjectId);
    }
	
    
    public List<SubjectVisitDefinition> getBySubjectId(long subjectId) {
        return subjectVisitDefinitionPersistence.findBySubjectId(subjectId);
    }
	

	
}
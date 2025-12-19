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

import com.dhsoft.edc.backend.model.Subject;
import com.dhsoft.edc.backend.service.base.SubjectLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.Subject",
	service = AopService.class
)
public class SubjectLocalServiceImpl extends SubjectLocalServiceBaseImpl {
	
	public void AddSubject(long companyId, long groupId, long projectId, long institutionId, long userId, String userName, int status, long statusByUserId, String statusByUserName, Date statusDate, String serialId, String name, int subjectStatus, Date subjectStatusApplyDate, Date consentAgreeDate) {
		long subjectId = CounterLocalServiceUtil.increment("Subject");
		
		Date date = new Date();
		
		Subject newSubject= subjectPersistence.create(subjectId);
		newSubject.setCompanyId(companyId);
		newSubject.setGroupId(groupId);
		newSubject.setProjectId(projectId);
		newSubject.setInstitutionId(institutionId);
		newSubject.setUserId(userId);
		newSubject.setUserName(userName);
		newSubject.setStatus(status);
		newSubject.setStatusByUserId(statusByUserId);
		newSubject.setStatusByUserName(statusByUserName);
		newSubject.setStatusDate(statusDate);
		newSubject.setSerialId(serialId);
		newSubject.setName(name);
		newSubject.setSubjectStatus(subjectStatus);
		newSubject.setSubjectStatusApplyDate(subjectStatusApplyDate);
		newSubject.setConsentAgreeDate(consentAgreeDate);
		newSubject.setCreateDate(date);
		newSubject.setModifiedDate(date);
		
		subjectPersistence.update(newSubject);
	}
	
	public void UpdateSubject(long subjectId, int status, long statusByUserId, String statusByUserName, Date statusDate, String serialId, String name, int subjectStatus, Date subjectStatusApplyDate, Date consentAgreeDate, long expGroupId, Date applyDate) {
		try {
		
			Date date = new Date();
			
			Subject updateSubject= subjectPersistence.findByPrimaryKey(subjectId);
	
			updateSubject.setStatus(status);
			updateSubject.setStatusByUserId(statusByUserId);
			updateSubject.setStatusByUserName(statusByUserName);
			updateSubject.setStatusDate(statusDate);
			updateSubject.setSerialId(serialId);
			updateSubject.setName(name);
			updateSubject.setSubjectStatus(subjectStatus);
			updateSubject.setSubjectStatusApplyDate(subjectStatusApplyDate);
			updateSubject.setConsentAgreeDate(consentAgreeDate);
			updateSubject.setModifiedDate(date);
			
			subjectPersistence.update(updateSubject);
		} catch (Exception e) {
			
		}
	}
	
	
	public List<Subject> findByInstitution (long InstitutionId) {
		
		return subjectPersistence.findByInstitutionId(InstitutionId);
		
	}
	
    public List<Subject> getG_P(long groupId, long projectId) {
        return subjectPersistence.findByG_P(groupId, projectId);
    }
}
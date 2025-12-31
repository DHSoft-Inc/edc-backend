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

import com.dhsoft.edc.backend.model.Randomization;
import com.dhsoft.edc.backend.model.Subject;
import com.dhsoft.edc.backend.service.RandomizationLocalServiceUtil;
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
	
	public Subject AddSubject(long companyId, long groupId, long projectId, long institutionId, long userId, String userName, int status, String serialId, String name, int subjectStatus, String randomNo, long expGroupId, Date consentAgreeDate) {
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
		newSubject.setStatusByUserId(userId);
		newSubject.setStatusByUserName(userName);
		newSubject.setStatusDate(date);
		newSubject.setSerialId(serialId);
		newSubject.setName(name);
		newSubject.setSubjectStatus(subjectStatus);
		if(!randomNo.equals(null)) {
			Randomization newRand = RandomizationLocalServiceUtil.findByGroupAndProjectAndRandomNo(groupId, projectId, randomNo);
			RandomizationLocalServiceUtil.UpdateStatusToUse(newRand.getRandomizationId());
		}
		newSubject.setRandomNo(randomNo);
		newSubject.setExpGroupId(expGroupId);
		newSubject.setSubjectStatusApplyDate(date);
		newSubject.setConsentAgreeDate(consentAgreeDate);
		newSubject.setCreateDate(date);
		newSubject.setModifiedDate(date);
		
		subjectPersistence.update(newSubject);
		
		return newSubject;
	}
	
	public void UpdateSubject(long subjectId, long institutionId, long userId, String userName, int status, String serialId, String name, int subjectStatus, String randomNo, long expGroupId, Date consentAgreeDate) {
		try {
		
			Date date = new Date();
			
			Subject updateSubject= subjectPersistence.findByPrimaryKey(subjectId);
			int originStatus = updateSubject.getStatus();
			int originSubjectStatus = updateSubject.getSubjectStatus();
			updateSubject.setInstitutionId(institutionId);
			updateSubject.setStatus(status);
			if(status != originStatus)
			{
				updateSubject.setStatusByUserId(userId);
				updateSubject.setStatusByUserName(userName);
				updateSubject.setStatusDate(date);
			}
			updateSubject.setSerialId(serialId);
			updateSubject.setName(name);
			updateSubject.setSubjectStatus(subjectStatus);
			if (subjectStatus != originSubjectStatus) { updateSubject.setSubjectStatusApplyDate(date); }
			
			if (updateSubject.getRandomNo() != null) {
			    Randomization originRand =
			        RandomizationLocalServiceUtil.findByGroupAndProjectAndRandomNo(updateSubject.getGroupId(), updateSubject.getProjectId(), updateSubject.getRandomNo());

			    if (originRand != null) {
			        RandomizationLocalServiceUtil.UpdateStatusToNotUse(originRand.getRandomizationId());
			    }
			}

			if (randomNo != null) {
			    Randomization newRand =
			        RandomizationLocalServiceUtil.findByGroupAndProjectAndRandomNo(updateSubject.getGroupId(), updateSubject.getProjectId(), randomNo);

			    if (newRand != null) {
			        RandomizationLocalServiceUtil.UpdateStatusToUse(newRand.getRandomizationId());
			    }
			}
			
			updateSubject.setRandomNo(randomNo);
			updateSubject.setExpGroupId(expGroupId);
			updateSubject.setConsentAgreeDate(consentAgreeDate);
			updateSubject.setModifiedDate(date);
			
			subjectPersistence.update(updateSubject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DeleteSubject(long subjectId) {
		try {
			Subject deleteSubject = subjectPersistence.findByPrimaryKey(subjectId);
			subjectPersistence.remove(deleteSubject);
		} catch (Exception e) {
			
		}
	}
	
	public Subject findSubjectId (long subjectId) {
		try {
			return subjectPersistence.findByPrimaryKey(subjectId);
		} catch (Exception e) {
			return null;
		}
	}
	
   public Subject findByGroupAndProjectAndRandomNo (long groupId, long projectId, String randomNo) {
	      try {
	         return subjectPersistence.findByG_P_R(groupId, projectId, randomNo);
	      } catch (Exception e) {
	         return null;
	      }
	   }
	
	public List<Subject> findByInstitution (long InstitutionId) {
		
		return subjectPersistence.findByInstitutionId(InstitutionId);
		
	}
	
    public List<Subject> getG_P(long groupId, long projectId) {
        return subjectPersistence.findByG_P(groupId, projectId);
    }
}
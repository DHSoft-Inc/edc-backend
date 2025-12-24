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
import com.dhsoft.edc.backend.service.RandomizationLocalServiceUtil;
import com.dhsoft.edc.backend.service.base.RandomizationLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.Randomization",
	service = AopService.class
)
public class RandomizationLocalServiceImpl
	extends RandomizationLocalServiceBaseImpl {
	
	public void AddRandomization(long companyId, long groupId, long projectId, long userId, String userName, int status, String randomNo, int useStatus, int sourceType, String criteria, long expGroupId) {
		long randomizationId = CounterLocalServiceUtil.increment("randomizationId");
		Date date = new Date();
		Randomization newRandomization = randomizationPersistence.create(randomizationId);
		newRandomization.setCompanyId(companyId);
		newRandomization.setGroupId(groupId);
		newRandomization.setProjectId(projectId);
		newRandomization.setUserId(userId);
		newRandomization.setUserName(userName);
		newRandomization.setCreateDate(date);
		newRandomization.setModifiedDate(date);
		newRandomization.setStatus(status);
		newRandomization.setStatusByUserId(userId);
		newRandomization.setStatusByUserName(userName);
		newRandomization.setStatusDate(date);
		newRandomization.setRandomNo(randomNo);
		newRandomization.setUseStatus(useStatus);
		newRandomization.setSourceType(sourceType);
		newRandomization.setCriteria(criteria);
		newRandomization.setExpGroupId(expGroupId);
		randomizationPersistence.update(newRandomization);
	}
	
	public void UpdateRandomization(long randomizationId, long userId, String userName, int status, String randomNo, int useStatus, int sourceType, String criteria, long expGroupId) {
		Randomization updateRandomization = RandomizationLocalServiceUtil.findByRandomizationId(randomizationId);
		Date date = new Date();
		int originStatus = updateRandomization.getStatus();
		if(originStatus != status)
		{
			updateRandomization.setStatus(status);
			updateRandomization.setStatusByUserId(userId);
			updateRandomization.setStatusByUserName(userName);
			updateRandomization.setStatusDate(date);
		}
		updateRandomization.setRandomNo(randomNo);
		updateRandomization.setUseStatus(useStatus);
		updateRandomization.setSourceType(sourceType);
		updateRandomization.setCriteria(criteria);
		updateRandomization.setExpGroupId(expGroupId);
		updateRandomization.setModifiedDate(date);
		randomizationPersistence.update(updateRandomization);
	}
	
	public void DeleteRandomization(long randomizationId) {
		Randomization deleteRandomization = RandomizationLocalServiceUtil.findByRandomizationId(randomizationId);
		randomizationPersistence.remove(deleteRandomization);
	}
	
	
	public Randomization findByRandomizationId(long randomizationId) {
		try {
			return randomizationPersistence.findByPrimaryKey(randomizationId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Randomization findByRandomNo(String randomNo) {
		try {
			return randomizationPersistence.findByRandomNo(randomNo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Randomization findByExpGroupId(long expGroupId) {
		try {
			return randomizationPersistence.findByExpGroupId(expGroupId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
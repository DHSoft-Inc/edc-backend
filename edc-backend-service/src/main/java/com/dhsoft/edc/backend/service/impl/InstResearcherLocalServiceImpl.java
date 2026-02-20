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
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.InstResearcher",
	service = AopService.class
)
public class InstResearcherLocalServiceImpl
	extends InstResearcherLocalServiceBaseImpl {
	
	private static final Log _log = LogFactoryUtil.getLog(InstResearcherLocalServiceImpl.class);
	
	public void addRequest (long groupId, long companyId, long projectId, long userId, String Institution) {
		_log.info("Received projectId: " + projectId);
		_log.info("Received userId: " + userId);
		long researcherId = CounterLocalServiceUtil.increment("researcherId");
		try {
			InstResearcher ir = instResearcherPersistence.create(researcherId);
			
		} catch (Exception e) {
			
		}
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
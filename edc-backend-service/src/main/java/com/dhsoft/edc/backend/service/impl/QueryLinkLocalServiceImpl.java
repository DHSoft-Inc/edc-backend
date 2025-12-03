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

import com.dhsoft.edc.backend.model.QueryLink;
import com.dhsoft.edc.backend.service.base.QueryLinkLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.QueryLink",
	service = AopService.class
)
public class QueryLinkLocalServiceImpl extends QueryLinkLocalServiceBaseImpl {
	
	public List<QueryLink> findByInstanceId (long instanceId) {
		return queryLinkPersistence.findByInstanceId(instanceId);
	}
	
	public List<QueryLink> findBySubjectId (long subjectId) {
		return queryLinkPersistence.findBySubjectId(subjectId);
	}
	
	public List<QueryLink> findByS_VG_VD_VC_S (long subjectId, long visitGroupId, long visitDefinitionId, long visitCRFId, long subCRFId) {
		return queryLinkPersistence.findByS_VG_VD_VC_S(subjectId, visitGroupId, visitDefinitionId, visitCRFId, subCRFId);
	}
}
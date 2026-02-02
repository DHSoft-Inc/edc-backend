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

import com.dhsoft.edc.backend.model.Project;
import com.dhsoft.edc.backend.service.base.ProjectLocalServiceBaseImpl;
import com.dhsoft.edc.backend.service.persistence.ProjectPersistence;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.Project",
	service = AopService.class
)
public class ProjectLocalServiceImpl extends ProjectLocalServiceBaseImpl {
	

	public Project findByProjectId(long projectId) {
		try {
			return projectPersistence.findByPrimaryKey(projectId);
		} catch (Exception e) {
			return null;
		}
	}

   public List<Project> findByGroupId(long groupId) {
       return projectPersistence.findByGroupId(groupId);
   }
   
   public List<Project> getByGroupId(long groupId) {
       return projectPersistence.findByGroupId(groupId);
   }
   
   
    public List<Project> getProjectByCode(String projectCode) {
        return projectPersistence.findByCode(projectCode);
    }
}
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

import com.dhsoft.edc.backend.exception.NoSuchVisitGroupException;
import com.dhsoft.edc.backend.model.VisitGroup;
import com.dhsoft.edc.backend.service.base.VisitGroupLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
    property = "model.class.name=com.dhsoft.edc.backend.model.VisitGroup",
    service = AopService.class
)
public class VisitGroupLocalServiceImpl extends VisitGroupLocalServiceBaseImpl {

	public VisitGroup updateVisitGroup(
            long visitGroupId,
            long expGroupId,
            String visitGroupCode,
            String name,
            String description,
            int activeStatus
    ) throws NoSuchVisitGroupException {

        VisitGroup vg = visitGroupPersistence.findByPrimaryKey(visitGroupId);

        vg.setExpGroupId(expGroupId);
        vg.setVisitGroupCode(visitGroupCode);
        vg.setName(name);
        vg.setDescription(description);
        vg.setActiveStatus(activeStatus);
        vg.setModifiedDate(new Date());

        return visitGroupPersistence.update(vg);
    }
	
	public VisitGroup deleteVisitGroup(long visitGroupId) {

	    VisitGroup vg = visitGroupPersistence.fetchByPrimaryKey(visitGroupId);

	    if (vg == null) {
	        // 이미 삭제됐거나 없는 경우 → 그냥 null 리턴
	        return null;
	    }

	    return visitGroupPersistence.remove(vg);
	}
	  
    public List<VisitGroup> findByG_P(long groupId, long projectId) {
        return visitGroupPersistence.findByG_P(groupId, projectId);
    }

    /**
     * ✅ (방법 A) 짧은 버전 addVisitGroup
     * ResourceCommand에서 편하게 쓰기 위한 오버로드.
     * status / statusBy / statusDate / activeDate는 기본값으로 채움.
     */
    public VisitGroup addVisitGroup(
            long companyId,
            long groupId,
            long projectId,
            long userId,
            String userName,
            long expGroupId,
            String visitGroupCode,
            String name,
            String description,
            int activeStatus
    ) {
        Date now = new Date();

        // 기본 status 값은 네 프로젝트 규칙에 맞게 조정 가능
        int status = 0;

        return addVisitGroup(
            companyId,
            groupId,
            projectId,
            userId,
            userName,
            status,
            userId,      // statusByUserId
            userName,    // statusByUserName
            now,         // statusDate
            expGroupId,
            visitGroupCode,
            name,
            description,
            activeStatus,
            now          // activeDate
        );
    }

    /**
     * ✅ 긴 버전 addVisitGroup (VisitEvent 스타일)
     * 실제 create + set + persistence.update 수행.
     * (ServiceBuilder Util에서 요구하는 시그니처와 동일하게 유지)
     */
    public VisitGroup addVisitGroup(
            long companyId,
            long groupId,
            long projectId,
            long userId,
            String userName,
            int status,
            long statusByUserId,
            String statusByUserName,
            Date statusDate,
            long expGroupId,
            String visitGroupCode,
            String name,
            String description,
            int activeStatus,
            Date activeDate
    ) {
        Date now = new Date();

        // ✅ PK 생성 (네 스타일 유지)
        long visitGroupId = counterLocalService.increment("visitGroup");

        VisitGroup vg = visitGroupPersistence.create(visitGroupId);

        // group instance / audit
        vg.setCompanyId(companyId);
        vg.setGroupId(groupId);
        vg.setProjectId(projectId);

        vg.setUserId(userId);
        vg.setUserName(userName);
        vg.setCreateDate(now);
        vg.setModifiedDate(now);

        // workflow
        vg.setStatus(status);
        vg.setStatusByUserId(statusByUserId);
        vg.setStatusByUserName(statusByUserName);
        vg.setStatusDate(statusDate != null ? statusDate : now);

        // entity fields
        vg.setExpGroupId(expGroupId);
        vg.setVisitGroupCode(visitGroupCode);
        vg.setName(name);
        vg.setDescription(description);
        vg.setActiveStatus(activeStatus);

        // activeDate는 null이면 now로
        vg.setActiveDate(activeDate != null ? activeDate : now);

        return visitGroupPersistence.update(vg);
    }
    
  
}

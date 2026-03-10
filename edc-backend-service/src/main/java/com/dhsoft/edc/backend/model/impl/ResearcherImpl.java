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

package com.dhsoft.edc.backend.model.impl;

import com.dhsoft.edc.backend.constant.CommonProperty;
import com.dhsoft.edc.backend.constant.ResearcherProperty;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author Brian Wing Shun Chan
 */
public class ResearcherImpl extends ResearcherBaseImpl {
    public JSONObject toJSON() {
        JSONObject researcher = JSONFactoryUtil.createJSONObject();
        
        researcher.put(ResearcherProperty.RESEARCHER_ID, this.getResearcherId());

        researcher.put(CommonProperty.COMPANY_ID, this.getCompanyId());
        researcher.put(CommonProperty.USER_ID, this.getUserId());
        researcher.put(CommonProperty.USER_NAME, this.getUserName());
        researcher.put(CommonProperty.CREATE_DATE, this.getCreateDate());
        researcher.put(CommonProperty.MODIFIED_DATE, this.getModifiedDate());
        
        researcher.put(CommonProperty.STATUS, this.getStatus());
        researcher.put(CommonProperty.STATUS_BY_USER_ID, this.getStatusByUserId());
        researcher.put(CommonProperty.STATUS_BY_USER_NAME, this.getStatusByUserName());
        researcher.put(CommonProperty.STATUS_DATE, this.getStatusDate());
        
        researcher.put(ResearcherProperty.EMAIL, this.getEmail());
        researcher.put(ResearcherProperty.NAME, this.getName());
        researcher.put(ResearcherProperty.PRIVACY_AGREE, this.getPrivacyAgree());
        researcher.put(ResearcherProperty.TERM_OF_USE_AGREE, this.getTermOfUseAgree());
        researcher.put(ResearcherProperty.RESEARCHER_USER_ID, this.getResearcherUserId());
        
        return researcher; 
    }
}
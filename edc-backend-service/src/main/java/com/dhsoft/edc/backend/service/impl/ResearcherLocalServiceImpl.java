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

import com.dhsoft.edc.backend.exception.NoSuchResearcherException;
import com.dhsoft.edc.backend.model.InstResearcher;
import com.dhsoft.edc.backend.model.Researcher;
import com.dhsoft.edc.backend.service.InstResearcherLocalService;
import com.dhsoft.edc.backend.service.base.ResearcherLocalServiceBaseImpl;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ContactLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.dhsoft.edc.backend.model.Researcher",
	service = AopService.class
)
public class ResearcherLocalServiceImpl extends ResearcherLocalServiceBaseImpl {
	private Log _log = LogFactoryUtil.getLog(ResearcherLocalServiceImpl.class);

	@Reference
	private InstResearcherLocalService _instResearcherLocalService;

	@Reference
	private ContactLocalService _contactLocalService;
	
	@Reference
	private RoleLocalService _roleLocalService;

	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)
	public Researcher addResearcherWithUser(
			long companyId,
			long facebookId, String openId,
			String languageId, boolean male, String jobTitle,
			long prefixId, long suffixId,
			String emailAddress, String password1, String password2,
			String screenName,  String firstName, String lastName,
			int birthYear, int birthMonth, int birthDay, 
			ServiceContext userServiceContext, ServiceContext researcherServiceContext) {
		
		long createUserId = researcherServiceContext.getUserId();
		User createUser = null;
		
		try {
			createUser = super.userLocalService.getUser(createUserId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// add user
		boolean autoPassword = false;
		boolean autoScreenName = false;
		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;
		boolean sendEmail = true;
		
		User user = null;
		Researcher researcher = null;
		
		_log.info("start add user");
		try {
			user = userLocalService.addUserWithWorkflow(
					createUserId, companyId, autoPassword, password1, password2, 
					autoScreenName, screenName, emailAddress, facebookId, openId, 
					LocaleUtil.fromLanguageId(languageId), firstName, null, lastName, prefixId, suffixId, 
					male, birthMonth, birthDay, birthYear, jobTitle, groupIds, 
					organizationIds, roleIds, userGroupIds, sendEmail, userServiceContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		_log.info("end add user");
		
		_log.info("start add researcher");
		long researcherUserId = user.getUserId();
		
		long researcherId = super.counterLocalService.increment();
		try {
			researcher = super.researcherLocalService.createResearcher(researcherId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// set audit fields
		researcher.setUserId(createUserId);
		researcher.setCompanyId(companyId);
		researcher.setUserName(createUser.getFullName());
		researcher.setCreateDate(new Date());
		researcher.setModifiedDate(new Date());
		
		researcher.setStatus(WorkflowConstants.STATUS_APPROVED);
		researcher.setStatusByUserId(createUserId);
		researcher.setStatusByUserName(createUser.getFullName());
		researcher.setStatusDate(new Date());
		
		researcher.setExpandoBridgeAttributes(researcherServiceContext);
		
		String fullName = lastName + StringPool.SPACE + firstName;
		
		// set entity fields
		researcher.setName(fullName);
		researcher.setEmail(emailAddress);
		researcher.setResearcherUserId(researcherUserId);
		
		try {		
			super.researcherPersistence.update(researcher);
		
			resourceLocalService.addResources(
					researcher.getCompanyId(), 0, createUserId,
					Researcher.class.getName(), researcherId,
					false, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		_log.info("end add researcher");
		
		// add inst researcher
		// _instResearcherLocalService
		
		return researcher;
	}
	
	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)	
	public Researcher addResearcherWithInstitution(
			long companyId, long groupId,
			long facebookId, String openId,
			String languageId, boolean male, String jobTitle,
			long prefixId, long suffixId,
			String emailAddress, String password1, String password2,
			String screenName,  String firstName, String lastName,
			int birthYear, int birthMonth, int birthDay,
			long projectId, long instId,
			ServiceContext userServiceContext, ServiceContext researcherServiceContext, ServiceContext instResearcherServiceContext ) {
		
		Researcher researcher = null;
		
		_log.info("call add researcher with user");
		try {
			researcher = this.addResearcherWithUser(companyId, facebookId, openId, languageId, male, jobTitle, prefixId, suffixId, emailAddress, password1, password2, screenName, firstName, lastName, birthYear, birthMonth, birthDay, userServiceContext, researcherServiceContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// add inst-researcher
		_log.info("start add inst-researcher");
		
		try {
			_instResearcherLocalService.addInstResearcher(companyId, groupId, projectId, instId, researcher.getResearcherId(), instResearcherServiceContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		_log.info("end add inst-researcher");
		
		return researcher;		
	}
	
	
	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)
	public Researcher updateResearcherWithUser(
			long researcherId,
			boolean male, String password1,
			String screenName,  String firstName, String lastName,
			int birthYear, int birthMonth, int birthDay, 
			ServiceContext userServiceContext, ServiceContext researcherServiceContext
			) {
		Researcher researcher = null;
		
		_log.info("get researcher");
		try {
			researcher = super.researcherLocalService.getResearcher(researcherId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Date birth = PortalUtil.getDate(birthMonth, birthDay, birthYear);
		long userId = userServiceContext.getUserId();
		User user = null;
		
		_log.info("get current login user");
		try {
			user = super.userLocalService.getUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// set attributes
		User researcherUser = null;
		
		_log.info("get researcher user");
		try {
			researcherUser = super.userLocalService.getUser(researcher.getResearcherUserId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// email cannot changed
		researcherUser.setScreenName(screenName);
		researcherUser.setFirstName(firstName);
		researcherUser.setLastName(lastName);
		
		_log.info("update researcher user");
		try {
			super.userLocalService.updateUser(researcherUser);
			
			// password change
			if(Validator.isNotNull(password1)) {
				super.userLocalService.updatePassword(researcherUser.getUserId(), password1, password1, false);
			}
			
			Contact contact = _contactLocalService.getContact(researcherUser.getContactId());
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setBirthday(birth);
			contact.setMale(male);
					
			_contactLocalService.updateContact(contact);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String fullName = lastName + StringPool.SPACE + firstName;
		
		researcher.setModifiedDate(researcherServiceContext.getModifiedDate());
		researcher.setExpandoBridgeAttributes(researcherServiceContext);
		
		researcher.setModifiedDate(new Date());
		researcher.setName(fullName);
		
		_log.info("updater researcher");
		try {
			super.researcherPersistence.update(researcher);
			super.resourceLocalService.updateResources(
					researcher.getCompanyId(), researcherServiceContext.getScopeGroup().getParentGroupId(),
					Researcher.class.getName(), researcher.getResearcherId(),
					researcherServiceContext.getModelPermissions());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return researcher;
	}
	
	@Indexable(type=IndexableType.REINDEX)
	@Transactional(rollbackFor = Exception.class)	
	public Researcher updateResearcherWithInstitution(
			long researcherId, long institutionId,
			boolean male, String password1,
			String screenName,  String firstName, String lastName,
			int birthYear, int birthMonth, int birthDay, 
			ServiceContext userServiceContext, ServiceContext researcherServiceContext, ServiceContext instResearcherServiceContext ) {
		
		Researcher researcher = null;
		
		_log.info("call update researcher with user");
		try {
			researcher = this.updateResearcherWithUser(researcherId, male, password1, screenName, firstName, lastName, birthYear, birthMonth, birthDay, userServiceContext, researcherServiceContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// update inst-researcher
		_log.info("start update inst-researcher");
		
		try {
			// check diff
			// if diff, delete & add
			// if same, do nothing
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		_log.info("end update inst-researcher");
		
		return researcher;
	}
	
	
	@Indexable(type=IndexableType.DELETE)
	@Transactional(rollbackFor = Exception.class)
	public Researcher deleteResearcherWithUser(long researcherId) {
		Researcher researcher = null;
		if(researcherId > 0) {
			_log.info("delete researcher and user and inst-researcher");
			try {
				researcher = super.researcherLocalService.getResearcher(researcherId);
				
				// delete researcher
				super.researcherPersistence.remove(researcher);
				resourceLocalService.deleteResource(
						researcher.getCompanyId(), Researcher.class.getName(),
						ResourceConstants.SCOPE_INDIVIDUAL, researcher.getResearcherId());

				// remove other related entity
				
				// delete user
				long userId = researcher.getResearcherUserId();
				if(userId > 0)
					super.userLocalService.deleteUser(userId);
				
				// delete instResearchers
				List<InstResearcher> instResearcherList = _instResearcherLocalService.getByResearcherIdAll(researcherId); 
				for(int i=0; i<instResearcherList.size(); i++) {
					InstResearcher instResearcher = instResearcherList.get(i);
					_instResearcherLocalService.deleteInstResearcher(instResearcher);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return researcher;
	}

	@Indexable(type=IndexableType.DELETE)
	@Transactional(rollbackFor = Exception.class)
	public Researcher deleteResearcher(Researcher researcher) {
		this.deleteResearcherWithUser(researcher.getResearcherId());
		return researcher;
	}
	
	public List<Researcher> getResearcherBySite(long siteId) {
		List<User> siteUsers = super.userLocalService.getGroupUsers(siteId);
		List<Researcher> siteResearchers = new ArrayList<>();

		long[] userIds = null;
		ArrayList<Long> userIdList = new ArrayList<Long>(); 
		for(User user : siteUsers) {
			long userId = user.getUserId();
			
			if(userId > 0) {
				userIdList.add(new Long(userId));
			}
		}
		
		userIds = userIdList.stream().mapToLong(l -> l).toArray();
		
		siteResearchers = researcherFinder.findByUserIds(userIds);
		
		_log.info("[size match check] site users / user ids / site researchers : " + siteUsers.size() + " / " + userIds.length + " / " + siteResearchers.size());
		
		return siteResearchers;
	}
	
	public List<Researcher> getResearcherByProject(long projectId) {
		List<Researcher> result = super.researcherFinder.findByProjectId(projectId);
		return result;
	}
	
	public List<Researcher> getResearcherByInst(long instId) {
		List<Researcher> result = super.researcherFinder.findByInstId(instId);
		return result;
	}
	
	public Researcher getResearcherByUserId(long researcherUserId) throws NoSuchResearcherException {
		Researcher result = super.researcherPersistence.findByResearcherUserId(researcherUserId);
		return result;
	}
}
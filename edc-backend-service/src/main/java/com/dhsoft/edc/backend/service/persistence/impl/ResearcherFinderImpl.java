package com.dhsoft.edc.backend.service.persistence.impl;

import com.dhsoft.edc.backend.model.InstResearcher;
import com.dhsoft.edc.backend.model.Researcher;
import com.dhsoft.edc.backend.service.ResearcherLocalService;
import com.dhsoft.edc.backend.service.persistence.ResearcherFinder;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ResearcherFinder.class)
public class ResearcherFinderImpl extends ResearcherFinderBaseImpl implements ResearcherFinder {
	@Reference
	private ResearcherLocalService _researcherLoaclService;
	
	public List<Researcher> findByUserIds(long[] userIds) {
		Session session = null;
		List<Researcher> resultList = new ArrayList<>();
				
		// parameter check
		if(Validator.isNotNull(userIds)) {
			try {
				session = openSession();
				ClassLoader classLoader = getClass().getClassLoader();
				DynamicQuery researcherQuery = DynamicQueryFactoryUtil.forClass(Researcher.class, "researcher", classLoader);
				
				if(Validator.isNotNull(userIds) && userIds.length > 0) {
					researcherQuery.add(PropertyFactoryUtil.forName("researcherUserId").in(userIds));
				}
				
				resultList = _researcherLoaclService.dynamicQuery(researcherQuery);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeSession(session);
			}
		}
		
		return resultList;
	}
	
	public List<Researcher> findByProjectId(long projectId) {
		Session session = null;
		List<Researcher> resultList = new ArrayList<>();
		
		try {
			session = openSession();
			
			ClassLoader classLoader = getClass().getClassLoader();
			
			DynamicQuery instResearcherQuery = DynamicQueryFactoryUtil.forClass(InstResearcher.class, classLoader)
					.add(RestrictionsFactoryUtil.eq("projectId", projectId))
					.setProjection(ProjectionFactoryUtil.property("researcherId"));
			
			Order order = OrderFactoryUtil.desc("createDate");
			
			DynamicQuery researcherQuery = DynamicQueryFactoryUtil.forClass(Researcher.class, classLoader)
					.add(PropertyFactoryUtil.forName("researcherId").in(instResearcherQuery))
					.addOrder(order);
			
			resultList = _researcherLoaclService.dynamicQuery(researcherQuery);
		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				e.printStackTrace();
			}
			
		} finally {
			closeSession(session);
		}
		
		return resultList;
	}
	
	public List<Researcher> findByInstId(long instId) {
		Session session = null;
		List<Researcher> resultList = new ArrayList<>();
		
		try {
			session = openSession();
			
			ClassLoader classLoader = getClass().getClassLoader();
			
			DynamicQuery instResearcherQuery = DynamicQueryFactoryUtil.forClass(InstResearcher.class, classLoader)
					.add(RestrictionsFactoryUtil.eq("institutionId", instId))
					.setProjection(ProjectionFactoryUtil.property("researcherId"));
			
			Order order = OrderFactoryUtil.desc("createDate");
			
			DynamicQuery researcherQuery = DynamicQueryFactoryUtil.forClass(Researcher.class, classLoader)
					.add(PropertyFactoryUtil.forName("researcherId").in(instResearcherQuery))
					.addOrder(order);
			
			resultList = _researcherLoaclService.dynamicQuery(researcherQuery);
		} catch (Exception e) {
			try {
				throw new SystemException(e);
			} catch (SystemException se) {
				e.printStackTrace();
			}
			
		} finally {
			closeSession(session);
		}
		
		return resultList;
	}
}

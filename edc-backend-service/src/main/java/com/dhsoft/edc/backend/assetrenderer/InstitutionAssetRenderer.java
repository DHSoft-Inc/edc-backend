package com.dhsoft.edc.backend.assetrenderer;

import com.dhsoft.edc.backend.model.Institution;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;

public class InstitutionAssetRenderer extends BaseJSPAssetRenderer<Institution> {
	
    public InstitutionAssetRenderer(
            Institution inst,
            ModelResourcePermission<Institution> modelResourcePermission) {

            _inst = inst;
            _modelResourcePermission = modelResourcePermission;
        }

        @Override
        public Institution getAssetObject() {
            return _inst;
        }

        @Override
        public long getClassPK() {
            return _inst.getInstitutionId();
        }

        @Override
        public String getClassName() {
            return Institution.class.getName();
        }

        @Override
        public String getTitle(Locale locale) {
            return _inst.getName();
        }

        @Override
        public boolean hasViewPermission(PermissionChecker permissionChecker)
            throws PortalException {

            return _modelResourcePermission.contains(
                permissionChecker, _inst, ActionKeys.VIEW);
        }

        @Override
        public String getURLViewInContext(
            LiferayPortletRequest liferayPortletRequest,
            LiferayPortletResponse liferayPortletResponse,
            String noSuchEntryRedirect) throws Exception {

            ThemeDisplay themeDisplay =
                (ThemeDisplay)liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);

            long plid = PortalUtil.getPlidFromPortletId(
                themeDisplay.getScopeGroupId(),
                false,
                "com_dhsoft_edc_institution_web_InstitutionPortlet"
            );

            if (plid == LayoutConstants.DEFAULT_PLID) {
                return noSuchEntryRedirect;
            }

            PortletURL url = PortletURLFactoryUtil.create(
                liferayPortletRequest,
                "com_dhsoft_edc_institution_web_InstitutionPortlet",
                plid,
                PortletRequest.RENDER_PHASE
            );

            url.setParameter("mvcRenderCommandName", "/institution/view"); 
            url.setParameter("institutionId", String.valueOf(_inst.getInstitutionId()));

            return url.toString();
        }

        @Override
        public String getJspPath(HttpServletRequest request, String template) {
            if (TEMPLATE_FULL_CONTENT.equals(template)) {
                return "/asset/institution_full_content.jsp";
            }
            return null;
        }

        private final Institution _inst;
        private final ModelResourcePermission<Institution> _modelResourcePermission;
		@Override
		public long getGroupId() {
			// TODO Auto-generated method stub
			return _inst.getGroupId();
		}

		@Override
		public long getUserId() {
			// TODO Auto-generated method stub
			return _inst.getUserId();
		}

		@Override
		public String getUserName() {
			// TODO Auto-generated method stub
			return _inst.getUserName();
		}

		@Override
		public String getUuid() {
			// TODO Auto-generated method stub
			return _inst.getUuid();
		}

		@Override
		public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
			// TODO Auto-generated method stub
			return _inst.getName();
		}

}

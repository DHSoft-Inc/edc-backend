package com.dhsoft.edc.backend.workflow;

import com.dhsoft.edc.backend.model.Institution;
import com.dhsoft.edc.backend.service.InstitutionLocalService;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = "model.class.name=" + "com.dhsoft.edc.backend.model.Institution", service = WorkflowHandler.class)
public class InstitutionWorkflowHandler extends BaseWorkflowHandler<Institution> {

    @Override
    public String getClassName() {
        return Institution.class.getName();
    }

    @Override
    public String getType(Locale locale) {
        return _resourceActions.getModelResource(locale, getClassName());
    }

    @Override
    public String getURLViewInContext(
            long classPK,
            LiferayPortletRequest liferayPortletRequest,
            LiferayPortletResponse liferayPortletResponse,
            String noSuchEntryRedirect) {

        try {
            AssetRenderer<Institution> assetRenderer = getAssetRenderer(classPK); // PortalException 가능
            if (assetRenderer == null) {
                return noSuchEntryRedirect;
            }

            ThemeDisplay themeDisplay =
                (ThemeDisplay)liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);


            if (!assetRenderer.hasViewPermission(themeDisplay.getPermissionChecker())) {
                return noSuchEntryRedirect;
            }

            return assetRenderer.getURLViewInContext(
                liferayPortletRequest, liferayPortletResponse, noSuchEntryRedirect);
        }
        catch (PortalException e) {
            return noSuchEntryRedirect;
        }
        catch (RuntimeException e) {

            return noSuchEntryRedirect;
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }

    @Override
    public Institution updateStatus(int status, Map<String, Serializable> workflowContext)
        throws PortalException {

        long userId = GetterUtil.getLong(
            (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));

        long classPK = GetterUtil.getLong(
            (String)workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

        ServiceContext serviceContext =
            (ServiceContext)workflowContext.get(WorkflowConstants.CONTEXT_SERVICE_CONTEXT);

        if (serviceContext == null) {
            serviceContext = (ServiceContext)workflowContext.get("serviceContext");
        }

        return _institutionLocalService.updateStatus(userId, classPK, status, serviceContext);
    }

    @Reference(unbind = "-")
    protected void setResourceActions(ResourceActions resourceActions) {
        _resourceActions = resourceActions;
    }

    @Reference(unbind = "-")
    protected void setInstitutionLocalService(InstitutionLocalService institutionLocalService) {
        _institutionLocalService = institutionLocalService;
    }

    private ResourceActions _resourceActions;
    private InstitutionLocalService _institutionLocalService;
}

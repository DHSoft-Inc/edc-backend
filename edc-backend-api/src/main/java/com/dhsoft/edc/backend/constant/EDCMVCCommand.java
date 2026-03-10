package com.dhsoft.edc.backend.constant;

/**
 * @author dev-ryu
 *
 */
public class EDCMVCCommand {
    public static final String RENDER_LOGIN_CREATE_ACCOUNT = "/login/create_account";
	public static final String RENDER_VIEW_PRIVACY_AGREEMENT = "/view/researcher/view-privacy-agreement";
	public static final String RENDER_LIST_RESEARCHER = "/view/researcher/list-researcher";
	
	public static final String ACTION_ADD_RESEARCHER = "/action/researhcer/add-researcher";
	
	public static final String RESOURCE_LOAD_RESEARCHERS = "/resource/researhcer/load-researchers";
	public static final String RESOURCE_ADD_RESEARCHER = "/resource/researhcer/add-researcher";
	public static final String RESOURCE_UPDATE_RESEARCHER = "/resource/researhcer/update-researcher";
	public static final String RESOURCE_DELETE_RESEARCHER = "/resource/researhcer/delete-researcher";
	
	public static final String RESOURCE_ADD_INST_RESEARCHER= "/resource/inst-researhcer/add-inst-researcher";
	public static final String RESOURCE_DELETE_INST_RESEARCHER= "/resource/inst-researhcer/delete-inst-researcher";
}

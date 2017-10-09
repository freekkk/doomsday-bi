package cn.relaxtech.doomsday.bi.boot.constant;

/**
 * APP中常量定义
 * Created by zhoulinghong on 2017/6/24.
 */
public class AppConstant {

    public static final String EVENTHANDLER_PACKAGENAME="cn.relaxtech.doomsday.bi.boot.handler.handler";

    public static final String HANDLER_NOT_FOUND="handler_not_found";
    public static final String HANDLER_SUCCESS="handler_success";
    public static final String MODEL_FORM_EVENT_ID_NULL="model_form_event_id_null";
    public static final String MODEL_FORM_EVENT_DATA_NULL="model_form_event_data_null";
    public static final String MODEL_FORM_NOT_FOUND="model_form_not_found";
    //--------------定义事件处理器 handlerName----------------------------------
    public static final String HANDLER_BASE="BaseEventHandler";
    public static final String HANDLER_ALLIANCECREATE="allianceCreate";
    public static final String HANDLER_STORYMISSION="storyMission";

    //--------------定义事件处理器 handlerName----------------------------------

    /*--------------Desc------------------------------*/
    public static final String DESC_SYSTEM_CONF_PARAMS_NOT_ALLOW_NULL="system_conf_params_not_allow_null";

    /*--------------Desc------------------------------*/

    /*--------------SystemConf------------------------------*/
    //单服操作
    public static final String GET_SERVER_START_DATE ="get_server_start_date"; //获取开服时间
    public static final String UPDATE_SERVER_START_DATE ="update_server_start_date"; //获取开服时间
    public static final String CONF_CLEAR_CURRENT_DATA="clear_current_data";//清理实时数据
    public static final String CONF_UPLOAD_ROI_DATA ="proc_conf_upload_roi_data";//上传ROI成本数据
    public static final String CONF_UPLOAD_MONEY_IGNORE_HUMAN="conf_upload_money_ignore_human";//上传充值白名单
    public static final String PROC_CONF_GENERAL_DATA="proc_conf_general_data";//计算整体数据
    public static final String PROC_CONF_GENERAL_DETIAL_DATA="proc_conf_general_detail_data";//计算国家据渠道数据
    public static final String PROC_CONF_LTV_DATA="proc_conf_ltv_data";//计算LTV数据
    public static final String PROC_CONF_MONEY_DATA="proc_conf_money_data";//计算钻石数据
    public static final String PROC_CONF_MERGE_MISSION_LOG="proc_conf_merge_mission_log";//合并mission_log
    public static final String PROC_CONF_MERGE_CHARGE_LOG="proc_conf_merge_charge_log";//合并charge_log
    //全服操作
    public static final String PROC_CONF_FULL_GENERAL_DATA="proc_conf_full_general_data";//计算全服总体数据
    /*--------------SystemConf------------------------------*/

    /*--------------DB-TABLE-NAME---------------------------*/
    public static final String TABLE_CONF_MONEY_IGNORE_HUMAN="conf_money_ignore_human";
    public static final String TABLE_MISSION_LOG="mission_log";
    public static final String TABLE_CONF_ROI="conf_roi";
    public static final String TABLE_CHARGE_LOG="charge_log";
    public static final String TABLE_BI_CURRENT_DATA="bi_current_data";
    /*--------------DB-TABLE-NAME---------------------------*/

}
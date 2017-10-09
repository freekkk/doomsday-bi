package cn.relaxtech.doomsday.bi.boot.service;

import cn.relaxtech.doomsday.bi.boot.constant.AppConstant;
import cn.relaxtech.doomsday.bi.boot.dao.SystemConfDao;
import cn.relaxtech.doomsday.bi.boot.entity.SystemConfParams;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.ConfServer;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.MoneyIgnoreHuman;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.ConfRoi;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Splitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhoulinghong on 2017/9/18.
 */
@Service
public class SystemConfService {

    @Autowired
    private SystemConfDao systemConfDao;

    public String execProc(SystemConfParams params)
    {
        String procName=params.getProcName();
        String exeCode=null;
        switch (procName)
        {
            case AppConstant.GET_SERVER_START_DATE:
                exeCode= getServerStartDate();
               break;
            case AppConstant.UPDATE_SERVER_START_DATE:
                exeCode= updateServerStartDate(params.getStringData());
                break;
            case AppConstant.PROC_CONF_GENERAL_DATA:
                exeCode=procConfGeneralData(params);
                break;
            case AppConstant.PROC_CONF_GENERAL_DETIAL_DATA:
                exeCode=procConfGeneralDetailData(params);
                break;
            case AppConstant.PROC_CONF_LTV_DATA:
                exeCode=procConfLtvData(params);
                break;
            case AppConstant.PROC_CONF_MONEY_DATA:
                exeCode=procConfMoneyData(params);
                break;
            case AppConstant.PROC_CONF_MERGE_MISSION_LOG:
                exeCode=procConfMergeMissionLog(params);
                break;
            case AppConstant.PROC_CONF_MERGE_CHARGE_LOG:
                exeCode=proConfMergeChargeLog(params);
                break;
            case AppConstant.CONF_CLEAR_CURRENT_DATA:
                exeCode=confClearCurrentData(params);
                break;
            case AppConstant.CONF_UPLOAD_MONEY_IGNORE_HUMAN:
                exeCode=confUploadMoneyIgnoreHuman(params);
                break;
            case AppConstant.CONF_UPLOAD_ROI_DATA:
                exeCode=procConfUploadRoiData(params);
                break;
            //全服操作
            case AppConstant.PROC_CONF_FULL_GENERAL_DATA:
                exeCode=procConfFullGeneralData(params);
                break;
        }
        return exeCode;
    }

    public List<ConfServer> getConfServer(String ex){
        List<String> exList= Splitter.on(',').trimResults().omitEmptyStrings().splitToList(ex);
        return systemConfDao.getConfServer(exList);
    }

    private String getServerStartDate()
    {
       return systemConfDao.getServerStartDate();
    }

    private String updateServerStartDate(String date)
    {
        return systemConfDao.updateServerStartDate(date).toString();
    }


    private String procConfGeneralData(SystemConfParams params)
    {
        systemConfDao.confGeneralData(params);
        return params.getExeCode().toString();
    }

    private String procConfGeneralDetailData(SystemConfParams params)
    {
        systemConfDao.confGeneralDetailData(params);
        return params.getExeCode().toString();
    }

    private String procConfLtvData(SystemConfParams params)
    {
        systemConfDao.confLtvData(params);
        return params.getExeCode().toString();
    }

    private String procConfMoneyData(SystemConfParams params)
    {
        systemConfDao.confMoneyData(params);
        return params.getExeCode().toString();
    }

    private String procConfFullGeneralData(SystemConfParams params)
    {
        systemConfDao.procConfFullGeneralData(params);
        return params.getExeCode().toString();
    }

    private String confUploadMoneyIgnoreHuman(SystemConfParams params){
        if(params.getEmpty())
            systemConfDao.truncateTable(AppConstant.TABLE_CONF_MONEY_IGNORE_HUMAN);

        String jsonStr=params.getJsonData();
        //JSONArray jsonArray=JSONArray.parseArray(jsonStr);
        List<MoneyIgnoreHuman> list= JSON.parseArray(jsonStr,MoneyIgnoreHuman.class);

        return systemConfDao.confUploadMoneyIgnoreHuman(list).toString();
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public String procConfUploadRoiData(SystemConfParams params)
    {
        if(params.getEmpty())
            systemConfDao.truncateTable(AppConstant.TABLE_CONF_ROI);

        String jsonStr=params.getJsonData();
        List<ConfRoi> rois= JSON.parseArray(jsonStr,ConfRoi.class);

        return systemConfDao.confUploadRoiData(rois).toString();
    }

    private String procConfMergeMissionLog(SystemConfParams params)
    {
        systemConfDao.confMergeMissionLog(params);
        return params.getExeCode().toString();
    }

    private String proConfMergeChargeLog(SystemConfParams params)
    {
        systemConfDao.confMergeChargeLog(params);
        return params.getExeCode().toString();
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public String confClearCurrentData(SystemConfParams params)
    {
        if(params.getEmpty())
           return systemConfDao.truncateTable(AppConstant.TABLE_BI_CURRENT_DATA).toString();
        else {
            if (params.getStartDate() != null)
                return systemConfDao.confClearCurrentData(params).toString();
        }
        return AppConstant.DESC_SYSTEM_CONF_PARAMS_NOT_ALLOW_NULL;
    }
}

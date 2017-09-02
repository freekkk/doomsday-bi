package cn.relaxtech.doomsday.bi.boot.service.pointlog;

import cn.relaxtech.doomsday.bi.boot.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.BaseEventLog;
import cn.relaxtech.doomsday.bi.boot.dao.pointlog.BaseEventLogDao;
@Slf4j
@Service
public class BaseEventLogService{

    private static final String prefixTableName = "base_event_log";
    
    @Autowired
    private BaseEventLogDao baseEventLogDao;

    public int insert(BaseEventLog pojo){

        String nowDate=DateUtil.getNowTimeDateFormat("yyyy_MM_dd");
        pojo.setLogDate(nowDate);
        String tableName=prefixTableName+"_"+nowDate;
        return baseEventLogDao.insert(pojo,tableName);
    }

    public int update(BaseEventLog pojo){
        return baseEventLogDao.update(pojo);
    }
}

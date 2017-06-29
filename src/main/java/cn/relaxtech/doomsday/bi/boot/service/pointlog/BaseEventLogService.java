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

    @Autowired
    private BaseEventLogDao baseEventLogDao;

    public int insert(BaseEventLog pojo){
        pojo.setLogDate(DateUtil.getNowTimeDateFormat("yyyy_MM_dd"));
        return baseEventLogDao.insert(pojo);
    }

    public int update(BaseEventLog pojo){
        return baseEventLogDao.update(pojo);
    }
}

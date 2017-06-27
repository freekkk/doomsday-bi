package cn.relaxtech.doomsday.bi.boot.service.pointlog;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.BaseEventLog;
import cn.relaxtech.doomsday.bi.boot.dao.pointlog.BaseEventLogDao;

@Service
public class BaseEventLogService{

    @Resource
    private BaseEventLogDao baseEventLogDao;

    public int insert(BaseEventLog pojo){
        return baseEventLogDao.insert(pojo);
    }

    public int update(BaseEventLog pojo){
        return baseEventLogDao.update(pojo);
    }
}

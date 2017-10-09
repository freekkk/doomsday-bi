package cn.relaxtech.doomsday.bi.boot.service.pointlog;

import cn.relaxtech.doomsday.bi.boot.entity.pointlog.extendLog.AllianceCreateLog;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import cn.relaxtech.doomsday.bi.boot.dao.logger.AllianceCreateLogDao;

@Service
public class AllianceCreateLogService{

    @Resource
    private AllianceCreateLogDao allianceCreateLogDao;

    public int insert(AllianceCreateLog pojo){
        return allianceCreateLogDao.insert(pojo);
    }

    public int update(AllianceCreateLog pojo){
        return allianceCreateLogDao.update(pojo);
    }
}

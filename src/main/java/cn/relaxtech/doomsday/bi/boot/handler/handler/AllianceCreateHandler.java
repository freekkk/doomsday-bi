package cn.relaxtech.doomsday.bi.boot.handler.handler;

import cn.relaxtech.doomsday.bi.boot.entity.pointlog.extendLog.AllianceCreateLog;
import cn.relaxtech.doomsday.bi.boot.handler.IEventHandler;
import cn.relaxtech.doomsday.bi.boot.service.pointlog.AllianceCreateLogService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhoulinghong on 2017/6/24.
 */
@Component
public class AllianceCreateHandler implements IEventHandler {


    @Autowired
    private AllianceCreateLogService allianceCreateLogService;

    @Override
    public void handler(String eventId, String eventData) {

        //JsonString-->POJO
        AllianceCreateLog pojo= JSON.parseObject(eventData,AllianceCreateLog.class);

        allianceCreateLogService.insert(pojo);

    }
}

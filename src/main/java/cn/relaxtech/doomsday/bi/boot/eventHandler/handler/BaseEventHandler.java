package cn.relaxtech.doomsday.bi.boot.eventHandler.handler;

import cn.relaxtech.doomsday.bi.boot.entity.pointLog.BaseEventLog;
import cn.relaxtech.doomsday.bi.boot.eventHandler.IEventHandler;
import cn.relaxtech.doomsday.bi.boot.service.pointlog.BaseEventLogService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhoulinghong on 2017/6/24.
 */
@Component
public class BaseEventHandler implements IEventHandler {

    @Autowired
    private BaseEventLogService baseEventLogService;

    @Override
    public void handler(String eventId,String eventData) {
        //JSON-->POJO
        BaseEventLog baseEventLog= JSON.parseObject(eventData,BaseEventLog.class);
        baseEventLog.setEventId(eventId);
        baseEventLogService.insert(baseEventLog);
    }
}

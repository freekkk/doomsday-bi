package cn.relaxtech.doomsday.bi.boot.eventHandler.handler;

import cn.relaxtech.doomsday.bi.boot.entity.pointLog.extendLog.StoryMission;
import cn.relaxtech.doomsday.bi.boot.eventHandler.IEventHandler;
import cn.relaxtech.doomsday.bi.boot.service.pointlog.StoryMissionLogService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhoulinghong on 2017/6/23.
 */

@Component
public class StoryMissionHandler implements IEventHandler {


    @Autowired
    private StoryMissionLogService storyMissionService;

    @Override
    public void handler(String eventId,String eventData) {

        StoryMission pojo= JSON.parseObject(eventData, StoryMission.class);
        storyMissionService.log();
    }
}

package cn.relaxtech.doomsday.bi.boot.eventHandler;

import cn.relaxtech.doomsday.bi.boot.constant.AppConstant;
import cn.relaxtech.doomsday.bi.boot.eventHandler.handler.AllianceCreateHandler;
import cn.relaxtech.doomsday.bi.boot.eventHandler.handler.BaseEventHandler;
import cn.relaxtech.doomsday.bi.boot.eventHandler.handler.StoryMissionHandler;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * log事件处理管理器
 *说明：事件分发机制：
 * log格式为纯客户端定义数据结构。同时兼容TakingDta等第三方API
 * 当eventData和BaseEventLog一致时，直接使用BaseEventLog处理。需要分表，要不容易爆表
 * 当eventData包含额外数据时，需要用继承BaseEventLog的子类来完成 JOSN-->POJO。
 * 这时就需要用到具体handler来处理数据，同时数据库表也会有一张对应的来存储
 * Created by zhoulinghong on 2017/6/23.
 */
@Slf4j
@Component
public class EventHandlerManage {
	
    private Map<String,IEventHandler> map= Maps.newConcurrentMap();

    //需要用subEventHandler处理的事件

    @Value("${subEventIds}")
    private String subEventIds;
    private List<String> subEventList = Lists.newArrayList();

    @Autowired
    private BaseEventHandler baseEventHandler;

    @Autowired
    private StoryMissionHandler storyMissionHandler;

    @Autowired
    private AllianceCreateHandler allianceCreateHandler;


    //注册事件处理器
    @PostConstruct
    public void init()
    {

        subEventList =Splitter.on(',').trimResults().omitEmptyStrings().splitToList(subEventIds);

        //TODO:这里先手动的注册事件管理器。本来想直接反射扫描packageName下面的所有handler的，但是会和spring的Autowired不兼容。有空重构一下
        map.put(AppConstant.HANDLER_BASE,baseEventHandler);
        map.put(AppConstant.HANDLER_STORYMISSION,storyMissionHandler);
        map.put(AppConstant.HANDLER_ALLIANCECREATE,allianceCreateHandler);

    }

    public IEventHandler getHandlerByEventId(String eventId)
    {
        return map.get(eventId);
    }

    public IEventHandler getHandlerByHandlerName(String name)
    {
        return map.get(name);
    }

    public boolean useSubEventHandler(String eventId)
    {
        return subEventList.contains(eventId);
    }


//    @PostConstruct
//    public void init()throws ClassNotFoundException, IllegalAccessException, InstantiationException,NoSuchFieldException
//    {
//        log.info("init BaseHandler start");
//        List<String> fileNames= PackageUtil.getClassName(AppConstant.EVENTHANDLER_PACKAGENAME);
//
//        for(String className : fileNames)
//        {
//
//            Class clazz=Class.forName(className);
//
//            Field field=clazz.getDeclaredField("handler");
//            Object v=field.get(clazz);
//
//            map.put(v.toString(),(IEventHandler) clazz.newInstance());
//        }
//
//        log.info("init BaseHandler succ count:" +map.size());
//    }



}

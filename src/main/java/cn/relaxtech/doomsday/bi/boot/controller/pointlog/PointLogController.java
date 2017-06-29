package cn.relaxtech.doomsday.bi.boot.controller.pointlog;

import cn.relaxtech.doomsday.bi.boot.constant.AppConstant;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.ModelForm;
import cn.relaxtech.doomsday.bi.boot.eventHandler.IEventHandler;
import cn.relaxtech.doomsday.bi.boot.eventHandler.EventHandlerManage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 客户端打点API接口
 * Created by zhoulinghong on 2017/6/23.
 */
@Slf4j
@Api(value = "log API")
@RestController
@RequestMapping("/pointlog")
public class PointLogController {

    @Autowired
    private EventHandlerManage eventHandlerManage;


    @ApiOperation(value="eventData", notes="客户端发送打点事件记录log")
    @ApiImplicitParam(name = "form", value = "ModelForm", required = true,dataType = "ModelForm")
    @RequestMapping(value = "log",method = RequestMethod.POST)
    public String EventLog( ModelForm form)
    {
        if(form == null)
            return AppConstant.MODEL_FORM_NOT_FOUND;
        if(form.getEventId() ==null)
        {
            log.error(String.format(AppConstant.MODEL_FORM_EVENT_ID_NULL));
            return  AppConstant.MODEL_FORM_EVENT_ID_NULL;
        }

        if(form.getEventData() ==null)
        {
            log.error(String.format(AppConstant.MODEL_FORM_EVENT_DATA_NULL));
            return  AppConstant.MODEL_FORM_EVENT_DATA_NULL;
        }
        String eventId =form.getEventId();
        String eventData=form.getEventData();

        log.debug(String.format("Get Client eventId:%s eventData:%s",eventId,eventData));
        String handlerName=eventHandlerManage.useSubEventHandler(eventId)?eventId:AppConstant.HANDLER_BASE;

        //通过eventId 来区分打点操作
        IEventHandler baseEventHandler= eventHandlerManage.getHandlerByHandlerName(handlerName);
        if(baseEventHandler ==null) {
            log.error(String.format("{0} not found",eventId));
            return AppConstant.HANDLER_NOT_FOUND;
        }
        baseEventHandler.handler(eventId, eventData);
        return AppConstant.HANDLER_SUCCESS;
    }

//    @ApiOperation(value="eventData", notes="客户端发送打点事件记录log")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "eventId", value = "eventId", required = true, dataType = "String",paramType = "path"),
//            @ApiImplicitParam(name = "eventData", value = "eventData", required = true, dataType ="String",paramType = "path"),
//    })
//    @RequestMapping(value = "Log/{eventId}/{eventData}",method = RequestMethod.POST)
//    public String EventLog(@PathVariable String eventId, @PathVariable String eventData )
//    {
//        String handlerName=eventHandlerManage.useSubEventHandler(eventId)? AppConstant.HANDLER_BASE:eventId;
//
//        //通过eventId 来区分打点操作
//        IEventHandler baseEventHandler= eventHandlerManage.getHandlerByHandlerName(handlerName);
//        if(baseEventHandler ==null) {
//            log.error(String.format("{0} not found",eventId));
//            return AppConstant.HANDLER_NOT_FOUND;
//        }
//        baseEventHandler.handler(eventId, eventData);
//        return AppConstant.HANDLER_SUCCESS;
//    }

    //    @ApiOperation(value="storyMission", notes="剧情任务打点")
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "storyMission", value = "storyMission", required = true, dataType = "StoryMission")
//    })
//    @RequestMapping(value = "storyMission",method = RequestMethod.POST)
//    public void storyMission(@RequestBody StoryMission storyMission)
//    {
//        //storyMissionService.insert(storyMission);
//    }
}

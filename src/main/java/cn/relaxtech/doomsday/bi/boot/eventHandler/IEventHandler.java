package cn.relaxtech.doomsday.bi.boot.eventHandler;

/**
 * 处理客户端发上来的log请求。
 * 客户端发送：eventId+eventData.
 * evnetId 必须在子类中复写和客户端一直的名称
 * eventData JSON的字符串。在具体的业务handler里序列化成POJO使用
 * POJO参看BaseLogInfo
 * Created by zhoulinghong on 2017/6/23.
 */

public interface IEventHandler {
    void handler(String eventId,String eventData);
}

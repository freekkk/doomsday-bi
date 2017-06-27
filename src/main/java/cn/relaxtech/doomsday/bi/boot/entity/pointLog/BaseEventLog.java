package cn.relaxtech.doomsday.bi.boot.entity.pointLog;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * log基础信息。只记录事件产生的次数 使用
 * 基础信息和客户端发送的eventData一致。
 * 当eventData包含额外数据时，需要继承BaseLogInfo来增加对应属性，以完成json-->pojo
 * 同时减少一个evnet 对应一张数据库表的压力
 * 这个基础表的数据量会很大，需要分表处理
 * Created by zhoulinghong on 2017/6/24.
 */
@Data
public class BaseEventLog {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Long playerId; // 角色id

    private String playerName; // 角色名

    private Integer level;  //角色等级

    private Integer vipLevel; // 玩家的VIP等级

    private Integer vipExp; // 玩家的VIP经验

    private String country; // 用户当前国家

    private String language; // 用户当前语言

    private String deviceType; // 设备类型

    private String deviceId; // 设备ID

    private String allianceId; // 联盟ID

    private Integer platformId; // 平台ID

    private String Fvalue; // F值

    private String rollback; // 滚服标记

    private String eventId; //log事件ID。和客户端一致，和业务handler一致

    private String extendStr1; //扩展字段1

    private String extendStr2;//扩展字段2

    private String extendStr3;//扩展字段3

    private String extendStr4;//扩展字段4

    private String extendStr5;//扩展字段5

    private String extendStr6;//扩展字段6

    private String extendStr7;//扩展字段7

    private String extendStr8;//扩展字段8

    private String extendStr9;//扩展字段9

    private String extendStr10;//扩展字段10

    @Transient
    private String logDate;

    private Long logTime; //打点log时间
}

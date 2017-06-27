package cn.relaxtech.doomsday.bi.boot.entity.player;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 玩家基础信息 Created by zhoulinghong on 2017/6/21.
 */
@Data
public abstract class Player {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Long playerId; // 角色id

	private String playerName; // 角色名

	private Integer level; // 用户当前级别

	private Integer vipLevel; // 玩家的VIP等级

	private Integer vipExp; // 玩家的VIP经验

	private String country; // 用户当前国家

	private String language; // 用户当前语言

	private Integer deviceType; // 设备类型

	private String deviceId; // 设备ID

	private String allianceId; // 联盟ID

	private Integer platformId; // 平台ID

	private Integer Fvalue; // F值

	private Integer rollback; // 滚服标记

	private Long regTime; // 注册时间

}

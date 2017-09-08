package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

/**
 * Created by zhoulinghong on 2017/9/7.
 */
@Data
public class BiMissionData {
    private Integer id;
    private Integer missionId;
    private String missionName;
    private Integer getCount;
    private Integer finishCount;
    private Integer awardCount;
    private Double surplusPercent;
    private Double lostPercent;
}

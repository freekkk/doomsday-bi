package cn.relaxtech.doomsday.bi.boot.entity.pointLog.extendLog;

import cn.relaxtech.doomsday.bi.boot.entity.pointLog.BaseEventLog;
import lombok.Data;

import java.util.Date;

/**
 * Created by zhoulinghong on 2017/6/24.
 */
@Data
public class AllianceCreateLog extends BaseEventLog {

    private Date createTime;
    private String landCount;
    private String techScore;

}

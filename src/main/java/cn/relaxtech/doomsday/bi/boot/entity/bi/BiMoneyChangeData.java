package cn.relaxtech.doomsday.bi.boot.entity.bi;


import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhoulinghong on 2017/8/23.
 */
@Data
public class BiMoneyChangeData {
    private Integer id;
    private Date jobDate;
    private Integer serverId;
    private Integer reDayMoneyLeft;
    private Integer moneyProd;
    private Integer moneyExpend;
    private Integer dayMoneyLeft;
    private Timestamp createTime;
}

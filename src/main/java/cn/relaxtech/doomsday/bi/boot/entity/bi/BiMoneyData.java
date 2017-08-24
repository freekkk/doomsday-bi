package cn.relaxtech.doomsday.bi.boot.entity.bi;


import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhoulinghong on 2017/8/23.
 */
@Data
public class BiMoneyData {
    private Integer id;
    private Date jobDate;
    private Integer reason;
    private String creason;
    private Integer platformId;
    private Integer ifCharge;
    private Integer currency;
    private Integer delta;
    private Timestamp createTime;
}

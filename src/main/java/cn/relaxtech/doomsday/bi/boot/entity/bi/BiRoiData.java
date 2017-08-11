package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/8/2.
 */
@Data
public class BiRoiData {
    @Id
    private Integer id;
    private Date jobDate;
    private Integer serverId;
    private String country;
    private String cname;
    private String T;
    private String channel;
    private Integer deviceType;
    private Integer PUC;
    private Integer NUC;
    private Double PAC;
    private Double cost;
    private Double ROI1;
    private Double ROI2;
    private Double ROI3;
    private Double ROI4;
    private Double ROI5;
    private Double ROI6;
    private Double ROI7;
    private Double ROI14;
    private Double ROI21;
    private Double ROI30;
    private Double ROI60;
    private Double ROI90;
}

package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/8/2.
 */
@Data
public class BiLtvData {
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
    private Double LTV1;
    private Double LTV2;
    private Double LTV3;
    private Double LTV4;
    private Double LTV5;
    private Double LTV6;
    private Double LTV7;
    private Double LTV14;
    private Double LTV21;
    private Double LTV30;
    private Double LTV60;
    private Double LTV90;
}

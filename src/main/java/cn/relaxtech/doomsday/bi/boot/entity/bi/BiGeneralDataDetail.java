package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/7/18.
 */
@Data
public class BiGeneralDataDetail {
    @Id
    private Integer id;
    private Integer serverId;
    private Date jobDate;
    private String country;
    private String cname;
    private String T;
    private String channel;
    private Integer deviceType;
    private Integer DAU;
    private Integer NUC;
    private Integer NDC;
    private Double DRR;
    private Double D3RR;
    private Double WRR;
    private Double HMRR;
    private Double MRR;
    private Integer PAC;
    private Integer PUC;
    private Double ARPPU;
    private Double ARPU;
    private Double PUR;
}

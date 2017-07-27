package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/7/6.
 */
@Data
public class BiGeneralData {
    @Id
    private Integer id;
    private Integer serverId;
    private Date jobDate;
    private Integer DAU;
    private Integer NUC;
    private Integer NDC;
    private Double DRR;
    private Double D3RR;
    private Double WRR;
    private Double HMRR;
    private Double MRR;
    private Double PAC;
    private Integer PUC;
    private Double ARPPU;
    private Double ARPU;
    private Double PUR;

}

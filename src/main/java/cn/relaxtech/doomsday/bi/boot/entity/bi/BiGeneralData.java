package cn.relaxtech.doomsday.bi.boot.entity.bi;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

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
    private Integer PAC;
    private Integer PUC;
    private Double ARPPU;
    private Double ARPU;
    private Double PUR;

}

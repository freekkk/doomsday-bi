package cn.relaxtech.doomsday.bi.boot.entity.bi;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * Created by zhoulinghong on 2017/7/25.
 */
@Data
public class BiCurrentData {
    @Id
    private Integer id;
    private Date jobDate;
    private Integer NUC;
    private Integer DAU;
    private Double  PAC;
    private Integer RUC;
    @JsonFormat(pattern = "HH:mm:ss",timezone="GMT+8")
    //@JsonFormat(pattern = "HH:mm:ss")
    private Timestamp createTime;

}

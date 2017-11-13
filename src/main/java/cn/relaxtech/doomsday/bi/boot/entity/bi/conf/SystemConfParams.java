package cn.relaxtech.doomsday.bi.boot.entity.bi.conf;

import lombok.Data;

import java.sql.Date;


/**
 * Created by zhoulinghong on 2017/9/18.
 */
@Data
public class SystemConfParams {
    private String procName;
    private Boolean empty;
    private Integer intEmpty;
    private Integer serverId;
    private Date startDate;
    private Date endDate;
    private String jsonData;
    private String stringData;
    private Integer exeCode;

    public void setEmpty(Boolean empty) {
        this.empty = empty;
        this.intEmpty=empty?1:0;

    }
}

package cn.relaxtech.doomsday.bi.boot.entity.bi.conf;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/9/21.
 */
@Data
public class ConfRoi {
    private Integer id;
    @JSONField(format = "yyyy-MM-dd")
    private Date roiDate;
    private String country;
    private String channel;
    private Integer deviceType;
    private Double cost;
}

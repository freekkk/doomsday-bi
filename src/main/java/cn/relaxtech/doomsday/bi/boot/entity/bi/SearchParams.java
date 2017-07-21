package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import java.sql.Date;
import java.util.List;

/**
 * Created by zhoulinghong on 2017/7/18.
 */
@Data
public class SearchParams {

    private Date startDate;
    private Date endDate;
    private List<String> country;
    private List<String> channel;
    private String deviceType;

}

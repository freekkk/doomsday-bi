package cn.relaxtech.doomsday.bi.boot.entity.bi.conf;

import lombok.Data;

import javax.persistence.Column;
import java.sql.Date;

/**
 * Created by zhoulinghong on 2017/9/28.
 */
@Data
public class ConfServer {
    private Integer id;
    @Column(name="server_id")
    private Integer serverId;
    @Column(name="server_name")
    private String serverName;
    @Column(name="server_start_date")
    private Date serverStartDate;
    @Column(name="api_url")
    private String apiUrl;
    @Column(name="show_flag")
    private Integer showFlag;
}

package cn.relaxtech.doomsday.bi.boot.entity.user;

import lombok.Data;

import java.sql.Date;

@Data
public class User
    {
        private Integer id;
        private String name;
        private String password;
        private Boolean status;
        private Integer group;
        private String pages; //json字符串
        private Date createTime;
    }

package cn.relaxtech.doomsday.bi.boot.entity.user;

import lombok.Data;

import javax.persistence.Table;



@Data
@Table(name="user")
public class User {

    private String name;
    private String email;

}

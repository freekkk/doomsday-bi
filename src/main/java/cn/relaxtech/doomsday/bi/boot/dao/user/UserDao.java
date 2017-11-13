package cn.relaxtech.doomsday.bi.boot.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.user.User;

@Mapper
public interface UserDao {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    User getUserByName(@Param("name") String name);

    User getUserByPassword(@Param("name") String name,@Param("password") String password);

    List<User> getUserList();
}

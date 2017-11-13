package cn.relaxtech.doomsday.bi.boot.service.user;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.user.User;
import cn.relaxtech.doomsday.bi.boot.dao.user.UserDao;

@Service
public class UserService{

    @Resource
    private UserDao userDao;

    public int insert(User pojo){
        try {
            return userDao.insert(pojo);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int insertSelective(User pojo){
        return userDao.insertSelective(pojo);
    }

    public int insertList(List<User> pojos){
        return userDao.insertList(pojos);
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    public User getUserByName(String name)
    {
        return userDao.getUserByName(name);
    }

    public User getUserByPassword(String name,String password)
    {
        return userDao.getUserByPassword(name,password);
    }

    public List<User> getUserList()
    {
        return userDao.getUserList();
    }
}

package cn.relaxtech.doomsday.bi.boot.service.bi;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiCurrentData;
import cn.relaxtech.doomsday.bi.boot.dao.bi.BiCurrentDataDao;

@Service
public class BiCurrentDataService{

    @Resource
    private BiCurrentDataDao biCurrentDataDao;

    public int insert(BiCurrentData pojo){
        return biCurrentDataDao.insert(pojo);
    }

    public int insertSelective(BiCurrentData pojo){
        return biCurrentDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiCurrentData> pojos){
        return biCurrentDataDao.insertList(pojos);
    }

    public int update(BiCurrentData pojo){
        return biCurrentDataDao.update(pojo);
    }

    public List<BiCurrentData> getList(Timestamp date)
    {
        return biCurrentDataDao.getList(date);
    }

}

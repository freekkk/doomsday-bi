package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMoneyChangeData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiMoneyChangeDataDao;

@Service
public class BiMoneyChangeDataService{

    @Resource
    private BiMoneyChangeDataDao biMoneyChangeDataDao;

    public int insert(BiMoneyChangeData pojo){
        return biMoneyChangeDataDao.insert(pojo);
    }

    public int insertSelective(BiMoneyChangeData pojo){
        return biMoneyChangeDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiMoneyChangeData> pojos){
        return biMoneyChangeDataDao.insertList(pojos);
    }

    public int update(BiMoneyChangeData pojo){
        return biMoneyChangeDataDao.update(pojo);
    }

    public List<BiMoneyChangeData> getList(SearchParams params)
    {
        return biMoneyChangeDataDao.getList(params);
    }
}

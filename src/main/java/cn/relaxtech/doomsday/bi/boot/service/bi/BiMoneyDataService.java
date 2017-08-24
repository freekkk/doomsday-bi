package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMoneyData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiMoneyDataDao;

@Service
public class BiMoneyDataService{

    @Resource
    private BiMoneyDataDao biMoneyDataDao;

    public int insert(BiMoneyData pojo){
        return biMoneyDataDao.insert(pojo);
    }

    public int insertSelective(BiMoneyData pojo){
        return biMoneyDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiMoneyData> pojos){
        return biMoneyDataDao.insertList(pojos);
    }

    public int update(BiMoneyData pojo){
        return biMoneyDataDao.update(pojo);
    }

    public List<BiMoneyData> getList(SearchParams params)
    {
        return biMoneyDataDao.getList(params);
    }
}

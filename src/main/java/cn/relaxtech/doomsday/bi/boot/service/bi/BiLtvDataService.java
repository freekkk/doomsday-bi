package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiLtvData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiLtvDataDao;

@Service
public class BiLtvDataService{

    @Resource
    private BiLtvDataDao biLtvDataDao;

    public int insert(BiLtvData pojo){
        return biLtvDataDao.insert(pojo);
    }

    public int insertSelective(BiLtvData pojo){
        return biLtvDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiLtvData> pojos){
        return biLtvDataDao.insertList(pojos);
    }

    public int update(BiLtvData pojo){
        return biLtvDataDao.update(pojo);
    }

    public List<BiLtvData> getList(SearchParams params)
    {
        return biLtvDataDao.getList(params);
    }
}

package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiRoiData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiRoiDataDao;

@Service
public class BiRoiDataService{

    @Resource
    private BiRoiDataDao biRoiDataDao;

    public int insert(BiRoiData pojo){
        return biRoiDataDao.insert(pojo);
    }

    public int insertSelective(BiRoiData pojo){
        return biRoiDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiRoiData> pojos){
        return biRoiDataDao.insertList(pojos);
    }

    public int update(BiRoiData pojo){
        return biRoiDataDao.update(pojo);
    }

    public List<BiRoiData> getList(SearchParams params)
    {
        return biRoiDataDao.getList(params);
    }
}

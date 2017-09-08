package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMissionData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiMissionDataDao;

@Service
public class BiMissionDataService{

    @Resource
    private BiMissionDataDao biMissionDataDao;

    public int insert(BiMissionData pojo){
        return biMissionDataDao.insert(pojo);
    }

    public int insertSelective(BiMissionData pojo){
        return biMissionDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiMissionData> pojos){
        return biMissionDataDao.insertList(pojos);
    }

    public int update(BiMissionData pojo){
        return biMissionDataDao.update(pojo);
    }

    public List<BiMissionData> getList(SearchParams params)
    {
        return biMissionDataDao.getList(params);
    }
}

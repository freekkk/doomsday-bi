package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiLibaoData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiLibaoDataDao;

@Service
public class BiLibaoDataService{

    @Resource
    private BiLibaoDataDao biLibaoDataDao;

    public int insert(BiLibaoData pojo){
        return biLibaoDataDao.insert(pojo);
    }

    public int insertSelective(BiLibaoData pojo){
        return biLibaoDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiLibaoData> pojos){
        return biLibaoDataDao.insertList(pojos);
    }

    public int update(BiLibaoData pojo){
        return biLibaoDataDao.update(pojo);
    }

    public List<BiLibaoData> getList(SearchParams params)
    {
        return  biLibaoDataDao.getList(params);
    }

    public List<BiLibaoData> getListDetail(SearchParams params)
    {
        return biLibaoDataDao.getListDetail(params);
    }
}

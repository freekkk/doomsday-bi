package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralDataDetail;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import cn.relaxtech.doomsday.bi.boot.dao.bi.BiGeneralDataDetailDao;

@Service
public class BiGeneralDataDetailService{

    @Resource
    private BiGeneralDataDetailDao biGeneralDataDetailDao;

    public int insert(BiGeneralDataDetail pojo){
        return biGeneralDataDetailDao.insert(pojo);
    }

    public int insertSelective(BiGeneralDataDetail pojo){
        return biGeneralDataDetailDao.insertSelective(pojo);
    }

    public int insertList(List<BiGeneralDataDetail> pojos){
        return biGeneralDataDetailDao.insertList(pojos);
    }

    public int update(BiGeneralDataDetail pojo){
        return biGeneralDataDetailDao.update(pojo);
    }

    public List<BiGeneralDataDetail> getList(SearchParams params)
    {
        return biGeneralDataDetailDao.getList(params);
    }
}

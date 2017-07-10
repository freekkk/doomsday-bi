package cn.relaxtech.doomsday.bi.boot.service.bi;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralData;
import cn.relaxtech.doomsday.bi.boot.dao.bi.BiGeneralDataDao;

@Service
public class BiGeneralDataService{

    @Resource
    private BiGeneralDataDao biGeneralDataDao;

    public int insert(BiGeneralData pojo){
        return biGeneralDataDao.insert(pojo);
    }

    public int insertSelective(BiGeneralData pojo){
        return biGeneralDataDao.insertSelective(pojo);
    }

    public int insertList(List<BiGeneralData> pojos){
        return biGeneralDataDao.insertList(pojos);
    }

    public int update(BiGeneralData pojo){
        return biGeneralDataDao.update(pojo);
    }

    public List<BiGeneralData> getList()
    {
        return biGeneralDataDao.getList();
    }
}

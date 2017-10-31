package cn.relaxtech.doomsday.bi.boot.service.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiDayRateData;
import cn.relaxtech.doomsday.bi.boot.dao.bi.BiDayRateDataDao;

@Service
public class BiDayRateDataService{

    @Resource
    private BiDayRateDataDao biDayRateDataDao;


    public List<BiDayRateData> getList(SearchParams params)
    {
        List<BiDayRateData> list=biDayRateDataDao.getList(params);
        return list;
    }
}

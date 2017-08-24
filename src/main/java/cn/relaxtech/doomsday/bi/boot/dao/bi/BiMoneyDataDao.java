package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMoneyData;

@Mapper
public interface BiMoneyDataDao {
    int insert(@Param("pojo") BiMoneyData pojo);

    int insertSelective(@Param("pojo") BiMoneyData pojo);

    int insertList(@Param("pojos") List<BiMoneyData> pojo);

    int update(@Param("pojo") BiMoneyData pojo);

    List<BiMoneyData> getList(SearchParams params);
}

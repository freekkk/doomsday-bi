package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMoneyChangeData;

@Mapper
public interface BiMoneyChangeDataDao {
    int insert(@Param("pojo") BiMoneyChangeData pojo);

    int insertSelective(@Param("pojo") BiMoneyChangeData pojo);

    int insertList(@Param("pojos") List<BiMoneyChangeData> pojo);

    int update(@Param("pojo") BiMoneyChangeData pojo);

    List<BiMoneyChangeData> getList(SearchParams params);
}

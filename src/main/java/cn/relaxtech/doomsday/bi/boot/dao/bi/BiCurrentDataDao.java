package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiCurrentData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BiCurrentDataDao {
    int insert(@Param("pojo") BiCurrentData pojo);

    int insertSelective(@Param("pojo") BiCurrentData pojo);

    int insertList(@Param("pojos") List<BiCurrentData> pojo);

    int update(@Param("pojo") BiCurrentData pojo);

    List<BiCurrentData> getList();
}

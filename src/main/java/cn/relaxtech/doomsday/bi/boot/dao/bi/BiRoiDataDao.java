package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiRoiData;

@Mapper
public interface BiRoiDataDao {
    int insert(@Param("pojo") BiRoiData pojo);

    int insertSelective(@Param("pojo") BiRoiData pojo);

    int insertList(@Param("pojos") List<BiRoiData> pojo);

    int update(@Param("pojo") BiRoiData pojo);

    List<BiRoiData> getList(SearchParams params);
}

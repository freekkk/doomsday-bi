package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiMissionData;

@Mapper
public interface BiMissionDataDao {
    int insert(@Param("pojo") BiMissionData pojo);

    int insertSelective(@Param("pojo") BiMissionData pojo);

    int insertList(@Param("pojos") List<BiMissionData> pojo);

    int update(@Param("pojo") BiMissionData pojo);

    List<BiMissionData> getList(SearchParams params);
}

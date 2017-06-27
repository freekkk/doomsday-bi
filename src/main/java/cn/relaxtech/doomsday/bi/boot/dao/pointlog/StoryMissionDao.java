package cn.relaxtech.doomsday.bi.boot.dao.pointlog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.extendLog.StoryMission;

@Mapper
public interface StoryMissionDao {
    int insert(@Param("pojo") StoryMission pojo);

    int insertSelective(@Param("pojo") StoryMission pojo);

    int insertList(@Param("pojos") List<StoryMission> pojo);

    int update(@Param("pojo") StoryMission pojo);
}

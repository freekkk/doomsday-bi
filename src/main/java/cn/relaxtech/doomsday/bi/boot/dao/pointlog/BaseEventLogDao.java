package cn.relaxtech.doomsday.bi.boot.dao.pointlog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.BaseEventLog;

@Mapper
public interface BaseEventLogDao {
    int insert(@Param("pojo") BaseEventLog pojo,@Param("tableName") String tableName);

    int insertList(@Param("pojos") List<BaseEventLog> pojo);

    int update(@Param("pojo") BaseEventLog pojo);
}

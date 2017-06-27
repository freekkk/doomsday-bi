package cn.relaxtech.doomsday.bi.boot.dao.pointlog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.pointLog.extendLog.AllianceCreateLog;

@Mapper
public interface AllianceCreateLogDao {
    int insert(@Param("pojo") AllianceCreateLog pojo);

    int update(@Param("pojo") AllianceCreateLog pojo);
}

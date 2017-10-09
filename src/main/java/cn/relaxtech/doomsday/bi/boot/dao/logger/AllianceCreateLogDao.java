package cn.relaxtech.doomsday.bi.boot.dao.logger;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.relaxtech.doomsday.bi.boot.entity.pointlog.extendLog.AllianceCreateLog;

@Mapper
public interface AllianceCreateLogDao {
    int insert(@Param("pojo") AllianceCreateLog pojo);

    int update(@Param("pojo") AllianceCreateLog pojo);
}

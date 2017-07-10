package cn.relaxtech.doomsday.bi.boot.dao.bi;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralData;

@Mapper
public interface BiGeneralDataDao {
    int insert(@Param("pojo") BiGeneralData pojo);

    int insertSelective(@Param("pojo") BiGeneralData pojo);

    int insertList(@Param("pojos") List<BiGeneralData> pojo);

    int update(@Param("pojo") BiGeneralData pojo);

    List<BiGeneralData> getList();

}

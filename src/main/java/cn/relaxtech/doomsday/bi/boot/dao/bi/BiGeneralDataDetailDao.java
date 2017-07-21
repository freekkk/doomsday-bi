package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralDataDetail;

@Mapper
public interface BiGeneralDataDetailDao {
    int insert(@Param("pojo") BiGeneralDataDetail pojo);

    int insertSelective(@Param("pojo") BiGeneralDataDetail pojo);

    int insertList(@Param("pojos") List<BiGeneralDataDetail> pojo);

    int update(@Param("pojo") BiGeneralDataDetail pojo);

    List<BiGeneralDataDetail> getList(SearchParams params);
}

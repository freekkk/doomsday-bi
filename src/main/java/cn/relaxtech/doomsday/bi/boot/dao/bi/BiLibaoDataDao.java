package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiLibaoData;

@Mapper
public interface BiLibaoDataDao {
    int insert(@Param("pojo") BiLibaoData pojo);

    int insertSelective(@Param("pojo") BiLibaoData pojo);

    int insertList(@Param("pojos") List<BiLibaoData> pojo);

    int update(@Param("pojo") BiLibaoData pojo);

    List<BiLibaoData> getList(SearchParams params);

    List<BiLibaoData> getListDetail(SearchParams params);
}

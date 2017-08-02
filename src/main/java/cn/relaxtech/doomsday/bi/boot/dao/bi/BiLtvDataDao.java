package cn.relaxtech.doomsday.bi.boot.dao.bi;

import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiLtvData;

@Mapper
public interface BiLtvDataDao {
    int insert(@Param("pojo") BiLtvData pojo);

    int insertSelective(@Param("pojo") BiLtvData pojo);

    int insertList(@Param("pojos") List<BiLtvData> pojo);

    int update(@Param("pojo") BiLtvData pojo);

    List<BiLtvData> getList(SearchParams params);
}

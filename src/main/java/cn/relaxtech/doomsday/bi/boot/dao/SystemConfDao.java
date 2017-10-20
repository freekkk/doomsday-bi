package cn.relaxtech.doomsday.bi.boot.dao;

import cn.relaxtech.doomsday.bi.boot.entity.SystemConfParams;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.ConfServer;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.MoneyIgnoreHuman;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.ConfRoi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhoulinghong on 2017/9/18.
 */
@Mapper
public interface SystemConfDao {

    List<ConfServer> getConfServer();

    String getServerStartDate();

    Integer updateServerStartDate(@Param("startDate") String date);

    Integer confGeneralData(SystemConfParams params);

    Integer confGeneralDetailData(SystemConfParams params);

    Integer confLtvData(SystemConfParams params);

    Integer confMoneyData(SystemConfParams params);

    Integer confUploadRoiData(List<ConfRoi> roiList);

    Integer confUploadMoneyIgnoreHuman(List<MoneyIgnoreHuman> humanList);

    Integer confMergeMissionLog(SystemConfParams params);

    Integer confMergeChargeLog(SystemConfParams params);

    Integer truncateTable(@Param("tableName") String tableName);

    Integer confClearCurrentData(SystemConfParams params);

    Integer procConfFullGeneralData(SystemConfParams params);

}

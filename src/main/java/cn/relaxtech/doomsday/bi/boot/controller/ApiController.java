package cn.relaxtech.doomsday.bi.boot.controller;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiCurrentData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralData;
import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralDataDetail;
import cn.relaxtech.doomsday.bi.boot.entity.bi.SearchParams;
import cn.relaxtech.doomsday.bi.boot.service.bi.BiCurrentDataService;
import cn.relaxtech.doomsday.bi.boot.service.bi.BiGeneralDataDetailService;
import cn.relaxtech.doomsday.bi.boot.service.bi.BiGeneralDataService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApiController {

    @Autowired
    private BiGeneralDataService biGeneralDataService;

    @Autowired
    private BiGeneralDataDetailService biGeneralDataDetailService;

    @Autowired
    private BiCurrentDataService biCurrentDataService;



	@ApiOperation(value="bi总体数据")
	@RequestMapping(value="bigeneraldata",method ={RequestMethod.GET,RequestMethod.POST} )
	public List<BiGeneralData> bigeneraldata(@RequestBody SearchParams params)
	{
		return biGeneralDataService.getList(params);
	}

	@ApiOperation(value="bi总体数据明细")
	//@ApiImplicitParam(name = "params", value = "查询参数", required = true,dataType = "SearchParams")
	@RequestMapping(value="bigeneraldatadetail",method = RequestMethod.POST)
	public List<BiGeneralDataDetail> bigeneraldatadetail(@RequestBody SearchParams params)
	{

		return biGeneralDataDetailService.getList(params);
	}

	@ApiOperation(value="bi实时数据")
	//@ApiImplicitParam(name = "params", value = "查询参数", required = true,dataType = "SearchParams")
	@RequestMapping(value="bicurrentdata",method = RequestMethod.GET)
	public List<BiCurrentData> bicurrentdata()
	{

		return biCurrentDataService.getList();
	}
}

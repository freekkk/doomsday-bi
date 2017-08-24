package cn.relaxtech.doomsday.bi.boot.controller;

import cn.relaxtech.doomsday.bi.boot.entity.bi.*;
import cn.relaxtech.doomsday.bi.boot.service.bi.*;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
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

    @Autowired
    private BiLtvDataService biLtvDataService;

    @Autowired
    private BiRoiDataService biRoiDataService;

    @Autowired
    private BiMoneyDataService biMoneyDataService;

    @Autowired
    private BiMoneyChangeDataService biMoneyChangeDataService;

	@ApiOperation(value="bi总体数据")
	@RequestMapping(value="bigeneraldata",method ={RequestMethod.GET,RequestMethod.POST} )
	public List<BiGeneralData> BiGeneralData(@RequestBody SearchParams params)
	{
		return biGeneralDataService.getList(params);
	}

	@ApiOperation(value="bi总体数据明细")
	//@ApiImplicitParam(name = "params",  = "查询参数", required = true,dataType = "SearchParams")
	@RequestMapping(value="bigeneraldatadetail",method = RequestMethod.POST)
	public List<BiGeneralDataDetail> BiGeneralDataDetail(@RequestBody SearchParams params)
	{

		return biGeneralDataDetailService.getList(params);
	}

	@ApiOperation(value="bi LTV数据")
	@RequestMapping(value="biltv",method ={RequestMethod.POST})
	public List<BiLtvData> BiLTV(@RequestBody SearchParams params)
	{

		return biLtvDataService.getList(params);
	}


	@ApiOperation(value="bi ROI数据")
	@RequestMapping(value="biroi",method ={RequestMethod.POST})
	public List<BiRoiData> BiROI(@RequestBody SearchParams params)
	{

		return biRoiDataService.getList(params);
	}

	@ApiOperation(value="bi实时数据")
	@RequestMapping(value="bicurrentdata",method = RequestMethod.GET)
	public List<BiCurrentData> BiCurrentData( Long date)
	{
		Timestamp time=new Timestamp(date);
		return biCurrentDataService.getList(time);
	}

	@ApiOperation(value="bi 钻石消耗数据")
	@RequestMapping(value="bimoney",method ={RequestMethod.GET,RequestMethod.POST})
	public List<BiMoneyData> BiMoneyData(@RequestBody SearchParams params)
	{

		return biMoneyDataService.getList(params);
	}

	@ApiOperation(value="bi 钻石变化数据")
	@RequestMapping(value="bimoneychange",method ={RequestMethod.GET,RequestMethod.POST})
	public List<BiMoneyChangeData> BiMoneyChangeData(@RequestBody SearchParams params)
	{

		return biMoneyChangeDataService.getList(params);
	}
}

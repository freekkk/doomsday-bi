package cn.relaxtech.doomsday.bi.boot.controller;

import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.SystemConfParams;
import cn.relaxtech.doomsday.bi.boot.entity.bi.*;
import cn.relaxtech.doomsday.bi.boot.entity.bi.conf.ConfServer;
import cn.relaxtech.doomsday.bi.boot.entity.user.User;
import cn.relaxtech.doomsday.bi.boot.service.SystemConfService;
import cn.relaxtech.doomsday.bi.boot.service.bi.*;
import cn.relaxtech.doomsday.bi.boot.service.user.UserService;
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

    @Autowired
    private BiLibaoDataService biLibaoDataService;

    @Autowired
    private BiMissionDataService biMissionDataService;

    @Autowired
    private SystemConfService systemConfService;

    @Autowired
    private BiDayRateDataService biDayRateDataService;

    @Autowired
    private UserService userService;

	@ApiOperation(value="bi总体数据")
	@RequestMapping(value="bigeneraldata",method ={RequestMethod.GET,RequestMethod.POST} )
	public List<BiGeneralData> biGeneralData(@RequestBody SearchParams params)
	{
		return biGeneralDataService.getList(params);
	}

	@ApiOperation(value="bi总体数据明细")
	@RequestMapping(value="bigeneraldatadetail",method = RequestMethod.POST)
	public List<BiGeneralDataDetail> biGeneralDataDetail(@RequestBody SearchParams params)
	{
		return biGeneralDataDetailService.getList(params);
	}

	@ApiOperation(value="bi LTV数据")
	@RequestMapping(value="biltv",method ={RequestMethod.POST})
	public List<BiLtvData> biLTV(@RequestBody SearchParams params)
	{
		return biLtvDataService.getList(params);
	}

	@ApiOperation(value="bi ROI数据")
	@RequestMapping(value="biroi",method ={RequestMethod.POST})
	public List<BiRoiData> biROI(@RequestBody SearchParams params)
	{
		return biRoiDataService.getList(params);
	}

	@ApiOperation(value="bi实时数据")
	@RequestMapping(value="bicurrentdata",method = RequestMethod.GET)
	public List<BiCurrentData> biCurrentData( Long date)
	{
		Timestamp time=new Timestamp(date);
		return biCurrentDataService.getList(time);
	}

	@ApiOperation(value="bi 钻石消耗数据")
	@RequestMapping(value="bimoney",method ={RequestMethod.GET,RequestMethod.POST})
	public List<BiMoneyData> biMoneyData(@RequestBody SearchParams params)
	{
		return biMoneyDataService.getList(params);
	}

	@ApiOperation(value="bi 钻石变化数据")
	@RequestMapping(value="bimoneychange",method ={RequestMethod.POST})
	public List<BiMoneyChangeData> biMoneyChangeData(@RequestBody SearchParams params)
	{
		return biMoneyChangeDataService.getList(params);
	}

	@ApiOperation(value="bi 礼包数据")
	@RequestMapping(value="bilibao",method ={RequestMethod.POST})
	public List<BiLibaoData> biLibaoData(@RequestBody SearchParams params)
	{
		return biLibaoDataService.getList(params);
	}

	@ApiOperation(value="bi 礼包详细数据")
	@RequestMapping(value="bilibaodetail",method ={RequestMethod.POST})
	public List<BiLibaoData> biLibaoDataDetail(@RequestBody SearchParams params)
	{
		return biLibaoDataService.getListDetail(params);
	}

	@ApiOperation(value="bi 任务完成数据")
	@RequestMapping(value="bimission",method ={RequestMethod.POST})
	public List<BiMissionData> biMission(@RequestBody SearchParams params)
	{
		return biMissionDataService.getList(params);
	}

	@ApiOperation(value="系统设置")
	@RequestMapping(value="systemconf",method ={RequestMethod.POST})
	public String systemConf(@RequestBody SystemConfParams params)
	{
		return systemConfService.execProc(params);
	}

	@ApiOperation(value="获取服务器列表")
	@RequestMapping(value="getserverlist",method ={RequestMethod.GET})
	public List<ConfServer> getServerList()
	{
		return systemConfService.getConfServer();
	}

	@ApiOperation(value="bi 30日存留数据")
	@RequestMapping(value="bidayrate",method ={RequestMethod.POST})
	public List<BiDayRateData> biDayRate(@RequestBody SearchParams params)
	{
		return biDayRateDataService.getList(params);
	}

	@ApiOperation(value="增加用户")
	@RequestMapping(value="adduser",method ={RequestMethod.POST})
	public int addUser(@RequestBody User user)
	{
		return userService.insert(user);
	}

	@ApiOperation(value="查询用户")
	@RequestMapping(value="getuserbyname",method ={RequestMethod.GET})
	public User getUserByName(String name)
	{
		return userService.getUserByName(name);
	}

	@ApiOperation(value="验证用户")
	@RequestMapping(value="getuserbypassword",method ={RequestMethod.GET})
	public User getUserByPassword(String name,String password)
	{
		return userService.getUserByPassword(name,password);
	}

	@ApiOperation(value="更新用户")
	@RequestMapping(value="updateuser",method ={RequestMethod.POST})
	public int updateUser(@RequestBody User user)
	{
		return userService.update(user);
	}

	@ApiOperation(value="用户列表")
	@RequestMapping(value="getuserlist",method ={RequestMethod.GET})
	public List<User> getUserList()
	{
		return userService.getUserList();
	}

}

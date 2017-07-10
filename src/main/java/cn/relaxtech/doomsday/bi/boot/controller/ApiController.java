package cn.relaxtech.doomsday.bi.boot.controller;

import cn.relaxtech.doomsday.bi.boot.entity.bi.BiGeneralData;
import cn.relaxtech.doomsday.bi.boot.service.bi.BiGeneralDataService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApiController {

    @Autowired
    private BiGeneralDataService biGeneralDataService;

	@ApiOperation(value="index", notes="Api门户首页")
	@ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String")
	@RequestMapping(value="index")
	public String index(@RequestParam String name)
	{

		return "Hello world!"+name;
	}

	@ApiOperation(value="index", notes="Api门户首页")
	//@ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String")
	@RequestMapping(value="bigeneraldata")
	public List<BiGeneralData> index()
	{
        return biGeneralDataService.getList();
	}
}

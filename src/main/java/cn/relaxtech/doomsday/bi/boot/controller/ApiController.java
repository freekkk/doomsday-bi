package cn.relaxtech.doomsday.bi.boot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ApiController {
	
	private final Logger logger=LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value="index", notes="Api门户首页")
	@ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String")
	@RequestMapping(value="index")
	public String index(@RequestParam String name)
	{
		logger.info("fuck off");
		return "Hello world!"+name;
	}
}

package cn.relaxtech.doomsday.bi;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@SpringBootApplication
public class BIApplication {

	public static void main(String[] args) {
		log.info("doomsday-bi starting...");
	
		SpringApplication.run(BIApplication.class, args);

		log.info("doomsday-bi start success");
	}
}

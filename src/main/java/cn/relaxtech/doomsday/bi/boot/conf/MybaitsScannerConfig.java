package cn.relaxtech.doomsday.bi.boot.conf;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhoulinghong on 2017/6/27.
 */
@Configuration
@AutoConfigureAfter(ShardingConfig.class)
public class MybaitsScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("cn.relaxtech.doomsday.bi.dao");
        return mapperScannerConfigurer;
    }
}

package cn.relaxtech.doomsday.bi.boot.conf;

import lombok.Data;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSourceFactory;
import com.dangdang.ddframe.rdb.sharding.api.rule.DataSourceRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.TableRule;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.TableShardingStrategy;
import com.dangdang.ddframe.rdb.sharding.id.generator.self.CommonSelfIdGenerator;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * Created by zhoulinghong on 2017/6/27.
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class ShardingConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
   
    @Bean
    @Primary
    public DataSource shardingDataSource() throws Exception {
        //dataSource
        Properties properties = new Properties();
//        properties.put("driverClassName","com.mysql.jdbc.Driver");
//        properties.put("url", "jdbc:mysql://localhost:3306/doomsday_bi");
//        properties.put("username", "doomsday");
//        properties.put("password", "doomsday123");
        properties.put("driverClassName",driverClassName);
        properties.put("url", url);
        properties.put("username", username);
        properties.put("password", password);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //dataSourceRule
        Map<String,DataSource> dataSourceMap = new HashedMap();
        dataSourceMap.put("ds_0",dataSource);
        DataSourceRule dataSourceRule = new DataSourceRule(dataSourceMap);

        //tableShardingStrategy
        TableShardingStrategy tableShardingStrategy = new TableShardingStrategy("log_date",new SingleKeyByDateTableShardingAlgorithm());

        //tableRule
        TableRule tableRule = new TableRule.TableRuleBuilder("base_event_log")
                .dynamic(true)
                .dataSourceRule(dataSourceRule)
                .autoIncrementColumns("id")
                .tableIdGenerator(CommonSelfIdGenerator.class)
                .build();

        //shardingRule
        ShardingRule shardingRule = ShardingRule.builder()
                .dataSourceRule(dataSourceRule)
                .tableRules(Arrays.asList(tableRule))
                .tableShardingStrategy(tableShardingStrategy)
                .build();

        return ShardingDataSourceFactory.createDataSource(shardingRule);
    }
    
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(shardingDataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage("cn.relaxtech.doomsday.bi.boot.entity");

        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath:mybatis/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){

        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() throws Exception {

        return new DataSourceTransactionManager(shardingDataSource());
    }


}

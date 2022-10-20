package sboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DruidDatasource的自动配置类
 */
@Configuration
public class DatasourceConfig {

    //Bean对象，前缀为spring.datasource,加上此Bean的作用实质可以再resource的application.yaml中查看
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource(){
        return new DruidDataSource();
    }
}

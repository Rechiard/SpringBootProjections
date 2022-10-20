package sboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
*
* 此类用于实现ConfigurationCustomizer接口内的customize方法，用于解决model属性的驼峰方式书写与数据库属性下划线方式书写的映射问题
* */
@Configuration
public class MybitisConfig {

    @Bean
    public ConfigurationCustomizer customizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}

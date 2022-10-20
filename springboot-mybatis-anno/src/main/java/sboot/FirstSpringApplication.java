package sboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/*
* @SpringBootApplication是一个SpringBoot的一个启动类，放在主类上
* 主启动所在的包其实就是默认的package扫描的包，这里是sboot
* @SpringBootApplication中包含这两个主要的主要：
* @SpringBootConfiguration：自动配置类
* @EnableAutoConfiguration：引入自动配置类，并在这里面进行筛选和依赖相关的jar包
* */
@MapperScan("sboot.mapper")//此注解用于扫描sboot.mapper包下所有文件的Mapper，在主程序中写入此文件可以在Mapper中省略@Mapper注解
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FirstSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class,args);
    }
}

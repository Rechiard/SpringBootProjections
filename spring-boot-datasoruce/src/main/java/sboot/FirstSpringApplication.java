package sboot;

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
@SpringBootApplication
public class FirstSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class,args);
    }
}

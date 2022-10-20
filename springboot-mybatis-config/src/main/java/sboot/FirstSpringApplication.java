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

//此注解用于扫描sboot.mapper包下所有文件的Mapper，在主程序中写入此注解可以在Mapper的接口中省略@Mapper注解
// 源码中MybatisAutoConfiguration类中明确说到，在MapperScan找不到的情况下，会生成一个一个Scan来扫描根路径下所有带有@Mapper的接口
// 所以，当拥有@MapperScan注解的时候，上述方法则不会被调用，也就是说@Mapper注解可以省略
@MapperScan("sboot.mapper")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FirstSpringApplication {
    public static void main(String[] args) {
        /*
        * 通过对SpringApplication.run的源码学习，可以得知在run内部是可以通过一系列的properties
        * springApplication.run方法可以
        * */
        SpringApplication.run(FirstSpringApplication.class,args);
    }
}

package sboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/*
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
@ResponseBody的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到response对象的body区，通常用来返回JSON数据或者是XML数据。
*/
@RestController
public class TextController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        return "hello SpringBoot";
    }
}

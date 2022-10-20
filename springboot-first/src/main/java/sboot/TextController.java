package sboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
*/
@RestController
public class TextController {

    @RequestMapping("hello")
    public String hello(){
        return "hello SpringBoot!!!";
    }
}

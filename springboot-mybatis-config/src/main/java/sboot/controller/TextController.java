package sboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sboot.mapper.PersonMapper;
import sboot.model.Person;

import java.util.List;

/*
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
这个注解可以把数据转化为json的形式转交给客户端
*/
@RestController
public class TextController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("selectById")
    public Person selectById(){
        return personMapper.selectById(2);
    }

    @RequestMapping("selectAll")
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }

    @RequestMapping("insert")
    public String insert(Person p){
        personMapper.insert(p);
        return "success";
    }


}

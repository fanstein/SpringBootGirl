package com.imooc.girl.controller;


import com.imooc.girl.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("frex")
public class HelloController {

    @Value("${cpuSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String say(){
        return "say hello,my cpusize is "+cupSize+age+content;
    }

    @Autowired
    private GirlProperties girProerties;

    @RequestMapping(value = {"who","whoes"},method = RequestMethod.GET)
    public String who(){
        return "say hello,my cpusize is "+girProerties.getCpuSize();
    }

    @RequestMapping(value = "say/{id}",method = RequestMethod.GET)
    public String day(@PathVariable("id") Integer id){
        return "id :"+id;
    }

    @RequestMapping(value = "ay",method = RequestMethod.GET)
    public String aay(@RequestParam(value = "id", required = false, defaultValue = "12") Integer myId){
        return "id :"+myId;
    }


}

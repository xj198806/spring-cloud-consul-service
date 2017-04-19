package com.dianwoba.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dwb on 2017/4/7.
 */
@Controller
public class ComputeController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ResponseBody
    public Integer add(Integer a, Integer b){
        System.out.println(a+"++++"+b);
        return a + b;
    }


    @RequestMapping(value = "/multiply",method = RequestMethod.GET)
    @ResponseBody
    public Integer multiply(Integer a, Integer b){
        System.out.println(a+"****"+b);
        return a * b;
    }

}

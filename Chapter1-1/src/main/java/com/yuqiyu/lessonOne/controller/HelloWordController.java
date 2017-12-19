package com.yuqiyu.lessonOne.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/3
 * Time：11:10
 * 码云：http://git.oschina.net/jnyqy
 * 简书：http://www.jianshu.com/p/9a08417e4e84
 * ========================
 */
@RestController
@RequestMapping
public class HelloWordController {
    /**
     * 测试输出HelloWord
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "HelloWord";
    }


    @RequestMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}

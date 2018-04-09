package com.crm.controller;

import com.crm.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author taojiajian@meizemeiyi.com
 * @date 2018/4/8 0008 17:07
 */
@Controller
public class testController {
    @Autowired
    private testService testService;
        @RequestMapping("say.do")
        @ResponseBody
        public ModelAndView test1(){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("message",testService.testget());
            modelAndView.setViewName("hello");
            System.out.println(testService.testget()+"dododo");
            return modelAndView;
        }
}

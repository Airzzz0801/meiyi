package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author taojiajian@meizemeiyi.com
 * @date 2018/4/8 0008 17:07
 */
@Controller
public class testController {
        @RequestMapping("hello")
        public String test1(){
            return "hello";
        }
}

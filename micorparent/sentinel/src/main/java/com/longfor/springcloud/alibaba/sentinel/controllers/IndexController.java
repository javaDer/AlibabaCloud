package com.longfor.springcloud.alibaba.sentinel.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 * @Title: IndexController
 * @ProjectName SpringCloudAlibaba
 * @Description: TODO
 * @date 2018-11-2717:46
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}

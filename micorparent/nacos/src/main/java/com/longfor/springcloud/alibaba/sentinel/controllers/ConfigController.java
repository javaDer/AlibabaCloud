package com.longfor.springcloud.alibaba.sentinel.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean home() {
        return useLocalCache;
    }
}

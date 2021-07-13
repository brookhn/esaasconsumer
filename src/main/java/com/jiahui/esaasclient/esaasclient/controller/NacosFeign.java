package com.jiahui.esaasclient.esaasclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("jiahuisassa.provider")
public interface NacosFeign {

    @GetMapping(value = "/esaas/demo")
    String nacosTestDemo();
}

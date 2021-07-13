package com.jiahui.esaasclient.esaasclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class esaasdemoController {


    @Autowired
    NacosFeign nacosFeignw;

    @GetMapping("/jiahuiconsumer/test")
    public String testController(){
        return nacosFeignw.nacosTestDemo();
    }
}

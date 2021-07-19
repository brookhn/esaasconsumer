package com.jiahui.esaasclient.esaasclient.controller;

import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;
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


    @GetMapping("/jiahuiconsumer/getTrace")
    public  String providerGetTrace()
    {
        ActiveSpan.error(new RuntimeException("Test-ERROR-Throwable"));
        ActiveSpan.info("Test-Info-Msg");
        ActiveSpan.debug("Test-Debug-Msg");
        return TraceContext.traceId();
    }
}

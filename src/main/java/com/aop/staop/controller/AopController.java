package com.aop.staop.controller;

import com.aop.staop.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author squirrel
 * @date 2019-01-09
 */
@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    AopService aopService;

    @RequestMapping("/log")
    public String log() {
        aopService.say("log aop ");
        return "log";
    }
}

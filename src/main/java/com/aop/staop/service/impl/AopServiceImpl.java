package com.aop.staop.service.impl;

import com.aop.staop.service.AopService;
import org.springframework.stereotype.Service;

/**
 * @author squirrel
 * @date 2019-01-09
 */
@Service
public class AopServiceImpl implements AopService {
    @Override
    public void say(String msg) {
        System.out.println("aop start " + msg);
    }
}

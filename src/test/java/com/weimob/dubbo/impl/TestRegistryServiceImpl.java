package com.weimob.dubbo.impl;

import com.weimob.dubbo.TestRegistryService;

/**
 * Created by Devin on 4/20/2016.
 */
public class TestRegistryServiceImpl implements TestRegistryService{
    public String hello(String name) {
        return "hello"+name;
    }
}

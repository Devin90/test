package com.weimob.dubbo.Provider;

import java.util.List;

/**
 * Created by Devin on 4/14/2016.
 */
public interface DemoService {
    String sayHello(String name);

    public List getUsers();
}

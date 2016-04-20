package com.weimob.dubbo.Provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Devin on 4/14/2016.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo-provider.xml"});
        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}

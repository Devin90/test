package com.weimob.dubbo.Consumer;

import com.weimob.dubbo.Provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Devin on 4/14/2016.
 */
public class Consumer {


    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-dubbo-consumer.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); //
        String hello = demoService.sayHello("tom"); // ִ
        System.out.println(hello); //

        //
        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        // System.out.println(demoService.hehe());
        System.in.read();
    }
}

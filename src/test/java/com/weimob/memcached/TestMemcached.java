package com.weimob.memcached;

import net.spy.memcached.MemcachedClient;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by Devin on 4/14/2016.
 */
public class TestMemcached {

    public static void main(String[] args) throws IOException {
        MemcachedClient cache = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
        for (int i = 1; i < 10; i++) {
            cache.set("T0001" + i, 3600, new User(i + ""));
        }
        User myObject = (User) cache.get("T00011");
        System.out.println("Get object from mem :" + myObject);
    }
}

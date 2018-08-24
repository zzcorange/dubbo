package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.RedisService;
@Service
public class RedisServiceImpl implements RedisService {

    @Override
    public String sayHello(String name) {
        System.out.println("hello "+name +"; from redis");
        return "hello "+name +"; from redis";
    }
}

package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.LocalZoopkeeperService;

public class LocalZookeeperImpl  implements LocalZoopkeeperService {
    @Override
    public String sayHello(String name) {
        return "hello "+name +"; from LocalSookeeperImpl";
    }
}

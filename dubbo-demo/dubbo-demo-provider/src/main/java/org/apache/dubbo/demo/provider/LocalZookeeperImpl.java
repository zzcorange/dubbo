package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.LocalZoopkeeperService;
@Service
public class LocalZookeeperImpl  implements LocalZoopkeeperService {
    @Override
    public String sayHello(String name) {
        return "hello "+name +"; from LocalSookeeperImpl";
    }
}

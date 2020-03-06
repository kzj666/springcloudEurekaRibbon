package com.common.springcloud;

import com.common.myrule.KRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/*
//Ribbon 和 Eureka 整合以后,客户端可以直接调用, 不用关心ip地址和端口号

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
*/


//自定义Ribbon客户端改变客户端负载均衡规则，添加@RibbonClient注解

@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = KRule.class)
public class DeptConsumer_80{
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}


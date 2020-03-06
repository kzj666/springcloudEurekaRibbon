package com.common.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@author kzj
@date 2020/3/2 - 12:26
*/

//需将自定义的Ribbon客户端规则放在与主应用程序不同级的目录下，否则将被所有的@RibbonClients共享

@Configuration
public class KRule {

//    @Bean
//    public IRule myRule(){
//        //随机
//        return new RandomRule();
//    }

    //默认是轮询，在此处我们定义为自己的规则（每个服务用5次后换一个服务）
    @Bean
    public IRule myRule(){
        //自定义规则
        return new KangRule();
    }
}

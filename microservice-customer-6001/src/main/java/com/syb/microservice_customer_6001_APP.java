package com.syb;

import com.rule.MyRule;
import com.rule.MyRuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICE-DEPT",configuration = MyRuleConfiguration.class)//配置自定义的负载均衡算法
public class microservice_customer_6001_APP {

    public static void main(String[] args) {
        SpringApplication.run(microservice_customer_6001_APP.class,args);
    }

}

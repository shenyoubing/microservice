package com.syb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.syb")
//@ComponentScan("com.syb")
public class microservice_customer_feign_6001_APP {

    public static void main(String[] args) {
        SpringApplication.run(microservice_customer_feign_6001_APP.class,args);
    }

}

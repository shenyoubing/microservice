package com.syb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class microservice_zuul_geteway_9527_APP {

    public static void main(String[] args) {
        SpringApplication.run(microservice_zuul_geteway_9527_APP.class,args);
    }

}

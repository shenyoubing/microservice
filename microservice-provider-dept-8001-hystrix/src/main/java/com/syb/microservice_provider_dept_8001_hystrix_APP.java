package com.syb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class microservice_provider_dept_8001_hystrix_APP {
    public static void main(String[] args) {

        SpringApplication.run(microservice_provider_dept_8001_hystrix_APP.class,args);
    }
}

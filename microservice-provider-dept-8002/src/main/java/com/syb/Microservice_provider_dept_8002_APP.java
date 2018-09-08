package com.syb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservice_provider_dept_8002_APP {
    public static void main(String[] args) {

        SpringApplication.run(Microservice_provider_dept_8002_APP.class,args);
    }
}

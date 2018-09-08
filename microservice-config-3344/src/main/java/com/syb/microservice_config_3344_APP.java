package com.syb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class microservice_config_3344_APP {

    public static void main(String[] args) {
        SpringApplication.run(microservice_config_3344_APP.class,args);
    }


}

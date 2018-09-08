package com.syb.springcloud.util;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestUtil {

    @Bean
    @ConditionalOnMissingBean
    @LoadBalanced
    public RestTemplate creatRestTemplate(){
        return  new RestTemplate();
    }

    //更换负载均衡轮询算法为随机算法
    @Bean
    public IRule creatRule(){
        return new RandomRule();
    }

}

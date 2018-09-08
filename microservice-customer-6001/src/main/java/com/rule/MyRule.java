package com.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/*
 * 自定义负载均衡双方，该类不能放在启动类扫描包及其子包下
 * 实现mei每个f服务fang访问5次后再访问下一个服务，依次轮询
 */
public class MyRule extends AbstractLoadBalancerRule {

    private int tatal = 0; //定义总访问次数
    private int currentserver = 0 ;//当前访问服务

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

//                int index = this.rand.nextInt(serverCount);
//                server = (Server)upList.get(index);
                //实现mei每个f服务fang访问5次后再访问下一个服务，依次轮询  -- start
                if(tatal < 5 ){
                    server = (Server)upList.get(currentserver);
                    tatal++;
                }else {
                    tatal = 0 ;
                    currentserver ++;
                    if(currentserver >= serverCount){
                        currentserver = 0 ;
                    }
                }
          //      ------------------end------------------

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

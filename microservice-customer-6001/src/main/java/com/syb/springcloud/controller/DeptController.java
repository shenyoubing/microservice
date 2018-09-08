package com.syb.springcloud.controller;

import com.syb.entity.DeptPoJo;
import com.syb.util.ReSponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

//    private String REST_URL_PREFIX = "http://localhost:8001";
    private String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public ReSponse addDept(DeptPoJo poJo) {

        ReSponse result = restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",poJo,ReSponse.class);

        return result;
    }

    @RequestMapping(value = "/dept/update",method = RequestMethod.POST)
    public ReSponse updateDept(DeptPoJo poJo) {
        ReSponse result = restTemplate.postForObject(REST_URL_PREFIX+"/dept/update",poJo,ReSponse.class);

        return result;
    }

    @RequestMapping(value = "/dept/delete",method = RequestMethod.POST)
    public ReSponse deleteDept(@RequestParam("deptno") int deptno) {
        ReSponse result = restTemplate.postForObject(REST_URL_PREFIX+"/dept/delete",deptno,ReSponse.class);

        return result;
    }

    @RequestMapping(value = "/dept/getdept/{deptno}",method = RequestMethod.GET)
    public ReSponse getDept(@PathVariable("deptno") int deptno) {
        ReSponse result = restTemplate.getForObject(REST_URL_PREFIX+"/dept/getdept/"+deptno,ReSponse.class);

        return result;
    }

    @RequestMapping(value = "/dept/getalldept",method = RequestMethod.GET)
    public ReSponse getAllDept() {
        ReSponse result = restTemplate.getForObject(REST_URL_PREFIX+"/dept/getalldept",ReSponse.class);

        return result;
    }

}

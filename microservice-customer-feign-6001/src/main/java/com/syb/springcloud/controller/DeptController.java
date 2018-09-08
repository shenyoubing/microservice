package com.syb.springcloud.controller;

import com.syb.entity.DeptPoJo;
import com.syb.util.DeptFeignFactory;
import com.syb.util.ReSponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {

//    private String REST_URL_PREFIX = "http://localhost:8001";
//    private String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

    @Autowired
    private DeptFeignFactory deptFeignFactory;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public ReSponse addDept(DeptPoJo poJo) {

        ReSponse result = deptFeignFactory.addDept(poJo);
        return result;
    }

    @RequestMapping(value = "/dept/update",method = RequestMethod.POST)
    public ReSponse updateDept(DeptPoJo poJo) {
        ReSponse result = deptFeignFactory.updateDept(poJo);
        return result;
    }

    @RequestMapping(value = "/dept/delete",method = RequestMethod.POST)
    public ReSponse deleteDept(@RequestParam("deptno") int deptno) {
        ReSponse result = deptFeignFactory.deleteDept(deptno);
        return result;
    }

    @RequestMapping(value = "/dept/getdept/{deptno}",method = RequestMethod.GET)
    public ReSponse getDept(@PathVariable("deptno") int deptno) {
        ReSponse result = deptFeignFactory.getDept(deptno);
        return result;
    }

    @RequestMapping(value = "/dept/getalldept",method = RequestMethod.GET)
    public ReSponse getAllDept() {
        ReSponse result = deptFeignFactory.getAllDept();
        return result;
    }

}

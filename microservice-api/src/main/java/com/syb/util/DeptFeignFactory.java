package com.syb.util;

import com.syb.entity.DeptPoJo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "MICROSERVICE-DEPT",fallbackFactory = DeptHystrixFactory.class)
public interface DeptFeignFactory {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public ReSponse addDept(DeptPoJo poJo) ;

    @RequestMapping(value = "/dept/update",method = RequestMethod.POST)
    public ReSponse updateDept(DeptPoJo poJo) ;

    @RequestMapping(value = "/dept/delete",method = RequestMethod.POST)
    public ReSponse deleteDept(@RequestParam("deptno") int deptno) ;

    @RequestMapping(value = "/dept/getdept/{deptno}",method = RequestMethod.GET)
    public ReSponse getDept(@PathVariable("deptno") int deptno) ;

    @RequestMapping(value = "/dept/getalldept",method = RequestMethod.GET)
    public ReSponse getAllDept();


}

package com.syb.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.syb.entity.DeptPoJo;
import com.syb.springcloud.service.DeptService;
import com.syb.util.ReSponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public ReSponse addDept(@RequestBody DeptPoJo poJo) {
        boolean result =   deptService.addDept(poJo);
        return new ReSponse(200,"ok ",result);
    }

    @RequestMapping(value = "/dept/update",method = RequestMethod.POST)
    public ReSponse updateDept(@RequestBody  DeptPoJo poJo) {
        boolean result =   deptService.updateDept(poJo);
        return  new ReSponse(200,"ok",result);
    }

    @RequestMapping(value = "/dept/delete",method = RequestMethod.POST)
    public ReSponse deleteDept(@RequestParam("deptno") int deptno) {
       boolean result =  deptService.deleteDept(deptno);
        return  new ReSponse(200,"ok",result);
    }

    //定义服务端熔断器，当服务异常时，返回特定的信息
    @RequestMapping(value = "/dept/getdept/{deptno}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackMethodgetDeptOne")
    public ReSponse getDept(@PathVariable("deptno") int deptno) {
        DeptPoJo poJo = deptService.getDept(deptno);
        if(null == poJo){
            throw new RuntimeException("查询部门编号为\"+deptno+\"的部门信息异常");
        }
        return  new ReSponse(200,"ok",poJo);
    }

    @RequestMapping(value = "/dept/getalldept",method = RequestMethod.GET)

    public ReSponse getAllDept() {
        List<DeptPoJo> list = deptService.getAllDept();
        return  new ReSponse(200,"ok",list);
    }

    public ReSponse fallbackMethodgetDeptOne(@PathVariable("deptno") int deptno){

       return new ReSponse(500,"查询部门编号为"+deptno+"的部门信息异常",null);
    }

}

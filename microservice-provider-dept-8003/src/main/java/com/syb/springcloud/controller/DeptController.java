package com.syb.springcloud.controller;

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

    @RequestMapping(value = "/dept/getdept/{deptno}",method = RequestMethod.GET)
    public ReSponse getDept(@PathVariable("deptno") int deptno) {
        DeptPoJo poJo = deptService.getDept(deptno);
        return  new ReSponse(200,"ok",poJo);
    }

    @RequestMapping(value = "/dept/getalldept",method = RequestMethod.GET)
    public ReSponse getAllDept() {
        List<DeptPoJo> list = deptService.getAllDept();
        return  new ReSponse(200,"ok",list);
    }


}

package com.syb.springcloud.service;

import com.syb.entity.DeptPoJo;

import java.util.List;

public interface DeptService {
    //新增一个部门
    public boolean addDept(DeptPoJo poJo);

    //修改部门
    public boolean updateDept(DeptPoJo poJo);

    //删除部门
    public boolean deleteDept(int deptno);

    //查询一个部门
    public DeptPoJo getDept(int deptno);

    //查询所有部门
    public List<DeptPoJo> getAllDept();
}

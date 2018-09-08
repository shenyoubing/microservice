package com.syb.springcloud.dao;

import com.syb.entity.DeptPoJo;
import org.apache.ibatis.annotations.Mapper;
import org.eclipse.jetty.websocket.jsr356.encoders.BooleanEncoder;

import java.util.List;

@Mapper
public interface DeptDao {
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

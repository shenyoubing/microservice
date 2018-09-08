package com.syb.springcloud.service.impl;

import com.syb.entity.DeptPoJo;
import com.syb.springcloud.dao.DeptDao;
import com.syb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(DeptPoJo poJo) {
        return deptDao.addDept(poJo);
    }

    @Override
    public boolean updateDept(DeptPoJo poJo) {
        return deptDao.updateDept(poJo);
    }

    @Override
    public boolean deleteDept(int deptno) {
        return deptDao.deleteDept(deptno);
    }

    @Override
    public DeptPoJo getDept(int deptno) {
        return deptDao.getDept(deptno);
    }

    @Override
    public List<DeptPoJo> getAllDept() {
        return deptDao.getAllDept();
    }
}

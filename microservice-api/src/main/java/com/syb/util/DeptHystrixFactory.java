package com.syb.util;

import com.syb.entity.DeptPoJo;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DeptHystrixFactory implements FallbackFactory<DeptFeignFactory> {
    @Override
    public DeptFeignFactory create(Throwable throwable) {
        return new DeptFeignFactory() {
            @Override
            public ReSponse addDept(DeptPoJo poJo) {
                return null;
            }

            @Override
            public ReSponse updateDept(DeptPoJo poJo) {
                return null;
            }

            @Override
            public ReSponse deleteDept(int deptno) {
                return null;
            }

            @Override
            public ReSponse getDept(int deptno) {
                return new ReSponse(500,"查询该部门编号为"+deptno+"的部门信息不存在",null);
            }

            @Override
            public ReSponse getAllDept() {
                return null;
            }
        };
    }
}

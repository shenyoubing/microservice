package com.syb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@NoArgsConstructor //配置无参数的构造方法
@AllArgsConstructor //配置所有参数的构造方法
@Data   //启用getset方法
@Accessors(chain = true) //开启链路式访问
public class DeptPoJo implements Serializable {
    
    private  long deptno;
    private String dname;
    private  String db_source;
    private Date lastdealdate;
    
    
}

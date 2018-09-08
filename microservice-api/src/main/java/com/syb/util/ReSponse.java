package com.syb.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@Data
//@NoArgsConstructor
public class ReSponse {
    private int code;
    private String msg;
    private Object data;
    public ReSponse(){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ReSponse(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

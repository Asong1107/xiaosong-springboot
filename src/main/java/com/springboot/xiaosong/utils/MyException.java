package com.springboot.xiaosong.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MyException extends RuntimeException{

    private Integer code;
    private String msg;

    public MyException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MyException(String msg) {
        this.code = ResultTypeEnum.SERVICE_ERROR.getCode();
        this.msg = msg;
    }

    public MyException(ResultTypeEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }
}

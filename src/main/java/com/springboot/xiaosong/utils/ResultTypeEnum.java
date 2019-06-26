package com.springboot.xiaosong.utils;


import lombok.Getter;
import lombok.Setter;

/**
 * 相应状态枚举类
 * @author song
 */


public enum ResultTypeEnum {

    //成功
    SERVICE_SUCCESS(200,"success"),

    PARAM_ERROR(404,"入参异常"),
    SERVICE_ERROR(500,"服务异常");

    @Getter
    @Setter
    private Integer code;
    @Getter
    @Setter
    private String message;


    ResultTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

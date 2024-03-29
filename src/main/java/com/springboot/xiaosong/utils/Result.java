package com.springboot.xiaosong.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    private Result() {
    }

    public Result(ResultTypeEnum type) {
        this.code = type.getCode();
        this.msg = type.getMessage();
    }

    public Result(ResultTypeEnum type, T data) {
        this.code = type.getCode();
        this.msg = type.getMessage();
        this.data = data;
    }

    public Result(ResultTypeEnum type, String content, T data) {
        this.code = type.getCode();
        this.msg = content;
        this.data = data;
    }

    public static Result success() {
        return new Result(ResultTypeEnum.SERVICE_SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result(ResultTypeEnum.SERVICE_SUCCESS, data);
    }

    public static <T> Result<T> error(T data) {
        return new Result(ResultTypeEnum.SERVICE_ERROR, data);
    }

    public static  <T> Result<T> success(String content, T data) {
        return new Result(ResultTypeEnum.SERVICE_SUCCESS, content, data);
    }

    public static Result error() {
        return new Result(ResultTypeEnum.SERVICE_ERROR);
    }

    public static Result error(ResultTypeEnum typeEnum) {
        return new Result(typeEnum);
    }

    public static Result error(ResultTypeEnum typeEnum,String msg) {
        return new Result(typeEnum,msg);
    }


}
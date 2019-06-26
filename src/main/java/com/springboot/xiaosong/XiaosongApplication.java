package com.springboot.xiaosong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.xiaosong.dao")

public class XiaosongApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaosongApplication.class, args);
    }
}

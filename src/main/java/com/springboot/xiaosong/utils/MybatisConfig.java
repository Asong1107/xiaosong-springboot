package com.springboot.xiaosong.utils;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author song
 * mybatis Map  驼峰转换
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer mybatisConfigurationCustomizer(){
        return configuration -> configuration.setObjectWrapperFactory(new MapWrapperFactory());
    }

}
package com.springboot.xiaosong.service.impl;

import com.springboot.xiaosong.dao.LoginDao;
import com.springboot.xiaosong.service.LoginService;
import com.springboot.xiaosong.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginDao loginDao;
    @Override
    public Result<String> userLogin(String json){
        log.info("接收到的数据："+json);
//        String password = loginDao.userLogin(username);
//        if(Objects.equals(password,psd)){
//            return Result.success();
//        }
        return Result.error("");
    }
}

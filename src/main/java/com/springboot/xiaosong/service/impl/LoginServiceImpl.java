package com.springboot.xiaosong.service.impl;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.springboot.xiaosong.dao.LoginDao;
import com.springboot.xiaosong.service.LoginService;
import com.springboot.xiaosong.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;


@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginDao loginDao;
    @Override
    public Result<String> userLogin(String json){
        log.info("接收到的数据："+json);
        JSONObject jsonObject = JSONUtil.parseObj(json);
        String password = loginDao.userLogin(jsonObject.getStr("username"));

        if(Objects.equals(password,jsonObject.getStr("password"))){
            return Result.success("欢迎登陆");
        }
        return Result.error("");
    }
}

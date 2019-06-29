package com.springboot.xiaosong.controller;


import com.springboot.xiaosong.service.LoginService;
import com.springboot.xiaosong.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {

    @Resource
    LoginService loginService;
    @PostMapping("/login")
    public Result<String> login(@RequestBody String json){
        return loginService.userLogin(json);
    }
}

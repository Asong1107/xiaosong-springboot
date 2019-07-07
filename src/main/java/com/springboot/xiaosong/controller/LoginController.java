package com.springboot.xiaosong.controller;


import com.springboot.xiaosong.service.LoginService;
import com.springboot.xiaosong.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {

    @Resource
    LoginService loginService;

    /**
     * 登录
     * @param json
     * @return
     */
    @PostMapping("/login")
    public Result<String> login(@RequestBody String json){
        return loginService.userLogin(json);
    }

    /**
     * 导航栏列表获取
     * @return
     */
    @GetMapping("/interface/{id}")
    public  Result<List> getInterface(@PathVariable int id){
        return loginService.getInterface(id);
    }
}

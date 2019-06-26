package com.springboot.xiaosong.service;

import com.springboot.xiaosong.utils.Result;

/**
 * @author song
 */
public interface LoginService {

    Result<String> userLogin(String json);
}

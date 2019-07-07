package com.springboot.xiaosong.service;

import com.springboot.xiaosong.utils.Result;

import java.util.List;

/**
 * @author song
 */
public interface LoginService {

    Result<String> userLogin(String json);

    Result<List> getInterface(int id);
}

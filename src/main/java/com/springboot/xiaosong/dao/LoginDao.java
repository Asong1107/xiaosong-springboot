package com.springboot.xiaosong.dao;

import org.apache.ibatis.annotations.Select;

public interface LoginDao {

    @Select("select password from user where username=#{username} ")
   String  userLogin(String username);

}

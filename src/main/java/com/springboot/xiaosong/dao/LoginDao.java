package com.springboot.xiaosong.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface LoginDao {

    @Select("select password from user where username=#{username} ")
   String  userLogin(String username);

    @Select("select id,title,url from resource where father_id=#{id}")
    List<Map<String,Object>> getInterface(int id);

}

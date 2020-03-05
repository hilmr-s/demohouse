package com.team.house.demohouse.service;

import com.team.house.demohouse.entity.Users;

public interface UserService {

    //注册业务
    public  int regUser(Users users);

    //用户登录
    public  Users Login(String usersname,String password);
}

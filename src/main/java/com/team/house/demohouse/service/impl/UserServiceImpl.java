package com.team.house.demohouse.service.impl;

import com.team.house.demohouse.entity.Users;
import com.team.house.demohouse.entity.UsersExample;
import com.team.house.demohouse.mapper.UsersMapper;
import com.team.house.demohouse.service.UserService;
import com.team.house.demohouse.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UsersMapper usersMapper;

    @Override
    public int regUser(Users users) {
        // 密码不要以明文方式保存到数据库中，这样不安全
        //使用md5对密码进行加密后存储到数据库
        //使用步骤：1.导入md5工具类
                  //2.调用md5工具类的方法进行加密
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));

        return usersMapper.insertSelective(users);
    }


    @Override
    public Users Login(String usersname, String password) {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        //设置条件
        criteria.andPasswordEqualTo(MD5Utils.md5Encrypt(password)); //加密后与加密的内容相比
        List<Users> list= usersMapper.selectByExample(usersExample);
         if (list!=null&&list.size()==1){
             return  list.get(0);//返回第一个对象
         }else

             return  null;
    }
}
package com.yjxxt.userservice;

import com.yjxxt.Service.UserService;
import com.yjxxt.pojo.User;
import org.junit.Before;
import org.junit.Test;

public class Service {

    private UserService userService = null;
    @Before
    public void init(){
        System.out.println("方法执行之前");
        userService = new  UserService();
    }


    // 添加
    @Test
    public void addUser( ){

    }

    //展示
    @Test
    public void listUser(){
        userService.listUser();
    }

    // 修改
    @Test
    public void updateUser(){

    }
    //删除
     @Test
    public void delUser(){

    }



}

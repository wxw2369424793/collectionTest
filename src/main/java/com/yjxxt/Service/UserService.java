package com.yjxxt.Service;

import com.yjxxt.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = null;


    public UserService(){
        users= new ArrayList<>();
        users.add(new User(1,"admin","123456","admin","",""));
        users.add(new User(2,"wxw","123456","admin","",""));
    }
    // 添加
    public void addUser(User user){

    }

    //展示
    public void listUser(){

        users.forEach(user -> {
            System.out.println(user);
        });


    }

    // 修改
    public void updateUser(){

    }
    // 删除
    public void delUser(){

    }

}

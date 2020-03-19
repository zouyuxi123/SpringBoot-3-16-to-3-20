package com.home.springbootjpa.controller;

import com.home.springbootjpa.bean.User;
import com.home.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-22:23
 */
@RestController
public class userController {
    @Autowired
    UserService userService;

    //增加用户
    @GetMapping("/insert")
    public User insertUser(User user) {
        userService.insertUser(user);
        return user;//返回所增加的用户信息
    }

    //删除用户
    @GetMapping("/delete/{uid}")
    public String deleteById(@PathVariable("uid") Integer uid) {
        userService.deleteById(uid);

        return "删除成功";
    }

    //修改用户信息
    @GetMapping("/update")
    public User updateUser(User user) {
        userService.updateUser(user);
        return user;//返回所修改的成员信息
    }

    //根据ID查询用户信息
    @GetMapping("/query/{uid}")
    public User queryById(@PathVariable("uid") Integer uid) {
        User user = userService.queryById(uid);
        return user;
    }
      //查询所有成员信息
    @GetMapping("/queryAll")
    public List<User> queryAll(){
        List<User> list = userService.queryAll();
        return list;
    }

}

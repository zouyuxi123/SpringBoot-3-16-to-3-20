package com.home.springbootjpa.service.serviceImpl;

import com.home.springbootjpa.bean.User;
import com.home.springbootjpa.dao.userMapper;
import com.home.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-22:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    userMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.save(user);

        //增加用户
    }

    @Override
    public void deleteById(Integer uid) {
        //根据ID删除用户
        userMapper.delete(uid);
    }

    @Override
    public void updateUser(User user) {
        userMapper.saveAndFlush(user);
        //修改用户信息
    }

    @Override
    public User queryById(Integer uid) {
        //根据用户ID查询
        return userMapper.getOne(uid);
    }

    @Override
    public List<User> queryAll() {
        //查询所有用户信息
        return userMapper.findAll();
    }


}

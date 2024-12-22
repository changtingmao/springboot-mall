package com.samchang.springbootmall.service.impl;

import com.samchang.springbootmall.dao.UserDao;
import com.samchang.springbootmall.dto.UserRegisterRequest;
import com.samchang.springbootmall.model.User;
import com.samchang.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

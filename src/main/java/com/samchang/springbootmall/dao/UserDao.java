package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.dto.UserRegisterRequest;
import com.samchang.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

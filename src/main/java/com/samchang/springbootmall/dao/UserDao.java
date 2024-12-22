package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.dto.UserRegisterRequest;
import com.samchang.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

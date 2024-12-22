package com.samchang.springbootmall.service;

import com.samchang.springbootmall.dto.UserRegisterRequest;
import com.samchang.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}

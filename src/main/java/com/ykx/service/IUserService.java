package com.ykx.service;

import com.ykx.entity.User;

public interface IUserService {
    User selectUser(User user);
    int insertUser(User user);
    User selectUserOne(String name);
}

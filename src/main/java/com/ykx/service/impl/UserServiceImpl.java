package com.ykx.service.impl;

import com.ykx.dao.UserMapper;
import com.ykx.dao.ext.UserExtMapper;
import com.ykx.entity.User;
import com.ykx.entity.UserExample;
import com.ykx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserExtMapper userExtMapper;

    @Override
    public User selectUser(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(user.getName()).andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(userExample);
        if (users != null && users.size() == 1){
            return users.get(0);
        }
        return null;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User selectUserOne(String name) {
        User user = userExtMapper.selectUserOne(name);
        return user;
    }
}

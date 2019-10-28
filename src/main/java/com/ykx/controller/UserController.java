package com.ykx.controller;

import com.ykx.entity.R;
import com.ykx.entity.User;
import com.ykx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public R selectUser(User user){
        User userResult = userService.selectUser(user);
        if (userResult == null){
            return R.error("用户名或密码错误！");
        }
        userResult.setPassword("");
        return R.ok(userResult);
    }
    @RequestMapping("/logon")
    public R insertUser (User user){
        User users = userService.selectUserOne(user.getName());
        if(users == null){
            int result = userService.insertUser(user);
            return R.ok("注册成功");
        }else {
            return R.error("用户名已被注册!");
        }
    }
}

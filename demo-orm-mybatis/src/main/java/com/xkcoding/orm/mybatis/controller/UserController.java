package com.xkcoding.orm.mybatis.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public List getUser() {
        List<User> userList = userMapper.selectAllUser();
        return userList;
    }
}

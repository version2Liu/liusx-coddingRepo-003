package com.liusx.controller;


import com.liusx.common.lang.Result;
import com.liusx.entity.User;
import com.liusx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liusx
 * @since 2020-08-10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public Result getUser(){
        User user = userService.getById(1);
        return Result.success(user);
    }

}

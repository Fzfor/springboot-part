package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 22:44 2024/04/07
 * @Modified By: bin.zhao
 * @Modify Time: 22:44 2024/04/07
 * @Version: 1.0
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private User user;

    @GetMapping("fz")
    public User fz(){
        return user;
    }
}

package com.atguigu.controller;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: UserController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 08:50 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 08:50 2024/04/09
 * @Version: 1.0
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public List<User> queryList(){
        return userMapper.queryList();
    }

    @GetMapping("remove/{id}")
    public int removeById(@PathVariable Integer id){
        int i = userService.removeById(id);
        return i;
    }

}

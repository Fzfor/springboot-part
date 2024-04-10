package com.atguigu.service.impl;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:51 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 21:51 2024/04/09
 * @Version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

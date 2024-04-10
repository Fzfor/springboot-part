package com.atguigu.service;

import com.atguigu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserService
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 08:56 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 08:56 2024/04/09
 * @Version: 1.0
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int removeById(Integer id){
        int i = userMapper.removeById(id);
        System.out.println("i = " + i);
        //int a = 1/0;
        return i;
    }
}

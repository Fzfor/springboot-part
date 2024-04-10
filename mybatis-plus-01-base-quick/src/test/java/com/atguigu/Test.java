package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName: Test
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 09:44 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 09:44 2024/04/09
 * @Version: 1.0
 */
@SpringBootTest
public class Test {
    @Autowired
    private UserMapper userMapper;

    @org.junit.jupiter.api.Test
    public void testDemo(){
        List<User> users = userMapper.selectList(null);
        System.out.println("users = " + users);
    }
}

package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: MybatisPlusTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 20:49 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 20:49 2024/04/09
 * @Version: 1.0
 */

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test_insert(){

        User user = new User();
        user.setName("张三");
        user.setAge(88);
        user.setEmail("sss");

        int row = userMapper.insert(user);
        System.out.println("row = " + row);
    }


    @Test
    public void test_delete(){
        int row = userMapper.deleteById(1777681893411332098L);
        System.out.println("row = " + row);

        Map map = new HashMap<>();
        map.put("age", 20); //age = 20
        int i = userMapper.deleteByMap(map);
        System.out.println("i = " + i);

    }


    @Test
    public void test_update(){
        //将主键等于1的user，age改为30
        User user = new User();
        user.setId(1L);
        user.setAge(30);
        userMapper.updateById(user); //updateById方法中user的主键必须有值，不能为空

        //将所有人的age改为17
        User user1 = new User();
        user1.setAge(18);
        user1.setId(1212L);
        int rows = userMapper.update(user1, null); //null代表无条件，修改所有人
        System.out.println("rows = " + rows);

    }

    @Test
    public void test_select(){
        User user = userMapper.selectById(1L);
        System.out.println("user = " + user);

        List<Long> list = new ArrayList<>();
        list.add(1L); list.add(4L);
        List<User> users = userMapper.selectBatchIds(list);
        System.out.println("users = " + users);
    }
}

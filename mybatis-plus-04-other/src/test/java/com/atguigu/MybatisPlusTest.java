package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName: MybatisPlusTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 22:23 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 22:23 2024/04/09
 * @Version: 1.0
 */
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);

        long current = page.getCurrent(); //页码
        System.out.println("current = " + current);
        long pages = page.getSize(); //页容量
        System.out.println("pages = " + pages);
        List<User> records = page.getRecords(); //当前页的数据
        System.out.println("records = " + records);
        long total = page.getTotal(); //总记录数
        System.out.println("total = " + total);
    }


    @Test
    public void testPageByAge(){
        Page<User> page = new Page<>(1, 5);
        userMapper.selectByAge(page, 18);

        long current = page.getCurrent(); //页码
        System.out.println("current = " + current);
        long pages = page.getSize(); //页容量
        System.out.println("pages = " + pages);
        List<User> records = page.getRecords(); //当前页的数据
        System.out.println("records = " + records);
        long total = page.getTotal(); //总记录数
        System.out.println("total = " + total);
    }

    @Test
    public void testPrimaryKey(){
        User user = new User();
        user.setName("驴蛋蛋");
        user.setAge(100);
        user.setEmail("888@qq.com");

        userMapper.insert(user);

        //userMapper.delete(new LambdaQueryWrapper<User>().gt(User::getId, 10));
    }

    @Test
    public void testTableLogicDeleted(){
        userMapper.deleteById(2);

        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void testOptimezeLock(){

        User user1 = userMapper.selectById(4);
        User user2 = userMapper.selectById(4);

        user1.setAge(28);
        user2.setAge(38);

        userMapper.updateById(user1);
        userMapper.updateById(user2);
    }

    @Test
    public void testDeleteAll(){
        userMapper.delete(null);
    }
}

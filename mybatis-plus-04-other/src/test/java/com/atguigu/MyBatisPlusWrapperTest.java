package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName: MyBatisPlusWrapperTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 08:57 2024/04/10
 * @Modified By: bin.zhao
 * @Modify Time: 08:57 2024/04/10
 * @Version: 1.0
 */
@SpringBootTest
public class MyBatisPlusWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQueryWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.like("name", "a")
                .between("age", 20, 30)
                .isNotNull("email");

        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println("list = " + list);
    }

    @Test
    public void testOrder() {
        //按年龄降序查询用户，如果年龄相同则按id升序查询
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.orderByDesc("age")
                .orderByAsc("id");

        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println("list = " + list);
    }
    @Test
    public void testRemove() {
        //删除邮箱为空的数据
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.isNull("email");

        userMapper.delete(queryWrapper);
    }

    @Test
    public void testAndOr() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.gt("age", 20)
                .or()
                .like("name", "乐");

        User user = new User();
        user.setEmail("abc@qq.com");

        int a = userMapper.update(user, queryWrapper);
        System.out.println("a = " + a);
    }

    @Test
    public void testTargetColumn() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.gt("id", 20)
        .select("id", "name", "age");

        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println("list = " + list);
    }



    @Test
    public void testDynamicCondiction() {
        String name = "xxx";
        Integer age = 17;

        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.eq(StringUtils.isNotBlank(name), "name", name)
                .eq(age != null && age > 18, "age", age);

        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println("list = " + list);
    }


}

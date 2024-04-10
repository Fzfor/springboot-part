package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: MybatisPlusLambdaQueryWrapperTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 20:19 2024/04/10
 * @Modified By: bin.zhao
 * @Modify Time: 20:19 2024/04/10
 * @Version: 1.0
 */
@SpringBootTest
public class MybatisPlusLambdaQueryWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();

        lambdaQueryWrapper.like(User::getName, "a")
                .between(User::getAge,10, 20)
                .isNotNull(User::getEmail);

        userMapper.selectList(lambdaQueryWrapper);
    }

    @Test
    public void testUpdate() {
        LambdaUpdateWrapper<User> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        lambdaUpdateWrapper.gt(User::getAge, 30)
                .set(User::getName, "James")
                .set(User::getEmail, "123@qq.com");

        userMapper.update(null, lambdaUpdateWrapper);

    }

}

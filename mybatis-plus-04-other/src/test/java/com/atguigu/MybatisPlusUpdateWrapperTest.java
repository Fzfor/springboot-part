package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

/**
 * @ClassName: MybatisPlusUpdateWrapperTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 20:08 2024/04/10
 * @Modified By: bin.zhao
 * @Modify Time: 20:08 2024/04/10
 * @Version: 1.0
 */
@SpringBootTest
public class MybatisPlusUpdateWrapperTest {
    @Autowired()
    private UserMapper userMapper;

    @Test
    public void testUpdateNullValue() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();

        updateWrapper.eq("name", "张三")
                .set("email", null)
                .set("age",22);

        userMapper.update(null, updateWrapper);
    }
}

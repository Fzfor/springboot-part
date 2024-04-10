package com.atguigu;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ServiceCurdTest
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:56 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 21:56 2024/04/09
 * @Version: 1.0
 */
@SpringBootTest
public class ServiceCurdTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setEmail("xxx");
        User user1 = new User();
        user1.setName("张三san");
        user1.setAge(188);
        user1.setEmail("aaa");

        list.add(user);
        list.add(user1);

        //boolean b = userService.saveBatch(list);
        //System.out.println("b = " + b);

        user.setName("古天乐");
        boolean a = userService.save(user);
        System.out.println("a = " + a);
    }

    @Test
    public void test_saveOrUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("古天乐assa");
        user.setAge(18);
        user.setEmail("xxx");
        boolean b = userService.saveOrUpdate(user);
        System.out.println("b = " + b);
    }

    @Test
    public void test_removeById(){
        boolean b = userService.removeById(1777698086507585538L);
        System.out.println("b = " + b);
    }
}

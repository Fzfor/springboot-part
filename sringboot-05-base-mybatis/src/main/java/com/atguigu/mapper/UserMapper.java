package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 08:42 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 08:42 2024/04/09
 * @Version: 1.0
 */

public interface UserMapper {

    List<User> queryList();

    int removeById(Integer id);
}

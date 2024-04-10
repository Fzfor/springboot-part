package com.atguigu.mapper;

import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: UserMapper
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 22:18 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 22:18 2024/04/09
 * @Version: 1.0
 */

public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectByAge(IPage<User> page, @Param("age") Integer age);
}

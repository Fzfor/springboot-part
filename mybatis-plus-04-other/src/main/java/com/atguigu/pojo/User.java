package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

//@TableName("user") //当数据库的表名和实体类名不一致时（忽略大小写），则需要使用此注解
@Data
public class User {

    /**
     * 默认：  雪花算法： 1。数据库主键类型是 bigint / varchar(64)
     *                 2。实体类对应的字段是Long类型
     *                 3。随机生成一个数据，赋值给主键
     *
     *        IdType.AUTO算法：1。mysql数据库主键字段为数字类型，并且设置了auto_increment
     *                        2。插入数据自增长了
     *
     */
    @TableId(type = IdType.AUTO) //主键自增长，mysql中对应字段应该设置为自增
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableLogic //当前属性对应的列就是逻辑删除的状态字段
                //当删除数据的时候，自动编程修改此列的属性值 默认 0 未删除 1 删除
                //当查询数据时，默认只查询deleted = 0的数据
    private Integer deleted;

    @Version
    Integer version; //版本号字段
}

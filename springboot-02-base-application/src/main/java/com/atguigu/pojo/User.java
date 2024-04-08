package com.atguigu.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: User
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 22:43 2024/04/07
 * @Modified By: bin.zhao
 * @Modify Time: 22:43 2024/04/07
 * @Version: 1.0
 */

@Component
@Data
@ConfigurationProperties(prefix = "fz.user")
public class User {

    private String name;
    private String password;
    private List<String> gfs;
}

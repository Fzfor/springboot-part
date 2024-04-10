package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Main
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 20:45 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 20:45 2024/04/09
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.atguigu.mapper")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

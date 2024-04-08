package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:50 2024/04/07
 * @Modified By: bin.zhao
 * @Modify Time: 21:50 2024/04/07
 * @Version: 1.0
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("boot")
    public String hello() {
        return "hello springboot3";
    }
}

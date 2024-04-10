package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:29 2024/04/08
 * @Modified By: bin.zhao
 * @Modify Time: 21:29 2024/04/08
 * @Version: 1.0
 */
@Controller
@ResponseBody
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}

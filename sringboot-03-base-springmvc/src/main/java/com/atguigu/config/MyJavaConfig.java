package com.atguigu.config;

import com.atguigu.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: MyJavaConfig
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:46 2024/04/08
 * @Modified By: bin.zhao
 * @Modify Time: 21:46 2024/04/08
 * @Version: 1.0
 */
@Configuration
public class MyJavaConfig implements WebMvcConfigurer {

    @Autowired
    MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}

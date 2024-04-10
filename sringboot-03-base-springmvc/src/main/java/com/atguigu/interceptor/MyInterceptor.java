package com.atguigu.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @ClassName: MyInterceptor
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:43 2024/04/08
 * @Modified By: bin.zhao
 * @Modify Time: 21:43 2024/04/08
 * @Version: 1.0
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}

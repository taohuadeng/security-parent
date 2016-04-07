package com.spring.security.security02;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginUrlEntryPoint implements AuthenticationEntryPoint {

    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        String targetUrl = null;
        String url = request.getRequestURI();

        if (url.contains("/admin/login")) {
            //未登录而访问后台受控资源时，跳转到后台登录页面
            targetUrl = "/admin/login.jsp";
        } else {
            //未登录而访问前台受控资源时，跳转到前台登录页面
            targetUrl = "/login.jsp";
        }

        targetUrl = request.getContextPath() + targetUrl;
        response.sendRedirect(targetUrl);
    }

}

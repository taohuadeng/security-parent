package com.spring.security.security02;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * authentication-success-handler-ref引用
 * 对认证成功做一个处理
 */
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
            throws IOException, ServletException {
        System.out.println("AuthenticationSuccessHandler");
        response.sendRedirect(request.getContextPath() + "/loginSuccessHandler.jsp");
    }
}

package com.spring.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录失败后的处理类
 */
public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {
    private Log LOG = LogFactory.getLog(AuthenticationFailureHandlerImpl.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        LOG.info("********** AuthenticationFailureHandler **********");
        request.setAttribute("msg", "公司不存在!");
        response.sendRedirect(request.getContextPath() + "/login.jsp?msg=公司不存在!");
    }
}

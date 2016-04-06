package com.spring.security.user.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequestMapping("/user/*")
public class UserController {

    @RequestMapping("/toUser")
    public String toUser(HttpServletRequest request) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        request.setAttribute("name", getCurrentUsername());
        return "user/user";
    }

    public String getCurrentUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}

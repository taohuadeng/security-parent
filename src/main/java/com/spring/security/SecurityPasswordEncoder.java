package com.spring.security;

import org.springframework.security.authentication.encoding.PasswordEncoder;

public class SecurityPasswordEncoder implements PasswordEncoder {
    @Override
    public String encodePassword(String rawPass, Object salt) {
        return null;
    }

    @Override
    public boolean isPasswordValid(String encPass, String rawPass, Object salt) {
        return false;
    }
}

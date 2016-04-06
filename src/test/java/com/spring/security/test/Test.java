package com.spring.security.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        encoder.setEncodeHashAsBase64(true);
        System.out.println(encoder.encodePassword("user", "deng"));
    }
}

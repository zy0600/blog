package org.zm.spring.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringSecurity 启动类 *
 * author zm *
 * time 2022/7/30
 */
@SpringBootApplication
@MapperScan("org.zm.spring.security.mapper")
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}

package org.zm.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.zm.sso.config.RsaKeyProperties;

@SpringBootApplication
@MapperScan("org.zm.sso.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)  //将配置类放入Spring容器中

public class AuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }
}

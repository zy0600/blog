package org.zm.spring.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.zm.spring.security.entity.UserInfo;
import org.zm.spring.security.mapper.Mapping;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class AppTest {
    @Resource
    private Mapping maping;
    @Test
    void contextLoads() {
        List<UserInfo> listUser=maping.selectAll();
        for(UserInfo s : listUser){
            System.out.println(s.getXingMing());
        }

    }
}

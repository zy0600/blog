package org.zm.spring.security.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppApi {

    @ResponseBody
    @GetMapping("/helloLogin")
    public String helloLogin(){
        return "no login";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Security";
    }
}

package com.personal.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{

    @GetMapping("/user")
    public String index() {
        return "Hello Users, welcome to spring boot";
    }
}

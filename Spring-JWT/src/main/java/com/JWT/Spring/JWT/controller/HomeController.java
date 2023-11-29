package com.JWT.Spring.JWT.controller;

import com.JWT.Spring.JWT.module.User;
import com.JWT.Spring.JWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    private UserService userService;
    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUser(){
    System.out.println("rest controller");
    return userService.getUser();
    }
}

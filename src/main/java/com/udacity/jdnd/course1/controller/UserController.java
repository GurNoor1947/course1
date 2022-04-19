package com.udacity.jdnd.course1.controller;

import com.udacity.jdnd.course1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public String getUsers(@ModelAttribute("user") User user ,Model model){
        model.addAttribute("userList",userService.getUserList());
        return "user";
    }

    @PostMapping("/addUsers")
    public String addUsers(@ModelAttribute("user") User user , Model model){
        userService.addUserList(user);
        model.addAttribute("userList",userService.getUserList());
        return "user";
    }
}

package com.pavlo.testPortal.controller;


import com.pavlo.testPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PatchMapping("/saveUser")
    public String saveUser() {

        return "redirect:/allUsers";
    }

    @GetMapping("/getAllUsers")
    public String getAllUsers(Model model) {
        model.addAttribute("allUsers", userService.findAll());
        return "userViews/allUsers";
    }
}

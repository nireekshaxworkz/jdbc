package com.xworkz.user.controller;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
    private boolean valid;

    public UserController() {
        System.out.println("no arg constructor of UserController");
    }
    @RequestMapping("/send")
    public String onSave(UserDTO dto){
        System.out.println("onSaving the method");
        return "Login.jsp";
    }
    @RequestMapping("/submit")
    public String onSubmit(UserDTO dto){
        System.out.println("onSubmiting the method");
        userService.save(dto);
        if(valid){
            return "Success.jsp";
        }
        return "Signup.jsp";
    }
}

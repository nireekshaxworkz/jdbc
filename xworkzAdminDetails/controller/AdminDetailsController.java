package com.xworkz.xworkzAdminDetails.controller;

import com.xworkz.xworkzAdminDetails.dto.AdminDetails.AdminDetailsDTO;
import com.xworkz.xworkzAdminDetails.service.AdminDetailsService;
import com.xworkz.xworkzAdminDetails.service.AdminDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminDetailsController {

    @Autowired
    AdminDetailsService adminDetailsService;

    public AdminDetailsController() {
        System.out.println("runningn AdminDetailsController");
    }
    @RequestMapping("/save")
    public String onSubmit(AdminDetailsDTO dto){
        System.out.println("onSubmiting the class");

        System.out.println("Controller :"+dto);
       boolean saved= adminDetailsService.save(dto);
       if(saved)
        return "success.jsp";

       return "Login.jsp";
    }
}

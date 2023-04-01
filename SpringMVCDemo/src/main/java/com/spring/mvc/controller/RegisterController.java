package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String registerPage(Model model){
        return "register";
    }

    @PostMapping("/register")
    public String registerPostPage(String Username, String email, String password, Model model, String confirm_password,
                                   HttpServletRequest request){
        //validate the username, email and password using confirm password
        if(!password.equals(confirm_password)){
            model.addAttribute("error","password don't match");
            return "register";
        }
        System.out.println("New user registered:");
        System.out.println("Username: " + Username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        return "redirect:login";
    }
}

package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashBoardPage(HttpSession session){
        String email = (String)session.getAttribute("email");
        if(email==null){
            return "redirect:login";
        }
        return "dashboard";
    }
}

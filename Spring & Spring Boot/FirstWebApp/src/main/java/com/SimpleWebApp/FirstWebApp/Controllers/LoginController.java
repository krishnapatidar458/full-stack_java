package com.SimpleWebApp.FirstWebApp.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String Login(){
        return "Login Page..";
    }
}

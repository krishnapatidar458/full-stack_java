package com.SimpleWebApp.FirstWebApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping
    public String message(){
        return "Welcome in Spring World";
    }
}

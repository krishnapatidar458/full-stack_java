package com.SimpleWebApp.FirstWebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {
    @RequestMapping
    @ResponseBody
    public String message(){
        return "Welcome in Spring World";
    }
}

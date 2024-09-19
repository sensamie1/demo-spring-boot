package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {

    @GetMapping("/welcome")
    public String welcomePage() {
        // This will resolve to src/main/resources/templates/welcome.html
        return "welcome";  
    }
}

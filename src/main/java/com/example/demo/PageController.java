package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // This method handles requests to the root URL and returns the login view
    @GetMapping("/") // Maps GET requests for "/" to this method
    public String home() {
        return "login"; // This will resolve to /pages/login.jsp
    }
    
    // You can add more mapping methods as needed
    @GetMapping("/signup") // Example mapping for signup
    public String signup() {
        return "signup"; // This would resolve to /pages/signup.jsp if it exists
    }
}

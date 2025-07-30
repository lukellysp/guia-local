package br.com.guialocal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home() {
        return "home"; // Isso vai procurar por home.html em templates/
    }
}
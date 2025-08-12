package br.com.guialocal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro";
    }

    @GetMapping("/cadastro-dono")
    public String cadastroDonoPage() {
        return "cadastro-dono";
    }
}

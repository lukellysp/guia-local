package br.com.guialocal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PainelDonoController {

    @GetMapping("/painel-dono")
    public String painelDono() {
        return "painel-dono";
    }
}

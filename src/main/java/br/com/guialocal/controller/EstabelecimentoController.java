package br.com.guialocal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EstabelecimentoController {

    @GetMapping("/estabelecimentos")
    public String listarEstabelecimentos() {
        return "estabelecimentos";
    }

    @GetMapping("/estabelecimento/{id}")
    public String detalhesEstabelecimento(@PathVariable Long id) {
        return "estabelecimento-detalhes";
    }
}

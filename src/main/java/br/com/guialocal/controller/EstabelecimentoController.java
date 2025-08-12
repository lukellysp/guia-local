package com.exemplo.guialocal.controller;

import com.exemplo.guialocal.model.Estabelecimento;
import com.exemplo.guialocal.service.EstabelecimentoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    private final EstabelecimentoService service;

    public EstabelecimentoController(EstabelecimentoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("estabelecimentos", service.listarTodos());
        return "estabelecimentos/lista";
    }

    @GetMapping("/novo")
    public String formulario(Model model) {
        model.addAttribute("estabelecimento", new Estabelecimento());
        return "estabelecimentos/formulario";
    }

    @PostMapping
    public String criar(@ModelAttribute Estabelecimento estabelecimento) {
        service.criar(estabelecimento);
        return "redirect:/estabelecimentos";
    }
}

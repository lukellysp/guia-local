package br.com.guialocal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ComentarioController {

    @GetMapping("/comentarios/{estabelecimentoId}")
    public String listarComentarios(@PathVariable Long estabelecimentoId) {
        return "comentarios";
    }
}

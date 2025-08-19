package com.exemplo.guialocal.controller;

import com.exemplo.guialocal.model.Comentario;
import com.exemplo.guialocal.service.ComentarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    // Criar um comentário
    @PostMapping
    public Comentario criarComentario(@RequestBody Comentario comentario) {
        return comentarioService.salvar(comentario);
    }

    // Listar comentários de um estabelecimento
    @GetMapping("/estabelecimento/{id}")
    public List<Comentario> listarPorEstabelecimento(@PathVariable Long id) {
        return comentarioService.listarPorEstabelecimento(id);
    }

    // Deletar comentário
    @DeleteMapping("/{id}")
    public void deletarComentario(@PathVariable Long id) {
        comentarioService.deletar(id);
    }
}

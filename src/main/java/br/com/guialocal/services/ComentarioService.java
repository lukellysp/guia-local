package com.exemplo.guialocal.service;

import com.exemplo.guialocal.model.Comentario;
import com.exemplo.guialocal.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public Comentario salvar(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public List<Comentario> listarPorEstabelecimento(Long estabelecimentoId) {
        return comentarioRepository.findByEstabelecimentoId(estabelecimentoId);
    }

    public void deletar(Long id) {
        comentarioRepository.deleteById(id);
    }
}

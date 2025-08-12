package com.exemplo.guialocal.service;

import com.exemplo.guialocal.model.Estabelecimento;
import com.exemplo.guialocal.repository.EstabelecimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstabelecimentoService {

    private final EstabelecimentoRepository repository;

    public EstabelecimentoService(EstabelecimentoRepository repository) {
        this.repository = repository;
    }

    public List<Estabelecimento> listarTodos() {
        return repository.findAll();
    }

    public Estabelecimento criar(Estabelecimento estabelecimento) {
        return repository.save(estabelecimento);
    }
}

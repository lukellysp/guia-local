package com.exemplo.guialocal.repository;

import com.exemplo.guialocal.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    // Buscar comentários de um estabelecimento específico
    List<Comentario> findByEstabelecimentoId(Long estabelecimentoId);
}

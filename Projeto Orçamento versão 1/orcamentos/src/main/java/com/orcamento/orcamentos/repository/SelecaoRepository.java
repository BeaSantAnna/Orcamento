package com.orcamento.orcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orcamento.orcamentos.entity.Selecao;

@Repository
public interface SelecaoRepository extends JpaRepository<Selecao, Long> {

}

package com.orcamento.orcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orcamento.orcamentos.entity.ItemSelecao;

@Repository
public interface ItemSelecaoRepository extends JpaRepository<ItemSelecao, Long> {

}

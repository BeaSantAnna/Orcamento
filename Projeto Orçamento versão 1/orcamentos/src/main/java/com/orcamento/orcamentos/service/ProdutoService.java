package com.orcamento.orcamentos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orcamento.orcamentos.entity.Produto;
import com.orcamento.orcamentos.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

	public static List<Produto> findAll() {
		
		return null;
	}
}

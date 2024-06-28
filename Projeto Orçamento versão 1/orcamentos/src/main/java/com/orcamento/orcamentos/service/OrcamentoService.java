package com.orcamento.orcamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orcamento.orcamentos.repository.OrcamentoRepository;

@Service
public class OrcamentoService {
	@Autowired
	private OrcamentoRepository orcamentoRepository;
}

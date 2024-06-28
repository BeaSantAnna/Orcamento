package com.orcamento.orcamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orcamento.orcamentos.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
    private UsuarioRepository usuarioRepository;
}

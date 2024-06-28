package com.orcamento.orcamentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.orcamento.orcamentos.entity.Produto;
import com.orcamento.orcamentos.service.ClienteService;
import com.orcamento.orcamentos.service.ProdutoService;

public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	// Exemplo de método para mostrar o catálogo de produtos
	@GetMapping("/catalogo")
	public String catalogo(Model model) {
		List<Produto> produtos = ProdutoService.findAll();
		model.addAttribute("produtos", produtos);
		return "catalogo";
	}
}

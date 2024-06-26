package com.orcamento.orcamentos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ItemSelecao")
public class ItemSelecao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItemSelecao;
	private int quantidade;
	
	public Long getIdItemSelecao() {
		return idItemSelecao;
	}
	public void setIdItemSelecao(Long idItemSelecao) {
		this.idItemSelecao = idItemSelecao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Relacionamento 
	@ManyToOne
    @JoinColumn(name = "idOrcamento")
    private Orcamento orcamento;

    @ManyToOne
    @JoinColumn(name = "idSelecao")
    private Selecao selecao;

	
}

package com.orcamento.orcamentos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="selecao")
public class Selecao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSelecao;
	private Double valorSugerido;
	private String nomeClienteSL;
	private String emailClienteSL;
	private String telefoneClienteSL;
	
	public Long getIdSelecao() {
		return idSelecao;
	}
	public void setIdSelecao(Long idSelecao) {
		this.idSelecao = idSelecao;
	}
	public Double getValorSugerido() {
		return valorSugerido;
	}
	public void setValorSugerido(Double valorSugerido) {
		this.valorSugerido = valorSugerido;
	}
	public String getNomeClienteSL() {
		return nomeClienteSL;
	}
	public void setNomeClienteSL(String nomeClienteSL) {
		this.nomeClienteSL = nomeClienteSL;
	}
	public String getEmailClienteSL() {
		return emailClienteSL;
	}
	public void setEmailClienteSL(String emailClienteSL) {
		this.emailClienteSL = emailClienteSL;
	}
	public String getTelefoneClienteSL() {
		return telefoneClienteSL;
	}
	public void setTelefoneClienteSL(String telefoneClienteSL) {
		this.telefoneClienteSL = telefoneClienteSL;
	}
	
	
}

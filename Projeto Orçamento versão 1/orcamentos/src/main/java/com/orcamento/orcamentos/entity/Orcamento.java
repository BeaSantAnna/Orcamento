package com.orcamento.orcamentos.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orcamento")
public class Orcamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrcamento;
	private int ordemPedido;
	private int numeroPedido;
	private String formaPagamento;
	private LocalDate validadeProposta;
	private LocalDate dataEmissao;
	private String tabelaICMS;
	private String tipoEmbalagem;
	private String entrega;

	public Long getIdOrcamento() {
		return idOrcamento;
	}
	public void setIdOrcamento(Long idOrcamento) {
		this.idOrcamento = idOrcamento;
	}
	public int getOrdemPedido() {
		return ordemPedido;
	}
	public void setOrdemPedido(int ordemPedido) {
		this.ordemPedido = ordemPedido;
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public LocalDate getValidadeProposta() {
		return validadeProposta;
	}
	public void setValidadeProposta(LocalDate validadeProposta) {
		this.validadeProposta = validadeProposta;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getTabelaICMS() {
		return tabelaICMS;
	}
	public void setTabelaICMS(String tabelaICMS) {
		this.tabelaICMS = tabelaICMS;
	}
	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}
	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	
	//Relacionamentos
	//private List<ItemSelecao> itens;
	//private List<Usuario> usuarios;
	//private List<Cliente> clientes;
	//private List<Empresa> empresa;
	
}

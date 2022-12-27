package com.caixa.entities;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Double preco;
	private String codBarras;
	private String descricao;
	
	public Produto() {		
	}

	public Produto(Integer id, Double preco, String codBarras, String descricao) {
		this.id = id;
		this.preco = preco;
		this.codBarras = codBarras;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}		
}

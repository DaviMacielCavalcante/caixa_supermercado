package com.caixa.entities;

import java.io.Serializable;
import java.util.Objects;

public class ItemCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer quantidade;
	private Double desconto;
	
	private Produto produto;
	
	public ItemCompra() {		
	}

	public ItemCompra(Integer id, Integer quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}	

	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getSubTotal() {
		return (produto.getPreco() - desconto) * quantidade;
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
		ItemCompra other = (ItemCompra) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CODIGO: ");
		builder.append(getProduto().getCodBarras());
		builder.append(", DESCRICAO: ");
		builder.append(getProduto().getDescricao());
		builder.append(", QTD: ");
		builder.append(getQuantidade());
		builder.append(", VL. UN: ");
		builder.append(produto.getPreco());
		builder.append(", TOTAL: ");
		builder.append(getSubTotal());
		return builder.toString();
	}		
	
	
}
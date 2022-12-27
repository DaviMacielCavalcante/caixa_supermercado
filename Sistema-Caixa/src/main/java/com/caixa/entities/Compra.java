package com.caixa.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date momento;
	private Funcionario funcionario;
	private Pagamento pagamento;
	private List<ItemCompra> itensCompra = new ArrayList<>();
	
	public Compra() {		
	}	
	
	public Compra(Integer id, Date momento, Funcionario funcionario, Pagamento pagamento) {
		super();
		this.id = id;
		this.momento = momento;
		this.funcionario = funcionario;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}
	
	public Double getTotalProdutos() {
		double soma = 0.0;
		for (ItemCompra i: itensCompra) {
			soma += i.getSubTotal();
		}
		return soma;
	}
	
	public Integer getTotalItens() {
		int total =  0;
		for (int i = 0; i < itensCompra.size(); i++) {
			total += 1;
		}
		return total;
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
		Compra other = (Compra) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		StringBuilder builder = new StringBuilder();
		builder.append("ITENS: ");
		for (ItemCompra i: getItensCompra()) {
			builder.append(i.toString());
		}
		builder.append(", QTD. TOTAL DE ITENS: ");
		builder.append(getTotalItens());
		builder.append(", VALOR TOTAL: R$");
		builder.append(getTotalProdutos());
		builder.append(", CAIXA: ");
		builder.append(getFuncionario().getNome());
		builder.append(", HORA DA COMPRA: ");
		builder.append(sdf.format(getMomento()));
		return builder.toString();
	}	
}

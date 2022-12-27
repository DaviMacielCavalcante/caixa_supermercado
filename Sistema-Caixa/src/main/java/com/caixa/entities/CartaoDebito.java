package com.caixa.entities;

import java.util.Date;

public class CartaoDebito extends PagamentoCartao {

	private static final long serialVersionUID = 1L;

	private Double valorFatura;
	
	public CartaoDebito() {		
	}

	public CartaoDebito(Integer id, String codigo, Date validade, String codigoSeguranca, Double valorFatura) {
		super(id, codigo, validade, codigoSeguranca);
		this.valorFatura = valorFatura;
	}

	public Double getValorFatura() {
		return valorFatura;
	}
}

package com.caixa.entities;

import java.util.Date;

public class CartaoCredito extends PagamentoCartao {

	private static final long serialVersionUID = 1L;

	private Integer numeroParcelas;
	
	public CartaoCredito() {		
	}

	public CartaoCredito(Integer id, String codigo, Date validade, String codigoSeguranca, Integer numeroParcelas) {
		super(id, codigo, validade, codigoSeguranca);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}	
}

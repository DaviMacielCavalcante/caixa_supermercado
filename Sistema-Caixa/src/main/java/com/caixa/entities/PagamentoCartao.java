package com.caixa.entities;

import java.util.Date;

public class PagamentoCartao extends Pagamento {

	private static final long serialVersionUID = 1L;	
	
	private String codigo;
	private Date validade;
	private String codigoSeguranca;
	
	public PagamentoCartao() {		
	}	
	
	public PagamentoCartao(Integer id,String codigo, Date validade, String codigoSeguranca) {
		super(id);
		this.codigo = codigo;
		this.validade = validade;
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getCodigo() {
		return codigo;
	}
	public Date getValidade() {
		return validade;
	}
	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
}

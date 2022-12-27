package com.caixa.entities;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String rua;
	private String cep;
	private String bairro;
	private String complemento;
	
	public Endereco() {		
	}
	
	public Endereco(Integer id, String rua, String cep, String bairro, String complemento) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
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
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
}

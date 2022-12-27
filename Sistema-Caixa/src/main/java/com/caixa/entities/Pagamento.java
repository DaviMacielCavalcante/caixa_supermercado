package com.caixa.entities;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	public Pagamento() {		
	}	

	public Pagamento(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}	
}

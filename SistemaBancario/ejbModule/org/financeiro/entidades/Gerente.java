package org.financeiro.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Gerente extends Funcionario {

	@OneToMany
	@OrderBy("nome")
	private List<Pessoa> clientes = new ArrayList<Pessoa>();

	public List<Pessoa> getClientes() {
		return clientes;
	}

	public void setClientes(List<Pessoa> clientes) {
		this.clientes = clientes;
	}

}

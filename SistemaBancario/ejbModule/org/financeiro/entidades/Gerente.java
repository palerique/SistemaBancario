package org.financeiro.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Gerente")
@PrimaryKeyJoinColumn(name = "id")
public class Gerente extends Funcionario {

	private static final long serialVersionUID = 2886785156086764969L;
	
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

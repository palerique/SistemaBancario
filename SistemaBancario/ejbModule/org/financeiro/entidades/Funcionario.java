package org.financeiro.entidades;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {

	private String matricula;

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

}

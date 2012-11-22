package org.financeiro.entidades;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {

	private String matricula;
	private DadosDeContato dadosDeContato;

	public DadosDeContato getDadosDeContato() {
		return dadosDeContato;
	}

	public void setDadosDeContato(DadosDeContato dadosDeContato) {
		this.dadosDeContato = dadosDeContato;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

}

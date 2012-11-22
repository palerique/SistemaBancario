package org.financeiro.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 7432920988986402389L;

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

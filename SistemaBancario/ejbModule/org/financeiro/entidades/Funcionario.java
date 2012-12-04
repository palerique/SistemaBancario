package org.financeiro.entidades;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
@PrimaryKeyJoinColumn(name = "id")
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = -6449347897815262877L;
	
	@Column(name = "matricula")
	private String matricula;
	@Embedded
	private DadosDeContato dados;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public DadosDeContato getDados() {
		return dados;
	}

	public void setDados(DadosDeContato dados) {
		this.dados = dados;
	}
	
}

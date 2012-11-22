package org.financeiro.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 4075977762873370112L;

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

package org.financeiro.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Correntista extends Pessoa {

	@ManyToOne
	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}

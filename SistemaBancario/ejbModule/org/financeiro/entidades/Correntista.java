package org.financeiro.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Correntista extends Pessoa implements Serializable {

	private static final long serialVersionUID = -5037521952505078822L;

	@ManyToOne
	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}

package org.financeiro.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Correntista")
@PrimaryKeyJoinColumn(name = "id")
public class Correntista extends Pessoa {

	private static final long serialVersionUID = 8570582858488719834L;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}

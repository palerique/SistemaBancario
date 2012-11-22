package org.financeiro.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class DadosDeContato {

	private String numero;
	private TipoDeTelefone tipoDeTelefone;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoDeTelefone getTipoDeTelefone() {
		return tipoDeTelefone;
	}

	public void setTipoDeTelefone(TipoDeTelefone tipoDeTelefone) {
		this.tipoDeTelefone = tipoDeTelefone;
	}

}

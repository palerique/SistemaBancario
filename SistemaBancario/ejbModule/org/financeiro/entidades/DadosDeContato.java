package org.financeiro.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DadosDeContato implements Serializable {

	private static final long serialVersionUID = 1L;
	
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

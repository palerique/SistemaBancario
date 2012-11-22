package org.financeiro.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta implements Serializable {

	private static final long serialVersionUID = 3068941770768064397L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	private String digitoVerificador;
	private String saldoAtual;

	@Enumerated(EnumType.ORDINAL)
	private TipoDeConta tipoDeConta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public String getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(String saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public TipoDeConta getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(TipoDeConta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

}

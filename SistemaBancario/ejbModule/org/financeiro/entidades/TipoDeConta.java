package org.financeiro.entidades;

public enum TipoDeConta {

	CORRENTE("Conta Corrente"),
	POUPANCA("Conta Poupança"),
	INVESTIMENTO("Conta Investimento");
	
	private final String descricao;
	
	private TipoDeConta(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}

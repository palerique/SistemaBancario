package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Local;

import org.financeiro.entidades.Conta;
import org.financeiro.entidades.Correntista;

@Local
public interface IFachadaConta {

	public List<Conta> consultaContasDoCorrentista(Correntista c);
	
	public List<Conta> consultaContasSaldoNegativo();
	
	public void gravar(Conta conta);
	
}

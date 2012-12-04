package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Local;

import org.financeiro.entidades.Correntista;


@Local
public interface IFachadaCorrentista {

	public Correntista consultaPeloId(Long id);
	
	public List<Correntista> consultaTodos();
	
	public void inserir(Correntista correntista);
	
	public void excluir(Correntista correntista);
	
}

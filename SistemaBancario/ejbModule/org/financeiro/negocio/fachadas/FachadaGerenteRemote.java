package org.financeiro.negocio.fachadas;

import java.util.List;

import javax.ejb.Remote;

import org.financeiro.entidades.Gerente;

@Remote
public interface FachadaGerenteRemote {
	public void inserir(Gerente gerente);

	public void atualizar(Gerente gerente);

	public void excluir(Long id);

	public Gerente consultarPeloId(Long id);

	public List<Gerente> consultarTodos();

}

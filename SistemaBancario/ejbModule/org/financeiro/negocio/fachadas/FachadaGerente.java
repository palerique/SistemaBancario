package org.financeiro.negocio.fachadas;

import java.util.List;

import javax.ejb.Stateless;

import org.financeiro.entidades.Gerente;

@Stateless
public class FachadaGerente implements FachadaGerenteRemote {
	@Override
	public void inserir(Gerente gerente) {
		System.out.println("Executei o método inserir na fachada");
	}

	@Override
	public void atualizar(Gerente gerente) {
		System.out.println("Executei o método atualizar na fachada");
	}

	@Override
	public void excluir(Long id) {
		System.out.println("Executei o método excluir na fachada");
	}

	@Override
	public Gerente consultarPeloId(Long id) {
		System.out.println("Executei o método consultarPeloId na fachada");
		return null;
	}

	@Override
	public List<Gerente> consultarTodos() {
		System.out.println("Executei o método consultarTodos na fachada");
		return null;
	}
}

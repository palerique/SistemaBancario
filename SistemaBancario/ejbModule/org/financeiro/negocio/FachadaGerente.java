package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Stateless;

import org.financeiro.entidades.Gerente;


@Stateless
public class FachadaGerente implements FachadaGerenteRemote {

	@Override
	public void inserir(Gerente gerente) {
		System.out.println("Inserir gerente");
	}

	@Override
	public void atualizar(Gerente gerente) {
		System.out.println("atualizar gerente");
	}

	@Override
	public void excluir(Long id) {
		System.out.println("excluir gerente");
	}

	@Override
	public Gerente consultarPeloId(Long id) {
		System.out.println("consultar pelo id gerente");
		return null;
	}

	@Override
	public List<Gerente> consultarTodos() {
		System.out.println("consultar todos gerente");
		return null;
	}
	
}

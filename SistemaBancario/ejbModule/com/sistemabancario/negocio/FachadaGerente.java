package com.sistemabancario.negocio;

import java.util.List;

import javax.ejb.*;

import org.financeiro.entidades.Gerente;

@Stateless
public class FachadaGerente implements FachadaGerenteRemote {
	@Override
	public void inserir(Gerente gerente) {
		System.out.println("Executei o método na fachada");
	}

	@Override
	public void atualizar(Gerente gerente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Gerente consultarPeloId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gerente> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.sistemabancario.negocio;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.financeiro.entidades.Gerente;
@Stateless
public class FachadaGerenteBean implements FachadaGerenteRemote {
	@PersistenceContext
	private EntityManager em;

	public void atualizar(Gerente gerente) {
		em.merge(gerente);
	}

	public Gerente consultarPeloId(Long id) {
		return em.find(Gerente.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gerente> consultarTodos() {
		String jql = "select g from Gerente g order by g.nome";
		return em.createQuery(jql).setMaxResults(100).getResultList();
	}

	@Override
	public void excluir(Long id) {
		Gerente gerente = consultarPeloId(id);
		em.remove(gerente);
	}

	@Override
	public void inserir(Gerente gerente) {
		em.persist(gerente);
	}

}

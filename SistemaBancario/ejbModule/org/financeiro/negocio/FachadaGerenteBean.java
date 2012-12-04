package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Stateful;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.financeiro.entidades.Gerente;


@Stateful
@Interceptors(InterceptadorFachadaGerente.class)
public class FachadaGerenteBean implements FachadaGerenteRemote {
	
	@PersistenceContext(unitName = "sistemabancario-pu")
	private EntityManager em;
	
	@Override
	public void inserir(Gerente gerente) {
		em.persist(gerente);
	}

	@Override
	public void atualizar(Gerente gerente) {
		em.merge(gerente);
	}

	@Override
	public void excluir(Long id) {
		Gerente gerente = consultarPeloId(id);
		em.remove(gerente);
	}

	@Override
	public Gerente consultarPeloId(Long id) {
		return em.find(Gerente.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Gerente> consultarTodos() {
		String jql = "select g from Gerente g order by g.nome";
		return em.createQuery(jql).setMaxResults(100).getResultList();
	}

}

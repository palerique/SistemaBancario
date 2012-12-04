package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.financeiro.entidades.Correntista;


@Stateless
@Remote(value = FachadaCorrentistaRemote.class)
public class FachadaCorrentista implements IFachadaCorrentista {

	@PersistenceContext(unitName = "sistemabancario-pu")
	private EntityManager em;
	
	@Override
	public Correntista consultaPeloId(Long id) {
		return em.find(Correntista.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Correntista> consultaTodos() {
		Query query = em.createQuery("FROM Correntista");
		return query.getResultList();
	}

	@Override
	public void inserir(Correntista correntista) {
		System.out.println("teste");
		System.out.println(em);
		em.merge(correntista);
	}

	@Override
	public void excluir(Correntista correntista) {
		em.refresh(correntista);
		em.remove(correntista);
	}

}

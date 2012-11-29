package com.sistemabancario.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.financeiro.entidades.Correntista;


@Stateless
public class FachadaCorrentista implements IFachadaCorrentista {
  @PersistenceContext(unitName = "financeiro-pu")
  private EntityManager em;

  public Correntista consultaPeloId(Long id) {
    return em.find(Correntista.class, id);
  }

  public void inserir(Correntista correntista) {
    em.merge(correntista);
  }

  public List<Correntista> consultaTodos() {
    Query query = em.createQuery("FROM Correntista");
    return query.getResultList();
  }

  public void excluir(Correntista correntista) {
    em.refresh(correntista);
    em.remove(correntista);
  }
}

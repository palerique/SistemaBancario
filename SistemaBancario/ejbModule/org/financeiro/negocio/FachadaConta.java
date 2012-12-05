package org.financeiro.negocio;

import java.util.*;
import javax.ejb.*;
import javax.persistence.*;
import org.financeiro.entidades.*;

@Stateless
public class FachadaConta implements IFachadaConta {
  private static final String SQL_CONSULTA_CONTAS_CORRENTISTA = "SELECT C FROM Conta C WHERE C.correntista = ?";
  private static final String SQL_CONSULTA_CONTAS_SALDO_NEGATIVO = "SELECT C FROM Conta C WHERE C.saldoAtual < 0";
  //
  @PersistenceContext(unitName = "financeiro-pu")
  private EntityManager em;

  public List<Conta> consultaContasDoCorrentista(Correntista c) {
    Query query = em.createQuery(SQL_CONSULTA_CONTAS_CORRENTISTA);
    query.setParameter(1, c);
    return query.getResultList();
  }

  public List<Conta> consultaContasSaldoNegativo() {
    Query query = em.createQuery(SQL_CONSULTA_CONTAS_SALDO_NEGATIVO);
    return query.getResultList();
  }

  @Override
  public void gravar(Conta conta) {
    em.merge(conta);
  }
}


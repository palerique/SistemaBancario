package org.financeiro.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.financeiro.entidades.Conta;
import org.financeiro.entidades.Correntista;

@Stateless
public class FachadaConta implements IFachadaConta {

	private static final String SQL_CONSULTA_CONTAS_CORRENTISTA = "SELECT C FROM Conta C WHERE C.correntista = ?";
	private static final String SQL_CONSULTA_CONTAS_SALDO_NEGATIVO = "SELECT C FROM Conta C WHERE C.saldoAtual < 0";
	//
	@PersistenceContext(unitName = "sistemabancario-pu")
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

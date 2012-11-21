package org.financeiro.entidades.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Pessoa;

public class TesteJPAAtualizaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("SistemaBancario");

		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 1L);

		p.setEndereco("OTPX");

		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

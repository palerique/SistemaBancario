package org.financeiro.entidades.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Pessoa;

public class TesteJPAInserePessoa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("SistemaBancario");

		EntityManager em = emf.createEntityManager();

		Pessoa p = new Pessoa();
		p.setEndereco("XPTO");
		p.setNome("XPTO");
		p.setTelefone("33218181");

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}

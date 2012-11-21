package org.financeiro.entidades.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Pessoa;

public class TesteJPAConsultaPorIDPessoa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("SistemaBancario");

		EntityManager em = emf.createEntityManager();

		Pessoa pessoa = em.find(Pessoa.class, 1L);

		System.out.println(pessoa.getId());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getTelefone());
		System.out.println(pessoa.getEndereco());

		em.close();
		emf.close();
	}

}

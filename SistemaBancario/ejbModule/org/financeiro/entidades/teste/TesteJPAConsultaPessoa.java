package org.financeiro.entidades.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Pessoa;

public class TesteJPAConsultaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("SistemaBancario");

		EntityManager em = emf.createEntityManager();

		String SQL = "SELECT P FROM Pessoa P";

		@SuppressWarnings("unchecked")
		List<Pessoa> lista = em.createQuery(SQL).getResultList();

		System.out
				.println("************************************************************************");
		System.out.println("Lista de Pessoas:");
		System.out
				.println("************************************************************************");

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getId());
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getTelefone());
			System.out.println(pessoa.getEndereco());

		}

		System.out
				.println("************************************************************************");

		em.close();
		emf.close();
	}

}

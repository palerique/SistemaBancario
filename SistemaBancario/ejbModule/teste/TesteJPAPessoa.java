package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.PessoaFisica;


public class TesteJPAPessoa {

	public static void main(String[] args) {
		
		try {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
				
			
			PessoaFisica pf = new PessoaFisica();
			pf.setEndereco("Aguas Claras");
			pf.setNome("Jose");
			pf.setTelefone("3333-4444");
			pf.setCpf("111.111.111-00");
			
			em.getTransaction().begin();
			em.persist(pf);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

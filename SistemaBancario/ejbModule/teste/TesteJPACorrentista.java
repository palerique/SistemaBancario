package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Conta;
import org.financeiro.entidades.Correntista;


public class TesteJPACorrentista {

	public static void main(String[] args) {
		
		try {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
				
			Conta conta = em.find(Conta.class, 1L);
			
			Correntista c = new Correntista();
			c.setConta(conta);
			c.setEndereco("Endereço do Cliente");
			c.setNome("José Carlos");
			c.setTelefone("1234-5678");
			
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Gerente;


public class TesteJPAGerente {

	public static void main(String[] args) {
		
		try {	
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();

			Gerente g = new Gerente();
			g.setEndereco("Taguatinga");
			g.setMatricula("123456");
			g.setNome("Paulo José");
			g.setTelefone("555-5555");
			
			em.getTransaction().begin();
			em.persist(g);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

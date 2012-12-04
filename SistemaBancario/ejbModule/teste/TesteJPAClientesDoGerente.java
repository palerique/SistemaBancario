package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Gerente;
import org.financeiro.entidades.Pessoa;


public class TesteJPAClientesDoGerente {

	public static void main(String[] args) {
		
		try {	
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
			
			Gerente g = em.find(Gerente.class, 4L);
			
			List<Pessoa> pessoas = em.createQuery("Select p from Pessoa p").getResultList();
			
			em.getTransaction().begin();
			
			for(Pessoa p : pessoas) {
				g.getClientes().add(p);
			}
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Conta;
import org.financeiro.entidades.TipoDeConta;


public class TesteJPAConta {

	public static void main(String[] args) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
			
			Conta c = new Conta();
			c.setNumero("12345");
			c.setNumero("9");
			c.setTipoDeConta(TipoDeConta.POUPANCA);
			
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

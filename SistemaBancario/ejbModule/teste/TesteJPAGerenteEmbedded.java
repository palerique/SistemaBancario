package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.DadosDeContato;
import org.financeiro.entidades.Gerente;
import org.financeiro.entidades.TipoDeTelefone;


public class TesteJPAGerenteEmbedded {

	public static void main(String[] args) {
		
		try {	
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
			
			Gerente g = em.find(Gerente.class, 4L);
			DadosDeContato dados = new DadosDeContato();
			dados.setNumero("111-1111");
			dados.setTipoDeTelefone(TipoDeTelefone.COMERCIAL);
			g.setDados(dados);
			
			em.getTransaction().begin();
			em.merge(g);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

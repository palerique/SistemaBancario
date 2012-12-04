package teste;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.financeiro.entidades.Gerente;
import org.financeiro.entidades.Movimentacao;
import org.financeiro.entidades.Pessoa;
import org.financeiro.entidades.TipoDeMovimentacao;


public class TesteJPAMovimentacao {

	public static void main(String[] args) {
		
		try {	
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("financeiro-pu");
			EntityManager em = factory.createEntityManager();
			
			Movimentacao m = new Movimentacao();
			m.setData(Calendar.getInstance().getTime());
			m.setDescricao("MOVIMENTAÇÃO PARA MINHA OUTRA CONTA");
			m.setTipoDeMovimentacao(TipoDeMovimentacao.TRANSFERENCIA_CONTA_MESMO_TITULAR);
			m.setValor(new BigDecimal(1500.0));
			
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

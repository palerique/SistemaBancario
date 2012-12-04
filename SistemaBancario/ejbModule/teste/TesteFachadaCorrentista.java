package teste;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.financeiro.entidades.Conta;
import org.financeiro.entidades.Correntista;
import org.financeiro.entidades.TipoDeConta;
import org.financeiro.negocio.FachadaCorrentistaRemote;
import org.financeiro.negocio.IFachadaCorrentista;



public class TesteFachadaCorrentista {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		prop.put(Context.PROVIDER_URL, "localhost:1099");
		
		try {
			
			Context ctx = new InitialContext(prop);
			FachadaCorrentistaRemote corrent = (FachadaCorrentistaRemote) ctx.lookup("FachadaCorrentista/remote");
			
			Correntista c = new Correntista();
			Conta con = new Conta();
			con.setDigitoVerificador("23");
			con.setNumero("23454");
			con.setSaldoAtual(100D);
			con.setTipoDeConta(TipoDeConta.CORRENTE);
			
			c.setConta(con);
			c.setEndereco("Brasília");
			c.setNome("João");
			c.setTelefone("3333-3333");
			
			corrent.inserir(c);
			
//			List<Correntista> listaCorrent = corrent.consultaTodos();
//			
//			for(Correntista c : listaCorrent) {
//				System.out.println(c.getNome());
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}

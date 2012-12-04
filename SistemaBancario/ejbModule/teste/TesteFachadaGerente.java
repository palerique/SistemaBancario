package teste;

import java.util.Date;

import org.financeiro.entidades.Gerente;
import org.financeiro.negocio.FachadaGerenteRemote;

import com.sistemabancario.util.ServiceLocator;

public class TesteFachadaGerente {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1000000; i++) {
		      try {
		        FachadaGerenteRemote fachada = ServiceLocator.getLocator().getFachadaGerente();
		        Gerente gerente = new Gerente();
		        gerente.setNome("Jose " + i + new Date());
//		        gerente.setCpf("11111 " + i);
//		        gerente.setDataDeNascimento(new Date());
//		        gerente.setSalario(new Double(i));
		        gerente.setEndereco("Endereco " + i);
		        gerente.setTelefone("Telefone " + i);
		        fachada.inserir(gerente);
		        System.out.println("Registro inserido");
		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		    }
		
	}
}

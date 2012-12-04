package com.sistemabancario.util;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.financeiro.negocio.FachadaAgenciaRemote;
import org.financeiro.negocio.FachadaGerenteRemote;


public class ServiceLocator {

	private static final String JNDI_FACHADA_GERENTE = "FachadaGerenteBean/remote";
	private static final String JNDI_FACHADA_AGENCIA = "FachadaAgencia/remote";

	private static ServiceLocator serviceLocator = new ServiceLocator();
	private InitialContext defaultContext;

	private ServiceLocator() {
		try {
			Properties prop = new Properties();
			prop.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.jnp.interfaces.NamingContextFactory");
			prop.put(Context.PROVIDER_URL, "localhost:1099");

			defaultContext = new InitialContext(prop);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ServiceLocator getLocator() {
		return serviceLocator;
	}

	private Object getService(String jndiName) throws UtilitarioException {
		try {
			return defaultContext.lookup(jndiName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public FachadaGerenteRemote getFachadaGerente() {
		try {
			return (FachadaGerenteRemote) getService(JNDI_FACHADA_GERENTE);
		} catch (UtilitarioException e) {
			// FIXME Disparar uma excecao personalizada
			return null;
		}
	}

	public FachadaAgenciaRemote getFachadaAgencia() {
		try {
			return (FachadaAgenciaRemote) getService(JNDI_FACHADA_AGENCIA);
		} catch (UtilitarioException e) {
			// FIXME Disparar uma excecao personalizada
			return null;
		}
	}

}

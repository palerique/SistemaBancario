package com.sistemabancario.util;

import javax.naming.*;
import com.sistemabancario.negocio.*;

public class ServiceLocator {
	private static final String JNDI_FACHADA_GERENTE = "FachadaGerenteBean/remote";
	private static final String JNDI_FACHADA_AGENCIA = "FachadaAgenciaBean/remote";
	private static ServiceLocator serviceLocator = new ServiceLocator();
	private InitialContext defaultContext;

	private ServiceLocator() {
		try {
			defaultContext = new InitialContext();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static ServiceLocator getLocator() {
		return serviceLocator;
	}

	private Object getService(String jndiName) throws UtilitarioException {
		try {
			return defaultContext.lookup(jndiName);
		} catch (NamingException e) {
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

//	public FachadaAgenciaRemote getFachadaAgencia() {
//		try {
//			return (FachadaAgenciaRemote) getService(JNDI_FACHADA_AGENCIA);
//		} catch (UtilitarioException e) {
//			// FIXME Disparar uma excecao personalizada
//			return null;
//		}
//	}
}

package org.financeiro.negocio;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.interceptor.InvocationContext;

public class InterceptadorFachadaGerente {

	@PostConstruct
	public void construct(InvocationContext ctx) {
		System.out.println("MetodoConstruct");
	}

	@PostActivate
	public void activate(InvocationContext ctx) {
		System.out.println("MetodoActivate");
	}

	@PrePassivate
	public void passivate(InvocationContext ctx) {
		System.out.println("MetodoPassivate");
	}

	@PreDestroy
	public void destroy(InvocationContext ctx) {
		System.out.println("MetodoDestroy");
	}

}

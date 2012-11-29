package com.sistemabancario.negocio;

import javax.annotation.*;
import javax.ejb.*;
import javax.interceptor.*;

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

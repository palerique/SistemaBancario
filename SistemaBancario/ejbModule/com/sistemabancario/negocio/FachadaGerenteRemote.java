package com.sistemabancario.negocio;

import java.util.List;

import javax.ejb.*;

import org.financeiro.entidades.Gerente;

@Remote
public interface FachadaGerenteRemote {
  public void inserir(Gerente funcionario);

  public void atualizar(Gerente funcionario);

  public void excluir(Long id);

  public Gerente consultarPeloId(Long id);

  public List<Gerente> consultarTodos();


}

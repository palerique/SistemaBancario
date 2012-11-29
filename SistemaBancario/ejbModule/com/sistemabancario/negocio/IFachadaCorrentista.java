package com.sistemabancario.negocio;

import java.util.*;
import javax.ejb.*;
import org.financeiro.entidades.*;

@Local
public interface IFachadaCorrentista {
  public Correntista consultaPeloId(Long id);

  public List<Correntista> consultaTodos();

  public void inserir(Correntista correntista);

  public void excluir(Correntista correntista);
}

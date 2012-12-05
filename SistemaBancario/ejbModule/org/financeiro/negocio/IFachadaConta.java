package org.financeiro.negocio;

import java.util.*;

import javax.ejb.*;

import org.financeiro.entidades.*;

@Local
public interface IFachadaConta {
  public List<Conta> consultaContasDoCorrentista(Correntista c);

  public List<Conta> consultaContasSaldoNegativo();

  public void gravar(Conta conta);
}

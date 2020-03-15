package br.ic.casadocodigo.java9.ch06.bookstore.service;

import br.ic.casadocodigo.java9.ch06.bookstore.model.*;

public class WSPrefeitura {
  
  public static void emit(NF nf) {
    try {
      System.out.println("emitindo...");
      Thread.sleep(5000);
      System.out.println("emitido!");
    } catch(Exception e) {
      System.out.println("falha ao emitir a nf");
    }
  }
}
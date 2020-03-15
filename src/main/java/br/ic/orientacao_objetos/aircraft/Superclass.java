package br.ic.orientacao_objetos.aircraft;

public abstract class Superclass {

	public Superclass() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void teste();
	
	public void print(){
		System.out.println("Executando metod teste dentro de print...");
		
		teste();
		
		System.out.println("Executando metodo print");
	}

}

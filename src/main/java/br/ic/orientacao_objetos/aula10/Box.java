package br.ic.orientacao_objetos.aula10;

public class Box<T extends Product> {

	private T t;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

}

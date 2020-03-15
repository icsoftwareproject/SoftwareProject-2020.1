package br.ic.orientacao_objetos;
public class Box <T>{

	T t; 
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the t
	 */
	public T getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return t.toString();
	}
	
}

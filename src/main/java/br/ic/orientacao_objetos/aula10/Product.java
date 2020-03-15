package br.ic.orientacao_objetos.aula10;


public  class Product {

	private String name;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product (String name) {
		this.name = name;
	}
	public int getBrand(){
		return 1;
	}
	
	public  int getPrice() {return 0; }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

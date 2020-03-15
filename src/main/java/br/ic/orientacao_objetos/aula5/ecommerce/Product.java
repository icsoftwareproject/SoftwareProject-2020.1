package br.ic.orientacao_objetos.aula5.ecommerce;

/*
 * This class models the products that will be in the cart.
 */
public class Product {

	//Product name
	private String name;
	
	//Product price
	private double price;

	/*
	 * Product constructor
	 * 
	 * @param name the product name
	 * @param price the product price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
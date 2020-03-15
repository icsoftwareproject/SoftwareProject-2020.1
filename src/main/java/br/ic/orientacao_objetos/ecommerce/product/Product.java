package br.ic.orientacao_objetos.ecommerce.product;

import java.io.Serializable;

/**
 * This class models the products that will be in the cart.
 */
public abstract class Product implements Serializable {

	//Product name
	private String brand;
	
	//Product price
	protected double price;
	
	/**
	 * Product constructor
	 * 
	 * @param brand the product brand
	 * @param price the product price
	 */
	public Product(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public abstract double getPrice();
	
	public String toString() {
		return "Brand = " + brand + "\nPrice = " + price;
	}
}
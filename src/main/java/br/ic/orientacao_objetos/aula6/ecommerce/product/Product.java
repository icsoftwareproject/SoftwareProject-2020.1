package br.ic.orientacao_objetos.aula6.ecommerce.product;

/**
 * This class models the products that will be in the cart.
 */
public abstract class Product {

	//Product name
	private String brand;
	
	//Product price
	private double price;
	
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

	public double discount(double price)
	{
		price = price - specificDiscount(price)*0.1;
		return price;
	}	
	
	protected abstract double specificDiscount(double price);
	
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
	
}
package br.ic.orientacao_objetos.aula6.ecommerce.product;

/**
 * This class models a TV.
 */
public class TV extends Product {

	//TV size in inches
	private int inches;

	/**
	 * TV constructor
	 * 
	 * @param brand the tv brand
	 * @param price the tv price
	 * @param inches the tv size in inches
	 */
	public TV(String brand, double price, int inches) {
		super(brand, price);
		this.inches = inches;
		
	}

	public int getInches() {
		return inches;
	}

	@Override
	public double specificDiscount(double price) {
		
		price =  price - price*0.4;
		return price;
	}
	
}
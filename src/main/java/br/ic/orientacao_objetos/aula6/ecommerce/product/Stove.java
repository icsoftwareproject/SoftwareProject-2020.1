package br.ic.orientacao_objetos.aula6.ecommerce.product;

/**
 * This class models a Stove.
 */
public class Stove extends Product {

	//The number of burners of this stove
	private int burners;

	/**
	 * Stove constructor
	 * 
	 * @param brand the stove brand
	 * @param price the stove price
	 * @param burners the number of burners of this stove
	 */
	public Stove(String brand, double price, int burners) {
		super(brand, price);
		this.burners = burners;
	}

	public int getBurners() {
		return burners;
	}

	@Override
	public double specificDiscount(double price) {
		price =  price - price*0.3;
		return price;
	}
	
}
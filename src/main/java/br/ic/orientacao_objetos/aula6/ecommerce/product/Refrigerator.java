package br.ic.orientacao_objetos.aula6.ecommerce.product;

/**
 * This class models a Refrigerator.
 */
public class Refrigerator extends Product {

	//Refrigerator size
	private int size;
	
	/**
	 * Refrigerator constructor
	 * 
	 * @param brand the refrigerator brand
	 * @param price the refrigerator price
	 * @param size the refrigerator size
	 */
	public Refrigerator(String brand, double price, int size) {
		super(brand, price);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public double specificDiscount(double price) {
		
		price =  price - price*0.2;
		
		return price;
	}

}
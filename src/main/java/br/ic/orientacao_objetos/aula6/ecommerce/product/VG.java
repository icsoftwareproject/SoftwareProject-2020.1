package br.ic.orientacao_objetos.aula6.ecommerce.product;

public class VG extends Product {

	public VG(String brand, double price) {
		super(brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double specificDiscount(double price) {
		
		return price - price*0.5;
	}

}

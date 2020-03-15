package br.ic.orientacao_objetos.aula5.ecommerce;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Product dvd = new Product("DVD", 12.99);
		Product cd = new Product("CD", 1);
		Product blueray = new Product("Blueray", 99.99);
		Product game = new Product("Game", 200);
		
		Service washMyCar = new Service("Wash", new Date(), 10);
		
		ShoppingCart shoppingCart4 = new ShoppingCart(4);
		shoppingCart4.addProduct(dvd);
		shoppingCart4.addProduct(cd);
		shoppingCart4.addService(washMyCar);
		
		System.out.println(shoppingCart4.getContents());
		System.out.println("Quantidade de itens = " + shoppingCart4.getItemCount());
		System.out.println("TOTAL = " + shoppingCart4.getTotalPrice());
	}
	
}
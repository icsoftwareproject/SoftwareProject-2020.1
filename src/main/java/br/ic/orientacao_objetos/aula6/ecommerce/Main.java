package br.ic.orientacao_objetos.aula6.ecommerce;

import br.ic.orientacao_objetos.aula6.ecommerce.product.Refrigerator;
import br.ic.orientacao_objetos.aula6.ecommerce.product.Stove;
import br.ic.orientacao_objetos.aula6.ecommerce.product.TV;

public class Main {

	public static void main(String[] args) {
		
		TV samsungTV = new TV("Samsung", 3999.99, 42);
		Refrigerator consulFridge = new Refrigerator("Consul", 2999.99, 60);
		Stove brastempStove = new Stove("Brastemp", 399.99, 4);
		
		System.out.println(samsungTV.discount(100));
	}

}
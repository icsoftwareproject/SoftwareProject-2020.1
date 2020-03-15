package br.ic.orientacao_objetos.ecommerce.persistence;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import br.ic.orientacao_objetos.ecommerce.ShoppingCart;

public class JSONPersistence implements PersistenceSession {

	@Override
	public void save(ShoppingCart shoppingCart) {
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream("shopping-cart.json");
			JsonWriter jw = new JsonWriter(outputStream);
			jw.write(shoppingCart);
			jw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(ShoppingCart shoppingCart) {
		
	}

	@Override
	public ShoppingCart find(String queryName) {
		return null;
	}

}
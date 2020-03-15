package br.ic.orientacao_objetos.ecommerce.persistence;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import br.ic.orientacao_objetos.ecommerce.ShoppingCart;

public class FilePersistence implements PersistenceSession {

	@Override
	public void save(ShoppingCart shoppingCart) {
		try {
			OutputStream outputStream = new FileOutputStream("shopping-carts.ufal");
			
			ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);
			
			objectStream.writeObject(shoppingCart);
			
			objectStream.close();
			
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
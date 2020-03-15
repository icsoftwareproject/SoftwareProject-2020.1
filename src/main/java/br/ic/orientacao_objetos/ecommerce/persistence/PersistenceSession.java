package br.ic.orientacao_objetos.ecommerce.persistence;

import br.ic.orientacao_objetos.ecommerce.ShoppingCart;

public interface PersistenceSession {

	void save(ShoppingCart shoppingCart);
	
	void remove(ShoppingCart shoppingCart);
	
	ShoppingCart find(String queryName);
	
}
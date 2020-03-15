package br.ic.orientacao_objetos.aula6.ecommerce;

import java.util.ArrayList;

import br.ic.orientacao_objetos.aula6.ecommerce.product.Product;
import br.ic.orientacao_objetos.aula6.ecommerce.product.TV;

/**
 * This class models the cart that will be used in our e-commerce system.
 */
public class ShoppingCart {

	//Customer ID of this cart
	private int customerID;
	
	//List that contains all products of this ShoppingCart object
	private ArrayList productsList;
	
	/**
	 * Constructor of the ShoppingCart class.
	 * We only allow the customerID to avoid a complete product list.
	 * 
	 *  @param customerID the customer ID
	 */
	public ShoppingCart(int customerID) {
		this.customerID = customerID;
		productsList = new ArrayList();
	}

	public void addProduct(Product product) {
		productsList.add(product);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < productsList.size(); i++) {
			Product product = (Product) productsList.get(i);
			totalPrice = totalPrice + product.getPrice();
		}
		return totalPrice;
	}
	
	public int getItemCount() {
		return productsList.size();
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void removeProduct(Product product) {
		productsList.remove(product);
	}
	
	public String getContents() {
		String result = "";
		
		for (int i = 0; i < productsList.size(); i++) {
			Product product = (Product) productsList.get(i);
			
			result = result + "Brand: " + product.getBrand() + "; Price = " + product.getPrice() ;
		
			if (product instanceof TV) {
				TV tv = (TV) product;
				result = result + "; Inches: " + tv.getInches();
			}
			
				result = result  + "\n";
		}
		
		return result;
	}
	
}
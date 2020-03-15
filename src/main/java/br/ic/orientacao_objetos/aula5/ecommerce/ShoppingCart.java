package br.ic.orientacao_objetos.aula5.ecommerce;

import java.util.ArrayList;

/*
 * This class models the cart that will be used in our e-commerce system.
 */
public class ShoppingCart {

	//Customer ID of this cart
	private int customerID;
	
	//List that contains all products of this ShoppingCart object
	private ArrayList<Product> list;
	
	/*
	 * Constructor of the ShoppingCart class.
	 * We only allow the customerID to avoid a complete product list.
	 * 
	 *  @param customerID the customer ID
	 */
	public ShoppingCart(int customerID) {
		this.customerID = customerID;
		list = new ArrayList<Product>();
	}
	
	

	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void addService(Service service) {
		//list.add(service);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < list.size(); i++) {
			Product product =  (Product)list.get(i);
			totalPrice = totalPrice + product.getPrice();
		}
		return totalPrice;
	}
	
	public int getItemCount() {
		return list.size();
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}
	
	public String getContents() {
		String result = "";
		
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product)list.get(i);
			result = result + "Name: " + product.getName() + "; Price = " + product.getPrice() + "\n";
		}
		
		return result;
	}
	
}
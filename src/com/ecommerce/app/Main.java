package com.ecommerce.app;

import com.ecommerce.products.Product;
import com.ecommerce.services.CartService;


public class Main {
	public static void main(String[] args) {
		
		Product phone = new Product(101, "SmartPhone X", 14999.00);
		Product charger = new Product(102, "Fast Charger", 799.00);


		CartService cart = new CartService();
		cart.addItem(phone, 1);
		cart.addItem(charger, 2);

		
		System.out.println("=== Shopping Cart Summary ===");
		cart.printCartSummary();
	}

}

package com.ecommerce.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.ecommerce.products.Product;

public class CartService {

	private final Map<Product, Integer> items = new LinkedHashMap<>();

	
	public void addItem(Product p, int qty) {
		if (qty <= 0)
			return;
		items.put(p, items.getOrDefault(p, 0) + qty);
	}

	
	public void printCartSummary() {
		if (items.isEmpty()) {
			System.out.println("Your cart is empty.");
			return;
		}

		double total = 0.0;
		for (Map.Entry<Product, Integer> e : items.entrySet()) {
			Product p = e.getKey();
			int q = e.getValue();
			double line = p.getPrice() * q;
			System.out.printf("%s   x%d   ->  ₹%.2f%n", p.getName(), q, line);
			total += line;
		}

		System.out.println("----------------------------------");
		System.out.printf("Total: ₹%.2f%n", total);
	}
}

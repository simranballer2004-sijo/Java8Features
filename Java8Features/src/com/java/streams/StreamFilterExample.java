package com.java.streams;

import java.util.*;

public class StreamFilterExample {
	
	public static void main(String[] args) {
		getProduct().stream().filter((x) -> x.getPrice() > 70000f).forEach(x -> System.out.println(x.getName() + " " + x.getPrice()));
		
	}
	
	private static List<Product> getProduct() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "HP LAPTOP", 25000f));
		productList.add(new Product(1, "DELL LAPTOP", 28000f));
		productList.add(new Product(1, "MACBOOK LAPTOP", 125000f));
		productList.add(new Product(1, "MSI LAPTOP", 75000f));
		productList.add(new Product(1, "ASUS LAPTOP", 70000f));
		return productList;

	}

}

class Product {
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}

package com.nttdata.bootcamp.project_functional.models;

public class Product {

	private Integer id;
	private String name;
	private double price;
	
	public Product(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

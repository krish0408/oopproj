package com;

public class Item {

	private int id;
	private String name;
	private float price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	//getter methods
	public int getId() {
		return id;
	}

	//setter methods
	public void setId(int id) {
		if(id > 0)
			this.id = id;
		else
			System.out.println("Invalid id");
	}

	//getter methods
	public String getName() {
		return name;
	}

	//setter methods
	public void setName(String name) {
		this.name = name;
	}

	//getter methods
	public float getPrice() {
		return price;
	}

	//setter methods
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

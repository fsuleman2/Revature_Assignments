package com.app.model;

public class Product {

	private int productId;
	private String name;
	private float rating;
	private boolean available;
	private double cost;
	private int manufacturerId;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, float rating, boolean available, double cost, int manufacturerId) {
		super();
		this.name = name;
		this.rating = rating;
		this.available = available;
		this.cost = cost;
		this.manufacturerId = manufacturerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", rating=" + rating + ", available=" + available
				+ ", cost=" + cost + ", manufacturerId=" + manufacturerId + "]";
	}
	
	
}

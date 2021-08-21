package com.product.model;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + manufacturerId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (manufacturerId != other.manufacturerId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	
	
}

package com.app.bus;

import java.util.Objects;

public class Bus  {

	private int busId;
	private String busProvider;
	private double cost;
	private float rating;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int busId, String busProvider, double cost, float rating) {
		super();
		this.busId = busId;
		this.busProvider = busProvider;
		this.cost = cost;
		this.rating = rating;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusProvider() {
		return busProvider;
	}

	public void setBusProvider(String busProvider) {
		this.busProvider = busProvider;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busProvider=" + busProvider + ", cost=" + cost + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(busId, busProvider, cost, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bus)) {
			return false;
		}
		Bus other = (Bus) obj;
		return busId == other.busId && Objects.equals(busProvider, other.busProvider)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating);
	}

	
	
}

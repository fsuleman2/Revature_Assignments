package com.app.bus;

import java.util.List;

public interface BusService {

	public Bus getBusById(int id);
	
	public List<Bus> getBusByProviderName(String busProvider);
	
	public List<Bus> getBusesByCost(double cost);
	public List<Bus> getBusesByRatings(float rating);
}

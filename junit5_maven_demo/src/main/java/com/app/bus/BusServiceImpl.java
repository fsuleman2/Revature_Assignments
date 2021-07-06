package com.app.bus;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BusServiceImpl implements BusService {

	public  static Map<Integer, Bus> busList;

	@Override
	public Bus getBusById(int id) {
		// TODO Auto-generated method stub
		return busList.get(id);
	}

	@Override
	public List<Bus> getBusByProviderName(String busProvider) {
		
		return busList.values().stream().filter(x->x.getBusProvider().equals(busProvider)).collect(Collectors.toList());
	}

	@Override
	public List<Bus> getBusesByCost(double cost) {
		// TODO Auto-generated method stub
		return busList.values().stream().filter(x->x.getCost()==cost).collect(Collectors.toList());
	}

	@Override
	public List<Bus> getBusesByRatings(float rating) {
		return busList.values().stream().filter(x -> x.getRating() == rating).collect(Collectors.toList());
	}

	

	

}

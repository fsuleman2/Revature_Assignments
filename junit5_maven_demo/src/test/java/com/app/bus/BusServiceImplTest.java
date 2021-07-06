package com.app.bus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BusServiceImplTest {
	private static BusService service;
	
	@BeforeAll
	public static void setupBusService() {
		service=new BusServiceImpl();
		Map<Integer, Bus> busList=new HashMap<>();
		busList.put(100,new Bus(100, "abc travel", 122.22, 2.3f));
		busList.put(200,new Bus(200, "abc travel", 1222.22, 4.3f));
		busList.put(101,new Bus(101, "xyz travel", 1202.22, 1.3f));
		busList.put(202,new Bus(202, "java travel", 1200.22, 2.3f));
		busList.put(900,new Bus(900, "jee travel", 1202.22, 2.3f));
		busList.put(150,new Bus(150, "jse travel", 1221.22, 4.3f));
		busList.put(120,new Bus(120, "java travel", 122.22, 3.3f));
		
		BusServiceImpl.busList=busList;
		
	}

	@Test
	void testGetBusById() {
		int id=100;
		Bus b=new Bus(100, "abc travel", 122.22, 2.3f);
		assertEquals(b, service.getBusById(id));
	}

	@Test
	void testGetBusByProviderName() {
		String s="abc travel";
		List<Bus> buses=service.getBusByProviderName(s);
		for(Bus b:buses) {
			if(b.getBusProvider().equals(s)) {
				continue;
			}else {
				fail("bus not matching");
			}
		}
	//	assertEquals(2, service.getBusByProviderName(s).size());
	}

	@Test
	void testGetBusesByCost() {
//		fail("Not yet implemented");
		double cost = 122.22;
		List<Bus> buses = service.getBusesByCost(cost);
		for(Bus b : buses) {
			if(b.getCost() == cost) {
				continue;
			}
			else {
				fail("Bus cost not found");
			}
		}
	}

	@Test
	void testGetBusesByRatings() {
		float rating = 2.3f;
		List<Bus> buses = service.getBusesByRatings(rating);
		for(Bus b : buses) {
			if(b.getRating() == rating) {
				continue;
			}else {
				fail("bus rating not matching");
			}
		}
	}

}
//atleast add 5 other test cases
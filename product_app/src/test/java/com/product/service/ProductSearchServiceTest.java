package com.product.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.product.exception.BusinessException;
import com.product.model.Product;
import com.product.service.impl.ProductSearchServiceImpl;

class ProductSearchServiceTest {
	
	private static ProductSearchService service;
	
	@BeforeAll
	public static void setUp() {
		service=new ProductSearchServiceImpl();
	}

	@Test
	void testGetProductsByName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProductsByRating() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProductsByCost() {
		fail("Not yet implemented");
	}

	@Test
	void testGetProductByIdForExisting() {
		Product p=new Product("tv", 2.3f, true, 14000, 1002);
		p.setProductId(3);
		try {
			assertEquals(p, service.getProductById(3));
		} catch (BusinessException e) {
			fail("Test case failed");
		}
		
	}
	
	@Test
	void testGetProductByIdForInvalidProductId() {
		
		try {
			service.getProductById(300);
		} catch (BusinessException e) {
			assertEquals("Invalid ProductId : 300", e.getMessage());
		}
		
	}
	@Test
	void testGetProductByIdForNonExisting() {
		
		try {
			service.getProductById(50);
		} catch (BusinessException e) {
			assertEquals("No product found with id 50", e.getMessage());
		}
		
	}
	

	@Test
	void testGetProductsByManufacturerName() {
		fail("Not yet implemented");
	}

}

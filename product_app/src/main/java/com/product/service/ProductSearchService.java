package com.product.service;

import java.util.List;

import com.product.exception.BusinessException;
import com.product.model.Product;

public interface ProductSearchService {

	public List<Product> getProductsByName(String name) throws BusinessException;
	public List<Product> getProductsByRating(float cost) throws BusinessException;
	public List<Product> getProductsByCost(double cost) throws BusinessException;
	public Product getProductById(int productId)throws BusinessException;
	public List<Product> getProductsByManufacturerName(String manufacturerName) throws BusinessException;
	
}

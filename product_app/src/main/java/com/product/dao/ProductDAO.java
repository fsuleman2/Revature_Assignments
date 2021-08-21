package com.product.dao;

import java.util.List;

import com.product.exception.BusinessException;
import com.product.model.Product;

public interface ProductDAO {
	public List<Product> getProductsByName(String name) throws BusinessException;
	public List<Product> getProductsByRating(float rating) throws BusinessException;
	public List<Product> getProductsByCost(double cost) throws BusinessException;
	public List<Product> getProductsByManufacturerName(String manufacturerName) throws BusinessException;
	public Product getProductById(int productId)throws BusinessException;
	
	public Product createProduct(Product product) throws BusinessException;
	public Product updateProduct(int productId,double cost) throws BusinessException;
	public List<Product> getAllProducts() throws BusinessException;
	public void deleteProduct(int productId) throws BusinessException;
}

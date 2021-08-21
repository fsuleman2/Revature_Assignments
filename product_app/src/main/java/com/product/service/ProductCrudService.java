package com.product.service;

import java.util.List;

import com.product.exception.BusinessException;
import com.product.model.Product;

public interface ProductCrudService {

	public Product createProduct(Product product) throws BusinessException;
	public Product updateProduct(int productId,double cost) throws BusinessException;
	public List<Product> getAllProducts() throws BusinessException;
	public void deleteProduct(int productId) throws BusinessException;
}

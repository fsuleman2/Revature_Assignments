package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Product;

public interface ProductDAO {

	public Product createProduct(Product product)throws BusinessException;
	public Product getProductById(int id)throws BusinessException;
	public List<Product> getAllProducts() throws BusinessException;
	//TASK
	public int updateProductCost(int productId,float cost) throws BusinessException;
	public void deleteProduct(int productId)throws BusinessException;
	public List<Product> getProductsByName(String name) throws BusinessException;
	
	
}

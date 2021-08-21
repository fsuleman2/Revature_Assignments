package com.product.service.impl;

import java.util.List;

import com.product.dao.ProductDAO;
import com.product.dao.impl.ProductDAOImpl;
import com.product.exception.BusinessException;
import com.product.model.Product;
import com.product.service.ProductSearchService;

public class ProductSearchServiceImpl implements ProductSearchService {

	private ProductDAO productDAO=new ProductDAOImpl();
	@Override
	public List<Product> getProductsByName(String name) throws BusinessException {
		List<Product> productList = null;
		if(name!=null){
			productList = productDAO.getProductsByName(name);
		}
		else {
			throw new BusinessException("Invalid Product Name....! "+name);
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByRating(float rating) throws BusinessException {
		List<Product> productList = null;
		if(rating>=0.0){
			
			productList = productDAO.getProductsByRating(rating);
		}
		else {
			throw new BusinessException("Invalid Product Rating....! "+rating);
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByCost(double cost) throws BusinessException {
		List<Product> productList = null;
		if(cost>=0.0){
			
			productList = productDAO.getProductsByCost(cost);
		}
		else {
			throw new BusinessException("Invalid Product Cost....! "+cost);
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByManufacturerName(String manufacturerName) throws BusinessException {
		List<Product> productList=null;
		if(manufacturerName!=null && manufacturerName.matches("[a-zA-Z]{3,10}")) {
			//code here to DAO
			productList=productDAO.getProductsByManufacturerName(manufacturerName);
		}else {
			throw new BusinessException("Invalid Manufacturer Name : "+manufacturerName);
		}
		return productList;
	}

	@Override
	public Product getProductById(int productId) throws BusinessException {
		Product product=null;
		if(productId<=0 || productId>100) {
			throw new BusinessException("Invalid ProductId : "+productId);
		}else {
			//code here to DAO
			product=productDAO.getProductById(productId);
		}
		return product;
	}
	

}

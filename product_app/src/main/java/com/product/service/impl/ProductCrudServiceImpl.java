package com.product.service.impl;

import java.util.List;

import com.product.dao.ProductDAO;
import com.product.dao.impl.ProductDAOImpl;
import com.product.exception.BusinessException;
import com.product.model.Product;
import com.product.service.ProductCrudService;

public class ProductCrudServiceImpl implements ProductCrudService{
	
	private ProductDAO productDAO=new ProductDAOImpl();
	@Override
	public Product createProduct(Product product) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(int productId, double cost) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int productId) throws BusinessException {
		//Product product=null;
		if(productId<=0 || productId>100) {
			throw new BusinessException("Invalid ProductId : "+productId);
		}else {
			//code here to DAO
			ProductDAO productDAO =new ProductDAOImpl();
			productDAO.deleteProduct(productId);
		}
		
	}

}

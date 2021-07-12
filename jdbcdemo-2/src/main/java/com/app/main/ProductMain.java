package com.app.main;



import java.util.List;

import com.app.dao.ProductDAO;
import com.app.dao.impl.ProductDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		//Product product=new Product("mobile", 4.33f, true, 24999.99, 1002);
		
		ProductDAO productDAO=new ProductDAOImpl();
//		try {
//			product=productDAO.createProduct(product);
//			if(product.getProductId()!=0) {
//				System.out.println("Product registered successfully with below details");
//				System.out.println(product);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		Product product=null;
//		int id=13;
//		try {
//			product=productDAO.getProductById(id);
//			if(product!=null) {
//				System.out.println("Product with id "+id+" found details are : ");
//				System.out.println(product);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		List<Product> productList=null;
//		try {
//			productList=productDAO.getAllProducts();
//			if(productList!=null && productList.size()>0) {
//				System.out.println("We have "+productList.size()+" no of product/s in DB details are");
//				for(Product product:productList) {
//					System.out.println(product);
//				}
//			}
//		} catch (BusinessException e) {
//		System.out.println(e.getMessage());
//		}
		/*==================================Task: UPDATE QUERY MAIN STARTS HERE========================*/
//		int i;
//		int productId=2;
//		float cost = 57000;
//		try {
//			i= productDAO.updateProductCost(productId, cost);
//			if(i!=0) {
//				System.out.println("Product with id "+productId+" is updated with cost : "+cost);
//				//System.out.println(product);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		/*==================================Task: UPDATE QUERY MAIN ENDS HERE========================*/
		
		
		/*==================================Task: DELETE QUERY MAIN STARTS HERE========================*/
//		int productId=4;
//		try {
//			productDAO.deleteProduct(productId);
//			System.out.println("Product with id "+ productId+" is deleted Successfully");
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		/*==================================Task: DELETE QUERY MAIN ENDS HERE===================================*/
		
		
		/*==================================Task: LIST ONLY NAMES QUERY MAIN STARTS HERE========================*/
		List<Product> productList = null;
		String name = "headphones";
		try {
			productList=productDAO.getProductsByName(name);
			if(productList!=null && productList.size()>0) {
				System.out.println("We have "+productList.size()+" products by name "+name.toUpperCase()+" in Database.");
				System.out.println("The Details are");
				for(Product product:productList) {
					System.out.println(product);
				}
			}
		} catch (BusinessException e) {
		System.out.println(e.getMessage());
		}		
		/*==================================Task: LIST ONLY NAMES QUERY MAIN STARTS HERE========================*/
		
	}//main
}//class
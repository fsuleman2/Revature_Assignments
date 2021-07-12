package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.ProductDAO;
import com.app.dbutil.PostgresConnection;
import com.app.exception.BusinessException;
import com.app.model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public Product createProduct(Product product) throws BusinessException {
		
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="insert into product_schema.product(name,cost,rating,available,manufacturerid) values(?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getCost());
			preparedStatement.setFloat(3, product.getRating());
			preparedStatement.setBoolean(4, product.isAvailable());
			preparedStatement.setInt(5, product.getManufacturerId());
			
			int c=preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet=preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					product.setProductId(resultSet.getInt(1));
				}
			}else {
				throw new BusinessException("Product Registration Failure Please Retry!!!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		
		return product;
	}

	@Override
	public Product getProductById(int id)throws BusinessException {
		Product product=null;
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select name,cost,rating,available,manufacturerid from product_schema.product where productid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				product=new Product();
				product.setProductId(id);
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
			}else {
				throw new BusinessException("No product found with id "+id);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select productid,name,cost,rating,available,manufacturerid from product_schema.product";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Product product=new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
				productList.add(product);
			}
			if(productList.size()==0) {
				throw new BusinessException("No products exists as of now.. go ahead create one...");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return productList;
	}
/*=============================Task: UPDATE CODE Starts HERE=============================================*/
	@Override
	public int updateProductCost(int productId, float cost) throws BusinessException {
		int rowAffected;
		try(Connection connection=PostgresConnection.getConnection()){
			String sql = "update product_schema.product set cost = ? where productid = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(2, productId);
			preparedStatement.setFloat(1,cost);
			rowAffected=preparedStatement.executeUpdate();
				
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		
	}
		return rowAffected;
	}
	/*==================================Task: UPDATE CODE ENDS HERE===============================================*/
	
	/*==================================Task: DELETE CODE STARTS HERE=============================================*/
	@Override
	public void deleteProduct(int productId) throws BusinessException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "delete from product_schema.product where productid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			preparedStatement.executeUpdate();
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		
	}
		
	}//deleteProduct()
	/*==================================Task: DELETE CODE ENDS HERE=============================================*/
	
	/*==================================Task: LIST ONLY NAMES QUERY STARTS HERE=================================*/
	public List<Product> getProductsByName(String name) throws BusinessException{
		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql = "select productid,name,cost,rating,available,manufacturerid from product_schema.product where name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product=new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
				productList.add(product);
			}
			if(productList.size()==0) {
				throw new BusinessException("No products exists as of now.. go ahead create one...");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return productList;
		
	}
	
	
	
	/*==================================Task: LIST ONLY NAMES QUERY ENDS HERE===================================*/
}

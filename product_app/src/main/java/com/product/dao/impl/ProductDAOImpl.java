package com.product.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.product.dao.ProductDAO;
import com.product.dbutil.PostgresConnection;
import com.product.exception.BusinessException;
import com.product.model.Product;

public class ProductDAOImpl implements ProductDAO {
	private static Logger log = Logger.getLogger(ProductDAOImpl.class);

	@Override
	public List<Product> getProductsByName(String name) throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select productid,name,cost,rating,available,manufacturerid from product_schema.product where name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet=preparedStatement.executeQuery();
			//System.out.println(resultSet);
			while(resultSet.next()) {
				Product product =  new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
				productList.add(product);
			}
			//System.out.println(productList.size());
			if(productList.size()==0){
				throw new BusinessException("No product exists as of now with name : "+name);
			}
		}catch (ClassNotFoundException | SQLException e) {
				log.error(e);//logger
				throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
			}
		return productList;
	}

	@Override
	public List<Product> getProductsByRating(float rating) throws BusinessException {

		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select productid,name,cost,rating,available,manufacturerid from product_schema.product where rating=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setFloat(1, rating);
			ResultSet resultSet=preparedStatement.executeQuery();
			//System.out.println(resultSet);
			while(resultSet.next()) {
				Product product =  new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
				productList.add(product);
			}
			//System.out.println(productList.size());
			if(productList.size()==0){
				throw new BusinessException("No product exists as of now with name : "+rating);
			}
		}catch (ClassNotFoundException | SQLException e) {
				log.error(e);//logger
				throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByCost(double cost) throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select productid,name,cost,rating,available,manufacturerid from product_schema.product where cost=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1, cost);
			ResultSet resultSet=preparedStatement.executeQuery();
			//System.out.println(resultSet);
			while(resultSet.next()) {
				Product product =  new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
				productList.add(product);
			}
			//System.out.println(productList.size());
			if(productList.size()==0){
				throw new BusinessException("No product exists as of now with cost : "+cost);
			}
		}catch (ClassNotFoundException | SQLException e) {
				log.error(e);//logger
				throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByManufacturerName(String manufacturerName) throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select productid,p.name,cost,rating,available,p.manufacturerid from product_schema.product p JOIN product_schema.manufacturer m on p.manufacturerid=m.manufacturerid where m.name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, manufacturerName);
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
				throw new BusinessException("No products exists as of now produced by the manufacturer : "+manufacturerName);
			}
		}catch (ClassNotFoundException | SQLException e) {
			log.error(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return productList;
	}

	@Override
	public Product getProductById(int productId) throws BusinessException {
		Product product = null;
		try (Connection connection = PostgresConnection.getConnection()) {
			String sql = "select name,cost,rating,available,manufacturerid from product_schema.product where productid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				product = new Product();
				product.setProductId(productId);
				product.setName(resultSet.getString("name"));
				product.setCost(resultSet.getDouble("cost"));
				product.setRating(resultSet.getFloat("rating"));
				product.setAvailable(resultSet.getBoolean("available"));
				product.setManufacturerId(resultSet.getInt("manufacturerid"));
			} else {
				throw new BusinessException("No product found with id " + productId);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			// System.out.println(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
		return product;
	}

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
		//Product product = null;
		try (Connection connection = PostgresConnection.getConnection()) {
			String sql="delete from product_schema.product where productid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			int c=preparedStatement.executeUpdate();
			if(c==1) {
				log.info("Successfully deleted : "+productId);
			}else
			{
				throw new BusinessException("Product Deletion Failure Please Retry!!!");
			}
		}catch (ClassNotFoundException | SQLException e) {
			log.error(e);//logger
			throw new BusinessException("Internal error occured... Kindly conatct SYSADMIN........");
		}
	}

}

package com.product.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.product.dao.ProductDAO;
import com.product.exception.BusinessException;
import com.product.model.Product;
import com.product.service.ProductCrudService;
import com.product.service.ProductSearchService;
import com.product.service.impl.ProductCrudServiceImpl;
import com.product.service.impl.ProductSearchServiceImpl;

public class ProductMain {

	private static Logger log = Logger.getLogger(ProductMain.class);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("Welcome to ProductApp V1.0");
			log.info("==================================");
			log.info("\nProduct Menu");
			log.info("1)Create Product");
			log.info("2)Update Product");
			log.info("3)Delete Product");
			log.info("4)Search Products by Various Filters");
			log.info("5)List All Products");
			log.info("6)EXIT");
			log.info("Enter your Choice 1-6");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:

				break;
			case 2:

				break;
			case 3:
				log.info("Enter Product ID to Delete");
				ProductCrudService productCrudService = new ProductCrudServiceImpl();
				try {
					int productId = Integer.parseInt(sc.nextLine());
					// call the service to search the product by id
					productCrudService.deleteProduct(productId);
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}

				break;
			case 4:
				int s = 0;
				ProductSearchService productSearchService = new ProductSearchServiceImpl();
				do {
					log.info("\n\nSearch Product Menu.Use Various filters below to search your Product.....");
					log.info("---------------------------------------------------------------------------------------");
					log.info("1)By ID");
					log.info("2)By Name");
					log.info("3)By Rating");
					log.info("4)By Cost");
					log.info("5)By Manufacturer Name");
					log.info("6)Main Menu");
					log.info("Enter your Choice 1-6");
					try {
						s = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {

					}
					switch (s) {
					case 1:
						log.info("Enter Product ID to get Product Details");
						try {
							int productId = Integer.parseInt(sc.nextLine());
							// call the service to search the product by id
							Product product = productSearchService.getProductById(productId);
							if (product != null) {
								log.info("Product with id " + productId + " was found... Details are");
								log.info(product);
							}
						} catch (NumberFormatException e) {
							log.error("Invalid ProductId, it should be integer value not char");
						} catch (BusinessException e) {
							log.error(e.getMessage());
						}
						break;
					case 2: log.info("Enter Product Name to get Product Details");
							String name = sc.nextLine();
							
						try {
							
							List<Product> productList = productSearchService.getProductsByName(name);
							if(productList!=null && productList.size()>0) {
								System.out.println("Below are the list of products names from Product");
								for(Product p : productList) {
									log.info(p);
								}
							}
						}
						catch (BusinessException e1) {
							log.error(e1.getMessage());
						}

						break;
					case 3:log.info("Enter Product Rating to get Product Details");
							float rating = Float.parseFloat(sc.nextLine());
						try {
							List<Product> productList = productSearchService.getProductsByRating(rating);
							if(productList!=null && productList.size()>0) {
								log.info("Product with Rating " + rating + " was found... Details are");
								for(Product p : productList) {
									log.info(p);
								}
							}
						} catch (NumberFormatException e) {
							log.error("Invalid ProductTing, it should be Float value not char");
						}catch (BusinessException e1) {
							log.error(e1.getMessage());
						}
							
						break;
					case 4:log.info("Enter Product Cost to get Product Details");
					double cost = Double.parseDouble(sc.nextLine());
				try {
					List<Product> productList = productSearchService.getProductsByCost(cost);
					if(productList!=null && productList.size()>0) {
						log.info("Product with cost " + cost + " was found... Details are");
						for(Product p : productList) {
							log.info(p);
						}
					}
				} catch (NumberFormatException e) {
					log.error("Invalid ProductTing, it should be Float value not char");
				}catch (BusinessException e1) {
					log.error(e1.getMessage());
				}

						break;
					case 5:
						log.info("Enter Manufacturer Name to get the products Manufactured By them");
						String manufacturerName = sc.nextLine();
						try {
							List<Product> productList=productSearchService.getProductsByManufacturerName(manufacturerName);
							if(productList!=null && productList.size()>0) {
								System.out.println("Below are the list of product/s which manufactured by manufacturer "+manufacturerName.toUpperCase());
								for(Product p:productList) {
									log.info(p);
								}
							}
						} catch (BusinessException e) {
							log.error(e.getMessage());
						}
						break;

					case 6:
						log.info("\n\nGoing to Main Menu............\n\n");

						break;

					default:
						log.warn("Invalid Choice... Please enter input between 1-6");
						break;
					}
				} while (s != 6);

				break;
			case 5: 
				ProductDAO productDao=null;
				
				try {
					List<Product> productList=productDao.getAllProducts();
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 6:
				log.info("Thanks for using our App.. See you soon. :)");

				break;

			default:
				log.warn("Invalid Choice... Please enter input between 1-6");
				break;
			}
		} while (ch != 6);
	}

}

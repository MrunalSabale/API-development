package com.program.service;

import java.util.List;

import com.program.entity.Product;

import com.program.exception.ProductException;


public interface ProductService {

	

	
	public Product register(Product product) throws ProductException;
	
	
	 public List<Product>  getAllProduct() throws ProductException;
	 public Product addNewProduct(Product product)throws ProductException;
	 
	 // Edit product by id
	 public Product getProudctById(Integer PId)throws ProductException;
	 public Product updateProductById(Integer id) throws ProductException;
	 public Product deleteProductById(Integer Id) throws ProductException;


}

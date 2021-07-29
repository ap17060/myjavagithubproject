package com.lti.dao;

import java.util.ArrayList;

import com.demart.entity.Product;
import java.util.List;

public class ImplProductDao implements IProductDao{

	
	static List<Product> prodList = new ArrayList();

	public String addProduct(Product p) {
		prodList.add(p);
		return "product added";
	}

	public List<Product> getAllProduct() {
		
		return prodList;
	}
 

}

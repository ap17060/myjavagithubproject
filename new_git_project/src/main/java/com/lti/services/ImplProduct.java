package com.lti.services;

import java.util.List;

import com.lti.dao.IProductDao;
import com.lti.dao.ImplProductDao;

public class ImplProduct implements IProduct,IProductDao {

	IProductDao dao = new ImplProductDao();


	public List<Product> getAllProduct() {
		 List<Product> prodList =dao.getAllProduct();
			return prodList;
	}

	public String addProduct(Product p) {
		String msg = dao.addProduct(p);
		return msg;
	}

	
	
	
	
}

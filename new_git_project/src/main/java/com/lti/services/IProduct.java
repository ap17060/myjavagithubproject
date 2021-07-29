package com.lti.services;

import java.util.List;

public interface IProduct {

	public abstract String addProduct(Product p);
	public abstract List<Product> getAllProduct();
}

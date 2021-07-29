package com.lti.dao;

import com.demart.entity.Product;
import java.util.List;

public interface IProductDao {

	public abstract String addProduct(Product p);
	public abstract List<Product> getAllProduct();
	}

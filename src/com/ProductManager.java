package com;

import java.util.List;

import com.model.Product;

public interface ProductManager {

	List<Product> getProducts();
	void increasePrice(int perct);
	
}

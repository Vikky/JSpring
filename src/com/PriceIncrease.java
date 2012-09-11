package com;

import java.util.List;

import com.model.Product;

public class PriceIncrease implements ProductManager {

	List<Product> products;
	@Override
	public List<Product> getProducts() {
		return this.products;
	}

	@Override
	public void increasePrice(int perct) {
		
		if(products!=null){
			System.out.println("Incrementing "+perct+ " percentage in price of items");
			for(Product p:products){
				double val=(100+perct)/100.00; 
				int value=(int)(p.getPrice()*val);				
				p.setPrice(value);
			}
		}
	}

	public void setProducts(List<Product> products){
		this.products=products;
	}
	
	
}

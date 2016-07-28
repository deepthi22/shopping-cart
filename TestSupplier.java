package com.niit.ShoppingCart;

import java.util.List;
import java.util.ArrayList;
public class TestSupplier {
	
	public static void main (String[] args) {
		Product p1 = new Product (101, "iphone",70000);
		Product p2 = new Product (102,"tv",50000);
		Supplier s1 = new Supplier("SUP001","Relaince","chennai",p1,null);
		
		List<Product> productList = new ArrayList <Product>(); 
		
		productList.add(p1);
		productList.add(p2);
		
		s1.setProducts(productList);
		
		
		System.out.println( " the details...");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		System.out.println("products supplied");
	
		{
	
		
			System.out.println(p1.getId());
			System.out.println(p1.getName());
			System.out.println(p1.getPrice());
			
			System.out.println(p2.getId());
			System.out.println(p2.getName());
			System.out.println(p2.getPrice());
		}
			
		
			
			
	}
	
	

}

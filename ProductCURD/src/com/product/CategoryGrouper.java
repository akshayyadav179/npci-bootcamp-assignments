package com.product;

import java.sql.SQLException;

public class CategoryGrouper {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
//		Category category = new Category(1201,"food");
		
		//System.out.println(category);
		

		
//		Product product = new Product(1302,"pasta","ready in 2 mins",12.0f,"https://www.indoasiancommodities.com/wp-content/uploads/2016/09/MAGGI.png",30,"2022/07/20","2022/07/21",1201);
		//System.out.println(product);
		
		ProductCategoryDataBase prodcatbase = new ProductCategoryDataBase();
//		prodcatbase.createConnection();
//		prodcatbase.getCategoryProductdetails();
//		
//		System.out.println(prodcatbase.insertCategory(category));
//		System.out.println(prodcatbase.insertCategory(new Category(12010,"Electronics")));
//		System.out.println(prodcatbase.insertProduct(product));
//		System.out.println(prodcatbase.insertProduct(new Product(13010,"phone","ready in 2 mins",12.0f,"https://www.indoasiancommodities.com/wp-content/uploads/2016/09/MAGGI.png",30,"2022/07/20","2022/07/21",12010)));
//
		prodcatbase.getCategoryProductdetails();
		prodcatbase.getCategoryDetailsWithFood();

	}

}

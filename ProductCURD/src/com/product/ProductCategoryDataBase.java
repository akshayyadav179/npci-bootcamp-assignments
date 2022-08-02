package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductCategoryDataBase {
	
	public ProductCategoryDataBase() {
		
	}
	
	public Connection /*void*/ createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/productdb";
		String user = "root";
		String password = "1234";
		Connection connect = DriverManager.getConnection(url, user, password);
		//System.out.println("connection successful");
		return connect;
	}
	
	public String insertCategory(Category category) throws ClassNotFoundException, SQLException {
		Connection connect = createConnection();
		PreparedStatement p = connect.prepareStatement("insert into category values(?,?)");
		p.setLong(1, category.getCategoryId());
		p.setString(2,category.getCateoryName());
		p.executeUpdate();
		
		p.close();
		connect.close();
		
		return " "+ category.getCategoryId()+" "+category.getCateoryName()+" "+"categroy created";
	}
	
	public String insertProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection connect = createConnection();
		PreparedStatement p = connect.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?)");
		p.setLong(1, product.getProductID());
		p.setString(2,product.getProductName());
		p.setString(3,product.getDescription());
		p.setFloat(4, product.getUnitPrice());
		p.setString(5, product.getImageUrl());
		p.setInt(6, product.getUnitsInStock());
		p.setString(7, product.getDateCreated());
		p.setString(8, product.getLastUpdated());
		p.setLong(9, product.getCategoryId());
		p.executeUpdate();
		
		p.close();
		connect.close();
		
		return " "+ product.getProductID()+" "+product.getProductName()+" "+"product created";
	}
	
	public void getCategoryDetailsWithFood() throws ClassNotFoundException, SQLException {
		Connection connect = createConnection();
		Statement stmt = connect.createStatement();
		ResultSet rst = stmt.executeQuery("select product_name from product where category_id in(select category_id from category where category_name = \"Electronics\")");
		while (rst.next()) {
			System.out.println(rst.getString(1));
		}
			rst.close();
			stmt.close();
			connect.close();
	}
	
	public void getCategoryProductdetails() throws ClassNotFoundException, SQLException {
		Connection connect = createConnection();
		Statement stmt = connect.createStatement();
		ResultSet rst = stmt.executeQuery("select product_id,product_name,product.category_id,category_name from product,category where product.category_id = category.category_id");
		
		while (rst.next()) {
			System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getInt(3)+"\t"+rst.getString(4));
		}
			rst.close();
			stmt.close();
			connect.close();
		}
}	

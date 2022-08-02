/*
Assignment 27.03
Recall the Product retrieval system that you developed earlier. 
Recall that there were Products which fell under certain Categories. 
Develop a set of tables that can be used to store the data that this system handles 
and use JDBC to read and write data into this system.
I will help you out with the design of the tables.
Product:
product_id (PK), product_name, description,  unit_price, image_url, 
units_in_stock, date_created, last_updated, category_id (FK)
Category:
catgeory_id (PK), category_name
Remember the CategoryGrouper? Can you write an SQL query 
for retrieving all products belonging to a certain category? 
Can you accomplish this within your Java system?
*/

package com.product;

public class Product {
	private long productID;
	private String productName;
	private String description;
	private float unitPrice;
	private String imageUrl;
	private int unitsInStock;
	private String dateCreated;
	private String lastUpdated;
	private long categoryId;
	
	public Product() {
		
	}
	
	public Product(long productID, String productName, String description, float unitPrice, String imageUrl,
			int unitsInStock, String dateCreated, String lastUpdated, long categoryId) {
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryId = categoryId;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}


	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", description=" + description
				+ ", unitPrice=" + unitPrice + ", imageUrl=" + imageUrl + ", unitsInStock=" + unitsInStock
				+ ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + ", categoryId=" + categoryId + "]";
	}
	
}

package com.product;

/*Category:
catgeory_id (PK), category_name
Remember the CategoryGrouper? Can you write an SQL query 
for retrieving all products belonging to a certain category? 
Can you accomplish this within your Java system?*/

public class Category {
	private long categoryId;
	private String cateoryName;
	
	public Category() {
		
	}

	public Category(long categoryId, String cateoryName) {
		this.categoryId = categoryId;
		this.cateoryName = cateoryName;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCateoryName() {
		return cateoryName;
	}

	public void setCateoryName(String cateoryName) {
		this.cateoryName = cateoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", cateoryName=" + cateoryName + "]";
	}
	
	
}

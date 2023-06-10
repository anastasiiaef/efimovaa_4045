package com.efimova_Assignment0.dto;

public class GroceryDTO {
	
	private int groceryId;
	private String name;
	private String category;
	private String description;
	
	public int getGroceryId() {
		return groceryId;
	}
	
	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public String toString() {
		return groceryId + " " + name+ " " + category+ " " + description;
	}
}

package com.efimova_Assignment0.service;

import org.springframework.stereotype.Component;

import com.efimova_Assignment0.dto.GroceryDTO;

@Component
public class GroceryServiceStub implements IGroceryService {
	
	@Override
	public GroceryDTO fetchById(int id) {
		GroceryDTO groceryDTO = new GroceryDTO();
		groceryDTO.setGroceryId(9);
		groceryDTO.setName("Apple");
		groceryDTO.setCategory("Fruits");
		groceryDTO.setDescription("Red");
		
		return groceryDTO;
	}

	@Override
	public void save (GroceryDTO groceryDTO) {
		
	}
}

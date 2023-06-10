package com.efimova_Assignment0.service;

import com.efimova_Assignment0.dto.GroceryDTO;
/**
 * CRUD operations for grocery
 * @author Administrator
 *
 */

public interface IGroceryService {
	
/**
 * Get grocery from persistence layer
 * @param id a unique lookup
 * @return a grocery with a matching ID
 */
	GroceryDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param groceryDTO
	 */
	void save(GroceryDTO groceryDTO);

}
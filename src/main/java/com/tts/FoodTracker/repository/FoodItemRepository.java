package com.tts.FoodTracker.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.FoodTracker.model.FoodItem;

@Repository
public interface FoodItemRepository extends CrudRepository<FoodItem, Long> {
	
	public ArrayList<FoodItem> findAll();

	public FoodItem findFoodItemById(Long id);
	
}

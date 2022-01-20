package com.tts.FoodTracker.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.FoodTracker.model.FoodItem;
import com.tts.FoodTracker.repository.FoodItemRepository;

@Service
public class FoodItemServiceImpl implements FoodItemServiceInt {
	
	@Autowired
	FoodItemRepository FoodItemRepository;
	
	@Override
	public ArrayList<FoodItem> getAllItem() {
		return FoodItemRepository.findAll();
	}

	@Override
	public FoodItem getFoodItemUsingId(Long id) {
		return FoodItemRepository.findFoodItemById(id);
	}
	
	@Override
	public void saveFoodItem(FoodItem FoodItem) {
		FoodItemRepository.save(FoodItem);
	}
	
	@Override
	public void deleteFoodItem(Long id) {
		FoodItemRepository.deleteById(id);
	}
	
	@Override
	public void updateFoodItem(FoodItem FoodItemChanges, Long id) {
		FoodItem currentFoodItem = FoodItemRepository.findFoodItemById(id);
		currentFoodItem.setName(FoodItemChanges.getName());
		currentFoodItem.setGramsOfProtein(FoodItemChanges.getGramsOfProtein());
		currentFoodItem.setTime(FoodItemChanges.getTime());
		FoodItemRepository.save(currentFoodItem);
	}
	
	

	
	
}

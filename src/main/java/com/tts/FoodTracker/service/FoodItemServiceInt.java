package com.tts.FoodTracker.service;

import java.util.ArrayList;

import com.tts.FoodTracker.model.FoodItem;

public interface FoodItemServiceInt {

	public ArrayList<FoodItem> getAllItem();

	public FoodItem getFoodItemUsingId(Long id);

	public void saveFoodItem(FoodItem FoodItem);

	public void deleteFoodItem(Long id);

	public void updateFoodItem(FoodItem FoodItemChanges, Long id);

}

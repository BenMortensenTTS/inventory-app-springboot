package com.tts.FoodTracker.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.FoodTracker.model.FoodItem;
import com.tts.FoodTracker.service.FoodItemServiceImpl;

@RestController
public class FoodItemController {
	
	@Autowired
	FoodItemServiceImpl FoodItemServiceImpl;
	
	@GetMapping("/")
	public String mainPage() {
		return "Stock Item Project";
	}

	@CrossOrigin
	@GetMapping("/fooditems")
	public ArrayList<FoodItem> showAllItems() {
		return FoodItemServiceImpl.getAllItem();
	}
	
	@CrossOrigin
	@GetMapping("/fooditem/{id}")
	public FoodItem showFoodItem(@PathVariable Long id) {
		return FoodItemServiceImpl.getFoodItemUsingId(id);
	}
	
	@CrossOrigin
	@PostMapping("/fooditem")
	public void saveFoodItem(@RequestBody FoodItem FoodItem) {
		FoodItemServiceImpl.saveFoodItem(FoodItem);
	}
	
	@CrossOrigin
	@DeleteMapping("/fooditem/{id}")
	public void deleteFoodItem(@PathVariable Long id) {
		FoodItemServiceImpl.deleteFoodItem(id);
	}
	
	@CrossOrigin
	@PutMapping("/fooditem/{id}")
	public void updateFoodItem(@RequestBody FoodItem FoodItem, @PathVariable Long id) {
		FoodItemServiceImpl.updateFoodItem(FoodItem, id);
	}
}

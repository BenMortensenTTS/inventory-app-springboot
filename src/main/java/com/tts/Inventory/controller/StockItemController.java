package com.tts.Inventory.controller;

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

import com.tts.Inventory.model.StockItem;
import com.tts.Inventory.service.StockItemServiceImpl;

@RestController
public class StockItemController {
	
	@Autowired
	StockItemServiceImpl stockItemServiceImpl;
	
	@GetMapping("/")
	public String mainPage() {
		return "Stock Item Project";
	}

	@CrossOrigin
	@GetMapping("/stockitems")
	public ArrayList<StockItem> showAllItems() {
		return stockItemServiceImpl.getAllItem();
	}
	
	@CrossOrigin
	@GetMapping("/stockitem/{id}")
	public StockItem showStockItem(@PathVariable Long id) {
		return stockItemServiceImpl.getStockItemUsingId(id);
	}
	
	@CrossOrigin
	@PostMapping("/stockitem")
	public void saveStockItem(@RequestBody StockItem stockItem) {
		stockItemServiceImpl.saveStockItem(stockItem);
	}
	
	@CrossOrigin
	@DeleteMapping("/stockitem/{id}")
	public void deleteStockItem(@PathVariable Long id) {
		stockItemServiceImpl.deleteStockItem(id);
	}
	
	@CrossOrigin
	@PutMapping("/stockitem/{id}")
	public void updateStockItem(@RequestBody StockItem stockItem, @PathVariable Long id) {
		stockItemServiceImpl.updateStockItem(stockItem, id);
	}
}

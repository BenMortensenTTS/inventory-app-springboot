package com.tts.Inventory.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Inventory.model.StockItem;
import com.tts.Inventory.repository.StockItemRepository;

@Service
public class StockItemServiceImpl implements StockItemServiceInt {
	
	@Autowired
	StockItemRepository stockItemRepository;
	
	@Override
	public ArrayList<StockItem> getAllItem() {
		return stockItemRepository.findAll();
	}

	@Override
	public StockItem getStockItemUsingId(Long id) {
		return stockItemRepository.findStockItemById(id);
	}
	
	@Override
	public void saveStockItem(StockItem stockItem) {
		stockItemRepository.save(stockItem);
	}
	
	@Override
	public void deleteStockItem(Long id) {
		stockItemRepository.deleteById(id);
	}
	
	@Override
	public void updateStockItem(StockItem stockItemChanges, Long id) {
		StockItem currentStockItem = stockItemRepository.findStockItemById(id);
		currentStockItem.setAlertAt(stockItemChanges.getAlertAt());
		currentStockItem.setAmountInStock(stockItemChanges.getAmountInStock());
		currentStockItem.setEmailAddress(stockItemChanges.getEmailAddress());
		currentStockItem.setItemName(stockItemChanges.getItemName());
		currentStockItem.setRoom(stockItemChanges.getRoom());
		stockItemRepository.save(currentStockItem);
	}

	
	
}

package com.tts.Inventory.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Inventory.model.StockItem;

@Repository
public interface StockItemRepository extends CrudRepository<StockItem, Long> {
	
	public ArrayList<StockItem> findAll();

	public StockItem findStockItemById(Long id);
}

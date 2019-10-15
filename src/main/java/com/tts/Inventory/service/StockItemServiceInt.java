package com.tts.Inventory.service;

import java.util.ArrayList;

import com.tts.Inventory.model.StockItem;

public interface StockItemServiceInt {

	public ArrayList<StockItem> getAllItem();

	public StockItem getStockItemUsingId(Long id);

	public void saveStockItem(StockItem stockItem);

	public void deleteStockItem(Long id);

	public void updateStockItem(StockItem stockItemChanges, Long id);

}

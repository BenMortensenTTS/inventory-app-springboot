package com.tts.Inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private Integer amountInStock;
	private Integer idealStock;
	private Integer alertAt;
	private String itemName;
	private String room;
	
	
	public StockItem() {}


	public StockItem(Integer amountInStock, Integer idealStock, Integer alertAt, String itemName, String room) {
		super();
		this.amountInStock = amountInStock;
		this.idealStock = idealStock;
		this.alertAt = alertAt;
		this.itemName = itemName;
		this.room = room;
	}


	public Integer getAmountInStock() {
		return amountInStock;
	}


	public void setAmountInStock(Integer amountInStock) {
		this.amountInStock = amountInStock;
	}


	public Integer getIdealStock() {
		return idealStock;
	}


	public void setIdealStock(Integer idealStock) {
		this.idealStock = idealStock;
	}


	public Integer getAlertAt() {
		return alertAt;
	}


	public void setAlertAt(Integer alertAt) {
		this.alertAt = alertAt;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "StockItem [amountInStock=" + amountInStock + ", idealStock=" + idealStock + ", alertAt=" + alertAt
				+ ", itemName=" + itemName + ", room=" + room + "]";
	}


}
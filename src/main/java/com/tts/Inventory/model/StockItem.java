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
	private Integer alertAt;
	private String itemName;
	private String emailAddress;
	private String room;
	
	
	public StockItem() {}


	public StockItem(Integer amountInStock, Integer alertAt, String itemName, String emailAddress, String room) {
		super();
		this.amountInStock = amountInStock;
		this.alertAt = alertAt;
		this.itemName = itemName;
		this.emailAddress = emailAddress;
		this.room = room;
	}


	public Integer getAmountInStock() {
		return amountInStock;
	}


	public void setAmountInStock(Integer amountInStock) {
		this.amountInStock = amountInStock;
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


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
		return "StockItem [amountInStock=" + amountInStock + ", alertAt=" + alertAt + ", itemName=" + itemName
				+ ", emailAddress=" + emailAddress + ", room=" + room + "]";
	}
}
	